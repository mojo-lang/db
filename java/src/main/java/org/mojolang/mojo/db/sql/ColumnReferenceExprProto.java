// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/column_reference_expr.proto

package org.mojolang.mojo.db.sql;

public final class ColumnReferenceExprProto {
  private ColumnReferenceExprProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ColumnReferenceExpr_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ColumnReferenceExpr_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'mojo/db/sql/column_reference_expr.prot" +
      "o\022\013mojo.db.sql\032\024mojo/lang/lang.proto\"\304\001\n" +
      "\023ColumnReferenceExpr\022+\n\016start_position\030\001" +
      " \001(\0132\023.mojo.lang.Position\022)\n\014end_positio" +
      "n\030\002 \001(\0132\023.mojo.lang.Position\022\014\n\004kind\030\004 \001" +
      "(\005\022\020\n\010implicit\030\005 \001(\010\022\023\n\013schema_name\030\n \001(" +
      "\t\022\022\n\ntable_name\030\013 \001(\t\022\014\n\004name\030\017 \001(\tBf\n\030o" +
      "rg.mojolang.mojo.db.sqlB\030ColumnReference" +
      "ExprProtoP\001Z.github.com/mojo-lang/db/go/" +
      "pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_ColumnReferenceExpr_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_ColumnReferenceExpr_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ColumnReferenceExpr_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "SchemaName", "TableName", "Name", });
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
