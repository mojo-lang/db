// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/boolean_literal_expr.proto

package org.mojolang.mojo.db.sql;

public interface BooleanLiteralExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.BooleanLiteralExpr)
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
   * <code>.mojo.db.sql.Boolean value = 20;</code>
   * @return The enum numeric value on the wire for value.
   */
  int getValueValue();
  /**
   * <code>.mojo.db.sql.Boolean value = 20;</code>
   * @return The value.
   */
  org.mojolang.mojo.db.sql.Boolean getValue();
}
