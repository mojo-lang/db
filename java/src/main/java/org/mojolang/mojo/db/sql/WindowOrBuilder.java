// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/window.proto

package org.mojolang.mojo.db.sql;

public interface WindowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.Window)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 10;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 10;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.mojo.db.sql.PartitionClause partition = 13;</code>
   * @return Whether the partition field is set.
   */
  boolean hasPartition();
  /**
   * <code>.mojo.db.sql.PartitionClause partition = 13;</code>
   * @return The partition.
   */
  org.mojolang.mojo.db.sql.PartitionClause getPartition();
  /**
   * <code>.mojo.db.sql.PartitionClause partition = 13;</code>
   */
  org.mojolang.mojo.db.sql.PartitionClauseOrBuilder getPartitionOrBuilder();

  /**
   * <code>.mojo.db.sql.OrderByClause order_by = 14;</code>
   * @return Whether the orderBy field is set.
   */
  boolean hasOrderBy();
  /**
   * <code>.mojo.db.sql.OrderByClause order_by = 14;</code>
   * @return The orderBy.
   */
  org.mojolang.mojo.db.sql.OrderByClause getOrderBy();
  /**
   * <code>.mojo.db.sql.OrderByClause order_by = 14;</code>
   */
  org.mojolang.mojo.db.sql.OrderByClauseOrBuilder getOrderByOrBuilder();

  /**
   * <code>.mojo.db.sql.Window.Frame frame = 15;</code>
   * @return Whether the frame field is set.
   */
  boolean hasFrame();
  /**
   * <code>.mojo.db.sql.Window.Frame frame = 15;</code>
   * @return The frame.
   */
  org.mojolang.mojo.db.sql.Window.Frame getFrame();
  /**
   * <code>.mojo.db.sql.Window.Frame frame = 15;</code>
   */
  org.mojolang.mojo.db.sql.Window.FrameOrBuilder getFrameOrBuilder();
}
