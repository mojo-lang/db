package query

import (
	"errors"
	"fmt"
	"strconv"
	"strings"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"github.com/mojo-lang/db/go/pkg/mojo/db"
	"github.com/mojo-lang/lang/go/pkg/mojo/lang"
	"gorm.io/gorm"
)

func ApplyFilter(d *gorm.DB, filter *lang.Expression, fields Fields) (*gorm.DB, error) {
	query, bindings, err := GenerateExpressionQuery(d, filter, fields)
	if err != nil {
		return nil, err
	}
	if len(query) > 0 {
		tx := d.Where(query, bindings...)
		return tx, nil
	}
	return d, nil
}

func GenerateExpressionQuery(d *gorm.DB, filter *lang.Expression, fields Fields) (string, []interface{}, error) {
	switch filter.Expression.(type) {
	case *lang.Expression_ParenthesizedExpr:
		expr := filter.GetParenthesizedExpr()
		q, bs, err := GenerateExpressionQuery(d, expr.Expression, fields)
		if err != nil {
			return "", nil, err
		}
		return "( " + q + " )", bs, nil
	case *lang.Expression_PrefixUnaryExpr:
	case *lang.Expression_BinaryExpr:
		binary := filter.GetBinaryExpr()
		if op := binary.GetOperator(); op != nil {
			if d != nil && fields != nil {
				switch op.Symbol {
				case "==", "!=":
					l := binary.LeftArgument.GetIdentifierExpr()
					r := binary.RightArgument.GetStringLiteralExpr()
					if l != nil && r != nil && fields.Repeated(l.GetName()) {
						switch d.Dialector.Name() {
						case db.PostgresDriverName:
							if op.Symbol == "==" {
								return "'" + r.Value + "' = " + "ANY(" + l.GetName() + ")", nil, nil
							} else {
								return "NOT ('" + r.Value + "' = " + "ANY(coalesce(" + l.GetName() + ", array[]::text[])))", nil, nil
							}
						}
					}
				case "in", "!in":
					r := binary.RightArgument.GetIdentifierExpr()
					if r != nil && fields.Repeated(r.GetName()) {
						operator := "="
						if op.Symbol == "!in" {
							operator = "!="
						}
						if l := binary.LeftArgument.GetStringLiteralExpr(); l != nil {
							switch d.Dialector.Name() {
							case db.PostgresDriverName:
								return "'" + l.Value + "'" + operator + "ANY(" + r.GetName() + ")", nil, nil
							}
						}
						if l := binary.RightArgument.GetArrayLiteralExpr(); l != nil {
							var strs []string
							for _, element := range l.Elements {
								if s := element.GetStringLiteralExpr(); s != nil {
									strs = append(strs, core.QuoteString(s.Value))
								}
							}
							if len(strs) > 0 {
								switch d.Dialector.Name() {
								case db.PostgresDriverName:
									if op.Symbol == "in" {
										return r.GetName() + " @>" + "'{" + strings.Join(strs, ",") + "}'", nil, nil
									} else {
										return "NOT (" + r.GetName() + " @>" + "'{" + strings.Join(strs, ",") + "}')", nil, nil
									}
								}
							} else {
								// TODO
							}
						}
					}
				}
			}

			switch op.Symbol {
			case "and", "or", "==", "!=", ">", "<", ">=", "<=", "~=":
				lq, lbs, err := GenerateExpressionQuery(d, binary.LeftArgument, fields)
				if err != nil {
					return "", nil, err
				}

				switch op.Symbol {
				case "==":
					if expr := binary.RightArgument.GetNullLiteralExpr(); expr != nil {
						return lq + " IS NULL", lbs, nil
					}
				case "!=":
					if expr := binary.RightArgument.GetNullLiteralExpr(); expr != nil {
						return lq + " IS NOT NULL", lbs, nil
					}
				case "~=":
					if expr := binary.RightArgument.GetStringLiteralExpr(); expr != nil {
						return lq + " LIKE '%" + expr.Value + "%'", lbs, nil
					}
				}
				rq, rbs, err := GenerateExpressionQuery(d, binary.RightArgument, fields)
				if err != nil {
					return "", nil, err
				}
				return lq + " " + toSQLOperator(d, op.Symbol, fields) + " " + rq, append(lbs, rbs...), nil
			case "in", "!in":
				lq, lbs, err := GenerateExpressionQuery(d, binary.LeftArgument, fields)
				if err != nil {
					return "", nil, err
				}
				if b := binary.RightArgument.GetBinaryExpr(); b != nil && b.GetOperator().GetSymbol() == "..=" {
					blq, blbs, err := GenerateExpressionQuery(d, b.LeftArgument, fields)
					if err != nil {
						return "", nil, err
					}
					brq, brbs, err := GenerateExpressionQuery(d, b.RightArgument, fields)
					if err != nil {
						return "", nil, err
					}

					return lq + " BETWEEN " + blq + " AND " + brq, append(lbs, append(blbs, brbs...)...), nil
				} else if a := binary.RightArgument.GetArrayLiteralExpr(); a != nil {
					rq, rbs, err := GenerateExpressionQuery(d, binary.RightArgument, fields)
					if err != nil {
						return "", nil, err
					}
					return lq + " " + toSQLOperator(d, op.Symbol, fields) + " " + rq, append(lbs, rbs...), nil
				} else if s := binary.RightArgument.GetStringLiteralExpr(); isGeometry(s.Value) {
					return "ST_Within(" + lq + ", '" + s.Value + "')", lbs, nil
				} else {
					return "", nil, errors.New(fmt.Sprintf("not supported right argument (%s) in IN operator in SQL", b.RightArgument.String()))
				}
			default:
				return "", nil, errors.New(fmt.Sprintf("not supported operator %s in SQL", op.Symbol))
			}
		}
	case *lang.Expression_IdentifierExpr:
		expr := filter.GetIdentifierExpr()
		return expr.GetName(), nil, nil
	case *lang.Expression_BoolLiteralExpr:
		expr := filter.GetBoolLiteralExpr()
		return strconv.FormatBool(expr.Value), nil, nil
	case *lang.Expression_IntegerLiteralExpr:
		expr := filter.GetIntegerLiteralExpr()
		return strconv.FormatInt(int64(expr.Value), 10), nil, nil
	case *lang.Expression_FloatLiteralExpr:
		expr := filter.GetFloatLiteralExpr()
		return fmt.Sprint(expr.Value), nil, nil
	case *lang.Expression_StringLiteralExpr:
		expr := filter.GetStringLiteralExpr()
		return "'" + expr.Value + "'", nil, nil
	case *lang.Expression_ArrayLiteralExpr:
		arr := filter.GetArrayLiteralExpr()
		if len(arr.Elements) == 0 {
			return "", nil, errors.New("array literal should not be empty")
		}

		var statement string
		var parameters []interface{}
		for i, item := range arr.Elements {
			s, sp, err := GenerateExpressionQuery(d, item, fields)
			if err != nil {
				return "", nil, err
			}

			if i > 0 {
				statement = statement + ", " + s
			} else {
				statement = statement + s
			}
			parameters = append(parameters, sp...)
		}
		return "(" + statement + ")", parameters, nil
	}
	return "", nil, nil
}

func isGeometry(str string) bool {
	str = strings.ToUpper(str)
	return strings.Contains(str, "POINT") ||
		strings.Contains(str, "POLYGON") ||
		strings.Contains(str, "LINESTRING") ||
		strings.Contains(str, "MULTILINESTRING") ||
		strings.Contains(str, "MULTIPOLYGON")
}

func toSQLOperator(d *gorm.DB, symbol string, fieldsInfo Fields) string {
	switch symbol {
	case "and":
		return "AND"
	case "or":
		return "OR"
	case "==":
		return "="
	case "~=":
		return "LIKE"
	case "in":
		return "IN"
	case "!in":
		return "NOT IN"
	default:
		return symbol
	}
}
