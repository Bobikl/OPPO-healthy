package com.heytap.health.linkage.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.kya;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkageDeviceProto$LinkageDeviceInfo extends GeneratedMessageLite<LinkageDeviceProto$LinkageDeviceInfo, Builder> implements LinkageDeviceProto$LinkageDeviceInfoOrBuilder {
    public static final int CONNECTSTATE_FIELD_NUMBER = 4;
    private static final LinkageDeviceProto$LinkageDeviceInfo DEFAULT_INSTANCE;
    public static final int DEVICENAME_FIELD_NUMBER = 2;
    public static final int DEVICETYPE_FIELD_NUMBER = 3;
    public static final int ISSUPPORTAUDIOCONNECT_FIELD_NUMBER = 5;
    public static final int ISSUPPORTMULTICONNECT_FIELD_NUMBER = 6;
    public static final int MACADDRESS_FIELD_NUMBER = 1;
    private static volatile Parser<LinkageDeviceProto$LinkageDeviceInfo> PARSER;
    private int connectState_;
    private int deviceType_;
    private boolean isSupportAudioConnect_;
    private boolean isSupportMultiConnect_;
    private String macAddress_ = "";
    private String deviceName_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<LinkageDeviceProto$LinkageDeviceInfo, Builder> implements LinkageDeviceProto$LinkageDeviceInfoOrBuilder {
        public Builder clearConnectState() {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).clearConnectState();
            return this;
        }

        public Builder clearDeviceName() {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).clearDeviceName();
            return this;
        }

        public Builder clearDeviceType() {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).clearDeviceType();
            return this;
        }

        public Builder clearIsSupportAudioConnect() {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).clearIsSupportAudioConnect();
            return this;
        }

        public Builder clearIsSupportMultiConnect() {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).clearIsSupportMultiConnect();
            return this;
        }

        public Builder clearMacAddress() {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).clearMacAddress();
            return this;
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public LinkageDeviceProto$ConnectState getConnectState() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getConnectState();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public int getConnectStateValue() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getConnectStateValue();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public String getDeviceName() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getDeviceName();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public ByteString getDeviceNameBytes() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getDeviceNameBytes();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public LinkageDeviceProto$DeviceType getDeviceType() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getDeviceType();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public int getDeviceTypeValue() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getDeviceTypeValue();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public boolean getIsSupportAudioConnect() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getIsSupportAudioConnect();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public boolean getIsSupportMultiConnect() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getIsSupportMultiConnect();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public String getMacAddress() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getMacAddress();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
        public ByteString getMacAddressBytes() {
            return ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).getMacAddressBytes();
        }

        public Builder setConnectState(LinkageDeviceProto$ConnectState linkageDeviceProto$ConnectState) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setConnectState(linkageDeviceProto$ConnectState);
            return this;
        }

        public Builder setConnectStateValue(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setConnectStateValue(i);
            return this;
        }

        public Builder setDeviceName(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setDeviceName(str);
            return this;
        }

        public Builder setDeviceNameBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setDeviceNameBytes(byteString);
            return this;
        }

        public Builder setDeviceType(LinkageDeviceProto$DeviceType linkageDeviceProto$DeviceType) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setDeviceType(linkageDeviceProto$DeviceType);
            return this;
        }

        public Builder setDeviceTypeValue(int i) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setDeviceTypeValue(i);
            return this;
        }

        public Builder setIsSupportAudioConnect(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setIsSupportAudioConnect(z);
            return this;
        }

        public Builder setIsSupportMultiConnect(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setIsSupportMultiConnect(z);
            return this;
        }

        public Builder setMacAddress(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setMacAddress(str);
            return this;
        }

        public Builder setMacAddressBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$LinkageDeviceInfo) this.instance).setMacAddressBytes(byteString);
            return this;
        }

        private Builder() {
            super(LinkageDeviceProto$LinkageDeviceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkageDeviceProto$LinkageDeviceInfo linkageDeviceProto$LinkageDeviceInfo = new LinkageDeviceProto$LinkageDeviceInfo();
        DEFAULT_INSTANCE = linkageDeviceProto$LinkageDeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(LinkageDeviceProto$LinkageDeviceInfo.class, linkageDeviceProto$LinkageDeviceInfo);
    }

    private LinkageDeviceProto$LinkageDeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectState() {
        this.connectState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceName() {
        this.deviceName_ = getDefaultInstance().getDeviceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceType() {
        this.deviceType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupportAudioConnect() {
        this.isSupportAudioConnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSupportMultiConnect() {
        this.isSupportMultiConnect_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMacAddress() {
        this.macAddress_ = getDefaultInstance().getMacAddress();
    }

    public static LinkageDeviceProto$LinkageDeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkageDeviceProto$LinkageDeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectState(LinkageDeviceProto$ConnectState linkageDeviceProto$ConnectState) {
        this.connectState_ = linkageDeviceProto$ConnectState.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectStateValue(int i) {
        this.connectState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceName(String str) {
        str.getClass();
        this.deviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceType(LinkageDeviceProto$DeviceType linkageDeviceProto$DeviceType) {
        this.deviceType_ = linkageDeviceProto$DeviceType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceTypeValue(int i) {
        this.deviceType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupportAudioConnect(boolean z) {
        this.isSupportAudioConnect_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSupportMultiConnect(boolean z) {
        this.isSupportMultiConnect_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacAddress(String str) {
        str.getClass();
        this.macAddress_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMacAddressBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.macAddress_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = kya.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LinkageDeviceProto$LinkageDeviceInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004\f\u0005\u0007\u0006\u0007", new Object[]{"macAddress_", "deviceName_", "deviceType_", "connectState_", "isSupportAudioConnect_", "isSupportMultiConnect_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkageDeviceProto$LinkageDeviceInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LinkageDeviceProto$LinkageDeviceInfo.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                        break;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public LinkageDeviceProto$ConnectState getConnectState() {
        LinkageDeviceProto$ConnectState linkageDeviceProto$ConnectStateForNumber = LinkageDeviceProto$ConnectState.forNumber(this.connectState_);
        return linkageDeviceProto$ConnectStateForNumber == null ? LinkageDeviceProto$ConnectState.UNRECOGNIZED : linkageDeviceProto$ConnectStateForNumber;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public int getConnectStateValue() {
        return this.connectState_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public String getDeviceName() {
        return this.deviceName_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public ByteString getDeviceNameBytes() {
        return ByteString.copyFromUtf8(this.deviceName_);
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public LinkageDeviceProto$DeviceType getDeviceType() {
        LinkageDeviceProto$DeviceType linkageDeviceProto$DeviceTypeForNumber = LinkageDeviceProto$DeviceType.forNumber(this.deviceType_);
        return linkageDeviceProto$DeviceTypeForNumber == null ? LinkageDeviceProto$DeviceType.UNRECOGNIZED : linkageDeviceProto$DeviceTypeForNumber;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public int getDeviceTypeValue() {
        return this.deviceType_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public boolean getIsSupportAudioConnect() {
        return this.isSupportAudioConnect_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public boolean getIsSupportMultiConnect() {
        return this.isSupportMultiConnect_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public String getMacAddress() {
        return this.macAddress_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$LinkageDeviceInfoOrBuilder
    public ByteString getMacAddressBytes() {
        return ByteString.copyFromUtf8(this.macAddress_);
    }

    public static Builder newBuilder(LinkageDeviceProto$LinkageDeviceInfo linkageDeviceProto$LinkageDeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(linkageDeviceProto$LinkageDeviceInfo);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkageDeviceProto$LinkageDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$LinkageDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
