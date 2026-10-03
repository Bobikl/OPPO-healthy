package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/heytap/sports/recommend/bean/TodaySport;", "", "startTime", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "duration", "durationSecond", "avgHeartRate", "totalCalories", "", "(IIIIIJ)V", "getAvgHeartRate", "()I", "setAvgHeartRate", "(I)V", "getDuration", "setDuration", "getDurationSecond", "setDurationSecond", "getSportMode", "setSportMode", "getStartTime", "getTotalCalories", "()J", "setTotalCalories", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TodaySport {
    public static final int $stable = 8;
    private int avgHeartRate;
    private int duration;
    private int durationSecond;
    private int sportMode;
    private final int startTime;
    private long totalCalories;

    public TodaySport(int i, int i2, int i3, int i4, int i5, long j2) {
        this.startTime = i;
        this.sportMode = i2;
        this.duration = i3;
        this.durationSecond = i4;
        this.avgHeartRate = i5;
        this.totalCalories = j2;
    }

    public static /* synthetic */ TodaySport copy$default(TodaySport todaySport, int i, int i2, int i3, int i4, int i5, long j2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = todaySport.startTime;
        }
        if ((i6 & 2) != 0) {
            i2 = todaySport.sportMode;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = todaySport.duration;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = todaySport.durationSecond;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = todaySport.avgHeartRate;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            j2 = todaySport.totalCalories;
        }
        return todaySport.copy(i, i7, i8, i9, i10, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDurationSecond() {
        return this.durationSecond;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTotalCalories() {
        return this.totalCalories;
    }

    @NotNull
    public final TodaySport copy(int startTime, int sportMode, int duration, int durationSecond, int avgHeartRate, long totalCalories) {
        return new TodaySport(startTime, sportMode, duration, durationSecond, avgHeartRate, totalCalories);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodaySport)) {
            return false;
        }
        TodaySport todaySport = (TodaySport) other;
        return this.startTime == todaySport.startTime && this.sportMode == todaySport.sportMode && this.duration == todaySport.duration && this.durationSecond == todaySport.durationSecond && this.avgHeartRate == todaySport.avgHeartRate && this.totalCalories == todaySport.totalCalories;
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getDurationSecond() {
        return this.durationSecond;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final long getTotalCalories() {
        return this.totalCalories;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.startTime) * 31) + Integer.hashCode(this.sportMode)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.durationSecond)) * 31) + Integer.hashCode(this.avgHeartRate)) * 31) + Long.hashCode(this.totalCalories);
    }

    public final void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setDurationSecond(int i) {
        this.durationSecond = i;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    public final void setTotalCalories(long j2) {
        this.totalCalories = j2;
    }

    @NotNull
    public String toString() {
        return "TodaySport(startTime=" + this.startTime + ", sportMode=" + this.sportMode + ", duration=" + this.duration + ", durationSecond=" + this.durationSecond + ", avgHeartRate=" + this.avgHeartRate + ", totalCalories=" + this.totalCalories + ")";
    }
}
