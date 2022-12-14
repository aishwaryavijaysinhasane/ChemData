// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChemDataExtract.proto

package com.smiles;

/**
 * Protobuf type {@code com.smiles.controller.Biblio}
 */
public final class Biblio extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.smiles.controller.Biblio)
    BiblioOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Biblio.newBuilder() to construct.
  private Biblio(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Biblio() {
    doi_ = "";
    publishedDate_ = "";
    title_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Biblio();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Biblio(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            doi_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            publishedDate_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000004;
            title_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_Biblio_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_Biblio_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smiles.Biblio.class, com.smiles.Biblio.Builder.class);
  }

  private int bitField0_;
  public static final int DOI_FIELD_NUMBER = 2;
  private volatile java.lang.Object doi_;
  /**
   * <code>optional string doi = 2;</code>
   * @return Whether the doi field is set.
   */
  @java.lang.Override
  public boolean hasDoi() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string doi = 2;</code>
   * @return The doi.
   */
  @java.lang.Override
  public java.lang.String getDoi() {
    java.lang.Object ref = doi_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      doi_ = s;
      return s;
    }
  }
  /**
   * <code>optional string doi = 2;</code>
   * @return The bytes for doi.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDoiBytes() {
    java.lang.Object ref = doi_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      doi_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLISHED_DATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object publishedDate_;
  /**
   * <code>optional string published_date = 3;</code>
   * @return Whether the publishedDate field is set.
   */
  @java.lang.Override
  public boolean hasPublishedDate() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string published_date = 3;</code>
   * @return The publishedDate.
   */
  @java.lang.Override
  public java.lang.String getPublishedDate() {
    java.lang.Object ref = publishedDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publishedDate_ = s;
      return s;
    }
  }
  /**
   * <code>optional string published_date = 3;</code>
   * @return The bytes for publishedDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublishedDateBytes() {
    java.lang.Object ref = publishedDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publishedDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 4;
  private volatile java.lang.Object title_;
  /**
   * <code>optional string title = 4;</code>
   * @return Whether the title field is set.
   */
  @java.lang.Override
  public boolean hasTitle() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional string title = 4;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>optional string title = 4;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, doi_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, publishedDate_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, title_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, doi_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, publishedDate_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, title_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.smiles.Biblio)) {
      return super.equals(obj);
    }
    com.smiles.Biblio other = (com.smiles.Biblio) obj;

    if (hasDoi() != other.hasDoi()) return false;
    if (hasDoi()) {
      if (!getDoi()
          .equals(other.getDoi())) return false;
    }
    if (hasPublishedDate() != other.hasPublishedDate()) return false;
    if (hasPublishedDate()) {
      if (!getPublishedDate()
          .equals(other.getPublishedDate())) return false;
    }
    if (hasTitle() != other.hasTitle()) return false;
    if (hasTitle()) {
      if (!getTitle()
          .equals(other.getTitle())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDoi()) {
      hash = (37 * hash) + DOI_FIELD_NUMBER;
      hash = (53 * hash) + getDoi().hashCode();
    }
    if (hasPublishedDate()) {
      hash = (37 * hash) + PUBLISHED_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getPublishedDate().hashCode();
    }
    if (hasTitle()) {
      hash = (37 * hash) + TITLE_FIELD_NUMBER;
      hash = (53 * hash) + getTitle().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smiles.Biblio parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smiles.Biblio parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smiles.Biblio parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smiles.Biblio parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smiles.Biblio parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smiles.Biblio parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smiles.Biblio parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smiles.Biblio parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smiles.Biblio parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.smiles.Biblio parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smiles.Biblio parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smiles.Biblio parseFrom(
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
  public static Builder newBuilder(com.smiles.Biblio prototype) {
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
   * Protobuf type {@code com.smiles.controller.Biblio}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.smiles.controller.Biblio)
      com.smiles.BiblioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_Biblio_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_Biblio_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smiles.Biblio.class, com.smiles.Biblio.Builder.class);
    }

    // Construct using com.smiles.Biblio.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      doi_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      publishedDate_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      title_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_Biblio_descriptor;
    }

    @java.lang.Override
    public com.smiles.Biblio getDefaultInstanceForType() {
      return com.smiles.Biblio.getDefaultInstance();
    }

    @java.lang.Override
    public com.smiles.Biblio build() {
      com.smiles.Biblio result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smiles.Biblio buildPartial() {
      com.smiles.Biblio result = new com.smiles.Biblio(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.doi_ = doi_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.publishedDate_ = publishedDate_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        to_bitField0_ |= 0x00000004;
      }
      result.title_ = title_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
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
      if (other instanceof com.smiles.Biblio) {
        return mergeFrom((com.smiles.Biblio)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smiles.Biblio other) {
      if (other == com.smiles.Biblio.getDefaultInstance()) return this;
      if (other.hasDoi()) {
        bitField0_ |= 0x00000001;
        doi_ = other.doi_;
        onChanged();
      }
      if (other.hasPublishedDate()) {
        bitField0_ |= 0x00000002;
        publishedDate_ = other.publishedDate_;
        onChanged();
      }
      if (other.hasTitle()) {
        bitField0_ |= 0x00000004;
        title_ = other.title_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.smiles.Biblio parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.smiles.Biblio) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object doi_ = "";
    /**
     * <code>optional string doi = 2;</code>
     * @return Whether the doi field is set.
     */
    public boolean hasDoi() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string doi = 2;</code>
     * @return The doi.
     */
    public java.lang.String getDoi() {
      java.lang.Object ref = doi_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        doi_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string doi = 2;</code>
     * @return The bytes for doi.
     */
    public com.google.protobuf.ByteString
        getDoiBytes() {
      java.lang.Object ref = doi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        doi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string doi = 2;</code>
     * @param value The doi to set.
     * @return This builder for chaining.
     */
    public Builder setDoi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      doi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string doi = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDoi() {
      bitField0_ = (bitField0_ & ~0x00000001);
      doi_ = getDefaultInstance().getDoi();
      onChanged();
      return this;
    }
    /**
     * <code>optional string doi = 2;</code>
     * @param value The bytes for doi to set.
     * @return This builder for chaining.
     */
    public Builder setDoiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      doi_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object publishedDate_ = "";
    /**
     * <code>optional string published_date = 3;</code>
     * @return Whether the publishedDate field is set.
     */
    public boolean hasPublishedDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string published_date = 3;</code>
     * @return The publishedDate.
     */
    public java.lang.String getPublishedDate() {
      java.lang.Object ref = publishedDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publishedDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string published_date = 3;</code>
     * @return The bytes for publishedDate.
     */
    public com.google.protobuf.ByteString
        getPublishedDateBytes() {
      java.lang.Object ref = publishedDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publishedDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string published_date = 3;</code>
     * @param value The publishedDate to set.
     * @return This builder for chaining.
     */
    public Builder setPublishedDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      publishedDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string published_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPublishedDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      publishedDate_ = getDefaultInstance().getPublishedDate();
      onChanged();
      return this;
    }
    /**
     * <code>optional string published_date = 3;</code>
     * @param value The bytes for publishedDate to set.
     * @return This builder for chaining.
     */
    public Builder setPublishedDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      publishedDate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>optional string title = 4;</code>
     * @return Whether the title field is set.
     */
    public boolean hasTitle() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string title = 4;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string title = 4;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string title = 4;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      bitField0_ = (bitField0_ & ~0x00000004);
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>optional string title = 4;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000004;
      title_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.smiles.controller.Biblio)
  }

  // @@protoc_insertion_point(class_scope:com.smiles.controller.Biblio)
  private static final com.smiles.Biblio DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smiles.Biblio();
  }

  public static com.smiles.Biblio getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Biblio>
      PARSER = new com.google.protobuf.AbstractParser<Biblio>() {
    @java.lang.Override
    public Biblio parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Biblio(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Biblio> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Biblio> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smiles.Biblio getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

