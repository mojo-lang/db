// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/qualified_table_name.proto

package org.mojolang.mojo.db.sql;

public final class QualifiedTableNameProto {
  private QualifiedTableNameProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_QualifiedTableName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_QualifiedTableName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&mojo/db/sql/qualified_table_name.proto" +
      "\022\013mojo.db.sql\"g\n\022QualifiedTableName\022\016\n\006s" +
      "chema\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005alias\030\003 \001(\t" +
      "\022\017\n\007indexed\030\005 \001(\t\022\023\n\013not_indexed\030\006 \001(\010Be" +
      "\n\030org.mojolang.mojo.db.sqlB\027QualifiedTab" +
      "leNameProtoP\001Z.github.com/mojo-lang/db/g" +
      "o/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_mojo_db_sql_QualifiedTableName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_QualifiedTableName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_QualifiedTableName_descriptor,
        new java.lang.String[] { "Schema", "Name", "Alias", "Indexed", "NotIndexed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}