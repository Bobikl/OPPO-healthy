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
public final class MusicProto$MusicTransErrorCode extends GeneratedMessageLite<MusicProto$MusicTransErrorCode, Builder> implements MusicProto$MusicTransErrorCodeOrBuilder {
    private static final MusicProto$MusicTransErrorCode DEFAULT_INSTANCE;
    public static final int ERRORCODE_FIELD_NUMBER = 1;
    private static volatile Parser<MusicProto$MusicTransErrorCode> PARSER;
    private int errorCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<MusicProto$MusicTransErrorCode, Builder> implements MusicProto$MusicTransErrorCodeOrBuilder {
        public Builder clearErrorCode() {
            copyOnWrite();
            ((MusicProto$MusicTransErrorCode) this.instance).clearErrorCode();
            return this;
        }

        @Override // com.heytap.wearable.music.proto.MusicProto$MusicTransErrorCodeOrBuilder
        public int getErrorCode() {
            return ((MusicProto$MusicTransErrorCode) this.instance).getErrorCode();
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((MusicProto$MusicTransErrorCode) this.instance).setErrorCode(i);
            return this;
        }

        private Builder() {
            super(MusicProto$MusicTransErrorCode.DEFAULT_INSTANCE);
        }
    }

    static {
        MusicProto$MusicTransErrorCode musicProto$MusicTransErrorCode = new MusicProto$MusicTransErrorCode();
        DEFAULT_INSTANCE = musicProto$MusicTransErrorCode;
        GeneratedMessageLite.registerDefaultInstance(MusicProto$MusicTransErrorCode.class, musicProto$MusicTransErrorCode);
    }

    private MusicProto$MusicTransErrorCode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    public static MusicProto$MusicTransErrorCode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static MusicProto$MusicTransErrorCode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<MusicProto$MusicTransErrorCode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i) {
        this.errorCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ibc.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new MusicProto$MusicTransErrorCode();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<MusicProto$MusicTransErrorCode> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (MusicProto$MusicTransErrorCode.class) {
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

    @Override // com.heytap.wearable.music.proto.MusicProto$MusicTransErrorCodeOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    public static Builder newBuilder(MusicProto$MusicTransErrorCode musicProto$MusicTransErrorCode) {
        return DEFAULT_INSTANCE.createBuilder(musicProto$MusicTransErrorCode);
    }

    public static MusicProto$MusicTransErrorCode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(InputStream inputStream) throws IOException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MusicProto$MusicTransErrorCode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MusicProto$MusicTransErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
