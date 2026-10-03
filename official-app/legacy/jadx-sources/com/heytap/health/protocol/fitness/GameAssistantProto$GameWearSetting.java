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
public final class GameAssistantProto$GameWearSetting extends GeneratedMessageLite<GameAssistantProto$GameWearSetting, Builder> implements GameAssistantProto$GameWearSettingOrBuilder {
    private static final GameAssistantProto$GameWearSetting DEFAULT_INSTANCE;
    public static final int GAME_SETTING_NOTIFY_SW_FIELD_NUMBER = 1;
    public static final int GAME_STATE_FIELD_NUMBER = 2;
    private static volatile Parser<GameAssistantProto$GameWearSetting> PARSER;
    private int gameSettingNotifySw_;
    private int gameState_;

    public static final class Builder extends GeneratedMessageLite.Builder<GameAssistantProto$GameWearSetting, Builder> implements GameAssistantProto$GameWearSettingOrBuilder {
        public Builder clearGameSettingNotifySw() {
            copyOnWrite();
            ((GameAssistantProto$GameWearSetting) this.instance).clearGameSettingNotifySw();
            return this;
        }

        public Builder clearGameState() {
            copyOnWrite();
            ((GameAssistantProto$GameWearSetting) this.instance).clearGameState();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.GameAssistantProto$GameWearSettingOrBuilder
        public int getGameSettingNotifySw() {
            return ((GameAssistantProto$GameWearSetting) this.instance).getGameSettingNotifySw();
        }

        @Override // com.heytap.health.protocol.fitness.GameAssistantProto$GameWearSettingOrBuilder
        public int getGameState() {
            return ((GameAssistantProto$GameWearSetting) this.instance).getGameState();
        }

        public Builder setGameSettingNotifySw(int i) {
            copyOnWrite();
            ((GameAssistantProto$GameWearSetting) this.instance).setGameSettingNotifySw(i);
            return this;
        }

        public Builder setGameState(int i) {
            copyOnWrite();
            ((GameAssistantProto$GameWearSetting) this.instance).setGameState(i);
            return this;
        }

        private Builder() {
            super(GameAssistantProto$GameWearSetting.DEFAULT_INSTANCE);
        }
    }

    static {
        GameAssistantProto$GameWearSetting gameAssistantProto$GameWearSetting = new GameAssistantProto$GameWearSetting();
        DEFAULT_INSTANCE = gameAssistantProto$GameWearSetting;
        GeneratedMessageLite.registerDefaultInstance(GameAssistantProto$GameWearSetting.class, gameAssistantProto$GameWearSetting);
    }

    private GameAssistantProto$GameWearSetting() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameSettingNotifySw() {
        this.gameSettingNotifySw_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameState() {
        this.gameState_ = 0;
    }

    public static GameAssistantProto$GameWearSetting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GameAssistantProto$GameWearSetting parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GameAssistantProto$GameWearSetting> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameSettingNotifySw(int i) {
        this.gameSettingNotifySw_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameState(int i) {
        this.gameState_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = t28.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GameAssistantProto$GameWearSetting();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"gameSettingNotifySw_", "gameState_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GameAssistantProto$GameWearSetting> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GameAssistantProto$GameWearSetting.class) {
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

    @Override // com.heytap.health.protocol.fitness.GameAssistantProto$GameWearSettingOrBuilder
    public int getGameSettingNotifySw() {
        return this.gameSettingNotifySw_;
    }

    @Override // com.heytap.health.protocol.fitness.GameAssistantProto$GameWearSettingOrBuilder
    public int getGameState() {
        return this.gameState_;
    }

    public static Builder newBuilder(GameAssistantProto$GameWearSetting gameAssistantProto$GameWearSetting) {
        return DEFAULT_INSTANCE.createBuilder(gameAssistantProto$GameWearSetting);
    }

    public static GameAssistantProto$GameWearSetting parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GameAssistantProto$GameWearSetting parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$GameWearSetting) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
