// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/config.proto

package org.mojo-lang.mojo.db;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string driver = 1;</code>
   * @return The driver.
   */
  java.lang.String getDriver();
  /**
   * <code>string driver = 1;</code>
   * @return The bytes for driver.
   */
  com.google.protobuf.ByteString
      getDriverBytes();

  /**
   * <code>string dsn = 2;</code>
   * @return The dsn.
   */
  java.lang.String getDsn();
  /**
   * <code>string dsn = 2;</code>
   * @return The bytes for dsn.
   */
  com.google.protobuf.ByteString
      getDsnBytes();

  /**
   * <code>bool debug = 3;</code>
   * @return The debug.
   */
  boolean getDebug();

  /**
   * <code>int32 max_idle_connections = 4;</code>
   * @return The maxIdleConnections.
   */
  int getMaxIdleConnections();

  /**
   * <code>int32 max_open_connections = 5;</code>
   * @return The maxOpenConnections.
   */
  int getMaxOpenConnections();

  /**
   * <code>.mojo.core.Duration connection_keep_alive = 6;</code>
   * @return Whether the connectionKeepAlive field is set.
   */
  boolean hasConnectionKeepAlive();
  /**
   * <code>.mojo.core.Duration connection_keep_alive = 6;</code>
   * @return The connectionKeepAlive.
   */
  org.mojolang.mojo.core.Duration getConnectionKeepAlive();
  /**
   * <code>.mojo.core.Duration connection_keep_alive = 6;</code>
   */
  org.mojolang.mojo.core.DurationOrBuilder getConnectionKeepAliveOrBuilder();

  /**
   * <code>.mojo.core.Duration slow_log_threshold = 7;</code>
   * @return Whether the slowLogThreshold field is set.
   */
  boolean hasSlowLogThreshold();
  /**
   * <code>.mojo.core.Duration slow_log_threshold = 7;</code>
   * @return The slowLogThreshold.
   */
  org.mojolang.mojo.core.Duration getSlowLogThreshold();
  /**
   * <code>.mojo.core.Duration slow_log_threshold = 7;</code>
   */
  org.mojolang.mojo.core.DurationOrBuilder getSlowLogThresholdOrBuilder();

  /**
   * <code>bool enable_metric = 8;</code>
   * @return The enableMetric.
   */
  boolean getEnableMetric();

  /**
   * <code>bool enable_trace = 9;</code>
   * @return The enableTrace.
   */
  boolean getEnableTrace();

  /**
   * <code>bool enable_detail_sql = 10;</code>
   * @return The enableDetailSql.
   */
  boolean getEnableDetailSql();

  /**
   * <code>bool enable_log_access = 11;</code>
   * @return The enableLogAccess.
   */
  boolean getEnableLogAccess();

  /**
   * <code>bool enable_log_access_request = 12;</code>
   * @return The enableLogAccessRequest.
   */
  boolean getEnableLogAccessRequest();

  /**
   * <code>bool enable_log_access_response = 13;</code>
   * @return The enableLogAccessResponse.
   */
  boolean getEnableLogAccessResponse();
}
