package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.t04;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b6\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010s\u001a\u00020\u000bH\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00101\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001c\u00104\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\r\"\u0004\b6\u0010\u000fR\u001a\u00107\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R\u001e\u0010:\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001e\u0010=\u001a\u0004\u0018\u00010>X\u0086\u000e¢\u0006\u0010\n\u0002\u0010C\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010D\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010\u000fR\u001c\u0010G\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\r\"\u0004\bI\u0010\u000fR\u001c\u0010J\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\r\"\u0004\bL\u0010\u000fR\u001c\u0010M\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\r\"\u0004\bO\u0010\u000fR\u001c\u0010P\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u000fR\u001c\u0010S\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\r\"\u0004\bU\u0010\u000fR\u001a\u0010V\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\u001e\u0010Y\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bZ\u0010\u0006\"\u0004\b[\u0010\bR\u001c\u0010\\\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\r\"\u0004\b^\u0010\u000fR\u001e\u0010_\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b`\u0010\u0006\"\u0004\ba\u0010\bR\u001a\u0010b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001c\u0010g\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\r\"\u0004\bi\u0010\u000fR$\u0010j\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010,X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010.\"\u0004\bl\u00100R\u001c\u0010m\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\r\"\u0004\bo\u0010\u000fR\u001c\u0010p\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\r\"\u0004\br\u0010\u000f¨\u0006t"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/AssessmentRecordPOJO;", "", "()V", "bloodOxygenSaturationValue", "", "getBloodOxygenSaturationValue", "()Ljava/lang/Integer;", "setBloodOxygenSaturationValue", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bloodPressureInfo", "", "getBloodPressureInfo", "()Ljava/lang/String;", "setBloodPressureInfo", "(Ljava/lang/String;)V", "bodyRecoveryInfo", "getBodyRecoveryInfo", "setBodyRecoveryInfo", "cardioHistoryInfo", "getCardioHistoryInfo", "setCardioHistoryInfo", "degreeVascularElasticity", "getDegreeVascularElasticity", "setDegreeVascularElasticity", "del", "getDel", "setDel", t04.DEVICE_UNIQUE_ID, "getDeviceUniqueId", "setDeviceUniqueId", "ecgDiagnosisResults", "getEcgDiagnosisResults", "setEcgDiagnosisResults", "ecgId", "getEcgId", "setEcgId", "endTimestamp", "", "getEndTimestamp", "()J", "setEndTimestamp", "(J)V", "focusMeasurementItems", "", "getFocusMeasurementItems", "()Ljava/util/List;", "setFocusMeasurementItems", "(Ljava/util/List;)V", "heartRateValue", "getHeartRateValue", "setHeartRateValue", "hrvInfo", "getHrvInfo", "setHrvInfo", "modifiedTimestamp", "getModifiedTimestamp", "setModifiedTimestamp", LogSenderConst.PROTOCOLVERSION, "getProtocolVersion", "setProtocolVersion", DBAssessmentRecord.PWV, "", "getPwv", "()Ljava/lang/Double;", "setPwv", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "pwvId", "getPwvId", "setPwvId", "scoreAnalysis", "getScoreAnalysis", "setScoreAnalysis", "singleOsaInfo", "getSingleOsaInfo", "setSingleOsaInfo", "singleSleepInfo", "getSingleSleepInfo", "setSingleSleepInfo", "sleepCrossAnalysis", "getSleepCrossAnalysis", "setSleepCrossAnalysis", "snoreAnalysis", "getSnoreAnalysis", "setSnoreAnalysis", "startTimestamp", "getStartTimestamp", "setStartTimestamp", "stressValue", "getStressValue", "setStressValue", "tempCrossAnalysis", "getTempCrossAnalysis", "setTempCrossAnalysis", "totalMeasurementItemsCount", "getTotalMeasurementItemsCount", "setTotalMeasurementItemsCount", "updated", "getUpdated", "()I", "setUpdated", "(I)V", "userBodyInfo", "getUserBodyInfo", "setUserBodyInfo", "validMeasurementItems", "getValidMeasurementItems", "setValidMeasurementItems", "vascularAgeInfo", "getVascularAgeInfo", "setVascularAgeInfo", "wristTemperatureInfo", "getWristTemperatureInfo", "setWristTemperatureInfo", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AssessmentRecordPOJO {

    @Nullable
    private Integer bloodOxygenSaturationValue;

    @Nullable
    private String bloodPressureInfo;

    @Nullable
    private String bodyRecoveryInfo;

    @Nullable
    private String cardioHistoryInfo;

    @Nullable
    private Integer degreeVascularElasticity;

    @Nullable
    private Integer del;

    @NotNull
    private String deviceUniqueId = "";

    @Nullable
    private Integer ecgDiagnosisResults;

    @Nullable
    private String ecgId;
    private long endTimestamp;

    @Nullable
    private List<Integer> focusMeasurementItems;

    @Nullable
    private Integer heartRateValue;

    @Nullable
    private String hrvInfo;
    private long modifiedTimestamp;

    @Nullable
    private Integer protocolVersion;

    @Nullable
    private Double pwv;

    @Nullable
    private String pwvId;

    @Nullable
    private String scoreAnalysis;

    @Nullable
    private String singleOsaInfo;

    @Nullable
    private String singleSleepInfo;

    @Nullable
    private String sleepCrossAnalysis;

    @Nullable
    private String snoreAnalysis;
    private long startTimestamp;

    @Nullable
    private Integer stressValue;

    @Nullable
    private String tempCrossAnalysis;

    @Nullable
    private Integer totalMeasurementItemsCount;
    private int updated;

    @Nullable
    private String userBodyInfo;

    @Nullable
    private List<Integer> validMeasurementItems;

    @Nullable
    private String vascularAgeInfo;

    @Nullable
    private String wristTemperatureInfo;

    @Nullable
    public final Integer getBloodOxygenSaturationValue() {
        return this.bloodOxygenSaturationValue;
    }

    @Nullable
    public final String getBloodPressureInfo() {
        return this.bloodPressureInfo;
    }

    @Nullable
    public final String getBodyRecoveryInfo() {
        return this.bodyRecoveryInfo;
    }

    @Nullable
    public final String getCardioHistoryInfo() {
        return this.cardioHistoryInfo;
    }

    @Nullable
    public final Integer getDegreeVascularElasticity() {
        return this.degreeVascularElasticity;
    }

    @Nullable
    public final Integer getDel() {
        return this.del;
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Nullable
    public final Integer getEcgDiagnosisResults() {
        return this.ecgDiagnosisResults;
    }

    @Nullable
    public final String getEcgId() {
        return this.ecgId;
    }

    public final long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final List<Integer> getFocusMeasurementItems() {
        return this.focusMeasurementItems;
    }

    @Nullable
    public final Integer getHeartRateValue() {
        return this.heartRateValue;
    }

    @Nullable
    public final String getHrvInfo() {
        return this.hrvInfo;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final Integer getProtocolVersion() {
        return this.protocolVersion;
    }

    @Nullable
    public final Double getPwv() {
        return this.pwv;
    }

    @Nullable
    public final String getPwvId() {
        return this.pwvId;
    }

    @Nullable
    public final String getScoreAnalysis() {
        return this.scoreAnalysis;
    }

    @Nullable
    public final String getSingleOsaInfo() {
        return this.singleOsaInfo;
    }

    @Nullable
    public final String getSingleSleepInfo() {
        return this.singleSleepInfo;
    }

    @Nullable
    public final String getSleepCrossAnalysis() {
        return this.sleepCrossAnalysis;
    }

    @Nullable
    public final String getSnoreAnalysis() {
        return this.snoreAnalysis;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final Integer getStressValue() {
        return this.stressValue;
    }

    @Nullable
    public final String getTempCrossAnalysis() {
        return this.tempCrossAnalysis;
    }

    @Nullable
    public final Integer getTotalMeasurementItemsCount() {
        return this.totalMeasurementItemsCount;
    }

    public final int getUpdated() {
        return this.updated;
    }

    @Nullable
    public final String getUserBodyInfo() {
        return this.userBodyInfo;
    }

    @Nullable
    public final List<Integer> getValidMeasurementItems() {
        return this.validMeasurementItems;
    }

    @Nullable
    public final String getVascularAgeInfo() {
        return this.vascularAgeInfo;
    }

    @Nullable
    public final String getWristTemperatureInfo() {
        return this.wristTemperatureInfo;
    }

    public final void setBloodOxygenSaturationValue(@Nullable Integer num) {
        this.bloodOxygenSaturationValue = num;
    }

    public final void setBloodPressureInfo(@Nullable String str) {
        this.bloodPressureInfo = str;
    }

    public final void setBodyRecoveryInfo(@Nullable String str) {
        this.bodyRecoveryInfo = str;
    }

    public final void setCardioHistoryInfo(@Nullable String str) {
        this.cardioHistoryInfo = str;
    }

    public final void setDegreeVascularElasticity(@Nullable Integer num) {
        this.degreeVascularElasticity = num;
    }

    public final void setDel(@Nullable Integer num) {
        this.del = num;
    }

    public final void setDeviceUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceUniqueId = str;
    }

    public final void setEcgDiagnosisResults(@Nullable Integer num) {
        this.ecgDiagnosisResults = num;
    }

    public final void setEcgId(@Nullable String str) {
        this.ecgId = str;
    }

    public final void setEndTimestamp(long j2) {
        this.endTimestamp = j2;
    }

    public final void setFocusMeasurementItems(@Nullable List<Integer> list) {
        this.focusMeasurementItems = list;
    }

    public final void setHeartRateValue(@Nullable Integer num) {
        this.heartRateValue = num;
    }

    public final void setHrvInfo(@Nullable String str) {
        this.hrvInfo = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setProtocolVersion(@Nullable Integer num) {
        this.protocolVersion = num;
    }

    public final void setPwv(@Nullable Double d) {
        this.pwv = d;
    }

    public final void setPwvId(@Nullable String str) {
        this.pwvId = str;
    }

    public final void setScoreAnalysis(@Nullable String str) {
        this.scoreAnalysis = str;
    }

    public final void setSingleOsaInfo(@Nullable String str) {
        this.singleOsaInfo = str;
    }

    public final void setSingleSleepInfo(@Nullable String str) {
        this.singleSleepInfo = str;
    }

    public final void setSleepCrossAnalysis(@Nullable String str) {
        this.sleepCrossAnalysis = str;
    }

    public final void setSnoreAnalysis(@Nullable String str) {
        this.snoreAnalysis = str;
    }

    public final void setStartTimestamp(long j2) {
        this.startTimestamp = j2;
    }

    public final void setStressValue(@Nullable Integer num) {
        this.stressValue = num;
    }

    public final void setTempCrossAnalysis(@Nullable String str) {
        this.tempCrossAnalysis = str;
    }

    public final void setTotalMeasurementItemsCount(@Nullable Integer num) {
        this.totalMeasurementItemsCount = num;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    public final void setUserBodyInfo(@Nullable String str) {
        this.userBodyInfo = str;
    }

    public final void setValidMeasurementItems(@Nullable List<Integer> list) {
        this.validMeasurementItems = list;
    }

    public final void setVascularAgeInfo(@Nullable String str) {
        this.vascularAgeInfo = str;
    }

    public final void setWristTemperatureInfo(@Nullable String str) {
        this.wristTemperatureInfo = str;
    }

    @NotNull
    public String toString() {
        return "AssessmentRecordPOJO(deviceUniqueId='" + this.deviceUniqueId + "', startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", heartRateValue=" + this.heartRateValue + ", stressValue=" + this.stressValue + ", bloodOxygenSaturationValue=" + this.bloodOxygenSaturationValue + ", ecgId=" + this.ecgId + ", ecgDiagnosisResults=" + this.ecgDiagnosisResults + ", degreeVascularElasticity=" + this.degreeVascularElasticity + ", validMeasurementItems=" + this.validMeasurementItems + ", totalMeasurementItemsCount=" + this.totalMeasurementItemsCount + ", focusMeasurementItems=" + this.focusMeasurementItems + ", protocolVersion=" + this.protocolVersion + ", pwv=" + this.pwv + ", pwvId=" + this.pwvId + ", del=" + this.del + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", userBodyInfo=" + this.userBodyInfo + ", wristTemperatureInfo=" + this.wristTemperatureInfo + ", singleSleepInfo=" + this.singleSleepInfo + ", singleOsaInfo=" + this.singleOsaInfo + ", sleepCrossAnalysis=" + this.sleepCrossAnalysis + ", tempCrossAnalysis=" + this.tempCrossAnalysis + ", snoreAnalysis=" + this.snoreAnalysis + ", scoreAnalysis=" + this.scoreAnalysis + ", cardioHistoryInfo=" + this.cardioHistoryInfo + ", vascularAgeInfo=" + this.vascularAgeInfo + ", bloodPressureInfo=" + this.bloodPressureInfo + ", bodyRecoveryInfo=" + this.bodyRecoveryInfo + ", hrvInfo=" + this.hrvInfo + ")";
    }
}
