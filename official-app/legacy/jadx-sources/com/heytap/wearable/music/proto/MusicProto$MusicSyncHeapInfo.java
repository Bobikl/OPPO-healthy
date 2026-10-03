package com.heytap.wearable.music.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.ibc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class MusicProto$MusicSyncHeapInfo extends GeneratedMessageLite<MusicProto$MusicSyncHeapInfo, Builder> implements MusicProto$MusicSyncHeapInfoOrBuilder {
    private static final MusicProto$MusicSyncHeapInfo DEFAULT_INSTANCE;
    public static final int FILE_TOTAL_FIELD_NUMBER = 1;
    private static volatile Parser<MusicProto$MusicSyncHeapInfo> PARSER;
    private int fileTotal_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$MusicSyncHeapInfo, Builder> implements MusicProto$MusicSyncHeapInfoOrBuilder {
        public Builder clearFileTotal() {
            copyOnWrite();
            ((MusicProto$MusicSyncHeapInfo) this.instance).clearFileTotal();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicSyncHeapInfoOrBuilder
        public int getFileTotal() {
            return ((MusicProto$MusicSyncHeapInfo) this.instance).getFileTotal();
        }

        public Builder setFileTotal(int i) {
            copyOnWrite();
            ((MusicProto$MusicSyncHeapInfo) this.instance).setFileTotal(i);
            return this;
        }

        private Builder() {
            super(MusicProto$MusicSyncHeapInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$MusicSyncHeapInfo musicProto$MusicSyncHeapInfo = new MusicProto$MusicSyncHeapInfo();
        DEFAULT_INSTANCE = musicProto$MusicSyncHeapInfo;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$MusicSyncHeapInfo.class, musicProto$MusicSyncHeapInfo);
    }

    private MusicProto$MusicSyncHeapInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileTotal() {
        this.fileTotal_ = 0;
    }

    public static MusicProto$MusicSyncHeapInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$MusicSyncHeapInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$MusicSyncHeapInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileTotal(int i) {
        this.fileTotal_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$MusicSyncHeapInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"fileTotal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$MusicSyncHeapInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$MusicSyncHeapInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicSyncHeapInfoOrBuilder
    public int getFileTotal() {
        return this.fileTotal_;
    }

    public static Builder newBuilder(MusicProto$MusicSyncHeapInfo musicProto$MusicSyncHeapInfo) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$MusicSyncHeapInfo);
    }

    public static MusicProto$MusicSyncHeapInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$MusicSyncHeapInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicSyncHeapInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
