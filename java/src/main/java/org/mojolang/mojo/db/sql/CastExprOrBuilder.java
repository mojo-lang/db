// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojolang.mojo.db.sql;

public interface CastExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.CastExpr)
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
   * <code>.mojo.db.sql.Expression value = 10;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.mojo.db.sql.Expression value = 10;</code>
   * @return The value.
   */
  org.mojolang.mojo.db.sql.Expression getValue();
  /**
   * <code>.mojo.db.sql.Expression value = 10;</code>
   */
  org.mojolang.mojo.db.sql.ExpressionOrBuilder getValueOrBuilder();

  /**
   * <code>.mojo.db.sql.DataType target = 11;</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <code>.mojo.db.sql.DataType target = 11;</code>
   * @return The target.
   */
  org.mojolang.mojo.db.sql.DataType getTarget();
  /**
   * <code>.mojo.db.sql.DataType target = 11;</code>
   */
  org.mojolang.mojo.db.sql.DataTypeOrBuilder getTargetOrBuilder();
}
