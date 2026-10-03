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
public final class LinkageDeviceProto$PeerDevice extends GeneratedMessageLite<LinkageDeviceProto$PeerDevice, Builder> implements LinkageDeviceProto$PeerDeviceOrBuilder {
    public static final int AUTOSWITCH_FIELD_NUMBER = 6;
    private static final LinkageDeviceProto$PeerDevice DEFAULT_INSTANCE;
    public static final int ISCALLACTIVE_FIELD_NUMBER = 3;
    public static final int ISCONNECTED_FIELD_NUMBER = 5;
    public static final int ISMUSICACTIVE_FIELD_NUMBER = 4;
    public static final int ISSCREENON_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<LinkageDeviceProto$PeerDevice> PARSER;
    private boolean autoSwitch_;
    private boolean isCallActive_;
    private boolean isConnected_;
    private boolean isMusicActive_;
    private boolean isScreenOn_;
    private String name_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<LinkageDeviceProto$PeerDevice, Builder> implements LinkageDeviceProto$PeerDeviceOrBuilder {
        public Builder clearAutoSwitch() {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).clearAutoSwitch();
            return this;
        }

        public Builder clearIsCallActive() {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).clearIsCallActive();
            return this;
        }

        public Builder clearIsConnected() {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).clearIsConnected();
            return this;
        }

        public Builder clearIsMusicActive() {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).clearIsMusicActive();
            return this;
        }

        public Builder clearIsScreenOn() {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).clearIsScreenOn();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).clearName();
            return this;
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
        public boolean getAutoSwitch() {
            return ((LinkageDeviceProto$PeerDevice) this.instance).getAutoSwitch();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
        public boolean getIsCallActive() {
            return ((LinkageDeviceProto$PeerDevice) this.instance).getIsCallActive();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
        public boolean getIsConnected() {
            return ((LinkageDeviceProto$PeerDevice) this.instance).getIsConnected();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
        public boolean getIsMusicActive() {
            return ((LinkageDeviceProto$PeerDevice) this.instance).getIsMusicActive();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
        public boolean getIsScreenOn() {
            return ((LinkageDeviceProto$PeerDevice) this.instance).getIsScreenOn();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
        public String getName() {
            return ((LinkageDeviceProto$PeerDevice) this.instance).getName();
        }

        @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
        public ByteString getNameBytes() {
            return ((LinkageDeviceProto$PeerDevice) this.instance).getNameBytes();
        }

        public Builder setAutoSwitch(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).setAutoSwitch(z);
            return this;
        }

        public Builder setIsCallActive(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).setIsCallActive(z);
            return this;
        }

        public Builder setIsConnected(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).setIsConnected(z);
            return this;
        }

        public Builder setIsMusicActive(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).setIsMusicActive(z);
            return this;
        }

        public Builder setIsScreenOn(boolean z) {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).setIsScreenOn(z);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((LinkageDeviceProto$PeerDevice) this.instance).setNameBytes(byteString);
            return this;
        }

        private Builder() {
            super(LinkageDeviceProto$PeerDevice.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkageDeviceProto$PeerDevice linkageDeviceProto$PeerDevice = new LinkageDeviceProto$PeerDevice();
        DEFAULT_INSTANCE = linkageDeviceProto$PeerDevice;
        GeneratedMessageLite.registerDefaultInstance(LinkageDeviceProto$PeerDevice.class, linkageDeviceProto$PeerDevice);
    }

    private LinkageDeviceProto$PeerDevice() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAutoSwitch() {
        this.autoSwitch_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCallActive() {
        this.isCallActive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsConnected() {
        this.isConnected_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsMusicActive() {
        this.isMusicActive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsScreenOn() {
        this.isScreenOn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public static LinkageDeviceProto$PeerDevice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkageDeviceProto$PeerDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkageDeviceProto$PeerDevice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSwitch(boolean z) {
        this.autoSwitch_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCallActive(boolean z) {
        this.isCallActive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsConnected(boolean z) {
        this.isConnected_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsMusicActive(boolean z) {
        this.isMusicActive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsScreenOn(boolean z) {
        this.isScreenOn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = kya.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new LinkageDeviceProto$PeerDevice();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u0007", new Object[]{"name_", "isScreenOn_", "isCallActive_", "isMusicActive_", "isConnected_", "autoSwitch_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkageDeviceProto$PeerDevice> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (LinkageDeviceProto$PeerDevice.class) {
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

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
    public boolean getAutoSwitch() {
        return this.autoSwitch_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
    public boolean getIsCallActive() {
        return this.isCallActive_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
    public boolean getIsConnected() {
        return this.isConnected_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
    public boolean getIsMusicActive() {
        return this.isMusicActive_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
    public boolean getIsScreenOn() {
        return this.isScreenOn_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.heytap.health.linkage.proto.LinkageDeviceProto$PeerDeviceOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public static Builder newBuilder(LinkageDeviceProto$PeerDevice linkageDeviceProto$PeerDevice) {
        return DEFAULT_INSTANCE.createBuilder(linkageDeviceProto$PeerDevice);
    }

    public static LinkageDeviceProto$PeerDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(InputStream inputStream) throws IOException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkageDeviceProto$PeerDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LinkageDeviceProto$PeerDevice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
