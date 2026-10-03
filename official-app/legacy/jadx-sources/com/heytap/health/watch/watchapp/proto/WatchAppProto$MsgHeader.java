package com.heytap.health.watch.watchapp.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.l8l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class WatchAppProto$MsgHeader extends GeneratedMessageLite<WatchAppProto$MsgHeader, Builder> implements WatchAppProto$MsgHeaderOrBuilder {
    public static final int ACTION_ANCHOR_FIELD_NUMBER = 1;
    public static final int BODY_MD5_FIELD_NUMBER = 6;
    public static final int COMMAND_ID_FIELD_NUMBER = 2;
    private static final WatchAppProto$MsgHeader DEFAULT_INSTANCE;
    public static final int DEVICE_UNIQUE_ID_FIELD_NUMBER = 5;
    public static final int IS_ACK_FIELD_NUMBER = 3;
    private static volatile Parser<WatchAppProto$MsgHeader> PARSER = null;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 4;
    private int commandId_;
    private boolean isAck_;
    private int protocolVersion_;
    private String actionAnchor_ = "";
    private String deviceUniqueId_ = "";
    private String bodyMd5_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$MsgHeader, Builder> implements WatchAppProto$MsgHeaderOrBuilder {
        public Builder clearActionAnchor() {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).clearActionAnchor();
            return this;
        }

        public Builder clearBodyMd5() {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).clearBodyMd5();
            return this;
        }

        public Builder clearCommandId() {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).clearCommandId();
            return this;
        }

        public Builder clearDeviceUniqueId() {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).clearDeviceUniqueId();
            return this;
        }

        public Builder clearIsAck() {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).clearIsAck();
            return this;
        }

        public Builder clearProtocolVersion() {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).clearProtocolVersion();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public String getActionAnchor() {
            return ((WatchAppProto$MsgHeader) this.instance).getActionAnchor();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public ByteString getActionAnchorBytes() {
            return ((WatchAppProto$MsgHeader) this.instance).getActionAnchorBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public String getBodyMd5() {
            return ((WatchAppProto$MsgHeader) this.instance).getBodyMd5();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public ByteString getBodyMd5Bytes() {
            return ((WatchAppProto$MsgHeader) this.instance).getBodyMd5Bytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public int getCommandId() {
            return ((WatchAppProto$MsgHeader) this.instance).getCommandId();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public String getDeviceUniqueId() {
            return ((WatchAppProto$MsgHeader) this.instance).getDeviceUniqueId();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public ByteString getDeviceUniqueIdBytes() {
            return ((WatchAppProto$MsgHeader) this.instance).getDeviceUniqueIdBytes();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public boolean getIsAck() {
            return ((WatchAppProto$MsgHeader) this.instance).getIsAck();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
        public int getProtocolVersion() {
            return ((WatchAppProto$MsgHeader) this.instance).getProtocolVersion();
        }

        public Builder setActionAnchor(String str) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setActionAnchor(str);
            return this;
        }

        public Builder setActionAnchorBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setActionAnchorBytes(byteString);
            return this;
        }

        public Builder setBodyMd5(String str) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setBodyMd5(str);
            return this;
        }

        public Builder setBodyMd5Bytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setBodyMd5Bytes(byteString);
            return this;
        }

        public Builder setCommandId(int i) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setCommandId(i);
            return this;
        }

        public Builder setDeviceUniqueId(String str) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setDeviceUniqueId(str);
            return this;
        }

        public Builder setDeviceUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setDeviceUniqueIdBytes(byteString);
            return this;
        }

        public Builder setIsAck(boolean z) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setIsAck(z);
            return this;
        }

        public Builder setProtocolVersion(int i) {
            copyOnWrite();
            ((WatchAppProto$MsgHeader) this.instance).setProtocolVersion(i);
            return this;
        }

        private Builder() {
            super(WatchAppProto$MsgHeader.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchAppProto$MsgHeader watchAppProto$MsgHeader = new WatchAppProto$MsgHeader();
        DEFAULT_INSTANCE = watchAppProto$MsgHeader;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$MsgHeader.class, watchAppProto$MsgHeader);
    }

    private WatchAppProto$MsgHeader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionAnchor() {
        this.actionAnchor_ = getDefaultInstance().getActionAnchor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBodyMd5() {
        this.bodyMd5_ = getDefaultInstance().getBodyMd5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCommandId() {
        this.commandId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceUniqueId() {
        this.deviceUniqueId_ = getDefaultInstance().getDeviceUniqueId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAck() {
        this.isAck_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocolVersion() {
        this.protocolVersion_ = 0;
    }

    public static WatchAppProto$MsgHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$MsgHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$MsgHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$MsgHeader> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionAnchor(String str) {
        str.getClass();
        this.actionAnchor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionAnchorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.actionAnchor_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyMd5(String str) {
        str.getClass();
        this.bodyMd5_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyMd5Bytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bodyMd5_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommandId(int i) {
        this.commandId_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceUniqueId(String str) {
        str.getClass();
        this.deviceUniqueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceUniqueIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceUniqueId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAck(boolean z) {
        this.isAck_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtocolVersion(int i) {
        this.protocolVersion_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$MsgHeader();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0007\u0004\u0004\u0005Ȉ\u0006Ȉ", new Object[]{"actionAnchor_", "commandId_", "isAck_", "protocolVersion_", "deviceUniqueId_", "bodyMd5_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$MsgHeader> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$MsgHeader.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public String getActionAnchor() {
        return this.actionAnchor_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public ByteString getActionAnchorBytes() {
        return ByteString.copyFromUtf8(this.actionAnchor_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public String getBodyMd5() {
        return this.bodyMd5_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public ByteString getBodyMd5Bytes() {
        return ByteString.copyFromUtf8(this.bodyMd5_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public int getCommandId() {
        return this.commandId_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public String getDeviceUniqueId() {
        return this.deviceUniqueId_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public ByteString getDeviceUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.deviceUniqueId_);
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public boolean getIsAck() {
        return this.isAck_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeaderOrBuilder
    public int getProtocolVersion() {
        return this.protocolVersion_;
    }

    public static Builder newBuilder(WatchAppProto$MsgHeader watchAppProto$MsgHeader) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$MsgHeader);
    }

    public static WatchAppProto$MsgHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$MsgHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$MsgHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$MsgHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$MsgHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$MsgHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$MsgHeader parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$MsgHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$MsgHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$MsgHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$MsgHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
