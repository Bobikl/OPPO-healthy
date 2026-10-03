package com.heytap.health.watch.watchapp.proto;

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
public final class WatchAppProto$InstallCheckResult extends GeneratedMessageLite<WatchAppProto$InstallCheckResult, Builder> implements WatchAppProto$InstallCheckResultOrBuilder {
    private static final WatchAppProto$InstallCheckResult DEFAULT_INSTANCE;
    private static volatile Parser<WatchAppProto$InstallCheckResult> PARSER = null;
    public static final int RESULT_CODE_FIELD_NUMBER = 1;
    private int resultCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$InstallCheckResult, Builder> implements WatchAppProto$InstallCheckResultOrBuilder {
        public Builder clearResultCode() {
            copyOnWrite();
            ((WatchAppProto$InstallCheckResult) this.instance).clearResultCode();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallCheckResultOrBuilder
        public int getResultCode() {
            return ((WatchAppProto$InstallCheckResult) this.instance).getResultCode();
        }

        public Builder setResultCode(int i) {
            copyOnWrite();
            ((WatchAppProto$InstallCheckResult) this.instance).setResultCode(i);
            return this;
        }

        private Builder() {
            super(WatchAppProto$InstallCheckResult.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult = new WatchAppProto$InstallCheckResult();
        DEFAULT_INSTANCE = watchAppProto$InstallCheckResult;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$InstallCheckResult.class, watchAppProto$InstallCheckResult);
    }

    private WatchAppProto$InstallCheckResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCode() {
        this.resultCode_ = 0;
    }

    public static WatchAppProto$InstallCheckResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$InstallCheckResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$InstallCheckResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultCode(int i) {
        this.resultCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$InstallCheckResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"resultCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$InstallCheckResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$InstallCheckResult.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallCheckResultOrBuilder
    public int getResultCode() {
        return this.resultCode_;
    }

    public static Builder newBuilder(WatchAppProto$InstallCheckResult watchAppProto$InstallCheckResult) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$InstallCheckResult);
    }

    public static WatchAppProto$InstallCheckResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$InstallCheckResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallCheckResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
