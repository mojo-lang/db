// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/window.proto

package org.mojo-lang.mojo.db.sql;

public final class WindowProto {
  private WindowProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_Window_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_Window_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_Window_Frame_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_Window_Frame_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_Window_Frame_Bound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_Window_Frame_Bound_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030mojo/db/sql/window.proto\022\013mojo.db.sql\032" +
      "\"mojo/db/sql/partition_clause.proto\032\025moj" +
      "o/db/sql/sql.proto\"\335\003\n\006Window\022\014\n\004name\030\n " +
      "\001(\t\022/\n\tpartition\030\r \001(\0132\034.mojo.db.sql.Par" +
      "titionClause\022,\n\010order_by\030\016 \001(\0132\032.mojo.db" +
      ".sql.OrderByClause\022(\n\005frame\030\017 \001(\0132\031.mojo" +
      ".db.sql.Window.Frame\032\273\002\n\005Frame\022\014\n\004type\030\001" +
      " \001(\t\0224\n\013lower_bound\030\002 \001(\0132\037.mojo.db.sql." +
      "Window.Frame.Bound\0224\n\013upper_bound\030\003 \001(\0132" +
      "\037.mojo.db.sql.Window.Frame.Bound\022\017\n\007excl" +
      "ude\030\005 \001(\010\022\031\n\021exclude_no_others\030\006 \001(\010\022\023\n\013" +
      "current_row\030\007 \001(\010\022\r\n\005group\030\010 \001(\010\022\014\n\004ties" +
      "\030\t \001(\010\032Z\n\005Bound\022+\n\nexpression\030\001 \001(\0132\027.mo" +
      "jo.db.sql.Expression\022\021\n\tpreceding\030\005 \001(\010\022" +
      "\021\n\tfollowing\030\006 \001(\010BZ\n\031org.mojo-lang.mojo" +
      ".db.sqlB\013WindowProtoP\001Z.github.com/mojo-" +
      "lang/db/go/pkg/mojo/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojo-lang.mojo.db.sql.PartitionClauseProto.getDescriptor(),
          org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_Window_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_Window_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_Window_descriptor,
        new java.lang.String[] { "Name", "Partition", "OrderBy", "Frame", });
    internal_static_mojo_db_sql_Window_Frame_descriptor =
      internal_static_mojo_db_sql_Window_descriptor.getNestedTypes().get(0);
    internal_static_mojo_db_sql_Window_Frame_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_Window_Frame_descriptor,
        new java.lang.String[] { "Type", "LowerBound", "UpperBound", "Exclude", "ExcludeNoOthers", "CurrentRow", "Group", "Ties", });
    internal_static_mojo_db_sql_Window_Frame_Bound_descriptor =
      internal_static_mojo_db_sql_Window_Frame_descriptor.getNestedTypes().get(0);
    internal_static_mojo_db_sql_Window_Frame_Bound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_Window_Frame_Bound_descriptor,
        new java.lang.String[] { "Expression", "Preceding", "Following", });
    org.mojo-lang.mojo.db.sql.PartitionClauseProto.getDescriptor();
    org.mojo-lang.mojo.db.sql.SqlProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}