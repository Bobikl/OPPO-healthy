package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.t04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u00100\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010*\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u0011R\u001e\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b.\u0010&\"\u0004\b/\u0010(¨\u00061"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/HeartRateStatPOJO;", "", "()V", "averageHeartRate", "", "getAverageHeartRate", "()I", "setAverageHeartRate", "(I)V", "date", "getDate", "setDate", t04.DEVICE_UNIQUE_ID, "", "getDeviceUniqueId", "()Ljava/lang/String;", "setDeviceUniqueId", "(Ljava/lang/String;)V", "maxHeartRate", "getMaxHeartRate", "setMaxHeartRate", "metadata", "getMetadata", "setMetadata", "minHeartRate", "getMinHeartRate", "setMinHeartRate", "modifiedTimestamp", "", "getModifiedTimestamp", "()J", "setModifiedTimestamp", "(J)V", "restHeartRate", "getRestHeartRate", "setRestHeartRate", "sleepBaseAvgHeartRate", "getSleepBaseAvgHeartRate", "()Ljava/lang/Integer;", "setSleepBaseAvgHeartRate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "timezone", "getTimezone", "setTimezone", "walkingAvgHeartRate", "getWalkingAvgHeartRate", "setWalkingAvgHeartRate", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HeartRateStatPOJO {
    private int averageHeartRate;
    private int date = 20190101;

    @Nullable
    private String deviceUniqueId;
    private int maxHeartRate;

    @Nullable
    private String metadata;
    private int minHeartRate;
    private long modifiedTimestamp;
    private int restHeartRate;

    @Nullable
    private Integer sleepBaseAvgHeartRate;

    @Nullable
    private String timezone;

    @Nullable
    private Integer walkingAvgHeartRate;

    public final int getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public final int getDate() {
        return this.date;
    }

    @Nullable
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    public final int getMinHeartRate() {
        return this.minHeartRate;
    }

    public final long getModifiedTimestamp() {
        return this.modifiedTimestamp;
    }

    public final int getRestHeartRate() {
        return this.restHeartRate;
    }

    @Nullable
    public final Integer getSleepBaseAvgHeartRate() {
        return this.sleepBaseAvgHeartRate;
    }

    @Nullable
    public final String getTimezone() {
        return this.timezone;
    }

    @Nullable
    public final Integer getWalkingAvgHeartRate() {
        return this.walkingAvgHeartRate;
    }

    public final void setAverageHeartRate(int i) {
        this.averageHeartRate = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceUniqueId(@Nullable String str) {
        this.deviceUniqueId = str;
    }

    public final void setMaxHeartRate(int i) {
        this.maxHeartRate = i;
    }

    public final void setMetadata(@Nullable String str) {
        this.metadata = str;
    }

    public final void setMinHeartRate(int i) {
        this.minHeartRate = i;
    }

    public final void setModifiedTimestamp(long j2) {
        this.modifiedTimestamp = j2;
    }

    public final void setRestHeartRate(int i) {
        this.restHeartRate = i;
    }

    public final void setSleepBaseAvgHeartRate(@Nullable Integer num) {
        this.sleepBaseAvgHeartRate = num;
    }

    public final void setTimezone(@Nullable String str) {
        this.timezone = str;
    }

    public final void setWalkingAvgHeartRate(@Nullable Integer num) {
        this.walkingAvgHeartRate = num;
    }

    @NotNull
    public String toString() {
        return "HeartRateStatPOJO(deviceUniqueId=" + this.deviceUniqueId + ", date=" + this.date + ", maxHeartRate=" + this.maxHeartRate + ", minHeartRate=" + this.minHeartRate + ", averageHeartRate=" + this.averageHeartRate + ", restHeartRate=" + this.restHeartRate + ", metadata=" + this.metadata + ", timezone=" + this.timezone + ", sleepBaseAvgHeartRate=" + this.sleepBaseAvgHeartRate + ", walkingAvgHeartRate=" + this.walkingAvgHeartRate + ", modifiedTimestamp=" + this.modifiedTimestamp + ")";
    }
}
