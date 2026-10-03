package com.heytap.health.cardiovascular.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/cardiovascular/model/TimeToIntValueInfoWithBaseLine;", "", ClickApiEntity.TIME, "", "value", "lowLine", "highLine", "(IIII)V", "getHighLine", "()I", "getLowLine", "getTime", "getValue", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TimeToIntValueInfoWithBaseLine {
    public static final int $stable = 0;
    private final int highLine;
    private final int lowLine;
    private final int time;
    private final int value;

    public TimeToIntValueInfoWithBaseLine(int i, int i2, int i3, int i4) {
        this.time = i;
        this.value = i2;
        this.lowLine = i3;
        this.highLine = i4;
    }

    public static /* synthetic */ TimeToIntValueInfoWithBaseLine copy$default(TimeToIntValueInfoWithBaseLine timeToIntValueInfoWithBaseLine, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = timeToIntValueInfoWithBaseLine.time;
        }
        if ((i5 & 2) != 0) {
            i2 = timeToIntValueInfoWithBaseLine.value;
        }
        if ((i5 & 4) != 0) {
            i3 = timeToIntValueInfoWithBaseLine.lowLine;
        }
        if ((i5 & 8) != 0) {
            i4 = timeToIntValueInfoWithBaseLine.highLine;
        }
        return timeToIntValueInfoWithBaseLine.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLowLine() {
        return this.lowLine;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHighLine() {
        return this.highLine;
    }

    @NotNull
    public final TimeToIntValueInfoWithBaseLine copy(int time, int value, int lowLine, int highLine) {
        return new TimeToIntValueInfoWithBaseLine(time, value, lowLine, highLine);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeToIntValueInfoWithBaseLine)) {
            return false;
        }
        TimeToIntValueInfoWithBaseLine timeToIntValueInfoWithBaseLine = (TimeToIntValueInfoWithBaseLine) other;
        return this.time == timeToIntValueInfoWithBaseLine.time && this.value == timeToIntValueInfoWithBaseLine.value && this.lowLine == timeToIntValueInfoWithBaseLine.lowLine && this.highLine == timeToIntValueInfoWithBaseLine.highLine;
    }

    public final int getHighLine() {
        return this.highLine;
    }

    public final int getLowLine() {
        return this.lowLine;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.time) * 31) + Integer.hashCode(this.value)) * 31) + Integer.hashCode(this.lowLine)) * 31) + Integer.hashCode(this.highLine);
    }

    @NotNull
    public String toString() {
        return "TimeToIntValueInfoWithBaseLine(time=" + this.time + ", value=" + this.value + ", lowLine=" + this.lowLine + ", highLine=" + this.highLine + ")";
    }
}
