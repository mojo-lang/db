// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/predicate.proto

package org.mojolang.mojo.db.sql;

public final class PredicateProto {
  private PredicateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_mojo_db_sql_Predicate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_mojo_db_sql_Predicate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033mojo/db/sql/predicate.proto\022\013mojo.db.s" +
      "ql\032\024mojo/lang/lang.proto\"\203\001\n\tPredicate\022+" +
      "\n\016start_position\030\001 \001(\0132\023.mojo.lang.Posit" +
      "ion\022)\n\014end_position\030\002 \001(\0132\023.mojo.lang.Po" +
      "sition\022\014\n\004kind\030\004 \001(\005\022\020\n\010implicit\030\005 \001(\010B\\" +
      "\n\030org.mojolang.mojo.db.sqlB\016PredicatePro" +
      "toP\001Z.github.com/mojo-lang/db/go/pkg/moj" +
      "o/db/sql;sqlb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.mojolang.mojo.lang.LangProto.getDescriptor(),
        });
    internal_static_mojo_db_sql_Predicate_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_mojo_db_sql_Predicate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_mojo_db_sql_Predicate_descriptor,
        new java.lang.String[] { "StartPosition", "EndPosition", "Kind", "Implicit", });
    org.mojolang.mojo.lang.LangProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
