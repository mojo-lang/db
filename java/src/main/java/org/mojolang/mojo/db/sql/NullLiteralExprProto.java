// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/null_literal_expr.proto

package org.mojolang.mojo.db.sql;

public final class NullLiteralExprProto {
  private NullLiteralExprProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_NullLiteralExpr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_NullLiteralExpr_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#mojo/db/sql/null_literal_expr.proto\022\013m" +
      "ojo.db.sql\032\024mojo/lang/lang.proto\"\211\001\n\017Nul" +
      "lLiteralExpr\022+\n\016start_position\030\001 \001(\0132\023.m" +
      "ojo.lang.Position\022)\n\014end_position\030\002 \001(\0132" +
      "\023.mojo.lang.Position\022\014\n\004kind\030\004 \001(\005\022\020\n\010im" +
      "plicit\030\005 \001(\010Bb\n\030org.mojolang.mojo.db.sql" +
      "B\024NullLiteralExprProtoP\001Z.github.com/moj" +
      "o-lang/db/go/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_NullLiteralExpr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_NullLiteralExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_NullLiteralExpr_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", });
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
