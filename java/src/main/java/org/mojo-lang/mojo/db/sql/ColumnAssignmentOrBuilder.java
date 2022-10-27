// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/set_clause.proto

package org.mojo-lang.mojo.db.sql;

public interface ColumnAssignmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.ColumnAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string columns = 1;</code>
   * @return A list containing the columns.
   */
  java.util.List<java.lang.String>
      getColumnsList();
  /**
   * <code>repeated string columns = 1;</code>
   * @return The count of columns.
   */
  int getColumnsCount();
  /**
   * <code>repeated string columns = 1;</code>
   * @param index The index of the element to return.
   * @return The columns at the given index.
   */
  java.lang.String getColumns(int index);
  /**
   * <code>repeated string columns = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the columns at the given index.
   */
  com.google.protobuf.ByteString
      getColumnsBytes(int index);

  /**
   * <code>.mojo.db.sql.Expression value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.mojo.db.sql.Expression value = 2;</code>
   * @return The value.
   */
  org.mojo-lang.mojo.db.sql.Expression getValue();
  /**
   * <code>.mojo.db.sql.Expression value = 2;</code>
   */
  org.mojo-lang.mojo.db.sql.ExpressionOrBuilder getValueOrBuilder();
}