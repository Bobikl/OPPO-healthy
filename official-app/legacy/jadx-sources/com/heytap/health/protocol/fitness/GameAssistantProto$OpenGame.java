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
public final class GameAssistantProto$OpenGame extends GeneratedMessageLite<GameAssistantProto$OpenGame, Builder> implements GameAssistantProto$OpenGameOrBuilder {
    private static final GameAssistantProto$OpenGame DEFAULT_INSTANCE;
    public static final int GAME_ID_FIELD_NUMBER = 1;
    private static volatile Parser<GameAssistantProto$OpenGame> PARSER;
    private int gameId_;

    public static final class Builder extends GeneratedMessageLite.Builder<GameAssistantProto$OpenGame, Builder> implements GameAssistantProto$OpenGameOrBuilder {
        public Builder clearGameId() {
            copyOnWrite();
            ((GameAssistantProto$OpenGame) this.instance).clearGameId();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.GameAssistantProto$OpenGameOrBuilder
        public int getGameId() {
            return ((GameAssistantProto$OpenGame) this.instance).getGameId();
        }

        public Builder setGameId(int i) {
            copyOnWrite();
            ((GameAssistantProto$OpenGame) this.instance).setGameId(i);
            return this;
        }

        private Builder() {
            super(GameAssistantProto$OpenGame.DEFAULT_INSTANCE);
        }
    }

    static {
        GameAssistantProto$OpenGame gameAssistantProto$OpenGame = new GameAssistantProto$OpenGame();
        DEFAULT_INSTANCE = gameAssistantProto$OpenGame;
        GeneratedMessageLite.registerDefaultInstance(GameAssistantProto$OpenGame.class, gameAssistantProto$OpenGame);
    }

    private GameAssistantProto$OpenGame() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGameId() {
        this.gameId_ = 0;
    }

    public static GameAssistantProto$OpenGame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static GameAssistantProto$OpenGame parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$OpenGame parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<GameAssistantProto$OpenGame> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGameId(int i) {
        this.gameId_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = t28.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new GameAssistantProto$OpenGame();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"gameId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<GameAssistantProto$OpenGame> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (GameAssistantProto$OpenGame.class) {
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

    @Override // com.heytap.health.protocol.fitness.GameAssistantProto$OpenGameOrBuilder
    public int getGameId() {
        return this.gameId_;
    }

    public static Builder newBuilder(GameAssistantProto$OpenGame gameAssistantProto$OpenGame) {
        return DEFAULT_INSTANCE.createBuilder(gameAssistantProto$OpenGame);
    }

    public static GameAssistantProto$OpenGame parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGame parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGame parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GameAssistantProto$OpenGame parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GameAssistantProto$OpenGame parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGame parseFrom(InputStream inputStream) throws IOException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GameAssistantProto$OpenGame parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static GameAssistantProto$OpenGame parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GameAssistantProto$OpenGame parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GameAssistantProto$OpenGame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
