package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/menstrual/data/CycleSetting;", "", "periodDays", "", "cycleDays", "latestDay", "", "createTime", "modifiedTime", "(IIJJJ)V", "getCreateTime", "()J", "getCycleDays", "()I", "getLatestDay", "getModifiedTime", "getPeriodDays", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CycleSetting {
    private final long createTime;
    private final int cycleDays;
    private final long latestDay;
    private final long modifiedTime;
    private final int periodDays;

    public CycleSetting(int i, int i2, long j2, long j3, long j4) {
        this.periodDays = i;
        this.cycleDays = i2;
        this.latestDay = j2;
        this.createTime = j3;
        this.modifiedTime = j4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPeriodDays() {
        return this.periodDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCycleDays() {
        return this.cycleDays;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLatestDay() {
        return this.latestDay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    @NotNull
    public final CycleSetting copy(int periodDays, int cycleDays, long latestDay, long createTime, long modifiedTime) {
        return new CycleSetting(periodDays, cycleDays, latestDay, createTime, modifiedTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CycleSetting)) {
            return false;
        }
        CycleSetting cycleSetting = (CycleSetting) other;
        return this.periodDays == cycleSetting.periodDays && this.cycleDays == cycleSetting.cycleDays && this.latestDay == cycleSetting.latestDay && this.createTime == cycleSetting.createTime && this.modifiedTime == cycleSetting.modifiedTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getCycleDays() {
        return this.cycleDays;
    }

    public final long getLatestDay() {
        return this.latestDay;
    }

    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public final int getPeriodDays() {
        return this.periodDays;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.periodDays) * 31) + Integer.hashCode(this.cycleDays)) * 31) + Long.hashCode(this.latestDay)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.modifiedTime);
    }

    @NotNull
    public String toString() {
        return "CycleSetting(periodDays=" + this.periodDays + ", cycleDays=" + this.cycleDays + ", latestDay=" + this.latestDay + ", createTime=" + this.createTime + ", modifiedTime=" + this.modifiedTime + ")";
    }
}
