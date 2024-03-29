// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/delete_time.proto

package org.mojolang.mojo.db;

/**
 * Protobuf type {@code mojo.db.DeleteTime}
 */
public final class DeleteTime extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.db.DeleteTime)
    DeleteTimeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteTime.newBuilder() to construct.
  private DeleteTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteTime() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteTime();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.db.DeleteTimeProto.internal_static_mojo_db_DeleteTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.db.DeleteTimeProto.internal_static_mojo_db_DeleteTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.db.DeleteTime.class, org.mojolang.mojo.db.DeleteTime.Builder.class);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  private org.mojolang.mojo.core.Timestamp val_;
  /**
   * <code>.mojo.core.Timestamp val = 1;</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return val_ != null;
  }
  /**
   * <code>.mojo.core.Timestamp val = 1;</code>
   * @return The val.
   */
  @java.lang.Override
  public org.mojolang.mojo.core.Timestamp getVal() {
    return val_ == null ? org.mojolang.mojo.core.Timestamp.getDefaultInstance() : val_;
  }
  /**
   * <code>.mojo.core.Timestamp val = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.core.TimestampOrBuilder getValOrBuilder() {
    return val_ == null ? org.mojolang.mojo.core.Timestamp.getDefaultInstance() : val_;
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
    if (val_ != null) {
      output.writeMessage(1, getVal());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (val_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVal());
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
    if (!(obj instanceof org.mojolang.mojo.db.DeleteTime)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.db.DeleteTime other = (org.mojolang.mojo.db.DeleteTime) obj;

    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (!getVal()
          .equals(other.getVal())) return false;
    }
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
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.db.DeleteTime parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.DeleteTime parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.DeleteTime parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.DeleteTime parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.db.DeleteTime prototype) {
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
   * Protobuf type {@code mojo.db.DeleteTime}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.db.DeleteTime)
      org.mojolang.mojo.db.DeleteTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.db.DeleteTimeProto.internal_static_mojo_db_DeleteTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.db.DeleteTimeProto.internal_static_mojo_db_DeleteTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.db.DeleteTime.class, org.mojolang.mojo.db.DeleteTime.Builder.class);
    }

    // Construct using org.mojolang.mojo.db.DeleteTime.newBuilder()
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
      val_ = null;
      if (valBuilder_ != null) {
        valBuilder_.dispose();
        valBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.db.DeleteTimeProto.internal_static_mojo_db_DeleteTime_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.DeleteTime getDefaultInstanceForType() {
      return org.mojolang.mojo.db.DeleteTime.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.db.DeleteTime build() {
      org.mojolang.mojo.db.DeleteTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.DeleteTime buildPartial() {
      org.mojolang.mojo.db.DeleteTime result = new org.mojolang.mojo.db.DeleteTime(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.mojolang.mojo.db.DeleteTime result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = valBuilder_ == null
            ? val_
            : valBuilder_.build();
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
      if (other instanceof org.mojolang.mojo.db.DeleteTime) {
        return mergeFrom((org.mojolang.mojo.db.DeleteTime)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.db.DeleteTime other) {
      if (other == org.mojolang.mojo.db.DeleteTime.getDefaultInstance()) return this;
      if (other.hasVal()) {
        mergeVal(other.getVal());
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
                  getValFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private org.mojolang.mojo.core.Timestamp val_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Timestamp, org.mojolang.mojo.core.Timestamp.Builder, org.mojolang.mojo.core.TimestampOrBuilder> valBuilder_;
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     * @return The val.
     */
    public org.mojolang.mojo.core.Timestamp getVal() {
      if (valBuilder_ == null) {
        return val_ == null ? org.mojolang.mojo.core.Timestamp.getDefaultInstance() : val_;
      } else {
        return valBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     */
    public Builder setVal(org.mojolang.mojo.core.Timestamp value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        val_ = value;
      } else {
        valBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     */
    public Builder setVal(
        org.mojolang.mojo.core.Timestamp.Builder builderForValue) {
      if (valBuilder_ == null) {
        val_ = builderForValue.build();
      } else {
        valBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     */
    public Builder mergeVal(org.mojolang.mojo.core.Timestamp value) {
      if (valBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          val_ != null &&
          val_ != org.mojolang.mojo.core.Timestamp.getDefaultInstance()) {
          getValBuilder().mergeFrom(value);
        } else {
          val_ = value;
        }
      } else {
        valBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     */
    public Builder clearVal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      val_ = null;
      if (valBuilder_ != null) {
        valBuilder_.dispose();
        valBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     */
    public org.mojolang.mojo.core.Timestamp.Builder getValBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getValFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     */
    public org.mojolang.mojo.core.TimestampOrBuilder getValOrBuilder() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilder();
      } else {
        return val_ == null ?
            org.mojolang.mojo.core.Timestamp.getDefaultInstance() : val_;
      }
    }
    /**
     * <code>.mojo.core.Timestamp val = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.core.Timestamp, org.mojolang.mojo.core.Timestamp.Builder, org.mojolang.mojo.core.TimestampOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.core.Timestamp, org.mojolang.mojo.core.Timestamp.Builder, org.mojolang.mojo.core.TimestampOrBuilder>(
                getVal(),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.db.DeleteTime)
  }

  // @@protoc_insertion_point(class_scope:mojo.db.DeleteTime)
  private static final org.mojolang.mojo.db.DeleteTime DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.db.DeleteTime();
  }

  public static org.mojolang.mojo.db.DeleteTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteTime>
      PARSER = new com.google.protobuf.AbstractParser<DeleteTime>() {
    @java.lang.Override
    public DeleteTime parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.db.DeleteTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

