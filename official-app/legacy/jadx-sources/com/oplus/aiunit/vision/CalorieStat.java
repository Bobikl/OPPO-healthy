package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.mu2, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\n\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014\"\u0004\b\u001b\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/mu2;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "timestamp", "b", "I", "c", "()I", "setTotalValidDays", "(I)V", "totalValidDays", "setAverageCalorie", "averageCalorie", "d", "setReachGoalDays", "reachGoalDays", "<init>", "(JIII)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CalorieStat {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int totalValidDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int averageCalorie;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int reachGoalDays;

    public CalorieStat() {
        this(0L, 0, 0, 0, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAverageCalorie() {
        return this.averageCalorie;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getReachGoalDays() {
        return this.reachGoalDays;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTotalValidDays() {
        return this.totalValidDays;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalorieStat)) {
            return false;
        }
        CalorieStat calorieStat = (CalorieStat) other;
        return this.timestamp == calorieStat.timestamp && this.totalValidDays == calorieStat.totalValidDays && this.averageCalorie == calorieStat.averageCalorie && this.reachGoalDays == calorieStat.reachGoalDays;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.timestamp) * 31) + Integer.hashCode(this.totalValidDays)) * 31) + Integer.hashCode(this.averageCalorie)) * 31) + Integer.hashCode(this.reachGoalDays);
    }

    @NotNull
    public String toString() {
        return "CalorieStat(timestamp=" + this.timestamp + ", totalValidDays=" + this.totalValidDays + ", averageCalorie=" + this.averageCalorie + ", reachGoalDays=" + this.reachGoalDays + ")";
    }

    public CalorieStat(long j2, int i, int i2, int i3) {
        this.timestamp = j2;
        this.totalValidDays = i;
        this.averageCalorie = i2;
        this.reachGoalDays = i3;
    }

    public /* synthetic */ CalorieStat(long j2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j2, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
