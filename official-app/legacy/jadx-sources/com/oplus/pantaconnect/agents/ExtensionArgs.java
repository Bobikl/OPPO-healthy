package com.oplus.pantaconnect.agents;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class ExtensionArgs extends GeneratedMessageV3 implements ExtensionArgsOrBuilder {
    public static final int ARGS_FIELD_NUMBER = 2;
    private static final ExtensionArgs DEFAULT_INSTANCE = new ExtensionArgs();
    private static final Parser<ExtensionArgs> PARSER = new AbstractParser<ExtensionArgs>() { // from class: com.oplus.pantaconnect.agents.ExtensionArgs.1
        @Override // com.google.protobuf.Parser
        public ExtensionArgs parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = ExtensionArgs.newBuilder();
            try {
                builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                return builderNewBuilder.buildPartial();
            } catch (InvalidProtocolBufferException e2) {
                throw e2.setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (UninitializedMessageException e3) {
                throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
            } catch (IOException e4) {
                throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(builderNewBuilder.buildPartial());
            }
        }
    };
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private ByteString args_;
    private byte memoizedIsInitialized;
    private volatile Object type_;

    public static ExtensionArgs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static ExtensionArgs parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExtensionArgs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static ExtensionArgs parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<ExtensionArgs> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtensionArgs)) {
            return super.equals(obj);
        }
        ExtensionArgs extensionArgs = (ExtensionArgs) obj;
        return getType().equals(extensionArgs.getType()) && getArgs().equals(extensionArgs.getArgs()) && getUnknownFields().equals(extensionArgs.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.agents.ExtensionArgsOrBuilder
    public ByteString getArgs() {
        return this.args_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<ExtensionArgs> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.type_) ? GeneratedMessageV3.computeStringSize(1, this.type_) : 0;
        if (!this.args_.isEmpty()) {
            iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.args_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.agents.ExtensionArgsOrBuilder
    public String getType() {
        Object obj = this.type_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.type_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.ExtensionArgsOrBuilder
    public ByteString getTypeBytes() {
        Object obj = this.type_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.type_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getArgs().hashCode() + ((((getType().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtensionArgs.class, Builder.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ExtensionArgs();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.type_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.type_);
        }
        if (!this.args_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.args_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExtensionArgsOrBuilder {
        private ByteString args_;
        private int bitField0_;
        private Object type_;

        private void buildPartial0(ExtensionArgs extensionArgs) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                extensionArgs.type_ = this.type_;
            }
            if ((i & 2) != 0) {
                extensionArgs.args_ = this.args_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_descriptor;
        }

        public Builder clearArgs() {
            this.bitField0_ &= -3;
            this.args_ = ExtensionArgs.getDefaultInstance().getArgs();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.type_ = ExtensionArgs.getDefaultInstance().getType();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.agents.ExtensionArgsOrBuilder
        public ByteString getArgs() {
            return this.args_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_descriptor;
        }

        @Override // com.oplus.pantaconnect.agents.ExtensionArgsOrBuilder
        public String getType() {
            Object obj = this.type_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.type_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.ExtensionArgsOrBuilder
        public ByteString getTypeBytes() {
            Object obj = this.type_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.type_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_fieldAccessorTable.ensureFieldAccessorsInitialized(ExtensionArgs.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setArgs(ByteString byteString) {
            byteString.getClass();
            this.args_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setType(String str) {
            str.getClass();
            this.type_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.type_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private Builder() {
            this.type_ = "";
            this.args_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ExtensionArgs build() {
            ExtensionArgs extensionArgsBuildPartial = buildPartial();
            if (extensionArgsBuildPartial.isInitialized()) {
                return extensionArgsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) extensionArgsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public ExtensionArgs buildPartial() {
            ExtensionArgs extensionArgs = new ExtensionArgs(this);
            if (this.bitField0_ != 0) {
                buildPartial0(extensionArgs);
            }
            onBuilt();
            return extensionArgs;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ExtensionArgs getDefaultInstanceForType() {
            return ExtensionArgs.getDefaultInstance();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i, obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.type_ = "";
            this.args_ = ByteString.EMPTY;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = "";
            this.args_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof ExtensionArgs) {
                return mergeFrom((ExtensionArgs) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(ExtensionArgs extensionArgs) {
            if (extensionArgs == ExtensionArgs.getDefaultInstance()) {
                return this;
            }
            if (!extensionArgs.getType().isEmpty()) {
                this.type_ = extensionArgs.type_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (extensionArgs.getArgs() != ByteString.EMPTY) {
                setArgs(extensionArgs.getArgs());
            }
            mergeUnknownFields(extensionArgs.getUnknownFields());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            extensionRegistryLite.getClass();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.type_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.args_ = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.unwrapIOException();
                    }
                } catch (Throwable th) {
                    onChanged();
                    throw th;
                }
            }
            onChanged();
            return this;
        }
    }

    private ExtensionArgs(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.type_ = "";
        this.args_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(ExtensionArgs extensionArgs) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(extensionArgs);
    }

    public static ExtensionArgs parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ExtensionArgs parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtensionArgs) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ExtensionArgs parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public ExtensionArgs getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static ExtensionArgs parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static ExtensionArgs parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    private ExtensionArgs() {
        this.type_ = "";
        ByteString byteString = ByteString.EMPTY;
        this.args_ = byteString;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = "";
        this.args_ = byteString;
    }

    public static ExtensionArgs parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static ExtensionArgs parseFrom(InputStream inputStream) throws IOException {
        return (ExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static ExtensionArgs parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static ExtensionArgs parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static ExtensionArgs parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExtensionArgs) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
