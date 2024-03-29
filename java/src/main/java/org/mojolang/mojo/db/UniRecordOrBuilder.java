// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/uni_record.proto

package org.mojolang.mojo.db;

public interface UniRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.UniRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.mojo.core.Id id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>.mojo.core.Id id = 1;</code>
   * @return The id.
   */
  org.mojolang.mojo.core.Id getId();
  /**
   * <code>.mojo.core.Id id = 1;</code>
   */
  org.mojolang.mojo.core.IdOrBuilder getIdOrBuilder();

  /**
   * <code>.mojo.core.Object data = 2 [(.mojo.db_json) = true];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.mojo.core.Object data = 2 [(.mojo.db_json) = true];</code>
   * @return The data.
   */
  org.mojolang.mojo.core.Object getData();
  /**
   * <code>.mojo.core.Object data = 2 [(.mojo.db_json) = true];</code>
   */
  org.mojolang.mojo.core.ObjectOrBuilder getDataOrBuilder();

  /**
   * <code>.mojo.core.Timestamp create_time = 5;</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <code>.mojo.core.Timestamp create_time = 5;</code>
   * @return The createTime.
   */
  org.mojolang.mojo.core.Timestamp getCreateTime();
  /**
   * <code>.mojo.core.Timestamp create_time = 5;</code>
   */
  org.mojolang.mojo.core.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <code>.mojo.core.Timestamp update_time = 6;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <code>.mojo.core.Timestamp update_time = 6;</code>
   * @return The updateTime.
   */
  org.mojolang.mojo.core.Timestamp getUpdateTime();
  /**
   * <code>.mojo.core.Timestamp update_time = 6;</code>
   */
  org.mojolang.mojo.core.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <code>.mojo.db.DeleteTime delete_time = 7;</code>
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   * <code>.mojo.db.DeleteTime delete_time = 7;</code>
   * @return The deleteTime.
   */
  org.mojolang.mojo.db.DeleteTime getDeleteTime();
  /**
   * <code>.mojo.db.DeleteTime delete_time = 7;</code>
   */
  org.mojolang.mojo.db.DeleteTimeOrBuilder getDeleteTimeOrBuilder();

  /**
   * <code>string table_name = 10 [(.mojo.db_ignore) = true];</code>
   * @return The tableName.
   */
  java.lang.String getTableName();
  /**
   * <code>string table_name = 10 [(.mojo.db_ignore) = true];</code>
   * @return The bytes for tableName.
   */
  com.google.protobuf.ByteString
      getTableNameBytes();
}
