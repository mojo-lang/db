package db

import (
	"errors"
	"fmt"
	"gorm.io/gorm"
	"strconv"
	"strings"

	"github.com/mojo-lang/core/go/pkg/mojo/core"
	"github.com/mojo-lang/lang/go/pkg/mojo/lang"
)

type QueryField struct {
	Name     string        `json:"name,omitempty"`
	Keywords []interface{} `json:"keywords,omitempty"`
}

type Query struct {
	Fields    []*QueryField    `json:"fields,omitempty"`
	Filter    *lang.Expression `json:"filter,omitempty"`
	Order     *core.Ordering   `json:"order,omitempty"`
	Unique    bool             `json:"unique,omitempty"`
	Uniques   []string         `json:"uniques,omitempty"`
	FieldMask *core.FieldMask  `json:"fieldMask,omitempty"`

	PageSize  int32  `json:"pageSize,omitempty"`
	PageToken string `json:"pageToken,omitempty"`
	Skip      int32  `json:"skip,omitempty"`
	Limit     int    `json:"limit,omitempty"`
}

func (q *Query) AddField(name string, values ...interface{}) *Query {
	if q != nil {
		for _, field := range q.Fields {
			if field.Name == name {
				field.Keywords = append(field.Keywords, values...)
				return q
			}
		}
		q.Fields = append(q.Fields, &QueryField{
			Name:     name,
			Keywords: values,
		})
	}
	return q
}

func (q *Query) ApplyTotalCount(d *gorm.DB) *gorm.DB {
	if q != nil {
		var err error
		tx := d

		tx = tx.Select("COUNT(*)")

		if len(q.Fields) > 0 {
			for _, field := range q.Fields {
				if tx, err = ApplyField(tx, field); err != nil {
					_ = d.AddError(err)
					return d
				}
			}
		}
		if q.Filter != nil {
			if tx, err = ApplyFilter(tx, q.Filter); err != nil {
				_ = d.AddError(err)
				return d
			}
		}
		if q.Unique && q.FieldMask != nil && len(q.Uniques) == 0 {
			//TODO make sure the path be a simple field name
			for _, p := range q.FieldMask.Paths {
				q.Uniques = append(q.Uniques, p)
			}
		}

		if len(q.Uniques) > 0 {
			tx = d.Distinct(q.Uniques)
		}
		if q.Order != nil {
			if tx, err = ApplyOrder(tx, q.Order); err != nil {
				_ = d.AddError(err)
				return d
			}
		}

		if q.Skip > 0 {
			tx = d.Offset(int(q.Skip))
		} else if q.Limit > 0 {
			tx = d.Limit(q.Limit)
		}

		return tx
	}
	return d
}

func (q *Query) Apply(d *gorm.DB) *gorm.DB {
	if q != nil {
		var err error
		tx := d
		if len(q.Fields) > 0 {
			for _, field := range q.Fields {
				if tx, err = ApplyField(tx, field); err != nil {
					_ = d.AddError(err)
					return d
				}
			}
		}
		if q.Filter != nil {
			if tx, err = ApplyFilter(tx, q.Filter); err != nil {
				_ = d.AddError(err)
				return d
			}
		}
		if q.Unique && q.FieldMask != nil && len(q.Uniques) == 0 {
			//TODO make sure the path be a simple field name
			for _, p := range q.FieldMask.Paths {
				q.Uniques = append(q.Uniques, p)
			}
		}

		if len(q.Uniques) > 0 {
			tx = d.Distinct(q.Uniques)
		}
		if q.Order != nil {
			if tx, err = ApplyOrder(tx, q.Order); err != nil {
				_ = d.AddError(err)
				return d
			}
		}
		if q.FieldMask != nil {
			if tx, err = ApplyFieldMask(tx, q.FieldMask); err != nil {
				_ = d.AddError(err)
				return d
			}
		}

		if q.PageSize > 0 {
			if tx, err = ApplyPagination(d, q.PageSize, q.PageToken, q.Skip); err != nil {
				_ = d.AddError(err)
				return d
			}
		} else if q.Skip > 0 {
			tx = d.Offset(int(q.Skip))
		} else if q.Limit > 0 {
			tx = d.Limit(q.Limit)
		}

		return tx
	}
	return d
}

func ApplyField(d *gorm.DB, field *QueryField) (*gorm.DB, error) {
	if len(field.Name) > 0 && len(field.Keywords) > 0 {
		if len(field.Keywords) == 1 {
			// LIKE
			if keyword, ok := field.Keywords[0].(string); ok && (strings.HasPrefix(keyword, "%") || strings.HasSuffix(keyword, "%")) {
				d.Where(fmt.Sprintf("%s LIKE ?", field.Name), keyword)
			} else {
				d.Where(fmt.Sprintf("%s = ?", field.Name), field.Keywords[0])
			}
		} else {
			// IN
			var builder strings.Builder
			builder.WriteString(field.Name)
			builder.WriteString(" IN (?")
			for i := 1; i < len(field.Keywords); i++ {
				builder.WriteString(",?")
			}
			builder.WriteString(")")
			d.Where(builder.String(), field.Keywords...)
		}
	}

	return d, nil
}

func ApplyFilter(d *gorm.DB, filter *lang.Expression) (*gorm.DB, error) {
	query, bindings, err := GenerateExpressionQuery(filter)
	if err != nil {
		return nil, err
	}
	if len(query) > 0 {
		tx := d.Where(query, bindings...)
		return tx, nil
	}
	return d, nil
}

func ApplyOrder(d *gorm.DB, order *core.Ordering) (*gorm.DB, error) {
	if d != nil && order != nil && len(order.Orders) > 0 {
		return d.Order(order.Format()), nil
	}
	return d, nil
}

func ApplyFieldMask(d *gorm.DB, fieldMask *core.FieldMask) (*gorm.DB, error) {
	if d != nil && fieldMask != nil && len(fieldMask.Paths) > 0 {
		return d.Select(fieldMask.Paths), nil
	}
	return d, nil
}

func ApplyPagination(d *gorm.DB, pageSize int32, pageToken string, skip int32) (*gorm.DB, error) {
	if d != nil && pageSize > 0 {
		var index int64 = 0
		var err error
		if len(pageToken) > 0 {
			index, err = strconv.ParseInt(pageToken, 10, 64)
			if err != nil {
				return nil, err
			}
		}

		offset := pageSize*int32(index) + skip
		return d.Offset(int(offset)).Limit(int(pageSize)), nil
	}
	return d, nil
}

func GenerateExpressionQuery(filter *lang.Expression) (string, []interface{}, error) {
	switch filter.Expression.(type) {
	case *lang.Expression_ParenthesizedExpr:
		expr := filter.GetParenthesizedExpr()
		q, bs, err := GenerateExpressionQuery(expr.Expression)
		if err != nil {
			return "", nil, err
		}
		return "( " + q + " )", bs, nil
	case *lang.Expression_PrefixUnaryExpr:
	case *lang.Expression_BinaryExpr:
		binary := filter.GetBinaryExpr()
		if op := binary.GetOperator(); op != nil {
			switch op.Symbol {
			case "and", "or", "==", "!=", ">", "<", ">=", "<=", "~=":
				lq, lbs, err := GenerateExpressionQuery(binary.LeftArgument)
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
				rq, rbs, err := GenerateExpressionQuery(binary.RightArgument)
				if err != nil {
					return "", nil, err
				}
				return lq + " " + toSQLOperator(op.Symbol) + " " + rq, append(lbs, rbs...), nil
			case "in", "!in":
				lq, lbs, err := GenerateExpressionQuery(binary.LeftArgument)
				if err != nil {
					return "", nil, err
				}
				if b := binary.RightArgument.GetBinaryExpr(); b != nil && b.GetOperator().GetSymbol() == "..=" {
					blq, blbs, err := GenerateExpressionQuery(b.LeftArgument)
					if err != nil {
						return "", nil, err
					}
					brq, brbs, err := GenerateExpressionQuery(b.RightArgument)
					if err != nil {
						return "", nil, err
					}

					return lq + " BETWEEN " + blq + " AND " + brq, append(lbs, append(blbs, brbs...)...), nil
				} else if a := binary.RightArgument.GetArrayLiteralExpr(); a != nil {
					rq, rbs, err := GenerateExpressionQuery(binary.RightArgument)
					if err != nil {
						return "", nil, err
					}
					return lq + " " + toSQLOperator(op.Symbol) + " " + rq, append(lbs, rbs...), nil
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
			s, sp, err := GenerateExpressionQuery(item)
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

func toSQLOperator(symbol string) string {
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
