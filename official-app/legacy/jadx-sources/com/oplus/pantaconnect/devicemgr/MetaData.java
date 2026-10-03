package com.oplus.pantaconnect.devicemgr;

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
import com.oplus.aiunit.vision.xq5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class MetaData extends GeneratedMessageV3 implements MetaDataOrBuilder {
    public static final int DEVICEID_FIELD_NUMBER = 1;
    public static final int DEVICEMODEL_FIELD_NUMBER = 3;
    public static final int PROTOCOLDEVICEID_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private volatile Object deviceId_;
    private volatile Object deviceModel_;
    private byte memoizedIsInitialized;
    private volatile Object protocolDeviceId_;
    private static final MetaData DEFAULT_INSTANCE = new MetaData();
    private static final Parser<MetaData> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MetaDataOrBuilder {
        private int bitField0_;
        private Object deviceId_;
        private Object deviceModel_;
        private Object protocolDeviceId_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(MetaData metaData) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                metaData.deviceId_ = this.deviceId_;
            }
            if ((i & 2) != 0) {
                metaData.protocolDeviceId_ = this.protocolDeviceId_;
            }
            if ((i & 4) != 0) {
                metaData.deviceModel_ = this.deviceModel_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return xq5.f18722c;
        }

        public Builder clearDeviceId() {
            this.deviceId_ = MetaData.getDefaultInstance().getDeviceId();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearDeviceModel() {
            this.deviceModel_ = MetaData.getDefaultInstance().getDeviceModel();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearProtocolDeviceId() {
            this.protocolDeviceId_ = MetaData.getDefaultInstance().getProtocolDeviceId();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return xq5.f18722c;
        }

        @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
        public String getDeviceId() {
            Object obj = this.deviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
        public ByteString getDeviceIdBytes() {
            Object obj = this.deviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
        public String getDeviceModel() {
            Object obj = this.deviceModel_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceModel_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
        public ByteString getDeviceModelBytes() {
            Object obj = this.deviceModel_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceModel_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
        public String getProtocolDeviceId() {
            Object obj = this.protocolDeviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.protocolDeviceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
        public ByteString getProtocolDeviceIdBytes() {
            Object obj = this.protocolDeviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.protocolDeviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return xq5.d.ensureFieldAccessorsInitialized(MetaData.class, Builder.class);
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

        public Builder setDeviceModel(String str) {
            str.getClass();
            this.deviceModel_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setDeviceModelBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceModel_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setProtocolDeviceId(String str) {
            str.getClass();
            this.protocolDeviceId_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setProtocolDeviceIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.protocolDeviceId_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.deviceId_ = "";
            this.protocolDeviceId_ = "";
            this.deviceModel_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MetaData build() {
            MetaData metaDataBuildPartial = buildPartial();
            if (metaDataBuildPartial.isInitialized()) {
                return metaDataBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) metaDataBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public MetaData buildPartial() {
            MetaData metaData = new MetaData(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(metaData);
            }
            onBuilt();
            return metaData;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MetaData getDefaultInstanceForType() {
            return MetaData.getDefaultInstance();
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
            this.deviceId_ = "";
            this.protocolDeviceId_ = "";
            this.deviceModel_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.deviceId_ = "";
            this.protocolDeviceId_ = "";
            this.deviceModel_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof MetaData) {
                return mergeFrom((MetaData) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(MetaData metaData) {
            if (metaData == MetaData.getDefaultInstance()) {
                return this;
            }
            if (!metaData.getDeviceId().isEmpty()) {
                this.deviceId_ = metaData.deviceId_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!metaData.getProtocolDeviceId().isEmpty()) {
                this.protocolDeviceId_ = metaData.protocolDeviceId_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (!metaData.getDeviceModel().isEmpty()) {
                this.deviceModel_ = metaData.deviceModel_;
                this.bitField0_ |= 4;
                onChanged();
            }
            mergeUnknownFields(metaData.getUnknownFields());
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
                            } else if (tag == 18) {
                                this.protocolDeviceId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.deviceModel_ = codedInputStream.readStringRequireUtf8();
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

    public class a extends AbstractParser<MetaData> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MetaData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = MetaData.newBuilder();
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

    public /* synthetic */ MetaData(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static MetaData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return xq5.f18722c;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static MetaData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetaData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static MetaData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<MetaData> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetaData)) {
            return super.equals(obj);
        }
        MetaData metaData = (MetaData) obj;
        return getDeviceId().equals(metaData.getDeviceId()) && getProtocolDeviceId().equals(metaData.getProtocolDeviceId()) && getDeviceModel().equals(metaData.getDeviceModel()) && getUnknownFields().equals(metaData.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
    public String getDeviceId() {
        Object obj = this.deviceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
    public ByteString getDeviceIdBytes() {
        Object obj = this.deviceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
    public String getDeviceModel() {
        Object obj = this.deviceModel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceModel_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
    public ByteString getDeviceModelBytes() {
        Object obj = this.deviceModel_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceModel_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<MetaData> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
    public String getProtocolDeviceId() {
        Object obj = this.protocolDeviceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.protocolDeviceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.devicemgr.MetaDataOrBuilder
    public ByteString getProtocolDeviceIdBytes() {
        Object obj = this.protocolDeviceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.protocolDeviceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.deviceId_) ? GeneratedMessageV3.computeStringSize(1, this.deviceId_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.protocolDeviceId_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.protocolDeviceId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceModel_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.deviceModel_);
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
        int iHashCode = getUnknownFields().hashCode() + ((getDeviceModel().hashCode() + ((((getProtocolDeviceId().hashCode() + ((((getDeviceId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return xq5.d.ensureFieldAccessorsInitialized(MetaData.class, Builder.class);
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
        return new MetaData();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.deviceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.deviceId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.protocolDeviceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.protocolDeviceId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceModel_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.deviceModel_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private MetaData(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.deviceId_ = "";
        this.protocolDeviceId_ = "";
        this.deviceModel_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(MetaData metaData) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(metaData);
    }

    public static MetaData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static MetaData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetaData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetaData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public MetaData getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static MetaData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static MetaData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static MetaData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private MetaData() {
        this.deviceId_ = "";
        this.protocolDeviceId_ = "";
        this.deviceModel_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.deviceId_ = "";
        this.protocolDeviceId_ = "";
        this.deviceModel_ = "";
    }

    public static MetaData parseFrom(InputStream inputStream) throws IOException {
        return (MetaData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static MetaData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetaData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static MetaData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetaData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static MetaData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetaData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
