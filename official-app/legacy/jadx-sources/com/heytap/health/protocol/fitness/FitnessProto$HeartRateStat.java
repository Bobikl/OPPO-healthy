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
public final class FitnessProto$HeartRateStat extends GeneratedMessageLite<FitnessProto$HeartRateStat, Builder> implements FitnessProto$HeartRateStatOrBuilder {
    public static final int AVGWALKHEARTRATE_FIELD_NUMBER = 2;
    private static final FitnessProto$HeartRateStat DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProto$HeartRateStat> PARSER = null;
    public static final int RESTHEARTRATE_FIELD_NUMBER = 3;
    public static final int SLEEPHEARTRATE_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private int avgWalkHeartRate_;
    private int restHeartRate_;
    private int sleepHeartRate_;
    private int timestamp_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$HeartRateStat, Builder> implements FitnessProto$HeartRateStatOrBuilder {
        public Builder clearAvgWalkHeartRate() {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).clearAvgWalkHeartRate();
            return this;
        }

        public Builder clearRestHeartRate() {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).clearRestHeartRate();
            return this;
        }

        public Builder clearSleepHeartRate() {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).clearSleepHeartRate();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
        public int getAvgWalkHeartRate() {
            return ((FitnessProto$HeartRateStat) this.instance).getAvgWalkHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
        public int getRestHeartRate() {
            return ((FitnessProto$HeartRateStat) this.instance).getRestHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
        public int getSleepHeartRate() {
            return ((FitnessProto$HeartRateStat) this.instance).getSleepHeartRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
        public int getTimestamp() {
            return ((FitnessProto$HeartRateStat) this.instance).getTimestamp();
        }

        public Builder setAvgWalkHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).setAvgWalkHeartRate(i);
            return this;
        }

        public Builder setRestHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).setRestHeartRate(i);
            return this;
        }

        public Builder setSleepHeartRate(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).setSleepHeartRate(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateStat) this.instance).setTimestamp(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$HeartRateStat.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$HeartRateStat fitnessProto$HeartRateStat = new FitnessProto$HeartRateStat();
        DEFAULT_INSTANCE = fitnessProto$HeartRateStat;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$HeartRateStat.class, fitnessProto$HeartRateStat);
    }

    private FitnessProto$HeartRateStat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgWalkHeartRate() {
        this.avgWalkHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRestHeartRate() {
        this.restHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepHeartRate() {
        this.sleepHeartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    public static FitnessProto$HeartRateStat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$HeartRateStat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateStat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$HeartRateStat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgWalkHeartRate(int i) {
        this.avgWalkHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRestHeartRate(int i) {
        this.restHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepHeartRate(int i) {
        this.sleepHeartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$HeartRateStat();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b", new Object[]{"timestamp_", "avgWalkHeartRate_", "restHeartRate_", "sleepHeartRate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$HeartRateStat> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$HeartRateStat.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
    public int getAvgWalkHeartRate() {
        return this.avgWalkHeartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
    public int getRestHeartRate() {
        return this.restHeartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
    public int getSleepHeartRate() {
        return this.sleepHeartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateStatOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    public static Builder newBuilder(FitnessProto$HeartRateStat fitnessProto$HeartRateStat) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$HeartRateStat);
    }

    public static FitnessProto$HeartRateStat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateStat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateStat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$HeartRateStat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateStat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$HeartRateStat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateStat parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateStat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateStat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$HeartRateStat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
