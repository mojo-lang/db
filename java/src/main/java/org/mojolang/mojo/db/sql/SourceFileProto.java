// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/source_file.proto

package org.mojolang.mojo.db.sql;

public final class SourceFileProto {
  private SourceFileProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_SourceFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_SourceFile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035mojo/db/sql/source_file.proto\022\013mojo.db" +
      ".sql\032\033mojo/db/sql/statement.proto\"Y\n\nSou" +
      "rceFile\022\014\n\004name\030\001 \001(\t\022\021\n\tfull_name\030\002 \001(\t" +
      "\022*\n\nstatements\030\014 \003(\0132\026.mojo.db.sql.State" +
      "mentB]\n\030org.mojolang.mojo.db.sqlB\017Source" +
      "FileProtoP\001Z.github.com/mojo-lang/db/go/" +
      "pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.db.sql.StatementProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_SourceFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_SourceFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_SourceFile_descriptor,
        new java.lang.String[] { "Name", "FullName", "Statements", });
    org.mojolang.mojo.db.sql.StatementProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}