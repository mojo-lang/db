// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/create_view_stmt.proto

package org.mojo-lang.mojo.db.sql;

public final class CreateViewStmtProto {
  private CreateViewStmtProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_CreateViewStmt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_CreateViewStmt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"mojo/db/sql/create_view_stmt.proto\022\013mo" +
      "jo.db.sql\032\035mojo/db/sql/create_stmt.proto" +
      "\032&mojo/db/sql/data_definition_stmt.proto" +
      "\032\025mojo/db/sql/sql.proto\032\033mojo/db/sql/vie" +
      "w_name.proto\032\024mojo/lang/lang.proto\"\202\002\n\016C" +
      "reateViewStmt\022+\n\016start_position\030\001 \001(\0132\023." +
      "mojo.lang.Position\022)\n\014end_position\030\002 \001(\013" +
      "2\023.mojo.lang.Position\022\014\n\004kind\030\004 \001(\003\022\020\n\010i" +
      "mplicit\030\005 \001(\010\022\025\n\rif_not_exists\030\n \001(\010\022(\n\t" +
      "view_name\030\013 \001(\0132\025.mojo.db.sql.ViewName\022\017" +
      "\n\007columns\030\r \003(\t\022&\n\005query\030\016 \001(\0132\027.mojo.db" +
      ".sql.SelectStmtBb\n\031org.mojo-lang.mojo.db" +
      ".sqlB\023CreateViewStmtProtoP\001Z.github.com/" +
      "mojo-lang/db/go/pkg/mojo/db/sql;sqlb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.CreateStmtProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.DataDefinitionStmtProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.ViewNameProto.getDescriptor(),
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_CreateViewStmt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_CreateViewStmt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_CreateViewStmt_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "IfNotExists", "ViewName", "Columns", "Query", });
    org.mojo-lang.mojo.db.sql.CreateStmtProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.DataDefinitionStmtProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.ViewNameProto.getDescriptor();
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}