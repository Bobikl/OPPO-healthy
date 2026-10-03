package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.nh7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProto$SleepScore extends GeneratedMessageLite<FitnessProto$SleepScore, Builder> implements FitnessProto$SleepScoreOrBuilder {
    private static final FitnessProto$SleepScore DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$SleepScore> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 1;
    public static final int START_TIME_FIELD_NUMBER = 2;
    private int score_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$SleepScore, Builder> implements FitnessProto$SleepScoreOrBuilder {
        public Builder clearScore() {
            copyOnWrite();
            ((FitnessProto$SleepScore) this.instance).clearScore();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$SleepScore) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepScoreOrBuilder
        public int getScore() {
            return ((FitnessProto$SleepScore) this.instance).getScore();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepScoreOrBuilder
        public int getStartTime() {
            return ((FitnessProto$SleepScore) this.instance).getStartTime();
        }

        public Builder setScore(int i) {
            copyOnWrite();
            ((FitnessProto$SleepScore) this.instance).setScore(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$SleepScore) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$SleepScore.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$SleepScore fitnessProto$SleepScore = new FitnessProto$SleepScore();
        DEFAULT_INSTANCE = fitnessProto$SleepScore;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$SleepScore.class, fitnessProto$SleepScore);
    }

    private FitnessProto$SleepScore() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.score_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProto$SleepScore getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$SleepScore parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepScore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$SleepScore> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(int i) {
        this.score_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$SleepScore();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"score_", "startTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$SleepScore> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$SleepScore.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepScoreOrBuilder
    public int getScore() {
        return this.score_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$SleepScoreOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProto$SleepScore fitnessProto$SleepScore) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$SleepScore);
    }

    public static FitnessProto$SleepScore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepScore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$SleepScore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$SleepScore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$SleepScore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$SleepScore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$SleepScore parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$SleepScore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$SleepScore parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$SleepScore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$SleepScore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
