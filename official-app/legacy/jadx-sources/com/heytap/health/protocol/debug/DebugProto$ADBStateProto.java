package com.heytap.health.protocol.debug;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.q25;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class DebugProto$ADBStateProto extends GeneratedMessageLite<DebugProto$ADBStateProto, Builder> implements DebugProto$ADBStateProtoOrBuilder {
    private static final DebugProto$ADBStateProto DEFAULT_INSTANCE;
    private static volatile Parser<DebugProto$ADBStateProto> PARSER = null;
    public static final int PORT_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 1;
    private int port_;
    private boolean state_;

    public static final class Builder extends GeneratedMessageLite.Builder<DebugProto$ADBStateProto, Builder> implements DebugProto$ADBStateProtoOrBuilder {
        public Builder clearPort() {
            copyOnWrite();
            ((DebugProto$ADBStateProto) this.instance).clearPort();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((DebugProto$ADBStateProto) this.instance).clearState();
            return this;
        }

        @Override // com.heytap.health.protocol.debug.DebugProto$ADBStateProtoOrBuilder
        public int getPort() {
            return ((DebugProto$ADBStateProto) this.instance).getPort();
        }

        @Override // com.heytap.health.protocol.debug.DebugProto$ADBStateProtoOrBuilder
        public boolean getState() {
            return ((DebugProto$ADBStateProto) this.instance).getState();
        }

        public Builder setPort(int i) {
            copyOnWrite();
            ((DebugProto$ADBStateProto) this.instance).setPort(i);
            return this;
        }

        public Builder setState(boolean z) {
            copyOnWrite();
            ((DebugProto$ADBStateProto) this.instance).setState(z);
            return this;
        }

        private Builder() {
            super(DebugProto$ADBStateProto.DEFAULT_INSTANCE);
        }
    }

    static {
        DebugProto$ADBStateProto debugProto$ADBStateProto = new DebugProto$ADBStateProto();
        DEFAULT_INSTANCE = debugProto$ADBStateProto;
        GeneratedMessageLite.registerDefaultInstance(DebugProto$ADBStateProto.class, debugProto$ADBStateProto);
    }

    private DebugProto$ADBStateProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPort() {
        this.port_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = false;
    }

    public static DebugProto$ADBStateProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static DebugProto$ADBStateProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugProto$ADBStateProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<DebugProto$ADBStateProto> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPort(int i) {
        this.port_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(boolean z) {
        this.state_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = q25.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new DebugProto$ADBStateProto();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0004", new Object[]{"state_", "port_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DebugProto$ADBStateProto> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (DebugProto$ADBStateProto.class) {
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

    @Override // com.heytap.health.protocol.debug.DebugProto$ADBStateProtoOrBuilder
    public int getPort() {
        return this.port_;
    }

    @Override // com.heytap.health.protocol.debug.DebugProto$ADBStateProtoOrBuilder
    public boolean getState() {
        return this.state_;
    }

    public static Builder newBuilder(DebugProto$ADBStateProto debugProto$ADBStateProto) {
        return DEFAULT_INSTANCE.createBuilder(debugProto$ADBStateProto);
    }

    public static DebugProto$ADBStateProto parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DebugProto$ADBStateProto parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DebugProto$ADBStateProto parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DebugProto$ADBStateProto parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DebugProto$ADBStateProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DebugProto$ADBStateProto parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static DebugProto$ADBStateProto parseFrom(InputStream inputStream) throws IOException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DebugProto$ADBStateProto parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DebugProto$ADBStateProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DebugProto$ADBStateProto parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugProto$ADBStateProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
