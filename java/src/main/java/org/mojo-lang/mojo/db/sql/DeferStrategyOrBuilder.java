// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/defer_strategy.proto

package org.mojo-lang.mojo.db.sql;

public interface DeferStrategyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mojo.db.sql.DeferStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool not = 1;</code>
   * @return The not.
   */
  boolean getNot();

  /**
   * <code>.mojo.db.sql.DeferStrategy.Strategy strategy = 2;</code>
   * @return The enum numeric value on the wire for strategy.
   */
  int getStrategyValue();
  /**
   * <code>.mojo.db.sql.DeferStrategy.Strategy strategy = 2;</code>
   * @return The strategy.
   */
  org.mojo-lang.mojo.db.sql.DeferStrategy.Strategy getStrategy();
}