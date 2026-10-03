package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.pi7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProto$ActivityItem extends GeneratedMessageLite<FitnessProto$ActivityItem, Builder> implements FitnessProto$ActivityItemOrBuilder {
    private static final FitnessProto$ActivityItem DEFAULT_INSTANCE;
    public static final int EXERCISE_AMOUNT_FIELD_NUMBER = 9;
    public static final int MINUTE_CALORIE_FIELD_NUMBER = 2;
    public static final int MINUTE_DISTANCE_FIELD_NUMBER = 3;
    public static final int MINUTE_EXERCISE_FIELD_NUMBER = 6;
    public static final int MINUTE_HEIGHT_FIELD_NUMBER = 4;
    public static final int MINUTE_SPORT_TYPE_FIELD_NUMBER = 5;
    public static final int MINUTE_STEP_FIELD_NUMBER = 7;
    private static volatile Parser<FitnessProto$ActivityItem> PARSER = null;
    public static final int SEDENTARY_STATE_FIELD_NUMBER = 8;
    public static final int TIME_OFFSET_FIELD_NUMBER = 1;
    private int exerciseAmount_;
    private int minuteCalorie_;
    private int minuteDistance_;
    private int minuteExercise_;
    private int minuteHeight_;
    private int minuteSportType_;
    private int minuteStep_;
    private int sedentaryState_;
    private int timeOffset_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProto$ActivityItem, Builder> implements FitnessProto$ActivityItemOrBuilder {
        public Builder clearExerciseAmount() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearExerciseAmount();
            return this;
        }

        public Builder clearMinuteCalorie() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearMinuteCalorie();
            return this;
        }

        public Builder clearMinuteDistance() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearMinuteDistance();
            return this;
        }

        public Builder clearMinuteExercise() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearMinuteExercise();
            return this;
        }

        public Builder clearMinuteHeight() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearMinuteHeight();
            return this;
        }

        public Builder clearMinuteSportType() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearMinuteSportType();
            return this;
        }

        public Builder clearMinuteStep() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearMinuteStep();
            return this;
        }

        public Builder clearSedentaryState() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearSedentaryState();
            return this;
        }

        public Builder clearTimeOffset() {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).clearTimeOffset();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getExerciseAmount() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getExerciseAmount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getMinuteCalorie() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getMinuteCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getMinuteDistance() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getMinuteDistance();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getMinuteExercise() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getMinuteExercise();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getMinuteHeight() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getMinuteHeight();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getMinuteSportType() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getMinuteSportType();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getMinuteStep() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getMinuteStep();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getSedentaryState() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getSedentaryState();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
        public int getTimeOffset() {
            return ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).getTimeOffset();
        }

        public Builder setExerciseAmount(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setExerciseAmount(i);
            return this;
        }

        public Builder setMinuteCalorie(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setMinuteCalorie(i);
            return this;
        }

        public Builder setMinuteDistance(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setMinuteDistance(i);
            return this;
        }

        public Builder setMinuteExercise(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setMinuteExercise(i);
            return this;
        }

        public Builder setMinuteHeight(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setMinuteHeight(i);
            return this;
        }

        public Builder setMinuteSportType(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setMinuteSportType(i);
            return this;
        }

        public Builder setMinuteStep(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setMinuteStep(i);
            return this;
        }

        public Builder setSedentaryState(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setSedentaryState(i);
            return this;
        }

        public Builder setTimeOffset(int i) {
            copyOnWrite();
            ((FitnessProto$ActivityItem) ((GeneratedMessageLite.Builder) this).instance).setTimeOffset(i);
            return this;
        }

        private Builder() {
            super(FitnessProto$ActivityItem.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProto$ActivityItem fitnessProto$ActivityItem = new FitnessProto$ActivityItem();
        DEFAULT_INSTANCE = fitnessProto$ActivityItem;
        GeneratedMessageLite.registerDefaultInstance(FitnessProto$ActivityItem.class, fitnessProto$ActivityItem);
    }

    private FitnessProto$ActivityItem() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExerciseAmount() {
        this.exerciseAmount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteCalorie() {
        this.minuteCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteDistance() {
        this.minuteDistance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteExercise() {
        this.minuteExercise_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteHeight() {
        this.minuteHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteSportType() {
        this.minuteSportType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinuteStep() {
        this.minuteStep_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSedentaryState() {
        this.sedentaryState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeOffset() {
        this.timeOffset_ = 0;
    }

    public static FitnessProto$ActivityItem getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProto$ActivityItem parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ActivityItem parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProto$ActivityItem> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExerciseAmount(int i) {
        this.exerciseAmount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteCalorie(int i) {
        this.minuteCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteDistance(int i) {
        this.minuteDistance_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteExercise(int i) {
        this.minuteExercise_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteHeight(int i) {
        this.minuteHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteSportType(int i) {
        this.minuteSportType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinuteStep(int i) {
        this.minuteStep_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSedentaryState(int i) {
        this.sedentaryState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeOffset(int i) {
        this.timeOffset_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = pi7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProto$ActivityItem();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\t\u000b", new Object[]{"timeOffset_", "minuteCalorie_", "minuteDistance_", "minuteHeight_", "minuteSportType_", "minuteExercise_", "minuteStep_", "sedentaryState_", "exerciseAmount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProto$ActivityItem.class) {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
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

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getExerciseAmount() {
        return this.exerciseAmount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getMinuteCalorie() {
        return this.minuteCalorie_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getMinuteDistance() {
        return this.minuteDistance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getMinuteExercise() {
        return this.minuteExercise_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getMinuteHeight() {
        return this.minuteHeight_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getMinuteSportType() {
        return this.minuteSportType_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getMinuteStep() {
        return this.minuteStep_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getSedentaryState() {
        return this.sedentaryState_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProto$ActivityItemOrBuilder
    public int getTimeOffset() {
        return this.timeOffset_;
    }

    public static Builder newBuilder(FitnessProto$ActivityItem fitnessProto$ActivityItem) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProto$ActivityItem);
    }

    public static FitnessProto$ActivityItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ActivityItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProto$ActivityItem parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProto$ActivityItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProto$ActivityItem parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProto$ActivityItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProto$ActivityItem parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProto$ActivityItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProto$ActivityItem parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProto$ActivityItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProto$ActivityItem) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}