package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020\fH\u0016R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0014\u0010!\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014R\u0014\u0010#\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u0014\u0010%\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\u0014\u0010)\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\n¨\u0006,"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/SleepStatPOJO;", "", "()V", "checkedSleepScore", "", "getCheckedSleepScore", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "date", "getDate", "()I", t04.DEVICE_UNIQUE_ID, "", "getDeviceUniqueId", "()Ljava/lang/String;", "display", "getDisplay", "fallAsleep", "", "getFallAsleep", "()J", "metadata", "getMetadata", "modifiedTimestamp", "getModifiedTimestamp", "sleepOut", "getSleepOut", "sleepScore", "getSleepScore", "timezone", "getTimezone", "totalDeepSleepTime", "getTotalDeepSleepTime", "totalLightlySleepTime", "getTotalLightlySleepTime", "totalRemTime", "getTotalRemTime", "totalSleepTime", "getTotalSleepTime", "totalWakeUpTime", "getTotalWakeUpTime", "updated", "getUpdated", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SleepStatPOJO {

    @Nullable
    private final Integer checkedSleepScore;
    private final int date;

    @NotNull
    private final String deviceUniqueId = "";
    private final int display;
    private final long fallAsleep;

    @Nullable
    private final String metadata;
    private final long modifiedTimestamp;
    private final long sleepOut;

    @Nullable
    private final Integer sleepScore;

    @Nullable
    private final String timezone;
    private final long totalDeepSleepTime;
    private final long totalLightlySleepTime;
    private final long totalRemTime;
    private final long totalSleepTime;
    private final long totalWakeUpTime;
    private final int updated;

    @Nullable
    public final Integer getCheckedSleepScore() {
        return this.checkedSleepScore;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final long getFallAsleep() {
        return this.fallAsleep;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final long getSleepOut() {
        return this.sleepOut;
    }

    @Nullable
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    public final String getTimezone() {
        return this.timezone;
    }

    public final long getTotalDeepSleepTime() {
        return this.totalDeepSleepTime;
    }

    public final long getTotalLightlySleepTime() {
        return this.totalLightlySleepTime;
    }

    public final long getTotalRemTime() {
        return this.totalRemTime;
    }

    public final long getTotalSleepTime() {
        return this.totalSleepTime;
    }

    public final long getTotalWakeUpTime() {
        return this.totalWakeUpTime;
    }

    public final int getUpdated() {
        return this.updated;
    }

    @NotNull
    public String toString() {
        return "SleepStatPOJO(deviceUniqueId='" + this.deviceUniqueId + "', date=" + this.date + ", timezone=" + this.timezone + ", fallAsleep=" + this.fallAsleep + ", sleepOut=" + this.sleepOut + ", totalSleepTime=" + this.totalSleepTime + ", totalDeepSleepTime=" + this.totalDeepSleepTime + ", totalLightlySleepTime=" + this.totalLightlySleepTime + ", totalRemTime=" + this.totalRemTime + ", totalWakeUpTime=" + this.totalWakeUpTime + ", sleepScore=" + this.sleepScore + ", checkedSleepScore=" + this.checkedSleepScore + ", metadata=" + this.metadata + ", modifiedTimestamp=" + this.modifiedTimestamp + ", updated=" + this.updated + ", display=" + this.display + ")";
    }
}
