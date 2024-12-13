package query

import (
	"fmt"
	"gorm.io/gorm"
	"strings"
)

type FieldQuery struct {
	Name     string        `json:"name,omitempty"`
	Keywords []interface{} `json:"keywords,omitempty"`
}

func (q *Query) AddFieldQuery(name string, values ...interface{}) *Query {
	if q != nil {
		for _, field := range q.Fields {
			if field.Name == name {
				field.Keywords = append(field.Keywords, values...)
				return q
			}
		}
		q.Fields = append(q.Fields, &FieldQuery{
			Name:     name,
			Keywords: values,
		})
	}
	return q
}

func ApplyFieldQuery(d *gorm.DB, field *FieldQuery, meta Fields) (*gorm.DB, error) {
	if len(field.Name) > 0 && len(field.Keywords) > 0 {
		//if fields.Repeated(field.Name) {
		//	if len(field.Keywords) == 1 {
		//		switch d.Dialector.Name() {
		//		case db.PostgresDriverName:
		//			d.Where("'" + field.Keywords[0] + "' = " + "ANY(" + field.Name + ")")
		//		}
		//	}
		//}

		if len(field.Keywords) == 1 {
			// LIKE
			if keyword, ok := field.Keywords[0].(string); ok && (strings.HasPrefix(keyword, "%") || strings.HasSuffix(keyword, "%")) {
				return d.Where(fmt.Sprintf("%s LIKE ?", field.Name), keyword), nil
			} else {
				return d.Where(fmt.Sprintf("%s = ?", field.Name), field.Keywords[0]), nil
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
			return d.Where(builder.String(), field.Keywords...), nil
		}
	}

	return d, nil
}
