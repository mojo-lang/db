// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mojo/db/sql/table_definition.proto

package org.mojolang.mojo.db.sql;

/**
 * Protobuf type {@code mojo.db.sql.TableDefinition}
 */
public final class TableDefinition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:mojo.db.sql.TableDefinition)
    TableDefinitionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TableDefinition.newBuilder() to construct.
  private TableDefinition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TableDefinition() {
    columns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TableDefinition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.mojolang.mojo.db.sql.TableDefinitionProto.internal_static_mojo_db_sql_TableDefinition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.mojolang.mojo.db.sql.TableDefinitionProto.internal_static_mojo_db_sql_TableDefinition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.mojolang.mojo.db.sql.TableDefinition.class, org.mojolang.mojo.db.sql.TableDefinition.Builder.class);
  }

  public static final int COLUMNS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.mojolang.mojo.db.sql.ColumnDefinition> columns_;
  /**
   * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.mojolang.mojo.db.sql.ColumnDefinition> getColumnsList() {
    return columns_;
  }
  /**
   * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.mojolang.mojo.db.sql.ColumnDefinitionOrBuilder> 
      getColumnsOrBuilderList() {
    return columns_;
  }
  /**
   * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
   */
  @java.lang.Override
  public int getColumnsCount() {
    return columns_.size();
  }
  /**
   * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.db.sql.ColumnDefinition getColumns(int index) {
    return columns_.get(index);
  }
  /**
   * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.db.sql.ColumnDefinitionOrBuilder getColumnsOrBuilder(
      int index) {
    return columns_.get(index);
  }

  public static final int TABLE_CONSTRAINT_FIELD_NUMBER = 2;
  private org.mojolang.mojo.db.sql.TableConstraint tableConstraint_;
  /**
   * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
   * @return Whether the tableConstraint field is set.
   */
  @java.lang.Override
  public boolean hasTableConstraint() {
    return tableConstraint_ != null;
  }
  /**
   * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
   * @return The tableConstraint.
   */
  @java.lang.Override
  public org.mojolang.mojo.db.sql.TableConstraint getTableConstraint() {
    return tableConstraint_ == null ? org.mojolang.mojo.db.sql.TableConstraint.getDefaultInstance() : tableConstraint_;
  }
  /**
   * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
   */
  @java.lang.Override
  public org.mojolang.mojo.db.sql.TableConstraintOrBuilder getTableConstraintOrBuilder() {
    return tableConstraint_ == null ? org.mojolang.mojo.db.sql.TableConstraint.getDefaultInstance() : tableConstraint_;
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
    for (int i = 0; i < columns_.size(); i++) {
      output.writeMessage(1, columns_.get(i));
    }
    if (tableConstraint_ != null) {
      output.writeMessage(2, getTableConstraint());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < columns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, columns_.get(i));
    }
    if (tableConstraint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTableConstraint());
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
    if (!(obj instanceof org.mojolang.mojo.db.sql.TableDefinition)) {
      return super.equals(obj);
    }
    org.mojolang.mojo.db.sql.TableDefinition other = (org.mojolang.mojo.db.sql.TableDefinition) obj;

    if (!getColumnsList()
        .equals(other.getColumnsList())) return false;
    if (hasTableConstraint() != other.hasTableConstraint()) return false;
    if (hasTableConstraint()) {
      if (!getTableConstraint()
          .equals(other.getTableConstraint())) return false;
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
    if (getColumnsCount() > 0) {
      hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getColumnsList().hashCode();
    }
    if (hasTableConstraint()) {
      hash = (37 * hash) + TABLE_CONSTRAINT_FIELD_NUMBER;
      hash = (53 * hash) + getTableConstraint().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.mojolang.mojo.db.sql.TableDefinition parseFrom(
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
  public static Builder newBuilder(org.mojolang.mojo.db.sql.TableDefinition prototype) {
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
   * Protobuf type {@code mojo.db.sql.TableDefinition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:mojo.db.sql.TableDefinition)
      org.mojolang.mojo.db.sql.TableDefinitionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.mojolang.mojo.db.sql.TableDefinitionProto.internal_static_mojo_db_sql_TableDefinition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.mojolang.mojo.db.sql.TableDefinitionProto.internal_static_mojo_db_sql_TableDefinition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.mojolang.mojo.db.sql.TableDefinition.class, org.mojolang.mojo.db.sql.TableDefinition.Builder.class);
    }

    // Construct using org.mojolang.mojo.db.sql.TableDefinition.newBuilder()
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
      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
      } else {
        columns_ = null;
        columnsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      tableConstraint_ = null;
      if (tableConstraintBuilder_ != null) {
        tableConstraintBuilder_.dispose();
        tableConstraintBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.mojolang.mojo.db.sql.TableDefinitionProto.internal_static_mojo_db_sql_TableDefinition_descriptor;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.TableDefinition getDefaultInstanceForType() {
      return org.mojolang.mojo.db.sql.TableDefinition.getDefaultInstance();
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.TableDefinition build() {
      org.mojolang.mojo.db.sql.TableDefinition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.mojolang.mojo.db.sql.TableDefinition buildPartial() {
      org.mojolang.mojo.db.sql.TableDefinition result = new org.mojolang.mojo.db.sql.TableDefinition(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.mojolang.mojo.db.sql.TableDefinition result) {
      if (columnsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          columns_ = java.util.Collections.unmodifiableList(columns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.columns_ = columns_;
      } else {
        result.columns_ = columnsBuilder_.build();
      }
    }

    private void buildPartial0(org.mojolang.mojo.db.sql.TableDefinition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tableConstraint_ = tableConstraintBuilder_ == null
            ? tableConstraint_
            : tableConstraintBuilder_.build();
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
      if (other instanceof org.mojolang.mojo.db.sql.TableDefinition) {
        return mergeFrom((org.mojolang.mojo.db.sql.TableDefinition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.mojolang.mojo.db.sql.TableDefinition other) {
      if (other == org.mojolang.mojo.db.sql.TableDefinition.getDefaultInstance()) return this;
      if (columnsBuilder_ == null) {
        if (!other.columns_.isEmpty()) {
          if (columns_.isEmpty()) {
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnsIsMutable();
            columns_.addAll(other.columns_);
          }
          onChanged();
        }
      } else {
        if (!other.columns_.isEmpty()) {
          if (columnsBuilder_.isEmpty()) {
            columnsBuilder_.dispose();
            columnsBuilder_ = null;
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            columnsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnsFieldBuilder() : null;
          } else {
            columnsBuilder_.addAllMessages(other.columns_);
          }
        }
      }
      if (other.hasTableConstraint()) {
        mergeTableConstraint(other.getTableConstraint());
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
              org.mojolang.mojo.db.sql.ColumnDefinition m =
                  input.readMessage(
                      org.mojolang.mojo.db.sql.ColumnDefinition.parser(),
                      extensionRegistry);
              if (columnsBuilder_ == null) {
                ensureColumnsIsMutable();
                columns_.add(m);
              } else {
                columnsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTableConstraintFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.util.List<org.mojolang.mojo.db.sql.ColumnDefinition> columns_ =
      java.util.Collections.emptyList();
    private void ensureColumnsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        columns_ = new java.util.ArrayList<org.mojolang.mojo.db.sql.ColumnDefinition>(columns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.db.sql.ColumnDefinition, org.mojolang.mojo.db.sql.ColumnDefinition.Builder, org.mojolang.mojo.db.sql.ColumnDefinitionOrBuilder> columnsBuilder_;

    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public java.util.List<org.mojolang.mojo.db.sql.ColumnDefinition> getColumnsList() {
      if (columnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(columns_);
      } else {
        return columnsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public int getColumnsCount() {
      if (columnsBuilder_ == null) {
        return columns_.size();
      } else {
        return columnsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public org.mojolang.mojo.db.sql.ColumnDefinition getColumns(int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);
      } else {
        return columnsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder setColumns(
        int index, org.mojolang.mojo.db.sql.ColumnDefinition value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.set(index, value);
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder setColumns(
        int index, org.mojolang.mojo.db.sql.ColumnDefinition.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder addColumns(org.mojolang.mojo.db.sql.ColumnDefinition value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder addColumns(
        int index, org.mojolang.mojo.db.sql.ColumnDefinition value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(index, value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder addColumns(
        org.mojolang.mojo.db.sql.ColumnDefinition.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder addColumns(
        int index, org.mojolang.mojo.db.sql.ColumnDefinition.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder addAllColumns(
        java.lang.Iterable<? extends org.mojolang.mojo.db.sql.ColumnDefinition> values) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columns_);
        onChanged();
      } else {
        columnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder clearColumns() {
      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        columnsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public Builder removeColumns(int index) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.remove(index);
        onChanged();
      } else {
        columnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public org.mojolang.mojo.db.sql.ColumnDefinition.Builder getColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public org.mojolang.mojo.db.sql.ColumnDefinitionOrBuilder getColumnsOrBuilder(
        int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);  } else {
        return columnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public java.util.List<? extends org.mojolang.mojo.db.sql.ColumnDefinitionOrBuilder> 
         getColumnsOrBuilderList() {
      if (columnsBuilder_ != null) {
        return columnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(columns_);
      }
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public org.mojolang.mojo.db.sql.ColumnDefinition.Builder addColumnsBuilder() {
      return getColumnsFieldBuilder().addBuilder(
          org.mojolang.mojo.db.sql.ColumnDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public org.mojolang.mojo.db.sql.ColumnDefinition.Builder addColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().addBuilder(
          index, org.mojolang.mojo.db.sql.ColumnDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .mojo.db.sql.ColumnDefinition columns = 1;</code>
     */
    public java.util.List<org.mojolang.mojo.db.sql.ColumnDefinition.Builder> 
         getColumnsBuilderList() {
      return getColumnsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.mojolang.mojo.db.sql.ColumnDefinition, org.mojolang.mojo.db.sql.ColumnDefinition.Builder, org.mojolang.mojo.db.sql.ColumnDefinitionOrBuilder> 
        getColumnsFieldBuilder() {
      if (columnsBuilder_ == null) {
        columnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.mojolang.mojo.db.sql.ColumnDefinition, org.mojolang.mojo.db.sql.ColumnDefinition.Builder, org.mojolang.mojo.db.sql.ColumnDefinitionOrBuilder>(
                columns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        columns_ = null;
      }
      return columnsBuilder_;
    }

    private org.mojolang.mojo.db.sql.TableConstraint tableConstraint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.db.sql.TableConstraint, org.mojolang.mojo.db.sql.TableConstraint.Builder, org.mojolang.mojo.db.sql.TableConstraintOrBuilder> tableConstraintBuilder_;
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     * @return Whether the tableConstraint field is set.
     */
    public boolean hasTableConstraint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     * @return The tableConstraint.
     */
    public org.mojolang.mojo.db.sql.TableConstraint getTableConstraint() {
      if (tableConstraintBuilder_ == null) {
        return tableConstraint_ == null ? org.mojolang.mojo.db.sql.TableConstraint.getDefaultInstance() : tableConstraint_;
      } else {
        return tableConstraintBuilder_.getMessage();
      }
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     */
    public Builder setTableConstraint(org.mojolang.mojo.db.sql.TableConstraint value) {
      if (tableConstraintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableConstraint_ = value;
      } else {
        tableConstraintBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     */
    public Builder setTableConstraint(
        org.mojolang.mojo.db.sql.TableConstraint.Builder builderForValue) {
      if (tableConstraintBuilder_ == null) {
        tableConstraint_ = builderForValue.build();
      } else {
        tableConstraintBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     */
    public Builder mergeTableConstraint(org.mojolang.mojo.db.sql.TableConstraint value) {
      if (tableConstraintBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          tableConstraint_ != null &&
          tableConstraint_ != org.mojolang.mojo.db.sql.TableConstraint.getDefaultInstance()) {
          getTableConstraintBuilder().mergeFrom(value);
        } else {
          tableConstraint_ = value;
        }
      } else {
        tableConstraintBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     */
    public Builder clearTableConstraint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      tableConstraint_ = null;
      if (tableConstraintBuilder_ != null) {
        tableConstraintBuilder_.dispose();
        tableConstraintBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     */
    public org.mojolang.mojo.db.sql.TableConstraint.Builder getTableConstraintBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTableConstraintFieldBuilder().getBuilder();
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     */
    public org.mojolang.mojo.db.sql.TableConstraintOrBuilder getTableConstraintOrBuilder() {
      if (tableConstraintBuilder_ != null) {
        return tableConstraintBuilder_.getMessageOrBuilder();
      } else {
        return tableConstraint_ == null ?
            org.mojolang.mojo.db.sql.TableConstraint.getDefaultInstance() : tableConstraint_;
      }
    }
    /**
     * <code>.mojo.db.sql.TableConstraint table_constraint = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.mojolang.mojo.db.sql.TableConstraint, org.mojolang.mojo.db.sql.TableConstraint.Builder, org.mojolang.mojo.db.sql.TableConstraintOrBuilder> 
        getTableConstraintFieldBuilder() {
      if (tableConstraintBuilder_ == null) {
        tableConstraintBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.mojolang.mojo.db.sql.TableConstraint, org.mojolang.mojo.db.sql.TableConstraint.Builder, org.mojolang.mojo.db.sql.TableConstraintOrBuilder>(
                getTableConstraint(),
                getParentForChildren(),
                isClean());
        tableConstraint_ = null;
      }
      return tableConstraintBuilder_;
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


    // @@protoc_insertion_point(builder_scope:mojo.db.sql.TableDefinition)
  }

  // @@protoc_insertion_point(class_scope:mojo.db.sql.TableDefinition)
  private static final org.mojolang.mojo.db.sql.TableDefinition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.mojolang.mojo.db.sql.TableDefinition();
  }

  public static org.mojolang.mojo.db.sql.TableDefinition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TableDefinition>
      PARSER = new com.google.protobuf.AbstractParser<TableDefinition>() {
    @java.lang.Override
    public TableDefinition parsePartialFrom(
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

  public static com.google.protobuf.Parser<TableDefinition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TableDefinition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.mojolang.mojo.db.sql.TableDefinition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

