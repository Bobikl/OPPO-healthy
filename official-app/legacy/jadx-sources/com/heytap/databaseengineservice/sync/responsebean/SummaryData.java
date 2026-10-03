package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010p\u001a\u00020\u0003HÆ\u0003J\u0013\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010r\u001a\u00020s2\b\u0010t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010u\u001a\u00020\u0003HÖ\u0001J\b\u0010v\u001a\u00020\u001fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001a\u0010-\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\u0004R\u001a\u00100\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\u0004R\u001a\u00103\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\u0004R\u001a\u00106\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\u0004R\u001a\u00109\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\u0004R\u001a\u0010<\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\u0004R\u001a\u0010?\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\u0004R\u001a\u0010B\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0007\"\u0004\bD\u0010\u0004R\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\u0004R\u001e\u0010N\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0007\"\u0004\bV\u0010\u0004R\u001a\u0010W\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0007\"\u0004\bY\u0010\u0004R\u001a\u0010Z\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0007\"\u0004\b\\\u0010\u0004R \u0010]\u001a\b\u0012\u0004\u0012\u00020^0\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0019\"\u0004\b`\u0010\u001bR\u001a\u0010a\u001a\u00020bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010g\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010'\"\u0004\bi\u0010)R\u001c\u0010j\u001a\u0004\u0018\u00010kX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006w"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SummaryData;", "", "date", "", "(I)V", "atrialFibrillationCount", "getAtrialFibrillationCount", "()I", "setAtrialFibrillationCount", "atrialFibrillationTime", "getAtrialFibrillationTime", "setAtrialFibrillationTime", "averageSleepBloodOxygen", "getAverageSleepBloodOxygen", "setAverageSleepBloodOxygen", "bloodGlucose", "Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseObject;", "getBloodGlucose", "()Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseObject;", "setBloodGlucose", "(Lcom/heytap/databaseengineservice/sync/responsebean/GlucoseObject;)V", "bloodOxygenWarningRecordList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/FamilyBloodOxygenWarningRecord;", "getBloodOxygenWarningRecordList", "()Ljava/util/List;", "setBloodOxygenWarningRecordList", "(Ljava/util/List;)V", "getDate", "setDate", "ecgMaxClientId", "", "getEcgMaxClientId", "()Ljava/lang/String;", "setEcgMaxClientId", "(Ljava/lang/String;)V", "ecgMaxModifiedTimestamp", "", "getEcgMaxModifiedTimestamp", "()J", "setEcgMaxModifiedTimestamp", "(J)V", "heartRateWarning", "getHeartRateWarning", "setHeartRateWarning", "maxBloodOxygenSaturation", "getMaxBloodOxygenSaturation", "setMaxBloodOxygenSaturation", "maxHeartRate", "getMaxHeartRate", "setMaxHeartRate", "maxSleepTime", "getMaxSleepTime", "setMaxSleepTime", "maxStress", "getMaxStress", "setMaxStress", "minBloodOxygenSaturation", "getMinBloodOxygenSaturation", "setMinBloodOxygenSaturation", "minHeartRate", "getMinHeartRate", "setMinHeartRate", "minSleepTime", "getMinSleepTime", "setMinSleepTime", "minStress", "getMinStress", "setMinStress", "physicalMental", "Lcom/heytap/databaseengineservice/sync/responsebean/PhysicalMentalObject;", "getPhysicalMental", "()Lcom/heytap/databaseengineservice/sync/responsebean/PhysicalMentalObject;", "setPhysicalMental", "(Lcom/heytap/databaseengineservice/sync/responsebean/PhysicalMentalObject;)V", "restHeartRate", "getRestHeartRate", "setRestHeartRate", "sleepRecoverRate", "getSleepRecoverRate", "()Ljava/lang/Integer;", "setSleepRecoverRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "sleepScore", "getSleepScore", "setSleepScore", "snoreNameType", "getSnoreNameType", "setSnoreNameType", "snoreRiskLevel", "getSnoreRiskLevel", "setSnoreRiskLevel", "sportRecordList", "Lcom/heytap/databaseengineservice/sync/responsebean/FamilySportRecord;", "getSportRecordList", "setSportRecordList", "stressBalance", "", "getStressBalance", "()D", "setStressBalance", "(D)V", "totalSleepTime", "getTotalSleepTime", "setTotalSleepTime", "wristTemperature", "Lcom/heytap/databaseengineservice/sync/responsebean/WristTemperatureObject;", "getWristTemperature", "()Lcom/heytap/databaseengineservice/sync/responsebean/WristTemperatureObject;", "setWristTemperature", "(Lcom/heytap/databaseengineservice/sync/responsebean/WristTemperatureObject;)V", "component1", "copy", "equals", "", "other", "hashCode", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SummaryData {
    private int atrialFibrillationCount;
    private int atrialFibrillationTime;
    private int averageSleepBloodOxygen;

    @Nullable
    private GlucoseObject bloodGlucose;
    private int date;
    private long ecgMaxModifiedTimestamp;
    private int maxBloodOxygenSaturation;
    private int maxHeartRate;
    private int maxSleepTime;
    private int maxStress;
    private int minBloodOxygenSaturation;
    private int minHeartRate;
    private int minSleepTime;
    private int minStress;

    @Nullable
    private PhysicalMentalObject physicalMental;
    private int restHeartRate;

    @Nullable
    private Integer sleepRecoverRate;
    private int sleepScore;
    private int snoreNameType;
    private double stressBalance;
    private long totalSleepTime;

    @Nullable
    private WristTemperatureObject wristTemperature;

    @NotNull
    private String heartRateWarning = "";

    @NotNull
    private String ecgMaxClientId = "";

    @NotNull
    private List<FamilyBloodOxygenWarningRecord> bloodOxygenWarningRecordList = CollectionsKt__CollectionsKt.emptyList();
    private int snoreRiskLevel = -1;

    @NotNull
    private List<FamilySportRecord> sportRecordList = CollectionsKt__CollectionsKt.emptyList();

    public SummaryData(int i) {
        this.date = i;
    }

    public static /* synthetic */ SummaryData copy$default(SummaryData summaryData, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = summaryData.date;
        }
        return summaryData.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final SummaryData copy(int date) {
        return new SummaryData(date);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SummaryData) && this.date == ((SummaryData) other).date;
    }

    public final int getAtrialFibrillationCount() {
        return this.atrialFibrillationCount;
    }

    public final int getAtrialFibrillationTime() {
        return this.atrialFibrillationTime;
    }

    public final int getAverageSleepBloodOxygen() {
        return this.averageSleepBloodOxygen;
    }

    @Nullable
    public final GlucoseObject getBloodGlucose() {
        return this.bloodGlucose;
    }

    @NotNull
    public final List<FamilyBloodOxygenWarningRecord> getBloodOxygenWarningRecordList() {
        return this.bloodOxygenWarningRecordList;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final String getEcgMaxClientId() {
        return this.ecgMaxClientId;
    }

    public final long getEcgMaxModifiedTimestamp() {
        return this.ecgMaxModifiedTimestamp;
    }

    @NotNull
    public final String getHeartRateWarning() {
        return this.heartRateWarning;
    }

    public final int getMaxBloodOxygenSaturation() {
        return this.maxBloodOxygenSaturation;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final int getMaxSleepTime() {
        return this.maxSleepTime;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final int getMinBloodOxygenSaturation() {
        return this.minBloodOxygenSaturation;
    }

    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final int getMinSleepTime() {
        return this.minSleepTime;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    @Nullable
    public final PhysicalMentalObject getPhysicalMental() {
        return this.physicalMental;
    }

    public final int getRestHeartRate() {
        return this.restHeartRate;
    }

    @Nullable
    public final Integer getSleepRecoverRate() {
        return this.sleepRecoverRate;
    }

    public final int getSleepScore() {
        return this.sleepScore;
    }

    public final int getSnoreNameType() {
        return this.snoreNameType;
    }

    public final int getSnoreRiskLevel() {
        return this.snoreRiskLevel;
    }

    @NotNull
    public final List<FamilySportRecord> getSportRecordList() {
        return this.sportRecordList;
    }

    public final double getStressBalance() {
        return this.stressBalance;
    }

    public final long getTotalSleepTime() {
        return this.totalSleepTime;
    }

    @Nullable
    public final WristTemperatureObject getWristTemperature() {
        return this.wristTemperature;
    }

    public int hashCode() {
        return Integer.hashCode(this.date);
    }

    public final void setAtrialFibrillationCount(int i) {
        this.atrialFibrillationCount = i;
    }

    public final void setAtrialFibrillationTime(int i) {
        this.atrialFibrillationTime = i;
    }

    public final void setAverageSleepBloodOxygen(int i) {
        this.averageSleepBloodOxygen = i;
    }

    public final void setBloodGlucose(@Nullable GlucoseObject glucoseObject) {
        this.bloodGlucose = glucoseObject;
    }

    public final void setBloodOxygenWarningRecordList(@NotNull List<FamilyBloodOxygenWarningRecord> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.bloodOxygenWarningRecordList = list;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setEcgMaxClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ecgMaxClientId = str;
    }

    public final void setEcgMaxModifiedTimestamp(long j2) {
        this.ecgMaxModifiedTimestamp = j2;
    }

    public final void setHeartRateWarning(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heartRateWarning = str;
    }

    public final void setMaxBloodOxygenSaturation(int i) {
        this.maxBloodOxygenSaturation = i;
    }

    public final void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public final void setMaxSleepTime(int i) {
        this.maxSleepTime = i;
    }

    public final void setMaxStress(int i) {
        this.maxStress = i;
    }

    public final void setMinBloodOxygenSaturation(int i) {
        this.minBloodOxygenSaturation = i;
    }

    public final void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public final void setMinSleepTime(int i) {
        this.minSleepTime = i;
    }

    public final void setMinStress(int i) {
        this.minStress = i;
    }

    public final void setPhysicalMental(@Nullable PhysicalMentalObject physicalMentalObject) {
        this.physicalMental = physicalMentalObject;
    }

    public final void setRestHeartRate(int i) {
        this.restHeartRate = i;
    }

    public final void setSleepRecoverRate(@Nullable Integer num) {
        this.sleepRecoverRate = num;
    }

    public final void setSleepScore(int i) {
        this.sleepScore = i;
    }

    public final void setSnoreNameType(int i) {
        this.snoreNameType = i;
    }

    public final void setSnoreRiskLevel(int i) {
        this.snoreRiskLevel = i;
    }

    public final void setSportRecordList(@NotNull List<FamilySportRecord> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sportRecordList = list;
    }

    public final void setStressBalance(double d) {
        this.stressBalance = d;
    }

    public final void setTotalSleepTime(long j2) {
        this.totalSleepTime = j2;
    }

    public final void setWristTemperature(@Nullable WristTemperatureObject wristTemperatureObject) {
        this.wristTemperature = wristTemperatureObject;
    }

    @NotNull
    public String toString() {
        return "SummaryData(date=" + this.date + ", minHeartRate=" + this.minHeartRate + ", maxHeartRate=" + this.maxHeartRate + ", restHeartRate=" + this.restHeartRate + ", heartRateWarning='" + this.heartRateWarning + "', totalSleepTime=" + this.totalSleepTime + ", minSleepTime=" + this.minSleepTime + ", maxSleepTime=" + this.maxSleepTime + ", sleepScore=" + this.sleepScore + ", minBloodOxygenSaturation=" + this.minBloodOxygenSaturation + ", maxBloodOxygenSaturation=" + this.maxBloodOxygenSaturation + ", minStress=" + this.minStress + ", stressBalance=" + this.stressBalance + ", maxStress=" + this.maxStress + ", ecgMaxClientId='" + this.ecgMaxClientId + "', ecgMaxModifiedTimestamp=" + this.ecgMaxModifiedTimestamp + ", atrialFibrillationCount=" + this.atrialFibrillationCount + ", atrialFibrillationTime=" + this.atrialFibrillationTime + ", bloodOxygenWarningRecordList=" + this.bloodOxygenWarningRecordList + ", snoreRiskLevel=" + this.snoreRiskLevel + ", averageSleepBloodOxygen=" + this.averageSleepBloodOxygen + ", sportRecordList=" + this.sportRecordList + ", wristTemperature=" + this.wristTemperature + ", bloodGlucose=" + this.bloodGlucose + ", physicalMental=" + this.physicalMental + ", )";
    }
}
