// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/into_clause.proto

package org.mojo-lang.mojo.db.sql;

public final class IntoClauseProto {
  private IntoClauseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_IntoClause_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_IntoClause_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035mojo/db/sql/into_clause.proto\022\013mojo.db" +
      ".sql\032\030mojo/db/sql/clause.proto\032\025mojo/db/" +
      "sql/sql.proto\032\024mojo/lang/lang.proto\"\301\001\n\n" +
      "IntoClause\022+\n\016start_position\030\001 \001(\0132\023.moj" +
      "o.lang.Position\022)\n\014end_position\030\002 \001(\0132\023." +
      "mojo.lang.Position\022\014\n\004kind\030\004 \001(\003\022\020\n\010impl" +
      "icit\030\005 \001(\010\022*\n\ntable_name\030\n \001(\0132\026.mojo.db" +
      ".sql.TableName\022\017\n\007columns\030\013 \003(\tB^\n\031org.m" +
      "ojo-lang.mojo.db.sqlB\017IntoClauseProtoP\001Z" +
      ".github.com/mojo-lang/db/go/pkg/mojo/db/" +
      "sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor(),
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_IntoClause_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_IntoClause_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_IntoClause_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "TableName", "Columns", });
    org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor();
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
