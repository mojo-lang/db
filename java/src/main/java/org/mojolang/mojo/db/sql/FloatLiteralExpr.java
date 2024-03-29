// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/float_literal_expr.proto

package org.mojolang.mojo.db.sql;

/**
 * Protobuf type {@code mojo.db.sql.FloatLiteralExpr}
 */
public final class FloatLiteralExpr extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.db.sql.FloatLiteralExpr)
    FloatLiteralExprOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FloatLiteralExpr.newBuilder() to construct.
  private FloatLiteralExpr(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FloatLiteralExpr() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FloatLiteralExpr();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.db.sql.FloatLiteralExprProto.internal_static_mojo_db_sql_FloatLiteralExpr_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.db.sql.FloatLiteralExprProto.internal_static_mojo_db_sql_FloatLiteralExpr_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.db.sql.FloatLiteralExpr.class, org.mojolang.mojo.db.sql.FloatLiteralExpr.Builder.class);
  }

  public static final int START_POSITION_FIELD_NUMBER = 1;
  private org.mojolang.mojo.lang.Position startPosition_;
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return Whether the startPosition field is set.
   */
  @java.lang.Override
  public boolean hasStartPosition() {
    return startPosition_ != null;
  }
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   * @return The startPosition.
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.Position getStartPosition() {
    return startPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : startPosition_;
  }
  /**
   * <code>.mojo.lang.Position start_position = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.PositionOrBuilder getStartPositionOrBuilder() {
    return startPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : startPosition_;
  }

  public static final int END_POSITION_FIELD_NUMBER = 2;
  private org.mojolang.mojo.lang.Position endPosition_;
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return Whether the endPosition field is set.
   */
  @java.lang.Override
  public boolean hasEndPosition() {
    return endPosition_ != null;
  }
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   * @return The endPosition.
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.Position getEndPosition() {
    return endPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : endPosition_;
  }
  /**
   * <code>.mojo.lang.Position end_position = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.lang.PositionOrBuilder getEndPositionOrBuilder() {
    return endPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : endPosition_;
  }

  public static final int KIND_FIELD_NUMBER = 4;
  private int kind_ = 0;
  /**
   * <code>int32 kind = 4;</code>
   * @return The kind.
   */
  @java.lang.Override
  public int getKind() {
    return kind_;
  }

  public static final int IMPLICIT_FIELD_NUMBER = 5;
  private boolean implicit_ = false;
  /**
   * <code>bool implicit = 5;</code>
   * @return The implicit.
   */
  @java.lang.Override
  public boolean getImplicit() {
    return implicit_;
  }

  public static final int IS_NEGATIVE_FIELD_NUMBER = 20;
  private boolean isNegative_ = false;
  /**
   * <code>bool is_negative = 20;</code>
   * @return The isNegative.
   */
  @java.lang.Override
  public boolean getIsNegative() {
    return isNegative_;
  }

  public static final int VALUE_FIELD_NUMBER = 30;
  private double value_ = 0D;
  /**
   * <code>double value = 30;</code>
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
  }

  public static final int INTEGRAL_PART_FIELD_NUMBER = 35;
  private long integralPart_ = 0L;
  /**
   * <code>int64 integral_part = 35;</code>
   * @return The integralPart.
   */
  @java.lang.Override
  public long getIntegralPart() {
    return integralPart_;
  }

  public static final int FRACTIONAL_PART_FIELD_NUMBER = 36;
  private long fractionalPart_ = 0L;
  /**
   * <code>int64 fractional_part = 36;</code>
   * @return The fractionalPart.
   */
  @java.lang.Override
  public long getFractionalPart() {
    return fractionalPart_;
  }

  public static final int EXPONENT_PART_FIELD_NUMBER = 37;
  private long exponentPart_ = 0L;
  /**
   * <code>int64 exponent_part = 37;</code>
   * @return The exponentPart.
   */
  @java.lang.Override
  public long getExponentPart() {
    return exponentPart_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (startPosition_ != null) {
      output.writeMessage(1, getStartPosition());
    }
    if (endPosition_ != null) {
      output.writeMessage(2, getEndPosition());
    }
    if (kind_ != 0) {
      output.writeInt32(4, kind_);
    }
    if (implicit_ != false) {
      output.writeBool(5, implicit_);
    }
    if (isNegative_ != false) {
      output.writeBool(20, isNegative_);
    }
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      output.writeDouble(30, value_);
    }
    if (integralPart_ != 0L) {
      output.writeInt64(35, integralPart_);
    }
    if (fractionalPart_ != 0L) {
      output.writeInt64(36, fractionalPart_);
    }
    if (exponentPart_ != 0L) {
      output.writeInt64(37, exponentPart_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startPosition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStartPosition());
    }
    if (endPosition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEndPosition());
    }
    if (kind_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, kind_);
    }
    if (implicit_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, implicit_);
    }
    if (isNegative_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(20, isNegative_);
    }
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(30, value_);
    }
    if (integralPart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(35, integralPart_);
    }
    if (fractionalPart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(36, fractionalPart_);
    }
    if (exponentPart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(37, exponentPart_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.mojolang.mojo.db.sql.FloatLiteralExpr)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.db.sql.FloatLiteralExpr other = (org.mojolang.mojo.db.sql.FloatLiteralExpr) obj;

    if (hasStartPosition() != other.hasStartPosition()) return false;
    if (hasStartPosition()) {
      if (!getStartPosition()
          .equals(other.getStartPosition())) return false;
    }
    if (hasEndPosition() != other.hasEndPosition()) return false;
    if (hasEndPosition()) {
      if (!getEndPosition()
          .equals(other.getEndPosition())) return false;
    }
    if (getKind()
        != other.getKind()) return false;
    if (getImplicit()
        != other.getImplicit()) return false;
    if (getIsNegative()
        != other.getIsNegative()) return false;
    if (java.lang.Double.doubleToLongBits(getValue())
        != java.lang.Double.doubleToLongBits(
            other.getValue())) return false;
    if (getIntegralPart()
        != other.getIntegralPart()) return false;
    if (getFractionalPart()
        != other.getFractionalPart()) return false;
    if (getExponentPart()
        != other.getExponentPart()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStartPosition()) {
      hash = (37 * hash) + START_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getStartPosition().hashCode();
    }
    if (hasEndPosition()) {
      hash = (37 * hash) + END_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getEndPosition().hashCode();
    }
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind();
    hash = (37 * hash) + IMPLICIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getImplicit());
    hash = (37 * hash) + IS_NEGATIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsNegative());
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getValue()));
    hash = (37 * hash) + INTEGRAL_PART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIntegralPart());
    hash = (37 * hash) + FRACTIONAL_PART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFractionalPart());
    hash = (37 * hash) + EXPONENT_PART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExponentPart());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.FloatLiteralExpr parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.mojolang.mojo.db.sql.FloatLiteralExpr prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code mojo.db.sql.FloatLiteralExpr}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.db.sql.FloatLiteralExpr)
      org.mojolang.mojo.db.sql.FloatLiteralExprOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.db.sql.FloatLiteralExprProto.internal_static_mojo_db_sql_FloatLiteralExpr_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.db.sql.FloatLiteralExprProto.internal_static_mojo_db_sql_FloatLiteralExpr_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.db.sql.FloatLiteralExpr.class, org.mojolang.mojo.db.sql.FloatLiteralExpr.Builder.class);
    }

    // Construct using org.mojolang.mojo.db.sql.FloatLiteralExpr.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      startPosition_ = null;
      if (startPositionBuilder_ != null) {
        startPositionBuilder_.dispose();
        startPositionBuilder_ = null;
      }
      endPosition_ = null;
      if (endPositionBuilder_ != null) {
        endPositionBuilder_.dispose();
        endPositionBuilder_ = null;
      }
      kind_ = 0;
      implicit_ = false;
      isNegative_ = false;
      value_ = 0D;
      integralPart_ = 0L;
      fractionalPart_ = 0L;
      exponentPart_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.db.sql.FloatLiteralExprProto.internal_static_mojo_db_sql_FloatLiteralExpr_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.FloatLiteralExpr getDefaultInstanceForType() {
      return org.mojolang.mojo.db.sql.FloatLiteralExpr.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.FloatLiteralExpr build() {
      org.mojolang.mojo.db.sql.FloatLiteralExpr result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.FloatLiteralExpr buildPartial() {
      org.mojolang.mojo.db.sql.FloatLiteralExpr result = new org.mojolang.mojo.db.sql.FloatLiteralExpr(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.db.sql.FloatLiteralExpr result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startPosition_ = startPositionBuilder_ == null
            ? startPosition_
            : startPositionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.endPosition_ = endPositionBuilder_ == null
            ? endPosition_
            : endPositionBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.kind_ = kind_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.implicit_ = implicit_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.isNegative_ = isNegative_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.integralPart_ = integralPart_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.fractionalPart_ = fractionalPart_;
      }
      if (((from_bitField0_ & 0x00000100) != 0)) {
        result.exponentPart_ = exponentPart_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.mojolang.mojo.db.sql.FloatLiteralExpr) {
        return mergeFrom((org.mojolang.mojo.db.sql.FloatLiteralExpr)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.db.sql.FloatLiteralExpr other) {
      if (other == org.mojolang.mojo.db.sql.FloatLiteralExpr.getDefaultInstance()) return this;
      if (other.hasStartPosition()) {
        mergeStartPosition(other.getStartPosition());
      }
      if (other.hasEndPosition()) {
        mergeEndPosition(other.getEndPosition());
      }
      if (other.getKind() != 0) {
        setKind(other.getKind());
      }
      if (other.getImplicit() != false) {
        setImplicit(other.getImplicit());
      }
      if (other.getIsNegative() != false) {
        setIsNegative(other.getIsNegative());
      }
      if (other.getValue() != 0D) {
        setValue(other.getValue());
      }
      if (other.getIntegralPart() != 0L) {
        setIntegralPart(other.getIntegralPart());
      }
      if (other.getFractionalPart() != 0L) {
        setFractionalPart(other.getFractionalPart());
      }
      if (other.getExponentPart() != 0L) {
        setExponentPart(other.getExponentPart());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getStartPositionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getEndPositionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 32: {
              kind_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 40: {
              implicit_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 40
            case 160: {
              isNegative_ = input.readBool();
              bitField0_ |= 0x00000010;
              break;
            } // case 160
            case 241: {
              value_ = input.readDouble();
              bitField0_ |= 0x00000020;
              break;
            } // case 241
            case 280: {
              integralPart_ = input.readInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 280
            case 288: {
              fractionalPart_ = input.readInt64();
              bitField0_ |= 0x00000080;
              break;
            } // case 288
            case 296: {
              exponentPart_ = input.readInt64();
              bitField0_ |= 0x00000100;
              break;
            } // case 296
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.mojolang.mojo.lang.Position startPosition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> startPositionBuilder_;
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     * @return Whether the startPosition field is set.
     */
    public boolean hasStartPosition() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     * @return The startPosition.
     */
    public org.mojolang.mojo.lang.Position getStartPosition() {
      if (startPositionBuilder_ == null) {
        return startPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : startPosition_;
      } else {
        return startPositionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder setStartPosition(org.mojolang.mojo.lang.Position value) {
      if (startPositionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startPosition_ = value;
      } else {
        startPositionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder setStartPosition(
        org.mojolang.mojo.lang.Position.Builder builderForValue) {
      if (startPositionBuilder_ == null) {
        startPosition_ = builderForValue.build();
      } else {
        startPositionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder mergeStartPosition(org.mojolang.mojo.lang.Position value) {
      if (startPositionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          startPosition_ != null &&
          startPosition_ != org.mojolang.mojo.lang.Position.getDefaultInstance()) {
          getStartPositionBuilder().mergeFrom(value);
        } else {
          startPosition_ = value;
        }
      } else {
        startPositionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public Builder clearStartPosition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      startPosition_ = null;
      if (startPositionBuilder_ != null) {
        startPositionBuilder_.dispose();
        startPositionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public org.mojolang.mojo.lang.Position.Builder getStartPositionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getStartPositionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    public org.mojolang.mojo.lang.PositionOrBuilder getStartPositionOrBuilder() {
      if (startPositionBuilder_ != null) {
        return startPositionBuilder_.getMessageOrBuilder();
      } else {
        return startPosition_ == null ?
            org.mojolang.mojo.lang.Position.getDefaultInstance() : startPosition_;
      }
    }
    /**
     * <code>.mojo.lang.Position start_position = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> 
        getStartPositionFieldBuilder() {
      if (startPositionBuilder_ == null) {
        startPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder>(
                getStartPosition(),
                getParentForChildren(),
                isClean());
        startPosition_ = null;
      }
      return startPositionBuilder_;
    }

    private org.mojolang.mojo.lang.Position endPosition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> endPositionBuilder_;
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     * @return Whether the endPosition field is set.
     */
    public boolean hasEndPosition() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     * @return The endPosition.
     */
    public org.mojolang.mojo.lang.Position getEndPosition() {
      if (endPositionBuilder_ == null) {
        return endPosition_ == null ? org.mojolang.mojo.lang.Position.getDefaultInstance() : endPosition_;
      } else {
        return endPositionBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder setEndPosition(org.mojolang.mojo.lang.Position value) {
      if (endPositionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endPosition_ = value;
      } else {
        endPositionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder setEndPosition(
        org.mojolang.mojo.lang.Position.Builder builderForValue) {
      if (endPositionBuilder_ == null) {
        endPosition_ = builderForValue.build();
      } else {
        endPositionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder mergeEndPosition(org.mojolang.mojo.lang.Position value) {
      if (endPositionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          endPosition_ != null &&
          endPosition_ != org.mojolang.mojo.lang.Position.getDefaultInstance()) {
          getEndPositionBuilder().mergeFrom(value);
        } else {
          endPosition_ = value;
        }
      } else {
        endPositionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public Builder clearEndPosition() {
      bitField0_ = (bitField0_ & ~0x00000002);
      endPosition_ = null;
      if (endPositionBuilder_ != null) {
        endPositionBuilder_.dispose();
        endPositionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public org.mojolang.mojo.lang.Position.Builder getEndPositionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEndPositionFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    public org.mojolang.mojo.lang.PositionOrBuilder getEndPositionOrBuilder() {
      if (endPositionBuilder_ != null) {
        return endPositionBuilder_.getMessageOrBuilder();
      } else {
        return endPosition_ == null ?
            org.mojolang.mojo.lang.Position.getDefaultInstance() : endPosition_;
      }
    }
    /**
     * <code>.mojo.lang.Position end_position = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder> 
        getEndPositionFieldBuilder() {
      if (endPositionBuilder_ == null) {
        endPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.lang.Position, org.mojolang.mojo.lang.Position.Builder, org.mojolang.mojo.lang.PositionOrBuilder>(
                getEndPosition(),
                getParentForChildren(),
                isClean());
        endPosition_ = null;
      }
      return endPositionBuilder_;
    }

    private int kind_ ;
    /**
     * <code>int32 kind = 4;</code>
     * @return The kind.
     */
    @java.lang.Override
    public int getKind() {
      return kind_;
    }
    /**
     * <code>int32 kind = 4;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(int value) {
      
      kind_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 kind = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000004);
      kind_ = 0;
      onChanged();
      return this;
    }

    private boolean implicit_ ;
    /**
     * <code>bool implicit = 5;</code>
     * @return The implicit.
     */
    @java.lang.Override
    public boolean getImplicit() {
      return implicit_;
    }
    /**
     * <code>bool implicit = 5;</code>
     * @param value The implicit to set.
     * @return This builder for chaining.
     */
    public Builder setImplicit(boolean value) {
      
      implicit_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bool implicit = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearImplicit() {
      bitField0_ = (bitField0_ & ~0x00000008);
      implicit_ = false;
      onChanged();
      return this;
    }

    private boolean isNegative_ ;
    /**
     * <code>bool is_negative = 20;</code>
     * @return The isNegative.
     */
    @java.lang.Override
    public boolean getIsNegative() {
      return isNegative_;
    }
    /**
     * <code>bool is_negative = 20;</code>
     * @param value The isNegative to set.
     * @return This builder for chaining.
     */
    public Builder setIsNegative(boolean value) {
      
      isNegative_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_negative = 20;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsNegative() {
      bitField0_ = (bitField0_ & ~0x00000010);
      isNegative_ = false;
      onChanged();
      return this;
    }

    private double value_ ;
    /**
     * <code>double value = 30;</code>
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }
    /**
     * <code>double value = 30;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {
      
      value_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>double value = 30;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000020);
      value_ = 0D;
      onChanged();
      return this;
    }

    private long integralPart_ ;
    /**
     * <code>int64 integral_part = 35;</code>
     * @return The integralPart.
     */
    @java.lang.Override
    public long getIntegralPart() {
      return integralPart_;
    }
    /**
     * <code>int64 integral_part = 35;</code>
     * @param value The integralPart to set.
     * @return This builder for chaining.
     */
    public Builder setIntegralPart(long value) {
      
      integralPart_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>int64 integral_part = 35;</code>
     * @return This builder for chaining.
     */
    public Builder clearIntegralPart() {
      bitField0_ = (bitField0_ & ~0x00000040);
      integralPart_ = 0L;
      onChanged();
      return this;
    }

    private long fractionalPart_ ;
    /**
     * <code>int64 fractional_part = 36;</code>
     * @return The fractionalPart.
     */
    @java.lang.Override
    public long getFractionalPart() {
      return fractionalPart_;
    }
    /**
     * <code>int64 fractional_part = 36;</code>
     * @param value The fractionalPart to set.
     * @return This builder for chaining.
     */
    public Builder setFractionalPart(long value) {
      
      fractionalPart_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <code>int64 fractional_part = 36;</code>
     * @return This builder for chaining.
     */
    public Builder clearFractionalPart() {
      bitField0_ = (bitField0_ & ~0x00000080);
      fractionalPart_ = 0L;
      onChanged();
      return this;
    }

    private long exponentPart_ ;
    /**
     * <code>int64 exponent_part = 37;</code>
     * @return The exponentPart.
     */
    @java.lang.Override
    public long getExponentPart() {
      return exponentPart_;
    }
    /**
     * <code>int64 exponent_part = 37;</code>
     * @param value The exponentPart to set.
     * @return This builder for chaining.
     */
    public Builder setExponentPart(long value) {
      
      exponentPart_ = value;
      bitField0_ |= 0x00000100;
      onChanged();
      return this;
    }
    /**
     * <code>int64 exponent_part = 37;</code>
     * @return This builder for chaining.
     */
    public Builder clearExponentPart() {
      bitField0_ = (bitField0_ & ~0x00000100);
      exponentPart_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:mojo.db.sql.FloatLiteralExpr)
  }

  // @@protoc_insertion_point(class_scope:mojo.db.sql.FloatLiteralExpr)
  private static final org.mojolang.mojo.db.sql.FloatLiteralExpr DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.db.sql.FloatLiteralExpr();
  }

  public static org.mojolang.mojo.db.sql.FloatLiteralExpr getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FloatLiteralExpr>
      PARSER = new com.google.protobuf.AbstractParser<FloatLiteralExpr>() {
    @java.lang.Override
    public FloatLiteralExpr parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FloatLiteralExpr> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FloatLiteralExpr> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.db.sql.FloatLiteralExpr getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

