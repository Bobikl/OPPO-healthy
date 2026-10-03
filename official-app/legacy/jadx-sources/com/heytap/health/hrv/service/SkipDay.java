package com.heytap.health.hrv.service;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/hrv/service/SkipDay;", "", "date", "", "todaySkipReason", "(II)V", "getDate", "()I", "getTodaySkipReason", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "hrv_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SkipDay {
    public static final int $stable = 0;

    @SerializedName("date")
    private final int date;

    @SerializedName("todaySkipReason")
    private final int todaySkipReason;

    public SkipDay(int i, int i2) {
        this.date = i;
        this.todaySkipReason = i2;
    }

    public static /* synthetic */ SkipDay copy$default(SkipDay skipDay, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = skipDay.date;
        }
        if ((i3 & 2) != 0) {
            i2 = skipDay.todaySkipReason;
        }
        return skipDay.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTodaySkipReason() {
        return this.todaySkipReason;
    }

    @NotNull
    public final SkipDay copy(int date, int todaySkipReason) {
        return new SkipDay(date, todaySkipReason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkipDay)) {
            return false;
        }
        SkipDay skipDay = (SkipDay) other;
        return this.date == skipDay.date && this.todaySkipReason == skipDay.todaySkipReason;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getTodaySkipReason() {
        return this.todaySkipReason;
    }

    public int hashCode() {
        return (Integer.hashCode(this.date) * 31) + Integer.hashCode(this.todaySkipReason);
    }

    @NotNull
    public String toString() {
        return "SkipDay(date=" + this.date + ", todaySkipReason=" + this.todaySkipReason + ")";
    }
}
