package com.heytap.sports.record.list.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006)"}, d2 = {"Lcom/heytap/sports/record/list/bean/RecordStatisticsBean;", "Ljava/io/Serializable;", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "totalDistance", "", "totalDuration", "longestDistance", "fastAvgPace", "maxDuration", "(IJJJJJ)V", "getFastAvgPace", "()J", "setFastAvgPace", "(J)V", "getLongestDistance", "setLongestDistance", "getMaxDuration", "setMaxDuration", "getSportMode", "()I", "setSportMode", "(I)V", "getTotalDistance", "setTotalDistance", "getTotalDuration", "setTotalDuration", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RecordStatisticsBean implements Serializable {
    public static final int $stable = 8;
    private long fastAvgPace;
    private long longestDistance;
    private long maxDuration;
    private int sportMode;
    private long totalDistance;
    private long totalDuration;

    public RecordStatisticsBean() {
        this(0, 0L, 0L, 0L, 0L, 0L, 63, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTotalDuration() {
        return this.totalDuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLongestDistance() {
        return this.longestDistance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getFastAvgPace() {
        return this.fastAvgPace;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getMaxDuration() {
        return this.maxDuration;
    }

    @NotNull
    public final RecordStatisticsBean copy(int sportMode, long totalDistance, long totalDuration, long longestDistance, long fastAvgPace, long maxDuration) {
        return new RecordStatisticsBean(sportMode, totalDistance, totalDuration, longestDistance, fastAvgPace, maxDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordStatisticsBean)) {
            return false;
        }
        RecordStatisticsBean recordStatisticsBean = (RecordStatisticsBean) other;
        return this.sportMode == recordStatisticsBean.sportMode && this.totalDistance == recordStatisticsBean.totalDistance && this.totalDuration == recordStatisticsBean.totalDuration && this.longestDistance == recordStatisticsBean.longestDistance && this.fastAvgPace == recordStatisticsBean.fastAvgPace && this.maxDuration == recordStatisticsBean.maxDuration;
    }

    public final long getFastAvgPace() {
        return this.fastAvgPace;
    }

    public final long getLongestDistance() {
        return this.longestDistance;
    }

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    public final long getTotalDistance() {
        return this.totalDistance;
    }

    public final long getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.sportMode) * 31) + Long.hashCode(this.totalDistance)) * 31) + Long.hashCode(this.totalDuration)) * 31) + Long.hashCode(this.longestDistance)) * 31) + Long.hashCode(this.fastAvgPace)) * 31) + Long.hashCode(this.maxDuration);
    }

    public final void setFastAvgPace(long j2) {
        this.fastAvgPace = j2;
    }

    public final void setLongestDistance(long j2) {
        this.longestDistance = j2;
    }

    public final void setMaxDuration(long j2) {
        this.maxDuration = j2;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    public final void setTotalDistance(long j2) {
        this.totalDistance = j2;
    }

    public final void setTotalDuration(long j2) {
        this.totalDuration = j2;
    }

    @NotNull
    public String toString() {
        return "RecordStatisticsBean(sportMode=" + this.sportMode + ", totalDistance=" + this.totalDistance + ", totalDuration=" + this.totalDuration + ", longestDistance=" + this.longestDistance + ", fastAvgPace=" + this.fastAvgPace + ", maxDuration=" + this.maxDuration + ")";
    }

    public RecordStatisticsBean(int i, long j2, long j3, long j4, long j5, long j6) {
        this.sportMode = i;
        this.totalDistance = j2;
        this.totalDuration = j3;
        this.longestDistance = j4;
        this.fastAvgPace = j5;
        this.maxDuration = j6;
    }

    public /* synthetic */ RecordStatisticsBean(int i, long j2, long j3, long j4, long j5, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? 0L : j3, (i2 & 8) != 0 ? 0L : j4, (i2 & 16) != 0 ? 0L : j5, (i2 & 32) == 0 ? j6 : 0L);
    }
}
