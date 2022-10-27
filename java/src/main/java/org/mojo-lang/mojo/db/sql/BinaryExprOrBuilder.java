// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojo-lang.mojo.db.sql;

public interface BinaryExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.BinaryExpr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return Whether the startPosition field is set.
   */
  boolean hasStartPosition();
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return The startPosition.
   */
  org.mojolang.mojo.lang.Position getStartPosition();
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   */
  org.mojolang.mojo.lang.PositionOrBuilder getStartPositionOrBuilder();

  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return Whether the endPosition field is set.
   */
  boolean hasEndPosition();
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return The endPosition.
   */
  org.mojolang.mojo.lang.Position getEndPosition();
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   */
  org.mojolang.mojo.lang.PositionOrBuilder getEndPositionOrBuilder();

  /**
   * <code>int32 kind = 4;</code>
   * @return The kind.
   */
  int getKind();

  /**
   * <code>bool implicit = 5;</code>
   * @return The implicit.
   */
  boolean getImplicit();

  /**
   * <code>.mojo.db.sql.BinaryExpr.Operator operator = 10;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <code>.mojo.db.sql.BinaryExpr.Operator operator = 10;</code>
   * @return The operator.
   */
  org.mojo-lang.mojo.db.sql.BinaryExpr.Operator getOperator();

  /**
   * <code>string operator_symbol = 11;</code>
   * @return The operatorSymbol.
   */
  java.lang.String getOperatorSymbol();
  /**
   * <code>string operator_symbol = 11;</code>
   * @return The bytes for operatorSymbol.
   */
  com.google.protobuf.ByteString
      getOperatorSymbolBytes();

  /**
   * <code>int32 operator_precedence = 12;</code>
   * @return The operatorPrecedence.
   */
  int getOperatorPrecedence();

  /**
   * <code>.mojo.db.sql.Expression left_argument = 15;</code>
   * @return Whether the leftArgument field is set.
   */
  boolean hasLeftArgument();
  /**
   * <code>.mojo.db.sql.Expression left_argument = 15;</code>
   * @return The leftArgument.
   */
  org.mojo-lang.mojo.db.sql.Expression getLeftArgument();
  /**
   * <code>.mojo.db.sql.Expression left_argument = 15;</code>
   */
  org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getLeftArgumentOrBuilder();

  /**
   * <code>.mojo.db.sql.Expression right_argument = 16;</code>
   * @return Whether the rightArgument field is set.
   */
  boolean hasRightArgument();
  /**
   * <code>.mojo.db.sql.Expression right_argument = 16;</code>
   * @return The rightArgument.
   */
  org.mojo-lang.mojo.db.sql.Expression getRightArgument();
  /**
   * <code>.mojo.db.sql.Expression right_argument = 16;</code>
   */
  org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getRightArgumentOrBuilder();
}