package com.heytap.health.protocol.insight;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.r9a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class Insight$ScoreResult extends GeneratedMessageLite<Insight$ScoreResult, Builder> implements Insight$ScoreResultOrBuilder {
    private static final Insight$ScoreResult DEFAULT_INSTANCE;
    private static volatile Parser<Insight$ScoreResult> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int score_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<Insight$ScoreResult, Builder> implements Insight$ScoreResultOrBuilder {
        public Builder clearScore() {
            copyOnWrite();
            ((Insight$ScoreResult) this.instance).clearScore();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((Insight$ScoreResult) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreResultOrBuilder
        public int getScore() {
            return ((Insight$ScoreResult) this.instance).getScore();
        }

        @Override // com.heytap.health.protocol.insight.Insight$ScoreResultOrBuilder
        public int getTimestamp() {
            return ((Insight$ScoreResult) this.instance).getTimestamp();
        }

        public Builder setScore(int i) {
            copyOnWrite();
            ((Insight$ScoreResult) this.instance).setScore(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((Insight$ScoreResult) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(Insight$ScoreResult.DEFAULT_INSTANCE);
        }
    }

    static {
        Insight$ScoreResult insight$ScoreResult = new Insight$ScoreResult();
        DEFAULT_INSTANCE = insight$ScoreResult;
        GeneratedMessageLite.registerDefaultInstance(Insight$ScoreResult.class, insight$ScoreResult);
    }

    private Insight$ScoreResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static Insight$ScoreResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Insight$ScoreResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$ScoreResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Insight$ScoreResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(int i) {
        this.score_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = r9a.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new Insight$ScoreResult();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"timestamp_", "score_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Insight$ScoreResult> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Insight$ScoreResult.class) {
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

    @Override // com.heytap.health.protocol.insight.Insight$ScoreResultOrBuilder
    public int getScore() {
        return this.score_;
    }

    @Override // com.heytap.health.protocol.insight.Insight$ScoreResultOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(Insight$ScoreResult insight$ScoreResult) {
        return DEFAULT_INSTANCE.createBuilder(insight$ScoreResult);
    }

    public static Insight$ScoreResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$ScoreResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Insight$ScoreResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Insight$ScoreResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Insight$ScoreResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Insight$ScoreResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Insight$ScoreResult parseFrom(InputStream inputStream) throws IOException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Insight$ScoreResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Insight$ScoreResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Insight$ScoreResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Insight$ScoreResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
