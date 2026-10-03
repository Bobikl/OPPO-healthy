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
public final class SocketQosResult extends GeneratedMessageV3 implements SocketQosResultOrBuilder {
    public static final int BANDWIDTH_FIELD_NUMBER = 1;
    public static final int DELAY_FIELD_NUMBER = 2;
    public static final int PACKETLOSSRATE_FIELD_NUMBER = 3;
    public static final int PEERIP_FIELD_NUMBER = 5;
    public static final int REMOTERSSI_FIELD_NUMBER = 6;
    public static final int RSSI_FIELD_NUMBER = 4;
    public static final int SOCKETSTATE_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private int bandWidth_;
    private int delay_;
    private byte memoizedIsInitialized;
    private int packetLossRate_;
    private volatile Object peerIp_;
    private int remoteRssi_;
    private int rssi_;
    private int socketState_;
    private static final SocketQosResult DEFAULT_INSTANCE = new SocketQosResult();
    private static final Parser<SocketQosResult> PARSER = new a();

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SocketQosResultOrBuilder {
        private int bandWidth_;
        private int bitField0_;
        private int delay_;
        private int packetLossRate_;
        private Object peerIp_;
        private int remoteRssi_;
        private int rssi_;
        private int socketState_;

        public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, a aVar) {
            this(builderParent);
        }

        private void buildPartial0(SocketQosResult socketQosResult) {
            int i = this.bitField0_;
            if ((i & 1) != 0) {
                socketQosResult.bandWidth_ = this.bandWidth_;
            }
            if ((i & 2) != 0) {
                socketQosResult.delay_ = this.delay_;
            }
            if ((i & 4) != 0) {
                socketQosResult.packetLossRate_ = this.packetLossRate_;
            }
            if ((i & 8) != 0) {
                socketQosResult.rssi_ = this.rssi_;
            }
            if ((i & 16) != 0) {
                socketQosResult.peerIp_ = this.peerIp_;
            }
            if ((i & 32) != 0) {
                socketQosResult.remoteRssi_ = this.remoteRssi_;
            }
            if ((i & 64) != 0) {
                socketQosResult.socketState_ = this.socketState_;
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return p1i.a;
        }

        public Builder clearBandWidth() {
            this.bitField0_ &= -2;
            this.bandWidth_ = 0;
            onChanged();
            return this;
        }

        public Builder clearDelay() {
            this.bitField0_ &= -3;
            this.delay_ = 0;
            onChanged();
            return this;
        }

        public Builder clearPacketLossRate() {
            this.bitField0_ &= -5;
            this.packetLossRate_ = 0;
            onChanged();
            return this;
        }

        public Builder clearPeerIp() {
            this.peerIp_ = SocketQosResult.getDefaultInstance().getPeerIp();
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }

        public Builder clearRemoteRssi() {
            this.bitField0_ &= -33;
            this.remoteRssi_ = 0;
            onChanged();
            return this;
        }

        public Builder clearRssi() {
            this.bitField0_ &= -9;
            this.rssi_ = 0;
            onChanged();
            return this;
        }

        public Builder clearSocketState() {
            this.bitField0_ &= -65;
            this.socketState_ = 0;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public int getBandWidth() {
            return this.bandWidth_;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public int getDelay() {
            return this.delay_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return p1i.a;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public int getPacketLossRate() {
            return this.packetLossRate_;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public String getPeerIp() {
            Object obj = this.peerIp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.peerIp_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public ByteString getPeerIpBytes() {
            Object obj = this.peerIp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.peerIp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public int getRemoteRssi() {
            return this.remoteRssi_;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public int getRssi() {
            return this.rssi_;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public SocketState getSocketState() {
            SocketState socketStateForNumber = SocketState.forNumber(this.socketState_);
            return socketStateForNumber == null ? SocketState.UNRECOGNIZED : socketStateForNumber;
        }

        @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
        public int getSocketStateValue() {
            return this.socketState_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return p1i.b.ensureFieldAccessorsInitialized(SocketQosResult.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setBandWidth(int i) {
            this.bandWidth_ = i;
            this.bitField0_ |= 1;
            onChanged();
            return this;
        }

        public Builder setDelay(int i) {
            this.delay_ = i;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setPacketLossRate(int i) {
            this.packetLossRate_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setPeerIp(String str) {
            str.getClass();
            this.peerIp_ = str;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setPeerIpBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.peerIp_ = byteString;
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setRemoteRssi(int i) {
            this.remoteRssi_ = i;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setRssi(int i) {
            this.rssi_ = i;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setSocketState(SocketState socketState) {
            socketState.getClass();
            this.bitField0_ |= 64;
            this.socketState_ = socketState.getNumber();
            onChanged();
            return this;
        }

        public Builder setSocketStateValue(int i) {
            this.socketState_ = i;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        private Builder() {
            this.peerIp_ = "";
            this.socketState_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SocketQosResult build() {
            SocketQosResult socketQosResultBuildPartial = buildPartial();
            if (socketQosResultBuildPartial.isInitialized()) {
                return socketQosResultBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) socketQosResultBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public SocketQosResult buildPartial() {
            SocketQosResult socketQosResult = new SocketQosResult(this, null);
            if (this.bitField0_ != 0) {
                buildPartial0(socketQosResult);
            }
            onBuilt();
            return socketQosResult;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SocketQosResult getDefaultInstanceForType() {
            return SocketQosResult.getDefaultInstance();
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
            this.bandWidth_ = 0;
            this.delay_ = 0;
            this.packetLossRate_ = 0;
            this.rssi_ = 0;
            this.peerIp_ = "";
            this.remoteRssi_ = 0;
            this.socketState_ = 0;
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.peerIp_ = "";
            this.socketState_ = 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof SocketQosResult) {
                return mergeFrom((SocketQosResult) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(SocketQosResult socketQosResult) {
            if (socketQosResult == SocketQosResult.getDefaultInstance()) {
                return this;
            }
            if (socketQosResult.getBandWidth() != 0) {
                setBandWidth(socketQosResult.getBandWidth());
            }
            if (socketQosResult.getDelay() != 0) {
                setDelay(socketQosResult.getDelay());
            }
            if (socketQosResult.getPacketLossRate() != 0) {
                setPacketLossRate(socketQosResult.getPacketLossRate());
            }
            if (socketQosResult.getRssi() != 0) {
                setRssi(socketQosResult.getRssi());
            }
            if (!socketQosResult.getPeerIp().isEmpty()) {
                this.peerIp_ = socketQosResult.peerIp_;
                this.bitField0_ |= 16;
                onChanged();
            }
            if (socketQosResult.getRemoteRssi() != 0) {
                setRemoteRssi(socketQosResult.getRemoteRssi());
            }
            if (socketQosResult.socketState_ != 0) {
                setSocketStateValue(socketQosResult.getSocketStateValue());
            }
            mergeUnknownFields(socketQosResult.getUnknownFields());
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
                                this.bandWidth_ = codedInputStream.readInt32();
                                this.bitField0_ |= 1;
                            } else if (tag == 16) {
                                this.delay_ = codedInputStream.readInt32();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.packetLossRate_ = codedInputStream.readInt32();
                                this.bitField0_ |= 4;
                            } else if (tag == 32) {
                                this.rssi_ = codedInputStream.readInt32();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                this.peerIp_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 16;
                            } else if (tag == 48) {
                                this.remoteRssi_ = codedInputStream.readInt32();
                                this.bitField0_ |= 32;
                            } else if (tag != 56) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.socketState_ = codedInputStream.readEnum();
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

    public class a extends AbstractParser<SocketQosResult> {
        @Override // com.google.protobuf.Parser
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SocketQosResult parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = SocketQosResult.newBuilder();
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

    public /* synthetic */ SocketQosResult(GeneratedMessageV3.Builder builder, a aVar) {
        this(builder);
    }

    public static SocketQosResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return p1i.a;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static SocketQosResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SocketQosResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static SocketQosResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<SocketQosResult> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SocketQosResult)) {
            return super.equals(obj);
        }
        SocketQosResult socketQosResult = (SocketQosResult) obj;
        return getBandWidth() == socketQosResult.getBandWidth() && getDelay() == socketQosResult.getDelay() && getPacketLossRate() == socketQosResult.getPacketLossRate() && getRssi() == socketQosResult.getRssi() && getPeerIp().equals(socketQosResult.getPeerIp()) && getRemoteRssi() == socketQosResult.getRemoteRssi() && this.socketState_ == socketQosResult.socketState_ && getUnknownFields().equals(socketQosResult.getUnknownFields());
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public int getBandWidth() {
        return this.bandWidth_;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public int getDelay() {
        return this.delay_;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public int getPacketLossRate() {
        return this.packetLossRate_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<SocketQosResult> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public String getPeerIp() {
        Object obj = this.peerIp_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.peerIp_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public ByteString getPeerIpBytes() {
        Object obj = this.peerIp_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.peerIp_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public int getRemoteRssi() {
        return this.remoteRssi_;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public int getRssi() {
        return this.rssi_;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = this.bandWidth_;
        int iComputeInt32Size = i2 != 0 ? CodedOutputStream.computeInt32Size(1, i2) : 0;
        int i3 = this.delay_;
        if (i3 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i3);
        }
        int i4 = this.packetLossRate_;
        if (i4 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i4);
        }
        int i5 = this.rssi_;
        if (i5 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i5);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.peerIp_)) {
            iComputeInt32Size += GeneratedMessageV3.computeStringSize(5, this.peerIp_);
        }
        int i6 = this.remoteRssi_;
        if (i6 != 0) {
            iComputeInt32Size += CodedOutputStream.computeInt32Size(6, i6);
        }
        if (this.socketState_ != SocketState.SOCKET_INVALID.getNumber()) {
            iComputeInt32Size += CodedOutputStream.computeEnumSize(7, this.socketState_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public SocketState getSocketState() {
        SocketState socketStateForNumber = SocketState.forNumber(this.socketState_);
        return socketStateForNumber == null ? SocketState.UNRECOGNIZED : socketStateForNumber;
    }

    @Override // com.oplus.pantaconnect.connection.SocketQosResultOrBuilder
    public int getSocketStateValue() {
        return this.socketState_;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getUnknownFields().hashCode() + ((((((getRemoteRssi() + ((((getPeerIp().hashCode() + ((((getRssi() + ((((getPacketLossRate() + ((((getDelay() + ((((getBandWidth() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53)) * 37) + 5) * 53)) * 37) + 6) * 53)) * 37) + 7) * 53) + this.socketState_) * 29);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return p1i.b.ensureFieldAccessorsInitialized(SocketQosResult.class, Builder.class);
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
        return new SocketQosResult();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.bandWidth_;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.delay_;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
        int i3 = this.packetLossRate_;
        if (i3 != 0) {
            codedOutputStream.writeInt32(3, i3);
        }
        int i4 = this.rssi_;
        if (i4 != 0) {
            codedOutputStream.writeInt32(4, i4);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.peerIp_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 5, this.peerIp_);
        }
        int i5 = this.remoteRssi_;
        if (i5 != 0) {
            codedOutputStream.writeInt32(6, i5);
        }
        if (this.socketState_ != SocketState.SOCKET_INVALID.getNumber()) {
            codedOutputStream.writeEnum(7, this.socketState_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    private SocketQosResult(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.bandWidth_ = 0;
        this.delay_ = 0;
        this.packetLossRate_ = 0;
        this.rssi_ = 0;
        this.peerIp_ = "";
        this.remoteRssi_ = 0;
        this.socketState_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(SocketQosResult socketQosResult) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(socketQosResult);
    }

    public static SocketQosResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static SocketQosResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SocketQosResult) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static SocketQosResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public SocketQosResult getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        a aVar = null;
        return this == DEFAULT_INSTANCE ? new Builder(aVar) : new Builder(aVar).mergeFrom(this);
    }

    public static SocketQosResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static SocketQosResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent, null);
    }

    public static SocketQosResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static SocketQosResult parseFrom(InputStream inputStream) throws IOException {
        return (SocketQosResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static SocketQosResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SocketQosResult) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    private SocketQosResult() {
        this.bandWidth_ = 0;
        this.delay_ = 0;
        this.packetLossRate_ = 0;
        this.rssi_ = 0;
        this.peerIp_ = "";
        this.remoteRssi_ = 0;
        this.socketState_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.peerIp_ = "";
        this.socketState_ = 0;
    }

    public static SocketQosResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SocketQosResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static SocketQosResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SocketQosResult) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
