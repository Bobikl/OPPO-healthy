package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/heytap/sports/record/details/bean/HistoryData;", "", "totalCalories", "", "weekHrZone", "", "", "weekAerobicCount", "weekRunDistance", "weekRunTime", "(JLjava/util/List;III)V", "getTotalCalories", "()J", "getWeekAerobicCount", "()I", "getWeekHrZone", "()Ljava/util/List;", "getWeekRunDistance", "getWeekRunTime", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HistoryData {
    public static final int $stable = 8;
    private final long totalCalories;
    private final int weekAerobicCount;

    @NotNull
    private final List<Integer> weekHrZone;
    private final int weekRunDistance;
    private final int weekRunTime;

    public HistoryData(long j2, @NotNull List<Integer> weekHrZone, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(weekHrZone, "weekHrZone");
        this.totalCalories = j2;
        this.weekHrZone = weekHrZone;
        this.weekAerobicCount = i;
        this.weekRunDistance = i2;
        this.weekRunTime = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryData copy$default(HistoryData historyData, long j2, List list, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j2 = historyData.totalCalories;
        }
        long j3 = j2;
        if ((i4 & 2) != 0) {
            list = historyData.weekHrZone;
        }
        List list2 = list;
        if ((i4 & 4) != 0) {
            i = historyData.weekAerobicCount;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = historyData.weekRunDistance;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = historyData.weekRunTime;
        }
        return historyData.copy(j3, list2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTotalCalories() {
        return this.totalCalories;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.weekHrZone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWeekAerobicCount() {
        return this.weekAerobicCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWeekRunDistance() {
        return this.weekRunDistance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWeekRunTime() {
        return this.weekRunTime;
    }

    @NotNull
    public final HistoryData copy(long totalCalories, @NotNull List<Integer> weekHrZone, int weekAerobicCount, int weekRunDistance, int weekRunTime) {
        Intrinsics.checkNotNullParameter(weekHrZone, "weekHrZone");
        return new HistoryData(totalCalories, weekHrZone, weekAerobicCount, weekRunDistance, weekRunTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryData)) {
            return false;
        }
        HistoryData historyData = (HistoryData) other;
        return this.totalCalories == historyData.totalCalories && Intrinsics.areEqual(this.weekHrZone, historyData.weekHrZone) && this.weekAerobicCount == historyData.weekAerobicCount && this.weekRunDistance == historyData.weekRunDistance && this.weekRunTime == historyData.weekRunTime;
    }

    public final long getTotalCalories() {
        return this.totalCalories;
    }

    public final int getWeekAerobicCount() {
        return this.weekAerobicCount;
    }

    @NotNull
    public final List<Integer> getWeekHrZone() {
        return this.weekHrZone;
    }

    public final int getWeekRunDistance() {
        return this.weekRunDistance;
    }

    public final int getWeekRunTime() {
        return this.weekRunTime;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.totalCalories) * 31) + this.weekHrZone.hashCode()) * 31) + Integer.hashCode(this.weekAerobicCount)) * 31) + Integer.hashCode(this.weekRunDistance)) * 31) + Integer.hashCode(this.weekRunTime);
    }

    @NotNull
    public String toString() {
        return "HistoryData(totalCalories=" + this.totalCalories + ", weekHrZone=" + this.weekHrZone + ", weekAerobicCount=" + this.weekAerobicCount + ", weekRunDistance=" + this.weekRunDistance + ", weekRunTime=" + this.weekRunTime + ")";
    }
}
