package sql

import "github.com/mojo-lang/lang/go/pkg/mojo/lang"

func NewNullLiteralExpression(expr *lang.NullLiteralExpr) *Expression {
	return &Expression{
		Expression: &Expression_NullLiteralExpr{NullLiteralExpr: expr},
	}
}

func NewNullLiteralExpressionFrom() *Expression {
	return NewNullLiteralExpression(lang.NewNullLiteralExpr())
}

func NewBoolLiteralExpression(expr *lang.BoolLiteralExpr) *Expression {
	return &Expression{
		Expression: &Expression_BoolLiteralExpr{BoolLiteralExpr: expr},
	}
}

func NewBoolLiteralExpressionFrom(value bool) *Expression {
	return NewBoolLiteralExpression(lang.NewBoolLiteralExpr(value))
}

func NewIntegerLiteralExpression(expr *lang.IntegerLiteralExpr) *Expression {
	return &Expression{
		Expression: &Expression_IntegerLiteralExpr{IntegerLiteralExpr: expr},
	}
}

func NewIntegerLiteralExpressionFrom(value int64) *Expression {
	return NewIntegerLiteralExpression(lang.NewIntegerLiteralExpr(value))
}

func NewFloatLiteralExpression(expr *lang.FloatLiteralExpr) *Expression {
	return &Expression{
		Expression: &Expression_FloatLiteralExpr{FloatLiteralExpr: expr},
	}
}

func NewFloatLiteralExpressionFrom(value float64) *Expression {
	return NewFloatLiteralExpression(lang.NewFloatLiteralExpr(value))
}

func NewStringLiteralExpression(expr *lang.StringLiteralExpr) *Expression {
	return &Expression{
		Expression: &Expression_StringLiteralExpr{StringLiteralExpr: expr},
	}
}

func NewStringLiteralExpressionFrom(value string) *Expression {
	return NewStringLiteralExpression(lang.NewStringLiteralExpr(value))
}

func NewIdentifierExpression(expr *IdentifierExpr) *Expression {
	return &Expression{
		Expression: &Expression_IdentifierExpr{IdentifierExpr: expr},
	}
}

func NewIdentifierExpressionFrom(name string) *Expression {
	return &Expression{
		Expression: &Expression_IdentifierExpr{IdentifierExpr: &IdentifierExpr{Identifier: name}},
	}
}
