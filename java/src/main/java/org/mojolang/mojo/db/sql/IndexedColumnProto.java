// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/indexed_column.proto

package org.mojolang.mojo.db.sql;

public final class IndexedColumnProto {
  private IndexedColumnProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_IndexedColumn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_IndexedColumn_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n mojo/db/sql/indexed_column.proto\022\013mojo" +
      ".db.sql\032 mojo/db/sql/collate_clause.prot" +
      "o\032\027mojo/db/sql/order.proto\032\025mojo/db/sql/" +
      "sql.proto\"\262\001\n\rIndexedColumn\022\032\n\020mojo_core" +
      "_string\030\001 \001(\tH\000\022-\n\nexpression\030\002 \001(\0132\027.mo" +
      "jo.db.sql.ExpressionH\000\022+\n\007collate\030\005 \001(\0132" +
      "\032.mojo.db.sql.CollateClause\022!\n\005order\030\006 \001" +
      "(\0162\022.mojo.db.sql.OrderB\006\n\004nameB`\n\030org.mo" +
      "jolang.mojo.db.sqlB\022IndexedColumnProtoP\001" +
      "Z.github.com/mojo-lang/db/go/pkg/mojo/db" +
      "/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.db.sql.CollateClauseProto.getDescriptor(),
          org.mojolang.mojo.db.sql.OrderProto.getDescriptor(),
          org.mojolang.mojo.db.sql.SqlProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_IndexedColumn_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_IndexedColumn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_IndexedColumn_descriptor,
        new java.lang.String[] { "MojoCoreString", "Expression", "Collate", "Order", "Name", });
    org.mojolang.mojo.db.sql.CollateClauseProto.getDescriptor();
    org.mojolang.mojo.db.sql.OrderProto.getDescriptor();
    org.mojolang.mojo.db.sql.SqlProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}