package com.heytap.health.watch.watchface.proto;

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
public final class Proto$SyncMode extends GeneratedMessageLite<Proto$SyncMode, Builder> implements Proto$SyncModeOrBuilder {
    private static final Proto$SyncMode DEFAULT_INSTANCE;
    public static final int FORCE_SYNC_FIELD_NUMBER = 1;
    public static final int IS_CLEAR_HEALTH_FIELD_NUMBER = 2;
    private static volatile Parser<Proto$SyncMode> PARSER;
    private int forceSync_;
    private int isClearHealth_;

    public static final class Builder extends GeneratedMessageLite.Builder<Proto$SyncMode, Builder> implements Proto$SyncModeOrBuilder {
        public Builder clearForceSync() {
            copyOnWrite();
            ((Proto$SyncMode) this.instance).clearForceSync();
            return this;
        }

        public Builder clearIsClearHealth() {
            copyOnWrite();
            ((Proto$SyncMode) this.instance).clearIsClearHealth();
            return this;
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$SyncModeOrBuilder
        public int getForceSync() {
            return ((Proto$SyncMode) this.instance).getForceSync();
        }

        @Override // com.heytap.health.watch.watchface.proto.Proto$SyncModeOrBuilder
        public int getIsClearHealth() {
            return ((Proto$SyncMode) this.instance).getIsClearHealth();
        }

        public Builder setForceSync(int i) {
            copyOnWrite();
            ((Proto$SyncMode) this.instance).setForceSync(i);
            return this;
        }

        public Builder setIsClearHealth(int i) {
            copyOnWrite();
            ((Proto$SyncMode) this.instance).setIsClearHealth(i);
            return this;
        }

        private Builder() {
            super(Proto$SyncMode.DEFAULT_INSTANCE);
        }
    }

    static {
        Proto$SyncMode proto$SyncMode = new Proto$SyncMode();
        DEFAULT_INSTANCE = proto$SyncMode;
        GeneratedMessageLite.registerDefaultInstance(Proto$SyncMode.class, proto$SyncMode);
    }

    private Proto$SyncMode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForceSync() {
        this.forceSync_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsClearHealth() {
        this.isClearHealth_ = 0;
    }

    public static Proto$SyncMode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Proto$SyncMode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Proto$SyncMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$SyncMode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Proto$SyncMode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForceSync(int i) {
        this.forceSync_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsClearHealth(int i) {
        this.isClearHealth_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = fze.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Proto$SyncMode();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"forceSync_", "isClearHealth_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Proto$SyncMode> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Proto$SyncMode.class) {
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

    @Override // com.heytap.health.watch.watchface.proto.Proto$SyncModeOrBuilder
    public int getForceSync() {
        return this.forceSync_;
    }

    @Override // com.heytap.health.watch.watchface.proto.Proto$SyncModeOrBuilder
    public int getIsClearHealth() {
        return this.isClearHealth_;
    }

    public static Builder newBuilder(Proto$SyncMode proto$SyncMode) {
        return DEFAULT_INSTANCE.createBuilder(proto$SyncMode);
    }

    public static Proto$SyncMode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$SyncMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$SyncMode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Proto$SyncMode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Proto$SyncMode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Proto$SyncMode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Proto$SyncMode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Proto$SyncMode parseFrom(InputStream inputStream) throws IOException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Proto$SyncMode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Proto$SyncMode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Proto$SyncMode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Proto$SyncMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
