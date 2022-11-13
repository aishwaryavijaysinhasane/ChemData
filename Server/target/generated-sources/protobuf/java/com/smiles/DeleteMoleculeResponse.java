// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChemDataExtract.proto

package com.smiles;

/**
 * Protobuf type {@code com.smiles.controller.DeleteMoleculeResponse}
 */
public final class DeleteMoleculeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.smiles.controller.DeleteMoleculeResponse)
    DeleteMoleculeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeleteMoleculeResponse.newBuilder() to construct.
  private DeleteMoleculeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeleteMoleculeResponse() {
    moleculeId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DeleteMoleculeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeleteMoleculeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            moleculeId_ = s;
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
    return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_DeleteMoleculeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_DeleteMoleculeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.smiles.DeleteMoleculeResponse.class, com.smiles.DeleteMoleculeResponse.Builder.class);
  }

  public static final int MOLECULE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object moleculeId_;
  /**
   * <code>string molecule_id = 1;</code>
   * @return The moleculeId.
   */
  @java.lang.Override
  public java.lang.String getMoleculeId() {
    java.lang.Object ref = moleculeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      moleculeId_ = s;
      return s;
    }
  }
  /**
   * <code>string molecule_id = 1;</code>
   * @return The bytes for moleculeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMoleculeIdBytes() {
    java.lang.Object ref = moleculeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      moleculeId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moleculeId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, moleculeId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(moleculeId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, moleculeId_);
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
    if (!(obj instanceof com.smiles.DeleteMoleculeResponse)) {
      return super.equals(obj);
    }
    com.smiles.DeleteMoleculeResponse other = (com.smiles.DeleteMoleculeResponse) obj;

    if (!getMoleculeId()
        .equals(other.getMoleculeId())) return false;
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
    hash = (37 * hash) + MOLECULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMoleculeId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.smiles.DeleteMoleculeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smiles.DeleteMoleculeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.smiles.DeleteMoleculeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.smiles.DeleteMoleculeResponse parseFrom(
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
  public static Builder newBuilder(com.smiles.DeleteMoleculeResponse prototype) {
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
   * Protobuf type {@code com.smiles.controller.DeleteMoleculeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.smiles.controller.DeleteMoleculeResponse)
      com.smiles.DeleteMoleculeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_DeleteMoleculeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_DeleteMoleculeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.smiles.DeleteMoleculeResponse.class, com.smiles.DeleteMoleculeResponse.Builder.class);
    }

    // Construct using com.smiles.DeleteMoleculeResponse.newBuilder()
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
      moleculeId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.smiles.ChemDataExtract.internal_static_com_smiles_controller_DeleteMoleculeResponse_descriptor;
    }

    @java.lang.Override
    public com.smiles.DeleteMoleculeResponse getDefaultInstanceForType() {
      return com.smiles.DeleteMoleculeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.smiles.DeleteMoleculeResponse build() {
      com.smiles.DeleteMoleculeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.smiles.DeleteMoleculeResponse buildPartial() {
      com.smiles.DeleteMoleculeResponse result = new com.smiles.DeleteMoleculeResponse(this);
      result.moleculeId_ = moleculeId_;
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
      if (other instanceof com.smiles.DeleteMoleculeResponse) {
        return mergeFrom((com.smiles.DeleteMoleculeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.smiles.DeleteMoleculeResponse other) {
      if (other == com.smiles.DeleteMoleculeResponse.getDefaultInstance()) return this;
      if (!other.getMoleculeId().isEmpty()) {
        moleculeId_ = other.moleculeId_;
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
      com.smiles.DeleteMoleculeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.smiles.DeleteMoleculeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object moleculeId_ = "";
    /**
     * <code>string molecule_id = 1;</code>
     * @return The moleculeId.
     */
    public java.lang.String getMoleculeId() {
      java.lang.Object ref = moleculeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        moleculeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string molecule_id = 1;</code>
     * @return The bytes for moleculeId.
     */
    public com.google.protobuf.ByteString
        getMoleculeIdBytes() {
      java.lang.Object ref = moleculeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        moleculeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string molecule_id = 1;</code>
     * @param value The moleculeId to set.
     * @return This builder for chaining.
     */
    public Builder setMoleculeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      moleculeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string molecule_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMoleculeId() {
      
      moleculeId_ = getDefaultInstance().getMoleculeId();
      onChanged();
      return this;
    }
    /**
     * <code>string molecule_id = 1;</code>
     * @param value The bytes for moleculeId to set.
     * @return This builder for chaining.
     */
    public Builder setMoleculeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      moleculeId_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.smiles.controller.DeleteMoleculeResponse)
  }

  // @@protoc_insertion_point(class_scope:com.smiles.controller.DeleteMoleculeResponse)
  private static final com.smiles.DeleteMoleculeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.smiles.DeleteMoleculeResponse();
  }

  public static com.smiles.DeleteMoleculeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteMoleculeResponse>
      PARSER = new com.google.protobuf.AbstractParser<DeleteMoleculeResponse>() {
    @java.lang.Override
    public DeleteMoleculeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeleteMoleculeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeleteMoleculeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteMoleculeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.smiles.DeleteMoleculeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
