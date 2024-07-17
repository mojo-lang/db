package db

import (
	"github.com/mojo-lang/lang/go/pkg/mojo/lang"
	"github.com/stretchr/testify/assert"
	"gorm.io/driver/sqlite"
	"gorm.io/gorm"
	"os"
	"path/filepath"
	"testing"
)

type QueryTable struct {
	ID   uint
	Name string
	Age  uint
}

func TestQuery(t *testing.T) {
	d, err := gorm.Open(sqlite.Open(filepath.Join(os.TempDir(), "gorm.db")), &gorm.Config{})
	d = d.Debug()
	if err != nil {
		t.Errorf("failed to connect database")
	}

	_ = d.Migrator().DropTable(&QueryTable{})
	_ = d.AutoMigrate(&QueryTable{})
	d.Save(&QueryTable{Name: "foo", Age: 20}).
		Save(&QueryTable{Name: "bar", Age: 10}).
		Save(&QueryTable{Name: "foo-", Age: 40})

	q := &Query{}
	q.AddField("name", "foo%")

	db := &DB{DB: d, Config: nil}
	var rows []*QueryTable

	if q.Apply(db.Model(&QueryTable{}).DB).Find(&rows).Error != nil || len(rows) != 2 {
		t.Errorf("quey by name, expects: %v, got: %v", 2, len(rows))
	}

	q.Filter = &lang.Expression{
		Expression: &lang.Expression_BinaryExpr{
			BinaryExpr: &lang.BinaryExpr{
				Callee:        &lang.BinaryExpr_Operator{Operator: &lang.Operator{Symbol: ">"}},
				LeftArgument:  &lang.Expression{Expression: &lang.Expression_IdentifierExpr{IdentifierExpr: &lang.IdentifierExpr{Identifier: &lang.Identifier{Name: "age"}}}},
				RightArgument: &lang.Expression{Expression: &lang.Expression_IntegerLiteralExpr{IntegerLiteralExpr: &lang.IntegerLiteralExpr{Value: 20}}},
			},
		},
	}
	if q.Apply(db.Model(&QueryTable{}).DB).Find(&rows).Error != nil || len(rows) != 1 {
		t.Errorf("quey by name, expects: %v, got: %v", 1, len(rows))
	}
}

func TestGenerateFilterQuery1(t *testing.T) {
	filter := &lang.Expression{
		Expression: &lang.Expression_BinaryExpr{
			BinaryExpr: &lang.BinaryExpr{
				Callee:        &lang.BinaryExpr_Operator{Operator: &lang.Operator{Symbol: ">"}},
				LeftArgument:  &lang.Expression{Expression: &lang.Expression_IdentifierExpr{IdentifierExpr: &lang.IdentifierExpr{Identifier: &lang.Identifier{Name: "age"}}}},
				RightArgument: &lang.Expression{Expression: &lang.Expression_IntegerLiteralExpr{IntegerLiteralExpr: &lang.IntegerLiteralExpr{Value: 20}}},
			},
		},
	}

	sql, params, err := generateFilterQuery(filter)
	assert.NoError(t, err)
	assert.NotEmpty(t, sql)
	assert.Equal(t, "age > 20", sql)
	_ = params
}

func TestGenerateFilterQuery2(t *testing.T) {
	filter := &lang.Expression{
		Expression: &lang.Expression_BinaryExpr{
			BinaryExpr: &lang.BinaryExpr{
				Callee:       &lang.BinaryExpr_Operator{Operator: &lang.Operator{Symbol: "in"}},
				LeftArgument: &lang.Expression{Expression: &lang.Expression_IdentifierExpr{IdentifierExpr: &lang.IdentifierExpr{Identifier: &lang.Identifier{Name: "age"}}}},
				RightArgument: &lang.Expression{Expression: &lang.Expression_BinaryExpr{
					BinaryExpr: &lang.BinaryExpr{
						Callee:        &lang.BinaryExpr_Operator{Operator: &lang.Operator{Symbol: "..="}},
						LeftArgument:  &lang.Expression{Expression: &lang.Expression_IntegerLiteralExpr{IntegerLiteralExpr: &lang.IntegerLiteralExpr{Value: 10}}},
						RightArgument: &lang.Expression{Expression: &lang.Expression_IntegerLiteralExpr{IntegerLiteralExpr: &lang.IntegerLiteralExpr{Value: 20}}},
					}},
				},
			},
		},
	}

	sql, params, err := generateFilterQuery(filter)
	assert.NoError(t, err)
	assert.NotEmpty(t, sql)
	assert.Equal(t, "age BETWEEN 10 AND 20", sql)
	_ = params
}
