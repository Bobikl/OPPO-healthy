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
public final class WatchAppProto$InstallResult extends GeneratedMessageLite<WatchAppProto$InstallResult, Builder> implements WatchAppProto$InstallResultOrBuilder {
    private static final WatchAppProto$InstallResult DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 2;
    private static volatile Parser<WatchAppProto$InstallResult> PARSER = null;
    public static final int RESULT_CODE_FIELD_NUMBER = 1;
    private int packageName_;
    private int resultCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$InstallResult, Builder> implements WatchAppProto$InstallResultOrBuilder {
        public Builder clearPackageName() {
            copyOnWrite();
            ((WatchAppProto$InstallResult) this.instance).clearPackageName();
            return this;
        }

        public Builder clearResultCode() {
            copyOnWrite();
            ((WatchAppProto$InstallResult) this.instance).clearResultCode();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallResultOrBuilder
        public int getPackageName() {
            return ((WatchAppProto$InstallResult) this.instance).getPackageName();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallResultOrBuilder
        public int getResultCode() {
            return ((WatchAppProto$InstallResult) this.instance).getResultCode();
        }

        public Builder setPackageName(int i) {
            copyOnWrite();
            ((WatchAppProto$InstallResult) this.instance).setPackageName(i);
            return this;
        }

        public Builder setResultCode(int i) {
            copyOnWrite();
            ((WatchAppProto$InstallResult) this.instance).setResultCode(i);
            return this;
        }

        private Builder() {
            super(WatchAppProto$InstallResult.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchAppProto$InstallResult watchAppProto$InstallResult = new WatchAppProto$InstallResult();
        DEFAULT_INSTANCE = watchAppProto$InstallResult;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$InstallResult.class, watchAppProto$InstallResult);
    }

    private WatchAppProto$InstallResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPackageName() {
        this.packageName_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResultCode() {
        this.resultCode_ = 0;
    }

    public static WatchAppProto$InstallResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$InstallResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$InstallResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$InstallResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(int i) {
        this.packageName_ = i;
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
                return new WatchAppProto$InstallResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"resultCode_", "packageName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$InstallResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$InstallResult.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallResultOrBuilder
    public int getPackageName() {
        return this.packageName_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallResultOrBuilder
    public int getResultCode() {
        return this.resultCode_;
    }

    public static Builder newBuilder(WatchAppProto$InstallResult watchAppProto$InstallResult) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$InstallResult);
    }

    public static WatchAppProto$InstallResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$InstallResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$InstallResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$InstallResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$InstallResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$InstallResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$InstallResult parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$InstallResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$InstallResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$InstallResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
