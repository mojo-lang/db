// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/binary_string_literal_expr.proto

package org.mojolang.mojo.db.sql;

public final class BinaryStringLiteralExprProto {
  private BinaryStringLiteralExprProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_BinaryStringLiteralExpr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_BinaryStringLiteralExpr_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,mojo/db/sql/binary_string_literal_expr" +
      ".proto\022\013mojo.db.sql\032\024mojo/lang/lang.prot" +
      "o\"\240\001\n\027BinaryStringLiteralExpr\022+\n\016start_p" +
      "osition\030\001 \001(\0132\023.mojo.lang.Position\022)\n\014en" +
      "d_position\030\002 \001(\0132\023.mojo.lang.Position\022\014\n" +
      "\004kind\030\004 \001(\005\022\020\n\010implicit\030\005 \001(\010\022\r\n\005value\030\024" +
      " \001(\tBj\n\030org.mojolang.mojo.db.sqlB\034Binary" +
      "StringLiteralExprProtoP\001Z.github.com/moj" +
      "o-lang/db/go/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_BinaryStringLiteralExpr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_BinaryStringLiteralExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_BinaryStringLiteralExpr_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "Value", });
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}