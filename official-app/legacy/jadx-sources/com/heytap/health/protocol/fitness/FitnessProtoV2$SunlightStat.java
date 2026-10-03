package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SunlightStat extends GeneratedMessageLite<FitnessProtoV2$SunlightStat, Builder> implements FitnessProtoV2$SunlightStatOrBuilder {
    private static final FitnessProtoV2$SunlightStat DEFAULT_INSTANCE;
    public static final int IS_VALID_SUNSHINE_FIELD_NUMBER = 5;
    private static volatile Parser<FitnessProtoV2$SunlightStat> PARSER = null;
    public static final int SUNLIGHT_DURATION_GOAL_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TOTAL_SUNLIGHT_DURATION_FIELD_NUMBER = 2;
    public static final int VITAMIND_PERCENTAGE_FIELD_NUMBER = 4;
    private int isValidSunshine_;
    private int sunlightDurationGoal_;
    private int timestamp_;
    private int totalSunlightDuration_;
    private int vitaminDPercentage_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SunlightStat, Builder> implements FitnessProtoV2$SunlightStatOrBuilder {
        private Builder() {
            super(FitnessProtoV2$SunlightStat.DEFAULT_INSTANCE);
        }

        public Builder clearIsValidSunshine() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).clearIsValidSunshine();
            return this;
        }

        public Builder clearSunlightDurationGoal() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).clearSunlightDurationGoal();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearTotalSunlightDuration() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).clearTotalSunlightDuration();
            return this;
        }

        public Builder clearVitaminDPercentage() {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).clearVitaminDPercentage();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
        public int getIsValidSunshine() {
            return ((FitnessProtoV2$SunlightStat) this.instance).getIsValidSunshine();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
        public int getSunlightDurationGoal() {
            return ((FitnessProtoV2$SunlightStat) this.instance).getSunlightDurationGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
        public int getTimestamp() {
            return ((FitnessProtoV2$SunlightStat) this.instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
        public int getTotalSunlightDuration() {
            return ((FitnessProtoV2$SunlightStat) this.instance).getTotalSunlightDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
        public int getVitaminDPercentage() {
            return ((FitnessProtoV2$SunlightStat) this.instance).getVitaminDPercentage();
        }

        public Builder setIsValidSunshine(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).setIsValidSunshine(i);
            return this;
        }

        public Builder setSunlightDurationGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).setSunlightDurationGoal(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).setTimestamp(i);
            return this;
        }

        public Builder setTotalSunlightDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).setTotalSunlightDuration(i);
            return this;
        }

        public Builder setVitaminDPercentage(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SunlightStat) this.instance).setVitaminDPercentage(i);
            return this;
        }
    }

    static {
        FitnessProtoV2$SunlightStat fitnessProtoV2$SunlightStat = new FitnessProtoV2$SunlightStat();
        DEFAULT_INSTANCE = fitnessProtoV2$SunlightStat;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SunlightStat.class, fitnessProtoV2$SunlightStat);
    }

    private FitnessProtoV2$SunlightStat() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsValidSunshine() {
        this.isValidSunshine_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSunlightDurationGoal() {
        this.sunlightDurationGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalSunlightDuration() {
        this.totalSunlightDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVitaminDPercentage() {
        this.vitaminDPercentage_ = 0;
    }

    public static FitnessProtoV2$SunlightStat getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SunlightStat parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<FitnessProtoV2$SunlightStat> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsValidSunshine(int i) {
        this.isValidSunshine_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSunlightDurationGoal(int i) {
        this.sunlightDurationGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalSunlightDuration(int i) {
        this.totalSunlightDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVitaminDPercentage(int i) {
        this.vitaminDPercentage_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = in7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SunlightStat();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b", new Object[]{"timestamp_", "totalSunlightDuration_", "sunlightDurationGoal_", "vitaminDPercentage_", "isValidSunshine_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SunlightStat> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SunlightStat.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
    public int getIsValidSunshine() {
        return this.isValidSunshine_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
    public int getSunlightDurationGoal() {
        return this.sunlightDurationGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
    public int getTotalSunlightDuration() {
        return this.totalSunlightDuration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SunlightStatOrBuilder
    public int getVitaminDPercentage() {
        return this.vitaminDPercentage_;
    }

    public static Builder newBuilder(FitnessProtoV2$SunlightStat fitnessProtoV2$SunlightStat) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SunlightStat);
    }

    public static FitnessProtoV2$SunlightStat parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SunlightStat parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SunlightStat) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
