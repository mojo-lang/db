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

type CalcField struct {
	Name      string   `json:"name,omitempty"`
	Functions []string `json:"functions,omitempty"` // sum, min, max, avg
	Alias     []string `json:"alias,omitempty"`     // alias to sum(field)
	GroupBy   string   `json:"groupBy,omitempty"`
}

type Query struct {
	Fields     []*QueryField    `json:"fields,omitempty"`
	Filter     *lang.Expression `json:"filter,omitempty"`
	Order      *core.Ordering   `json:"order,omitempty"`
	Unique     bool             `json:"unique,omitempty"`
	Uniques    []string         `json:"uniques,omitempty"`
	FieldMask  *core.FieldMask  `json:"fieldMask,omitempty"`
	CalcFields []*CalcField     `json:"calcFields,omitempty"`

	PageSize  int32  `json:"pageSize,omitempty"`
	PageToken string `json:"pageToken,omitempty"`
	Skip      int32  `json:"skip,omitempty"`
	Limit     int    `json:"limit,omitempty"`
}

type FieldType int

const (
	FieldTypeBool     FieldType = iota + 1
	FieldTypeInteger  FieldType = iota + 1
	FieldTypeFloat    FieldType = iota + 1
	FieldTypeString   FieldType = iota + 1
	FieldTypeBytes    FieldType = iota + 1
	FieldTypeDatetime FieldType = iota + 1
	FieldTypeJSON     FieldType = iota + 1
	FieldTypeGeometry FieldType = iota + 1
)

type FieldInfo struct {
	Type     FieldType
	Repeated bool
}
type FieldsInfo map[string]FieldInfo

func (f FieldsInfo) FieldRepeated(field string) bool {
	if f != nil {
		if info, ok := f[field]; ok {
			return info.Repeated
		}
	}
	return false
}

func (f FieldsInfo) FieldType(field string) FieldType {
	if f != nil {
		if info, ok := f[field]; ok {
			return info.Type
		}
	}
	return FieldType(0)
}

func (q *Query) preprocess() {
	if q != nil {
		if q.Unique && q.FieldMask != nil && len(q.Uniques) == 0 {
			//TODO make sure the path be a simple field name
			for _, p := range q.FieldMask.Paths {
				q.Uniques = append(q.Uniques, p)
			}
		}
	}
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

func (q *Query) ApplyStat(d *gorm.DB, fieldsInfo FieldsInfo) *gorm.DB {
	q.preprocess()

	if q != nil {
		var err error
		tx := d

		builder := &strings.Builder{}
		for i, field := range q.CalcFields {
			if i > 0 {
				builder.WriteString(", ")
			}
			for j, fun := range field.Functions {
				if j > 0 {
					builder.WriteString(", ")
				}
				if len(field.Name) == 0 && strings.ToLower(fun) == "count" {
					field.Name = "*"
				}

				if field.Name == "*" {
					if len(field.Functions) == len(field.Alias) && len(field.Alias[j]) > 0 {
						builder.WriteString(fmt.Sprintf("%s(%s) as %s", fun, field.Name, field.Alias[j]))
					} else {
						builder.WriteString(fmt.Sprintf("%s(%s)", fun, field.Name))
					}
				} else {
					alias := field.Name + "_" + strings.ToLower(fun)
					if len(field.Functions) == len(field.Alias) && len(field.Alias[j]) > 0 {
						alias = field.Alias[j]
					} else if strings.Contains(field.Name, "DISTINCT") { // like distinct name
						alias = ""
					}
					if len(alias) > 0 {
						builder.WriteString(fmt.Sprintf("%s(%s) as %s", fun, field.Name, alias))
					} else {
						builder.WriteString(fmt.Sprintf("%s(%s)", fun, field.Name))
					}
				}
			}
		}
		tx = tx.Select(builder.String())

		if len(q.Fields) > 0 {
			for _, field := range q.Fields {
				if tx, err = ApplyField(tx, field); err != nil {
					_ = d.AddError(err)
					return d
				}
			}
		}
		if q.Filter != nil {
			if tx, err = ApplyFilter(tx, q.Filter, fieldsInfo); err != nil {
				_ = d.AddError(err)
				return d
			}
		}

		//TODO should be move to sub query
		if len(q.Uniques) > 0 {
			if len(q.CalcFields) == 1 && len(q.CalcFields[0].Functions) == 1 && strings.ToLower(q.CalcFields[0].Functions[0]) == "count" {
			} else {
				tx = tx.Distinct(q.Uniques)
			}
		}
		if q.Order != nil {
			if tx, err = ApplyOrder(tx, q.Order); err != nil {
				_ = d.AddError(err)
				return d
			}
		}

		if q.Skip > 0 {
			tx = tx.Offset(int(q.Skip))
		} else if q.Limit > 0 {
			tx = tx.Limit(q.Limit)
		}

		return tx
	}
	return d
}

func (q *Query) ApplyTotalCount(d *gorm.DB, fieldsInfo FieldsInfo) *gorm.DB {
	q.preprocess()

	if q != nil {
		if len(q.Uniques) > 0 {
			q.CalcFields = []*CalcField{{Name: "DISTINCT (" + strings.Join(q.Uniques, ",") + ")", Functions: []string{"COUNT"}}}
		} else {
			q.CalcFields = []*CalcField{{Name: "*", Functions: []string{"COUNT"}}}
		}

		return q.ApplyStat(d, fieldsInfo)
	}
	return d
}

func (q *Query) Apply(d *gorm.DB, fieldsInfo FieldsInfo) *gorm.DB {
	q.preprocess()

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
			if tx, err = ApplyFilter(tx, q.Filter, fieldsInfo); err != nil {
				_ = d.AddError(err)
				return d
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

func ApplyFilter(d *gorm.DB, filter *lang.Expression, fieldsInfo FieldsInfo) (*gorm.DB, error) {
	query, bindings, err := GenerateExpressionQuery(d, filter, fieldsInfo)
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

func GenerateExpressionQuery(d *gorm.DB, filter *lang.Expression, fieldsInfo FieldsInfo) (string, []interface{}, error) {
	switch filter.Expression.(type) {
	case *lang.Expression_ParenthesizedExpr:
		expr := filter.GetParenthesizedExpr()
		q, bs, err := GenerateExpressionQuery(d, expr.Expression, fieldsInfo)
		if err != nil {
			return "", nil, err
		}
		return "( " + q + " )", bs, nil
	case *lang.Expression_PrefixUnaryExpr:
	case *lang.Expression_BinaryExpr:
		binary := filter.GetBinaryExpr()
		if op := binary.GetOperator(); op != nil {
			if d != nil && fieldsInfo != nil {
				switch op.Symbol {
				case "==", "!=":
					l := binary.LeftArgument.GetIdentifierExpr()
					r := binary.RightArgument.GetStringLiteralExpr()
					if l != nil && r != nil && fieldsInfo.FieldRepeated(l.GetName()) {
						switch d.Dialector.Name() {
						case PostgresDriverName:
							if op.Symbol == "==" {
								return "'" + r.Value + "' = " + "ANY(" + l.GetName() + ")", nil, nil
							} else {
								return "NOT ('" + r.Value + "' = " + "ANY(coalesce(" + l.GetName() + ", array[]::text[])))", nil, nil
							}
						}
					}
				case "in", "!in":
					r := binary.RightArgument.GetIdentifierExpr()
					if r != nil && fieldsInfo.FieldRepeated(r.GetName()) {
						operator := "="
						if op.Symbol == "!in" {
							operator = "!="
						}
						if l := binary.LeftArgument.GetStringLiteralExpr(); l != nil {
							switch d.Dialector.Name() {
							case PostgresDriverName:
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
								case PostgresDriverName:
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
				lq, lbs, err := GenerateExpressionQuery(d, binary.LeftArgument, fieldsInfo)
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
				rq, rbs, err := GenerateExpressionQuery(d, binary.RightArgument, fieldsInfo)
				if err != nil {
					return "", nil, err
				}
				return lq + " " + toSQLOperator(d, op.Symbol, fieldsInfo) + " " + rq, append(lbs, rbs...), nil
			case "in", "!in":
				lq, lbs, err := GenerateExpressionQuery(d, binary.LeftArgument, fieldsInfo)
				if err != nil {
					return "", nil, err
				}
				if b := binary.RightArgument.GetBinaryExpr(); b != nil && b.GetOperator().GetSymbol() == "..=" {
					blq, blbs, err := GenerateExpressionQuery(d, b.LeftArgument, fieldsInfo)
					if err != nil {
						return "", nil, err
					}
					brq, brbs, err := GenerateExpressionQuery(d, b.RightArgument, fieldsInfo)
					if err != nil {
						return "", nil, err
					}

					return lq + " BETWEEN " + blq + " AND " + brq, append(lbs, append(blbs, brbs...)...), nil
				} else if a := binary.RightArgument.GetArrayLiteralExpr(); a != nil {
					rq, rbs, err := GenerateExpressionQuery(d, binary.RightArgument, fieldsInfo)
					if err != nil {
						return "", nil, err
					}
					return lq + " " + toSQLOperator(d, op.Symbol, fieldsInfo) + " " + rq, append(lbs, rbs...), nil
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
			s, sp, err := GenerateExpressionQuery(d, item, fieldsInfo)
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

func toSQLOperator(d *gorm.DB, symbol string, fieldsInfo FieldsInfo) string {
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
