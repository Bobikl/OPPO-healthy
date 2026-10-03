package com.oplus.pantaconnect.fusionservice;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
public final class TerminalInfoParams extends GeneratedMessageV3 implements TerminalInfoParamsOrBuilder {
    public static final int CONNECTSTATE_FIELD_NUMBER = 4;
    public static final int DEVICEADDRESS_FIELD_NUMBER = 6;
    public static final int DEVICEID_FIELD_NUMBER = 1;
    public static final int DEVICENAME_FIELD_NUMBER = 2;
    public static final int DEVICETYPE_FIELD_NUMBER = 3;
    public static final int IDENTITY_FIELD_NUMBER = 5;
    public static final int RSSI_FIELD_NUMBER = 7;
    private static final long serialVersionUID = 0;
    private int bitField0_;
    private ByteString connectState_;
    private volatile Object deviceAddress_;
    private volatile Object deviceId_;
    private volatile Object deviceName_;
    private int deviceType_;
    private IdentityParams identity_;
    private byte memoizedIsInitialized;
    private volatile Object rssi_;
    private static final TerminalInfoParams DEFAULT_INSTANCE = new TerminalInfoParams();
    private static final Parser<TerminalInfoParams> PARSER = new AbstractParser<TerminalInfoParams>() { // from class: com.oplus.pantaconnect.fusionservice.TerminalInfoParams.1
        @Override // com.google.protobuf.Parser
        public TerminalInfoParams parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderNewBuilder = TerminalInfoParams.newBuilder();
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

    public static /* synthetic */ int access$1176(TerminalInfoParams terminalInfoParams, int i) {
        int i2 = i | terminalInfoParams.bitField0_;
        terminalInfoParams.bitField0_ = i2;
        return i2;
    }

    public static TerminalInfoParams getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_descriptor;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static TerminalInfoParams parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TerminalInfoParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static TerminalInfoParams parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    public static Parser<TerminalInfoParams> parser() {
        return PARSER;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TerminalInfoParams)) {
            return super.equals(obj);
        }
        TerminalInfoParams terminalInfoParams = (TerminalInfoParams) obj;
        if (getDeviceId().equals(terminalInfoParams.getDeviceId()) && getDeviceName().equals(terminalInfoParams.getDeviceName()) && getDeviceType() == terminalInfoParams.getDeviceType() && getConnectState().equals(terminalInfoParams.getConnectState()) && hasIdentity() == terminalInfoParams.hasIdentity()) {
            return (!hasIdentity() || getIdentity().equals(terminalInfoParams.getIdentity())) && getDeviceAddress().equals(terminalInfoParams.getDeviceAddress()) && getRssi().equals(terminalInfoParams.getRssi()) && getUnknownFields().equals(terminalInfoParams.getUnknownFields());
        }
        return false;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public ByteString getConnectState() {
        return this.connectState_;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public String getDeviceAddress() {
        Object obj = this.deviceAddress_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceAddress_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public ByteString getDeviceAddressBytes() {
        Object obj = this.deviceAddress_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceAddress_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public String getDeviceId() {
        Object obj = this.deviceId_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceId_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public ByteString getDeviceIdBytes() {
        Object obj = this.deviceId_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceId_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public String getDeviceName() {
        Object obj = this.deviceName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.deviceName_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public ByteString getDeviceNameBytes() {
        Object obj = this.deviceName_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.deviceName_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public int getDeviceType() {
        return this.deviceType_;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public IdentityParams getIdentity() {
        IdentityParams identityParams = this.identity_;
        return identityParams == null ? IdentityParams.getDefaultInstance() : identityParams;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public IdentityParamsOrBuilder getIdentityOrBuilder() {
        IdentityParams identityParams = this.identity_;
        return identityParams == null ? IdentityParams.getDefaultInstance() : identityParams;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Parser<TerminalInfoParams> getParserForType() {
        return PARSER;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public String getRssi() {
        Object obj = this.rssi_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.rssi_ = stringUtf8;
        return stringUtf8;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public ByteString getRssiBytes() {
        Object obj = this.rssi_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.rssi_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.deviceId_) ? GeneratedMessageV3.computeStringSize(1, this.deviceId_) : 0;
        if (!GeneratedMessageV3.isStringEmpty(this.deviceName_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.deviceName_);
        }
        int i2 = this.deviceType_;
        if (i2 != 0) {
            iComputeStringSize += CodedOutputStream.computeInt32Size(3, i2);
        }
        if (!this.connectState_.isEmpty()) {
            iComputeStringSize += CodedOutputStream.computeBytesSize(4, this.connectState_);
        }
        if ((1 & this.bitField0_) != 0) {
            iComputeStringSize += CodedOutputStream.computeMessageSize(5, getIdentity());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceAddress_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.deviceAddress_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.rssi_)) {
            iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.rssi_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
    public boolean hasIdentity() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getConnectState().hashCode() + ((((getDeviceType() + ((((getDeviceName().hashCode() + ((((getDeviceId().hashCode() + ((((getDescriptor().hashCode() + 779) * 37) + 1) * 53)) * 37) + 2) * 53)) * 37) + 3) * 53)) * 37) + 4) * 53);
        if (hasIdentity()) {
            iHashCode = com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 5, 53) + getIdentity().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + ((getRssi().hashCode() + ((((getDeviceAddress().hashCode() + com.oplus.pantaconnect.agents.carambola.carambola(iHashCode, 37, 6, 53)) * 37) + 7) * 53)) * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_fieldAccessorTable.ensureFieldAccessorsInitialized(TerminalInfoParams.class, Builder.class);
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
        return new TerminalInfoParams();
    }

    @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!GeneratedMessageV3.isStringEmpty(this.deviceId_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 1, this.deviceId_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceName_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 2, this.deviceName_);
        }
        int i = this.deviceType_;
        if (i != 0) {
            codedOutputStream.writeInt32(3, i);
        }
        if (!this.connectState_.isEmpty()) {
            codedOutputStream.writeBytes(4, this.connectState_);
        }
        if ((this.bitField0_ & 1) != 0) {
            codedOutputStream.writeMessage(5, getIdentity());
        }
        if (!GeneratedMessageV3.isStringEmpty(this.deviceAddress_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 6, this.deviceAddress_);
        }
        if (!GeneratedMessageV3.isStringEmpty(this.rssi_)) {
            GeneratedMessageV3.writeString(codedOutputStream, 7, this.rssi_);
        }
        getUnknownFields().writeTo(codedOutputStream);
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TerminalInfoParamsOrBuilder {
        private int bitField0_;
        private ByteString connectState_;
        private Object deviceAddress_;
        private Object deviceId_;
        private Object deviceName_;
        private int deviceType_;
        private SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> identityBuilder_;
        private IdentityParams identity_;
        private Object rssi_;

        private void buildPartial0(TerminalInfoParams terminalInfoParams) {
            int i;
            int i2 = this.bitField0_;
            if ((i2 & 1) != 0) {
                terminalInfoParams.deviceId_ = this.deviceId_;
            }
            if ((i2 & 2) != 0) {
                terminalInfoParams.deviceName_ = this.deviceName_;
            }
            if ((i2 & 4) != 0) {
                terminalInfoParams.deviceType_ = this.deviceType_;
            }
            if ((i2 & 8) != 0) {
                terminalInfoParams.connectState_ = this.connectState_;
            }
            if ((i2 & 16) != 0) {
                SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
                terminalInfoParams.identity_ = singleFieldBuilderV3 == null ? this.identity_ : (IdentityParams) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 32) != 0) {
                terminalInfoParams.deviceAddress_ = this.deviceAddress_;
            }
            if ((i2 & 64) != 0) {
                terminalInfoParams.rssi_ = this.rssi_;
            }
            TerminalInfoParams.access$1176(terminalInfoParams, i);
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_descriptor;
        }

        private SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> getIdentityFieldBuilder() {
            if (this.identityBuilder_ == null) {
                this.identityBuilder_ = new SingleFieldBuilderV3<>(getIdentity(), getParentForChildren(), isClean());
                this.identity_ = null;
            }
            return this.identityBuilder_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getIdentityFieldBuilder();
            }
        }

        public Builder clearConnectState() {
            this.bitField0_ &= -9;
            this.connectState_ = TerminalInfoParams.getDefaultInstance().getConnectState();
            onChanged();
            return this;
        }

        public Builder clearDeviceAddress() {
            this.deviceAddress_ = TerminalInfoParams.getDefaultInstance().getDeviceAddress();
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }

        public Builder clearDeviceId() {
            this.deviceId_ = TerminalInfoParams.getDefaultInstance().getDeviceId();
            this.bitField0_ &= -2;
            onChanged();
            return this;
        }

        public Builder clearDeviceName() {
            this.deviceName_ = TerminalInfoParams.getDefaultInstance().getDeviceName();
            this.bitField0_ &= -3;
            onChanged();
            return this;
        }

        public Builder clearDeviceType() {
            this.bitField0_ &= -5;
            this.deviceType_ = 0;
            onChanged();
            return this;
        }

        public Builder clearIdentity() {
            this.bitField0_ &= -17;
            this.identity_ = null;
            SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.identityBuilder_ = null;
            }
            onChanged();
            return this;
        }

        public Builder clearRssi() {
            this.rssi_ = TerminalInfoParams.getDefaultInstance().getRssi();
            this.bitField0_ &= -65;
            onChanged();
            return this;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public ByteString getConnectState() {
            return this.connectState_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_descriptor;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public String getDeviceAddress() {
            Object obj = this.deviceAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceAddress_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public ByteString getDeviceAddressBytes() {
            Object obj = this.deviceAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceAddress_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public String getDeviceId() {
            Object obj = this.deviceId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public ByteString getDeviceIdBytes() {
            Object obj = this.deviceId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public String getDeviceName() {
            Object obj = this.deviceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.deviceName_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public ByteString getDeviceNameBytes() {
            Object obj = this.deviceName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public int getDeviceType() {
            return this.deviceType_;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public IdentityParams getIdentity() {
            SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (IdentityParams) singleFieldBuilderV3.getMessage();
            }
            IdentityParams identityParams = this.identity_;
            return identityParams == null ? IdentityParams.getDefaultInstance() : identityParams;
        }

        public IdentityParams.Builder getIdentityBuilder() {
            this.bitField0_ |= 16;
            onChanged();
            return (IdentityParams.Builder) getIdentityFieldBuilder().getBuilder();
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public IdentityParamsOrBuilder getIdentityOrBuilder() {
            SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (IdentityParamsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            IdentityParams identityParams = this.identity_;
            return identityParams == null ? IdentityParams.getDefaultInstance() : identityParams;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public String getRssi() {
            Object obj = this.rssi_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.rssi_ = stringUtf8;
            return stringUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public ByteString getRssiBytes() {
            Object obj = this.rssi_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.rssi_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.oplus.pantaconnect.fusionservice.TerminalInfoParamsOrBuilder
        public boolean hasIdentity() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Fusionservice.internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_fieldAccessorTable.ensureFieldAccessorsInitialized(TerminalInfoParams.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeIdentity(IdentityParams identityParams) {
            IdentityParams identityParams2;
            SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(identityParams);
            } else if ((this.bitField0_ & 16) == 0 || (identityParams2 = this.identity_) == null || identityParams2 == IdentityParams.getDefaultInstance()) {
                this.identity_ = identityParams;
            } else {
                getIdentityBuilder().mergeFrom(identityParams);
            }
            if (this.identity_ != null) {
                this.bitField0_ |= 16;
                onChanged();
            }
            return this;
        }

        public Builder setConnectState(ByteString byteString) {
            byteString.getClass();
            this.connectState_ = byteString;
            this.bitField0_ |= 8;
            onChanged();
            return this;
        }

        public Builder setDeviceAddress(String str) {
            str.getClass();
            this.deviceAddress_ = str;
            this.bitField0_ |= 32;
            onChanged();
            return this;
        }

        public Builder setDeviceAddressBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceAddress_ = byteString;
            this.bitField0_ |= 32;
            onChanged();
            return this;
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

        public Builder setDeviceName(String str) {
            str.getClass();
            this.deviceName_ = str;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setDeviceNameBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceName_ = byteString;
            this.bitField0_ |= 2;
            onChanged();
            return this;
        }

        public Builder setDeviceType(int i) {
            this.deviceType_ = i;
            this.bitField0_ |= 4;
            onChanged();
            return this;
        }

        public Builder setIdentity(IdentityParams identityParams) {
            SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
            if (singleFieldBuilderV3 == null) {
                identityParams.getClass();
                this.identity_ = identityParams;
            } else {
                singleFieldBuilderV3.setMessage(identityParams);
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        public Builder setRssi(String str) {
            str.getClass();
            this.rssi_ = str;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        public Builder setRssiBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rssi_ = byteString;
            this.bitField0_ |= 64;
            onChanged();
            return this;
        }

        private Builder() {
            this.deviceId_ = "";
            this.deviceName_ = "";
            this.connectState_ = ByteString.EMPTY;
            this.deviceAddress_ = "";
            this.rssi_ = "";
            maybeForceBuilderInitialization();
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public TerminalInfoParams build() {
            TerminalInfoParams terminalInfoParamsBuildPartial = buildPartial();
            if (terminalInfoParamsBuildPartial.isInitialized()) {
                return terminalInfoParamsBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) terminalInfoParamsBuildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
        public TerminalInfoParams buildPartial() {
            TerminalInfoParams terminalInfoParams = new TerminalInfoParams(this);
            if (this.bitField0_ != 0) {
                buildPartial0(terminalInfoParams);
            }
            onBuilt();
            return terminalInfoParams;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TerminalInfoParams getDefaultInstanceForType() {
            return TerminalInfoParams.getDefaultInstance();
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
            this.deviceName_ = "";
            this.deviceType_ = 0;
            this.connectState_ = ByteString.EMPTY;
            this.identity_ = null;
            SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.dispose();
                this.identityBuilder_ = null;
            }
            this.deviceAddress_ = "";
            this.rssi_ = "";
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo4465clone() {
            return (Builder) super.mo4465clone();
        }

        @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof TerminalInfoParams) {
                return mergeFrom((TerminalInfoParams) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setIdentity(IdentityParams.Builder builder) {
            SingleFieldBuilderV3<IdentityParams, IdentityParams.Builder, IdentityParamsOrBuilder> singleFieldBuilderV3 = this.identityBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.identity_ = builder.build();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            this.bitField0_ |= 16;
            onChanged();
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.deviceId_ = "";
            this.deviceName_ = "";
            this.connectState_ = ByteString.EMPTY;
            this.deviceAddress_ = "";
            this.rssi_ = "";
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(TerminalInfoParams terminalInfoParams) {
            if (terminalInfoParams == TerminalInfoParams.getDefaultInstance()) {
                return this;
            }
            if (!terminalInfoParams.getDeviceId().isEmpty()) {
                this.deviceId_ = terminalInfoParams.deviceId_;
                this.bitField0_ |= 1;
                onChanged();
            }
            if (!terminalInfoParams.getDeviceName().isEmpty()) {
                this.deviceName_ = terminalInfoParams.deviceName_;
                this.bitField0_ |= 2;
                onChanged();
            }
            if (terminalInfoParams.getDeviceType() != 0) {
                setDeviceType(terminalInfoParams.getDeviceType());
            }
            if (terminalInfoParams.getConnectState() != ByteString.EMPTY) {
                setConnectState(terminalInfoParams.getConnectState());
            }
            if (terminalInfoParams.hasIdentity()) {
                mergeIdentity(terminalInfoParams.getIdentity());
            }
            if (!terminalInfoParams.getDeviceAddress().isEmpty()) {
                this.deviceAddress_ = terminalInfoParams.deviceAddress_;
                this.bitField0_ |= 32;
                onChanged();
            }
            if (!terminalInfoParams.getRssi().isEmpty()) {
                this.rssi_ = terminalInfoParams.rssi_;
                this.bitField0_ |= 64;
                onChanged();
            }
            mergeUnknownFields(terminalInfoParams.getUnknownFields());
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
                                this.deviceName_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 2;
                            } else if (tag == 24) {
                                this.deviceType_ = codedInputStream.readInt32();
                                this.bitField0_ |= 4;
                            } else if (tag == 34) {
                                this.connectState_ = codedInputStream.readBytes();
                                this.bitField0_ |= 8;
                            } else if (tag == 42) {
                                codedInputStream.readMessage(getIdentityFieldBuilder().getBuilder(), extensionRegistryLite);
                                this.bitField0_ |= 16;
                            } else if (tag == 50) {
                                this.deviceAddress_ = codedInputStream.readStringRequireUtf8();
                                this.bitField0_ |= 32;
                            } else if (tag != 58) {
                                if (!parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.rssi_ = codedInputStream.readStringRequireUtf8();
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

    private TerminalInfoParams(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.deviceId_ = "";
        this.deviceName_ = "";
        this.deviceType_ = 0;
        this.connectState_ = ByteString.EMPTY;
        this.deviceAddress_ = "";
        this.rssi_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Builder newBuilder(TerminalInfoParams terminalInfoParams) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(terminalInfoParams);
    }

    public static TerminalInfoParams parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static TerminalInfoParams parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TerminalInfoParams) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static TerminalInfoParams parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public TerminalInfoParams getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static TerminalInfoParams parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static TerminalInfoParams parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.google.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static TerminalInfoParams parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static TerminalInfoParams parseFrom(InputStream inputStream) throws IOException {
        return (TerminalInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static TerminalInfoParams parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TerminalInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    private TerminalInfoParams() {
        this.deviceId_ = "";
        this.deviceName_ = "";
        this.deviceType_ = 0;
        ByteString byteString = ByteString.EMPTY;
        this.connectState_ = byteString;
        this.deviceAddress_ = "";
        this.rssi_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.deviceId_ = "";
        this.deviceName_ = "";
        this.connectState_ = byteString;
        this.deviceAddress_ = "";
        this.rssi_ = "";
    }

    public static TerminalInfoParams parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TerminalInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static TerminalInfoParams parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TerminalInfoParams) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
