// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/statement.proto

package org.mojolang.mojo.db.sql;

public interface StatementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.Statement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.db.sql.AlterTableStmt alter_table_stmt = 1;</code>
   * @return Whether the alterTableStmt field is set.
   */
  boolean hasAlterTableStmt();
  /**
   * <code>.mojo.db.sql.AlterTableStmt alter_table_stmt = 1;</code>
   * @return The alterTableStmt.
   */
  org.mojolang.mojo.db.sql.AlterTableStmt getAlterTableStmt();
  /**
   * <code>.mojo.db.sql.AlterTableStmt alter_table_stmt = 1;</code>
   */
  org.mojolang.mojo.db.sql.AlterTableStmtOrBuilder getAlterTableStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.AnalyzeSmt analyze_smt = 2;</code>
   * @return Whether the analyzeSmt field is set.
   */
  boolean hasAnalyzeSmt();
  /**
   * <code>.mojo.db.sql.AnalyzeSmt analyze_smt = 2;</code>
   * @return The analyzeSmt.
   */
  org.mojolang.mojo.db.sql.AnalyzeSmt getAnalyzeSmt();
  /**
   * <code>.mojo.db.sql.AnalyzeSmt analyze_smt = 2;</code>
   */
  org.mojolang.mojo.db.sql.AnalyzeSmtOrBuilder getAnalyzeSmtOrBuilder();

  /**
   * <code>.mojo.db.sql.AttachStmt attach_stmt = 3;</code>
   * @return Whether the attachStmt field is set.
   */
  boolean hasAttachStmt();
  /**
   * <code>.mojo.db.sql.AttachStmt attach_stmt = 3;</code>
   * @return The attachStmt.
   */
  org.mojolang.mojo.db.sql.AttachStmt getAttachStmt();
  /**
   * <code>.mojo.db.sql.AttachStmt attach_stmt = 3;</code>
   */
  org.mojolang.mojo.db.sql.AttachStmtOrBuilder getAttachStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.BeginStmt begin_stmt = 5;</code>
   * @return Whether the beginStmt field is set.
   */
  boolean hasBeginStmt();
  /**
   * <code>.mojo.db.sql.BeginStmt begin_stmt = 5;</code>
   * @return The beginStmt.
   */
  org.mojolang.mojo.db.sql.BeginStmt getBeginStmt();
  /**
   * <code>.mojo.db.sql.BeginStmt begin_stmt = 5;</code>
   */
  org.mojolang.mojo.db.sql.BeginStmtOrBuilder getBeginStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.CommitStmt commit_stmt = 6;</code>
   * @return Whether the commitStmt field is set.
   */
  boolean hasCommitStmt();
  /**
   * <code>.mojo.db.sql.CommitStmt commit_stmt = 6;</code>
   * @return The commitStmt.
   */
  org.mojolang.mojo.db.sql.CommitStmt getCommitStmt();
  /**
   * <code>.mojo.db.sql.CommitStmt commit_stmt = 6;</code>
   */
  org.mojolang.mojo.db.sql.CommitStmtOrBuilder getCommitStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.CreateIndexStmt create_index_stmt = 10;</code>
   * @return Whether the createIndexStmt field is set.
   */
  boolean hasCreateIndexStmt();
  /**
   * <code>.mojo.db.sql.CreateIndexStmt create_index_stmt = 10;</code>
   * @return The createIndexStmt.
   */
  org.mojolang.mojo.db.sql.CreateIndexStmt getCreateIndexStmt();
  /**
   * <code>.mojo.db.sql.CreateIndexStmt create_index_stmt = 10;</code>
   */
  org.mojolang.mojo.db.sql.CreateIndexStmtOrBuilder getCreateIndexStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.CreateTableStmt create_table_stmt = 11;</code>
   * @return Whether the createTableStmt field is set.
   */
  boolean hasCreateTableStmt();
  /**
   * <code>.mojo.db.sql.CreateTableStmt create_table_stmt = 11;</code>
   * @return The createTableStmt.
   */
  org.mojolang.mojo.db.sql.CreateTableStmt getCreateTableStmt();
  /**
   * <code>.mojo.db.sql.CreateTableStmt create_table_stmt = 11;</code>
   */
  org.mojolang.mojo.db.sql.CreateTableStmtOrBuilder getCreateTableStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.CreateTriggerStmt create_trigger_stmt = 12;</code>
   * @return Whether the createTriggerStmt field is set.
   */
  boolean hasCreateTriggerStmt();
  /**
   * <code>.mojo.db.sql.CreateTriggerStmt create_trigger_stmt = 12;</code>
   * @return The createTriggerStmt.
   */
  org.mojolang.mojo.db.sql.CreateTriggerStmt getCreateTriggerStmt();
  /**
   * <code>.mojo.db.sql.CreateTriggerStmt create_trigger_stmt = 12;</code>
   */
  org.mojolang.mojo.db.sql.CreateTriggerStmtOrBuilder getCreateTriggerStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.CreateViewStmt create_view_stmt = 13;</code>
   * @return Whether the createViewStmt field is set.
   */
  boolean hasCreateViewStmt();
  /**
   * <code>.mojo.db.sql.CreateViewStmt create_view_stmt = 13;</code>
   * @return The createViewStmt.
   */
  org.mojolang.mojo.db.sql.CreateViewStmt getCreateViewStmt();
  /**
   * <code>.mojo.db.sql.CreateViewStmt create_view_stmt = 13;</code>
   */
  org.mojolang.mojo.db.sql.CreateViewStmtOrBuilder getCreateViewStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.CreateVirtualTableStmt create_virtual_table_stmt = 14;</code>
   * @return Whether the createVirtualTableStmt field is set.
   */
  boolean hasCreateVirtualTableStmt();
  /**
   * <code>.mojo.db.sql.CreateVirtualTableStmt create_virtual_table_stmt = 14;</code>
   * @return The createVirtualTableStmt.
   */
  org.mojolang.mojo.db.sql.CreateVirtualTableStmt getCreateVirtualTableStmt();
  /**
   * <code>.mojo.db.sql.CreateVirtualTableStmt create_virtual_table_stmt = 14;</code>
   */
  org.mojolang.mojo.db.sql.CreateVirtualTableStmtOrBuilder getCreateVirtualTableStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.DeleteStmt delete_stmt = 17;</code>
   * @return Whether the deleteStmt field is set.
   */
  boolean hasDeleteStmt();
  /**
   * <code>.mojo.db.sql.DeleteStmt delete_stmt = 17;</code>
   * @return The deleteStmt.
   */
  org.mojolang.mojo.db.sql.DeleteStmt getDeleteStmt();
  /**
   * <code>.mojo.db.sql.DeleteStmt delete_stmt = 17;</code>
   */
  org.mojolang.mojo.db.sql.DeleteStmtOrBuilder getDeleteStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.DetachStmt detach_stmt = 18;</code>
   * @return Whether the detachStmt field is set.
   */
  boolean hasDetachStmt();
  /**
   * <code>.mojo.db.sql.DetachStmt detach_stmt = 18;</code>
   * @return The detachStmt.
   */
  org.mojolang.mojo.db.sql.DetachStmt getDetachStmt();
  /**
   * <code>.mojo.db.sql.DetachStmt detach_stmt = 18;</code>
   */
  org.mojolang.mojo.db.sql.DetachStmtOrBuilder getDetachStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.DropStmt drop_stmt = 19;</code>
   * @return Whether the dropStmt field is set.
   */
  boolean hasDropStmt();
  /**
   * <code>.mojo.db.sql.DropStmt drop_stmt = 19;</code>
   * @return The dropStmt.
   */
  org.mojolang.mojo.db.sql.DropStmt getDropStmt();
  /**
   * <code>.mojo.db.sql.DropStmt drop_stmt = 19;</code>
   */
  org.mojolang.mojo.db.sql.DropStmtOrBuilder getDropStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.EndStmt end_stmt = 30;</code>
   * @return Whether the endStmt field is set.
   */
  boolean hasEndStmt();
  /**
   * <code>.mojo.db.sql.EndStmt end_stmt = 30;</code>
   * @return The endStmt.
   */
  org.mojolang.mojo.db.sql.EndStmt getEndStmt();
  /**
   * <code>.mojo.db.sql.EndStmt end_stmt = 30;</code>
   */
  org.mojolang.mojo.db.sql.EndStmtOrBuilder getEndStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.InsertStmt insert_stmt = 20;</code>
   * @return Whether the insertStmt field is set.
   */
  boolean hasInsertStmt();
  /**
   * <code>.mojo.db.sql.InsertStmt insert_stmt = 20;</code>
   * @return The insertStmt.
   */
  org.mojolang.mojo.db.sql.InsertStmt getInsertStmt();
  /**
   * <code>.mojo.db.sql.InsertStmt insert_stmt = 20;</code>
   */
  org.mojolang.mojo.db.sql.InsertStmtOrBuilder getInsertStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.PragmaStmt pragma_stmt = 21;</code>
   * @return Whether the pragmaStmt field is set.
   */
  boolean hasPragmaStmt();
  /**
   * <code>.mojo.db.sql.PragmaStmt pragma_stmt = 21;</code>
   * @return The pragmaStmt.
   */
  org.mojolang.mojo.db.sql.PragmaStmt getPragmaStmt();
  /**
   * <code>.mojo.db.sql.PragmaStmt pragma_stmt = 21;</code>
   */
  org.mojolang.mojo.db.sql.PragmaStmtOrBuilder getPragmaStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.ReindexStmt reindex_stmt = 22;</code>
   * @return Whether the reindexStmt field is set.
   */
  boolean hasReindexStmt();
  /**
   * <code>.mojo.db.sql.ReindexStmt reindex_stmt = 22;</code>
   * @return The reindexStmt.
   */
  org.mojolang.mojo.db.sql.ReindexStmt getReindexStmt();
  /**
   * <code>.mojo.db.sql.ReindexStmt reindex_stmt = 22;</code>
   */
  org.mojolang.mojo.db.sql.ReindexStmtOrBuilder getReindexStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.ReleaseStmt release_stmt = 23;</code>
   * @return Whether the releaseStmt field is set.
   */
  boolean hasReleaseStmt();
  /**
   * <code>.mojo.db.sql.ReleaseStmt release_stmt = 23;</code>
   * @return The releaseStmt.
   */
  org.mojolang.mojo.db.sql.ReleaseStmt getReleaseStmt();
  /**
   * <code>.mojo.db.sql.ReleaseStmt release_stmt = 23;</code>
   */
  org.mojolang.mojo.db.sql.ReleaseStmtOrBuilder getReleaseStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.RollbackStmt rollback_stmt = 24;</code>
   * @return Whether the rollbackStmt field is set.
   */
  boolean hasRollbackStmt();
  /**
   * <code>.mojo.db.sql.RollbackStmt rollback_stmt = 24;</code>
   * @return The rollbackStmt.
   */
  org.mojolang.mojo.db.sql.RollbackStmt getRollbackStmt();
  /**
   * <code>.mojo.db.sql.RollbackStmt rollback_stmt = 24;</code>
   */
  org.mojolang.mojo.db.sql.RollbackStmtOrBuilder getRollbackStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.SelectStmt select_stmt = 25;</code>
   * @return Whether the selectStmt field is set.
   */
  boolean hasSelectStmt();
  /**
   * <code>.mojo.db.sql.SelectStmt select_stmt = 25;</code>
   * @return The selectStmt.
   */
  org.mojolang.mojo.db.sql.SelectStmt getSelectStmt();
  /**
   * <code>.mojo.db.sql.SelectStmt select_stmt = 25;</code>
   */
  org.mojolang.mojo.db.sql.SelectStmtOrBuilder getSelectStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.UpdateStmt update_stmt = 26;</code>
   * @return Whether the updateStmt field is set.
   */
  boolean hasUpdateStmt();
  /**
   * <code>.mojo.db.sql.UpdateStmt update_stmt = 26;</code>
   * @return The updateStmt.
   */
  org.mojolang.mojo.db.sql.UpdateStmt getUpdateStmt();
  /**
   * <code>.mojo.db.sql.UpdateStmt update_stmt = 26;</code>
   */
  org.mojolang.mojo.db.sql.UpdateStmtOrBuilder getUpdateStmtOrBuilder();

  /**
   * <code>.mojo.db.sql.VacuumStmt vacuum_stmt = 27;</code>
   * @return Whether the vacuumStmt field is set.
   */
  boolean hasVacuumStmt();
  /**
   * <code>.mojo.db.sql.VacuumStmt vacuum_stmt = 27;</code>
   * @return The vacuumStmt.
   */
  org.mojolang.mojo.db.sql.VacuumStmt getVacuumStmt();
  /**
   * <code>.mojo.db.sql.VacuumStmt vacuum_stmt = 27;</code>
   */
  org.mojolang.mojo.db.sql.VacuumStmtOrBuilder getVacuumStmtOrBuilder();

  public org.mojolang.mojo.db.sql.Statement.StatementCase getStatementCase();
}
