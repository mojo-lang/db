// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/defer_strategy.proto

package org.mojo-lang.mojo.db.sql;

public final class DeferStrategyProto {
  private DeferStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_DeferStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_DeferStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n mojo/db/sql/defer_strategy.proto\022\013mojo" +
      ".db.sql\"\274\001\n\rDeferStrategy\022\013\n\003not\030\001 \001(\010\0225" +
      "\n\010strategy\030\002 \001(\0162#.mojo.db.sql.DeferStra" +
      "tegy.Strategy\"g\n\010Strategy\022\030\n\024STRATEGY_UN" +
      "SPECIFIED\020\000\022\037\n\033STRATEGY_INITIALLY_DEFERR" +
      "ED\020\001\022 \n\034STRATEGY_INITIALLY_IMMEDIATE\020\002Ba" +
      "\n\031org.mojo-lang.mojo.db.sqlB\022DeferStrate" +
      "gyProtoP\001Z.github.com/mojo-lang/db/go/pk" +
      "g/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_mojo_db_sql_DeferStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_DeferStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_DeferStrategy_descriptor,
        new java.lang.String[] { "Not", "Strategy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}