package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.model.ko7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes17.dex */
public final class FitnessProtoV2$SleepStatisticsItemDataV2 extends GeneratedMessageLite<FitnessProtoV2$SleepStatisticsItemDataV2, Builder> implements FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder {
    public static final int AVG_SLEEP_SPO2_FIELD_NUMBER = 4;
    public static final int BREATHE_DATA_FIELD_NUMBER = 13;
    public static final int DATE_TIME_FIELD_NUMBER = 1;
    private static final FitnessProtoV2$SleepStatisticsItemDataV2 DEFAULT_INSTANCE;
    public static final int HEART_DATA_FIELD_NUMBER = 12;
    public static final int HEART_RATE_WARNING_LABEL_FIELD_NUMBER = 15;
    public static final int HRV_DATA_FIELD_NUMBER = 11;
    private static volatile Parser<FitnessProtoV2$SleepStatisticsItemDataV2> PARSER = null;
    public static final int SLEEP_BED_FIELD_NUMBER = 14;
    public static final int SLEEP_BED_TIME_FIELD_NUMBER = 5;
    public static final int SLEEP_BURDEN_FIELD_NUMBER = 8;
    public static final int SLEEP_DURATION_FIELD_NUMBER = 7;
    public static final int SLEEP_OUTBED_TIME_FIELD_NUMBER = 6;
    public static final int SLEEP_RECOVERY_DIFF_VALUE_FIELD_NUMBER = 10;
    public static final int SLEEP_RECOVERY_RATE_FIELD_NUMBER = 9;
    public static final int SLEEP_SCORE_FIELD_NUMBER = 2;
    public static final int SNORE_RISK_FIELD_NUMBER = 3;
    private int avgSleepSpo2_;
    private int bitField0_;
    private FitnessProtoV2$SleepStatisticsCommonData breatheData_;
    private int dateTime_;
    private FitnessProtoV2$SleepStatisticsCommonData heartData_;
    private FitnessProtoV2$SleepStatisticsCommonData hrvData_;
    private int sleepBedTime_;
    private int sleepBurden_;
    private int sleepDuration_;
    private int sleepOutbedTime_;
    private int sleepRecoveryDiffValue_;
    private int sleepRecoveryRate_;
    private int sleepScore_;
    private int snoreRisk_;
    private Internal.ProtobufList<FitnessProto$SleepBedTimeData> sleepBed_ = GeneratedMessageLite.emptyProtobufList();
    private String heartRateWarningLabel_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SleepStatisticsItemDataV2, Builder> implements FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder {
        public Builder addAllSleepBed(Iterable<? extends FitnessProto$SleepBedTimeData> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).addAllSleepBed(iterable);
            return this;
        }

        public Builder addSleepBed(FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).addSleepBed(fitnessProto$SleepBedTimeData);
            return this;
        }

        public Builder clearAvgSleepSpo2() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearAvgSleepSpo2();
            return this;
        }

        public Builder clearBreatheData() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearBreatheData();
            return this;
        }

        public Builder clearDateTime() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearDateTime();
            return this;
        }

        public Builder clearHeartData() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearHeartData();
            return this;
        }

        public Builder clearHeartRateWarningLabel() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearHeartRateWarningLabel();
            return this;
        }

        public Builder clearHrvData() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearHrvData();
            return this;
        }

        public Builder clearSleepBed() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepBed();
            return this;
        }

        public Builder clearSleepBedTime() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepBedTime();
            return this;
        }

        public Builder clearSleepBurden() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepBurden();
            return this;
        }

        public Builder clearSleepDuration() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepDuration();
            return this;
        }

        public Builder clearSleepOutbedTime() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepOutbedTime();
            return this;
        }

        public Builder clearSleepRecoveryDiffValue() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepRecoveryDiffValue();
            return this;
        }

        public Builder clearSleepRecoveryRate() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepRecoveryRate();
            return this;
        }

        public Builder clearSleepScore() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSleepScore();
            return this;
        }

        public Builder clearSnoreRisk() {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).clearSnoreRisk();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getAvgSleepSpo2() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getAvgSleepSpo2();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public FitnessProtoV2$SleepStatisticsCommonData getBreatheData() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getBreatheData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getDateTime() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getDateTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public FitnessProtoV2$SleepStatisticsCommonData getHeartData() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getHeartData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public String getHeartRateWarningLabel() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getHeartRateWarningLabel();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public ByteString getHeartRateWarningLabelBytes() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getHeartRateWarningLabelBytes();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public FitnessProtoV2$SleepStatisticsCommonData getHrvData() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getHrvData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public FitnessProto$SleepBedTimeData getSleepBed(int i) {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepBed(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepBedCount() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepBedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public List<FitnessProto$SleepBedTimeData> getSleepBedList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepBedList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepBedTime() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepBedTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepBurden() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepBurden();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepDuration() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepDuration();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepOutbedTime() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepOutbedTime();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepRecoveryDiffValue() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepRecoveryDiffValue();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepRecoveryRate() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepRecoveryRate();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSleepScore() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSleepScore();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public int getSnoreRisk() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).getSnoreRisk();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public boolean hasBreatheData() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).hasBreatheData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public boolean hasHeartData() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).hasHeartData();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
        public boolean hasHrvData() {
            return ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).hasHrvData();
        }

        public Builder mergeBreatheData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).mergeBreatheData(fitnessProtoV2$SleepStatisticsCommonData);
            return this;
        }

        public Builder mergeHeartData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).mergeHeartData(fitnessProtoV2$SleepStatisticsCommonData);
            return this;
        }

        public Builder mergeHrvData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).mergeHrvData(fitnessProtoV2$SleepStatisticsCommonData);
            return this;
        }

        public Builder removeSleepBed(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).removeSleepBed(i);
            return this;
        }

        public Builder setAvgSleepSpo2(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setAvgSleepSpo2(i);
            return this;
        }

        public Builder setBreatheData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setBreatheData(fitnessProtoV2$SleepStatisticsCommonData);
            return this;
        }

        public Builder setDateTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setDateTime(i);
            return this;
        }

        public Builder setHeartData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setHeartData(fitnessProtoV2$SleepStatisticsCommonData);
            return this;
        }

        public Builder setHeartRateWarningLabel(String str) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setHeartRateWarningLabel(str);
            return this;
        }

        public Builder setHeartRateWarningLabelBytes(ByteString byteString) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setHeartRateWarningLabelBytes(byteString);
            return this;
        }

        public Builder setHrvData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setHrvData(fitnessProtoV2$SleepStatisticsCommonData);
            return this;
        }

        public Builder setSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepBed(i, fitnessProto$SleepBedTimeData);
            return this;
        }

        public Builder setSleepBedTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepBedTime(i);
            return this;
        }

        public Builder setSleepBurden(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepBurden(i);
            return this;
        }

        public Builder setSleepDuration(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepDuration(i);
            return this;
        }

        public Builder setSleepOutbedTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepOutbedTime(i);
            return this;
        }

        public Builder setSleepRecoveryDiffValue(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepRecoveryDiffValue(i);
            return this;
        }

        public Builder setSleepRecoveryRate(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepRecoveryRate(i);
            return this;
        }

        public Builder setSleepScore(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepScore(i);
            return this;
        }

        public Builder setSnoreRisk(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSnoreRisk(i);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SleepStatisticsItemDataV2.DEFAULT_INSTANCE);
        }

        public Builder addSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).addSleepBed(i, fitnessProto$SleepBedTimeData);
            return this;
        }

        public Builder setBreatheData(FitnessProtoV2$SleepStatisticsCommonData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setBreatheData((FitnessProtoV2$SleepStatisticsCommonData) builder.build());
            return this;
        }

        public Builder setHeartData(FitnessProtoV2$SleepStatisticsCommonData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setHeartData((FitnessProtoV2$SleepStatisticsCommonData) builder.build());
            return this;
        }

        public Builder setHrvData(FitnessProtoV2$SleepStatisticsCommonData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setHrvData((FitnessProtoV2$SleepStatisticsCommonData) builder.build());
            return this;
        }

        public Builder setSleepBed(int i, FitnessProto$SleepBedTimeData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).setSleepBed(i, (FitnessProto$SleepBedTimeData) builder.build());
            return this;
        }

        public Builder addSleepBed(FitnessProto$SleepBedTimeData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).addSleepBed((FitnessProto$SleepBedTimeData) builder.build());
            return this;
        }

        public Builder addSleepBed(int i, FitnessProto$SleepBedTimeData.Builder builder) {
            copyOnWrite();
            ((FitnessProtoV2$SleepStatisticsItemDataV2) ((GeneratedMessageLite.Builder) this).instance).addSleepBed(i, (FitnessProto$SleepBedTimeData) builder.build());
            return this;
        }
    }

    static {
        FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2 = new FitnessProtoV2$SleepStatisticsItemDataV2();
        DEFAULT_INSTANCE = fitnessProtoV2$SleepStatisticsItemDataV2;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SleepStatisticsItemDataV2.class, fitnessProtoV2$SleepStatisticsItemDataV2);
    }

    private FitnessProtoV2$SleepStatisticsItemDataV2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSleepBed(Iterable<? extends FitnessProto$SleepBedTimeData> iterable) {
        ensureSleepBedIsMutable();
        AbstractMessageLite.addAll(iterable, this.sleepBed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSleepBed(FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
        fitnessProto$SleepBedTimeData.getClass();
        ensureSleepBedIsMutable();
        this.sleepBed_.add(fitnessProto$SleepBedTimeData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgSleepSpo2() {
        this.avgSleepSpo2_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBreatheData() {
        this.breatheData_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDateTime() {
        this.dateTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartData() {
        this.heartData_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateWarningLabel() {
        this.heartRateWarningLabel_ = getDefaultInstance().getHeartRateWarningLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrvData() {
        this.hrvData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepBed() {
        this.sleepBed_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepBedTime() {
        this.sleepBedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepBurden() {
        this.sleepBurden_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepDuration() {
        this.sleepDuration_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepOutbedTime() {
        this.sleepOutbedTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepRecoveryDiffValue() {
        this.sleepRecoveryDiffValue_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepRecoveryRate() {
        this.sleepRecoveryRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepScore() {
        this.sleepScore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnoreRisk() {
        this.snoreRisk_ = 0;
    }

    private void ensureSleepBedIsMutable() {
        Internal.ProtobufList<FitnessProto$SleepBedTimeData> protobufList = this.sleepBed_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.sleepBed_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBreatheData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
        fitnessProtoV2$SleepStatisticsCommonData.getClass();
        FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData2 = this.breatheData_;
        if (fitnessProtoV2$SleepStatisticsCommonData2 == null || fitnessProtoV2$SleepStatisticsCommonData2 == FitnessProtoV2$SleepStatisticsCommonData.getDefaultInstance()) {
            this.breatheData_ = fitnessProtoV2$SleepStatisticsCommonData;
        } else {
            this.breatheData_ = (FitnessProtoV2$SleepStatisticsCommonData) ((FitnessProtoV2$SleepStatisticsCommonData.Builder) FitnessProtoV2$SleepStatisticsCommonData.newBuilder(this.breatheData_).mergeFrom(fitnessProtoV2$SleepStatisticsCommonData)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeartData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
        fitnessProtoV2$SleepStatisticsCommonData.getClass();
        FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData2 = this.heartData_;
        if (fitnessProtoV2$SleepStatisticsCommonData2 == null || fitnessProtoV2$SleepStatisticsCommonData2 == FitnessProtoV2$SleepStatisticsCommonData.getDefaultInstance()) {
            this.heartData_ = fitnessProtoV2$SleepStatisticsCommonData;
        } else {
            this.heartData_ = (FitnessProtoV2$SleepStatisticsCommonData) ((FitnessProtoV2$SleepStatisticsCommonData.Builder) FitnessProtoV2$SleepStatisticsCommonData.newBuilder(this.heartData_).mergeFrom(fitnessProtoV2$SleepStatisticsCommonData)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHrvData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
        fitnessProtoV2$SleepStatisticsCommonData.getClass();
        FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData2 = this.hrvData_;
        if (fitnessProtoV2$SleepStatisticsCommonData2 == null || fitnessProtoV2$SleepStatisticsCommonData2 == FitnessProtoV2$SleepStatisticsCommonData.getDefaultInstance()) {
            this.hrvData_ = fitnessProtoV2$SleepStatisticsCommonData;
        } else {
            this.hrvData_ = (FitnessProtoV2$SleepStatisticsCommonData) ((FitnessProtoV2$SleepStatisticsCommonData.Builder) FitnessProtoV2$SleepStatisticsCommonData.newBuilder(this.hrvData_).mergeFrom(fitnessProtoV2$SleepStatisticsCommonData)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SleepStatisticsItemDataV2> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSleepBed(int i) {
        ensureSleepBedIsMutable();
        this.sleepBed_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgSleepSpo2(int i) {
        this.avgSleepSpo2_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBreatheData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
        fitnessProtoV2$SleepStatisticsCommonData.getClass();
        this.breatheData_ = fitnessProtoV2$SleepStatisticsCommonData;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDateTime(int i) {
        this.dateTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
        fitnessProtoV2$SleepStatisticsCommonData.getClass();
        this.heartData_ = fitnessProtoV2$SleepStatisticsCommonData;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateWarningLabel(String str) {
        str.getClass();
        this.heartRateWarningLabel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateWarningLabelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.heartRateWarningLabel_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrvData(FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData) {
        fitnessProtoV2$SleepStatisticsCommonData.getClass();
        this.hrvData_ = fitnessProtoV2$SleepStatisticsCommonData;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
        fitnessProto$SleepBedTimeData.getClass();
        ensureSleepBedIsMutable();
        this.sleepBed_.set(i, fitnessProto$SleepBedTimeData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepBedTime(int i) {
        this.sleepBedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepBurden(int i) {
        this.sleepBurden_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepDuration(int i) {
        this.sleepDuration_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepOutbedTime(int i) {
        this.sleepOutbedTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepRecoveryDiffValue(int i) {
        this.sleepRecoveryDiffValue_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepRecoveryRate(int i) {
        this.sleepRecoveryRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepScore(int i) {
        this.sleepScore_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnoreRisk(int i) {
        this.snoreRisk_ = i;
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (ko7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FitnessProtoV2$SleepStatisticsItemDataV2();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003\u0004\u0004\u000b\u0005\u000b\u0006\u000b\u0007\u000b\b\u000b\t\u000b\n\u0004\u000bဉ\u0000\fဉ\u0001\rဉ\u0002\u000e\u001b\u000fȈ", new Object[]{"bitField0_", "dateTime_", "sleepScore_", "snoreRisk_", "avgSleepSpo2_", "sleepBedTime_", "sleepOutbedTime_", "sleepDuration_", "sleepBurden_", "sleepRecoveryRate_", "sleepRecoveryDiffValue_", "hrvData_", "heartData_", "breatheData_", "sleepBed_", FitnessProto$SleepBedTimeData.class, "heartRateWarningLabel_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SleepStatisticsItemDataV2.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getAvgSleepSpo2() {
        return this.avgSleepSpo2_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public FitnessProtoV2$SleepStatisticsCommonData getBreatheData() {
        FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData = this.breatheData_;
        return fitnessProtoV2$SleepStatisticsCommonData == null ? FitnessProtoV2$SleepStatisticsCommonData.getDefaultInstance() : fitnessProtoV2$SleepStatisticsCommonData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getDateTime() {
        return this.dateTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public FitnessProtoV2$SleepStatisticsCommonData getHeartData() {
        FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData = this.heartData_;
        return fitnessProtoV2$SleepStatisticsCommonData == null ? FitnessProtoV2$SleepStatisticsCommonData.getDefaultInstance() : fitnessProtoV2$SleepStatisticsCommonData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public String getHeartRateWarningLabel() {
        return this.heartRateWarningLabel_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public ByteString getHeartRateWarningLabelBytes() {
        return ByteString.copyFromUtf8(this.heartRateWarningLabel_);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public FitnessProtoV2$SleepStatisticsCommonData getHrvData() {
        FitnessProtoV2$SleepStatisticsCommonData fitnessProtoV2$SleepStatisticsCommonData = this.hrvData_;
        return fitnessProtoV2$SleepStatisticsCommonData == null ? FitnessProtoV2$SleepStatisticsCommonData.getDefaultInstance() : fitnessProtoV2$SleepStatisticsCommonData;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public FitnessProto$SleepBedTimeData getSleepBed(int i) {
        return (FitnessProto$SleepBedTimeData) this.sleepBed_.get(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepBedCount() {
        return this.sleepBed_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public List<FitnessProto$SleepBedTimeData> getSleepBedList() {
        return this.sleepBed_;
    }

    public FitnessProto$SleepBedTimeDataOrBuilder getSleepBedOrBuilder(int i) {
        return (FitnessProto$SleepBedTimeDataOrBuilder) this.sleepBed_.get(i);
    }

    public List<? extends FitnessProto$SleepBedTimeDataOrBuilder> getSleepBedOrBuilderList() {
        return this.sleepBed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepBedTime() {
        return this.sleepBedTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepBurden() {
        return this.sleepBurden_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepDuration() {
        return this.sleepDuration_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepOutbedTime() {
        return this.sleepOutbedTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepRecoveryDiffValue() {
        return this.sleepRecoveryDiffValue_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepRecoveryRate() {
        return this.sleepRecoveryRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSleepScore() {
        return this.sleepScore_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public int getSnoreRisk() {
        return this.snoreRisk_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public boolean hasBreatheData() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public boolean hasHeartData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SleepStatisticsItemDataV2OrBuilder
    public boolean hasHrvData() {
        return (this.bitField0_ & 1) != 0;
    }

    public static Builder newBuilder(FitnessProtoV2$SleepStatisticsItemDataV2 fitnessProtoV2$SleepStatisticsItemDataV2) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SleepStatisticsItemDataV2);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSleepBed(int i, FitnessProto$SleepBedTimeData fitnessProto$SleepBedTimeData) {
        fitnessProto$SleepBedTimeData.getClass();
        ensureSleepBedIsMutable();
        this.sleepBed_.add(i, fitnessProto$SleepBedTimeData);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SleepStatisticsItemDataV2 parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SleepStatisticsItemDataV2) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}