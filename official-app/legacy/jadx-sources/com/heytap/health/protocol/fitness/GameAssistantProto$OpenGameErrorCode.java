package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.t28;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class GameAssistantProto$OpenGameErrorCode extends GeneratedMessageLite<GameAssistantProto$OpenGameErrorCode, Builder> implements GameAssistantProto$OpenGameErrorCodeOrBuilder {
    private static final GameAssistantProto$OpenGameErrorCode DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    private static volatile Parser<GameAssistantProto$OpenGameErrorCode> PARSER;
    private int errorCode_;

    public static final class Builder extends GeneratedMessageLite.Builder<GameAssistantProto$OpenGameErrorCode, Builder> implements GameAssistantProto$OpenGameErrorCodeOrBuilder {
        public Builder clearErrorCode() {
            copyOnWrite();
            ((GameAssistantProto$OpenGameErrorCode) this.instance).clearErrorCode();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.GameAssistantProto$OpenGameErrorCodeOrBuilder
        public int getErrorCode() {
            return ((GameAssistantProto$OpenGameErrorCode) this.instance).getErrorCode();
        }

        public Builder setErrorCode(int i) {
            copyOnWrite();
            ((GameAssistantProto$OpenGameErrorCode) this.instance).setErrorCode(i);
            return this;
        }

        private Builder() {
            super(GameAssistantProto$OpenGameErrorCode.DEFAULT_INSTANCE);
        }
    }

    static {
        GameAssistantProto$OpenGameErrorCode gameAssistantProto$OpenGameErrorCode = new GameAssistantProto$OpenGameErrorCode();
        DEFAULT_INSTANCE = gameAssistantProto$OpenGameErrorCode;
        GeneratedMessageLite.registerDefaultInstance(GameAssistantProto$OpenGameErrorCode.class, gameAssistantProto$OpenGameErrorCode);
    }

    private GameAssistantProto$OpenGameErrorCode() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorCode() {
        this.errorCode_ = 0;
    }

    public static GameAssistantProto$OpenGameErrorCode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GameAssistantProto$OpenGameErrorCode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GameAssistantProto$OpenGameErrorCode> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(int i) {
        this.errorCode_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = t28.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GameAssistantProto$OpenGameErrorCode();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GameAssistantProto$OpenGameErrorCode> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GameAssistantProto$OpenGameErrorCode.class) {
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

    @Override // com.heytap.health.protocol.fitness.GameAssistantProto$OpenGameErrorCodeOrBuilder
    public int getErrorCode() {
        return this.errorCode_;
    }

    public static Builder newBuilder(GameAssistantProto$OpenGameErrorCode gameAssistantProto$OpenGameErrorCode) {
        return DEFAULT_INSTANCE.createBuilder(gameAssistantProto$OpenGameErrorCode);
    }

    public static GameAssistantProto$OpenGameErrorCode parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GameAssistantProto$OpenGameErrorCode parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$OpenGameErrorCode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
