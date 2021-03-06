// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user-level/v1/user-level.proto

package vn.alive.user_level;

public final class UserLevel {
  private UserLevel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StringMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:user_level.v1.StringMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string value = 1;</code>
     */
    java.lang.String getValue();
    /**
     * <code>string value = 1;</code>
     */
    com.google.protobuf.ByteString
        getValueBytes();
  }
  /**
   * Protobuf type {@code user_level.v1.StringMessage}
   */
  public  static final class StringMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:user_level.v1.StringMessage)
      StringMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StringMessage.newBuilder() to construct.
    private StringMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StringMessage() {
      value_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StringMessage(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              value_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return vn.alive.user_level.UserLevel.internal_static_user_level_v1_StringMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return vn.alive.user_level.UserLevel.internal_static_user_level_v1_StringMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              vn.alive.user_level.UserLevel.StringMessage.class, vn.alive.user_level.UserLevel.StringMessage.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private volatile java.lang.Object value_;
    /**
     * <code>string value = 1;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      }
    }
    /**
     * <code>string value = 1;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
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
      if (!getValueBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, value_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getValueBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, value_);
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
      if (!(obj instanceof vn.alive.user_level.UserLevel.StringMessage)) {
        return super.equals(obj);
      }
      vn.alive.user_level.UserLevel.StringMessage other = (vn.alive.user_level.UserLevel.StringMessage) obj;

      boolean result = true;
      result = result && getValue()
          .equals(other.getValue());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static vn.alive.user_level.UserLevel.StringMessage parseFrom(
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
    public static Builder newBuilder(vn.alive.user_level.UserLevel.StringMessage prototype) {
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
     * Protobuf type {@code user_level.v1.StringMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:user_level.v1.StringMessage)
        vn.alive.user_level.UserLevel.StringMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return vn.alive.user_level.UserLevel.internal_static_user_level_v1_StringMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return vn.alive.user_level.UserLevel.internal_static_user_level_v1_StringMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                vn.alive.user_level.UserLevel.StringMessage.class, vn.alive.user_level.UserLevel.StringMessage.Builder.class);
      }

      // Construct using vn.alive.user_level.UserLevel.StringMessage.newBuilder()
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
        value_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return vn.alive.user_level.UserLevel.internal_static_user_level_v1_StringMessage_descriptor;
      }

      @java.lang.Override
      public vn.alive.user_level.UserLevel.StringMessage getDefaultInstanceForType() {
        return vn.alive.user_level.UserLevel.StringMessage.getDefaultInstance();
      }

      @java.lang.Override
      public vn.alive.user_level.UserLevel.StringMessage build() {
        vn.alive.user_level.UserLevel.StringMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public vn.alive.user_level.UserLevel.StringMessage buildPartial() {
        vn.alive.user_level.UserLevel.StringMessage result = new vn.alive.user_level.UserLevel.StringMessage(this);
        result.value_ = value_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof vn.alive.user_level.UserLevel.StringMessage) {
          return mergeFrom((vn.alive.user_level.UserLevel.StringMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(vn.alive.user_level.UserLevel.StringMessage other) {
        if (other == vn.alive.user_level.UserLevel.StringMessage.getDefaultInstance()) return this;
        if (!other.getValue().isEmpty()) {
          value_ = other.value_;
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
        vn.alive.user_level.UserLevel.StringMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (vn.alive.user_level.UserLevel.StringMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object value_ = "";
      /**
       * <code>string value = 1;</code>
       */
      public java.lang.String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string value = 1;</code>
       */
      public com.google.protobuf.ByteString
          getValueBytes() {
        java.lang.Object ref = value_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          value_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string value = 1;</code>
       */
      public Builder setValue(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      /**
       * <code>string value = 1;</code>
       */
      public Builder setValueBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        value_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:user_level.v1.StringMessage)
    }

    // @@protoc_insertion_point(class_scope:user_level.v1.StringMessage)
    private static final vn.alive.user_level.UserLevel.StringMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new vn.alive.user_level.UserLevel.StringMessage();
    }

    public static vn.alive.user_level.UserLevel.StringMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StringMessage>
        PARSER = new com.google.protobuf.AbstractParser<StringMessage>() {
      @java.lang.Override
      public StringMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StringMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StringMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StringMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public vn.alive.user_level.UserLevel.StringMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_user_level_v1_StringMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_user_level_v1_StringMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036user-level/v1/user-level.proto\022\ruser_l" +
      "evel.v1\"\036\n\rStringMessage\022\r\n\005value\030\001 \001(\t2" +
      "`\n\020UserLevelService\022L\n\014GetUserLevel\022\034.us" +
      "er_level.v1.StringMessage\032\034.user_level.v" +
      "1.StringMessage\"\000B/\n\023vn.alive.user_level" +
      "B\tUserLevelZ\ruser_level/v1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_user_level_v1_StringMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_user_level_v1_StringMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_user_level_v1_StringMessage_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
