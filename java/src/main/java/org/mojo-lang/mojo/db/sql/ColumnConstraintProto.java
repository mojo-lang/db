// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/column_constraint.proto

package org.mojo-lang.mojo.db.sql;

public final class ColumnConstraintProto {
  private ColumnConstraintProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ColumnConstraint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ColumnConstraint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ColumnConstraint_PrimaryKey_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ColumnConstraint_PrimaryKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ColumnConstraint_NotNull_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ColumnConstraint_NotNull_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ColumnConstraint_Unique_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ColumnConstraint_Unique_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_ColumnConstraint_Default_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_ColumnConstraint_Default_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#mojo/db/sql/column_constraint.proto\022\013m" +
      "ojo.db.sql\032\036mojo/db/sql/check_clause.pro" +
      "to\032\030mojo/db/sql/clause.proto\032 mojo/db/sq" +
      "l/collate_clause.proto\032!mojo/db/sql/conf" +
      "lict_clause.proto\032$mojo/db/sql/foreign_k" +
      "ey_clause.proto\032\027mojo/db/sql/order.proto" +
      "\032\025mojo/db/sql/sql.proto\032\024mojo/lang/lang." +
      "proto\"\340\007\n\020ColumnConstraint\022\014\n\004name\030\001 \001(\t" +
      "\022?\n\013primary_key\030\002 \001(\0132(.mojo.db.sql.Colu" +
      "mnConstraint.PrimaryKeyH\000\0229\n\010not_null\030\003 " +
      "\001(\0132%.mojo.db.sql.ColumnConstraint.NotNu" +
      "llH\000\0226\n\006unique\030\004 \001(\0132$.mojo.db.sql.Colum" +
      "nConstraint.UniqueH\000\0220\n\014check_clause\030\005 \001" +
      "(\0132\030.mojo.db.sql.CheckClauseH\000\0228\n\007defaul" +
      "t\030\006 \001(\0132%.mojo.db.sql.ColumnConstraint.D" +
      "efaultH\000\0224\n\016collate_clause\030\007 \001(\0132\032.mojo." +
      "db.sql.CollateClauseH\000\022;\n\022foreign_key_cl" +
      "ause\030\010 \001(\0132\035.mojo.db.sql.ForeignKeyClaus" +
      "eH\000\032v\n\nPrimaryKey\022!\n\005order\030\001 \001(\0162\022.mojo." +
      "db.sql.Order\022-\n\010conflict\030\002 \001(\0132\033.mojo.db" +
      ".sql.ConflictClause\022\026\n\016auto_increment\030\003 " +
      "\001(\010\032\265\001\n\007NotNull\022+\n\016start_position\030\001 \001(\0132" +
      "\023.mojo.lang.Position\022)\n\014end_position\030\002 \001" +
      "(\0132\023.mojo.lang.Position\022\014\n\004kind\030\004 \001(\003\022\020\n" +
      "\010implicit\030\005 \001(\010\0222\n\006action\030\n \001(\0162\".mojo.d" +
      "b.sql.ConflictClause.Action\032\264\001\n\006Unique\022+" +
      "\n\016start_position\030\001 \001(\0132\023.mojo.lang.Posit" +
      "ion\022)\n\014end_position\030\002 \001(\0132\023.mojo.lang.Po" +
      "sition\022\014\n\004kind\030\004 \001(\003\022\020\n\010implicit\030\005 \001(\010\0222" +
      "\n\006action\030\n \001(\0162\".mojo.db.sql.ConflictCla" +
      "use.Action\0326\n\007Default\022+\n\nexpression\030\002 \001(" +
      "\0132\027.mojo.db.sql.ExpressionB\014\n\nconstraint" +
      "Bd\n\031org.mojo-lang.mojo.db.sqlB\025ColumnCon" +
      "straintProtoP\001Z.github.com/mojo-lang/db/" +
      "go/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.CheckClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.CollateClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.ConflictClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.ForeignKeyClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.OrderProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor(),
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_ColumnConstraint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_ColumnConstraint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ColumnConstraint_descriptor,
        new java.lang.String[] { "Name", "PrimaryKey", "NotNull", "Unique", "CheckClause", "Default", "CollateClause", "ForeignKeyClause", "Constraint", });
    internal_static_mojo_db_sql_ColumnConstraint_PrimaryKey_descriptor =
      internal_static_mojo_db_sql_ColumnConstraint_descriptor.getNestedTypes().get(0);
    internal_static_mojo_db_sql_ColumnConstraint_PrimaryKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ColumnConstraint_PrimaryKey_descriptor,
        new java.lang.String[] { "Order", "Conflict", "AutoIncrement", });
    internal_static_mojo_db_sql_ColumnConstraint_NotNull_descriptor =
      internal_static_mojo_db_sql_ColumnConstraint_descriptor.getNestedTypes().get(1);
    internal_static_mojo_db_sql_ColumnConstraint_NotNull_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ColumnConstraint_NotNull_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "Action", });
    internal_static_mojo_db_sql_ColumnConstraint_Unique_descriptor =
      internal_static_mojo_db_sql_ColumnConstraint_descriptor.getNestedTypes().get(2);
    internal_static_mojo_db_sql_ColumnConstraint_Unique_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ColumnConstraint_Unique_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", "Action", });
    internal_static_mojo_db_sql_ColumnConstraint_Default_descriptor =
      internal_static_mojo_db_sql_ColumnConstraint_descriptor.getNestedTypes().get(3);
    internal_static_mojo_db_sql_ColumnConstraint_Default_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_ColumnConstraint_Default_descriptor,
        new java.lang.String[] { "Expression", });
    org.mojo-lang.mojo.db.sql.CheckClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.ClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.CollateClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.ConflictClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.ForeignKeyClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.OrderProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor();
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
