// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/conflict_clause.proto

package org.mojo-lang.mojo.db.sql;

public final class ConflictClauseProto {
  private ConflictClauseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ConflictClause_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ConflictClause_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!mojo/db/sql/conflict_clause.proto\022\013moj" +
      "o.db.sql\032\030mojo/db/sql/clause.proto\032\024mojo" +
      "/lang/lang.proto\"\245\002\n\016ConflictClause\022+\n\016s" +
      "tart_position\030\001 \001(\0132\023.mojo.lang.Position" +
      "\022)\n\014end_position\030\002 \001(\0132\023.mojo.lang.Posit" +
      "ion\022\014\n\004kind\030\004 \001(\003\022\020\n\010implicit\030\005 \001(\010\0222\n\006a" +
      "ction\030\n \001(\0162\".mojo.db.sql.ConflictClause" +
      ".Action\"g\n\006Action\022\023\n\017ACTION_ROLLBACK\020\000\022\020" +
      "\n\014ACTION_ABORT\020\001\022\017\n\013ACTION_FAIL\020\002\022\021\n\rACT" +
      "ION_IGNORE\020\003\022\022\n\016ACTION_REPLACE\020\004Bb\n\031org." +
      "mojo-lang.mojo.db.sqlB\023ConflictClausePro" +
      "toP\001Z.github.com/mojo-lang/db/go/pkg/moj" +
      "o/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor(),
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_ConflictClause_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_ConflictClause_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ConflictClause_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "Action", });
    org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor();
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}