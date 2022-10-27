// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/create_table_stmt.proto

package org.mojo-lang.mojo.db.sql;

public interface CreateTableStmtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.CreateTableStmt)
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
   * <code>bool if_not_exists = 10;</code>
   * @return The ifNotExists.
   */
  boolean getIfNotExists();

  /**
   * <code>.mojo.db.sql.TableName table_name = 11;</code>
   * @return Whether the tableName field is set.
   */
  boolean hasTableName();
  /**
   * <code>.mojo.db.sql.TableName table_name = 11;</code>
   * @return The tableName.
   */
  org.mojo-lang.mojo.db.sql.TableName getTableName();
  /**
   * <code>.mojo.db.sql.TableName table_name = 11;</code>
   */
  org.mojo-lang.mojo.db.sql.TableNameOrBuilder getTableNameOrBuilder();

  /**
   * <code>.mojo.db.sql.TableDefinition table_definition = 14;</code>
   * @return Whether the tableDefinition field is set.
   */
  boolean hasTableDefinition();
  /**
   * <code>.mojo.db.sql.TableDefinition table_definition = 14;</code>
   * @return The tableDefinition.
   */
  org.mojo-lang.mojo.db.sql.TableDefinition getTableDefinition();
  /**
   * <code>.mojo.db.sql.TableDefinition table_definition = 14;</code>
   */
  org.mojo-lang.mojo.db.sql.TableDefinitionOrBuilder getTableDefinitionOrBuilder();

  /**
   * <code>.mojo.db.sql.AsSubqueryClause as_subquery_clause = 15;</code>
   * @return Whether the asSubqueryClause field is set.
   */
  boolean hasAsSubqueryClause();
  /**
   * <code>.mojo.db.sql.AsSubqueryClause as_subquery_clause = 15;</code>
   * @return The asSubqueryClause.
   */
  org.mojo-lang.mojo.db.sql.AsSubqueryClause getAsSubqueryClause();
  /**
   * <code>.mojo.db.sql.AsSubqueryClause as_subquery_clause = 15;</code>
   */
  org.mojo-lang.mojo.db.sql.AsSubqueryClauseOrBuilder getAsSubqueryClauseOrBuilder();

  public org.mojo-lang.mojo.db.sql.CreateTableStmt.DefinitionCase getDefinitionCase();
}
