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
public final class FitnessProto$DailyActivityContent extends GeneratedMessageLite<FitnessProto$DailyActivityContent, Builder> implements FitnessProto$DailyActivityContentOrBuilder {
    public static final int ACTIVITY_COUNT_FIELD_NUMBER = 5;
    public static final int CALORIES_FIELD_NUMBER = 4;
    public static final int DATE_FIELD_NUMBER = 1;
    private static final FitnessProto$DailyActivityContent DEFAULT_INSTANCE;
    public static final int EXERCISE_TIME_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProto$DailyActivityContent> PARSER = null;
    public static final int STEP_COUNT_FIELD_NUMBER = 2;
    private int activityCount_;
    private int calories_;
    private int date_;
    private int exerciseTime_;
    private int stepCount_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$DailyActivityContent, Builder> implements FitnessProto$DailyActivityContentOrBuilder {
        public Builder clearActivityCount() {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).clearActivityCount();
            return this;
        }

        public Builder clearCalories() {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).clearCalories();
            return this;
        }

        public Builder clearDate() {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).clearDate();
            return this;
        }

        public Builder clearExerciseTime() {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).clearExerciseTime();
            return this;
        }

        public Builder clearStepCount() {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).clearStepCount();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
        public int getActivityCount() {
            return ((FitnessProto$DailyActivityContent) this.instance).getActivityCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
        public int getCalories() {
            return ((FitnessProto$DailyActivityContent) this.instance).getCalories();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
        public int getDate() {
            return ((FitnessProto$DailyActivityContent) this.instance).getDate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
        public int getExerciseTime() {
            return ((FitnessProto$DailyActivityContent) this.instance).getExerciseTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
        public int getStepCount() {
            return ((FitnessProto$DailyActivityContent) this.instance).getStepCount();
        }

        public Builder setActivityCount(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).setActivityCount(i);
            return this;
        }

        public Builder setCalories(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).setCalories(i);
            return this;
        }

        public Builder setDate(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).setDate(i);
            return this;
        }

        public Builder setExerciseTime(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).setExerciseTime(i);
            return this;
        }

        public Builder setStepCount(int i) {
            copyOnWrite();
            ((FitnessProto$DailyActivityContent) this.instance).setStepCount(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$DailyActivityContent.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$DailyActivityContent fitnessProto$DailyActivityContent = new FitnessProto$DailyActivityContent();
        DEFAULT_INSTANCE = fitnessProto$DailyActivityContent;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$DailyActivityContent.class, fitnessProto$DailyActivityContent);
    }

    private FitnessProto$DailyActivityContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCount() {
        this.activityCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCalories() {
        this.calories_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDate() {
        this.date_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseTime() {
        this.exerciseTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStepCount() {
        this.stepCount_ = 0;
    }

    public static FitnessProto$DailyActivityContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$DailyActivityContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$DailyActivityContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$DailyActivityContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCount(int i) {
        this.activityCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCalories(int i) {
        this.calories_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDate(int i) {
        this.date_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseTime(int i) {
        this.exerciseTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStepCount(int i) {
        this.stepCount_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = nh7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$DailyActivityContent();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004", new Object[]{"date_", "stepCount_", "exerciseTime_", "calories_", "activityCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProto$DailyActivityContent> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$DailyActivityContent.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
    public int getActivityCount() {
        return this.activityCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
    public int getCalories() {
        return this.calories_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
    public int getDate() {
        return this.date_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
    public int getExerciseTime() {
        return this.exerciseTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$DailyActivityContentOrBuilder
    public int getStepCount() {
        return this.stepCount_;
    }

    public static Builder newBuilder(FitnessProto$DailyActivityContent fitnessProto$DailyActivityContent) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProto$DailyActivityContent);
    }

    public static FitnessProto$DailyActivityContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityContent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$DailyActivityContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$DailyActivityContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityContent parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$DailyActivityContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$DailyActivityContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$DailyActivityContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$DailyActivityContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
