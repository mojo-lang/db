// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojolang.mojo.db.sql;

public interface ExpressionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.Expression)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.db.sql.NullLiteralExpr null_literal_expr = 1;</code>
   * @return Whether the nullLiteralExpr field is set.
   */
  boolean hasNullLiteralExpr();
  /**
   * <code>.mojo.db.sql.NullLiteralExpr null_literal_expr = 1;</code>
   * @return The nullLiteralExpr.
   */
  org.mojolang.mojo.db.sql.NullLiteralExpr getNullLiteralExpr();
  /**
   * <code>.mojo.db.sql.NullLiteralExpr null_literal_expr = 1;</code>
   */
  org.mojolang.mojo.db.sql.NullLiteralExprOrBuilder getNullLiteralExprOrBuilder();

  /**
   * <code>.mojo.db.sql.BooleanLiteralExpr boolean_literal_expr = 2;</code>
   * @return Whether the booleanLiteralExpr field is set.
   */
  boolean hasBooleanLiteralExpr();
  /**
   * <code>.mojo.db.sql.BooleanLiteralExpr boolean_literal_expr = 2;</code>
   * @return The booleanLiteralExpr.
   */
  org.mojolang.mojo.db.sql.BooleanLiteralExpr getBooleanLiteralExpr();
  /**
   * <code>.mojo.db.sql.BooleanLiteralExpr boolean_literal_expr = 2;</code>
   */
  org.mojolang.mojo.db.sql.BooleanLiteralExprOrBuilder getBooleanLiteralExprOrBuilder();

  /**
   * <code>.mojo.db.sql.IntegerLiteralExpr integer_literal_expr = 3;</code>
   * @return Whether the integerLiteralExpr field is set.
   */
  boolean hasIntegerLiteralExpr();
  /**
   * <code>.mojo.db.sql.IntegerLiteralExpr integer_literal_expr = 3;</code>
   * @return The integerLiteralExpr.
   */
  org.mojolang.mojo.db.sql.IntegerLiteralExpr getIntegerLiteralExpr();
  /**
   * <code>.mojo.db.sql.IntegerLiteralExpr integer_literal_expr = 3;</code>
   */
  org.mojolang.mojo.db.sql.IntegerLiteralExprOrBuilder getIntegerLiteralExprOrBuilder();

  /**
   * <code>.mojo.db.sql.FloatLiteralExpr float_literal_expr = 4;</code>
   * @return Whether the floatLiteralExpr field is set.
   */
  boolean hasFloatLiteralExpr();
  /**
   * <code>.mojo.db.sql.FloatLiteralExpr float_literal_expr = 4;</code>
   * @return The floatLiteralExpr.
   */
  org.mojolang.mojo.db.sql.FloatLiteralExpr getFloatLiteralExpr();
  /**
   * <code>.mojo.db.sql.FloatLiteralExpr float_literal_expr = 4;</code>
   */
  org.mojolang.mojo.db.sql.FloatLiteralExprOrBuilder getFloatLiteralExprOrBuilder();

  /**
   * <code>.mojo.db.sql.StringLiteralExpr string_literal_expr = 5;</code>
   * @return Whether the stringLiteralExpr field is set.
   */
  boolean hasStringLiteralExpr();
  /**
   * <code>.mojo.db.sql.StringLiteralExpr string_literal_expr = 5;</code>
   * @return The stringLiteralExpr.
   */
  org.mojolang.mojo.db.sql.StringLiteralExpr getStringLiteralExpr();
  /**
   * <code>.mojo.db.sql.StringLiteralExpr string_literal_expr = 5;</code>
   */
  org.mojolang.mojo.db.sql.StringLiteralExprOrBuilder getStringLiteralExprOrBuilder();

  /**
   * <code>.mojo.db.sql.BinaryStringLiteralExpr binary_string_literal_expr = 6;</code>
   * @return Whether the binaryStringLiteralExpr field is set.
   */
  boolean hasBinaryStringLiteralExpr();
  /**
   * <code>.mojo.db.sql.BinaryStringLiteralExpr binary_string_literal_expr = 6;</code>
   * @return The binaryStringLiteralExpr.
   */
  org.mojolang.mojo.db.sql.BinaryStringLiteralExpr getBinaryStringLiteralExpr();
  /**
   * <code>.mojo.db.sql.BinaryStringLiteralExpr binary_string_literal_expr = 6;</code>
   */
  org.mojolang.mojo.db.sql.BinaryStringLiteralExprOrBuilder getBinaryStringLiteralExprOrBuilder();

  /**
   * <code>.mojo.db.sql.IdentifierExpr identifier_expr = 7;</code>
   * @return Whether the identifierExpr field is set.
   */
  boolean hasIdentifierExpr();
  /**
   * <code>.mojo.db.sql.IdentifierExpr identifier_expr = 7;</code>
   * @return The identifierExpr.
   */
  org.mojolang.mojo.db.sql.IdentifierExpr getIdentifierExpr();
  /**
   * <code>.mojo.db.sql.IdentifierExpr identifier_expr = 7;</code>
   */
  org.mojolang.mojo.db.sql.IdentifierExprOrBuilder getIdentifierExprOrBuilder();

  /**
   * <code>.mojo.db.sql.BindParameterExpr bind_parameter_expr = 10;</code>
   * @return Whether the bindParameterExpr field is set.
   */
  boolean hasBindParameterExpr();
  /**
   * <code>.mojo.db.sql.BindParameterExpr bind_parameter_expr = 10;</code>
   * @return The bindParameterExpr.
   */
  org.mojolang.mojo.db.sql.BindParameterExpr getBindParameterExpr();
  /**
   * <code>.mojo.db.sql.BindParameterExpr bind_parameter_expr = 10;</code>
   */
  org.mojolang.mojo.db.sql.BindParameterExprOrBuilder getBindParameterExprOrBuilder();

  /**
   * <code>.mojo.db.sql.ColumnReferenceExpr column_reference_expr = 11;</code>
   * @return Whether the columnReferenceExpr field is set.
   */
  boolean hasColumnReferenceExpr();
  /**
   * <code>.mojo.db.sql.ColumnReferenceExpr column_reference_expr = 11;</code>
   * @return The columnReferenceExpr.
   */
  org.mojolang.mojo.db.sql.ColumnReferenceExpr getColumnReferenceExpr();
  /**
   * <code>.mojo.db.sql.ColumnReferenceExpr column_reference_expr = 11;</code>
   */
  org.mojolang.mojo.db.sql.ColumnReferenceExprOrBuilder getColumnReferenceExprOrBuilder();

  /**
   * <code>.mojo.db.sql.UnaryExpr unary_expr = 15;</code>
   * @return Whether the unaryExpr field is set.
   */
  boolean hasUnaryExpr();
  /**
   * <code>.mojo.db.sql.UnaryExpr unary_expr = 15;</code>
   * @return The unaryExpr.
   */
  org.mojolang.mojo.db.sql.UnaryExpr getUnaryExpr();
  /**
   * <code>.mojo.db.sql.UnaryExpr unary_expr = 15;</code>
   */
  org.mojolang.mojo.db.sql.UnaryExprOrBuilder getUnaryExprOrBuilder();

  /**
   * <code>.mojo.db.sql.BinaryExpr binary_expr = 17;</code>
   * @return Whether the binaryExpr field is set.
   */
  boolean hasBinaryExpr();
  /**
   * <code>.mojo.db.sql.BinaryExpr binary_expr = 17;</code>
   * @return The binaryExpr.
   */
  org.mojolang.mojo.db.sql.BinaryExpr getBinaryExpr();
  /**
   * <code>.mojo.db.sql.BinaryExpr binary_expr = 17;</code>
   */
  org.mojolang.mojo.db.sql.BinaryExprOrBuilder getBinaryExprOrBuilder();

  /**
   * <code>.mojo.db.sql.BetweenExpr between_expr = 18;</code>
   * @return Whether the betweenExpr field is set.
   */
  boolean hasBetweenExpr();
  /**
   * <code>.mojo.db.sql.BetweenExpr between_expr = 18;</code>
   * @return The betweenExpr.
   */
  org.mojolang.mojo.db.sql.BetweenExpr getBetweenExpr();
  /**
   * <code>.mojo.db.sql.BetweenExpr between_expr = 18;</code>
   */
  org.mojolang.mojo.db.sql.BetweenExprOrBuilder getBetweenExprOrBuilder();

  /**
   * <code>.mojo.db.sql.InExpr in_expr = 19;</code>
   * @return Whether the inExpr field is set.
   */
  boolean hasInExpr();
  /**
   * <code>.mojo.db.sql.InExpr in_expr = 19;</code>
   * @return The inExpr.
   */
  org.mojolang.mojo.db.sql.InExpr getInExpr();
  /**
   * <code>.mojo.db.sql.InExpr in_expr = 19;</code>
   */
  org.mojolang.mojo.db.sql.InExprOrBuilder getInExprOrBuilder();

  /**
   * <code>.mojo.db.sql.CaseExpr case_expr = 20;</code>
   * @return Whether the caseExpr field is set.
   */
  boolean hasCaseExpr();
  /**
   * <code>.mojo.db.sql.CaseExpr case_expr = 20;</code>
   * @return The caseExpr.
   */
  org.mojolang.mojo.db.sql.CaseExpr getCaseExpr();
  /**
   * <code>.mojo.db.sql.CaseExpr case_expr = 20;</code>
   */
  org.mojolang.mojo.db.sql.CaseExprOrBuilder getCaseExprOrBuilder();

  /**
   * <code>.mojo.db.sql.CastExpr cast_expr = 21;</code>
   * @return Whether the castExpr field is set.
   */
  boolean hasCastExpr();
  /**
   * <code>.mojo.db.sql.CastExpr cast_expr = 21;</code>
   * @return The castExpr.
   */
  org.mojolang.mojo.db.sql.CastExpr getCastExpr();
  /**
   * <code>.mojo.db.sql.CastExpr cast_expr = 21;</code>
   */
  org.mojolang.mojo.db.sql.CastExprOrBuilder getCastExprOrBuilder();

  /**
   * <code>.mojo.db.sql.FunctionCallExpr function_call_expr = 22;</code>
   * @return Whether the functionCallExpr field is set.
   */
  boolean hasFunctionCallExpr();
  /**
   * <code>.mojo.db.sql.FunctionCallExpr function_call_expr = 22;</code>
   * @return The functionCallExpr.
   */
  org.mojolang.mojo.db.sql.FunctionCallExpr getFunctionCallExpr();
  /**
   * <code>.mojo.db.sql.FunctionCallExpr function_call_expr = 22;</code>
   */
  org.mojolang.mojo.db.sql.FunctionCallExprOrBuilder getFunctionCallExprOrBuilder();

  /**
   * <code>.mojo.db.sql.ExistsExpr exists_expr = 23;</code>
   * @return Whether the existsExpr field is set.
   */
  boolean hasExistsExpr();
  /**
   * <code>.mojo.db.sql.ExistsExpr exists_expr = 23;</code>
   * @return The existsExpr.
   */
  org.mojolang.mojo.db.sql.ExistsExpr getExistsExpr();
  /**
   * <code>.mojo.db.sql.ExistsExpr exists_expr = 23;</code>
   */
  org.mojolang.mojo.db.sql.ExistsExprOrBuilder getExistsExprOrBuilder();

  /**
   * <code>.mojo.db.sql.IsExpr is_expr = 24;</code>
   * @return Whether the isExpr field is set.
   */
  boolean hasIsExpr();
  /**
   * <code>.mojo.db.sql.IsExpr is_expr = 24;</code>
   * @return The isExpr.
   */
  org.mojolang.mojo.db.sql.IsExpr getIsExpr();
  /**
   * <code>.mojo.db.sql.IsExpr is_expr = 24;</code>
   */
  org.mojolang.mojo.db.sql.IsExprOrBuilder getIsExprOrBuilder();

  /**
   * <code>.mojo.db.sql.GlobExpr glob_expr = 25;</code>
   * @return Whether the globExpr field is set.
   */
  boolean hasGlobExpr();
  /**
   * <code>.mojo.db.sql.GlobExpr glob_expr = 25;</code>
   * @return The globExpr.
   */
  org.mojolang.mojo.db.sql.GlobExpr getGlobExpr();
  /**
   * <code>.mojo.db.sql.GlobExpr glob_expr = 25;</code>
   */
  org.mojolang.mojo.db.sql.GlobExprOrBuilder getGlobExprOrBuilder();

  /**
   * <code>.mojo.db.sql.LikeExpr like_expr = 26;</code>
   * @return Whether the likeExpr field is set.
   */
  boolean hasLikeExpr();
  /**
   * <code>.mojo.db.sql.LikeExpr like_expr = 26;</code>
   * @return The likeExpr.
   */
  org.mojolang.mojo.db.sql.LikeExpr getLikeExpr();
  /**
   * <code>.mojo.db.sql.LikeExpr like_expr = 26;</code>
   */
  org.mojolang.mojo.db.sql.LikeExprOrBuilder getLikeExprOrBuilder();

  /**
   * <code>.mojo.db.sql.MatchExpr match_expr = 27;</code>
   * @return Whether the matchExpr field is set.
   */
  boolean hasMatchExpr();
  /**
   * <code>.mojo.db.sql.MatchExpr match_expr = 27;</code>
   * @return The matchExpr.
   */
  org.mojolang.mojo.db.sql.MatchExpr getMatchExpr();
  /**
   * <code>.mojo.db.sql.MatchExpr match_expr = 27;</code>
   */
  org.mojolang.mojo.db.sql.MatchExprOrBuilder getMatchExprOrBuilder();

  /**
   * <code>.mojo.db.sql.RegexpExpr regexp_expr = 28;</code>
   * @return Whether the regexpExpr field is set.
   */
  boolean hasRegexpExpr();
  /**
   * <code>.mojo.db.sql.RegexpExpr regexp_expr = 28;</code>
   * @return The regexpExpr.
   */
  org.mojolang.mojo.db.sql.RegexpExpr getRegexpExpr();
  /**
   * <code>.mojo.db.sql.RegexpExpr regexp_expr = 28;</code>
   */
  org.mojolang.mojo.db.sql.RegexpExprOrBuilder getRegexpExprOrBuilder();

  /**
   * <code>.mojo.db.sql.NullExpr null_expr = 30;</code>
   * @return Whether the nullExpr field is set.
   */
  boolean hasNullExpr();
  /**
   * <code>.mojo.db.sql.NullExpr null_expr = 30;</code>
   * @return The nullExpr.
   */
  org.mojolang.mojo.db.sql.NullExpr getNullExpr();
  /**
   * <code>.mojo.db.sql.NullExpr null_expr = 30;</code>
   */
  org.mojolang.mojo.db.sql.NullExprOrBuilder getNullExprOrBuilder();

  /**
   * <code>.mojo.db.sql.RaiseFunctionExpr raise_function_expr = 31;</code>
   * @return Whether the raiseFunctionExpr field is set.
   */
  boolean hasRaiseFunctionExpr();
  /**
   * <code>.mojo.db.sql.RaiseFunctionExpr raise_function_expr = 31;</code>
   * @return The raiseFunctionExpr.
   */
  org.mojolang.mojo.db.sql.RaiseFunctionExpr getRaiseFunctionExpr();
  /**
   * <code>.mojo.db.sql.RaiseFunctionExpr raise_function_expr = 31;</code>
   */
  org.mojolang.mojo.db.sql.RaiseFunctionExprOrBuilder getRaiseFunctionExprOrBuilder();

  /**
   * <code>.mojo.db.sql.SubqueryExpr subquery_expr = 35;</code>
   * @return Whether the subqueryExpr field is set.
   */
  boolean hasSubqueryExpr();
  /**
   * <code>.mojo.db.sql.SubqueryExpr subquery_expr = 35;</code>
   * @return The subqueryExpr.
   */
  org.mojolang.mojo.db.sql.SubqueryExpr getSubqueryExpr();
  /**
   * <code>.mojo.db.sql.SubqueryExpr subquery_expr = 35;</code>
   */
  org.mojolang.mojo.db.sql.SubqueryExprOrBuilder getSubqueryExprOrBuilder();

  /**
   * <code>.mojo.db.sql.Expressions expressions = 40;</code>
   * @return Whether the expressions field is set.
   */
  boolean hasExpressions();
  /**
   * <code>.mojo.db.sql.Expressions expressions = 40;</code>
   * @return The expressions.
   */
  org.mojolang.mojo.db.sql.Expressions getExpressions();
  /**
   * <code>.mojo.db.sql.Expressions expressions = 40;</code>
   */
  org.mojolang.mojo.db.sql.ExpressionsOrBuilder getExpressionsOrBuilder();

  /**
   * <code>.mojo.db.sql.ParenthesizedExpr parenthesized_expr = 41;</code>
   * @return Whether the parenthesizedExpr field is set.
   */
  boolean hasParenthesizedExpr();
  /**
   * <code>.mojo.db.sql.ParenthesizedExpr parenthesized_expr = 41;</code>
   * @return The parenthesizedExpr.
   */
  org.mojolang.mojo.db.sql.ParenthesizedExpr getParenthesizedExpr();
  /**
   * <code>.mojo.db.sql.ParenthesizedExpr parenthesized_expr = 41;</code>
   */
  org.mojolang.mojo.db.sql.ParenthesizedExprOrBuilder getParenthesizedExprOrBuilder();

  public org.mojolang.mojo.db.sql.Expression.ExpressionCase getExpressionCase();
}