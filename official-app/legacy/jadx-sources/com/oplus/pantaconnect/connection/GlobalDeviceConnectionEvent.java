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
public final class GlobalDeviceConnectionEvent extends GeneratedMessageV3 implements GlobalDeviceConnectionEventOrBuilder {
    public static final int DISPLAYDEVICE_FIELD_NUMBER = 2;
    public static final int EXTRA_FIELD_NUMBER = 4;
    public static final int RESULT_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private ByteString displayDevice_;
    private ByteString extra_;
    private byte memoizedIsInitialized;
    private ByteString result_;
    private int type_;
    private static final GlobalDeviceConnectionEvent DEFAULT_INSTANCE = new GlobalDeviceConnectionEvent();
    private static final Parser<GlobalDeviceConnectionEvent> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GlobalDeviceConnectionEventOrBuilder {
        private int bitField0_;
        private ByteString displayDevice_;
        private ByteString extra_;
        private ByteString result_;
        private int type_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(GlobalDeviceConnectionEvent globalDeviceConnectionEvent) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                globalDeviceConnectionEvent.type_ = this.type_;
            }
            if ((i & 2) != 0) {
                globalDeviceConnectionEvent.displayDevice_ = this.displayDevice_;
            }
            if ((i & 4) != 0) {
                globalDeviceConnectionEvent.result_ = this.result_;
            }
            if ((i & 8) != 0) {
                globalDeviceConnectionEvent.extra_ = this.extra_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return tz3.k;
        }

        public Builder clearDisplayDevice() {
            this.bitField0_ &= -3;
            this.displayDevice_ = GlobalDeviceConnectionEvent.getDefaultInstance().getDisplayDevice();
            onChanged();
            return this;
        }

        public Builder clearExtra() {
            this.bitField0_ &= -9;
            this.extra_ = GlobalDeviceConnectionEvent.getDefaultInstance().getExtra();
            onChanged();
            return this;
        }

        public Builder clearResult() {
            this.bitField0_ &= -5;
            this.result_ = GlobalDeviceConnectionEvent.getDefaultInstance().getResult();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return tz3.k;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
        public ByteString getDisplayDevice() {
            return this.displayDevice_;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
        public ByteString getExtra() {
            return this.extra_;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
        public ByteString getResult() {
            return this.result_;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
        public EventType getType() {
            EventType eventTypeForNumber = EventType.forNumber(this.type_);
            return eventTypeForNumber == null ? EventType.UNRECOGNIZED : eventTypeForNumber;
        }

        @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return tz3.f17210l.ensureFieldAccessorsInitialized(GlobalDeviceConnectionEvent.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setDisplayDevice(ByteString byteString) {
            byteString.getClass();
            this.displayDevice_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setExtra(ByteString byteString) {
            byteString.getClass();
            this.extra_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setResult(ByteString byteString) {
            byteString.getClass();
            this.result_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setType(EventType eventType) {
            eventType.getClass();
            this.bitField0_ |= 1;
            this.type_ = eventType.getNumber();
            onChanged();
            return this;
        }

        public Builder setTypeValue(int i) {
            this.type_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.type_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.displayDevice_ = byteString;
            this.result_ = byteString;
            this.extra_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GlobalDeviceConnectionEvent build() {
            GlobalDeviceConnectionEvent globalDeviceConnectionEventBuildPartial = buildPartial();
            if (globalDeviceConnectionEventBuildPartial.isInitialized()) {
                return globalDeviceConnectionEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) globalDeviceConnectionEventBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public GlobalDeviceConnectionEvent buildPartial() {
            GlobalDeviceConnectionEvent globalDeviceConnectionEvent = new GlobalDeviceConnectionEvent(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(globalDeviceConnectionEvent);
            }
            onBuilt();
            return globalDeviceConnectionEvent;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GlobalDeviceConnectionEvent getDefaultInstanceForType() {
            return GlobalDeviceConnectionEvent.getDefaultInstance();
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
            this.type_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.displayDevice_ = byteString;
            this.result_ = byteString;
            this.extra_ = byteString;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof GlobalDeviceConnectionEvent) {
                return mergeFrom((GlobalDeviceConnectionEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.displayDevice_ = byteString;
            this.result_ = byteString;
            this.extra_ = byteString;
        }

        public Builder mergeFrom(GlobalDeviceConnectionEvent globalDeviceConnectionEvent) {
            if (globalDeviceConnectionEvent == GlobalDeviceConnectionEvent.getDefaultInstance()) {
                return this;
            }
            if (globalDeviceConnectionEvent.type_ != 0) {
                setTypeValue(globalDeviceConnectionEvent.getTypeValue());
            }
            ByteString displayDevice = globalDeviceConnectionEvent.getDisplayDevice();
            ByteString byteString = ByteString.EMPTY;
            if (displayDevice != byteString) {
                setDisplayDevice(globalDeviceConnectionEvent.getDisplayDevice());
            }
            if (globalDeviceConnectionEvent.getResult() != byteString) {
                setResult(globalDeviceConnectionEvent.getResult());
            }
            if (globalDeviceConnectionEvent.getExtra() != byteString) {
                setExtra(globalDeviceConnectionEvent.getExtra());
            }
            mergeUnknownFields(globalDeviceConnectionEvent.getUnknownFields());
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
                                this.type_ = codedInputStream.readEnum();
                                this.bitField0_ |= 1;
                            } else if (tag == 18) {
                                this.displayDevice_ = codedInputStream.readBytes();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.result_ = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.extra_ = codedInputStream.readBytes();
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

    public enum EventType implements ProtocolMessageEnum {
        CONNECTION_INIT(0),
        CONNECTION_SUCCESS(1),
        CONNECTION_FAIL(2),
        CONNECTION_DISCONNECTED(3),
        QR_CODE_INFO_REQUEST(4),
        EXTENSION_EVENT(5),
        UNRECOGNIZED(-1);

        public static final int CONNECTION_DISCONNECTED_VALUE = 3;
        public static final int CONNECTION_FAIL_VALUE = 2;
        public static final int CONNECTION_INIT_VALUE = 0;
        public static final int CONNECTION_SUCCESS_VALUE = 1;
        public static final int EXTENSION_EVENT_VALUE = 5;
        public static final int QR_CODE_INFO_REQUEST_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<EventType> internalValueMap = new a();
        private static final EventType[] VALUES = values();

        public class a implements Internal.EnumLiteMap<EventType> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public EventType findValueByNumber(int i) {
                return EventType.forNumber(i);
            }
        }

        EventType(int i) {
            this.value = i;
        }

        public static EventType forNumber(int i) {
            if (i == 0) {
                return CONNECTION_INIT;
            }
            if (i == 1) {
                return CONNECTION_SUCCESS;
            }
            if (i == 2) {
                return CONNECTION_FAIL;
            }
            if (i == 3) {
                return CONNECTION_DISCONNECTED;
            }
            if (i == 4) {
                return QR_CODE_INFO_REQUEST;
            }
            if (i != 5) {
                return null;
            }
            return EXTENSION_EVENT;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GlobalDeviceConnectionEvent.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<EventType> internalGetValueMap() {
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
        public static EventType valueOf(int i) {
            return forNumber(i);
        }

        public static EventType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public class a extends AbstractParser<GlobalDeviceConnectionEvent> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GlobalDeviceConnectionEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = GlobalDeviceConnectionEvent.newBuilder();
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

    public /* synthetic */ GlobalDeviceConnectionEvent(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static GlobalDeviceConnectionEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return tz3.k;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static GlobalDeviceConnectionEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GlobalDeviceConnectionEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static GlobalDeviceConnectionEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<GlobalDeviceConnectionEvent> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GlobalDeviceConnectionEvent)) {
            return super.equals(obj);
        }
        GlobalDeviceConnectionEvent globalDeviceConnectionEvent = (GlobalDeviceConnectionEvent) obj;
        return this.type_ == globalDeviceConnectionEvent.type_ && getDisplayDevice().equals(globalDeviceConnectionEvent.getDisplayDevice()) && getResult().equals(globalDeviceConnectionEvent.getResult()) && getExtra().equals(globalDeviceConnectionEvent.getExtra()) && getUnknownFields().equals(globalDeviceConnectionEvent.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
    public ByteString getDisplayDevice() {
        return this.displayDevice_;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
    public ByteString getExtra() {
        return this.extra_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<GlobalDeviceConnectionEvent> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
    public ByteString getResult() {
        return this.result_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = this.type_ != EventType.CONNECTION_INIT.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
        if (!this.displayDevice_.isEmpty()) {
            iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.displayDevice_);
        }
        if (!this.result_.isEmpty()) {
            iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.result_);
        }
        if (!this.extra_.isEmpty()) {
            iComputeEnumSize += CodedOutputStream.computeBytesSize(4, this.extra_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
    public EventType getType() {
        EventType eventTypeForNumber = EventType.forNumber(this.type_);
        return eventTypeForNumber == null ? EventType.UNRECOGNIZED : eventTypeForNumber;
    }

    @Override // com.oplus.pantaconnect.connection.GlobalDeviceConnectionEventOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getExtra().hashCode() + ((((getResult().hashCode() + ((((getDisplayDevice().hashCode() + ((((((((getDescriptor().hashCode() + 779) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return tz3.f17210l.ensureFieldAccessorsInitialized(GlobalDeviceConnectionEvent.class, Builder.class);
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
        return new GlobalDeviceConnectionEvent();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.type_ != EventType.CONNECTION_INIT.getNumber()) {
            codedOutputStream.writeEnum(1, this.type_);
        }
        if (!this.displayDevice_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.displayDevice_);
        }
        if (!this.result_.isEmpty()) {
            codedOutputStream.writeBytes(3, this.result_);
        }
        if (!this.extra_.isEmpty()) {
            codedOutputStream.writeBytes(4, this.extra_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private GlobalDeviceConnectionEvent(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.type_ = 0;
        ByteString byteString = ByteString.EMPTY;
        this.displayDevice_ = byteString;
        this.result_ = byteString;
        this.extra_ = byteString;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(GlobalDeviceConnectionEvent globalDeviceConnectionEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(globalDeviceConnectionEvent);
    }

    public static GlobalDeviceConnectionEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static GlobalDeviceConnectionEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GlobalDeviceConnectionEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GlobalDeviceConnectionEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public GlobalDeviceConnectionEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static GlobalDeviceConnectionEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static GlobalDeviceConnectionEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static GlobalDeviceConnectionEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static GlobalDeviceConnectionEvent parseFrom(InputStream inputStream) throws IOException {
        return (GlobalDeviceConnectionEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private GlobalDeviceConnectionEvent() {
        this.type_ = 0;
        ByteString byteString = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
        this.displayDevice_ = byteString;
        this.result_ = byteString;
        this.extra_ = byteString;
    }

    public static GlobalDeviceConnectionEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GlobalDeviceConnectionEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static GlobalDeviceConnectionEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GlobalDeviceConnectionEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static GlobalDeviceConnectionEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GlobalDeviceConnectionEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
