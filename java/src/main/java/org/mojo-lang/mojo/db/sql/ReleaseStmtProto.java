// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/release_stmt.proto

package org.mojo-lang.mojo.db.sql;

public final class ReleaseStmtProto {
  private ReleaseStmtProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ReleaseStmt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ReleaseStmt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036mojo/db/sql/release_stmt.proto\022\013mojo.d" +
      "b.sql\032\024mojo/lang/lang.proto\"\205\001\n\013ReleaseS" +
      "tmt\022+\n\016start_position\030\001 \001(\0132\023.mojo.lang." +
      "Position\022)\n\014end_position\030\002 \001(\0132\023.mojo.la" +
      "ng.Position\022\014\n\004kind\030\004 \001(\003\022\020\n\010implicit\030\005 " +
      "\001(\010B_\n\031org.mojo-lang.mojo.db.sqlB\020Releas" +
      "eStmtProtoP\001Z.github.com/mojo-lang/db/go" +
      "/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_ReleaseStmt_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_ReleaseStmt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ReleaseStmt_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", });
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}