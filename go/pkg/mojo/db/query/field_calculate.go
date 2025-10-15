package query

import (
	"fmt"
	"gorm.io/gorm"
	"strings"
)

type FieldCalculate struct {
	Name      string   `json:"name,omitempty"`
	Functions []string `json:"functions,omitempty"` // sum, min, max, avg
	Alias     []string `json:"alias,omitempty"`     // alias to sum(field)
}

func ApplyFieldCalculate(d *gorm.DB, calculates []*FieldCalculate, meta Fields) (*gorm.DB, error) {
	builder := &strings.Builder{}
	for i, field := range calculates {
		if i > 0 {
			builder.WriteString(", ")
		}
		for j, fun := range field.Functions {
			if j > 0 {
				builder.WriteString(", ")
			}
			if len(field.Alias) < len(field.Functions) {
				field.Alias = append(field.Alias, "")
			}

			if len(field.Name) == 0 && strings.ToLower(fun) == "count" {
				field.Name = "*"
			}

			if field.Name == "*" {
				if len(field.Alias[j]) == 0 {
					field.Alias[j] = "count"
				}
			} else {
				alias := field.Alias[j]
				if len(alias) == 0 {
					if strings.Contains(field.Name, "DISTINCT") { // like distinct name
						alias = field.Name + "_distinct_" + strings.ToLower(fun)
					} else {
						alias = field.Name + "_" + strings.ToLower(fun)
					}
					
					field.Alias[j] = alias
				}
			}
			builder.WriteString(fmt.Sprintf("%s(%s) as %s", fun, field.Name, field.Alias[j]))
		}
	}

	return d.Select(builder.String()), nil
}
