package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayFrgData;
import com.heytap.databaseengine.model.sleepdaystat.SleepMainData;
import com.oplus.aiunit.vision.t04;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010U\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001b\"\u0004\b#\u0010\u001dR\u001a\u0010$\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR \u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR\u001c\u00101\u001a\u0004\u0018\u000102X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u001a\u0010:\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000eR\u001c\u0010=\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010\u0017R\u001a\u0010@\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000eR\u001a\u0010C\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\f\"\u0004\bE\u0010\u000eR\u001a\u0010F\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u001a\u0010I\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR\u001a\u0010L\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR\u001a\u0010O\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\f\"\u0004\bQ\u0010\u000eR\u001a\u0010R\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\f\"\u0004\bT\u0010\u000e¨\u0006V"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SleepDayStatPOJO;", "", "()V", "calibration", "", "getCalibration", "()Z", "setCalibration", "(Z)V", "dataVersion", "", "getDataVersion", "()I", "setDataVersion", "(I)V", "date", "getDate", "setDate", t04.DEVICE_UNIQUE_ID, "", "getDeviceUniqueId", "()Ljava/lang/String;", "setDeviceUniqueId", "(Ljava/lang/String;)V", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "restInTime", "getRestInTime", "setRestInTime", "restOutTime", "getRestOutTime", "setRestOutTime", "score", "getScore", "setScore", "sleepDayFrgDataList", "", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayFrgData;", "getSleepDayFrgDataList", "()Ljava/util/List;", "setSleepDayFrgDataList", "(Ljava/util/List;)V", "sleepInTime", "getSleepInTime", "setSleepInTime", "sleepMainData", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "getSleepMainData", "()Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;", "setSleepMainData", "(Lcom/heytap/databaseengine/model/sleepdaystat/SleepMainData;)V", "sleepOutTime", "getSleepOutTime", "setSleepOutTime", "source", "getSource", "setSource", "ssoid", "getSsoid", "setSsoid", "standardTime", "getStandardTime", "setStandardTime", "totalDeepSleepTime", "getTotalDeepSleepTime", "setTotalDeepSleepTime", "totalLightlySleepTime", "getTotalLightlySleepTime", "setTotalLightlySleepTime", "totalREMSleepTime", "getTotalREMSleepTime", "setTotalREMSleepTime", "totalSleepTime", "getTotalSleepTime", "setTotalSleepTime", "totalWakeTime", "getTotalWakeTime", "setTotalWakeTime", "wakeCount", "getWakeCount", "setWakeCount", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepDayStatPOJO {
    private int dataVersion;
    private int date;
    private long modifiedTimestamp;
    private long restInTime;
    private long restOutTime;
    private int score;
    private long sleepInTime;

    @Nullable
    private SleepMainData sleepMainData;
    private long sleepOutTime;
    private int source;

    @Nullable
    private String ssoid;
    private int standardTime;
    private int totalDeepSleepTime;
    private int totalLightlySleepTime;
    private int totalREMSleepTime;
    private int totalSleepTime;
    private int totalWakeTime;
    private int wakeCount;

    @Nullable
    private String deviceUniqueId = "";
    private boolean calibration = true;

    @NotNull
    private List<SleepDayFrgData> sleepDayFrgDataList = new ArrayList();

    public final boolean getCalibration() {
        return this.calibration;
    }

    public final int getDataVersion() {
        return this.dataVersion;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getRestInTime() {
        return this.restInTime;
    }

    public final long getRestOutTime() {
        return this.restOutTime;
    }

    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final List<SleepDayFrgData> getSleepDayFrgDataList() {
        return this.sleepDayFrgDataList;
    }

    public final long getSleepInTime() {
        return this.sleepInTime;
    }

    @Nullable
    public final SleepMainData getSleepMainData() {
        return this.sleepMainData;
    }

    public final long getSleepOutTime() {
        return this.sleepOutTime;
    }

    public final int getSource() {
        return this.source;
    }

    @Nullable
    public final String getSsoid() {
        return this.ssoid;
    }

    public final int getStandardTime() {
        return this.standardTime;
    }

    public final int getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    public final int getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    public final int getTotalREMSleepTime() {
        return this.totalREMSleepTime;
    }

    public final int getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public final int getTotalWakeTime() {
        return this.totalWakeTime;
    }

    public final int getWakeCount() {
        return this.wakeCount;
    }

    public final void setCalibration(boolean z) {
        this.calibration = z;
    }

    public final void setDataVersion(int i) {
        this.dataVersion = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceUniqueId(@Nullable String str) {
        this.deviceUniqueId = str;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setRestInTime(long j2) {
        this.restInTime = j2;
    }

    public final void setRestOutTime(long j2) {
        this.restOutTime = j2;
    }

    public final void setScore(int i) {
        this.score = i;
    }

    public final void setSleepDayFrgDataList(@NotNull List<SleepDayFrgData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sleepDayFrgDataList = list;
    }

    public final void setSleepInTime(long j2) {
        this.sleepInTime = j2;
    }

    public final void setSleepMainData(@Nullable SleepMainData sleepMainData) {
        this.sleepMainData = sleepMainData;
    }

    public final void setSleepOutTime(long j2) {
        this.sleepOutTime = j2;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public final void setSsoid(@Nullable String str) {
        this.ssoid = str;
    }

    public final void setStandardTime(int i) {
        this.standardTime = i;
    }

    public final void setTotalDeepSleepTime(int i) {
        this.totalDeepSleepTime = i;
    }

    public final void setTotalLightlySleepTime(int i) {
        this.totalLightlySleepTime = i;
    }

    public final void setTotalREMSleepTime(int i) {
        this.totalREMSleepTime = i;
    }

    public final void setTotalSleepTime(int i) {
        this.totalSleepTime = i;
    }

    public final void setTotalWakeTime(int i) {
        this.totalWakeTime = i;
    }

    public final void setWakeCount(int i) {
        this.wakeCount = i;
    }

    @NotNull
    public String toString() {
        return "SleepDayStatPOJO(ssoid=" + this.ssoid + ", deviceUniqueId=" + this.deviceUniqueId + ", date=" + this.date + ", sleepInTime=" + this.sleepInTime + ", sleepOutTime=" + this.sleepOutTime + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalREMSleepTime=" + this.totalREMSleepTime + ", totalWakeTime=" + this.totalWakeTime + ", wakeCount=" + this.wakeCount + ", score=" + this.score + ", sleepMainData=" + this.sleepMainData + ", sleepDayFrgDataList=" + this.sleepDayFrgDataList + ", dataVersion=" + this.dataVersion + ", source=" + this.source + ", standardTime=" + this.standardTime + ", restInTime=" + this.restInTime + ", restOutTime=" + this.restOutTime + ", calibration=" + this.calibration + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
