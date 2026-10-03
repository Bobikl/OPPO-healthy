package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.h69, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\n\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/h69;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "b", "()J", "timestamp", "I", "c", "()I", "totalValidDays", "avgHeartRate", "<init>", "(JII)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HeartRateStat {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int totalValidDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int avgHeartRate;

    public HeartRateStat(long j2, int i, int i2) {
        this.timestamp = j2;
        this.totalValidDays = i;
        this.avgHeartRate = i2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTotalValidDays() {
        return this.totalValidDays;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateStat)) {
            return false;
        }
        HeartRateStat heartRateStat = (HeartRateStat) other;
        return this.timestamp == heartRateStat.timestamp && this.totalValidDays == heartRateStat.totalValidDays && this.avgHeartRate == heartRateStat.avgHeartRate;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.totalValidDays)) * 31) + Integer.hashCode(this.avgHeartRate);
    }

    @NotNull
    public String toString() {
        return "HeartRateStat(timestamp=" + this.timestamp + ", totalValidDays=" + this.totalValidDays + ", avgHeartRate=" + this.avgHeartRate + ")";
    }
}
