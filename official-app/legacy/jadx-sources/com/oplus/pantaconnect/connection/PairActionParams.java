package com.oplus.pantaconnect.connection;

import com.google.protobuf.AbstractMessage;
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
public final class PairActionParams extends GeneratedMessageV3 implements PairActionParamsOrBuilder {
    public static final int CONFIRMTYPE_FIELD_NUMBER = 3;
    public static final int DISPLAYDEVICE_FIELD_NUMBER = 1;
    public static final int PAIRACTION_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int confirmType_;
    private ByteString displayDevice_;
    private byte memoizedIsInitialized;
    private int pairAction_;
    private static final PairActionParams DEFAULT_INSTANCE = new PairActionParams();
    private static final Parser<PairActionParams> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairActionParamsOrBuilder {
        private int bitField0_;
        private int confirmType_;
        private ByteString displayDevice_;
        private int pairAction_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(PairActionParams pairActionParams) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                pairActionParams.displayDevice_ = this.displayDevice_;
            }
            if ((i & 2) != 0) {
                pairActionParams.pairAction_ = this.pairAction_;
            }
            if ((i & 4) != 0) {
                pairActionParams.confirmType_ = this.confirmType_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return tz3.f17208e;
        }

        public Builder clearConfirmType() {
            this.bitField0_ &= -5;
            this.confirmType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDisplayDevice() {
            this.bitField0_ &= -2;
            this.displayDevice_ = PairActionParams.getDefaultInstance().getDisplayDevice();
            onChanged();
            return this;
        }

        public Builder clearPairAction() {
            this.bitField0_ &= -3;
            this.pairAction_ = 0;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
        public ConfirmType getConfirmType() {
            ConfirmType confirmTypeForNumber = ConfirmType.forNumber(this.confirmType_);
            return confirmTypeForNumber == null ? ConfirmType.UNRECOGNIZED : confirmTypeForNumber;
        }

        @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
        public int getConfirmTypeValue() {
            return this.confirmType_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return tz3.f17208e;
        }

        @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
        public ByteString getDisplayDevice() {
            return this.displayDevice_;
        }

        @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
        public InternalPairAction getPairAction() {
            InternalPairAction internalPairActionForNumber = InternalPairAction.forNumber(this.pairAction_);
            return internalPairActionForNumber == null ? InternalPairAction.UNRECOGNIZED : internalPairActionForNumber;
        }

        @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
        public int getPairActionValue() {
            return this.pairAction_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return tz3.f.ensureFieldAccessorsInitialized(PairActionParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setConfirmType(ConfirmType confirmType) {
            confirmType.getClass();
            this.bitField0_ |= 4;
            this.confirmType_ = confirmType.getNumber();
            onChanged();
            return this;
        }

        public Builder setConfirmTypeValue(int i) {
            this.confirmType_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setDisplayDevice(ByteString byteString) {
            byteString.getClass();
            this.displayDevice_ = byteString;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setPairAction(InternalPairAction internalPairAction) {
            internalPairAction.getClass();
            this.bitField0_ |= 2;
            this.pairAction_ = internalPairAction.getNumber();
            onChanged();
            return this;
        }

        public Builder setPairActionValue(int i) {
            this.pairAction_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.displayDevice_ = ByteString.EMPTY;
            this.pairAction_ = 0;
            this.confirmType_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PairActionParams build() {
            PairActionParams pairActionParamsBuildPartial = buildPartial();
            if (pairActionParamsBuildPartial.isInitialized()) {
                return pairActionParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairActionParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public PairActionParams buildPartial() {
            PairActionParams pairActionParams = new PairActionParams(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(pairActionParams);
            }
            onBuilt();
            return pairActionParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairActionParams getDefaultInstanceForType() {
            return PairActionParams.getDefaultInstance();
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
            this.displayDevice_ = ByteString.EMPTY;
            this.pairAction_ = 0;
            this.confirmType_ = 0;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.displayDevice_ = ByteString.EMPTY;
            this.pairAction_ = 0;
            this.confirmType_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof PairActionParams) {
                return mergeFrom((PairActionParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(PairActionParams pairActionParams) {
            if (pairActionParams == PairActionParams.getDefaultInstance()) {
                return this;
            }
            if (pairActionParams.getDisplayDevice() != ByteString.EMPTY) {
                setDisplayDevice(pairActionParams.getDisplayDevice());
            }
            if (pairActionParams.pairAction_ != 0) {
                setPairActionValue(pairActionParams.getPairActionValue());
            }
            if (pairActionParams.confirmType_ != 0) {
                setConfirmTypeValue(pairActionParams.getConfirmTypeValue());
            }
            mergeUnknownFields(pairActionParams.getUnknownFields());
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
                                this.displayDevice_ = codedInputStream.readBytes();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.pairAction_ = codedInputStream.readEnum();
                                this.bitField0_ |= 2;
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.confirmType_ = codedInputStream.readEnum();
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

    public enum ConfirmType implements ProtocolMessageEnum {
        CONFIRM_FOR_ADVERTISE(0),
        CONFIRM_FOR_QR_CODE(1),
        CONFIRM_FOR_QR_CODE_COMPAT_P2P(2),
        UNRECOGNIZED(-1);

        public static final int CONFIRM_FOR_ADVERTISE_VALUE = 0;
        public static final int CONFIRM_FOR_QR_CODE_COMPAT_P2P_VALUE = 2;
        public static final int CONFIRM_FOR_QR_CODE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<ConfirmType> internalValueMap = new a();
        private static final ConfirmType[] VALUES = values();

        public class a implements Internal.EnumLiteMap<ConfirmType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ConfirmType findValueByNumber(int i) {
                return ConfirmType.forNumber(i);
            }
        }

        ConfirmType(int i) {
            this.value = i;
        }

        public static ConfirmType forNumber(int i) {
            if (i == 0) {
                return CONFIRM_FOR_ADVERTISE;
            }
            if (i == 1) {
                return CONFIRM_FOR_QR_CODE;
            }
            if (i != 2) {
                return null;
            }
            return CONFIRM_FOR_QR_CODE_COMPAT_P2P;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return PairActionParams.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ConfirmType> internalGetValueMap() {
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
        public static ConfirmType valueOf(int i) {
            return forNumber(i);
        }

        public static ConfirmType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public class a extends AbstractParser<PairActionParams> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PairActionParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = PairActionParams.newBuilder();
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

    public /* synthetic */ PairActionParams(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static PairActionParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return tz3.f17208e;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static PairActionParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PairActionParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static PairActionParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<PairActionParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PairActionParams)) {
            return super.equals(obj);
        }
        PairActionParams pairActionParams = (PairActionParams) obj;
        return getDisplayDevice().equals(pairActionParams.getDisplayDevice()) && this.pairAction_ == pairActionParams.pairAction_ && this.confirmType_ == pairActionParams.confirmType_ && getUnknownFields().equals(pairActionParams.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
    public ConfirmType getConfirmType() {
        ConfirmType confirmTypeForNumber = ConfirmType.forNumber(this.confirmType_);
        return confirmTypeForNumber == null ? ConfirmType.UNRECOGNIZED : confirmTypeForNumber;
    }

    @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
    public int getConfirmTypeValue() {
        return this.confirmType_;
    }

    @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
    public ByteString getDisplayDevice() {
        return this.displayDevice_;
    }

    @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
    public InternalPairAction getPairAction() {
        InternalPairAction internalPairActionForNumber = InternalPairAction.forNumber(this.pairAction_);
        return internalPairActionForNumber == null ? InternalPairAction.UNRECOGNIZED : internalPairActionForNumber;
    }

    @Override // com.oplus.pantaconnect.connection.PairActionParamsOrBuilder
    public int getPairActionValue() {
        return this.pairAction_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<PairActionParams> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeBytesSize = !this.displayDevice_.isEmpty() ? CodedOutputStream.computeBytesSize(1, this.displayDevice_) : 0;
        if (this.pairAction_ != InternalPairAction.UNKNOWN.getNumber()) {
            iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.pairAction_);
        }
        if (this.confirmType_ != ConfirmType.CONFIRM_FOR_ADVERTISE.getNumber()) {
            iComputeBytesSize += CodedOutputStream.computeEnumSize(3, this.confirmType_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((((((((((getDisplayDevice().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53) + this.pairAction_) * 37) + 3) * 53) + this.confirmType_) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return tz3.f.ensureFieldAccessorsInitialized(PairActionParams.class, Builder.class);
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
        return new PairActionParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.displayDevice_.isEmpty()) {
            codedOutputStream.writeBytes(1, this.displayDevice_);
        }
        if (this.pairAction_ != InternalPairAction.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(2, this.pairAction_);
        }
        if (this.confirmType_ != ConfirmType.CONFIRM_FOR_ADVERTISE.getNumber()) {
            codedOutputStream.writeEnum(3, this.confirmType_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private PairActionParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.displayDevice_ = ByteString.EMPTY;
        this.pairAction_ = 0;
        this.confirmType_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(PairActionParams pairActionParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairActionParams);
    }

    public static PairActionParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static PairActionParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PairActionParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PairActionParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public PairActionParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static PairActionParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static PairActionParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static PairActionParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private PairActionParams() {
        ByteString byteString = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
        this.displayDevice_ = byteString;
        this.pairAction_ = 0;
        this.confirmType_ = 0;
    }

    public static PairActionParams parseFrom(InputStream inputStream) throws IOException {
        return (PairActionParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static PairActionParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PairActionParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static PairActionParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PairActionParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static PairActionParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PairActionParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
