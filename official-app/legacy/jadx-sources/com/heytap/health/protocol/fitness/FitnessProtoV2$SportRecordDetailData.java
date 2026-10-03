package com.heytap.health.protocol.fitness;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.in7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class FitnessProtoV2$SportRecordDetailData extends GeneratedMessageLite<FitnessProtoV2$SportRecordDetailData, Builder> implements FitnessProtoV2$SportRecordDetailDataOrBuilder {
    public static final int BADMINTONFREQ_FIELD_NUMBER = 14;
    public static final int CLIMBSPEED_FIELD_NUMBER = 23;
    private static final FitnessProtoV2$SportRecordDetailData DEFAULT_INSTANCE;
    public static final int DISTANCE_FIELD_NUMBER = 7;
    public static final int ELEVATION_FIELD_NUMBER = 6;
    public static final int ELLIPTICALFREQ_FIELD_NUMBER = 16;
    public static final int FATBURNINGRATE_FIELD_NUMBER = 20;
    public static final int FREQUENCY_FIELD_NUMBER = 5;
    public static final int HEARTRATECONF_FIELD_NUMBER = 17;
    public static final int HEARTRATE_FIELD_NUMBER = 4;
    public static final int HRMOTIONACTIVITYSTATE_FIELD_NUMBER = 25;
    public static final int HRMOTIONGRU_FIELD_NUMBER = 26;
    public static final int HRMOTIONPOWER_FIELD_NUMBER = 28;
    public static final int HRNNCONFIG_FIELD_NUMBER = 27;
    public static final int HRPOSTDATA_FIELD_NUMBER = 24;
    public static final int PACE2_FIELD_NUMBER = 21;
    public static final int PACE_FIELD_NUMBER = 3;
    private static volatile Parser<FitnessProtoV2$SportRecordDetailData> PARSER = null;
    public static final int ROWINGFREQ_FIELD_NUMBER = 15;
    public static final int RUNNINGPOWER_FIELD_NUMBER = 13;
    public static final int STAMINA_FIELD_NUMBER = 18;
    public static final int STANCEBALANCE_FIELD_NUMBER = 11;
    public static final int STANCETIME_FIELD_NUMBER = 9;
    public static final int STATE_FIELD_NUMBER = 2;
    public static final int STEPS_FIELD_NUMBER = 19;
    public static final int STRIDE_FIELD_NUMBER = 8;
    public static final int STROKEFREQ_FIELD_NUMBER = 22;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int VERTICALOSCILLATION_FIELD_NUMBER = 10;
    public static final int VERTICALRATIO_FIELD_NUMBER = 12;
    private int timestampMemoizedSerializedSize = -1;
    private int stateMemoizedSerializedSize = -1;
    private int paceMemoizedSerializedSize = -1;
    private int heartRateMemoizedSerializedSize = -1;
    private int frequencyMemoizedSerializedSize = -1;
    private int elevationMemoizedSerializedSize = -1;
    private int distanceMemoizedSerializedSize = -1;
    private int strideMemoizedSerializedSize = -1;
    private int stanceTimeMemoizedSerializedSize = -1;
    private int verticalOscillationMemoizedSerializedSize = -1;
    private int stanceBalanceMemoizedSerializedSize = -1;
    private int verticalRatioMemoizedSerializedSize = -1;
    private int runningPowerMemoizedSerializedSize = -1;
    private int badmintonFreqMemoizedSerializedSize = -1;
    private int rowingFreqMemoizedSerializedSize = -1;
    private int ellipticalFreqMemoizedSerializedSize = -1;
    private int heartRateConfMemoizedSerializedSize = -1;
    private int staminaMemoizedSerializedSize = -1;
    private int stepsMemoizedSerializedSize = -1;
    private int fatBurningRateMemoizedSerializedSize = -1;
    private int pace2MemoizedSerializedSize = -1;
    private int strokeFreqMemoizedSerializedSize = -1;
    private int climbSpeedMemoizedSerializedSize = -1;
    private int hrPostDataMemoizedSerializedSize = -1;
    private int hrMotionActivityStateMemoizedSerializedSize = -1;
    private int hrMotionGruMemoizedSerializedSize = -1;
    private int hrNnConfigMemoizedSerializedSize = -1;
    private int hrMotionPowerMemoizedSerializedSize = -1;
    private Internal.LongList timestamp_ = GeneratedMessageLite.emptyLongList();
    private Internal.IntList state_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList pace_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList heartRate_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList frequency_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList elevation_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList distance_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList stride_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList stanceTime_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList verticalOscillation_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList stanceBalance_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList verticalRatio_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList runningPower_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList badmintonFreq_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList rowingFreq_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList ellipticalFreq_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList heartRateConf_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList stamina_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList steps_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList fatBurningRate_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList pace2_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList strokeFreq_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList climbSpeed_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList hrPostData_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList hrMotionActivityState_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList hrMotionGru_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList hrNnConfig_ = GeneratedMessageLite.emptyIntList();
    private Internal.IntList hrMotionPower_ = GeneratedMessageLite.emptyIntList();

    public static final class Builder extends GeneratedMessageLite.Builder<FitnessProtoV2$SportRecordDetailData, Builder> implements FitnessProtoV2$SportRecordDetailDataOrBuilder {
        public Builder addAllBadmintonFreq(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllBadmintonFreq(iterable);
            return this;
        }

        public Builder addAllClimbSpeed(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllClimbSpeed(iterable);
            return this;
        }

        public Builder addAllDistance(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllDistance(iterable);
            return this;
        }

        public Builder addAllElevation(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllElevation(iterable);
            return this;
        }

        public Builder addAllEllipticalFreq(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllEllipticalFreq(iterable);
            return this;
        }

        public Builder addAllFatBurningRate(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllFatBurningRate(iterable);
            return this;
        }

        public Builder addAllFrequency(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllFrequency(iterable);
            return this;
        }

        public Builder addAllHeartRate(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllHeartRate(iterable);
            return this;
        }

        public Builder addAllHeartRateConf(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllHeartRateConf(iterable);
            return this;
        }

        public Builder addAllHrMotionActivityState(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllHrMotionActivityState(iterable);
            return this;
        }

        public Builder addAllHrMotionGru(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllHrMotionGru(iterable);
            return this;
        }

        public Builder addAllHrMotionPower(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllHrMotionPower(iterable);
            return this;
        }

        public Builder addAllHrNnConfig(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllHrNnConfig(iterable);
            return this;
        }

        public Builder addAllHrPostData(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllHrPostData(iterable);
            return this;
        }

        public Builder addAllPace(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllPace(iterable);
            return this;
        }

        public Builder addAllPace2(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllPace2(iterable);
            return this;
        }

        public Builder addAllRowingFreq(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllRowingFreq(iterable);
            return this;
        }

        public Builder addAllRunningPower(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllRunningPower(iterable);
            return this;
        }

        public Builder addAllStamina(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllStamina(iterable);
            return this;
        }

        public Builder addAllStanceBalance(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllStanceBalance(iterable);
            return this;
        }

        public Builder addAllStanceTime(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllStanceTime(iterable);
            return this;
        }

        public Builder addAllState(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllState(iterable);
            return this;
        }

        public Builder addAllSteps(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllSteps(iterable);
            return this;
        }

        public Builder addAllStride(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllStride(iterable);
            return this;
        }

        public Builder addAllStrokeFreq(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllStrokeFreq(iterable);
            return this;
        }

        public Builder addAllTimestamp(Iterable<? extends Long> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllTimestamp(iterable);
            return this;
        }

        public Builder addAllVerticalOscillation(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllVerticalOscillation(iterable);
            return this;
        }

        public Builder addAllVerticalRatio(Iterable<? extends Integer> iterable) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addAllVerticalRatio(iterable);
            return this;
        }

        public Builder addBadmintonFreq(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addBadmintonFreq(i);
            return this;
        }

        public Builder addClimbSpeed(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addClimbSpeed(i);
            return this;
        }

        public Builder addDistance(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addDistance(i);
            return this;
        }

        public Builder addElevation(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addElevation(i);
            return this;
        }

        public Builder addEllipticalFreq(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addEllipticalFreq(i);
            return this;
        }

        public Builder addFatBurningRate(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addFatBurningRate(i);
            return this;
        }

        public Builder addFrequency(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addFrequency(i);
            return this;
        }

        public Builder addHeartRate(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addHeartRate(i);
            return this;
        }

        public Builder addHeartRateConf(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addHeartRateConf(i);
            return this;
        }

        public Builder addHrMotionActivityState(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addHrMotionActivityState(i);
            return this;
        }

        public Builder addHrMotionGru(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addHrMotionGru(i);
            return this;
        }

        public Builder addHrMotionPower(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addHrMotionPower(i);
            return this;
        }

        public Builder addHrNnConfig(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addHrNnConfig(i);
            return this;
        }

        public Builder addHrPostData(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addHrPostData(i);
            return this;
        }

        public Builder addPace(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addPace(i);
            return this;
        }

        public Builder addPace2(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addPace2(i);
            return this;
        }

        public Builder addRowingFreq(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addRowingFreq(i);
            return this;
        }

        public Builder addRunningPower(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addRunningPower(i);
            return this;
        }

        public Builder addStamina(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addStamina(i);
            return this;
        }

        public Builder addStanceBalance(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addStanceBalance(i);
            return this;
        }

        public Builder addStanceTime(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addStanceTime(i);
            return this;
        }

        public Builder addState(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addState(i);
            return this;
        }

        public Builder addSteps(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addSteps(i);
            return this;
        }

        public Builder addStride(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addStride(i);
            return this;
        }

        public Builder addStrokeFreq(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addStrokeFreq(i);
            return this;
        }

        public Builder addTimestamp(long j2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addTimestamp(j2);
            return this;
        }

        public Builder addVerticalOscillation(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addVerticalOscillation(i);
            return this;
        }

        public Builder addVerticalRatio(int i) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).addVerticalRatio(i);
            return this;
        }

        public Builder clearBadmintonFreq() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearBadmintonFreq();
            return this;
        }

        public Builder clearClimbSpeed() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearClimbSpeed();
            return this;
        }

        public Builder clearDistance() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearDistance();
            return this;
        }

        public Builder clearElevation() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearElevation();
            return this;
        }

        public Builder clearEllipticalFreq() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearEllipticalFreq();
            return this;
        }

        public Builder clearFatBurningRate() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearFatBurningRate();
            return this;
        }

        public Builder clearFrequency() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearFrequency();
            return this;
        }

        public Builder clearHeartRate() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearHeartRate();
            return this;
        }

        public Builder clearHeartRateConf() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearHeartRateConf();
            return this;
        }

        public Builder clearHrMotionActivityState() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearHrMotionActivityState();
            return this;
        }

        public Builder clearHrMotionGru() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearHrMotionGru();
            return this;
        }

        public Builder clearHrMotionPower() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearHrMotionPower();
            return this;
        }

        public Builder clearHrNnConfig() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearHrNnConfig();
            return this;
        }

        public Builder clearHrPostData() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearHrPostData();
            return this;
        }

        public Builder clearPace() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearPace();
            return this;
        }

        public Builder clearPace2() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearPace2();
            return this;
        }

        public Builder clearRowingFreq() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearRowingFreq();
            return this;
        }

        public Builder clearRunningPower() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearRunningPower();
            return this;
        }

        public Builder clearStamina() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearStamina();
            return this;
        }

        public Builder clearStanceBalance() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearStanceBalance();
            return this;
        }

        public Builder clearStanceTime() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearStanceTime();
            return this;
        }

        public Builder clearState() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearState();
            return this;
        }

        public Builder clearSteps() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearSteps();
            return this;
        }

        public Builder clearStride() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearStride();
            return this;
        }

        public Builder clearStrokeFreq() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearStrokeFreq();
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearTimestamp();
            return this;
        }

        public Builder clearVerticalOscillation() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearVerticalOscillation();
            return this;
        }

        public Builder clearVerticalRatio() {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).clearVerticalRatio();
            return this;
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getBadmintonFreq(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getBadmintonFreq(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getBadmintonFreqCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getBadmintonFreqCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getBadmintonFreqList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getBadmintonFreqList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getClimbSpeed(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getClimbSpeed(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getClimbSpeedCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getClimbSpeedCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getClimbSpeedList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getClimbSpeedList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getDistance(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getDistance(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getDistanceCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getDistanceCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getDistanceList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getDistanceList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getElevation(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getElevation(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getElevationCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getElevationCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getElevationList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getElevationList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getEllipticalFreq(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getEllipticalFreq(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getEllipticalFreqCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getEllipticalFreqCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getEllipticalFreqList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getEllipticalFreqList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getFatBurningRate(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getFatBurningRate(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getFatBurningRateCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getFatBurningRateCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getFatBurningRateList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getFatBurningRateList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getFrequency(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getFrequency(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getFrequencyCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getFrequencyCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getFrequencyList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getFrequencyList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHeartRate(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHeartRate(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHeartRateConf(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHeartRateConf(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHeartRateConfCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHeartRateConfCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getHeartRateConfList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getHeartRateConfList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHeartRateCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHeartRateCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getHeartRateList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getHeartRateList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrMotionActivityState(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionActivityState(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrMotionActivityStateCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionActivityStateCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getHrMotionActivityStateList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionActivityStateList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrMotionGru(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionGru(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrMotionGruCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionGruCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getHrMotionGruList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionGruList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrMotionPower(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionPower(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrMotionPowerCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionPowerCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getHrMotionPowerList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getHrMotionPowerList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrNnConfig(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrNnConfig(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrNnConfigCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrNnConfigCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getHrNnConfigList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getHrNnConfigList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrPostData(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrPostData(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getHrPostDataCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getHrPostDataCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getHrPostDataList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getHrPostDataList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getPace(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getPace(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getPace2(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getPace2(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getPace2Count() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getPace2Count();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getPace2List() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getPace2List());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getPaceCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getPaceCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getPaceList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getPaceList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getRowingFreq(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getRowingFreq(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getRowingFreqCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getRowingFreqCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getRowingFreqList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getRowingFreqList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getRunningPower(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getRunningPower(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getRunningPowerCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getRunningPowerCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getRunningPowerList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getRunningPowerList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStamina(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStamina(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStaminaCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStaminaCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getStaminaList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getStaminaList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStanceBalance(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStanceBalance(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStanceBalanceCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStanceBalanceCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getStanceBalanceList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getStanceBalanceList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStanceTime(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStanceTime(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStanceTimeCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStanceTimeCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getStanceTimeList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getStanceTimeList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getState(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getState(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStateCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStateCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getStateList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getStateList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getSteps(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getSteps(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStepsCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStepsCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getStepsList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getStepsList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStride(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStride(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStrideCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStrideCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getStrideList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getStrideList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStrokeFreq(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStrokeFreq(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getStrokeFreqCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getStrokeFreqCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getStrokeFreqList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getStrokeFreqList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public long getTimestamp(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getTimestamp(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getTimestampCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getTimestampCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Long> getTimestampList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getTimestampList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getVerticalOscillation(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getVerticalOscillation(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getVerticalOscillationCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getVerticalOscillationCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getVerticalOscillationList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getVerticalOscillationList());
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getVerticalRatio(int i) {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getVerticalRatio(i);
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public int getVerticalRatioCount() {
            return ((FitnessProtoV2$SportRecordDetailData) this.instance).getVerticalRatioCount();
        }

        @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
        public List<Integer> getVerticalRatioList() {
            return Collections.unmodifiableList(((FitnessProtoV2$SportRecordDetailData) this.instance).getVerticalRatioList());
        }

        public Builder setBadmintonFreq(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setBadmintonFreq(i, i2);
            return this;
        }

        public Builder setClimbSpeed(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setClimbSpeed(i, i2);
            return this;
        }

        public Builder setDistance(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setDistance(i, i2);
            return this;
        }

        public Builder setElevation(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setElevation(i, i2);
            return this;
        }

        public Builder setEllipticalFreq(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setEllipticalFreq(i, i2);
            return this;
        }

        public Builder setFatBurningRate(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setFatBurningRate(i, i2);
            return this;
        }

        public Builder setFrequency(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setFrequency(i, i2);
            return this;
        }

        public Builder setHeartRate(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setHeartRate(i, i2);
            return this;
        }

        public Builder setHeartRateConf(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setHeartRateConf(i, i2);
            return this;
        }

        public Builder setHrMotionActivityState(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setHrMotionActivityState(i, i2);
            return this;
        }

        public Builder setHrMotionGru(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setHrMotionGru(i, i2);
            return this;
        }

        public Builder setHrMotionPower(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setHrMotionPower(i, i2);
            return this;
        }

        public Builder setHrNnConfig(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setHrNnConfig(i, i2);
            return this;
        }

        public Builder setHrPostData(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setHrPostData(i, i2);
            return this;
        }

        public Builder setPace(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setPace(i, i2);
            return this;
        }

        public Builder setPace2(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setPace2(i, i2);
            return this;
        }

        public Builder setRowingFreq(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setRowingFreq(i, i2);
            return this;
        }

        public Builder setRunningPower(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setRunningPower(i, i2);
            return this;
        }

        public Builder setStamina(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setStamina(i, i2);
            return this;
        }

        public Builder setStanceBalance(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setStanceBalance(i, i2);
            return this;
        }

        public Builder setStanceTime(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setStanceTime(i, i2);
            return this;
        }

        public Builder setState(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setState(i, i2);
            return this;
        }

        public Builder setSteps(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setSteps(i, i2);
            return this;
        }

        public Builder setStride(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setStride(i, i2);
            return this;
        }

        public Builder setStrokeFreq(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setStrokeFreq(i, i2);
            return this;
        }

        public Builder setTimestamp(int i, long j2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setTimestamp(i, j2);
            return this;
        }

        public Builder setVerticalOscillation(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setVerticalOscillation(i, i2);
            return this;
        }

        public Builder setVerticalRatio(int i, int i2) {
            copyOnWrite();
            ((FitnessProtoV2$SportRecordDetailData) this.instance).setVerticalRatio(i, i2);
            return this;
        }

        private Builder() {
            super(FitnessProtoV2$SportRecordDetailData.DEFAULT_INSTANCE);
        }
    }

    static {
        FitnessProtoV2$SportRecordDetailData fitnessProtoV2$SportRecordDetailData = new FitnessProtoV2$SportRecordDetailData();
        DEFAULT_INSTANCE = fitnessProtoV2$SportRecordDetailData;
        GeneratedMessageLite.registerDefaultInstance(FitnessProtoV2$SportRecordDetailData.class, fitnessProtoV2$SportRecordDetailData);
    }

    private FitnessProtoV2$SportRecordDetailData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBadmintonFreq(Iterable<? extends Integer> iterable) {
        ensureBadmintonFreqIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.badmintonFreq_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllClimbSpeed(Iterable<? extends Integer> iterable) {
        ensureClimbSpeedIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.climbSpeed_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDistance(Iterable<? extends Integer> iterable) {
        ensureDistanceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.distance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllElevation(Iterable<? extends Integer> iterable) {
        ensureElevationIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.elevation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEllipticalFreq(Iterable<? extends Integer> iterable) {
        ensureEllipticalFreqIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ellipticalFreq_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFatBurningRate(Iterable<? extends Integer> iterable) {
        ensureFatBurningRateIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fatBurningRate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFrequency(Iterable<? extends Integer> iterable) {
        ensureFrequencyIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.frequency_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHeartRate(Iterable<? extends Integer> iterable) {
        ensureHeartRateIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.heartRate_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHeartRateConf(Iterable<? extends Integer> iterable) {
        ensureHeartRateConfIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.heartRateConf_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHrMotionActivityState(Iterable<? extends Integer> iterable) {
        ensureHrMotionActivityStateIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.hrMotionActivityState_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHrMotionGru(Iterable<? extends Integer> iterable) {
        ensureHrMotionGruIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.hrMotionGru_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHrMotionPower(Iterable<? extends Integer> iterable) {
        ensureHrMotionPowerIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.hrMotionPower_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHrNnConfig(Iterable<? extends Integer> iterable) {
        ensureHrNnConfigIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.hrNnConfig_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllHrPostData(Iterable<? extends Integer> iterable) {
        ensureHrPostDataIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.hrPostData_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPace(Iterable<? extends Integer> iterable) {
        ensurePaceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPace2(Iterable<? extends Integer> iterable) {
        ensurePace2IsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.pace2_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRowingFreq(Iterable<? extends Integer> iterable) {
        ensureRowingFreqIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.rowingFreq_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRunningPower(Iterable<? extends Integer> iterable) {
        ensureRunningPowerIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.runningPower_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStamina(Iterable<? extends Integer> iterable) {
        ensureStaminaIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.stamina_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStanceBalance(Iterable<? extends Integer> iterable) {
        ensureStanceBalanceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.stanceBalance_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStanceTime(Iterable<? extends Integer> iterable) {
        ensureStanceTimeIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.stanceTime_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllState(Iterable<? extends Integer> iterable) {
        ensureStateIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.state_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSteps(Iterable<? extends Integer> iterable) {
        ensureStepsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.steps_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStride(Iterable<? extends Integer> iterable) {
        ensureStrideIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.stride_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStrokeFreq(Iterable<? extends Integer> iterable) {
        ensureStrokeFreqIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.strokeFreq_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTimestamp(Iterable<? extends Long> iterable) {
        ensureTimestampIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.timestamp_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVerticalOscillation(Iterable<? extends Integer> iterable) {
        ensureVerticalOscillationIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.verticalOscillation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVerticalRatio(Iterable<? extends Integer> iterable) {
        ensureVerticalRatioIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.verticalRatio_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBadmintonFreq(int i) {
        ensureBadmintonFreqIsMutable();
        this.badmintonFreq_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addClimbSpeed(int i) {
        ensureClimbSpeedIsMutable();
        this.climbSpeed_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDistance(int i) {
        ensureDistanceIsMutable();
        this.distance_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addElevation(int i) {
        ensureElevationIsMutable();
        this.elevation_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEllipticalFreq(int i) {
        ensureEllipticalFreqIsMutable();
        this.ellipticalFreq_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFatBurningRate(int i) {
        ensureFatBurningRateIsMutable();
        this.fatBurningRate_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFrequency(int i) {
        ensureFrequencyIsMutable();
        this.frequency_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHeartRate(int i) {
        ensureHeartRateIsMutable();
        this.heartRate_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHeartRateConf(int i) {
        ensureHeartRateConfIsMutable();
        this.heartRateConf_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHrMotionActivityState(int i) {
        ensureHrMotionActivityStateIsMutable();
        this.hrMotionActivityState_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHrMotionGru(int i) {
        ensureHrMotionGruIsMutable();
        this.hrMotionGru_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHrMotionPower(int i) {
        ensureHrMotionPowerIsMutable();
        this.hrMotionPower_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHrNnConfig(int i) {
        ensureHrNnConfigIsMutable();
        this.hrNnConfig_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addHrPostData(int i) {
        ensureHrPostDataIsMutable();
        this.hrPostData_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPace(int i) {
        ensurePaceIsMutable();
        this.pace_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPace2(int i) {
        ensurePace2IsMutable();
        this.pace2_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRowingFreq(int i) {
        ensureRowingFreqIsMutable();
        this.rowingFreq_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRunningPower(int i) {
        ensureRunningPowerIsMutable();
        this.runningPower_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStamina(int i) {
        ensureStaminaIsMutable();
        this.stamina_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStanceBalance(int i) {
        ensureStanceBalanceIsMutable();
        this.stanceBalance_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStanceTime(int i) {
        ensureStanceTimeIsMutable();
        this.stanceTime_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addState(int i) {
        ensureStateIsMutable();
        this.state_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSteps(int i) {
        ensureStepsIsMutable();
        this.steps_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStride(int i) {
        ensureStrideIsMutable();
        this.stride_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStrokeFreq(int i) {
        ensureStrokeFreqIsMutable();
        this.strokeFreq_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTimestamp(long j2) {
        ensureTimestampIsMutable();
        this.timestamp_.addLong(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVerticalOscillation(int i) {
        ensureVerticalOscillationIsMutable();
        this.verticalOscillation_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVerticalRatio(int i) {
        ensureVerticalRatioIsMutable();
        this.verticalRatio_.addInt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBadmintonFreq() {
        this.badmintonFreq_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClimbSpeed() {
        this.climbSpeed_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistance() {
        this.distance_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearElevation() {
        this.elevation_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEllipticalFreq() {
        this.ellipticalFreq_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFatBurningRate() {
        this.fatBurningRate_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFrequency() {
        this.frequency_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRate() {
        this.heartRate_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRateConf() {
        this.heartRateConf_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrMotionActivityState() {
        this.hrMotionActivityState_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrMotionGru() {
        this.hrMotionGru_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrMotionPower() {
        this.hrMotionPower_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrNnConfig() {
        this.hrNnConfig_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrPostData() {
        this.hrPostData_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPace() {
        this.pace_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPace2() {
        this.pace2_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRowingFreq() {
        this.rowingFreq_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRunningPower() {
        this.runningPower_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStamina() {
        this.stamina_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStanceBalance() {
        this.stanceBalance_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStanceTime() {
        this.stanceTime_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearState() {
        this.state_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSteps() {
        this.steps_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStride() {
        this.stride_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStrokeFreq() {
        this.strokeFreq_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = GeneratedMessageLite.emptyLongList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerticalOscillation() {
        this.verticalOscillation_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerticalRatio() {
        this.verticalRatio_ = GeneratedMessageLite.emptyIntList();
    }

    private void ensureBadmintonFreqIsMutable() {
        Internal.IntList intList = this.badmintonFreq_;
        if (intList.isModifiable()) {
            return;
        }
        this.badmintonFreq_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureClimbSpeedIsMutable() {
        Internal.IntList intList = this.climbSpeed_;
        if (intList.isModifiable()) {
            return;
        }
        this.climbSpeed_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureDistanceIsMutable() {
        Internal.IntList intList = this.distance_;
        if (intList.isModifiable()) {
            return;
        }
        this.distance_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureElevationIsMutable() {
        Internal.IntList intList = this.elevation_;
        if (intList.isModifiable()) {
            return;
        }
        this.elevation_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureEllipticalFreqIsMutable() {
        Internal.IntList intList = this.ellipticalFreq_;
        if (intList.isModifiable()) {
            return;
        }
        this.ellipticalFreq_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureFatBurningRateIsMutable() {
        Internal.IntList intList = this.fatBurningRate_;
        if (intList.isModifiable()) {
            return;
        }
        this.fatBurningRate_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureFrequencyIsMutable() {
        Internal.IntList intList = this.frequency_;
        if (intList.isModifiable()) {
            return;
        }
        this.frequency_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHeartRateConfIsMutable() {
        Internal.IntList intList = this.heartRateConf_;
        if (intList.isModifiable()) {
            return;
        }
        this.heartRateConf_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHeartRateIsMutable() {
        Internal.IntList intList = this.heartRate_;
        if (intList.isModifiable()) {
            return;
        }
        this.heartRate_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHrMotionActivityStateIsMutable() {
        Internal.IntList intList = this.hrMotionActivityState_;
        if (intList.isModifiable()) {
            return;
        }
        this.hrMotionActivityState_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHrMotionGruIsMutable() {
        Internal.IntList intList = this.hrMotionGru_;
        if (intList.isModifiable()) {
            return;
        }
        this.hrMotionGru_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHrMotionPowerIsMutable() {
        Internal.IntList intList = this.hrMotionPower_;
        if (intList.isModifiable()) {
            return;
        }
        this.hrMotionPower_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHrNnConfigIsMutable() {
        Internal.IntList intList = this.hrNnConfig_;
        if (intList.isModifiable()) {
            return;
        }
        this.hrNnConfig_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureHrPostDataIsMutable() {
        Internal.IntList intList = this.hrPostData_;
        if (intList.isModifiable()) {
            return;
        }
        this.hrPostData_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensurePace2IsMutable() {
        Internal.IntList intList = this.pace2_;
        if (intList.isModifiable()) {
            return;
        }
        this.pace2_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensurePaceIsMutable() {
        Internal.IntList intList = this.pace_;
        if (intList.isModifiable()) {
            return;
        }
        this.pace_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureRowingFreqIsMutable() {
        Internal.IntList intList = this.rowingFreq_;
        if (intList.isModifiable()) {
            return;
        }
        this.rowingFreq_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureRunningPowerIsMutable() {
        Internal.IntList intList = this.runningPower_;
        if (intList.isModifiable()) {
            return;
        }
        this.runningPower_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStaminaIsMutable() {
        Internal.IntList intList = this.stamina_;
        if (intList.isModifiable()) {
            return;
        }
        this.stamina_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStanceBalanceIsMutable() {
        Internal.IntList intList = this.stanceBalance_;
        if (intList.isModifiable()) {
            return;
        }
        this.stanceBalance_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStanceTimeIsMutable() {
        Internal.IntList intList = this.stanceTime_;
        if (intList.isModifiable()) {
            return;
        }
        this.stanceTime_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStateIsMutable() {
        Internal.IntList intList = this.state_;
        if (intList.isModifiable()) {
            return;
        }
        this.state_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStepsIsMutable() {
        Internal.IntList intList = this.steps_;
        if (intList.isModifiable()) {
            return;
        }
        this.steps_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStrideIsMutable() {
        Internal.IntList intList = this.stride_;
        if (intList.isModifiable()) {
            return;
        }
        this.stride_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureStrokeFreqIsMutable() {
        Internal.IntList intList = this.strokeFreq_;
        if (intList.isModifiable()) {
            return;
        }
        this.strokeFreq_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureTimestampIsMutable() {
        Internal.LongList longList = this.timestamp_;
        if (longList.isModifiable()) {
            return;
        }
        this.timestamp_ = GeneratedMessageLite.mutableCopy(longList);
    }

    private void ensureVerticalOscillationIsMutable() {
        Internal.IntList intList = this.verticalOscillation_;
        if (intList.isModifiable()) {
            return;
        }
        this.verticalOscillation_ = GeneratedMessageLite.mutableCopy(intList);
    }

    private void ensureVerticalRatioIsMutable() {
        Internal.IntList intList = this.verticalRatio_;
        if (intList.isModifiable()) {
            return;
        }
        this.verticalRatio_ = GeneratedMessageLite.mutableCopy(intList);
    }

    public static FitnessProtoV2$SportRecordDetailData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static FitnessProtoV2$SportRecordDetailData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<FitnessProtoV2$SportRecordDetailData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBadmintonFreq(int i, int i2) {
        ensureBadmintonFreqIsMutable();
        this.badmintonFreq_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClimbSpeed(int i, int i2) {
        ensureClimbSpeedIsMutable();
        this.climbSpeed_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDistance(int i, int i2) {
        ensureDistanceIsMutable();
        this.distance_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setElevation(int i, int i2) {
        ensureElevationIsMutable();
        this.elevation_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEllipticalFreq(int i, int i2) {
        ensureEllipticalFreqIsMutable();
        this.ellipticalFreq_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFatBurningRate(int i, int i2) {
        ensureFatBurningRateIsMutable();
        this.fatBurningRate_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrequency(int i, int i2) {
        ensureFrequencyIsMutable();
        this.frequency_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRate(int i, int i2) {
        ensureHeartRateIsMutable();
        this.heartRate_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRateConf(int i, int i2) {
        ensureHeartRateConfIsMutable();
        this.heartRateConf_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrMotionActivityState(int i, int i2) {
        ensureHrMotionActivityStateIsMutable();
        this.hrMotionActivityState_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrMotionGru(int i, int i2) {
        ensureHrMotionGruIsMutable();
        this.hrMotionGru_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrMotionPower(int i, int i2) {
        ensureHrMotionPowerIsMutable();
        this.hrMotionPower_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrNnConfig(int i, int i2) {
        ensureHrNnConfigIsMutable();
        this.hrNnConfig_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrPostData(int i, int i2) {
        ensureHrPostDataIsMutable();
        this.hrPostData_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPace(int i, int i2) {
        ensurePaceIsMutable();
        this.pace_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPace2(int i, int i2) {
        ensurePace2IsMutable();
        this.pace2_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRowingFreq(int i, int i2) {
        ensureRowingFreqIsMutable();
        this.rowingFreq_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRunningPower(int i, int i2) {
        ensureRunningPowerIsMutable();
        this.runningPower_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStamina(int i, int i2) {
        ensureStaminaIsMutable();
        this.stamina_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStanceBalance(int i, int i2) {
        ensureStanceBalanceIsMutable();
        this.stanceBalance_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStanceTime(int i, int i2) {
        ensureStanceTimeIsMutable();
        this.stanceTime_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int i, int i2) {
        ensureStateIsMutable();
        this.state_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSteps(int i, int i2) {
        ensureStepsIsMutable();
        this.steps_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStride(int i, int i2) {
        ensureStrideIsMutable();
        this.stride_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStrokeFreq(int i, int i2) {
        ensureStrokeFreqIsMutable();
        this.strokeFreq_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(int i, long j2) {
        ensureTimestampIsMutable();
        this.timestamp_.setLong(i, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerticalOscillation(int i, int i2) {
        ensureVerticalOscillationIsMutable();
        this.verticalOscillation_.setInt(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerticalRatio(int i, int i2) {
        ensureVerticalRatioIsMutable();
        this.verticalRatio_.setInt(i, i2);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (in7.a[methodToInvoke.ordinal()]) {
            case 1:
                return new FitnessProtoV2$SportRecordDetailData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0000\u0001\u001c\u001c\u0000\u001c\u0000\u0001&\u0002+\u0003+\u0004+\u0005+\u0006'\u0007+\b+\t+\n+\u000b+\f+\r+\u000e+\u000f+\u0010+\u0011+\u0012+\u0013+\u0014+\u0015+\u0016+\u0017+\u0018+\u0019+\u001a+\u001b+\u001c+", new Object[]{"timestamp_", "state_", "pace_", "heartRate_", "frequency_", "elevation_", "distance_", "stride_", "stanceTime_", "verticalOscillation_", "stanceBalance_", "verticalRatio_", "runningPower_", "badmintonFreq_", "rowingFreq_", "ellipticalFreq_", "heartRateConf_", "stamina_", "steps_", "fatBurningRate_", "pace2_", "strokeFreq_", "climbSpeed_", "hrPostData_", "hrMotionActivityState_", "hrMotionGru_", "hrNnConfig_", "hrMotionPower_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<FitnessProtoV2$SportRecordDetailData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (FitnessProtoV2$SportRecordDetailData.class) {
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

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getBadmintonFreq(int i) {
        return this.badmintonFreq_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getBadmintonFreqCount() {
        return this.badmintonFreq_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getBadmintonFreqList() {
        return this.badmintonFreq_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getClimbSpeed(int i) {
        return this.climbSpeed_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getClimbSpeedCount() {
        return this.climbSpeed_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getClimbSpeedList() {
        return this.climbSpeed_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getDistance(int i) {
        return this.distance_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getDistanceCount() {
        return this.distance_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getDistanceList() {
        return this.distance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getElevation(int i) {
        return this.elevation_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getElevationCount() {
        return this.elevation_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getElevationList() {
        return this.elevation_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getEllipticalFreq(int i) {
        return this.ellipticalFreq_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getEllipticalFreqCount() {
        return this.ellipticalFreq_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getEllipticalFreqList() {
        return this.ellipticalFreq_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getFatBurningRate(int i) {
        return this.fatBurningRate_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getFatBurningRateCount() {
        return this.fatBurningRate_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getFatBurningRateList() {
        return this.fatBurningRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getFrequency(int i) {
        return this.frequency_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getFrequencyCount() {
        return this.frequency_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getFrequencyList() {
        return this.frequency_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHeartRate(int i) {
        return this.heartRate_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHeartRateConf(int i) {
        return this.heartRateConf_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHeartRateConfCount() {
        return this.heartRateConf_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getHeartRateConfList() {
        return this.heartRateConf_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHeartRateCount() {
        return this.heartRate_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getHeartRateList() {
        return this.heartRate_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrMotionActivityState(int i) {
        return this.hrMotionActivityState_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrMotionActivityStateCount() {
        return this.hrMotionActivityState_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getHrMotionActivityStateList() {
        return this.hrMotionActivityState_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrMotionGru(int i) {
        return this.hrMotionGru_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrMotionGruCount() {
        return this.hrMotionGru_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getHrMotionGruList() {
        return this.hrMotionGru_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrMotionPower(int i) {
        return this.hrMotionPower_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrMotionPowerCount() {
        return this.hrMotionPower_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getHrMotionPowerList() {
        return this.hrMotionPower_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrNnConfig(int i) {
        return this.hrNnConfig_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrNnConfigCount() {
        return this.hrNnConfig_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getHrNnConfigList() {
        return this.hrNnConfig_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrPostData(int i) {
        return this.hrPostData_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getHrPostDataCount() {
        return this.hrPostData_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getHrPostDataList() {
        return this.hrPostData_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getPace(int i) {
        return this.pace_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getPace2(int i) {
        return this.pace2_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getPace2Count() {
        return this.pace2_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getPace2List() {
        return this.pace2_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getPaceCount() {
        return this.pace_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getPaceList() {
        return this.pace_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getRowingFreq(int i) {
        return this.rowingFreq_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getRowingFreqCount() {
        return this.rowingFreq_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getRowingFreqList() {
        return this.rowingFreq_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getRunningPower(int i) {
        return this.runningPower_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getRunningPowerCount() {
        return this.runningPower_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getRunningPowerList() {
        return this.runningPower_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStamina(int i) {
        return this.stamina_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStaminaCount() {
        return this.stamina_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getStaminaList() {
        return this.stamina_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStanceBalance(int i) {
        return this.stanceBalance_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStanceBalanceCount() {
        return this.stanceBalance_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getStanceBalanceList() {
        return this.stanceBalance_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStanceTime(int i) {
        return this.stanceTime_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStanceTimeCount() {
        return this.stanceTime_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getStanceTimeList() {
        return this.stanceTime_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getState(int i) {
        return this.state_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStateCount() {
        return this.state_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getStateList() {
        return this.state_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getSteps(int i) {
        return this.steps_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStepsCount() {
        return this.steps_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getStepsList() {
        return this.steps_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStride(int i) {
        return this.stride_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStrideCount() {
        return this.stride_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getStrideList() {
        return this.stride_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStrokeFreq(int i) {
        return this.strokeFreq_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getStrokeFreqCount() {
        return this.strokeFreq_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getStrokeFreqList() {
        return this.strokeFreq_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public long getTimestamp(int i) {
        return this.timestamp_.getLong(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getTimestampCount() {
        return this.timestamp_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Long> getTimestampList() {
        return this.timestamp_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getVerticalOscillation(int i) {
        return this.verticalOscillation_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getVerticalOscillationCount() {
        return this.verticalOscillation_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getVerticalOscillationList() {
        return this.verticalOscillation_;
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getVerticalRatio(int i) {
        return this.verticalRatio_.getInt(i);
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public int getVerticalRatioCount() {
        return this.verticalRatio_.size();
    }

    @Override // com.heytap.health.protocol.fitness.FitnessProtoV2$SportRecordDetailDataOrBuilder
    public List<Integer> getVerticalRatioList() {
        return this.verticalRatio_;
    }

    public static Builder newBuilder(FitnessProtoV2$SportRecordDetailData fitnessProtoV2$SportRecordDetailData) {
        return DEFAULT_INSTANCE.createBuilder(fitnessProtoV2$SportRecordDetailData);
    }

    public static FitnessProtoV2$SportRecordDetailData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(InputStream inputStream) throws IOException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FitnessProtoV2$SportRecordDetailData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (FitnessProtoV2$SportRecordDetailData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
