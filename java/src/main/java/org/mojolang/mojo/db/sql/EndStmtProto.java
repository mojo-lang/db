// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/end_stmt.proto

package org.mojolang.mojo.db.sql;

public final class EndStmtProto {
  private EndStmtProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_EndStmt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_EndStmt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032mojo/db/sql/end_stmt.proto\022\013mojo.db.sq" +
      "l\032\024mojo/lang/lang.proto\"\226\001\n\007EndStmt\022+\n\016s" +
      "tart_position\030\001 \001(\0132\023.mojo.lang.Position" +
      "\022)\n\014end_position\030\002 \001(\0132\023.mojo.lang.Posit" +
      "ion\022\014\n\004kind\030\004 \001(\003\022\020\n\010implicit\030\005 \001(\010\022\023\n\013t" +
      "ransaction\030\n \001(\010BZ\n\030org.mojolang.mojo.db" +
      ".sqlB\014EndStmtProtoP\001Z.github.com/mojo-la" +
      "ng/db/go/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_EndStmt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_EndStmt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_EndStmt_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "Transaction", });
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
