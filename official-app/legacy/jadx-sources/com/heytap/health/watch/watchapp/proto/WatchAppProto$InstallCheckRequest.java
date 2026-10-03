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
public final class WatchAppProto$InstallCheckRequest extends GeneratedMessageLite<WatchAppProto$InstallCheckRequest, Builder> implements WatchAppProto$InstallCheckRequestOrBuilder {
    private static final WatchAppProto$InstallCheckRequest DEFAULT_INSTANCE;
    public static final int FILE_SIZE_FIELD_NUMBER = 1;
    private static volatile Parser<WatchAppProto$InstallCheckRequest> PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int fileSize_;
    private int type_;

    public static final class Builder extends GeneratedMessageLite.Builder<WatchAppProto$InstallCheckRequest, Builder> implements WatchAppProto$InstallCheckRequestOrBuilder {
        public Builder clearFileSize() {
            copyOnWrite();
            ((WatchAppProto$InstallCheckRequest) this.instance).clearFileSize();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((WatchAppProto$InstallCheckRequest) this.instance).clearType();
            return this;
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallCheckRequestOrBuilder
        public int getFileSize() {
            return ((WatchAppProto$InstallCheckRequest) this.instance).getFileSize();
        }

        @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallCheckRequestOrBuilder
        public int getType() {
            return ((WatchAppProto$InstallCheckRequest) this.instance).getType();
        }

        public Builder setFileSize(int i) {
            copyOnWrite();
            ((WatchAppProto$InstallCheckRequest) this.instance).setFileSize(i);
            return this;
        }

        public Builder setType(int i) {
            copyOnWrite();
            ((WatchAppProto$InstallCheckRequest) this.instance).setType(i);
            return this;
        }

        private Builder() {
            super(WatchAppProto$InstallCheckRequest.DEFAULT_INSTANCE);
        }
    }

    static {
        WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest = new WatchAppProto$InstallCheckRequest();
        DEFAULT_INSTANCE = watchAppProto$InstallCheckRequest;
        GeneratedMessageLite.registerDefaultInstance(WatchAppProto$InstallCheckRequest.class, watchAppProto$InstallCheckRequest);
    }

    private WatchAppProto$InstallCheckRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileSize() {
        this.fileSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static WatchAppProto$InstallCheckRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static WatchAppProto$InstallCheckRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<WatchAppProto$InstallCheckRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileSize(int i) {
        this.fileSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = l8l.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new WatchAppProto$InstallCheckRequest();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"fileSize_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<WatchAppProto$InstallCheckRequest> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (WatchAppProto$InstallCheckRequest.class) {
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

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallCheckRequestOrBuilder
    public int getFileSize() {
        return this.fileSize_;
    }

    @Override // com.heytap.health.watch.watchapp.proto.WatchAppProto$InstallCheckRequestOrBuilder
    public int getType() {
        return this.type_;
    }

    public static Builder newBuilder(WatchAppProto$InstallCheckRequest watchAppProto$InstallCheckRequest) {
        return DEFAULT_INSTANCE.createBuilder(watchAppProto$InstallCheckRequest);
    }

    public static WatchAppProto$InstallCheckRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(InputStream inputStream) throws IOException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WatchAppProto$InstallCheckRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WatchAppProto$InstallCheckRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
