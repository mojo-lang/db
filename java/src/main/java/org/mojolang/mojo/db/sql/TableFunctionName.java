// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/sql.proto

package org.mojolang.mojo.db.sql;

/**
 * Protobuf type {@code mojo.db.sql.TableFunctionName}
 */
public final class TableFunctionName extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.db.sql.TableFunctionName)
    TableFunctionNameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableFunctionName.newBuilder() to construct.
  private TableFunctionName(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableFunctionName() {
    schemaName_ = "";
    name_ = "";
    arguments_ = java.util.Collections.emptyList();
    alias_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TableFunctionName();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_TableFunctionName_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_TableFunctionName_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.db.sql.TableFunctionName.class, org.mojolang.mojo.db.sql.TableFunctionName.Builder.class);
  }

  public static final int SCHEMA_NAME_FIELD_NUMBER = 10;
  @SuppressWarnings("serial")
  private volatile java.lang.Object schemaName_ = "";
  /**
   * <code>string schema_name = 10;</code>
   * @return The schemaName.
   */
  @java.lang.Override
  public java.lang.String getSchemaName() {
    java.lang.Object ref = schemaName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schemaName_ = s;
      return s;
    }
  }
  /**
   * <code>string schema_name = 10;</code>
   * @return The bytes for schemaName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSchemaNameBytes() {
    java.lang.Object ref = schemaName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      schemaName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 13;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 13;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 13;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ARGUMENTS_FIELD_NUMBER = 14;
  @SuppressWarnings("serial")
  private java.util.List<org.mojolang.mojo.db.sql.Expression> arguments_;
  /**
   * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.db.sql.Expression> getArgumentsList() {
    return arguments_;
  }
  /**
   * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.db.sql.ExpressionOrBuilder> 
      getArgumentsOrBuilderList() {
    return arguments_;
  }
  /**
   * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
   */
  @java.lang.Override
  public int getArgumentsCount() {
    return arguments_.size();
  }
  /**
   * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.db.sql.Expression getArguments(int index) {
    return arguments_.get(index);
  }
  /**
   * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.db.sql.ExpressionOrBuilder getArgumentsOrBuilder(
      int index) {
    return arguments_.get(index);
  }

  public static final int ALIAS_FIELD_NUMBER = 15;
  @SuppressWarnings("serial")
  private volatile java.lang.Object alias_ = "";
  /**
   * <code>string alias = 15;</code>
   * @return The alias.
   */
  @java.lang.Override
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <code>string alias = 15;</code>
   * @return The bytes for alias.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schemaName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, schemaName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 13, name_);
    }
    for (int i = 0; i < arguments_.size(); i++) {
      output.writeMessage(14, arguments_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 15, alias_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schemaName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, schemaName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(13, name_);
    }
    for (int i = 0; i < arguments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(14, arguments_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alias_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, alias_);
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
    if (!(obj instanceof org.mojolang.mojo.db.sql.TableFunctionName)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.db.sql.TableFunctionName other = (org.mojolang.mojo.db.sql.TableFunctionName) obj;

    if (!getSchemaName()
        .equals(other.getSchemaName())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getArgumentsList()
        .equals(other.getArgumentsList())) return false;
    if (!getAlias()
        .equals(other.getAlias())) return false;
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
    hash = (37 * hash) + SCHEMA_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSchemaName().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getArgumentsCount() > 0) {
      hash = (37 * hash) + ARGUMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getArgumentsList().hashCode();
    }
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.TableFunctionName parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.db.sql.TableFunctionName prototype) {
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
   * Protobuf type {@code mojo.db.sql.TableFunctionName}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.db.sql.TableFunctionName)
      org.mojolang.mojo.db.sql.TableFunctionNameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_TableFunctionName_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_TableFunctionName_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.db.sql.TableFunctionName.class, org.mojolang.mojo.db.sql.TableFunctionName.Builder.class);
    }

    // Construct using org.mojolang.mojo.db.sql.TableFunctionName.newBuilder()
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
      schemaName_ = "";
      name_ = "";
      if (argumentsBuilder_ == null) {
        arguments_ = java.util.Collections.emptyList();
      } else {
        arguments_ = null;
        argumentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      alias_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.db.sql.SqlProto.internal_static_mojo_db_sql_TableFunctionName_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.TableFunctionName getDefaultInstanceForType() {
      return org.mojolang.mojo.db.sql.TableFunctionName.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.TableFunctionName build() {
      org.mojolang.mojo.db.sql.TableFunctionName result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.TableFunctionName buildPartial() {
      org.mojolang.mojo.db.sql.TableFunctionName result = new org.mojolang.mojo.db.sql.TableFunctionName(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.mojolang.mojo.db.sql.TableFunctionName result) {
      if (argumentsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          arguments_ = java.util.Collections.unmodifiableList(arguments_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.arguments_ = arguments_;
      } else {
        result.arguments_ = argumentsBuilder_.build();
      }
    }

    private void buildPartial0(org.mojolang.mojo.db.sql.TableFunctionName result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schemaName_ = schemaName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.alias_ = alias_;
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
      if (other instanceof org.mojolang.mojo.db.sql.TableFunctionName) {
        return mergeFrom((org.mojolang.mojo.db.sql.TableFunctionName)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.db.sql.TableFunctionName other) {
      if (other == org.mojolang.mojo.db.sql.TableFunctionName.getDefaultInstance()) return this;
      if (!other.getSchemaName().isEmpty()) {
        schemaName_ = other.schemaName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (argumentsBuilder_ == null) {
        if (!other.arguments_.isEmpty()) {
          if (arguments_.isEmpty()) {
            arguments_ = other.arguments_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureArgumentsIsMutable();
            arguments_.addAll(other.arguments_);
          }
          onChanged();
        }
      } else {
        if (!other.arguments_.isEmpty()) {
          if (argumentsBuilder_.isEmpty()) {
            argumentsBuilder_.dispose();
            argumentsBuilder_ = null;
            arguments_ = other.arguments_;
            bitField0_ = (bitField0_ & ~0x00000004);
            argumentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getArgumentsFieldBuilder() : null;
          } else {
            argumentsBuilder_.addAllMessages(other.arguments_);
          }
        }
      }
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        bitField0_ |= 0x00000008;
        onChanged();
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
            case 82: {
              schemaName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 82
            case 106: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 106
            case 114: {
              org.mojolang.mojo.db.sql.Expression m =
                  input.readMessage(
                      org.mojolang.mojo.db.sql.Expression.parser(),
                      extensionRegistry);
              if (argumentsBuilder_ == null) {
                ensureArgumentsIsMutable();
                arguments_.add(m);
              } else {
                argumentsBuilder_.addMessage(m);
              }
              break;
            } // case 114
            case 122: {
              alias_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 122
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

    private java.lang.Object schemaName_ = "";
    /**
     * <code>string schema_name = 10;</code>
     * @return The schemaName.
     */
    public java.lang.String getSchemaName() {
      java.lang.Object ref = schemaName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schemaName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string schema_name = 10;</code>
     * @return The bytes for schemaName.
     */
    public com.google.protobuf.ByteString
        getSchemaNameBytes() {
      java.lang.Object ref = schemaName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schemaName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string schema_name = 10;</code>
     * @param value The schemaName to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      schemaName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string schema_name = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearSchemaName() {
      schemaName_ = getDefaultInstance().getSchemaName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string schema_name = 10;</code>
     * @param value The bytes for schemaName to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      schemaName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 13;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 13;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 13;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 13;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<org.mojolang.mojo.db.sql.Expression> arguments_ =
      java.util.Collections.emptyList();
    private void ensureArgumentsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        arguments_ = new java.util.ArrayList<org.mojolang.mojo.db.sql.Expression>(arguments_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.db.sql.Expression, org.mojolang.mojo.db.sql.Expression.Builder, org.mojolang.mojo.db.sql.ExpressionOrBuilder> argumentsBuilder_;

    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public java.util.List<org.mojolang.mojo.db.sql.Expression> getArgumentsList() {
      if (argumentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(arguments_);
      } else {
        return argumentsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public int getArgumentsCount() {
      if (argumentsBuilder_ == null) {
        return arguments_.size();
      } else {
        return argumentsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public org.mojolang.mojo.db.sql.Expression getArguments(int index) {
      if (argumentsBuilder_ == null) {
        return arguments_.get(index);
      } else {
        return argumentsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder setArguments(
        int index, org.mojolang.mojo.db.sql.Expression value) {
      if (argumentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgumentsIsMutable();
        arguments_.set(index, value);
        onChanged();
      } else {
        argumentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder setArguments(
        int index, org.mojolang.mojo.db.sql.Expression.Builder builderForValue) {
      if (argumentsBuilder_ == null) {
        ensureArgumentsIsMutable();
        arguments_.set(index, builderForValue.build());
        onChanged();
      } else {
        argumentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder addArguments(org.mojolang.mojo.db.sql.Expression value) {
      if (argumentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgumentsIsMutable();
        arguments_.add(value);
        onChanged();
      } else {
        argumentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder addArguments(
        int index, org.mojolang.mojo.db.sql.Expression value) {
      if (argumentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArgumentsIsMutable();
        arguments_.add(index, value);
        onChanged();
      } else {
        argumentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder addArguments(
        org.mojolang.mojo.db.sql.Expression.Builder builderForValue) {
      if (argumentsBuilder_ == null) {
        ensureArgumentsIsMutable();
        arguments_.add(builderForValue.build());
        onChanged();
      } else {
        argumentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder addArguments(
        int index, org.mojolang.mojo.db.sql.Expression.Builder builderForValue) {
      if (argumentsBuilder_ == null) {
        ensureArgumentsIsMutable();
        arguments_.add(index, builderForValue.build());
        onChanged();
      } else {
        argumentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder addAllArguments(
        java.lang.Iterable<? extends org.mojolang.mojo.db.sql.Expression> values) {
      if (argumentsBuilder_ == null) {
        ensureArgumentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, arguments_);
        onChanged();
      } else {
        argumentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder clearArguments() {
      if (argumentsBuilder_ == null) {
        arguments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        argumentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public Builder removeArguments(int index) {
      if (argumentsBuilder_ == null) {
        ensureArgumentsIsMutable();
        arguments_.remove(index);
        onChanged();
      } else {
        argumentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public org.mojolang.mojo.db.sql.Expression.Builder getArgumentsBuilder(
        int index) {
      return getArgumentsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public org.mojolang.mojo.db.sql.ExpressionOrBuilder getArgumentsOrBuilder(
        int index) {
      if (argumentsBuilder_ == null) {
        return arguments_.get(index);  } else {
        return argumentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.db.sql.ExpressionOrBuilder> 
         getArgumentsOrBuilderList() {
      if (argumentsBuilder_ != null) {
        return argumentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(arguments_);
      }
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public org.mojolang.mojo.db.sql.Expression.Builder addArgumentsBuilder() {
      return getArgumentsFieldBuilder().addBuilder(
          org.mojolang.mojo.db.sql.Expression.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public org.mojolang.mojo.db.sql.Expression.Builder addArgumentsBuilder(
        int index) {
      return getArgumentsFieldBuilder().addBuilder(
          index, org.mojolang.mojo.db.sql.Expression.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.db.sql.Expression arguments = 14;</code>
     */
    public java.util.List<org.mojolang.mojo.db.sql.Expression.Builder> 
         getArgumentsBuilderList() {
      return getArgumentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.db.sql.Expression, org.mojolang.mojo.db.sql.Expression.Builder, org.mojolang.mojo.db.sql.ExpressionOrBuilder> 
        getArgumentsFieldBuilder() {
      if (argumentsBuilder_ == null) {
        argumentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.db.sql.Expression, org.mojolang.mojo.db.sql.Expression.Builder, org.mojolang.mojo.db.sql.ExpressionOrBuilder>(
                arguments_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        arguments_ = null;
      }
      return argumentsBuilder_;
    }

    private java.lang.Object alias_ = "";
    /**
     * <code>string alias = 15;</code>
     * @return The alias.
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alias = 15;</code>
     * @return The bytes for alias.
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alias = 15;</code>
     * @param value The alias to set.
     * @return This builder for chaining.
     */
    public Builder setAlias(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      alias_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlias() {
      alias_ = getDefaultInstance().getAlias();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 15;</code>
     * @param value The bytes for alias to set.
     * @return This builder for chaining.
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      alias_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:mojo.db.sql.TableFunctionName)
  }

  // @@protoc_insertion_point(class_scope:mojo.db.sql.TableFunctionName)
  private static final org.mojolang.mojo.db.sql.TableFunctionName DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.db.sql.TableFunctionName();
  }

  public static org.mojolang.mojo.db.sql.TableFunctionName getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableFunctionName>
      PARSER = new com.google.protobuf.AbstractParser<TableFunctionName>() {
    @java.lang.Override
    public TableFunctionName parsePartialFrom(
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

  public static com.google.protobuf.Parser<TableFunctionName> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableFunctionName> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.db.sql.TableFunctionName getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

