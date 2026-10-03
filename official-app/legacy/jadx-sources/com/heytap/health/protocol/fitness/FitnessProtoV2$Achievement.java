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
public final class FitnessProtoV2$Achievement extends GeneratedMessageLite<FitnessProtoV2$Achievement, Builder> implements FitnessProtoV2$AchievementOrBuilder {
    public static final int ACTIVITY_COUNT_FIELD_NUMBER = 7;
    public static final int ACTIVITY_COUNT_GOAL_FIELD_NUMBER = 8;
    public static final int DATA_VERSION_FIELD_NUMBER = 14;
    private static final FitnessProtoV2$Achievement DEFAULT_INSTANCE;
    public static final int EXPANDDATA_FIELD_NUMBER = 15;
    public static final int MEDAL_FIELD_NUMBER = 2;
    private static volatile Parser<FitnessProtoV2$Achievement> PARSER = null;
    public static final int PROGRESS_FIELD_NUMBER = 1;
    public static final int RELAX_DURATION_FIELD_NUMBER = 12;
    public static final int RELAX_DURATION_GOAL_FIELD_NUMBER = 13;
    public static final int SLEEP_DURATION_FIELD_NUMBER = 9;
    public static final int SLEEP_DURATION_GOAL_MAX_FIELD_NUMBER = 11;
    public static final int SLEEP_DURATION_GOAL_MIN_FIELD_NUMBER = 10;
    public static final int STEP_FIELD_NUMBER = 5;
    public static final int STEP_GOAL_FIELD_NUMBER = 6;
    public static final int VITALITY_AVG_FIELD_NUMBER = 3;
    public static final int VITALITY_GOAL_FIELD_NUMBER = 4;
    private int activityCountGoal_;
    private int activityCount_;
    private int bitField0_;
    private int dataVersion_;
    private FitnessProtoV2$AchievementExpand expandData_;
    private int medal_;
    private int progress_;
    private int relaxDurationGoal_;
    private int relaxDuration_;
    private int sleepDurationGoalMax_;
    private int sleepDurationGoalMin_;
    private int sleepDuration_;
    private int stepGoal_;
    private int step_;
    private int vitalityAvg_;
    private int vitalityGoal_;

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$Achievement, Builder> implements FitnessProtoV2$AchievementOrBuilder {
        public Builder clearActivityCount() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearActivityCount();
            return this;
        }

        public Builder clearActivityCountGoal() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearActivityCountGoal();
            return this;
        }

        public Builder clearDataVersion() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearDataVersion();
            return this;
        }

        public Builder clearExpandData() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearExpandData();
            return this;
        }

        public Builder clearMedal() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearMedal();
            return this;
        }

        public Builder clearProgress() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearProgress();
            return this;
        }

        public Builder clearRelaxDuration() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearRelaxDuration();
            return this;
        }

        public Builder clearRelaxDurationGoal() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearRelaxDurationGoal();
            return this;
        }

        public Builder clearSleepDuration() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearSleepDuration();
            return this;
        }

        public Builder clearSleepDurationGoalMax() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearSleepDurationGoalMax();
            return this;
        }

        public Builder clearSleepDurationGoalMin() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearSleepDurationGoalMin();
            return this;
        }

        public Builder clearStep() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearStep();
            return this;
        }

        public Builder clearStepGoal() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearStepGoal();
            return this;
        }

        public Builder clearVitalityAvg() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearVitalityAvg();
            return this;
        }

        public Builder clearVitalityGoal() {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).clearVitalityGoal();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getActivityCount() {
            return ((FitnessProtoV2$Achievement) this.instance).getActivityCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getActivityCountGoal() {
            return ((FitnessProtoV2$Achievement) this.instance).getActivityCountGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getDataVersion() {
            return ((FitnessProtoV2$Achievement) this.instance).getDataVersion();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public FitnessProtoV2$AchievementExpand getExpandData() {
            return ((FitnessProtoV2$Achievement) this.instance).getExpandData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getMedal() {
            return ((FitnessProtoV2$Achievement) this.instance).getMedal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getProgress() {
            return ((FitnessProtoV2$Achievement) this.instance).getProgress();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getRelaxDuration() {
            return ((FitnessProtoV2$Achievement) this.instance).getRelaxDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getRelaxDurationGoal() {
            return ((FitnessProtoV2$Achievement) this.instance).getRelaxDurationGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getSleepDuration() {
            return ((FitnessProtoV2$Achievement) this.instance).getSleepDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getSleepDurationGoalMax() {
            return ((FitnessProtoV2$Achievement) this.instance).getSleepDurationGoalMax();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getSleepDurationGoalMin() {
            return ((FitnessProtoV2$Achievement) this.instance).getSleepDurationGoalMin();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getStep() {
            return ((FitnessProtoV2$Achievement) this.instance).getStep();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getStepGoal() {
            return ((FitnessProtoV2$Achievement) this.instance).getStepGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getVitalityAvg() {
            return ((FitnessProtoV2$Achievement) this.instance).getVitalityAvg();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public int getVitalityGoal() {
            return ((FitnessProtoV2$Achievement) this.instance).getVitalityGoal();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
        public boolean hasExpandData() {
            return ((FitnessProtoV2$Achievement) this.instance).hasExpandData();
        }

        public Builder mergeExpandData(FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).mergeExpandData(fitnessProtoV2$AchievementExpand);
            return this;
        }

        public Builder setActivityCount(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setActivityCount(i);
            return this;
        }

        public Builder setActivityCountGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setActivityCountGoal(i);
            return this;
        }

        public Builder setDataVersion(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setDataVersion(i);
            return this;
        }

        public Builder setExpandData(FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setExpandData(fitnessProtoV2$AchievementExpand);
            return this;
        }

        public Builder setMedal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setMedal(i);
            return this;
        }

        public Builder setProgress(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setProgress(i);
            return this;
        }

        public Builder setRelaxDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setRelaxDuration(i);
            return this;
        }

        public Builder setRelaxDurationGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setRelaxDurationGoal(i);
            return this;
        }

        public Builder setSleepDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setSleepDuration(i);
            return this;
        }

        public Builder setSleepDurationGoalMax(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setSleepDurationGoalMax(i);
            return this;
        }

        public Builder setSleepDurationGoalMin(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setSleepDurationGoalMin(i);
            return this;
        }

        public Builder setStep(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setStep(i);
            return this;
        }

        public Builder setStepGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setStepGoal(i);
            return this;
        }

        public Builder setVitalityAvg(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setVitalityAvg(i);
            return this;
        }

        public Builder setVitalityGoal(int i) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setVitalityGoal(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$Achievement.DEFAULT_INSTANCE);
        }

        public Builder setExpandData(FitnessProtoV2$AchievementExpand.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$Achievement) this.instance).setExpandData(builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$Achievement fitnessProtoV2$Achievement = new FitnessProtoV2$Achievement();
        DEFAULT_INSTANCE = fitnessProtoV2$Achievement;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$Achievement.class, fitnessProtoV2$Achievement);
    }

    private FitnessProtoV2$Achievement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCount() {
        this.activityCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivityCountGoal() {
        this.activityCountGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDataVersion() {
        this.dataVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpandData() {
        this.expandData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedal() {
        this.medal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProgress() {
        this.progress_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelaxDuration() {
        this.relaxDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelaxDurationGoal() {
        this.relaxDurationGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepDuration() {
        this.sleepDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepDurationGoalMax() {
        this.sleepDurationGoalMax_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepDurationGoalMin() {
        this.sleepDurationGoalMin_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStep() {
        this.step_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStepGoal() {
        this.stepGoal_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVitalityAvg() {
        this.vitalityAvg_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVitalityGoal() {
        this.vitalityGoal_ = 0;
    }

    public static FitnessProtoV2$Achievement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExpandData(FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand) {
        fitnessProtoV2$AchievementExpand.getClass();
        FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand2 = this.expandData_;
        if (fitnessProtoV2$AchievementExpand2 == null || fitnessProtoV2$AchievementExpand2 == FitnessProtoV2$AchievementExpand.getDefaultInstance()) {
            this.expandData_ = fitnessProtoV2$AchievementExpand;
        } else {
            this.expandData_ = FitnessProtoV2$AchievementExpand.newBuilder(this.expandData_).mergeFrom(fitnessProtoV2$AchievementExpand).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$Achievement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$Achievement parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$Achievement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCount(int i) {
        this.activityCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivityCountGoal(int i) {
        this.activityCountGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDataVersion(int i) {
        this.dataVersion_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpandData(FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand) {
        fitnessProtoV2$AchievementExpand.getClass();
        this.expandData_ = fitnessProtoV2$AchievementExpand;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedal(int i) {
        this.medal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i) {
        this.progress_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelaxDuration(int i) {
        this.relaxDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelaxDurationGoal(int i) {
        this.relaxDurationGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepDuration(int i) {
        this.sleepDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepDurationGoalMax(int i) {
        this.sleepDurationGoalMax_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepDurationGoalMin(int i) {
        this.sleepDurationGoalMin_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStep(int i) {
        this.step_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStepGoal(int i) {
        this.stepGoal_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVitalityAvg(int i) {
        this.vitalityAvg_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVitalityGoal(int i) {
        this.vitalityGoal_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (in7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FitnessProtoV2$Achievement();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\t\u000b\n\u000b\u000b\u000b\f\u000b\r\u000b\u000e\u000b\u000fဉ\u0000", new Object[]{"bitField0_", "progress_", "medal_", "vitalityAvg_", "vitalityGoal_", "step_", "stepGoal_", "activityCount_", "activityCountGoal_", "sleepDuration_", "sleepDurationGoalMin_", "sleepDurationGoalMax_", "relaxDuration_", "relaxDurationGoal_", "dataVersion_", "expandData_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$Achievement> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$Achievement.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getActivityCount() {
        return this.activityCount_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getActivityCountGoal() {
        return this.activityCountGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getDataVersion() {
        return this.dataVersion_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public FitnessProtoV2$AchievementExpand getExpandData() {
        FitnessProtoV2$AchievementExpand fitnessProtoV2$AchievementExpand = this.expandData_;
        return fitnessProtoV2$AchievementExpand == null ? FitnessProtoV2$AchievementExpand.getDefaultInstance() : fitnessProtoV2$AchievementExpand;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getMedal() {
        return this.medal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getProgress() {
        return this.progress_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getRelaxDuration() {
        return this.relaxDuration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getRelaxDurationGoal() {
        return this.relaxDurationGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getSleepDuration() {
        return this.sleepDuration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getSleepDurationGoalMax() {
        return this.sleepDurationGoalMax_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getSleepDurationGoalMin() {
        return this.sleepDurationGoalMin_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getStep() {
        return this.step_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getStepGoal() {
        return this.stepGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getVitalityAvg() {
        return this.vitalityAvg_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public int getVitalityGoal() {
        return this.vitalityGoal_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$AchievementOrBuilder
    public boolean hasExpandData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(FitnessProtoV2$Achievement fitnessProtoV2$Achievement) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$Achievement);
    }

    public static FitnessProtoV2$Achievement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$Achievement parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$Achievement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$Achievement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$Achievement parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$Achievement parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$Achievement parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$Achievement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$Achievement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$Achievement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$Achievement) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
