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
				if len(field.Functions) == 1 {
					alias = field.Name
				}

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

	return d.Select(builder.String()), nil
}
