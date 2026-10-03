package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.fze;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes19.dex */
public final class Proto$MessageHeader extends GeneratedMessageLite<Proto$MessageHeader, Builder> implements Proto$MessageHeaderOrBuilder {
    public static final int ACTION_ANCHOR_FIELD_NUMBER = 1;
    public static final int COMMAND_ID_FIELD_NUMBER = 2;
    private static final Proto$MessageHeader DEFAULT_INSTANCE;
    public static final int DEVICE_UNIQUE_ID_FIELD_NUMBER = 5;
    public static final int ERROR_CODE_FIELD_NUMBER = 6;
    public static final int IS_ACK_FIELD_NUMBER = 3;
    private static volatile Parser<Proto$MessageHeader> PARSER = null;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 4;
    private int commandId_;
    private int errorCode_;
    private boolean isAck_;
    private int protocolVersion_;
    private String actionAnchor_ = "";
    private String deviceUniqueId_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$MessageHeader, Builder> implements Proto$MessageHeaderOrBuilder {
        public Builder clearActionAnchor() {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).clearActionAnchor();
            return this;
        }

        public Builder clearCommandId() {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).clearCommandId();
            return this;
        }

        public Builder clearDeviceUniqueId() {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).clearDeviceUniqueId();
            return this;
        }

        public Builder clearErrorCode() {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).clearErrorCode();
            return this;
        }

        public Builder clearIsAck() {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).clearIsAck();
            return this;
        }

        public Builder clearProtocolVersion() {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).clearProtocolVersion();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public String getActionAnchor() {
            return ((Proto$MessageHeader) this.instance).getActionAnchor();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public ByteString getActionAnchorBytes() {
            return ((Proto$MessageHeader) this.instance).getActionAnchorBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public int getCommandId() {
            return ((Proto$MessageHeader) this.instance).getCommandId();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public String getDeviceUniqueId() {
            return ((Proto$MessageHeader) this.instance).getDeviceUniqueId();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public ByteString getDeviceUniqueIdBytes() {
            return ((Proto$MessageHeader) this.instance).getDeviceUniqueIdBytes();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public int getErrorCode() {
            return ((Proto$MessageHeader) this.instance).getErrorCode();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public boolean getIsAck() {
            return ((Proto$MessageHeader) this.instance).getIsAck();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
        public int getProtocolVersion() {
            return ((Proto$MessageHeader) this.instance).getProtocolVersion();
        }

        public Builder setActionAnchor(String str) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setActionAnchor(str);
            return this;
        }

        public Builder setActionAnchorBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setActionAnchorBytes(byteString);
            return this;
        }

        public Builder setCommandId(int i) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setCommandId(i);
            return this;
        }

        public Builder setDeviceUniqueId(String str) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setDeviceUniqueId(str);
            return this;
        }

        public Builder setDeviceUniqueIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setDeviceUniqueIdBytes(byteString);
            return this;
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setErrorCode(i);
            return this;
        }

        public Builder setIsAck(boolean z) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setIsAck(z);
            return this;
        }

        public Builder setProtocolVersion(int i) {
            copyOnWrite();
            ((Proto$MessageHeader) this.instance).setProtocolVersion(i);
            return this;
        }

        private Builder() {
            super(Proto$MessageHeader.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$MessageHeader proto$MessageHeader = new Proto$MessageHeader();
        DEFAULT_INSTANCE = proto$MessageHeader;
        GeneratedMessageLite.registerDefaultInstance(Proto$MessageHeader.class, proto$MessageHeader);
    }

    private Proto$MessageHeader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionAnchor() {
        this.actionAnchor_ = getDefaultInstance().getActionAnchor();
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
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAck() {
        this.isAck_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProtocolVersion() {
        this.protocolVersion_ = 0;
    }

    public static Proto$MessageHeader getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$MessageHeader parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$MessageHeader parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$MessageHeader> parser() {
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
    public void setErrorCode(int i) {
        this.errorCode_ = i;
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
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$MessageHeader();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0007\u0004\u0004\u0005Ȉ\u0006\u0004", new Object[]{"actionAnchor_", "commandId_", "isAck_", "protocolVersion_", "deviceUniqueId_", "errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$MessageHeader> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$MessageHeader.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public String getActionAnchor() {
        return this.actionAnchor_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public ByteString getActionAnchorBytes() {
        return ByteString.copyFromUtf8(this.actionAnchor_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public int getCommandId() {
        return this.commandId_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public String getDeviceUniqueId() {
        return this.deviceUniqueId_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public ByteString getDeviceUniqueIdBytes() {
        return ByteString.copyFromUtf8(this.deviceUniqueId_);
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public boolean getIsAck() {
        return this.isAck_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$MessageHeaderOrBuilder
    public int getProtocolVersion() {
        return this.protocolVersion_;
    }

    public static Builder newBuilder(Proto$MessageHeader proto$MessageHeader) {
        return DEFAULT_INSTANCE.createBuilder(proto$MessageHeader);
    }

    public static Proto$MessageHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$MessageHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$MessageHeader parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$MessageHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$MessageHeader parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$MessageHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$MessageHeader parseFrom(InputStream inputStream) throws IOException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$MessageHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$MessageHeader parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$MessageHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$MessageHeader) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
