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
public final class MusicProto$RequestTotalInfo extends GeneratedMessageLite<MusicProto$RequestTotalInfo, Builder> implements MusicProto$RequestTotalInfoOrBuilder {
    private static final MusicProto$RequestTotalInfo DEFAULT_INSTANCE;
    private static volatile Parser<MusicProto$RequestTotalInfo> PARSER = null;
    public static final int REQUEST_TOTAL_INFO_FIELD_NUMBER = 1;
    private boolean requestTotalInfo_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$RequestTotalInfo, Builder> implements MusicProto$RequestTotalInfoOrBuilder {
        public Builder clearRequestTotalInfo() {
            copyOnWrite();
            ((MusicProto$RequestTotalInfo) this.instance).clearRequestTotalInfo();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$RequestTotalInfoOrBuilder
        public boolean getRequestTotalInfo() {
            return ((MusicProto$RequestTotalInfo) this.instance).getRequestTotalInfo();
        }

        public Builder setRequestTotalInfo(boolean z) {
            copyOnWrite();
            ((MusicProto$RequestTotalInfo) this.instance).setRequestTotalInfo(z);
            return this;
        }

        private Builder() {
            super(MusicProto$RequestTotalInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$RequestTotalInfo musicProto$RequestTotalInfo = new MusicProto$RequestTotalInfo();
        DEFAULT_INSTANCE = musicProto$RequestTotalInfo;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$RequestTotalInfo.class, musicProto$RequestTotalInfo);
    }

    private MusicProto$RequestTotalInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTotalInfo() {
        this.requestTotalInfo_ = false;
    }

    public static MusicProto$RequestTotalInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$RequestTotalInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$RequestTotalInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$RequestTotalInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTotalInfo(boolean z) {
        this.requestTotalInfo_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$RequestTotalInfo();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"requestTotalInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$RequestTotalInfo> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$RequestTotalInfo.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$RequestTotalInfoOrBuilder
    public boolean getRequestTotalInfo() {
        return this.requestTotalInfo_;
    }

    public static Builder newBuilder(MusicProto$RequestTotalInfo musicProto$RequestTotalInfo) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$RequestTotalInfo);
    }

    public static MusicProto$RequestTotalInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$RequestTotalInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$RequestTotalInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$RequestTotalInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$RequestTotalInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$RequestTotalInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$RequestTotalInfo parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$RequestTotalInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$RequestTotalInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$RequestTotalInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$RequestTotalInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
