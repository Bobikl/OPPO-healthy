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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cardiovascular/model/TimeToIntValueInfo;", "", ClickApiEntity.TIME, "", "value", "(II)V", "getTime", "()I", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cardiovascular_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TimeToIntValueInfo {
    public static final int $stable = 0;
    private final int time;
    private final int value;

    public TimeToIntValueInfo(int i, int i2) {
        this.time = i;
        this.value = i2;
    }

    public static /* synthetic */ TimeToIntValueInfo copy$default(TimeToIntValueInfo timeToIntValueInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = timeToIntValueInfo.time;
        }
        if ((i3 & 2) != 0) {
            i2 = timeToIntValueInfo.value;
        }
        return timeToIntValueInfo.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final TimeToIntValueInfo copy(int time, int value) {
        return new TimeToIntValueInfo(time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeToIntValueInfo)) {
            return false;
        }
        TimeToIntValueInfo timeToIntValueInfo = (TimeToIntValueInfo) other;
        return this.time == timeToIntValueInfo.time && this.value == timeToIntValueInfo.value;
    }

    public final int getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Integer.hashCode(this.time) * 31) + Integer.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "TimeToIntValueInfo(time=" + this.time + ", value=" + this.value + ")";
    }
}
