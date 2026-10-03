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
public final class WatchAppProto$UpdateAppInfo extends GeneratedMessageLite<WatchAppProto$UpdateAppInfo, Builder> implements WatchAppProto$UpdateAppInfoOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final WatchAppProto$UpdateAppInfo DEFAULT_INSTANCE;
    public static final int NEW_APP_COUNT_FIELD_NUMBER = 2;
    private static volatile Parser<WatchAppProto$UpdateAppInfo> PARSER;
    private int code_;
    private int newAppCount_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$UpdateAppInfo, Builder> implements WatchAppProto$UpdateAppInfoOrBuilder {
        public Builder clearCode() {
            copyOnWrite();
            ((WatchAppProto$UpdateAppInfo) this.instance).clearCode();
            return this;
        }

        public Builder clearNewAppCount() {
            copyOnWrite();
            ((WatchAppProto$UpdateAppInfo) this.instance).clearNewAppCount();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$UpdateAppInfoOrBuilder
        public int getCode() {
            return ((WatchAppProto$UpdateAppInfo) this.instance).getCode();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$UpdateAppInfoOrBuilder
        public int getNewAppCount() {
            return ((WatchAppProto$UpdateAppInfo) this.instance).getNewAppCount();
        }

        public Builder setCode(int i) {
            copyOnWrite();
            ((WatchAppProto$UpdateAppInfo) this.instance).setCode(i);
            return this;
        }

        public Builder setNewAppCount(int i) {
            copyOnWrite();
            ((WatchAppProto$UpdateAppInfo) this.instance).setNewAppCount(i);
            return this;
        }

        private Builder() {
            super(WatchAppProto$UpdateAppInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo = new WatchAppProto$UpdateAppInfo();
        DEFAULT_INSTANCE = watchAppProto$UpdateAppInfo;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$UpdateAppInfo.class, watchAppProto$UpdateAppInfo);
    }

    private WatchAppProto$UpdateAppInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNewAppCount() {
        this.newAppCount_ = 0;
    }

    public static WatchAppProto$UpdateAppInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$UpdateAppInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$UpdateAppInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNewAppCount(int i) {
        this.newAppCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$UpdateAppInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"code_", "newAppCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$UpdateAppInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$UpdateAppInfo.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$UpdateAppInfoOrBuilder
    public int getCode() {
        return this.code_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$UpdateAppInfoOrBuilder
    public int getNewAppCount() {
        return this.newAppCount_;
    }

    public static Builder newBuilder(WatchAppProto$UpdateAppInfo watchAppProto$UpdateAppInfo) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$UpdateAppInfo);
    }

    public static WatchAppProto$UpdateAppInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$UpdateAppInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$UpdateAppInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
