package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006*"}, d2 = {"Lcom/heytap/health/menstrual/data/MenstrualCyclePredictiveItemBean;", "", "cycleStartDate", "", "cycleEndDate", "periodStartDate", "periodEndDate", "ovulationStartDate", "ovulationEndDate", "ovulationDay", "(JJJJJJJ)V", "getCycleEndDate", "()J", "setCycleEndDate", "(J)V", "getCycleStartDate", "setCycleStartDate", "getOvulationDay", "setOvulationDay", "getOvulationEndDate", "setOvulationEndDate", "getOvulationStartDate", "setOvulationStartDate", "getPeriodEndDate", "setPeriodEndDate", "getPeriodStartDate", "setPeriodStartDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MenstrualCyclePredictiveItemBean {
    private long cycleEndDate;
    private long cycleStartDate;
    private long ovulationDay;
    private long ovulationEndDate;
    private long ovulationStartDate;
    private long periodEndDate;
    private long periodStartDate;

    public MenstrualCyclePredictiveItemBean() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCycleStartDate() {
        return this.cycleStartDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCycleEndDate() {
        return this.cycleEndDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPeriodStartDate() {
        return this.periodStartDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPeriodEndDate() {
        return this.periodEndDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getOvulationStartDate() {
        return this.ovulationStartDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getOvulationEndDate() {
        return this.ovulationEndDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getOvulationDay() {
        return this.ovulationDay;
    }

    @NotNull
    public final MenstrualCyclePredictiveItemBean copy(long cycleStartDate, long cycleEndDate, long periodStartDate, long periodEndDate, long ovulationStartDate, long ovulationEndDate, long ovulationDay) {
        return new MenstrualCyclePredictiveItemBean(cycleStartDate, cycleEndDate, periodStartDate, periodEndDate, ovulationStartDate, ovulationEndDate, ovulationDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualCyclePredictiveItemBean)) {
            return false;
        }
        MenstrualCyclePredictiveItemBean menstrualCyclePredictiveItemBean = (MenstrualCyclePredictiveItemBean) other;
        return this.cycleStartDate == menstrualCyclePredictiveItemBean.cycleStartDate && this.cycleEndDate == menstrualCyclePredictiveItemBean.cycleEndDate && this.periodStartDate == menstrualCyclePredictiveItemBean.periodStartDate && this.periodEndDate == menstrualCyclePredictiveItemBean.periodEndDate && this.ovulationStartDate == menstrualCyclePredictiveItemBean.ovulationStartDate && this.ovulationEndDate == menstrualCyclePredictiveItemBean.ovulationEndDate && this.ovulationDay == menstrualCyclePredictiveItemBean.ovulationDay;
    }

    public final long getCycleEndDate() {
        return this.cycleEndDate;
    }

    public final long getCycleStartDate() {
        return this.cycleStartDate;
    }

    public final long getOvulationDay() {
        return this.ovulationDay;
    }

    public final long getOvulationEndDate() {
        return this.ovulationEndDate;
    }

    public final long getOvulationStartDate() {
        return this.ovulationStartDate;
    }

    public final long getPeriodEndDate() {
        return this.periodEndDate;
    }

    public final long getPeriodStartDate() {
        return this.periodStartDate;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.cycleStartDate) * 31) + Long.hashCode(this.cycleEndDate)) * 31) + Long.hashCode(this.periodStartDate)) * 31) + Long.hashCode(this.periodEndDate)) * 31) + Long.hashCode(this.ovulationStartDate)) * 31) + Long.hashCode(this.ovulationEndDate)) * 31) + Long.hashCode(this.ovulationDay);
    }

    public final void setCycleEndDate(long j2) {
        this.cycleEndDate = j2;
    }

    public final void setCycleStartDate(long j2) {
        this.cycleStartDate = j2;
    }

    public final void setOvulationDay(long j2) {
        this.ovulationDay = j2;
    }

    public final void setOvulationEndDate(long j2) {
        this.ovulationEndDate = j2;
    }

    public final void setOvulationStartDate(long j2) {
        this.ovulationStartDate = j2;
    }

    public final void setPeriodEndDate(long j2) {
        this.periodEndDate = j2;
    }

    public final void setPeriodStartDate(long j2) {
        this.periodStartDate = j2;
    }

    @NotNull
    public String toString() {
        return "MenstrualCyclePredictiveItemBean(cycleStartDate=" + this.cycleStartDate + ", cycleEndDate=" + this.cycleEndDate + ", periodStartDate=" + this.periodStartDate + ", periodEndDate=" + this.periodEndDate + ", ovulationStartDate=" + this.ovulationStartDate + ", ovulationEndDate=" + this.ovulationEndDate + ", ovulationDay=" + this.ovulationDay + ")";
    }

    public MenstrualCyclePredictiveItemBean(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.cycleStartDate = j2;
        this.cycleEndDate = j3;
        this.periodStartDate = j4;
        this.periodEndDate = j5;
        this.ovulationStartDate = j6;
        this.ovulationEndDate = j7;
        this.ovulationDay = j8;
    }

    public /* synthetic */ MenstrualCyclePredictiveItemBean(long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? 0L : j3, (i & 4) != 0 ? 0L : j4, (i & 8) != 0 ? 0L : j5, (i & 16) != 0 ? 0L : j6, (i & 32) != 0 ? 0L : j7, (i & 64) == 0 ? j8 : 0L);
    }
}
