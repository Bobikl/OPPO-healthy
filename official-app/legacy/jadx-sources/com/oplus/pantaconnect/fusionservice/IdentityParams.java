package com.oplus.pantaconnect.fusionservice;

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
public final class IdentityParams extends GeneratedMessageV3 implements IdentityParamsOrBuilder {
    public static final int ACCOUNTGROUP_FIELD_NUMBER = 2;
    public static final int ACCOUNTHASH_FIELD_NUMBER = 1;
    public static final int CONTACTHASH_FIELD_NUMBER = 3;
    private static final IdentityParams DEFAULT_INSTANCE = new IdentityParams();
    private static final Parser<IdentityParams> PARSER = new AbstractParser<IdentityParams>() { // from class: com.oplus.pantaconnect.fusionservice.IdentityParams.1
        @Override // com.google.protobuf.Parser
        public IdentityParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = IdentityParams.newBuilder();
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
    private static final long serialVersionUID = 0;
    private volatile Object accountGroup_;
    private volatile Object accountHash_;
    private volatile Object contactHash_;
    private byte memoizedIsInitialized;

    public static IdentityParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static IdentityParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IdentityParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static IdentityParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<IdentityParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdentityParams)) {
            return super.equals(obj);
        }
        IdentityParams identityParams = (IdentityParams) obj;
        return getAccountHash().equals(identityParams.getAccountHash()) && getAccountGroup().equals(identityParams.getAccountGroup()) && getContactHash().equals(identityParams.getContactHash()) && getUnknownFields().equals(identityParams.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
    public String getAccountGroup() {
        Object obj = this.accountGroup_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.accountGroup_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
    public ByteString getAccountGroupBytes() {
        Object obj = this.accountGroup_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.accountGroup_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
    public String getAccountHash() {
        Object obj = this.accountHash_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.accountHash_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
    public ByteString getAccountHashBytes() {
        Object obj = this.accountHash_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.accountHash_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
    public String getContactHash() {
        Object obj = this.contactHash_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.contactHash_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
    public ByteString getContactHashBytes() {
        Object obj = this.contactHash_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.contactHash_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<IdentityParams> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.accountHash_) ? GeneratedMessageV3.computeStringSize(1, this.accountHash_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.accountGroup_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.accountGroup_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.contactHash_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.contactHash_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getContactHash().hashCode() + ((((getAccountGroup().hashCode() + ((((getAccountHash().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_fieldAccessorTable.ensureFieldAccessorsInitialized(IdentityParams.class, Builder.class);
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
        return new IdentityParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.accountHash_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.accountHash_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.accountGroup_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.accountGroup_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.contactHash_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.contactHash_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IdentityParamsOrBuilder {
        private Object accountGroup_;
        private Object accountHash_;
        private int bitField0_;
        private Object contactHash_;

        private void buildPartial0(IdentityParams identityParams) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                identityParams.accountHash_ = this.accountHash_;
            }
            if ((i & 2) != 0) {
                identityParams.accountGroup_ = this.accountGroup_;
            }
            if ((i & 4) != 0) {
                identityParams.contactHash_ = this.contactHash_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_descriptor;
        }

        public Builder clearAccountGroup() {
            this.accountGroup_ = IdentityParams.getDefaultInstance().getAccountGroup();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearAccountHash() {
            this.accountHash_ = IdentityParams.getDefaultInstance().getAccountHash();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearContactHash() {
            this.contactHash_ = IdentityParams.getDefaultInstance().getContactHash();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
        public String getAccountGroup() {
            Object obj = this.accountGroup_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.accountGroup_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
        public ByteString getAccountGroupBytes() {
            Object obj = this.accountGroup_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.accountGroup_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
        public String getAccountHash() {
            Object obj = this.accountHash_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.accountHash_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
        public ByteString getAccountHashBytes() {
            Object obj = this.accountHash_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.accountHash_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
        public String getContactHash() {
            Object obj = this.contactHash_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.contactHash_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.IdentityParamsOrBuilder
        public ByteString getContactHashBytes() {
            Object obj = this.contactHash_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contactHash_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_descriptor;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_fieldAccessorTable.ensureFieldAccessorsInitialized(IdentityParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAccountGroup(String str) {
            str.getClass();
            this.accountGroup_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setAccountGroupBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.accountGroup_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setAccountHash(String str) {
            str.getClass();
            this.accountHash_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setAccountHashBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.accountHash_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setContactHash(String str) {
            str.getClass();
            this.contactHash_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setContactHashBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.contactHash_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        private Builder() {
            this.accountHash_ = "";
            this.accountGroup_ = "";
            this.contactHash_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public IdentityParams build() {
            IdentityParams identityParamsBuildPartial = buildPartial();
            if (identityParamsBuildPartial.isInitialized()) {
                return identityParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) identityParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public IdentityParams buildPartial() {
            IdentityParams identityParams = new IdentityParams(this);
            if (this.bitField0_ != 0) {
                buildPartial0(identityParams);
            }
            onBuilt();
            return identityParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IdentityParams getDefaultInstanceForType() {
            return IdentityParams.getDefaultInstance();
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
            this.accountHash_ = "";
            this.accountGroup_ = "";
            this.contactHash_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.accountHash_ = "";
            this.accountGroup_ = "";
            this.contactHash_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof IdentityParams) {
                return mergeFrom((IdentityParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(IdentityParams identityParams) {
            if (identityParams == IdentityParams.getDefaultInstance()) {
                return this;
            }
            if (!identityParams.getAccountHash().isEmpty()) {
                this.accountHash_ = identityParams.accountHash_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!identityParams.getAccountGroup().isEmpty()) {
                this.accountGroup_ = identityParams.accountGroup_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!identityParams.getContactHash().isEmpty()) {
                this.contactHash_ = identityParams.contactHash_;
                this.bitField0_ |= 4;
                onChanged();
            }
            mergeUnknownFields(identityParams.getUnknownFields());
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
                                this.accountHash_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.accountGroup_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.contactHash_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
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

    private IdentityParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.accountHash_ = "";
        this.accountGroup_ = "";
        this.contactHash_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(IdentityParams identityParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(identityParams);
    }

    public static IdentityParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static IdentityParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IdentityParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static IdentityParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public IdentityParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static IdentityParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static IdentityParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static IdentityParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private IdentityParams() {
        this.accountHash_ = "";
        this.accountGroup_ = "";
        this.contactHash_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.accountHash_ = "";
        this.accountGroup_ = "";
        this.contactHash_ = "";
    }

    public static IdentityParams parseFrom(InputStream inputStream) throws IOException {
        return (IdentityParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static IdentityParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IdentityParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static IdentityParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (IdentityParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static IdentityParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (IdentityParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
