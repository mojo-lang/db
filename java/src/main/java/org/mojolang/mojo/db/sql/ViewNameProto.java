// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/view_name.proto

package org.mojolang.mojo.db.sql;

public final class ViewNameProto {
  private ViewNameProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ViewName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ViewName_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033mojo/db/sql/view_name.proto\022\013mojo.db.s" +
      "ql\"<\n\010ViewName\022\023\n\013schema_name\030\n \001(\t\022\014\n\004n" +
      "ame\030\r \001(\t\022\r\n\005alias\030\017 \001(\tB[\n\030org.mojolang" +
      ".mojo.db.sqlB\rViewNameProtoP\001Z.github.co" +
      "m/mojo-lang/db/go/pkg/mojo/db/sql;sqlb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_mojo_db_sql_ViewName_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_ViewName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ViewName_descriptor,
        new java.lang.String[] { "SchemaName", "Name", "Alias", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
