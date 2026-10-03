package com.oplus.pantaconnect.agents;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class InternalPayloadBuffer extends GeneratedMessageV3 implements InternalPayloadBufferOrBuilder {
    public static final int CLIENT_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 4;
    public static final int STATUS_FIELD_NUMBER = 7;
    public static final int TOTALLENGTH_FIELD_NUMBER = 5;
    public static final int TRANSFERREDLENGTH_FIELD_NUMBER = 6;
    public static final int TYPE_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private InternalAgentClient client_;
    private ByteString data_;
    private int id_;
    private byte memoizedIsInitialized;
    private int status_;
    private long totalLength_;
    private long transferredLength_;
    private int type_;
    private static final InternalPayloadBuffer DEFAULT_INSTANCE = new InternalPayloadBuffer();
    private static final Parser<InternalPayloadBuffer> PARSER = new AbstractParser<InternalPayloadBuffer>() { // from class: com.oplus.pantaconnect.agents.InternalPayloadBuffer.1
        @Override // com.google.protobuf.Parser
        public InternalPayloadBuffer parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = InternalPayloadBuffer.newBuilder();
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

    public enum TransferStatus implements ProtocolMessageEnum {
        SUCCESS(0),
        FAILURE(1),
        CANCELED(2),
        IN_PROGRESS(3),
        UNRECOGNIZED(-1);

        public static final int CANCELED_VALUE = 2;
        public static final int FAILURE_VALUE = 1;
        public static final int IN_PROGRESS_VALUE = 3;
        public static final int SUCCESS_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<TransferStatus> internalValueMap = new Internal.EnumLiteMap<TransferStatus>() { // from class: com.oplus.pantaconnect.agents.InternalPayloadBuffer.TransferStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TransferStatus findValueByNumber(int i) {
                return TransferStatus.forNumber(i);
            }
        };
        private static final TransferStatus[] VALUES = values();

        TransferStatus(int i) {
            this.value = i;
        }

        public static TransferStatus forNumber(int i) {
            if (i == 0) {
                return SUCCESS;
            }
            if (i == 1) {
                return FAILURE;
            }
            if (i == 2) {
                return CANCELED;
            }
            if (i != 3) {
                return null;
            }
            return IN_PROGRESS;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return InternalPayloadBuffer.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<TransferStatus> internalGetValueMap() {
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
        public static TransferStatus valueOf(int i) {
            return forNumber(i);
        }

        public static TransferStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static /* synthetic */ int access$1176(InternalPayloadBuffer internalPayloadBuffer, int i) {
        int i2 = i | internalPayloadBuffer.bitField0_;
        internalPayloadBuffer.bitField0_ = i2;
        return i2;
    }

    public static InternalPayloadBuffer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static InternalPayloadBuffer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InternalPayloadBuffer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static InternalPayloadBuffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<InternalPayloadBuffer> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InternalPayloadBuffer)) {
            return super.equals(obj);
        }
        InternalPayloadBuffer internalPayloadBuffer = (InternalPayloadBuffer) obj;
        if (hasClient() != internalPayloadBuffer.hasClient()) {
            return false;
        }
        return (!hasClient() || getClient().equals(internalPayloadBuffer.getClient())) && this.type_ == internalPayloadBuffer.type_ && getData().equals(internalPayloadBuffer.getData()) && getId() == internalPayloadBuffer.getId() && getTotalLength() == internalPayloadBuffer.getTotalLength() && getTransferredLength() == internalPayloadBuffer.getTransferredLength() && this.status_ == internalPayloadBuffer.status_ && getUnknownFields().equals(internalPayloadBuffer.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public InternalAgentClient getClient() {
        InternalAgentClient internalAgentClient = this.client_;
        return internalAgentClient == null ? InternalAgentClient.getDefaultInstance() : internalAgentClient;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public InternalAgentClientOrBuilder getClientOrBuilder() {
        InternalAgentClient internalAgentClient = this.client_;
        return internalAgentClient == null ? InternalAgentClient.getDefaultInstance() : internalAgentClient;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public ByteString getData() {
        return this.data_;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public int getId() {
        return this.id_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<InternalPayloadBuffer> getParserForType() {
        return PARSER;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getClient()) : 0;
        if (this.type_ != InternalPayloadType.BYTES.getNumber()) {
            iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.type_);
        }
        if (!this.data_.isEmpty()) {
            iComputeMessageSize += CodedOutputStream.computeBytesSize(3, this.data_);
        }
        int i2 = this.id_;
        if (i2 != 0) {
            iComputeMessageSize += CodedOutputStream.computeInt32Size(4, i2);
        }
        long j2 = this.totalLength_;
        if (j2 != 0) {
            iComputeMessageSize += CodedOutputStream.computeInt64Size(5, j2);
        }
        long j3 = this.transferredLength_;
        if (j3 != 0) {
            iComputeMessageSize += CodedOutputStream.computeInt64Size(6, j3);
        }
        if (this.status_ != TransferStatus.SUCCESS.getNumber()) {
            iComputeMessageSize += CodedOutputStream.computeEnumSize(7, this.status_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public TransferStatus getStatus() {
        TransferStatus transferStatusForNumber = TransferStatus.forNumber(this.status_);
        return transferStatusForNumber == null ? TransferStatus.UNRECOGNIZED : transferStatusForNumber;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public int getStatusValue() {
        return this.status_;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public long getTotalLength() {
        return this.totalLength_;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public long getTransferredLength() {
        return this.transferredLength_;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public InternalPayloadType getType() {
        InternalPayloadType internalPayloadTypeForNumber = InternalPayloadType.forNumber(this.type_);
        return internalPayloadTypeForNumber == null ? InternalPayloadType.UNRECOGNIZED : internalPayloadTypeForNumber;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
    public boolean hasClient() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasClient()) {
            iHashCode = carambola.carambola(iHashCode, 37, 1, 53) + getClient().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((((((Internal.hashLong(getTransferredLength()) + ((((Internal.hashLong(getTotalLength()) + ((((getId() + ((((getData().hashCode() + cherry.carambola(carambola.carambola(iHashCode, 37, 2, 53), this.type_, 37, 3, 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53) + this.status_) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Agents.internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_fieldAccessorTable.ensureFieldAccessorsInitialized(InternalPayloadBuffer.class, Builder.class);
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
        return new InternalPayloadBuffer();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(1, getClient());
        }
        if (this.type_ != InternalPayloadType.BYTES.getNumber()) {
            codedOutputStream.writeEnum(2, this.type_);
        }
        if (!this.data_.isEmpty()) {
            codedOutputStream.writeBytes(3, this.data_);
        }
        int i = this.id_;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
        long j2 = this.totalLength_;
        if (j2 != 0) {
            codedOutputStream.writeInt64(5, j2);
        }
        long j3 = this.transferredLength_;
        if (j3 != 0) {
            codedOutputStream.writeInt64(6, j3);
        }
        if (this.status_ != TransferStatus.SUCCESS.getNumber()) {
            codedOutputStream.writeEnum(7, this.status_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InternalPayloadBufferOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> clientBuilder_;
        private InternalAgentClient client_;
        private ByteString data_;
        private int id_;
        private int status_;
        private long totalLength_;
        private long transferredLength_;
        private int type_;

        private void buildPartial0(InternalPayloadBuffer internalPayloadBuffer) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
                internalPayloadBuffer.client_ = singleFieldBuilderV3 == null ? this.client_ : (InternalAgentClient) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                internalPayloadBuffer.type_ = this.type_;
            }
            if ((i2 & 4) != 0) {
                internalPayloadBuffer.data_ = this.data_;
            }
            if ((i2 & 8) != 0) {
                internalPayloadBuffer.id_ = this.id_;
            }
            if ((i2 & 16) != 0) {
                internalPayloadBuffer.totalLength_ = this.totalLength_;
            }
            if ((i2 & 32) != 0) {
                internalPayloadBuffer.transferredLength_ = this.transferredLength_;
            }
            if ((i2 & 64) != 0) {
                internalPayloadBuffer.status_ = this.status_;
            }
            InternalPayloadBuffer.access$1176(internalPayloadBuffer, i);
        }

        private SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> getClientFieldBuilder() {
            if (this.clientBuilder_ == null) {
                this.clientBuilder_ = new SingleFieldBuilderV3<>(getClient(), getParentForChildren(), isClean());
                this.client_ = null;
            }
            return this.clientBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_descriptor;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getClientFieldBuilder();
            }
        }

        public Builder clearClient() {
            this.bitField0_ &= -2;
            this.client_ = null;
            SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.clientBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Builder clearData() {
            this.bitField0_ &= -5;
            this.data_ = InternalPayloadBuffer.getDefaultInstance().getData();
            onChanged();
            return this;
        }

        public Builder clearId() {
            this.bitField0_ &= -9;
            this.id_ = 0;
            onChanged();
            return this;
        }

        public Builder clearStatus() {
            this.bitField0_ &= -65;
            this.status_ = 0;
            onChanged();
            return this;
        }

        public Builder clearTotalLength() {
            this.bitField0_ &= -17;
            this.totalLength_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearTransferredLength() {
            this.bitField0_ &= -33;
            this.transferredLength_ = 0L;
            onChanged();
            return this;
        }

        public Builder clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public InternalAgentClient getClient() {
            SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (InternalAgentClient) singleFieldBuilderV3.getMessage();
            }
            InternalAgentClient internalAgentClient = this.client_;
            return internalAgentClient == null ? InternalAgentClient.getDefaultInstance() : internalAgentClient;
        }

        public InternalAgentClient.Builder getClientBuilder() {
            this.bitField0_ |= 1;
            onChanged();
            return (InternalAgentClient.Builder) getClientFieldBuilder().getBuilder();
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public InternalAgentClientOrBuilder getClientOrBuilder() {
            SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (InternalAgentClientOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            InternalAgentClient internalAgentClient = this.client_;
            return internalAgentClient == null ? InternalAgentClient.getDefaultInstance() : internalAgentClient;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_descriptor;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public TransferStatus getStatus() {
            TransferStatus transferStatusForNumber = TransferStatus.forNumber(this.status_);
            return transferStatusForNumber == null ? TransferStatus.UNRECOGNIZED : transferStatusForNumber;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public int getStatusValue() {
            return this.status_;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public long getTotalLength() {
            return this.totalLength_;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public long getTransferredLength() {
            return this.transferredLength_;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public InternalPayloadType getType() {
            InternalPayloadType internalPayloadTypeForNumber = InternalPayloadType.forNumber(this.type_);
            return internalPayloadTypeForNumber == null ? InternalPayloadType.UNRECOGNIZED : internalPayloadTypeForNumber;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.oplus.pantaconnect.agents.InternalPayloadBufferOrBuilder
        public boolean hasClient() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Agents.internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_fieldAccessorTable.ensureFieldAccessorsInitialized(InternalPayloadBuffer.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeClient(InternalAgentClient internalAgentClient) {
            InternalAgentClient internalAgentClient2;
            SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(internalAgentClient);
            } else if ((this.bitField0_ & 1) == 0 || (internalAgentClient2 = this.client_) == null || internalAgentClient2 == InternalAgentClient.getDefaultInstance()) {
                this.client_ = internalAgentClient;
            } else {
                getClientBuilder().mergeFrom(internalAgentClient);
            }
            if (this.client_ != null) {
                this.bitField0_ |= 1;
                onChanged();
            }
            return this;
        }

        public Builder setClient(InternalAgentClient internalAgentClient) {
            SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
            if (singleFieldBuilderV3 == null) {
                internalAgentClient.getClass();
                this.client_ = internalAgentClient;
            } else {
                singleFieldBuilderV3.setMessage(internalAgentClient);
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setData(ByteString byteString) {
            byteString.getClass();
            this.data_ = byteString;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setId(int i) {
            this.id_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setStatus(TransferStatus transferStatus) {
            transferStatus.getClass();
            this.bitField0_ |= 64;
            this.status_ = transferStatus.getNumber();
            onChanged();
            return this;
        }

        public Builder setStatusValue(int i) {
            this.status_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setTotalLength(long j2) {
            this.totalLength_ = j2;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setTransferredLength(long j2) {
            this.transferredLength_ = j2;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setType(InternalPayloadType internalPayloadType) {
            internalPayloadType.getClass();
            this.bitField0_ |= 2;
            this.type_ = internalPayloadType.getNumber();
            onChanged();
            return this;
        }

        public Builder setTypeValue(int i) {
            this.type_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        private Builder() {
            this.type_ = 0;
            this.data_ = ByteString.EMPTY;
            this.status_ = 0;
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public InternalPayloadBuffer build() {
            InternalPayloadBuffer internalPayloadBufferBuildPartial = buildPartial();
            if (internalPayloadBufferBuildPartial.isInitialized()) {
                return internalPayloadBufferBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) internalPayloadBufferBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public InternalPayloadBuffer buildPartial() {
            InternalPayloadBuffer internalPayloadBuffer = new InternalPayloadBuffer(this);
            if (this.bitField0_ != 0) {
                buildPartial0(internalPayloadBuffer);
            }
            onBuilt();
            return internalPayloadBuffer;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InternalPayloadBuffer getDefaultInstanceForType() {
            return InternalPayloadBuffer.getDefaultInstance();
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
            this.client_ = null;
            SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.clientBuilder_ = null;
            }
            this.type_ = 0;
            this.data_ = ByteString.EMPTY;
            this.id_ = 0;
            this.totalLength_ = 0L;
            this.transferredLength_ = 0L;
            this.status_ = 0;
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof InternalPayloadBuffer) {
                return mergeFrom((InternalPayloadBuffer) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setClient(InternalAgentClient.Builder builder) {
            SingleFieldBuilderV3<InternalAgentClient, InternalAgentClient.Builder, InternalAgentClientOrBuilder> singleFieldBuilderV3 = this.clientBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.client_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.type_ = 0;
            this.data_ = ByteString.EMPTY;
            this.status_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(InternalPayloadBuffer internalPayloadBuffer) {
            if (internalPayloadBuffer == InternalPayloadBuffer.getDefaultInstance()) {
                return this;
            }
            if (internalPayloadBuffer.hasClient()) {
                mergeClient(internalPayloadBuffer.getClient());
            }
            if (internalPayloadBuffer.type_ != 0) {
                setTypeValue(internalPayloadBuffer.getTypeValue());
            }
            if (internalPayloadBuffer.getData() != ByteString.EMPTY) {
                setData(internalPayloadBuffer.getData());
            }
            if (internalPayloadBuffer.getId() != 0) {
                setId(internalPayloadBuffer.getId());
            }
            if (internalPayloadBuffer.getTotalLength() != 0) {
                setTotalLength(internalPayloadBuffer.getTotalLength());
            }
            if (internalPayloadBuffer.getTransferredLength() != 0) {
                setTransferredLength(internalPayloadBuffer.getTransferredLength());
            }
            if (internalPayloadBuffer.status_ != 0) {
                setStatusValue(internalPayloadBuffer.getStatusValue());
            }
            mergeUnknownFields(internalPayloadBuffer.getUnknownFields());
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
                                codedInputStream.readMessage(getClientFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.type_ = codedInputStream.readEnum();
                                this.bitField0_ |= 2;
                            } else if (tag == 26) {
                                this.data_ = codedInputStream.readBytes();
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.id_ = codedInputStream.readInt32();
                                this.bitField0_ |= 8;
                            } else if (tag == 40) {
                                this.totalLength_ = codedInputStream.readInt64();
                                this.bitField0_ |= 16;
                            } else if (tag == 48) {
                                this.transferredLength_ = codedInputStream.readInt64();
                                this.bitField0_ |= 32;
                            } else if (tag != 56) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.status_ = codedInputStream.readEnum();
                                this.bitField0_ |= 64;
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

    private InternalPayloadBuffer(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.type_ = 0;
        this.data_ = ByteString.EMPTY;
        this.id_ = 0;
        this.totalLength_ = 0L;
        this.transferredLength_ = 0L;
        this.status_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(InternalPayloadBuffer internalPayloadBuffer) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(internalPayloadBuffer);
    }

    public static InternalPayloadBuffer parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static InternalPayloadBuffer parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InternalPayloadBuffer) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static InternalPayloadBuffer parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public InternalPayloadBuffer getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static InternalPayloadBuffer parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static InternalPayloadBuffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static InternalPayloadBuffer parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static InternalPayloadBuffer parseFrom(InputStream inputStream) throws IOException {
        return (InternalPayloadBuffer) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static InternalPayloadBuffer parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InternalPayloadBuffer) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    private InternalPayloadBuffer() {
        this.type_ = 0;
        ByteString byteString = ByteString.EMPTY;
        this.id_ = 0;
        this.totalLength_ = 0L;
        this.transferredLength_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
        this.data_ = byteString;
        this.status_ = 0;
    }

    public static InternalPayloadBuffer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (InternalPayloadBuffer) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static InternalPayloadBuffer parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (InternalPayloadBuffer) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
