// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/boolean_literal_expr.proto

package org.mojolang.mojo.db.sql;

/**
 * Protobuf enum {@code mojo.db.sql.Boolean}
 */
public enum Boolean
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>BOOLEAN_FALSE = 0;</code>
   */
  BOOLEAN_FALSE(0),
  /**
   * <code>BOOLEAN_TRUE = 1;</code>
   */
  BOOLEAN_TRUE(1),
  /**
   * <code>BOOLEAN_UNKNOWN = 2;</code>
   */
  BOOLEAN_UNKNOWN(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>BOOLEAN_FALSE = 0;</code>
   */
  public static final int BOOLEAN_FALSE_VALUE = 0;
  /**
   * <code>BOOLEAN_TRUE = 1;</code>
   */
  public static final int BOOLEAN_TRUE_VALUE = 1;
  /**
   * <code>BOOLEAN_UNKNOWN = 2;</code>
   */
  public static final int BOOLEAN_UNKNOWN_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Boolean valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Boolean forNumber(int value) {
    switch (value) {
      case 0: return BOOLEAN_FALSE;
      case 1: return BOOLEAN_TRUE;
      case 2: return BOOLEAN_UNKNOWN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Boolean>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Boolean> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Boolean>() {
          public Boolean findValueByNumber(int number) {
            return Boolean.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.mojolang.mojo.db.sql.BooleanLiteralExprProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Boolean[] VALUES = values();

  public static Boolean valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Boolean(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:mojo.db.sql.Boolean)
}
