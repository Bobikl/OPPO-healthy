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
public final class GameAssistantProto$GamePhoneSetting extends GeneratedMessageLite<GameAssistantProto$GamePhoneSetting, Builder> implements GameAssistantProto$GamePhoneSettingOrBuilder {
    private static final GameAssistantProto$GamePhoneSetting DEFAULT_INSTANCE;
    public static final int GAME_ASSISTANT_SUPPORT_FIELD_NUMBER = 1;
    private static volatile Parser<GameAssistantProto$GamePhoneSetting> PARSER;
    private int gameAssistantSupport_;

    public static final class Builder extends GeneratedMessageLite.Builder<GameAssistantProto$GamePhoneSetting, Builder> implements GameAssistantProto$GamePhoneSettingOrBuilder {
        public Builder clearGameAssistantSupport() {
            copyOnWrite();
            ((GameAssistantProto$GamePhoneSetting) this.instance).clearGameAssistantSupport();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.GameAssistantProto$GamePhoneSettingOrBuilder
        public int getGameAssistantSupport() {
            return ((GameAssistantProto$GamePhoneSetting) this.instance).getGameAssistantSupport();
        }

        public Builder setGameAssistantSupport(int i) {
            copyOnWrite();
            ((GameAssistantProto$GamePhoneSetting) this.instance).setGameAssistantSupport(i);
            return this;
        }

        private Builder() {
            super(GameAssistantProto$GamePhoneSetting.DEFAULT_INSTANCE);
        }
    }

    static {
        GameAssistantProto$GamePhoneSetting gameAssistantProto$GamePhoneSetting = new GameAssistantProto$GamePhoneSetting();
        DEFAULT_INSTANCE = gameAssistantProto$GamePhoneSetting;
        GeneratedMessageLite.registerDefaultInstance(GameAssistantProto$GamePhoneSetting.class, gameAssistantProto$GamePhoneSetting);
    }

    private GameAssistantProto$GamePhoneSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameAssistantSupport() {
        this.gameAssistantSupport_ = 0;
    }

    public static GameAssistantProto$GamePhoneSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GameAssistantProto$GamePhoneSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GameAssistantProto$GamePhoneSetting> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameAssistantSupport(int i) {
        this.gameAssistantSupport_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = t28.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GameAssistantProto$GamePhoneSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"gameAssistantSupport_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GameAssistantProto$GamePhoneSetting> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GameAssistantProto$GamePhoneSetting.class) {
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

    @Override // com.heytap.health.protocol.fitness.GameAssistantProto$GamePhoneSettingOrBuilder
    public int getGameAssistantSupport() {
        return this.gameAssistantSupport_;
    }

    public static Builder newBuilder(GameAssistantProto$GamePhoneSetting gameAssistantProto$GamePhoneSetting) {
        return DEFAULT_INSTANCE.createBuilder(gameAssistantProto$GamePhoneSetting);
    }

    public static GameAssistantProto$GamePhoneSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GameAssistantProto$GamePhoneSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$GamePhoneSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
