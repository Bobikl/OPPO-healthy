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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.oplus.aiunit.vision.tz3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class QrCodeRequestParams extends GeneratedMessageV3 implements QrCodeRequestParamsOrBuilder {
    public static final int DEVICETYPE_FIELD_NUMBER = 1;
    public static final int MODELID_FIELD_NUMBER = 3;
    public static final int PID_FIELD_NUMBER = 4;
    public static final int QRCODETYPE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int deviceType_;
    private byte memoizedIsInitialized;
    private volatile Object modelId_;
    private volatile Object pid_;
    private int qrCodeType_;
    private static final QrCodeRequestParams DEFAULT_INSTANCE = new QrCodeRequestParams();
    private static final Parser<QrCodeRequestParams> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements QrCodeRequestParamsOrBuilder {
        private int bitField0_;
        private int deviceType_;
        private Object modelId_;
        private Object pid_;
        private int qrCodeType_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(QrCodeRequestParams qrCodeRequestParams) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                qrCodeRequestParams.deviceType_ = this.deviceType_;
            }
            if ((i & 2) != 0) {
                qrCodeRequestParams.qrCodeType_ = this.qrCodeType_;
            }
            if ((i & 4) != 0) {
                qrCodeRequestParams.modelId_ = this.modelId_;
            }
            if ((i & 8) != 0) {
                qrCodeRequestParams.pid_ = this.pid_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return tz3.m;
        }

        public Builder clearDeviceType() {
            this.bitField0_ &= -2;
            this.deviceType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearModelId() {
            this.modelId_ = QrCodeRequestParams.getDefaultInstance().getModelId();
            this.bitField0_ &= -5;
            onChanged();
            return this;
        }

        public Builder clearPid() {
            this.pid_ = QrCodeRequestParams.getDefaultInstance().getPid();
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }

        public Builder clearQrCodeType() {
            this.bitField0_ &= -3;
            this.qrCodeType_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return tz3.m;
        }

        @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
        public int getDeviceType() {
            return this.deviceType_;
        }

        @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
        public String getModelId() {
            Object obj = this.modelId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.modelId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
        public ByteString getModelIdBytes() {
            Object obj = this.modelId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.modelId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
        public String getPid() {
            Object obj = this.pid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.pid_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
        public ByteString getPidBytes() {
            Object obj = this.pid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
        public InternalQrCodeType getQrCodeType() {
            InternalQrCodeType internalQrCodeTypeForNumber = InternalQrCodeType.forNumber(this.qrCodeType_);
            return internalQrCodeTypeForNumber == null ? InternalQrCodeType.UNRECOGNIZED : internalQrCodeTypeForNumber;
        }

        @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
        public int getQrCodeTypeValue() {
            return this.qrCodeType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return tz3.f17211n.ensureFieldAccessorsInitialized(QrCodeRequestParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setDeviceType(int i) {
            this.deviceType_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setModelId(String str) {
            str.getClass();
            this.modelId_ = str;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setModelIdBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.modelId_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setPid(String str) {
            str.getClass();
            this.pid_ = str;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setPidBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.pid_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setQrCodeType(InternalQrCodeType internalQrCodeType) {
            internalQrCodeType.getClass();
            this.bitField0_ |= 2;
            this.qrCodeType_ = internalQrCodeType.getNumber();
            onChanged();
            return this;
        }

        public Builder setQrCodeTypeValue(int i) {
            this.qrCodeType_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.qrCodeType_ = 0;
            this.modelId_ = "";
            this.pid_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public QrCodeRequestParams build() {
            QrCodeRequestParams qrCodeRequestParamsBuildPartial = buildPartial();
            if (qrCodeRequestParamsBuildPartial.isInitialized()) {
                return qrCodeRequestParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) qrCodeRequestParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public QrCodeRequestParams buildPartial() {
            QrCodeRequestParams qrCodeRequestParams = new QrCodeRequestParams(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(qrCodeRequestParams);
            }
            onBuilt();
            return qrCodeRequestParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public QrCodeRequestParams getDefaultInstanceForType() {
            return QrCodeRequestParams.getDefaultInstance();
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
            this.deviceType_ = 0;
            this.qrCodeType_ = 0;
            this.modelId_ = "";
            this.pid_ = "";
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.qrCodeType_ = 0;
            this.modelId_ = "";
            this.pid_ = "";
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof QrCodeRequestParams) {
                return mergeFrom((QrCodeRequestParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(QrCodeRequestParams qrCodeRequestParams) {
            if (qrCodeRequestParams == QrCodeRequestParams.getDefaultInstance()) {
                return this;
            }
            if (qrCodeRequestParams.getDeviceType() != 0) {
                setDeviceType(qrCodeRequestParams.getDeviceType());
            }
            if (qrCodeRequestParams.qrCodeType_ != 0) {
                setQrCodeTypeValue(qrCodeRequestParams.getQrCodeTypeValue());
            }
            if (!qrCodeRequestParams.getModelId().isEmpty()) {
                this.modelId_ = qrCodeRequestParams.modelId_;
                this.bitField0_ |= 4;
                onChanged();
            }
            if (!qrCodeRequestParams.getPid().isEmpty()) {
                this.pid_ = qrCodeRequestParams.pid_;
                this.bitField0_ |= 8;
                onChanged();
            }
            mergeUnknownFields(qrCodeRequestParams.getUnknownFields());
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
                                this.deviceType_ = codedInputStream.readInt32();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.qrCodeType_ = codedInputStream.readEnum();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.modelId_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 4;
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.pid_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 8;
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

    public enum InternalQrCodeType implements ProtocolMessageEnum {
        CONNECT_PARAMS_P2P_MAC(0),
        CONNECT_PARAMS_P2P_BT_MAC(1),
        UNRECOGNIZED(-1);

        public static final int CONNECT_PARAMS_P2P_BT_MAC_VALUE = 1;
        public static final int CONNECT_PARAMS_P2P_MAC_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<InternalQrCodeType> internalValueMap = new a();
        private static final InternalQrCodeType[] VALUES = values();

        public class a implements Internal.EnumLiteMap<InternalQrCodeType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public InternalQrCodeType findValueByNumber(int i) {
                return InternalQrCodeType.forNumber(i);
            }
        }

        InternalQrCodeType(int i) {
            this.value = i;
        }

        public static InternalQrCodeType forNumber(int i) {
            if (i == 0) {
                return CONNECT_PARAMS_P2P_MAC;
            }
            if (i != 1) {
                return null;
            }
            return CONNECT_PARAMS_P2P_BT_MAC;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return QrCodeRequestParams.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<InternalQrCodeType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static InternalQrCodeType valueOf(int i) {
            return forNumber(i);
        }

        public static InternalQrCodeType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public class a extends AbstractParser<QrCodeRequestParams> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public QrCodeRequestParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = QrCodeRequestParams.newBuilder();
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

    public /* synthetic */ QrCodeRequestParams(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static QrCodeRequestParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return tz3.m;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static QrCodeRequestParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QrCodeRequestParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static QrCodeRequestParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<QrCodeRequestParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QrCodeRequestParams)) {
            return super.equals(obj);
        }
        QrCodeRequestParams qrCodeRequestParams = (QrCodeRequestParams) obj;
        return getDeviceType() == qrCodeRequestParams.getDeviceType() && this.qrCodeType_ == qrCodeRequestParams.qrCodeType_ && getModelId().equals(qrCodeRequestParams.getModelId()) && getPid().equals(qrCodeRequestParams.getPid()) && getUnknownFields().equals(qrCodeRequestParams.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
    public int getDeviceType() {
        return this.deviceType_;
    }

    @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
    public String getModelId() {
        Object obj = this.modelId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.modelId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
    public ByteString getModelIdBytes() {
        Object obj = this.modelId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.modelId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<QrCodeRequestParams> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
    public String getPid() {
        Object obj = this.pid_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.pid_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
    public ByteString getPidBytes() {
        Object obj = this.pid_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.pid_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
    public InternalQrCodeType getQrCodeType() {
        InternalQrCodeType internalQrCodeTypeForNumber = InternalQrCodeType.forNumber(this.qrCodeType_);
        return internalQrCodeTypeForNumber == null ? InternalQrCodeType.UNRECOGNIZED : internalQrCodeTypeForNumber;
    }

    @Override // com.oplus.pantaconnect.connection.QrCodeRequestParamsOrBuilder
    public int getQrCodeTypeValue() {
        return this.qrCodeType_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.deviceType_;
        int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
        if (this.qrCodeType_ != InternalQrCodeType.CONNECT_PARAMS_P2P_MAC.getNumber()) {
            iComputeInt32Size += CodedOutputStream.computeEnumSize(2, this.qrCodeType_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.modelId_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(3, this.modelId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.pid_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.pid_);
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
        int iHashCode = getUnknownFields().hashCode() + ((getPid().hashCode() + ((((getModelId().hashCode() + ((((((((getDeviceType() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53) + this.qrCodeType_) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return tz3.f17211n.ensureFieldAccessorsInitialized(QrCodeRequestParams.class, Builder.class);
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
        return new QrCodeRequestParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.deviceType_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        if (this.qrCodeType_ != InternalQrCodeType.CONNECT_PARAMS_P2P_MAC.getNumber()) {
            codedOutputStream.writeEnum(2, this.qrCodeType_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.modelId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 3, this.modelId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.pid_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 4, this.pid_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private QrCodeRequestParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.deviceType_ = 0;
        this.qrCodeType_ = 0;
        this.modelId_ = "";
        this.pid_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(QrCodeRequestParams qrCodeRequestParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(qrCodeRequestParams);
    }

    public static QrCodeRequestParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static QrCodeRequestParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QrCodeRequestParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static QrCodeRequestParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public QrCodeRequestParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static QrCodeRequestParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static QrCodeRequestParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static QrCodeRequestParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static QrCodeRequestParams parseFrom(InputStream inputStream) throws IOException {
        return (QrCodeRequestParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private QrCodeRequestParams() {
        this.deviceType_ = 0;
        this.qrCodeType_ = 0;
        this.modelId_ = "";
        this.pid_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.qrCodeType_ = 0;
        this.modelId_ = "";
        this.pid_ = "";
    }

    public static QrCodeRequestParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QrCodeRequestParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static QrCodeRequestParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QrCodeRequestParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static QrCodeRequestParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QrCodeRequestParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
