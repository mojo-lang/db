// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/upsert_clause.proto

package org.mojo-lang.mojo.db.sql;

public interface UpsertClauseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.UpsertClause)
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
   * <code>.mojo.db.sql.UpsertClause.Conflict conflict = 10;</code>
   * @return Whether the conflict field is set.
   */
  boolean hasConflict();
  /**
   * <code>.mojo.db.sql.UpsertClause.Conflict conflict = 10;</code>
   * @return The conflict.
   */
  org.mojo-lang.mojo.db.sql.UpsertClause.Conflict getConflict();
  /**
   * <code>.mojo.db.sql.UpsertClause.Conflict conflict = 10;</code>
   */
  org.mojo-lang.mojo.db.sql.UpsertClause.ConflictOrBuilder getConflictOrBuilder();

  /**
   * <code>.mojo.db.sql.UpsertClause.UpdateSet update_set = 11;</code>
   * @return Whether the updateSet field is set.
   */
  boolean hasUpdateSet();
  /**
   * <code>.mojo.db.sql.UpsertClause.UpdateSet update_set = 11;</code>
   * @return The updateSet.
   */
  org.mojo-lang.mojo.db.sql.UpsertClause.UpdateSet getUpdateSet();
  /**
   * <code>.mojo.db.sql.UpsertClause.UpdateSet update_set = 11;</code>
   */
  org.mojo-lang.mojo.db.sql.UpsertClause.UpdateSetOrBuilder getUpdateSetOrBuilder();
}
