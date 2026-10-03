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
public final class WakeupParams extends GeneratedMessageV3 implements WakeupParamsOrBuilder {
    public static final int ACTION_FIELD_NUMBER = 3;
    public static final int COMPONENTTYPE_FIELD_NUMBER = 1;
    private static final WakeupParams DEFAULT_INSTANCE = new WakeupParams();
    private static final Parser<WakeupParams> PARSER = new AbstractParser<WakeupParams>() { // from class: com.oplus.pantaconnect.agents.WakeupParams.1
        @Override // com.google.protobuf.Parser
        public WakeupParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = WakeupParams.newBuilder();
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
    public static final int PKG_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile Object action_;
    private int componentType_;
    private byte memoizedIsInitialized;
    private volatile Object pkg_;

    public static WakeupParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_WakeupParams_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static WakeupParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WakeupParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static WakeupParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<WakeupParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WakeupParams)) {
            return super.equals(obj);
        }
        WakeupParams wakeupParams = (WakeupParams) obj;
        return getComponentType() == wakeupParams.getComponentType() && getPkg().equals(wakeupParams.getPkg()) && getAction().equals(wakeupParams.getAction()) && getUnknownFields().equals(wakeupParams.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
    public String getAction() {
        Object obj = this.action_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.action_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
    public ByteString getActionBytes() {
        Object obj = this.action_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.action_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
    public int getComponentType() {
        return this.componentType_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<WakeupParams> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
    public String getPkg() {
        Object obj = this.pkg_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.pkg_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
    public ByteString getPkgBytes() {
        Object obj = this.pkg_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.pkg_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.componentType_;
        int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.pkg_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(2, this.pkg_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.action_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(3, this.action_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getAction().hashCode() + ((((getPkg().hashCode() + ((((getComponentType() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_WakeupParams_fieldAccessorTable.ensureFieldAccessorsInitialized(WakeupParams.class, Builder.class);
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
        return new WakeupParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.componentType_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.pkg_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.pkg_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.action_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.action_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WakeupParamsOrBuilder {
        private Object action_;
        private int bitField0_;
        private int componentType_;
        private Object pkg_;

        private void buildPartial0(WakeupParams wakeupParams) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                wakeupParams.componentType_ = this.componentType_;
            }
            if ((i & 2) != 0) {
                wakeupParams.pkg_ = this.pkg_;
            }
            if ((i & 4) != 0) {
                wakeupParams.action_ = this.action_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_WakeupParams_descriptor;
        }

        public Builder clearAction() {
            this.action_ = WakeupParams.getDefaultInstance().getAction();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearComponentType() {
            this.bitField0_ &= -2;
            this.componentType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearPkg() {
            this.pkg_ = WakeupParams.getDefaultInstance().getPkg();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
        public String getAction() {
            Object obj = this.action_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.action_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
        public ByteString getActionBytes() {
            Object obj = this.action_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.action_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
        public int getComponentType() {
            return this.componentType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_WakeupParams_descriptor;
        }

        @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
        public String getPkg() {
            Object obj = this.pkg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.pkg_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.agents.WakeupParamsOrBuilder
        public ByteString getPkgBytes() {
            Object obj = this.pkg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pkg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_WakeupParams_fieldAccessorTable.ensureFieldAccessorsInitialized(WakeupParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAction(String str) {
            str.getClass();
            this.action_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setActionBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.action_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setComponentType(int i) {
            this.componentType_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setPkg(String str) {
            str.getClass();
            this.pkg_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setPkgBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.pkg_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private Builder() {
            this.pkg_ = "";
            this.action_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public WakeupParams build() {
            WakeupParams wakeupParamsBuildPartial = buildPartial();
            if (wakeupParamsBuildPartial.isInitialized()) {
                return wakeupParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) wakeupParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public WakeupParams buildPartial() {
            WakeupParams wakeupParams = new WakeupParams(this);
            if (this.bitField0_ != 0) {
                buildPartial0(wakeupParams);
            }
            onBuilt();
            return wakeupParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WakeupParams getDefaultInstanceForType() {
            return WakeupParams.getDefaultInstance();
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
            this.componentType_ = 0;
            this.pkg_ = "";
            this.action_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.pkg_ = "";
            this.action_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof WakeupParams) {
                return mergeFrom((WakeupParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(WakeupParams wakeupParams) {
            if (wakeupParams == WakeupParams.getDefaultInstance()) {
                return this;
            }
            if (wakeupParams.getComponentType() != 0) {
                setComponentType(wakeupParams.getComponentType());
            }
            if (!wakeupParams.getPkg().isEmpty()) {
                this.pkg_ = wakeupParams.pkg_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!wakeupParams.getAction().isEmpty()) {
                this.action_ = wakeupParams.action_;
                this.bitField0_ |= 4;
                onChanged();
            }
            mergeUnknownFields(wakeupParams.getUnknownFields());
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
                            if (tag == 8) {
                                this.componentType_ = codedInputStream.readInt32();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.pkg_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.action_ = codedInputStream.readStringRequireUtf8();
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

    private WakeupParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.componentType_ = 0;
        this.pkg_ = "";
        this.action_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(WakeupParams wakeupParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(wakeupParams);
    }

    public static WakeupParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static WakeupParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WakeupParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WakeupParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public WakeupParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static WakeupParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static WakeupParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static WakeupParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private WakeupParams() {
        this.componentType_ = 0;
        this.pkg_ = "";
        this.action_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.pkg_ = "";
        this.action_ = "";
    }

    public static WakeupParams parseFrom(InputStream inputStream) throws IOException {
        return (WakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static WakeupParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static WakeupParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static WakeupParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WakeupParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
