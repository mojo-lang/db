// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/drop_stmt.proto

package org.mojolang.mojo.db.sql;

public final class DropStmtProto {
  private DropStmtProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_DropStmt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_DropStmt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033mojo/db/sql/drop_stmt.proto\022\013mojo.db.s" +
      "ql\032\024mojo/lang/lang.proto\"\202\001\n\010DropStmt\022+\n" +
      "\016start_position\030\001 \001(\0132\023.mojo.lang.Positi" +
      "on\022)\n\014end_position\030\002 \001(\0132\023.mojo.lang.Pos" +
      "ition\022\014\n\004kind\030\004 \001(\003\022\020\n\010implicit\030\005 \001(\010B[\n" +
      "\030org.mojolang.mojo.db.sqlB\rDropStmtProto" +
      "P\001Z.github.com/mojo-lang/db/go/pkg/mojo/" +
      "db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_DropStmt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_DropStmt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_DropStmt_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", });
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
