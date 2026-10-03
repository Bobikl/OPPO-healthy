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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/sports/recommend/bean/LastSport;", "", "date", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "duration", "avgHeartRate", "(IIII)V", "getAvgHeartRate", "()I", "setAvgHeartRate", "(I)V", "getDate", "setDate", "getDuration", "setDuration", "getSportMode", "setSportMode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LastSport {
    public static final int $stable = 8;
    private int avgHeartRate;
    private int date;
    private int duration;
    private int sportMode;

    public LastSport(int i, int i2, int i3, int i4) {
        this.date = i;
        this.sportMode = i2;
        this.duration = i3;
        this.avgHeartRate = i4;
    }

    public static /* synthetic */ LastSport copy$default(LastSport lastSport, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = lastSport.date;
        }
        if ((i5 & 2) != 0) {
            i2 = lastSport.sportMode;
        }
        if ((i5 & 4) != 0) {
            i3 = lastSport.duration;
        }
        if ((i5 & 8) != 0) {
            i4 = lastSport.avgHeartRate;
        }
        return lastSport.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
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
    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    @NotNull
    public final LastSport copy(int date, int sportMode, int duration, int avgHeartRate) {
        return new LastSport(date, sportMode, duration, avgHeartRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSport)) {
            return false;
        }
        LastSport lastSport = (LastSport) other;
        return this.date == lastSport.date && this.sportMode == lastSport.sportMode && this.duration == lastSport.duration && this.avgHeartRate == lastSport.avgHeartRate;
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.date) * 31) + Integer.hashCode(this.sportMode)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.avgHeartRate);
    }

    public final void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    @NotNull
    public String toString() {
        return "LastSport(date=" + this.date + ", sportMode=" + this.sportMode + ", duration=" + this.duration + ", avgHeartRate=" + this.avgHeartRate + ")";
    }
}
