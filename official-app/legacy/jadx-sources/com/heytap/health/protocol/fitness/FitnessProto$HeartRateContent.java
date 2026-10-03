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
public final class FitnessProto$HeartRateContent extends GeneratedMessageLite<FitnessProto$HeartRateContent, Builder> implements FitnessProto$HeartRateContentOrBuilder {
    private static final FitnessProto$HeartRateContent DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 6;
    public static final int HEART_RATE_ALARM_TYPE_FIELD_NUMBER = 1;
    public static final int HEART_RATE_HIGHEST_FIELD_NUMBER = 8;
    public static final int HEART_RATE_LOWEST_FIELD_NUMBER = 7;
    public static final int HEART_RATE_TYPE_FIELD_NUMBER = 2;
    public static final int HEART_RATE_VALUE_MAX_FIELD_NUMBER = 4;
    public static final int HEART_RATE_VALUE_MIN_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$HeartRateContent> PARSER = null;
    public static final int START_TIME_FIELD_NUMBER = 5;
    private int endTime_;
    private int heartRateAlarmType_;
    private int heartRateHighest_;
    private int heartRateLowest_;
    private int heartRateType_;
    private int heartRateValueMax_;
    private int heartRateValueMin_;
    private int startTime_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$HeartRateContent, Builder> implements FitnessProto$HeartRateContentOrBuilder {
        public Builder clearEndTime() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearEndTime();
            return this;
        }

        public Builder clearHeartRateAlarmType() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearHeartRateAlarmType();
            return this;
        }

        public Builder clearHeartRateHighest() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearHeartRateHighest();
            return this;
        }

        public Builder clearHeartRateLowest() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearHeartRateLowest();
            return this;
        }

        public Builder clearHeartRateType() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearHeartRateType();
            return this;
        }

        public Builder clearHeartRateValueMax() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearHeartRateValueMax();
            return this;
        }

        public Builder clearHeartRateValueMin() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearHeartRateValueMin();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).clearStartTime();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getEndTime() {
            return ((FitnessProto$HeartRateContent) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getHeartRateAlarmType() {
            return ((FitnessProto$HeartRateContent) this.instance).getHeartRateAlarmType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getHeartRateHighest() {
            return ((FitnessProto$HeartRateContent) this.instance).getHeartRateHighest();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getHeartRateLowest() {
            return ((FitnessProto$HeartRateContent) this.instance).getHeartRateLowest();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getHeartRateType() {
            return ((FitnessProto$HeartRateContent) this.instance).getHeartRateType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getHeartRateValueMax() {
            return ((FitnessProto$HeartRateContent) this.instance).getHeartRateValueMax();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getHeartRateValueMin() {
            return ((FitnessProto$HeartRateContent) this.instance).getHeartRateValueMin();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
        public int getStartTime() {
            return ((FitnessProto$HeartRateContent) this.instance).getStartTime();
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setEndTime(i);
            return this;
        }

        public Builder setHeartRateAlarmType(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setHeartRateAlarmType(i);
            return this;
        }

        public Builder setHeartRateHighest(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setHeartRateHighest(i);
            return this;
        }

        public Builder setHeartRateLowest(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setHeartRateLowest(i);
            return this;
        }

        public Builder setHeartRateType(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setHeartRateType(i);
            return this;
        }

        public Builder setHeartRateValueMax(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setHeartRateValueMax(i);
            return this;
        }

        public Builder setHeartRateValueMin(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setHeartRateValueMin(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((FitnessProto$HeartRateContent) this.instance).setStartTime(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$HeartRateContent.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$HeartRateContent fitnessProto$HeartRateContent = new FitnessProto$HeartRateContent();
        DEFAULT_INSTANCE = fitnessProto$HeartRateContent;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$HeartRateContent.class, fitnessProto$HeartRateContent);
    }

    private FitnessProto$HeartRateContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateAlarmType() {
        this.heartRateAlarmType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateHighest() {
        this.heartRateHighest_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateLowest() {
        this.heartRateLowest_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateType() {
        this.heartRateType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateValueMax() {
        this.heartRateValueMax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateValueMin() {
        this.heartRateValueMin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    public static FitnessProto$HeartRateContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$HeartRateContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$HeartRateContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateAlarmType(int i) {
        this.heartRateAlarmType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateHighest(int i) {
        this.heartRateHighest_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateLowest(int i) {
        this.heartRateLowest_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateType(int i) {
        this.heartRateType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateValueMax(int i) {
        this.heartRateValueMax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateValueMin(int i) {
        this.heartRateValueMin_ = i;
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
                return new FitnessProto$HeartRateContent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004", new Object[]{"heartRateAlarmType_", "heartRateType_", "heartRateValueMin_", "heartRateValueMax_", "startTime_", "endTime_", "heartRateLowest_", "heartRateHighest_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$HeartRateContent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$HeartRateContent.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getHeartRateAlarmType() {
        return this.heartRateAlarmType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getHeartRateHighest() {
        return this.heartRateHighest_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getHeartRateLowest() {
        return this.heartRateLowest_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getHeartRateType() {
        return this.heartRateType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getHeartRateValueMax() {
        return this.heartRateValueMax_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getHeartRateValueMin() {
        return this.heartRateValueMin_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$HeartRateContentOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    public static Builder newBuilder(FitnessProto$HeartRateContent fitnessProto$HeartRateContent) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$HeartRateContent);
    }

    public static FitnessProto$HeartRateContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$HeartRateContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$HeartRateContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateContent parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$HeartRateContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$HeartRateContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$HeartRateContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$HeartRateContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
