// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/over_clause.proto

package org.mojo-lang.mojo.db.sql;

public final class OverClauseProto {
  private OverClauseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_OverClause_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_OverClause_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035mojo/db/sql/over_clause.proto\022\013mojo.db" +
      ".sql\032\030mojo/db/sql/clause.proto\032\"mojo/db/" +
      "sql/partition_clause.proto\032\025mojo/db/sql/" +
      "sql.proto\032\030mojo/db/sql/window.proto\032\024moj" +
      "o/lang/lang.proto\"\233\002\n\nOverClause\022\014\n\004name" +
      "\030\n \001(\t\022/\n\tpartition\030\r \001(\0132\034.mojo.db.sql." +
      "PartitionClause\022,\n\010order_by\030\016 \001(\0132\032.mojo" +
      ".db.sql.OrderByClause\022(\n\005frame\030\017 \001(\0132\031.m" +
      "ojo.db.sql.Window.Frame\022+\n\016start_positio" +
      "n\030\001 \001(\0132\023.mojo.lang.Position\022)\n\014end_posi" +
      "tion\030\002 \001(\0132\023.mojo.lang.Position\022\014\n\004kind\030" +
      "\004 \001(\003\022\020\n\010implicit\030\005 \001(\010B^\n\031org.mojo-lang" +
      ".mojo.db.sqlB\017OverClauseProtoP\001Z.github." +
      "com/mojo-lang/db/go/pkg/mojo/db/sql;sqlb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.PartitionClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.WindowProto.getDescriptor(),
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_OverClause_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_OverClause_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_OverClause_descriptor,
        new java.lang.String[] { "Name", "Partition", "OrderBy", "Frame", "StartPosition", "EndPosition", "Kind", "Implicit", });
    org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.PartitionClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.WindowProto.getDescriptor();
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}