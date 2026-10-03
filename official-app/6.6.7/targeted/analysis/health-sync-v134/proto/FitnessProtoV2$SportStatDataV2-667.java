package com.heytap.health.protocol.fitness;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$SportStatDataV2 extends GeneratedMessageLite<FitnessProtoV2$SportStatDataV2, Builder> implements FitnessProtoV2$SportStatDataV2OrBuilder {
    public static final int ACTIVITYCOUNT_FIELD_NUMBER = 7;
    private static final FitnessProtoV2$SportStatDataV2 DEFAULT_INSTANCE;
    private static volatile Parser<FitnessProtoV2$SportStatDataV2> PARSER = null;
    public static final int SEDENTARYCOUNT_FIELD_NUMBER = 9;
    public static final int SEDENTARYTIME_FIELD_NUMBER = 10;
    public static final int STATICCALORIE_FIELD_NUMBER = 8;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TOTALAMOUNTOFEXERCISE_FIELD_NUMBER = 11;
    public static final int TOTAL_CALORIE_FIELD_NUMBER = 2;
    public static final int TOTAL_DISTANCE_FIELD_NUMBER = 4;
    public static final int TOTAL_EXERCISE_FIELD_NUMBER = 6;
    public static final int TOTAL_FLOOR_FIELD_NUMBER = 5;
    public static final int TOTAL_STEP_FIELD_NUMBER = 3;
    private int activityCount_;
    private int sedentaryCount_;
    private int sedentaryTime_;
    private int staticCalorie_;
    private int timestamp_;
    private int totalAmountOfExercise_;
    private int totalCalorie_;
    private int totalDistance_;
    private int totalExercise_;
    private int totalFloor_;
    private int totalStep_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SportStatDataV2, Builder> implements FitnessProtoV2$SportStatDataV2OrBuilder {
        public Builder clearActivityCount() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearActivityCount();
            return this;
        }

        public Builder clearSedentaryCount() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSedentaryCount();
            return this;
        }

        public Builder clearSedentaryTime() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSedentaryTime();
            return this;
        }

        public Builder clearStaticCalorie() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearStaticCalorie();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTimestamp();
            return this;
        }

        public Builder clearTotalAmountOfExercise() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTotalAmountOfExercise();
            return this;
        }

        public Builder clearTotalCalorie() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTotalCalorie();
            return this;
        }

        public Builder clearTotalDistance() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTotalDistance();
            return this;
        }

        public Builder clearTotalExercise() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTotalExercise();
            return this;
        }

        public Builder clearTotalFloor() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTotalFloor();
            return this;
        }

        public Builder clearTotalStep() {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).clearTotalStep();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getActivityCount() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getActivityCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getSedentaryCount() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getSedentaryCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getSedentaryTime() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getSedentaryTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getStaticCalorie() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getStaticCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getTimestamp() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getTimestamp();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getTotalAmountOfExercise() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getTotalAmountOfExercise();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getTotalCalorie() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getTotalCalorie();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getTotalDistance() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getTotalDistance();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getTotalExercise() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getTotalExercise();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getTotalFloor() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getTotalFloor();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
        public int getTotalStep() {
            return ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).getTotalStep();
        }

        public Builder setActivityCount(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setActivityCount(i);
            return this;
        }

        public Builder setSedentaryCount(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setSedentaryCount(i);
            return this;
        }

        public Builder setSedentaryTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setSedentaryTime(i);
            return this;
        }

        public Builder setStaticCalorie(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setStaticCalorie(i);
            return this;
        }

        public Builder setTimestamp(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setTimestamp(i);
            return this;
        }

        public Builder setTotalAmountOfExercise(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setTotalAmountOfExercise(i);
            return this;
        }

        public Builder setTotalCalorie(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setTotalCalorie(i);
            return this;
        }

        public Builder setTotalDistance(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setTotalDistance(i);
            return this;
        }

        public Builder setTotalExercise(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setTotalExercise(i);
            return this;
        }

        public Builder setTotalFloor(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setTotalFloor(i);
            return this;
        }

        public Builder setTotalStep(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportStatDataV2) ((GeneratedMessageLite.Builder) this).instance).setTotalStep(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SportStatDataV2.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SportStatDataV2 fitnessProtoV2$SportStatDataV2 = new FitnessProtoV2$SportStatDataV2();
        DEFAULT_INSTANCE = fitnessProtoV2$SportStatDataV2;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SportStatDataV2.class, fitnessProtoV2$SportStatDataV2);
    }

    private FitnessProtoV2$SportStatDataV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCount() {
        this.activityCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSedentaryCount() {
        this.sedentaryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSedentaryTime() {
        this.sedentaryTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStaticCalorie() {
        this.staticCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalAmountOfExercise() {
        this.totalAmountOfExercise_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalCalorie() {
        this.totalCalorie_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalDistance() {
        this.totalDistance_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalExercise() {
        this.totalExercise_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalFloor() {
        this.totalFloor_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalStep() {
        this.totalStep_ = 0;
    }

    public static FitnessProtoV2$SportStatDataV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SportStatDataV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SportStatDataV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCount(int i) {
        this.activityCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSedentaryCount(int i) {
        this.sedentaryCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSedentaryTime(int i) {
        this.sedentaryTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStaticCalorie(int i) {
        this.staticCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i) {
        this.timestamp_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalAmountOfExercise(int i) {
        this.totalAmountOfExercise_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalCalorie(int i) {
        this.totalCalorie_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalDistance(int i) {
        this.totalDistance_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalExercise(int i) {
        this.totalExercise_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalFloor(int i) {
        this.totalFloor_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalStep(int i) {
        this.totalStep_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        int i = ko7.a[methodToInvoke.ordinal()];
        switch (i) {
            case 1:
                return new FitnessProtoV2$SportStatDataV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\t\u000b\n\u000b\u000b\u000b", new Object[]{"timestamp_", "totalCalorie_", "totalStep_", "totalDistance_", "totalFloor_", "totalExercise_", "activityCount_", "staticCalorie_", "sedentaryCount_", "sedentaryTime_", "totalAmountOfExercise_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SportStatDataV2.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getActivityCount() {
        return this.activityCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getSedentaryCount() {
        return this.sedentaryCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getSedentaryTime() {
        return this.sedentaryTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getStaticCalorie() {
        return this.staticCalorie_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getTimestamp() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getTotalAmountOfExercise() {
        return this.totalAmountOfExercise_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getTotalCalorie() {
        return this.totalCalorie_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getTotalDistance() {
        return this.totalDistance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getTotalExercise() {
        return this.totalExercise_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getTotalFloor() {
        return this.totalFloor_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportStatDataV2OrBuilder
    public int getTotalStep() {
        return this.totalStep_;
    }

    public static Builder newBuilder(FitnessProtoV2$SportStatDataV2 fitnessProtoV2$SportStatDataV2) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SportStatDataV2);
    }

    public static FitnessProtoV2$SportStatDataV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SportStatDataV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportStatDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}