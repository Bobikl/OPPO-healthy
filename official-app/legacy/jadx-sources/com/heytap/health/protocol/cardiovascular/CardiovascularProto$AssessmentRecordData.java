package com.heytap.health.protocol.cardiovascular;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.oplus.aiunit.vision.z23;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class CardiovascularProto$AssessmentRecordData extends GeneratedMessageLite<CardiovascularProto$AssessmentRecordData, Builder> implements CardiovascularProto$AssessmentRecordDataOrBuilder {
    public static final int BLOODPRESSUREINFO_FIELD_NUMBER = 26;
    public static final int BODYRECOVERYINFO_FIELD_NUMBER = 27;
    public static final int CARDIOHISTORYINFO_FIELD_NUMBER = 24;
    private static final CardiovascularProto$AssessmentRecordData DEFAULT_INSTANCE;
    public static final int DEGREE_VASCULAR_ELASTICITY_FIELD_NUMBER = 8;
    public static final int ECG_DIAGNOSIS_RESULTS_FIELD_NUMBER = 7;
    public static final int ECG_ID_FIELD_NUMBER = 6;
    public static final int END_TIME_FIELD_NUMBER = 2;
    public static final int EXTRA_FIELD_NUMBER = 15;
    public static final int FOCUS_MEASUREMENT_ITEMS_FIELD_NUMBER = 13;
    public static final int HEART_RATE_FIELD_NUMBER = 3;
    public static final int HRVINFO_FIELD_NUMBER = 28;
    private static volatile Parser<CardiovascularProto$AssessmentRecordData> PARSER = null;
    public static final int PWV_FIELD_NUMBER = 9;
    public static final int PWV_ID_FIELD_NUMBER = 10;
    public static final int SCOREANALYSIS_FIELD_NUMBER = 23;
    public static final int SINGLEOSAINFO_FIELD_NUMBER = 19;
    public static final int SINGLESLEEPINFO_FIELD_NUMBER = 18;
    public static final int SLEEPCROSSANALYSIS_FIELD_NUMBER = 20;
    public static final int SNOREANALYSIS_FIELD_NUMBER = 22;
    public static final int SPO2_FIELD_NUMBER = 5;
    public static final int START_TIME_FIELD_NUMBER = 1;
    public static final int STRESS_FIELD_NUMBER = 4;
    public static final int TEMPCROSSANALYSIS_FIELD_NUMBER = 21;
    public static final int TOTAL_MEASUREMENT_ITEMS_FIELD_NUMBER = 12;
    public static final int USERBODYINFO_FIELD_NUMBER = 16;
    public static final int VALID_MEASUREMENT_ITEMS_FIELD_NUMBER = 11;
    public static final int VASCULARAGE_FIELD_NUMBER = 25;
    public static final int VERSION_FIELD_NUMBER = 14;
    public static final int WRISTTEMPERATUREINFO_FIELD_NUMBER = 17;
    private int bitField0_;
    private CardiovascularProto$BloodPressureInfo bloodPressureInfo_;
    private CardiovascularProto$BodyRecoveryInfo bodyRecoveryInfo_;
    private CardiovascularProto$CardioHistoryInfo cardioHistoryInfo_;
    private int degreeVascularElasticity_;
    private int ecgDiagnosisResults_;
    private int endTime_;
    private int heartRate_;
    private CardiovascularProto$HrvInfo hrvInfo_;
    private float pwv_;
    private CardiovascularProto$ScoreAnalysisV1 scoreAnalysis_;
    private CardiovascularProto$SingleOsaInfoV1 singleOsaInfo_;
    private CardiovascularProto$SingleSleepInfoV1 singleSleepInfo_;
    private CardiovascularProto$MultipleSignsAnalysisV1 sleepCrossAnalysis_;
    private CardiovascularProto$SnoreAnalysisV1 snoreAnalysis_;
    private int spo2_;
    private int startTime_;
    private int stress_;
    private CardiovascularProto$TempCrossAnalysisV1 tempCrossAnalysis_;
    private int totalMeasurementItems_;
    private CardiovascularProto$UserBodyInfoV1 userBodyInfo_;
    private CardiovascularProto$VascularAgeInfo vascularAge_;
    private int version_;
    private CardiovascularProto$WristTemperatureInfoV1 wristTemperatureInfo_;
    private String ecgId_ = "";
    private String pwvId_ = "";
    private String validMeasurementItems_ = "";
    private String focusMeasurementItems_ = "";
    private String extra_ = "";

    public static final class Builder extends GeneratedMessageLite.Builder<CardiovascularProto$AssessmentRecordData, Builder> implements CardiovascularProto$AssessmentRecordDataOrBuilder {
        public Builder clearBloodPressureInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearBloodPressureInfo();
            return this;
        }

        public Builder clearBodyRecoveryInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearBodyRecoveryInfo();
            return this;
        }

        public Builder clearCardioHistoryInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearCardioHistoryInfo();
            return this;
        }

        public Builder clearDegreeVascularElasticity() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearDegreeVascularElasticity();
            return this;
        }

        public Builder clearEcgDiagnosisResults() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearEcgDiagnosisResults();
            return this;
        }

        public Builder clearEcgId() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearEcgId();
            return this;
        }

        public Builder clearEndTime() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearEndTime();
            return this;
        }

        public Builder clearExtra() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearExtra();
            return this;
        }

        public Builder clearFocusMeasurementItems() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearFocusMeasurementItems();
            return this;
        }

        public Builder clearHeartRate() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearHeartRate();
            return this;
        }

        public Builder clearHrvInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearHrvInfo();
            return this;
        }

        public Builder clearPwv() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearPwv();
            return this;
        }

        public Builder clearPwvId() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearPwvId();
            return this;
        }

        public Builder clearScoreAnalysis() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearScoreAnalysis();
            return this;
        }

        public Builder clearSingleOsaInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearSingleOsaInfo();
            return this;
        }

        public Builder clearSingleSleepInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearSingleSleepInfo();
            return this;
        }

        public Builder clearSleepCrossAnalysis() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearSleepCrossAnalysis();
            return this;
        }

        public Builder clearSnoreAnalysis() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearSnoreAnalysis();
            return this;
        }

        public Builder clearSpo2() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearSpo2();
            return this;
        }

        public Builder clearStartTime() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearStartTime();
            return this;
        }

        public Builder clearStress() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearStress();
            return this;
        }

        public Builder clearTempCrossAnalysis() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearTempCrossAnalysis();
            return this;
        }

        public Builder clearTotalMeasurementItems() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearTotalMeasurementItems();
            return this;
        }

        public Builder clearUserBodyInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearUserBodyInfo();
            return this;
        }

        public Builder clearValidMeasurementItems() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearValidMeasurementItems();
            return this;
        }

        public Builder clearVascularAge() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearVascularAge();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearVersion();
            return this;
        }

        public Builder clearWristTemperatureInfo() {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).clearWristTemperatureInfo();
            return this;
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$BloodPressureInfo getBloodPressureInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getBloodPressureInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$BodyRecoveryInfo getBodyRecoveryInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getBodyRecoveryInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$CardioHistoryInfo getCardioHistoryInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getCardioHistoryInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getDegreeVascularElasticity() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getDegreeVascularElasticity();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getEcgDiagnosisResults() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getEcgDiagnosisResults();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public String getEcgId() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getEcgId();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public ByteString getEcgIdBytes() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getEcgIdBytes();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getEndTime() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getEndTime();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public String getExtra() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getExtra();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public ByteString getExtraBytes() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getExtraBytes();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public String getFocusMeasurementItems() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getFocusMeasurementItems();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public ByteString getFocusMeasurementItemsBytes() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getFocusMeasurementItemsBytes();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getHeartRate() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getHeartRate();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$HrvInfo getHrvInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getHrvInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public float getPwv() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getPwv();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public String getPwvId() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getPwvId();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public ByteString getPwvIdBytes() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getPwvIdBytes();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$ScoreAnalysisV1 getScoreAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getScoreAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$SingleOsaInfoV1 getSingleOsaInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getSingleOsaInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$SingleSleepInfoV1 getSingleSleepInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getSingleSleepInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$MultipleSignsAnalysisV1 getSleepCrossAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getSleepCrossAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$SnoreAnalysisV1 getSnoreAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getSnoreAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getSpo2() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getSpo2();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getStartTime() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getStartTime();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getStress() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getStress();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$TempCrossAnalysisV1 getTempCrossAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getTempCrossAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getTotalMeasurementItems() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getTotalMeasurementItems();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$UserBodyInfoV1 getUserBodyInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getUserBodyInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public String getValidMeasurementItems() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getValidMeasurementItems();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public ByteString getValidMeasurementItemsBytes() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getValidMeasurementItemsBytes();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$VascularAgeInfo getVascularAge() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getVascularAge();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public int getVersion() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getVersion();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public CardiovascularProto$WristTemperatureInfoV1 getWristTemperatureInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).getWristTemperatureInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasBloodPressureInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasBloodPressureInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasBodyRecoveryInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasBodyRecoveryInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasCardioHistoryInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasCardioHistoryInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasHrvInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasHrvInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasScoreAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasScoreAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasSingleOsaInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasSingleOsaInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasSingleSleepInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasSingleSleepInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasSleepCrossAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasSleepCrossAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasSnoreAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasSnoreAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasTempCrossAnalysis() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasTempCrossAnalysis();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasUserBodyInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasUserBodyInfo();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasVascularAge() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasVascularAge();
        }

        @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
        public boolean hasWristTemperatureInfo() {
            return ((CardiovascularProto$AssessmentRecordData) this.instance).hasWristTemperatureInfo();
        }

        public Builder mergeBloodPressureInfo(CardiovascularProto$BloodPressureInfo cardiovascularProto$BloodPressureInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeBloodPressureInfo(cardiovascularProto$BloodPressureInfo);
            return this;
        }

        public Builder mergeBodyRecoveryInfo(CardiovascularProto$BodyRecoveryInfo cardiovascularProto$BodyRecoveryInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeBodyRecoveryInfo(cardiovascularProto$BodyRecoveryInfo);
            return this;
        }

        public Builder mergeCardioHistoryInfo(CardiovascularProto$CardioHistoryInfo cardiovascularProto$CardioHistoryInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeCardioHistoryInfo(cardiovascularProto$CardioHistoryInfo);
            return this;
        }

        public Builder mergeHrvInfo(CardiovascularProto$HrvInfo cardiovascularProto$HrvInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeHrvInfo(cardiovascularProto$HrvInfo);
            return this;
        }

        public Builder mergeScoreAnalysis(CardiovascularProto$ScoreAnalysisV1 cardiovascularProto$ScoreAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeScoreAnalysis(cardiovascularProto$ScoreAnalysisV1);
            return this;
        }

        public Builder mergeSingleOsaInfo(CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeSingleOsaInfo(cardiovascularProto$SingleOsaInfoV1);
            return this;
        }

        public Builder mergeSingleSleepInfo(CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeSingleSleepInfo(cardiovascularProto$SingleSleepInfoV1);
            return this;
        }

        public Builder mergeSleepCrossAnalysis(CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeSleepCrossAnalysis(cardiovascularProto$MultipleSignsAnalysisV1);
            return this;
        }

        public Builder mergeSnoreAnalysis(CardiovascularProto$SnoreAnalysisV1 cardiovascularProto$SnoreAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeSnoreAnalysis(cardiovascularProto$SnoreAnalysisV1);
            return this;
        }

        public Builder mergeTempCrossAnalysis(CardiovascularProto$TempCrossAnalysisV1 cardiovascularProto$TempCrossAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeTempCrossAnalysis(cardiovascularProto$TempCrossAnalysisV1);
            return this;
        }

        public Builder mergeUserBodyInfo(CardiovascularProto$UserBodyInfoV1 cardiovascularProto$UserBodyInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeUserBodyInfo(cardiovascularProto$UserBodyInfoV1);
            return this;
        }

        public Builder mergeVascularAge(CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeVascularAge(cardiovascularProto$VascularAgeInfo);
            return this;
        }

        public Builder mergeWristTemperatureInfo(CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).mergeWristTemperatureInfo(cardiovascularProto$WristTemperatureInfoV1);
            return this;
        }

        public Builder setBloodPressureInfo(CardiovascularProto$BloodPressureInfo cardiovascularProto$BloodPressureInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setBloodPressureInfo(cardiovascularProto$BloodPressureInfo);
            return this;
        }

        public Builder setBodyRecoveryInfo(CardiovascularProto$BodyRecoveryInfo cardiovascularProto$BodyRecoveryInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setBodyRecoveryInfo(cardiovascularProto$BodyRecoveryInfo);
            return this;
        }

        public Builder setCardioHistoryInfo(CardiovascularProto$CardioHistoryInfo cardiovascularProto$CardioHistoryInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setCardioHistoryInfo(cardiovascularProto$CardioHistoryInfo);
            return this;
        }

        public Builder setDegreeVascularElasticity(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setDegreeVascularElasticity(i);
            return this;
        }

        public Builder setEcgDiagnosisResults(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setEcgDiagnosisResults(i);
            return this;
        }

        public Builder setEcgId(String str) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setEcgId(str);
            return this;
        }

        public Builder setEcgIdBytes(ByteString byteString) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setEcgIdBytes(byteString);
            return this;
        }

        public Builder setEndTime(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setEndTime(i);
            return this;
        }

        public Builder setExtra(String str) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setExtra(str);
            return this;
        }

        public Builder setExtraBytes(ByteString byteString) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setExtraBytes(byteString);
            return this;
        }

        public Builder setFocusMeasurementItems(String str) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setFocusMeasurementItems(str);
            return this;
        }

        public Builder setFocusMeasurementItemsBytes(ByteString byteString) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setFocusMeasurementItemsBytes(byteString);
            return this;
        }

        public Builder setHeartRate(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setHeartRate(i);
            return this;
        }

        public Builder setHrvInfo(CardiovascularProto$HrvInfo cardiovascularProto$HrvInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setHrvInfo(cardiovascularProto$HrvInfo);
            return this;
        }

        public Builder setPwv(float f) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setPwv(f);
            return this;
        }

        public Builder setPwvId(String str) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setPwvId(str);
            return this;
        }

        public Builder setPwvIdBytes(ByteString byteString) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setPwvIdBytes(byteString);
            return this;
        }

        public Builder setScoreAnalysis(CardiovascularProto$ScoreAnalysisV1 cardiovascularProto$ScoreAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setScoreAnalysis(cardiovascularProto$ScoreAnalysisV1);
            return this;
        }

        public Builder setSingleOsaInfo(CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSingleOsaInfo(cardiovascularProto$SingleOsaInfoV1);
            return this;
        }

        public Builder setSingleSleepInfo(CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSingleSleepInfo(cardiovascularProto$SingleSleepInfoV1);
            return this;
        }

        public Builder setSleepCrossAnalysis(CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSleepCrossAnalysis(cardiovascularProto$MultipleSignsAnalysisV1);
            return this;
        }

        public Builder setSnoreAnalysis(CardiovascularProto$SnoreAnalysisV1 cardiovascularProto$SnoreAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSnoreAnalysis(cardiovascularProto$SnoreAnalysisV1);
            return this;
        }

        public Builder setSpo2(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSpo2(i);
            return this;
        }

        public Builder setStartTime(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setStartTime(i);
            return this;
        }

        public Builder setStress(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setStress(i);
            return this;
        }

        public Builder setTempCrossAnalysis(CardiovascularProto$TempCrossAnalysisV1 cardiovascularProto$TempCrossAnalysisV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setTempCrossAnalysis(cardiovascularProto$TempCrossAnalysisV1);
            return this;
        }

        public Builder setTotalMeasurementItems(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setTotalMeasurementItems(i);
            return this;
        }

        public Builder setUserBodyInfo(CardiovascularProto$UserBodyInfoV1 cardiovascularProto$UserBodyInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setUserBodyInfo(cardiovascularProto$UserBodyInfoV1);
            return this;
        }

        public Builder setValidMeasurementItems(String str) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setValidMeasurementItems(str);
            return this;
        }

        public Builder setValidMeasurementItemsBytes(ByteString byteString) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setValidMeasurementItemsBytes(byteString);
            return this;
        }

        public Builder setVascularAge(CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setVascularAge(cardiovascularProto$VascularAgeInfo);
            return this;
        }

        public Builder setVersion(int i) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setVersion(i);
            return this;
        }

        public Builder setWristTemperatureInfo(CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV1) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setWristTemperatureInfo(cardiovascularProto$WristTemperatureInfoV1);
            return this;
        }

        private Builder() {
            super(CardiovascularProto$AssessmentRecordData.DEFAULT_INSTANCE);
        }

        public Builder setBloodPressureInfo(CardiovascularProto$BloodPressureInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setBloodPressureInfo(builder.build());
            return this;
        }

        public Builder setBodyRecoveryInfo(CardiovascularProto$BodyRecoveryInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setBodyRecoveryInfo(builder.build());
            return this;
        }

        public Builder setCardioHistoryInfo(CardiovascularProto$CardioHistoryInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setCardioHistoryInfo(builder.build());
            return this;
        }

        public Builder setHrvInfo(CardiovascularProto$HrvInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setHrvInfo(builder.build());
            return this;
        }

        public Builder setScoreAnalysis(CardiovascularProto$ScoreAnalysisV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setScoreAnalysis(builder.build());
            return this;
        }

        public Builder setSingleOsaInfo(CardiovascularProto$SingleOsaInfoV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSingleOsaInfo(builder.build());
            return this;
        }

        public Builder setSingleSleepInfo(CardiovascularProto$SingleSleepInfoV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSingleSleepInfo(builder.build());
            return this;
        }

        public Builder setSleepCrossAnalysis(CardiovascularProto$MultipleSignsAnalysisV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSleepCrossAnalysis(builder.build());
            return this;
        }

        public Builder setSnoreAnalysis(CardiovascularProto$SnoreAnalysisV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setSnoreAnalysis(builder.build());
            return this;
        }

        public Builder setTempCrossAnalysis(CardiovascularProto$TempCrossAnalysisV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setTempCrossAnalysis(builder.build());
            return this;
        }

        public Builder setUserBodyInfo(CardiovascularProto$UserBodyInfoV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setUserBodyInfo(builder.build());
            return this;
        }

        public Builder setVascularAge(CardiovascularProto$VascularAgeInfo.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setVascularAge(builder.build());
            return this;
        }

        public Builder setWristTemperatureInfo(CardiovascularProto$WristTemperatureInfoV1.Builder builder) {
            copyOnWrite();
            ((CardiovascularProto$AssessmentRecordData) this.instance).setWristTemperatureInfo(builder.build());
            return this;
        }
    }

    static {
        CardiovascularProto$AssessmentRecordData cardiovascularProto$AssessmentRecordData = new CardiovascularProto$AssessmentRecordData();
        DEFAULT_INSTANCE = cardiovascularProto$AssessmentRecordData;
        GeneratedMessageLite.registerDefaultInstance(CardiovascularProto$AssessmentRecordData.class, cardiovascularProto$AssessmentRecordData);
    }

    private CardiovascularProto$AssessmentRecordData() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBloodPressureInfo() {
        this.bloodPressureInfo_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBodyRecoveryInfo() {
        this.bodyRecoveryInfo_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCardioHistoryInfo() {
        this.cardioHistoryInfo_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDegreeVascularElasticity() {
        this.degreeVascularElasticity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcgDiagnosisResults() {
        this.ecgDiagnosisResults_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEcgId() {
        this.ecgId_ = getDefaultInstance().getEcgId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtra() {
        this.extra_ = getDefaultInstance().getExtra();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFocusMeasurementItems() {
        this.focusMeasurementItems_ = getDefaultInstance().getFocusMeasurementItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeartRate() {
        this.heartRate_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHrvInfo() {
        this.hrvInfo_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPwv() {
        this.pwv_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPwvId() {
        this.pwvId_ = getDefaultInstance().getPwvId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScoreAnalysis() {
        this.scoreAnalysis_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSingleOsaInfo() {
        this.singleOsaInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSingleSleepInfo() {
        this.singleSleepInfo_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSleepCrossAnalysis() {
        this.sleepCrossAnalysis_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSnoreAnalysis() {
        this.snoreAnalysis_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpo2() {
        this.spo2_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStress() {
        this.stress_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTempCrossAnalysis() {
        this.tempCrossAnalysis_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalMeasurementItems() {
        this.totalMeasurementItems_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserBodyInfo() {
        this.userBodyInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidMeasurementItems() {
        this.validMeasurementItems_ = getDefaultInstance().getValidMeasurementItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVascularAge() {
        this.vascularAge_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWristTemperatureInfo() {
        this.wristTemperatureInfo_ = null;
        this.bitField0_ &= -3;
    }

    public static CardiovascularProto$AssessmentRecordData getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBloodPressureInfo(CardiovascularProto$BloodPressureInfo cardiovascularProto$BloodPressureInfo) {
        cardiovascularProto$BloodPressureInfo.getClass();
        CardiovascularProto$BloodPressureInfo cardiovascularProto$BloodPressureInfo2 = this.bloodPressureInfo_;
        if (cardiovascularProto$BloodPressureInfo2 == null || cardiovascularProto$BloodPressureInfo2 == CardiovascularProto$BloodPressureInfo.getDefaultInstance()) {
            this.bloodPressureInfo_ = cardiovascularProto$BloodPressureInfo;
        } else {
            this.bloodPressureInfo_ = CardiovascularProto$BloodPressureInfo.newBuilder(this.bloodPressureInfo_).mergeFrom(cardiovascularProto$BloodPressureInfo).buildPartial();
        }
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBodyRecoveryInfo(CardiovascularProto$BodyRecoveryInfo cardiovascularProto$BodyRecoveryInfo) {
        cardiovascularProto$BodyRecoveryInfo.getClass();
        CardiovascularProto$BodyRecoveryInfo cardiovascularProto$BodyRecoveryInfo2 = this.bodyRecoveryInfo_;
        if (cardiovascularProto$BodyRecoveryInfo2 == null || cardiovascularProto$BodyRecoveryInfo2 == CardiovascularProto$BodyRecoveryInfo.getDefaultInstance()) {
            this.bodyRecoveryInfo_ = cardiovascularProto$BodyRecoveryInfo;
        } else {
            this.bodyRecoveryInfo_ = CardiovascularProto$BodyRecoveryInfo.newBuilder(this.bodyRecoveryInfo_).mergeFrom(cardiovascularProto$BodyRecoveryInfo).buildPartial();
        }
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCardioHistoryInfo(CardiovascularProto$CardioHistoryInfo cardiovascularProto$CardioHistoryInfo) {
        cardiovascularProto$CardioHistoryInfo.getClass();
        CardiovascularProto$CardioHistoryInfo cardiovascularProto$CardioHistoryInfo2 = this.cardioHistoryInfo_;
        if (cardiovascularProto$CardioHistoryInfo2 == null || cardiovascularProto$CardioHistoryInfo2 == CardiovascularProto$CardioHistoryInfo.getDefaultInstance()) {
            this.cardioHistoryInfo_ = cardiovascularProto$CardioHistoryInfo;
        } else {
            this.cardioHistoryInfo_ = CardiovascularProto$CardioHistoryInfo.newBuilder(this.cardioHistoryInfo_).mergeFrom(cardiovascularProto$CardioHistoryInfo).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHrvInfo(CardiovascularProto$HrvInfo cardiovascularProto$HrvInfo) {
        cardiovascularProto$HrvInfo.getClass();
        CardiovascularProto$HrvInfo cardiovascularProto$HrvInfo2 = this.hrvInfo_;
        if (cardiovascularProto$HrvInfo2 == null || cardiovascularProto$HrvInfo2 == CardiovascularProto$HrvInfo.getDefaultInstance()) {
            this.hrvInfo_ = cardiovascularProto$HrvInfo;
        } else {
            this.hrvInfo_ = CardiovascularProto$HrvInfo.newBuilder(this.hrvInfo_).mergeFrom(cardiovascularProto$HrvInfo).buildPartial();
        }
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScoreAnalysis(CardiovascularProto$ScoreAnalysisV1 cardiovascularProto$ScoreAnalysisV1) {
        cardiovascularProto$ScoreAnalysisV1.getClass();
        CardiovascularProto$ScoreAnalysisV1 cardiovascularProto$ScoreAnalysisV2 = this.scoreAnalysis_;
        if (cardiovascularProto$ScoreAnalysisV2 == null || cardiovascularProto$ScoreAnalysisV2 == CardiovascularProto$ScoreAnalysisV1.getDefaultInstance()) {
            this.scoreAnalysis_ = cardiovascularProto$ScoreAnalysisV1;
        } else {
            this.scoreAnalysis_ = CardiovascularProto$ScoreAnalysisV1.newBuilder(this.scoreAnalysis_).mergeFrom(cardiovascularProto$ScoreAnalysisV1).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSingleOsaInfo(CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV1) {
        cardiovascularProto$SingleOsaInfoV1.getClass();
        CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV2 = this.singleOsaInfo_;
        if (cardiovascularProto$SingleOsaInfoV2 == null || cardiovascularProto$SingleOsaInfoV2 == CardiovascularProto$SingleOsaInfoV1.getDefaultInstance()) {
            this.singleOsaInfo_ = cardiovascularProto$SingleOsaInfoV1;
        } else {
            this.singleOsaInfo_ = CardiovascularProto$SingleOsaInfoV1.newBuilder(this.singleOsaInfo_).mergeFrom(cardiovascularProto$SingleOsaInfoV1).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSingleSleepInfo(CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV1) {
        cardiovascularProto$SingleSleepInfoV1.getClass();
        CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV2 = this.singleSleepInfo_;
        if (cardiovascularProto$SingleSleepInfoV2 == null || cardiovascularProto$SingleSleepInfoV2 == CardiovascularProto$SingleSleepInfoV1.getDefaultInstance()) {
            this.singleSleepInfo_ = cardiovascularProto$SingleSleepInfoV1;
        } else {
            this.singleSleepInfo_ = CardiovascularProto$SingleSleepInfoV1.newBuilder(this.singleSleepInfo_).mergeFrom(cardiovascularProto$SingleSleepInfoV1).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSleepCrossAnalysis(CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV1) {
        cardiovascularProto$MultipleSignsAnalysisV1.getClass();
        CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV2 = this.sleepCrossAnalysis_;
        if (cardiovascularProto$MultipleSignsAnalysisV2 == null || cardiovascularProto$MultipleSignsAnalysisV2 == CardiovascularProto$MultipleSignsAnalysisV1.getDefaultInstance()) {
            this.sleepCrossAnalysis_ = cardiovascularProto$MultipleSignsAnalysisV1;
        } else {
            this.sleepCrossAnalysis_ = CardiovascularProto$MultipleSignsAnalysisV1.newBuilder(this.sleepCrossAnalysis_).mergeFrom(cardiovascularProto$MultipleSignsAnalysisV1).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSnoreAnalysis(CardiovascularProto$SnoreAnalysisV1 cardiovascularProto$SnoreAnalysisV1) {
        cardiovascularProto$SnoreAnalysisV1.getClass();
        CardiovascularProto$SnoreAnalysisV1 cardiovascularProto$SnoreAnalysisV2 = this.snoreAnalysis_;
        if (cardiovascularProto$SnoreAnalysisV2 == null || cardiovascularProto$SnoreAnalysisV2 == CardiovascularProto$SnoreAnalysisV1.getDefaultInstance()) {
            this.snoreAnalysis_ = cardiovascularProto$SnoreAnalysisV1;
        } else {
            this.snoreAnalysis_ = CardiovascularProto$SnoreAnalysisV1.newBuilder(this.snoreAnalysis_).mergeFrom(cardiovascularProto$SnoreAnalysisV1).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTempCrossAnalysis(CardiovascularProto$TempCrossAnalysisV1 cardiovascularProto$TempCrossAnalysisV1) {
        cardiovascularProto$TempCrossAnalysisV1.getClass();
        CardiovascularProto$TempCrossAnalysisV1 cardiovascularProto$TempCrossAnalysisV2 = this.tempCrossAnalysis_;
        if (cardiovascularProto$TempCrossAnalysisV2 == null || cardiovascularProto$TempCrossAnalysisV2 == CardiovascularProto$TempCrossAnalysisV1.getDefaultInstance()) {
            this.tempCrossAnalysis_ = cardiovascularProto$TempCrossAnalysisV1;
        } else {
            this.tempCrossAnalysis_ = CardiovascularProto$TempCrossAnalysisV1.newBuilder(this.tempCrossAnalysis_).mergeFrom(cardiovascularProto$TempCrossAnalysisV1).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserBodyInfo(CardiovascularProto$UserBodyInfoV1 cardiovascularProto$UserBodyInfoV1) {
        cardiovascularProto$UserBodyInfoV1.getClass();
        CardiovascularProto$UserBodyInfoV1 cardiovascularProto$UserBodyInfoV2 = this.userBodyInfo_;
        if (cardiovascularProto$UserBodyInfoV2 == null || cardiovascularProto$UserBodyInfoV2 == CardiovascularProto$UserBodyInfoV1.getDefaultInstance()) {
            this.userBodyInfo_ = cardiovascularProto$UserBodyInfoV1;
        } else {
            this.userBodyInfo_ = CardiovascularProto$UserBodyInfoV1.newBuilder(this.userBodyInfo_).mergeFrom(cardiovascularProto$UserBodyInfoV1).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVascularAge(CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo) {
        cardiovascularProto$VascularAgeInfo.getClass();
        CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo2 = this.vascularAge_;
        if (cardiovascularProto$VascularAgeInfo2 == null || cardiovascularProto$VascularAgeInfo2 == CardiovascularProto$VascularAgeInfo.getDefaultInstance()) {
            this.vascularAge_ = cardiovascularProto$VascularAgeInfo;
        } else {
            this.vascularAge_ = CardiovascularProto$VascularAgeInfo.newBuilder(this.vascularAge_).mergeFrom(cardiovascularProto$VascularAgeInfo).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeWristTemperatureInfo(CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV1) {
        cardiovascularProto$WristTemperatureInfoV1.getClass();
        CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV2 = this.wristTemperatureInfo_;
        if (cardiovascularProto$WristTemperatureInfoV2 == null || cardiovascularProto$WristTemperatureInfoV2 == CardiovascularProto$WristTemperatureInfoV1.getDefaultInstance()) {
            this.wristTemperatureInfo_ = cardiovascularProto$WristTemperatureInfoV1;
        } else {
            this.wristTemperatureInfo_ = CardiovascularProto$WristTemperatureInfoV1.newBuilder(this.wristTemperatureInfo_).mergeFrom(cardiovascularProto$WristTemperatureInfoV1).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static CardiovascularProto$AssessmentRecordData parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<CardiovascularProto$AssessmentRecordData> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBloodPressureInfo(CardiovascularProto$BloodPressureInfo cardiovascularProto$BloodPressureInfo) {
        cardiovascularProto$BloodPressureInfo.getClass();
        this.bloodPressureInfo_ = cardiovascularProto$BloodPressureInfo;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyRecoveryInfo(CardiovascularProto$BodyRecoveryInfo cardiovascularProto$BodyRecoveryInfo) {
        cardiovascularProto$BodyRecoveryInfo.getClass();
        this.bodyRecoveryInfo_ = cardiovascularProto$BodyRecoveryInfo;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardioHistoryInfo(CardiovascularProto$CardioHistoryInfo cardiovascularProto$CardioHistoryInfo) {
        cardiovascularProto$CardioHistoryInfo.getClass();
        this.cardioHistoryInfo_ = cardiovascularProto$CardioHistoryInfo;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDegreeVascularElasticity(int i) {
        this.degreeVascularElasticity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcgDiagnosisResults(int i) {
        this.ecgDiagnosisResults_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcgId(String str) {
        str.getClass();
        this.ecgId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEcgIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.ecgId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(int i) {
        this.endTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtra(String str) {
        str.getClass();
        this.extra_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.extra_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFocusMeasurementItems(String str) {
        str.getClass();
        this.focusMeasurementItems_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFocusMeasurementItemsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.focusMeasurementItems_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeartRate(int i) {
        this.heartRate_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHrvInfo(CardiovascularProto$HrvInfo cardiovascularProto$HrvInfo) {
        cardiovascularProto$HrvInfo.getClass();
        this.hrvInfo_ = cardiovascularProto$HrvInfo;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPwv(float f) {
        this.pwv_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPwvId(String str) {
        str.getClass();
        this.pwvId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPwvIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.pwvId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScoreAnalysis(CardiovascularProto$ScoreAnalysisV1 cardiovascularProto$ScoreAnalysisV1) {
        cardiovascularProto$ScoreAnalysisV1.getClass();
        this.scoreAnalysis_ = cardiovascularProto$ScoreAnalysisV1;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingleOsaInfo(CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV1) {
        cardiovascularProto$SingleOsaInfoV1.getClass();
        this.singleOsaInfo_ = cardiovascularProto$SingleOsaInfoV1;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSingleSleepInfo(CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV1) {
        cardiovascularProto$SingleSleepInfoV1.getClass();
        this.singleSleepInfo_ = cardiovascularProto$SingleSleepInfoV1;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSleepCrossAnalysis(CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV1) {
        cardiovascularProto$MultipleSignsAnalysisV1.getClass();
        this.sleepCrossAnalysis_ = cardiovascularProto$MultipleSignsAnalysisV1;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSnoreAnalysis(CardiovascularProto$SnoreAnalysisV1 cardiovascularProto$SnoreAnalysisV1) {
        cardiovascularProto$SnoreAnalysisV1.getClass();
        this.snoreAnalysis_ = cardiovascularProto$SnoreAnalysisV1;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpo2(int i) {
        this.spo2_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(int i) {
        this.startTime_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStress(int i) {
        this.stress_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTempCrossAnalysis(CardiovascularProto$TempCrossAnalysisV1 cardiovascularProto$TempCrossAnalysisV1) {
        cardiovascularProto$TempCrossAnalysisV1.getClass();
        this.tempCrossAnalysis_ = cardiovascularProto$TempCrossAnalysisV1;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalMeasurementItems(int i) {
        this.totalMeasurementItems_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserBodyInfo(CardiovascularProto$UserBodyInfoV1 cardiovascularProto$UserBodyInfoV1) {
        cardiovascularProto$UserBodyInfoV1.getClass();
        this.userBodyInfo_ = cardiovascularProto$UserBodyInfoV1;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidMeasurementItems(String str) {
        str.getClass();
        this.validMeasurementItems_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidMeasurementItemsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.validMeasurementItems_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVascularAge(CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo) {
        cardiovascularProto$VascularAgeInfo.getClass();
        this.vascularAge_ = cardiovascularProto$VascularAgeInfo;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(int i) {
        this.version_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWristTemperatureInfo(CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV1) {
        cardiovascularProto$WristTemperatureInfoV1.getClass();
        this.wristTemperatureInfo_ = cardiovascularProto$WristTemperatureInfoV1;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (z23.a[methodToInvoke.ordinal()]) {
            case 1:
                return new CardiovascularProto$AssessmentRecordData();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0001\u0001\u001c\u001c\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b\u0004\u000b\u0005\u000b\u0006Ȉ\u0007\u000b\b\u000b\t\u0001\nȈ\u000bȈ\f\u000b\rȈ\u000e\u000b\u000fȈ\u0010ဉ\u0000\u0011ဉ\u0001\u0012ဉ\u0002\u0013ဉ\u0003\u0014ဉ\u0004\u0015ဉ\u0005\u0016ဉ\u0006\u0017ဉ\u0007\u0018ဉ\b\u0019ဉ\t\u001aဉ\n\u001bဉ\u000b\u001cဉ\f", new Object[]{"bitField0_", "startTime_", "endTime_", "heartRate_", "stress_", "spo2_", "ecgId_", "ecgDiagnosisResults_", "degreeVascularElasticity_", "pwv_", "pwvId_", "validMeasurementItems_", "totalMeasurementItems_", "focusMeasurementItems_", "version_", "extra_", "userBodyInfo_", "wristTemperatureInfo_", "singleSleepInfo_", "singleOsaInfo_", "sleepCrossAnalysis_", "tempCrossAnalysis_", "snoreAnalysis_", "scoreAnalysis_", "cardioHistoryInfo_", "vascularAge_", "bloodPressureInfo_", "bodyRecoveryInfo_", "hrvInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<CardiovascularProto$AssessmentRecordData> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (CardiovascularProto$AssessmentRecordData.class) {
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

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$BloodPressureInfo getBloodPressureInfo() {
        CardiovascularProto$BloodPressureInfo cardiovascularProto$BloodPressureInfo = this.bloodPressureInfo_;
        return cardiovascularProto$BloodPressureInfo == null ? CardiovascularProto$BloodPressureInfo.getDefaultInstance() : cardiovascularProto$BloodPressureInfo;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$BodyRecoveryInfo getBodyRecoveryInfo() {
        CardiovascularProto$BodyRecoveryInfo cardiovascularProto$BodyRecoveryInfo = this.bodyRecoveryInfo_;
        return cardiovascularProto$BodyRecoveryInfo == null ? CardiovascularProto$BodyRecoveryInfo.getDefaultInstance() : cardiovascularProto$BodyRecoveryInfo;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$CardioHistoryInfo getCardioHistoryInfo() {
        CardiovascularProto$CardioHistoryInfo cardiovascularProto$CardioHistoryInfo = this.cardioHistoryInfo_;
        return cardiovascularProto$CardioHistoryInfo == null ? CardiovascularProto$CardioHistoryInfo.getDefaultInstance() : cardiovascularProto$CardioHistoryInfo;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getDegreeVascularElasticity() {
        return this.degreeVascularElasticity_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getEcgDiagnosisResults() {
        return this.ecgDiagnosisResults_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public String getEcgId() {
        return this.ecgId_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public ByteString getEcgIdBytes() {
        return ByteString.copyFromUtf8(this.ecgId_);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getEndTime() {
        return this.endTime_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public String getExtra() {
        return this.extra_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public ByteString getExtraBytes() {
        return ByteString.copyFromUtf8(this.extra_);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public String getFocusMeasurementItems() {
        return this.focusMeasurementItems_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public ByteString getFocusMeasurementItemsBytes() {
        return ByteString.copyFromUtf8(this.focusMeasurementItems_);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getHeartRate() {
        return this.heartRate_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$HrvInfo getHrvInfo() {
        CardiovascularProto$HrvInfo cardiovascularProto$HrvInfo = this.hrvInfo_;
        return cardiovascularProto$HrvInfo == null ? CardiovascularProto$HrvInfo.getDefaultInstance() : cardiovascularProto$HrvInfo;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public float getPwv() {
        return this.pwv_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public String getPwvId() {
        return this.pwvId_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public ByteString getPwvIdBytes() {
        return ByteString.copyFromUtf8(this.pwvId_);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$ScoreAnalysisV1 getScoreAnalysis() {
        CardiovascularProto$ScoreAnalysisV1 cardiovascularProto$ScoreAnalysisV1 = this.scoreAnalysis_;
        return cardiovascularProto$ScoreAnalysisV1 == null ? CardiovascularProto$ScoreAnalysisV1.getDefaultInstance() : cardiovascularProto$ScoreAnalysisV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$SingleOsaInfoV1 getSingleOsaInfo() {
        CardiovascularProto$SingleOsaInfoV1 cardiovascularProto$SingleOsaInfoV1 = this.singleOsaInfo_;
        return cardiovascularProto$SingleOsaInfoV1 == null ? CardiovascularProto$SingleOsaInfoV1.getDefaultInstance() : cardiovascularProto$SingleOsaInfoV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$SingleSleepInfoV1 getSingleSleepInfo() {
        CardiovascularProto$SingleSleepInfoV1 cardiovascularProto$SingleSleepInfoV1 = this.singleSleepInfo_;
        return cardiovascularProto$SingleSleepInfoV1 == null ? CardiovascularProto$SingleSleepInfoV1.getDefaultInstance() : cardiovascularProto$SingleSleepInfoV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$MultipleSignsAnalysisV1 getSleepCrossAnalysis() {
        CardiovascularProto$MultipleSignsAnalysisV1 cardiovascularProto$MultipleSignsAnalysisV1 = this.sleepCrossAnalysis_;
        return cardiovascularProto$MultipleSignsAnalysisV1 == null ? CardiovascularProto$MultipleSignsAnalysisV1.getDefaultInstance() : cardiovascularProto$MultipleSignsAnalysisV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$SnoreAnalysisV1 getSnoreAnalysis() {
        CardiovascularProto$SnoreAnalysisV1 cardiovascularProto$SnoreAnalysisV1 = this.snoreAnalysis_;
        return cardiovascularProto$SnoreAnalysisV1 == null ? CardiovascularProto$SnoreAnalysisV1.getDefaultInstance() : cardiovascularProto$SnoreAnalysisV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getSpo2() {
        return this.spo2_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getStartTime() {
        return this.startTime_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getStress() {
        return this.stress_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$TempCrossAnalysisV1 getTempCrossAnalysis() {
        CardiovascularProto$TempCrossAnalysisV1 cardiovascularProto$TempCrossAnalysisV1 = this.tempCrossAnalysis_;
        return cardiovascularProto$TempCrossAnalysisV1 == null ? CardiovascularProto$TempCrossAnalysisV1.getDefaultInstance() : cardiovascularProto$TempCrossAnalysisV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getTotalMeasurementItems() {
        return this.totalMeasurementItems_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$UserBodyInfoV1 getUserBodyInfo() {
        CardiovascularProto$UserBodyInfoV1 cardiovascularProto$UserBodyInfoV1 = this.userBodyInfo_;
        return cardiovascularProto$UserBodyInfoV1 == null ? CardiovascularProto$UserBodyInfoV1.getDefaultInstance() : cardiovascularProto$UserBodyInfoV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public String getValidMeasurementItems() {
        return this.validMeasurementItems_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public ByteString getValidMeasurementItemsBytes() {
        return ByteString.copyFromUtf8(this.validMeasurementItems_);
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$VascularAgeInfo getVascularAge() {
        CardiovascularProto$VascularAgeInfo cardiovascularProto$VascularAgeInfo = this.vascularAge_;
        return cardiovascularProto$VascularAgeInfo == null ? CardiovascularProto$VascularAgeInfo.getDefaultInstance() : cardiovascularProto$VascularAgeInfo;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public int getVersion() {
        return this.version_;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public CardiovascularProto$WristTemperatureInfoV1 getWristTemperatureInfo() {
        CardiovascularProto$WristTemperatureInfoV1 cardiovascularProto$WristTemperatureInfoV1 = this.wristTemperatureInfo_;
        return cardiovascularProto$WristTemperatureInfoV1 == null ? CardiovascularProto$WristTemperatureInfoV1.getDefaultInstance() : cardiovascularProto$WristTemperatureInfoV1;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasBloodPressureInfo() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasBodyRecoveryInfo() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasCardioHistoryInfo() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasHrvInfo() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasScoreAnalysis() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasSingleOsaInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasSingleSleepInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasSleepCrossAnalysis() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasSnoreAnalysis() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasTempCrossAnalysis() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasUserBodyInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasVascularAge() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.heytap.health.protocol.cardiovascular.CardiovascularProto$AssessmentRecordDataOrBuilder
    public boolean hasWristTemperatureInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(CardiovascularProto$AssessmentRecordData cardiovascularProto$AssessmentRecordData) {
        return DEFAULT_INSTANCE.createBuilder(cardiovascularProto$AssessmentRecordData);
    }

    public static CardiovascularProto$AssessmentRecordData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(InputStream inputStream) throws IOException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CardiovascularProto$AssessmentRecordData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CardiovascularProto$AssessmentRecordData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
