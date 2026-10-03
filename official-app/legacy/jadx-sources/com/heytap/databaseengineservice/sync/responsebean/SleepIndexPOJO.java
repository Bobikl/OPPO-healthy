package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t04;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001:\u0001PB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010O\u001a\u00020#H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\u001e\u0010+\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001e\u0010.\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001c\u00101\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010:\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001e\u0010=\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b>\u0010\u0006\"\u0004\b?\u0010\bR\u001e\u0010@\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bA\u0010\u0006\"\u0004\bB\u0010\bR\u001e\u0010C\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001e\u0010F\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bG\u0010\u0006\"\u0004\bH\u0010\bR\u001e\u0010I\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\u001a\u0010L\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010!¨\u0006Q"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SleepIndexPOJO;", "", "()V", "avgSleepSpo2", "", "getAvgSleepSpo2", "()Ljava/lang/Integer;", "setAvgSleepSpo2", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "basalBreathe", "getBasalBreathe", "setBasalBreathe", "basalSleepHeartRate", "getBasalSleepHeartRate", "setBasalSleepHeartRate", "bedtimeData", "", "Lcom/heytap/databaseengineservice/sync/responsebean/SleepIndexPOJO$BedtimeData;", "getBedtimeData", "()Ljava/util/List;", "setBedtimeData", "(Ljava/util/List;)V", "breatheReasonableRangeHigh", "getBreatheReasonableRangeHigh", "setBreatheReasonableRangeHigh", "breatheReasonableRangeLow", "getBreatheReasonableRangeLow", "setBreatheReasonableRangeLow", "date", "getDate", "()I", "setDate", "(I)V", t04.DEVICE_UNIQUE_ID, "", "getDeviceUniqueId", "()Ljava/lang/String;", "setDeviceUniqueId", "(Ljava/lang/String;)V", "hasHeartRateWarning", "getHasHeartRateWarning", "setHasHeartRateWarning", "heartRateReasonableRangeHigh", "getHeartRateReasonableRangeHigh", "setHeartRateReasonableRangeHigh", "heartRateReasonableRangeLow", "getHeartRateReasonableRangeLow", "setHeartRateReasonableRangeLow", "heartRateWarningLabel", "getHeartRateWarningLabel", "setHeartRateWarningLabel", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "sleepBreatheRangeHigh", "getSleepBreatheRangeHigh", "setSleepBreatheRangeHigh", "sleepBreatheRangeLow", "getSleepBreatheRangeLow", "setSleepBreatheRangeLow", "sleepHeartRateRangeHigh", "getSleepHeartRateRangeHigh", "setSleepHeartRateRangeHigh", "sleepHeartRateRangeLow", "getSleepHeartRateRangeLow", "setSleepHeartRateRangeLow", "sleepRecoveryDiffValue", "getSleepRecoveryDiffValue", "setSleepRecoveryDiffValue", "sleepRecoveryRate", "getSleepRecoveryRate", "setSleepRecoveryRate", "updated", "getUpdated", "setUpdated", "toString", "BedtimeData", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepIndexPOJO {

    @Nullable
    private Integer avgSleepSpo2;

    @Nullable
    private Integer basalBreathe;

    @Nullable
    private Integer basalSleepHeartRate;

    @Nullable
    private List<BedtimeData> bedtimeData;

    @Nullable
    private Integer breatheReasonableRangeHigh;

    @Nullable
    private Integer breatheReasonableRangeLow;
    private int date;

    @Nullable
    private String deviceUniqueId;
    private int hasHeartRateWarning;

    @Nullable
    private Integer heartRateReasonableRangeHigh;

    @Nullable
    private Integer heartRateReasonableRangeLow;

    @Nullable
    private String heartRateWarningLabel;
    private long modifiedTimestamp;

    @Nullable
    private Integer sleepBreatheRangeHigh;

    @Nullable
    private Integer sleepBreatheRangeLow;

    @Nullable
    private Integer sleepHeartRateRangeHigh;

    @Nullable
    private Integer sleepHeartRateRangeLow;

    @Nullable
    private Integer sleepRecoveryDiffValue;

    @Nullable
    private Integer sleepRecoveryRate;
    private int updated;

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SleepIndexPOJO$BedtimeData;", "", "()V", "bedTimestamp", "", "getBedTimestamp", "()I", "setBedTimestamp", "(I)V", "type", "getType", "setType", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class BedtimeData {
        private int bedTimestamp;
        private int type;

        public final int getBedTimestamp() {
            return this.bedTimestamp;
        }

        public final int getType() {
            return this.type;
        }

        public final void setBedTimestamp(int i) {
            this.bedTimestamp = i;
        }

        public final void setType(int i) {
            this.type = i;
        }

        @NotNull
        public String toString() {
            return "BedtimeData(type=" + this.type + ", bedTimestamp=" + this.bedTimestamp + ")";
        }
    }

    @Nullable
    public final Integer getAvgSleepSpo2() {
        return this.avgSleepSpo2;
    }

    @Nullable
    public final Integer getBasalBreathe() {
        return this.basalBreathe;
    }

    @Nullable
    public final Integer getBasalSleepHeartRate() {
        return this.basalSleepHeartRate;
    }

    @Nullable
    public final List<BedtimeData> getBedtimeData() {
        return this.bedtimeData;
    }

    @Nullable
    public final Integer getBreatheReasonableRangeHigh() {
        return this.breatheReasonableRangeHigh;
    }

    @Nullable
    public final Integer getBreatheReasonableRangeLow() {
        return this.breatheReasonableRangeLow;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final int getHasHeartRateWarning() {
        return this.hasHeartRateWarning;
    }

    @Nullable
    public final Integer getHeartRateReasonableRangeHigh() {
        return this.heartRateReasonableRangeHigh;
    }

    @Nullable
    public final Integer getHeartRateReasonableRangeLow() {
        return this.heartRateReasonableRangeLow;
    }

    @Nullable
    public final String getHeartRateWarningLabel() {
        return this.heartRateWarningLabel;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    @Nullable
    public final Integer getSleepBreatheRangeHigh() {
        return this.sleepBreatheRangeHigh;
    }

    @Nullable
    public final Integer getSleepBreatheRangeLow() {
        return this.sleepBreatheRangeLow;
    }

    @Nullable
    public final Integer getSleepHeartRateRangeHigh() {
        return this.sleepHeartRateRangeHigh;
    }

    @Nullable
    public final Integer getSleepHeartRateRangeLow() {
        return this.sleepHeartRateRangeLow;
    }

    @Nullable
    public final Integer getSleepRecoveryDiffValue() {
        return this.sleepRecoveryDiffValue;
    }

    @Nullable
    public final Integer getSleepRecoveryRate() {
        return this.sleepRecoveryRate;
    }

    public final int getUpdated() {
        return this.updated;
    }

    public final void setAvgSleepSpo2(@Nullable Integer num) {
        this.avgSleepSpo2 = num;
    }

    public final void setBasalBreathe(@Nullable Integer num) {
        this.basalBreathe = num;
    }

    public final void setBasalSleepHeartRate(@Nullable Integer num) {
        this.basalSleepHeartRate = num;
    }

    public final void setBedtimeData(@Nullable List<BedtimeData> list) {
        this.bedtimeData = list;
    }

    public final void setBreatheReasonableRangeHigh(@Nullable Integer num) {
        this.breatheReasonableRangeHigh = num;
    }

    public final void setBreatheReasonableRangeLow(@Nullable Integer num) {
        this.breatheReasonableRangeLow = num;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceUniqueId(@Nullable String str) {
        this.deviceUniqueId = str;
    }

    public final void setHasHeartRateWarning(int i) {
        this.hasHeartRateWarning = i;
    }

    public final void setHeartRateReasonableRangeHigh(@Nullable Integer num) {
        this.heartRateReasonableRangeHigh = num;
    }

    public final void setHeartRateReasonableRangeLow(@Nullable Integer num) {
        this.heartRateReasonableRangeLow = num;
    }

    public final void setHeartRateWarningLabel(@Nullable String str) {
        this.heartRateWarningLabel = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setSleepBreatheRangeHigh(@Nullable Integer num) {
        this.sleepBreatheRangeHigh = num;
    }

    public final void setSleepBreatheRangeLow(@Nullable Integer num) {
        this.sleepBreatheRangeLow = num;
    }

    public final void setSleepHeartRateRangeHigh(@Nullable Integer num) {
        this.sleepHeartRateRangeHigh = num;
    }

    public final void setSleepHeartRateRangeLow(@Nullable Integer num) {
        this.sleepHeartRateRangeLow = num;
    }

    public final void setSleepRecoveryDiffValue(@Nullable Integer num) {
        this.sleepRecoveryDiffValue = num;
    }

    public final void setSleepRecoveryRate(@Nullable Integer num) {
        this.sleepRecoveryRate = num;
    }

    public final void setUpdated(int i) {
        this.updated = i;
    }

    @NotNull
    public String toString() {
        return "SleepIndexPOJO(date=" + this.date + ", deviceUniqueId=" + this.deviceUniqueId + ", avgSleepSpo2=" + this.avgSleepSpo2 + ", basalSleepHeartRate=" + this.basalSleepHeartRate + ", sleepHeartRateRangeLow=" + this.sleepHeartRateRangeLow + ", sleepHeartRateRangeHigh=" + this.sleepHeartRateRangeHigh + ", sleepBreatheRangeLow=" + this.sleepBreatheRangeLow + ", sleepBreatheRangeHigh=" + this.sleepBreatheRangeHigh + ", updated=" + this.updated + ", modifiedTimestamp=" + this.modifiedTimestamp + ", hasHeartRateWarning=" + this.hasHeartRateWarning + ", heartRateWarningLabel=" + this.heartRateWarningLabel + ", bedtimeData=" + this.bedtimeData + ", basalBreathe=" + this.basalBreathe + ", breatheReasonableRangeLow=" + this.breatheReasonableRangeLow + ", breatheReasonableRangeHigh=" + this.breatheReasonableRangeHigh + ", heartRateReasonableRangeLow=" + this.heartRateReasonableRangeLow + ", heartRateReasonableRangeHigh=" + this.heartRateReasonableRangeHigh + ", sleepRecoveryRate=" + this.sleepRecoveryRate + ", sleepRecoveryDiffValue=" + this.sleepRecoveryDiffValue + ")";
    }
}
