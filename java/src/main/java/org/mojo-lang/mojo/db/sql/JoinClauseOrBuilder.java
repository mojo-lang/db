// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojo-lang.mojo.db.sql;

public interface JoinClauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.JoinClause)
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
   * <code>int64 kind = 4;</code>
   * @return The kind.
   */
  long getKind();

  /**
   * <code>bool implicit = 5;</code>
   * @return The implicit.
   */
  boolean getImplicit();

  /**
   * <code>.mojo.db.sql.Table table = 10;</code>
   * @return Whether the table field is set.
   */
  boolean hasTable();
  /**
   * <code>.mojo.db.sql.Table table = 10;</code>
   * @return The table.
   */
  org.mojo-lang.mojo.db.sql.Table getTable();
  /**
   * <code>.mojo.db.sql.Table table = 10;</code>
   */
  org.mojo-lang.mojo.db.sql.TableOrBuilder getTableOrBuilder();

  /**
   * <code>.mojo.db.sql.JoinClause.Operator operator = 15;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <code>.mojo.db.sql.JoinClause.Operator operator = 15;</code>
   * @return The operator.
   */
  org.mojo-lang.mojo.db.sql.JoinClause.Operator getOperator();

  /**
   * <code>.mojo.db.sql.JoinClause left = 16;</code>
   * @return Whether the left field is set.
   */
  boolean hasLeft();
  /**
   * <code>.mojo.db.sql.JoinClause left = 16;</code>
   * @return The left.
   */
  org.mojo-lang.mojo.db.sql.JoinClause getLeft();
  /**
   * <code>.mojo.db.sql.JoinClause left = 16;</code>
   */
  org.mojo-lang.mojo.db.sql.JoinClauseOrBuilder getLeftOrBuilder();

  /**
   * <code>.mojo.db.sql.JoinClause right = 17;</code>
   * @return Whether the right field is set.
   */
  boolean hasRight();
  /**
   * <code>.mojo.db.sql.JoinClause right = 17;</code>
   * @return The right.
   */
  org.mojo-lang.mojo.db.sql.JoinClause getRight();
  /**
   * <code>.mojo.db.sql.JoinClause right = 17;</code>
   */
  org.mojo-lang.mojo.db.sql.JoinClauseOrBuilder getRightOrBuilder();

  /**
   * <code>.mojo.db.sql.JoinClause.Constraint constraint = 18;</code>
   * @return Whether the constraint field is set.
   */
  boolean hasConstraint();
  /**
   * <code>.mojo.db.sql.JoinClause.Constraint constraint = 18;</code>
   * @return The constraint.
   */
  org.mojo-lang.mojo.db.sql.JoinClause.Constraint getConstraint();
  /**
   * <code>.mojo.db.sql.JoinClause.Constraint constraint = 18;</code>
   */
  org.mojo-lang.mojo.db.sql.JoinClause.ConstraintOrBuilder getConstraintOrBuilder();
}