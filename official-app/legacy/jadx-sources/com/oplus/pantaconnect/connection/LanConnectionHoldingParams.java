package com.oplus.pantaconnect.connection;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.oplus.aiunit.vision.p1i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class LanConnectionHoldingParams extends GeneratedMessageV3 implements LanConnectionHoldingParamsOrBuilder {
    public static final int DEVICEID_FIELD_NUMBER = 1;
    public static final int ISFORCEDHOLDING_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile Object deviceId_;
    private boolean isForcedHolding_;
    private byte memoizedIsInitialized;
    private static final LanConnectionHoldingParams DEFAULT_INSTANCE = new LanConnectionHoldingParams();
    private static final Parser<LanConnectionHoldingParams> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LanConnectionHoldingParamsOrBuilder {
        private int bitField0_;
        private Object deviceId_;
        private boolean isForcedHolding_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(LanConnectionHoldingParams lanConnectionHoldingParams) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                lanConnectionHoldingParams.deviceId_ = this.deviceId_;
            }
            if ((i & 2) != 0) {
                lanConnectionHoldingParams.isForcedHolding_ = this.isForcedHolding_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return p1i.f15152c;
        }

        public Builder clearDeviceId() {
            this.deviceId_ = LanConnectionHoldingParams.getDefaultInstance().getDeviceId();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearIsForcedHolding() {
            this.bitField0_ &= -3;
            this.isForcedHolding_ = false;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return p1i.f15152c;
        }

        @Override // com.oplus.pantaconnect.connection.LanConnectionHoldingParamsOrBuilder
        public String getDeviceId() {
            Object obj = this.deviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.LanConnectionHoldingParamsOrBuilder
        public ByteString getDeviceIdBytes() {
            Object obj = this.deviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.LanConnectionHoldingParamsOrBuilder
        public boolean getIsForcedHolding() {
            return this.isForcedHolding_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return p1i.d.ensureFieldAccessorsInitialized(LanConnectionHoldingParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setDeviceId(String str) {
            str.getClass();
            this.deviceId_ = str;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setDeviceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceId_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setIsForcedHolding(boolean z) {
            this.isForcedHolding_ = z;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.deviceId_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LanConnectionHoldingParams build() {
            LanConnectionHoldingParams lanConnectionHoldingParamsBuildPartial = buildPartial();
            if (lanConnectionHoldingParamsBuildPartial.isInitialized()) {
                return lanConnectionHoldingParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) lanConnectionHoldingParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public LanConnectionHoldingParams buildPartial() {
            LanConnectionHoldingParams lanConnectionHoldingParams = new LanConnectionHoldingParams(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(lanConnectionHoldingParams);
            }
            onBuilt();
            return lanConnectionHoldingParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LanConnectionHoldingParams getDefaultInstanceForType() {
            return LanConnectionHoldingParams.getDefaultInstance();
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

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.deviceId_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.deviceId_ = "";
            this.isForcedHolding_ = false;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof LanConnectionHoldingParams) {
                return mergeFrom((LanConnectionHoldingParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(LanConnectionHoldingParams lanConnectionHoldingParams) {
            if (lanConnectionHoldingParams == LanConnectionHoldingParams.getDefaultInstance()) {
                return this;
            }
            if (!lanConnectionHoldingParams.getDeviceId().isEmpty()) {
                this.deviceId_ = lanConnectionHoldingParams.deviceId_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (lanConnectionHoldingParams.getIsForcedHolding()) {
                setIsForcedHolding(lanConnectionHoldingParams.getIsForcedHolding());
            }
            mergeUnknownFields(lanConnectionHoldingParams.getUnknownFields());
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
                                this.deviceId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 1;
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.isForcedHolding_ = codedInputStream.readBool();
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

    public class a extends AbstractParser<LanConnectionHoldingParams> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LanConnectionHoldingParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = LanConnectionHoldingParams.newBuilder();
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
    }

    public /* synthetic */ LanConnectionHoldingParams(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static LanConnectionHoldingParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return p1i.f15152c;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static LanConnectionHoldingParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LanConnectionHoldingParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static LanConnectionHoldingParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<LanConnectionHoldingParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LanConnectionHoldingParams)) {
            return super.equals(obj);
        }
        LanConnectionHoldingParams lanConnectionHoldingParams = (LanConnectionHoldingParams) obj;
        return getDeviceId().equals(lanConnectionHoldingParams.getDeviceId()) && getIsForcedHolding() == lanConnectionHoldingParams.getIsForcedHolding() && getUnknownFields().equals(lanConnectionHoldingParams.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.LanConnectionHoldingParamsOrBuilder
    public String getDeviceId() {
        Object obj = this.deviceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.LanConnectionHoldingParamsOrBuilder
    public ByteString getDeviceIdBytes() {
        Object obj = this.deviceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.LanConnectionHoldingParamsOrBuilder
    public boolean getIsForcedHolding() {
        return this.isForcedHolding_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<LanConnectionHoldingParams> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.deviceId_) ? GeneratedMessageV3.computeStringSize(1, this.deviceId_) : 0;
        boolean z = this.isForcedHolding_;
        if (z) {
            iComputeStringSize += CodedOutputStream.computeBoolSize(2, z);
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
        int iHashCode = getUnknownFields().hashCode() + ((Internal.hashBoolean(getIsForcedHolding()) + ((((getDeviceId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return p1i.d.ensureFieldAccessorsInitialized(LanConnectionHoldingParams.class, Builder.class);
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
        return new LanConnectionHoldingParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.deviceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.deviceId_);
        }
        boolean z = this.isForcedHolding_;
        if (z) {
            codedOutputStream.writeBool(2, z);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private LanConnectionHoldingParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.deviceId_ = "";
        this.isForcedHolding_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(LanConnectionHoldingParams lanConnectionHoldingParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(lanConnectionHoldingParams);
    }

    public static LanConnectionHoldingParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static LanConnectionHoldingParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LanConnectionHoldingParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LanConnectionHoldingParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public LanConnectionHoldingParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static LanConnectionHoldingParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static LanConnectionHoldingParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    private LanConnectionHoldingParams() {
        this.deviceId_ = "";
        this.isForcedHolding_ = false;
        this.memoizedIsInitialized = (byte) -1;
        this.deviceId_ = "";
    }

    public static LanConnectionHoldingParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static LanConnectionHoldingParams parseFrom(InputStream inputStream) throws IOException {
        return (LanConnectionHoldingParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static LanConnectionHoldingParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LanConnectionHoldingParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static LanConnectionHoldingParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LanConnectionHoldingParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static LanConnectionHoldingParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LanConnectionHoldingParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
