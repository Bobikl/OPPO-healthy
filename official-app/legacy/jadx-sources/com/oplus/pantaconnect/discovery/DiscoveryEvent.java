package com.oplus.pantaconnect.discovery;

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
import com.oplus.aiunit.vision.nt5;
import com.oplus.pantaconnect.agents.cherry;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class DiscoveryEvent extends GeneratedMessageV3 implements DiscoveryEventOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final DiscoveryEvent DEFAULT_INSTANCE = new DiscoveryEvent();
    private static final Parser<DiscoveryEvent> PARSER = new a();
    public static final int TYPE_FIELD_NUMBER = 1;
    private static final long serialVersionUID = 0;
    private ByteString data_;
    private byte memoizedIsInitialized;
    private int type_;

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiscoveryEventOrBuilder {
        private int bitField0_;
        private ByteString data_;
        private int type_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(DiscoveryEvent discoveryEvent) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                discoveryEvent.type_ = this.type_;
            }
            if ((i & 2) != 0) {
                discoveryEvent.data_ = this.data_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return nt5.a;
        }

        public Builder clearData() {
            this.bitField0_ &= -3;
            this.data_ = DiscoveryEvent.getDefaultInstance().getData();
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.discovery.DiscoveryEventOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return nt5.a;
        }

        @Override // com.oplus.pantaconnect.discovery.DiscoveryEventOrBuilder
        public EventType getType() {
            EventType eventTypeForNumber = EventType.forNumber(this.type_);
            return eventTypeForNumber == null ? EventType.UNRECOGNIZED : eventTypeForNumber;
        }

        @Override // com.oplus.pantaconnect.discovery.DiscoveryEventOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return nt5.b.ensureFieldAccessorsInitialized(DiscoveryEvent.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
            this.bitField0_ |= 2;
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
            this.data_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DiscoveryEvent build() {
            DiscoveryEvent discoveryEventBuildPartial = buildPartial();
            if (discoveryEventBuildPartial.isInitialized()) {
                return discoveryEventBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) discoveryEventBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public DiscoveryEvent buildPartial() {
            DiscoveryEvent discoveryEvent = new DiscoveryEvent(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(discoveryEvent);
            }
            onBuilt();
            return discoveryEvent;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DiscoveryEvent getDefaultInstanceForType() {
            return DiscoveryEvent.getDefaultInstance();
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
            this.data_ = ByteString.EMPTY;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = 0;
            this.data_ = ByteString.EMPTY;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof DiscoveryEvent) {
                return mergeFrom((DiscoveryEvent) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(DiscoveryEvent discoveryEvent) {
            if (discoveryEvent == DiscoveryEvent.getDefaultInstance()) {
                return this;
            }
            if (discoveryEvent.type_ != 0) {
                setTypeValue(discoveryEvent.getTypeValue());
            }
            if (discoveryEvent.getData() != ByteString.EMPTY) {
                setData(discoveryEvent.getData());
            }
            mergeUnknownFields(discoveryEvent.getUnknownFields());
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
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.data_ = codedInputStream.readBytes();
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

    public enum EventType implements ProtocolMessageEnum {
        DEVICE_FOUND(0),
        UNRECOGNIZED(-1);

        public static final int DEVICE_FOUND_VALUE = 0;
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
            if (i != 0) {
                return null;
            }
            return DEVICE_FOUND;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return DiscoveryEvent.getDescriptor().getEnumTypes().get(0);
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

    public class a extends AbstractParser<DiscoveryEvent> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DiscoveryEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = DiscoveryEvent.newBuilder();
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

    public /* synthetic */ DiscoveryEvent(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static DiscoveryEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return nt5.a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static DiscoveryEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DiscoveryEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static DiscoveryEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<DiscoveryEvent> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoveryEvent)) {
            return super.equals(obj);
        }
        DiscoveryEvent discoveryEvent = (DiscoveryEvent) obj;
        return this.type_ == discoveryEvent.type_ && getData().equals(discoveryEvent.getData()) && getUnknownFields().equals(discoveryEvent.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.discovery.DiscoveryEventOrBuilder
    public ByteString getData() {
        return this.data_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<DiscoveryEvent> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeEnumSize = this.type_ != EventType.DEVICE_FOUND.getNumber() ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
        if (!this.data_.isEmpty()) {
            iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.data_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.discovery.DiscoveryEventOrBuilder
    public EventType getType() {
        EventType eventTypeForNumber = EventType.forNumber(this.type_);
        return eventTypeForNumber == null ? EventType.UNRECOGNIZED : eventTypeForNumber;
    }

    @Override // com.oplus.pantaconnect.discovery.DiscoveryEventOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((getData().hashCode() + cherry.carambola((((getDescriptor().hashCode() + 779) * 37) + 1) * 53, this.type_, 37, 2, 53)) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nt5.b.ensureFieldAccessorsInitialized(DiscoveryEvent.class, Builder.class);
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
        return new DiscoveryEvent();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.type_ != EventType.DEVICE_FOUND.getNumber()) {
            codedOutputStream.writeEnum(1, this.type_);
        }
        if (!this.data_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.data_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private DiscoveryEvent(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.type_ = 0;
        this.data_ = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(DiscoveryEvent discoveryEvent) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(discoveryEvent);
    }

    public static DiscoveryEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static DiscoveryEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DiscoveryEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DiscoveryEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public DiscoveryEvent getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static DiscoveryEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static DiscoveryEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    private DiscoveryEvent() {
        this.type_ = 0;
        ByteString byteString = ByteString.EMPTY;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
        this.data_ = byteString;
    }

    public static DiscoveryEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static DiscoveryEvent parseFrom(InputStream inputStream) throws IOException {
        return (DiscoveryEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static DiscoveryEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DiscoveryEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static DiscoveryEvent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DiscoveryEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static DiscoveryEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DiscoveryEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
