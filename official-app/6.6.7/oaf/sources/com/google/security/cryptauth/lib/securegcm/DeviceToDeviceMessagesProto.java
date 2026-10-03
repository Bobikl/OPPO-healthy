package com.google.security.cryptauth.lib.securegcm;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.google.security.cryptauth.lib.securemessage.SecureMessageProto;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class DeviceToDeviceMessagesProto {
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_securegcm_DeviceToDeviceMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_DeviceToDeviceMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_EcPoint_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_EcPoint_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_InitiatorHello_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_InitiatorHello_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_ResponderHello_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_ResponderHello_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_securegcm_SpakeHandshakeMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_securegcm_SpakeHandshakeMessage_fieldAccessorTable;

    public enum Curve implements ProtocolMessageEnum {
        ED_25519(1);

        public static final int ED_25519_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<Curve> internalValueMap = new Internal.EnumLiteMap<Curve>() { // from class: com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.Curve.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Curve findValueByNumber(int i) {
                return Curve.forNumber(i);
            }
        };
        private static final Curve[] VALUES = values();

        Curve(int i) {
            this.value = i;
        }

        public static Curve forNumber(int i) {
            if (i != 1) {
                return null;
            }
            return ED_25519;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return DeviceToDeviceMessagesProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<Curve> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        @Override // com.google.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        @Deprecated
        public static Curve valueOf(int i) {
            return forNumber(i);
        }

        public static Curve valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class DeviceToDeviceMessage extends GeneratedMessageV3 implements DeviceToDeviceMessageOrBuilder {
        public static final int MESSAGE_FIELD_NUMBER = 1;
        public static final int SEQUENCE_NUMBER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString message_;
        private int sequenceNumber_;
        private static final DeviceToDeviceMessage DEFAULT_INSTANCE = new DeviceToDeviceMessage();

        @Deprecated
        public static final Parser<DeviceToDeviceMessage> PARSER = new AbstractParser<DeviceToDeviceMessage>() { // from class: com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessage.1
            @Override // com.google.protobuf.Parser
            public DeviceToDeviceMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new DeviceToDeviceMessage(codedInputStream, extensionRegistryLite);
            }
        };

        public static DeviceToDeviceMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_DeviceToDeviceMessage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceToDeviceMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceToDeviceMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceToDeviceMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<DeviceToDeviceMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceToDeviceMessage)) {
                return super.equals(obj);
            }
            DeviceToDeviceMessage deviceToDeviceMessage = (DeviceToDeviceMessage) obj;
            boolean z = hasMessage() == deviceToDeviceMessage.hasMessage();
            if (hasMessage()) {
                z = z && getMessage().equals(deviceToDeviceMessage.getMessage());
            }
            boolean z2 = z && hasSequenceNumber() == deviceToDeviceMessage.hasSequenceNumber();
            if (hasSequenceNumber()) {
                z2 = z2 && getSequenceNumber() == deviceToDeviceMessage.getSequenceNumber();
            }
            return z2 && this.unknownFields.equals(deviceToDeviceMessage.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
        public ByteString getMessage() {
            return this.message_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceToDeviceMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
        public int getSequenceNumber() {
            return this.sequenceNumber_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeBytesSize(1, this.message_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeBytesSize += CodedOutputStream.computeInt32Size(2, this.sequenceNumber_);
            }
            int serializedSize = iComputeBytesSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
        public boolean hasMessage() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
        public boolean hasSequenceNumber() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasMessage()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMessage().hashCode();
            }
            if (hasSequenceNumber()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getSequenceNumber();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_DeviceToDeviceMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceToDeviceMessage.class, Builder.class);
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

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeBytes(1, this.message_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.sequenceNumber_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceToDeviceMessageOrBuilder {
            private int bitField0_;
            private ByteString message_;
            private int sequenceNumber_;

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_DeviceToDeviceMessage_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearMessage() {
                this.bitField0_ &= -2;
                this.message_ = DeviceToDeviceMessage.getDefaultInstance().getMessage();
                onChanged();
                return this;
            }

            public Builder clearSequenceNumber() {
                this.bitField0_ &= -3;
                this.sequenceNumber_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_DeviceToDeviceMessage_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
            public ByteString getMessage() {
                return this.message_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
            public int getSequenceNumber() {
                return this.sequenceNumber_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
            public boolean hasMessage() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.DeviceToDeviceMessageOrBuilder
            public boolean hasSequenceNumber() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_DeviceToDeviceMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceToDeviceMessage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setMessage(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 1;
                this.message_ = byteString;
                onChanged();
                return this;
            }

            public Builder setSequenceNumber(int i) {
                this.bitField0_ |= 2;
                this.sequenceNumber_ = i;
                onChanged();
                return this;
            }

            private Builder() {
                this.message_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceToDeviceMessage build() {
                DeviceToDeviceMessage deviceToDeviceMessageBuildPartial = buildPartial();
                if (deviceToDeviceMessageBuildPartial.isInitialized()) {
                    return deviceToDeviceMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceToDeviceMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceToDeviceMessage buildPartial() {
                DeviceToDeviceMessage deviceToDeviceMessage = new DeviceToDeviceMessage(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                deviceToDeviceMessage.message_ = this.message_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                deviceToDeviceMessage.sequenceNumber_ = this.sequenceNumber_;
                deviceToDeviceMessage.bitField0_ = i2;
                onBuilt();
                return deviceToDeviceMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DeviceToDeviceMessage getDefaultInstanceForType() {
                return DeviceToDeviceMessage.getDefaultInstance();
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
                this.message_ = ByteString.EMPTY;
                int i = this.bitField0_ & (-2);
                this.sequenceNumber_ = 0;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.message_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceToDeviceMessage) {
                    return mergeFrom((DeviceToDeviceMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceToDeviceMessage deviceToDeviceMessage) {
                if (deviceToDeviceMessage == DeviceToDeviceMessage.getDefaultInstance()) {
                    return this;
                }
                if (deviceToDeviceMessage.hasMessage()) {
                    setMessage(deviceToDeviceMessage.getMessage());
                }
                if (deviceToDeviceMessage.hasSequenceNumber()) {
                    setSequenceNumber(deviceToDeviceMessage.getSequenceNumber());
                }
                mergeUnknownFields(((GeneratedMessageV3) deviceToDeviceMessage).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                DeviceToDeviceMessage deviceToDeviceMessage = null;
                try {
                    try {
                        DeviceToDeviceMessage partialFrom = DeviceToDeviceMessage.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        DeviceToDeviceMessage deviceToDeviceMessage2 = (DeviceToDeviceMessage) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            deviceToDeviceMessage = deviceToDeviceMessage2;
                            if (deviceToDeviceMessage != null) {
                                mergeFrom(deviceToDeviceMessage);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (deviceToDeviceMessage != null) {
                        mergeFrom(deviceToDeviceMessage);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(DeviceToDeviceMessage deviceToDeviceMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceToDeviceMessage);
        }

        public static DeviceToDeviceMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private DeviceToDeviceMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceToDeviceMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceToDeviceMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceToDeviceMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceToDeviceMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DeviceToDeviceMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DeviceToDeviceMessage() {
            this.memoizedIsInitialized = (byte) -1;
            this.message_ = ByteString.EMPTY;
            this.sequenceNumber_ = 0;
        }

        public static DeviceToDeviceMessage parseFrom(InputStream inputStream) throws IOException {
            return (DeviceToDeviceMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static DeviceToDeviceMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceToDeviceMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private DeviceToDeviceMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.bitField0_ |= 1;
                                this.message_ = codedInputStream.readBytes();
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.sequenceNumber_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static DeviceToDeviceMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DeviceToDeviceMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceToDeviceMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DeviceToDeviceMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface DeviceToDeviceMessageOrBuilder extends MessageOrBuilder {
        ByteString getMessage();

        int getSequenceNumber();

        boolean hasMessage();

        boolean hasSequenceNumber();
    }

    public static final class EcPoint extends GeneratedMessageV3 implements EcPointOrBuilder {
        public static final int CURVE_FIELD_NUMBER = 1;
        private static final EcPoint DEFAULT_INSTANCE = new EcPoint();

        @Deprecated
        public static final Parser<EcPoint> PARSER = new AbstractParser<EcPoint>() { // from class: com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPoint.1
            @Override // com.google.protobuf.Parser
            public EcPoint parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EcPoint(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int X_FIELD_NUMBER = 2;
        public static final int Y_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int curve_;
        private byte memoizedIsInitialized;
        private ByteString x_;
        private ByteString y_;

        public static EcPoint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_EcPoint_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EcPoint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EcPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EcPoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<EcPoint> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EcPoint)) {
                return super.equals(obj);
            }
            EcPoint ecPoint = (EcPoint) obj;
            boolean z = hasCurve() == ecPoint.hasCurve();
            if (hasCurve()) {
                z = z && this.curve_ == ecPoint.curve_;
            }
            boolean z2 = z && hasX() == ecPoint.hasX();
            if (hasX()) {
                z2 = z2 && getX().equals(ecPoint.getX());
            }
            boolean z3 = z2 && hasY() == ecPoint.hasY();
            if (hasY()) {
                z3 = z3 && getY().equals(ecPoint.getY());
            }
            return z3 && this.unknownFields.equals(ecPoint.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
        public Curve getCurve() {
            Curve curveValueOf = Curve.valueOf(this.curve_);
            return curveValueOf == null ? Curve.ED_25519 : curveValueOf;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EcPoint> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeEnumSize(1, this.curve_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.x_);
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.y_);
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
        public ByteString getX() {
            return this.x_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
        public ByteString getY() {
            return this.y_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
        public boolean hasCurve() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
        public boolean hasX() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
        public boolean hasY() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasCurve()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.curve_;
            }
            if (hasX()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getX().hashCode();
            }
            if (hasY()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getY().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_EcPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(EcPoint.class, Builder.class);
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
            if (!hasCurve()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasX()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasY()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeEnum(1, this.curve_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeBytes(2, this.x_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.y_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EcPointOrBuilder {
            private int bitField0_;
            private int curve_;
            private ByteString x_;
            private ByteString y_;

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_EcPoint_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder clearCurve() {
                this.bitField0_ &= -2;
                this.curve_ = 1;
                onChanged();
                return this;
            }

            public Builder clearX() {
                this.bitField0_ &= -3;
                this.x_ = EcPoint.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.bitField0_ &= -5;
                this.y_ = EcPoint.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
            public Curve getCurve() {
                Curve curveValueOf = Curve.valueOf(this.curve_);
                return curveValueOf == null ? Curve.ED_25519 : curveValueOf;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_EcPoint_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
            public ByteString getX() {
                return this.x_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
            public ByteString getY() {
                return this.y_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
            public boolean hasCurve() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
            public boolean hasX() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.EcPointOrBuilder
            public boolean hasY() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_EcPoint_fieldAccessorTable.ensureFieldAccessorsInitialized(EcPoint.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCurve() && hasX() && hasY();
            }

            public Builder setCurve(Curve curve) {
                curve.getClass();
                this.bitField0_ |= 1;
                this.curve_ = curve.getNumber();
                onChanged();
                return this;
            }

            public Builder setX(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 2;
                this.x_ = byteString;
                onChanged();
                return this;
            }

            public Builder setY(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.y_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.curve_ = 1;
                ByteString byteString = ByteString.EMPTY;
                this.x_ = byteString;
                this.y_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EcPoint build() {
                EcPoint ecPointBuildPartial = buildPartial();
                if (ecPointBuildPartial.isInitialized()) {
                    return ecPointBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ecPointBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EcPoint buildPartial() {
                EcPoint ecPoint = new EcPoint(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                ecPoint.curve_ = this.curve_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ecPoint.x_ = this.x_;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                ecPoint.y_ = this.y_;
                ecPoint.bitField0_ = i2;
                onBuilt();
                return ecPoint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EcPoint getDefaultInstanceForType() {
                return EcPoint.getDefaultInstance();
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
                this.curve_ = 1;
                int i = this.bitField0_ & (-2);
                this.bitField0_ = i;
                ByteString byteString = ByteString.EMPTY;
                this.x_ = byteString;
                this.y_ = byteString;
                this.bitField0_ = i & (-3) & (-5);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EcPoint) {
                    return mergeFrom((EcPoint) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.curve_ = 1;
                ByteString byteString = ByteString.EMPTY;
                this.x_ = byteString;
                this.y_ = byteString;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(EcPoint ecPoint) {
                if (ecPoint == EcPoint.getDefaultInstance()) {
                    return this;
                }
                if (ecPoint.hasCurve()) {
                    setCurve(ecPoint.getCurve());
                }
                if (ecPoint.hasX()) {
                    setX(ecPoint.getX());
                }
                if (ecPoint.hasY()) {
                    setY(ecPoint.getY());
                }
                mergeUnknownFields(((GeneratedMessageV3) ecPoint).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EcPoint ecPoint = null;
                try {
                    try {
                        EcPoint partialFrom = EcPoint.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        EcPoint ecPoint2 = (EcPoint) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            ecPoint = ecPoint2;
                            if (ecPoint != null) {
                                mergeFrom(ecPoint);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ecPoint != null) {
                        mergeFrom(ecPoint);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(EcPoint ecPoint) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(ecPoint);
        }

        public static EcPoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private EcPoint(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EcPoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EcPoint) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EcPoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EcPoint getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static EcPoint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private EcPoint() {
            this.memoizedIsInitialized = (byte) -1;
            this.curve_ = 1;
            ByteString byteString = ByteString.EMPTY;
            this.x_ = byteString;
            this.y_ = byteString;
        }

        public static EcPoint parseFrom(InputStream inputStream) throws IOException {
            return (EcPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static EcPoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EcPoint) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EcPoint parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EcPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private EcPoint(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                int i = codedInputStream.readEnum();
                                if (Curve.valueOf(i) == null) {
                                    builderNewBuilder.mergeVarintField(1, i);
                                } else {
                                    this.bitField0_ = 1 | this.bitField0_;
                                    this.curve_ = i;
                                }
                            } else if (tag == 18) {
                                this.bitField0_ |= 2;
                                this.x_ = codedInputStream.readBytes();
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 4;
                                this.y_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static EcPoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EcPoint) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EcPointOrBuilder extends MessageOrBuilder {
        Curve getCurve();

        ByteString getX();

        ByteString getY();

        boolean hasCurve();

        boolean hasX();

        boolean hasY();
    }

    public static final class InitiatorHello extends GeneratedMessageV3 implements InitiatorHelloOrBuilder {
        private static final InitiatorHello DEFAULT_INSTANCE = new InitiatorHello();

        @Deprecated
        public static final Parser<InitiatorHello> PARSER = new AbstractParser<InitiatorHello>() { // from class: com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHello.1
            @Override // com.google.protobuf.Parser
            public InitiatorHello parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new InitiatorHello(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROTOCOL_VERSION_FIELD_NUMBER = 2;
        public static final int PUBLIC_DH_KEY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int protocolVersion_;
        private SecureMessageProto.GenericPublicKey publicDhKey_;

        public static InitiatorHello getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_InitiatorHello_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InitiatorHello parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (InitiatorHello) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InitiatorHello parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<InitiatorHello> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InitiatorHello)) {
                return super.equals(obj);
            }
            InitiatorHello initiatorHello = (InitiatorHello) obj;
            boolean z = hasPublicDhKey() == initiatorHello.hasPublicDhKey();
            if (hasPublicDhKey()) {
                z = z && getPublicDhKey().equals(initiatorHello.getPublicDhKey());
            }
            boolean z2 = z && hasProtocolVersion() == initiatorHello.hasProtocolVersion();
            if (hasProtocolVersion()) {
                z2 = z2 && getProtocolVersion() == initiatorHello.getProtocolVersion();
            }
            return z2 && this.unknownFields.equals(initiatorHello.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InitiatorHello> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
        public int getProtocolVersion() {
            return this.protocolVersion_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
        public SecureMessageProto.GenericPublicKey getPublicDhKey() {
            SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
            return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
        public SecureMessageProto.GenericPublicKeyOrBuilder getPublicDhKeyOrBuilder() {
            SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
            return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeMessageSize(1, getPublicDhKey()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(2, this.protocolVersion_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
        public boolean hasProtocolVersion() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
        public boolean hasPublicDhKey() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasPublicDhKey()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPublicDhKey().hashCode();
            }
            if (hasProtocolVersion()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getProtocolVersion();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_InitiatorHello_fieldAccessorTable.ensureFieldAccessorsInitialized(InitiatorHello.class, Builder.class);
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
            if (!hasPublicDhKey() || getPublicDhKey().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getPublicDhKey());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.protocolVersion_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitiatorHelloOrBuilder {
            private int bitField0_;
            private int protocolVersion_;
            private SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> publicDhKeyBuilder_;
            private SecureMessageProto.GenericPublicKey publicDhKey_;

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_InitiatorHello_descriptor;
            }

            private SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> getPublicDhKeyFieldBuilder() {
                if (this.publicDhKeyBuilder_ == null) {
                    this.publicDhKeyBuilder_ = new SingleFieldBuilderV3<>(getPublicDhKey(), getParentForChildren(), isClean());
                    this.publicDhKey_ = null;
                }
                return this.publicDhKeyBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPublicDhKeyFieldBuilder();
                }
            }

            public Builder clearProtocolVersion() {
                this.bitField0_ &= -3;
                this.protocolVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPublicDhKey() {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.publicDhKey_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_InitiatorHello_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
            public int getProtocolVersion() {
                return this.protocolVersion_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
            public SecureMessageProto.GenericPublicKey getPublicDhKey() {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SecureMessageProto.GenericPublicKey) singleFieldBuilderV3.getMessage();
                }
                SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
                return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
            }

            public SecureMessageProto.GenericPublicKey.Builder getPublicDhKeyBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SecureMessageProto.GenericPublicKey.Builder) getPublicDhKeyFieldBuilder().getBuilder();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
            public SecureMessageProto.GenericPublicKeyOrBuilder getPublicDhKeyOrBuilder() {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SecureMessageProto.GenericPublicKeyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
                return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
            public boolean hasProtocolVersion() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.InitiatorHelloOrBuilder
            public boolean hasPublicDhKey() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_InitiatorHello_fieldAccessorTable.ensureFieldAccessorsInitialized(InitiatorHello.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasPublicDhKey() || getPublicDhKey().isInitialized();
            }

            public Builder mergePublicDhKey(SecureMessageProto.GenericPublicKey genericPublicKey) {
                SecureMessageProto.GenericPublicKey genericPublicKey2;
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 1 || (genericPublicKey2 = this.publicDhKey_) == null || genericPublicKey2 == SecureMessageProto.GenericPublicKey.getDefaultInstance()) {
                        this.publicDhKey_ = genericPublicKey;
                    } else {
                        this.publicDhKey_ = SecureMessageProto.GenericPublicKey.newBuilder(this.publicDhKey_).mergeFrom(genericPublicKey).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(genericPublicKey);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setProtocolVersion(int i) {
                this.bitField0_ |= 2;
                this.protocolVersion_ = i;
                onChanged();
                return this;
            }

            public Builder setPublicDhKey(SecureMessageProto.GenericPublicKey genericPublicKey) {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    genericPublicKey.getClass();
                    this.publicDhKey_ = genericPublicKey;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(genericPublicKey);
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder() {
                this.publicDhKey_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitiatorHello build() {
                InitiatorHello initiatorHelloBuildPartial = buildPartial();
                if (initiatorHelloBuildPartial.isInitialized()) {
                    return initiatorHelloBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) initiatorHelloBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitiatorHello buildPartial() {
                InitiatorHello initiatorHello = new InitiatorHello(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    initiatorHello.publicDhKey_ = this.publicDhKey_;
                } else {
                    initiatorHello.publicDhKey_ = (SecureMessageProto.GenericPublicKey) singleFieldBuilderV3.build();
                }
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                initiatorHello.protocolVersion_ = this.protocolVersion_;
                initiatorHello.bitField0_ = i2;
                onBuilt();
                return initiatorHello;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InitiatorHello getDefaultInstanceForType() {
                return InitiatorHello.getDefaultInstance();
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
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.publicDhKey_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                int i = this.bitField0_ & (-2);
                this.protocolVersion_ = 0;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.publicDhKey_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InitiatorHello) {
                    return mergeFrom((InitiatorHello) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPublicDhKey(SecureMessageProto.GenericPublicKey.Builder builder) {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.publicDhKey_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeFrom(InitiatorHello initiatorHello) {
                if (initiatorHello == InitiatorHello.getDefaultInstance()) {
                    return this;
                }
                if (initiatorHello.hasPublicDhKey()) {
                    mergePublicDhKey(initiatorHello.getPublicDhKey());
                }
                if (initiatorHello.hasProtocolVersion()) {
                    setProtocolVersion(initiatorHello.getProtocolVersion());
                }
                mergeUnknownFields(((GeneratedMessageV3) initiatorHello).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                InitiatorHello initiatorHello = null;
                try {
                    try {
                        InitiatorHello partialFrom = InitiatorHello.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        InitiatorHello initiatorHello2 = (InitiatorHello) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            initiatorHello = initiatorHello2;
                            if (initiatorHello != null) {
                                mergeFrom(initiatorHello);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (initiatorHello != null) {
                        mergeFrom(initiatorHello);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(InitiatorHello initiatorHello) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(initiatorHello);
        }

        public static InitiatorHello parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private InitiatorHello(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InitiatorHello parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitiatorHello) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitiatorHello parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InitiatorHello getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static InitiatorHello parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private InitiatorHello() {
            this.memoizedIsInitialized = (byte) -1;
            this.protocolVersion_ = 0;
        }

        public static InitiatorHello parseFrom(InputStream inputStream) throws IOException {
            return (InitiatorHello) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static InitiatorHello parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitiatorHello) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private InitiatorHello(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                SecureMessageProto.GenericPublicKey.Builder builder = (this.bitField0_ & 1) == 1 ? this.publicDhKey_.toBuilder() : null;
                                SecureMessageProto.GenericPublicKey genericPublicKey = (SecureMessageProto.GenericPublicKey) codedInputStream.readMessage(SecureMessageProto.GenericPublicKey.PARSER, extensionRegistryLite);
                                this.publicDhKey_ = genericPublicKey;
                                if (builder != null) {
                                    builder.mergeFrom(genericPublicKey);
                                    this.publicDhKey_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.protocolVersion_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static InitiatorHello parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (InitiatorHello) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InitiatorHello parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (InitiatorHello) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface InitiatorHelloOrBuilder extends MessageOrBuilder {
        int getProtocolVersion();

        SecureMessageProto.GenericPublicKey getPublicDhKey();

        SecureMessageProto.GenericPublicKeyOrBuilder getPublicDhKeyOrBuilder();

        boolean hasProtocolVersion();

        boolean hasPublicDhKey();
    }

    public static final class ResponderHello extends GeneratedMessageV3 implements ResponderHelloOrBuilder {
        private static final ResponderHello DEFAULT_INSTANCE = new ResponderHello();

        @Deprecated
        public static final Parser<ResponderHello> PARSER = new AbstractParser<ResponderHello>() { // from class: com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHello.1
            @Override // com.google.protobuf.Parser
            public ResponderHello parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ResponderHello(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int PROTOCOL_VERSION_FIELD_NUMBER = 2;
        public static final int PUBLIC_DH_KEY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int protocolVersion_;
        private SecureMessageProto.GenericPublicKey publicDhKey_;

        public static ResponderHello getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_ResponderHello_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResponderHello parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ResponderHello) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResponderHello parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<ResponderHello> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResponderHello)) {
                return super.equals(obj);
            }
            ResponderHello responderHello = (ResponderHello) obj;
            boolean z = hasPublicDhKey() == responderHello.hasPublicDhKey();
            if (hasPublicDhKey()) {
                z = z && getPublicDhKey().equals(responderHello.getPublicDhKey());
            }
            boolean z2 = z && hasProtocolVersion() == responderHello.hasProtocolVersion();
            if (hasProtocolVersion()) {
                z2 = z2 && getProtocolVersion() == responderHello.getProtocolVersion();
            }
            return z2 && this.unknownFields.equals(responderHello.unknownFields);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResponderHello> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
        public int getProtocolVersion() {
            return this.protocolVersion_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
        public SecureMessageProto.GenericPublicKey getPublicDhKey() {
            SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
            return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
        public SecureMessageProto.GenericPublicKeyOrBuilder getPublicDhKeyOrBuilder() {
            SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
            return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeMessageSize(1, getPublicDhKey()) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(2, this.protocolVersion_);
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
        public boolean hasProtocolVersion() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
        public boolean hasPublicDhKey() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasPublicDhKey()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getPublicDhKey().hashCode();
            }
            if (hasProtocolVersion()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getProtocolVersion();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_ResponderHello_fieldAccessorTable.ensureFieldAccessorsInitialized(ResponderHello.class, Builder.class);
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
            if (!hasPublicDhKey() || getPublicDhKey().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeMessage(1, getPublicDhKey());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeInt32(2, this.protocolVersion_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResponderHelloOrBuilder {
            private int bitField0_;
            private int protocolVersion_;
            private SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> publicDhKeyBuilder_;
            private SecureMessageProto.GenericPublicKey publicDhKey_;

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_ResponderHello_descriptor;
            }

            private SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> getPublicDhKeyFieldBuilder() {
                if (this.publicDhKeyBuilder_ == null) {
                    this.publicDhKeyBuilder_ = new SingleFieldBuilderV3<>(getPublicDhKey(), getParentForChildren(), isClean());
                    this.publicDhKey_ = null;
                }
                return this.publicDhKeyBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPublicDhKeyFieldBuilder();
                }
            }

            public Builder clearProtocolVersion() {
                this.bitField0_ &= -3;
                this.protocolVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPublicDhKey() {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.publicDhKey_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_ResponderHello_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
            public int getProtocolVersion() {
                return this.protocolVersion_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
            public SecureMessageProto.GenericPublicKey getPublicDhKey() {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SecureMessageProto.GenericPublicKey) singleFieldBuilderV3.getMessage();
                }
                SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
                return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
            }

            public SecureMessageProto.GenericPublicKey.Builder getPublicDhKeyBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SecureMessageProto.GenericPublicKey.Builder) getPublicDhKeyFieldBuilder().getBuilder();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
            public SecureMessageProto.GenericPublicKeyOrBuilder getPublicDhKeyOrBuilder() {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SecureMessageProto.GenericPublicKeyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SecureMessageProto.GenericPublicKey genericPublicKey = this.publicDhKey_;
                return genericPublicKey == null ? SecureMessageProto.GenericPublicKey.getDefaultInstance() : genericPublicKey;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
            public boolean hasProtocolVersion() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.ResponderHelloOrBuilder
            public boolean hasPublicDhKey() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_ResponderHello_fieldAccessorTable.ensureFieldAccessorsInitialized(ResponderHello.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasPublicDhKey() || getPublicDhKey().isInitialized();
            }

            public Builder mergePublicDhKey(SecureMessageProto.GenericPublicKey genericPublicKey) {
                SecureMessageProto.GenericPublicKey genericPublicKey2;
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 1 || (genericPublicKey2 = this.publicDhKey_) == null || genericPublicKey2 == SecureMessageProto.GenericPublicKey.getDefaultInstance()) {
                        this.publicDhKey_ = genericPublicKey;
                    } else {
                        this.publicDhKey_ = SecureMessageProto.GenericPublicKey.newBuilder(this.publicDhKey_).mergeFrom(genericPublicKey).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(genericPublicKey);
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder setProtocolVersion(int i) {
                this.bitField0_ |= 2;
                this.protocolVersion_ = i;
                onChanged();
                return this;
            }

            public Builder setPublicDhKey(SecureMessageProto.GenericPublicKey genericPublicKey) {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    genericPublicKey.getClass();
                    this.publicDhKey_ = genericPublicKey;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(genericPublicKey);
                }
                this.bitField0_ |= 1;
                return this;
            }

            private Builder() {
                this.publicDhKey_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResponderHello build() {
                ResponderHello responderHelloBuildPartial = buildPartial();
                if (responderHelloBuildPartial.isInitialized()) {
                    return responderHelloBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) responderHelloBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResponderHello buildPartial() {
                ResponderHello responderHello = new ResponderHello(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    responderHello.publicDhKey_ = this.publicDhKey_;
                } else {
                    responderHello.publicDhKey_ = (SecureMessageProto.GenericPublicKey) singleFieldBuilderV3.build();
                }
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                responderHello.protocolVersion_ = this.protocolVersion_;
                responderHello.bitField0_ = i2;
                onBuilt();
                return responderHello;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ResponderHello getDefaultInstanceForType() {
                return ResponderHello.getDefaultInstance();
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
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.publicDhKey_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                int i = this.bitField0_ & (-2);
                this.protocolVersion_ = 0;
                this.bitField0_ = i & (-3);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.publicDhKey_ = null;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResponderHello) {
                    return mergeFrom((ResponderHello) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setPublicDhKey(SecureMessageProto.GenericPublicKey.Builder builder) {
                SingleFieldBuilderV3<SecureMessageProto.GenericPublicKey, SecureMessageProto.GenericPublicKey.Builder, SecureMessageProto.GenericPublicKeyOrBuilder> singleFieldBuilderV3 = this.publicDhKeyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.publicDhKey_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                return this;
            }

            public Builder mergeFrom(ResponderHello responderHello) {
                if (responderHello == ResponderHello.getDefaultInstance()) {
                    return this;
                }
                if (responderHello.hasPublicDhKey()) {
                    mergePublicDhKey(responderHello.getPublicDhKey());
                }
                if (responderHello.hasProtocolVersion()) {
                    setProtocolVersion(responderHello.getProtocolVersion());
                }
                mergeUnknownFields(((GeneratedMessageV3) responderHello).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ResponderHello responderHello = null;
                try {
                    try {
                        ResponderHello partialFrom = ResponderHello.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        ResponderHello responderHello2 = (ResponderHello) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            responderHello = responderHello2;
                            if (responderHello != null) {
                                mergeFrom(responderHello);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (responderHello != null) {
                        mergeFrom(responderHello);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(ResponderHello responderHello) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(responderHello);
        }

        public static ResponderHello parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ResponderHello(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResponderHello parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResponderHello) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResponderHello parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResponderHello getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ResponderHello parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ResponderHello() {
            this.memoizedIsInitialized = (byte) -1;
            this.protocolVersion_ = 0;
        }

        public static ResponderHello parseFrom(InputStream inputStream) throws IOException {
            return (ResponderHello) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ResponderHello parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResponderHello) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ResponderHello(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                SecureMessageProto.GenericPublicKey.Builder builder = (this.bitField0_ & 1) == 1 ? this.publicDhKey_.toBuilder() : null;
                                SecureMessageProto.GenericPublicKey genericPublicKey = (SecureMessageProto.GenericPublicKey) codedInputStream.readMessage(SecureMessageProto.GenericPublicKey.PARSER, extensionRegistryLite);
                                this.publicDhKey_ = genericPublicKey;
                                if (builder != null) {
                                    builder.mergeFrom(genericPublicKey);
                                    this.publicDhKey_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 1;
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 2;
                                this.protocolVersion_ = codedInputStream.readInt32();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static ResponderHello parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ResponderHello) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResponderHello parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ResponderHello) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ResponderHelloOrBuilder extends MessageOrBuilder {
        int getProtocolVersion();

        SecureMessageProto.GenericPublicKey getPublicDhKey();

        SecureMessageProto.GenericPublicKeyOrBuilder getPublicDhKeyOrBuilder();

        boolean hasProtocolVersion();

        boolean hasPublicDhKey();
    }

    public static final class SpakeHandshakeMessage extends GeneratedMessageV3 implements SpakeHandshakeMessageOrBuilder {
        public static final int EC_POINT_FIELD_NUMBER = 2;
        public static final int FLOW_NUMBER_FIELD_NUMBER = 1;
        public static final int HASH_VALUE_FIELD_NUMBER = 3;
        public static final int PAYLOAD_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EcPoint ecPoint_;
        private int flowNumber_;
        private ByteString hashValue_;
        private byte memoizedIsInitialized;
        private ByteString payload_;
        private static final SpakeHandshakeMessage DEFAULT_INSTANCE = new SpakeHandshakeMessage();

        @Deprecated
        public static final Parser<SpakeHandshakeMessage> PARSER = new AbstractParser<SpakeHandshakeMessage>() { // from class: com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessage.1
            @Override // com.google.protobuf.Parser
            public SpakeHandshakeMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new SpakeHandshakeMessage(codedInputStream, extensionRegistryLite);
            }
        };

        public static SpakeHandshakeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_SpakeHandshakeMessage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SpakeHandshakeMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SpakeHandshakeMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SpakeHandshakeMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        public static Parser<SpakeHandshakeMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpakeHandshakeMessage)) {
                return super.equals(obj);
            }
            SpakeHandshakeMessage spakeHandshakeMessage = (SpakeHandshakeMessage) obj;
            boolean z = hasFlowNumber() == spakeHandshakeMessage.hasFlowNumber();
            if (hasFlowNumber()) {
                z = z && getFlowNumber() == spakeHandshakeMessage.getFlowNumber();
            }
            boolean z2 = z && hasEcPoint() == spakeHandshakeMessage.hasEcPoint();
            if (hasEcPoint()) {
                z2 = z2 && getEcPoint().equals(spakeHandshakeMessage.getEcPoint());
            }
            boolean z3 = z2 && hasHashValue() == spakeHandshakeMessage.hasHashValue();
            if (hasHashValue()) {
                z3 = z3 && getHashValue().equals(spakeHandshakeMessage.getHashValue());
            }
            boolean z4 = z3 && hasPayload() == spakeHandshakeMessage.hasPayload();
            if (hasPayload()) {
                z4 = z4 && getPayload().equals(spakeHandshakeMessage.getPayload());
            }
            return z4 && this.unknownFields.equals(spakeHandshakeMessage.unknownFields);
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public EcPoint getEcPoint() {
            EcPoint ecPoint = this.ecPoint_;
            return ecPoint == null ? EcPoint.getDefaultInstance() : ecPoint;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public EcPointOrBuilder getEcPointOrBuilder() {
            EcPoint ecPoint = this.ecPoint_;
            return ecPoint == null ? EcPoint.getDefaultInstance() : ecPoint;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public int getFlowNumber() {
            return this.flowNumber_;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public ByteString getHashValue() {
            return this.hashValue_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SpakeHandshakeMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i = this.memoizedSize;
            if (i != -1) {
                return i;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) == 1 ? 0 + CodedOutputStream.computeInt32Size(1, this.flowNumber_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, getEcPoint());
            }
            if ((this.bitField0_ & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(3, this.hashValue_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeBytesSize(4, this.payload_);
            }
            int serializedSize = iComputeInt32Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public boolean hasEcPoint() {
            return (this.bitField0_ & 2) == 2;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public boolean hasFlowNumber() {
            return (this.bitField0_ & 1) == 1;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public boolean hasHashValue() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 8) == 8;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i = this.memoizedHashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = getDescriptorForType().hashCode() + 779;
            if (hasFlowNumber()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getFlowNumber();
            }
            if (hasEcPoint()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getEcPoint().hashCode();
            }
            if (hasHashValue()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getHashValue().hashCode();
            }
            if (hasPayload()) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getPayload().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return DeviceToDeviceMessagesProto.internal_static_securegcm_SpakeHandshakeMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SpakeHandshakeMessage.class, Builder.class);
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
            if (!hasEcPoint() || getEcPoint().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.writeInt32(1, this.flowNumber_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.writeMessage(2, getEcPoint());
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.writeBytes(3, this.hashValue_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.writeBytes(4, this.payload_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpakeHandshakeMessageOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> ecPointBuilder_;
            private EcPoint ecPoint_;
            private int flowNumber_;
            private ByteString hashValue_;
            private ByteString payload_;

            public static final Descriptors.Descriptor getDescriptor() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_SpakeHandshakeMessage_descriptor;
            }

            private SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> getEcPointFieldBuilder() {
                if (this.ecPointBuilder_ == null) {
                    this.ecPointBuilder_ = new SingleFieldBuilderV3<>(getEcPoint(), getParentForChildren(), isClean());
                    this.ecPoint_ = null;
                }
                return this.ecPointBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEcPointFieldBuilder();
                }
            }

            public Builder clearEcPoint() {
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ecPoint_ = null;
                    onChanged();
                } else {
                    singleFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearFlowNumber() {
                this.bitField0_ &= -2;
                this.flowNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHashValue() {
                this.bitField0_ &= -5;
                this.hashValue_ = SpakeHandshakeMessage.getDefaultInstance().getHashValue();
                onChanged();
                return this;
            }

            public Builder clearPayload() {
                this.bitField0_ &= -9;
                this.payload_ = SpakeHandshakeMessage.getDefaultInstance().getPayload();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_SpakeHandshakeMessage_descriptor;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public EcPoint getEcPoint() {
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EcPoint) singleFieldBuilderV3.getMessage();
                }
                EcPoint ecPoint = this.ecPoint_;
                return ecPoint == null ? EcPoint.getDefaultInstance() : ecPoint;
            }

            public EcPoint.Builder getEcPointBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (EcPoint.Builder) getEcPointFieldBuilder().getBuilder();
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public EcPointOrBuilder getEcPointOrBuilder() {
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EcPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EcPoint ecPoint = this.ecPoint_;
                return ecPoint == null ? EcPoint.getDefaultInstance() : ecPoint;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public int getFlowNumber() {
                return this.flowNumber_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public ByteString getHashValue() {
                return this.hashValue_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public ByteString getPayload() {
                return this.payload_;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public boolean hasEcPoint() {
                return (this.bitField0_ & 2) == 2;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public boolean hasFlowNumber() {
                return (this.bitField0_ & 1) == 1;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public boolean hasHashValue() {
                return (this.bitField0_ & 4) == 4;
            }

            @Override // com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.SpakeHandshakeMessageOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 8) == 8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return DeviceToDeviceMessagesProto.internal_static_securegcm_SpakeHandshakeMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(SpakeHandshakeMessage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasEcPoint() || getEcPoint().isInitialized();
            }

            public Builder mergeEcPoint(EcPoint ecPoint) {
                EcPoint ecPoint2;
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 2 || (ecPoint2 = this.ecPoint_) == null || ecPoint2 == EcPoint.getDefaultInstance()) {
                        this.ecPoint_ = ecPoint;
                    } else {
                        this.ecPoint_ = EcPoint.newBuilder(this.ecPoint_).mergeFrom(ecPoint).buildPartial();
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(ecPoint);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setEcPoint(EcPoint ecPoint) {
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    ecPoint.getClass();
                    this.ecPoint_ = ecPoint;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(ecPoint);
                }
                this.bitField0_ |= 2;
                return this;
            }

            public Builder setFlowNumber(int i) {
                this.bitField0_ |= 1;
                this.flowNumber_ = i;
                onChanged();
                return this;
            }

            public Builder setHashValue(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 4;
                this.hashValue_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                byteString.getClass();
                this.bitField0_ |= 8;
                this.payload_ = byteString;
                onChanged();
                return this;
            }

            private Builder() {
                this.ecPoint_ = null;
                ByteString byteString = ByteString.EMPTY;
                this.hashValue_ = byteString;
                this.payload_ = byteString;
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpakeHandshakeMessage build() {
                SpakeHandshakeMessage spakeHandshakeMessageBuildPartial = buildPartial();
                if (spakeHandshakeMessageBuildPartial.isInitialized()) {
                    return spakeHandshakeMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) spakeHandshakeMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpakeHandshakeMessage buildPartial() {
                SpakeHandshakeMessage spakeHandshakeMessage = new SpakeHandshakeMessage(this);
                int i = this.bitField0_;
                int i2 = (i & 1) != 1 ? 0 : 1;
                spakeHandshakeMessage.flowNumber_ = this.flowNumber_;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    spakeHandshakeMessage.ecPoint_ = this.ecPoint_;
                } else {
                    spakeHandshakeMessage.ecPoint_ = (EcPoint) singleFieldBuilderV3.build();
                }
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                spakeHandshakeMessage.hashValue_ = this.hashValue_;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                spakeHandshakeMessage.payload_ = this.payload_;
                spakeHandshakeMessage.bitField0_ = i2;
                onBuilt();
                return spakeHandshakeMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SpakeHandshakeMessage getDefaultInstanceForType() {
                return SpakeHandshakeMessage.getDefaultInstance();
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
                this.flowNumber_ = 0;
                this.bitField0_ &= -2;
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ecPoint_ = null;
                } else {
                    singleFieldBuilderV3.clear();
                }
                int i = this.bitField0_ & (-3);
                this.bitField0_ = i;
                ByteString byteString = ByteString.EMPTY;
                this.hashValue_ = byteString;
                this.payload_ = byteString;
                this.bitField0_ = i & (-5) & (-9);
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            public Builder clone() {
                return (Builder) super.clone();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SpakeHandshakeMessage) {
                    return mergeFrom((SpakeHandshakeMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setEcPoint(EcPoint.Builder builder) {
                SingleFieldBuilderV3<EcPoint, EcPoint.Builder, EcPointOrBuilder> singleFieldBuilderV3 = this.ecPointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.ecPoint_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ecPoint_ = null;
                ByteString byteString = ByteString.EMPTY;
                this.hashValue_ = byteString;
                this.payload_ = byteString;
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(SpakeHandshakeMessage spakeHandshakeMessage) {
                if (spakeHandshakeMessage == SpakeHandshakeMessage.getDefaultInstance()) {
                    return this;
                }
                if (spakeHandshakeMessage.hasFlowNumber()) {
                    setFlowNumber(spakeHandshakeMessage.getFlowNumber());
                }
                if (spakeHandshakeMessage.hasEcPoint()) {
                    mergeEcPoint(spakeHandshakeMessage.getEcPoint());
                }
                if (spakeHandshakeMessage.hasHashValue()) {
                    setHashValue(spakeHandshakeMessage.getHashValue());
                }
                if (spakeHandshakeMessage.hasPayload()) {
                    setPayload(spakeHandshakeMessage.getPayload());
                }
                mergeUnknownFields(((GeneratedMessageV3) spakeHandshakeMessage).unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0021  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                SpakeHandshakeMessage spakeHandshakeMessage = null;
                try {
                    try {
                        SpakeHandshakeMessage partialFrom = SpakeHandshakeMessage.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        SpakeHandshakeMessage spakeHandshakeMessage2 = (SpakeHandshakeMessage) e.getUnfinishedMessage();
                        try {
                            throw e.unwrapIOException();
                        } catch (Throwable th) {
                            th = th;
                            spakeHandshakeMessage = spakeHandshakeMessage2;
                            if (spakeHandshakeMessage != null) {
                                mergeFrom(spakeHandshakeMessage);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (spakeHandshakeMessage != null) {
                        mergeFrom(spakeHandshakeMessage);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder(SpakeHandshakeMessage spakeHandshakeMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(spakeHandshakeMessage);
        }

        public static SpakeHandshakeMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private SpakeHandshakeMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpakeHandshakeMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpakeHandshakeMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpakeHandshakeMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpakeHandshakeMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SpakeHandshakeMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SpakeHandshakeMessage() {
            this.memoizedIsInitialized = (byte) -1;
            this.flowNumber_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.hashValue_ = byteString;
            this.payload_ = byteString;
        }

        public static SpakeHandshakeMessage parseFrom(InputStream inputStream) throws IOException {
            return (SpakeHandshakeMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SpakeHandshakeMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpakeHandshakeMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpakeHandshakeMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SpakeHandshakeMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private SpakeHandshakeMessage(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.bitField0_ |= 1;
                                this.flowNumber_ = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                EcPoint.Builder builder = (this.bitField0_ & 2) == 2 ? this.ecPoint_.toBuilder() : null;
                                EcPoint ecPoint = (EcPoint) codedInputStream.readMessage(EcPoint.PARSER, extensionRegistryLite);
                                this.ecPoint_ = ecPoint;
                                if (builder != null) {
                                    builder.mergeFrom(ecPoint);
                                    this.ecPoint_ = builder.buildPartial();
                                }
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.bitField0_ |= 4;
                                this.hashValue_ = codedInputStream.readBytes();
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.bitField0_ |= 8;
                                this.payload_ = codedInputStream.readBytes();
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static SpakeHandshakeMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SpakeHandshakeMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SpakeHandshakeMessageOrBuilder extends MessageOrBuilder {
        EcPoint getEcPoint();

        EcPointOrBuilder getEcPointOrBuilder();

        int getFlowNumber();

        ByteString getHashValue();

        ByteString getPayload();

        boolean hasEcPoint();

        boolean hasFlowNumber();

        boolean hasHashValue();

        boolean hasPayload();
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fdevice_to_device_messages.proto\u0012\tsecuregcm\u001a\u0013securemessage.proto\"A\n\u0015DeviceToDeviceMessage\u0012\u000f\n\u0007message\u0018\u0001 \u0001(\f\u0012\u0017\n\u000fsequence_number\u0018\u0002 \u0001(\u0005\"e\n\u000eInitiatorHello\u00126\n\rpublic_dh_key\u0018\u0001 \u0001(\u000b2\u001f.securemessage.GenericPublicKey\u0012\u001b\n\u0010protocol_version\u0018\u0002 \u0001(\u0005:\u00010\"e\n\u000eResponderHello\u00126\n\rpublic_dh_key\u0018\u0001 \u0001(\u000b2\u001f.securemessage.GenericPublicKey\u0012\u001b\n\u0010protocol_version\u0018\u0002 \u0001(\u0005:\u00010\"@\n\u0007EcPoint\u0012\u001f\n\u0005curve\u0018\u0001 \u0002(\u000e2\u0010.securegcm.Curve\u0012\t\n\u0001x\u0018\u0002 \u0002(\f\u0012\t\n\u0001y\u0018\u0003", " \u0002(\f\"w\n\u0015SpakeHandshakeMessage\u0012\u0013\n\u000bflow_number\u0018\u0001 \u0001(\u0005\u0012$\n\bec_point\u0018\u0002 \u0001(\u000b2\u0012.securegcm.EcPoint\u0012\u0012\n\nhash_value\u0018\u0003 \u0001(\f\u0012\u000f\n\u0007payload\u0018\u0004 \u0001(\f*\u0015\n\u0005Curve\u0012\f\n\bED_25519\u0010\u0001BQ\n+com.google.security.cryptauth.lib.securegcmB\u001bDeviceToDeviceMessagesProto¢\u0002\u0004SGCM"}, new Descriptors.FileDescriptor[]{SecureMessageProto.getDescriptor()}, new Descriptors.FileDescriptor.InternalDescriptorAssigner() { // from class: com.google.security.cryptauth.lib.securegcm.DeviceToDeviceMessagesProto.1
            @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
            public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
                Descriptors.FileDescriptor unused = DeviceToDeviceMessagesProto.descriptor = fileDescriptor;
                return null;
            }
        });
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_securegcm_DeviceToDeviceMessage_descriptor = descriptor2;
        internal_static_securegcm_DeviceToDeviceMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Message", "SequenceNumber"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_securegcm_InitiatorHello_descriptor = descriptor3;
        internal_static_securegcm_InitiatorHello_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"PublicDhKey", "ProtocolVersion"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_securegcm_ResponderHello_descriptor = descriptor4;
        internal_static_securegcm_ResponderHello_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"PublicDhKey", "ProtocolVersion"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_securegcm_EcPoint_descriptor = descriptor5;
        internal_static_securegcm_EcPoint_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Curve", "X", "Y"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_securegcm_SpakeHandshakeMessage_descriptor = descriptor6;
        internal_static_securegcm_SpakeHandshakeMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"FlowNumber", "EcPoint", "HashValue", "Payload"});
        SecureMessageProto.getDescriptor();
    }

    private DeviceToDeviceMessagesProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
