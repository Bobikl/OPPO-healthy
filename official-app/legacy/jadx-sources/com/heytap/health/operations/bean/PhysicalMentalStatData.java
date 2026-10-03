package com.heytap.health.operations.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/heytap/health/operations/bean/PhysicalMentalStatData;", "", "date", "", "avg", "type", "max", "min", "compareLastDay", "(IIIIII)V", "getAvg", "()I", "setAvg", "(I)V", "getCompareLastDay", "setCompareLastDay", "getDate", "setDate", "getMax", "setMax", "getMin", "setMin", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PhysicalMentalStatData {
    private int avg;
    private int compareLastDay;
    private int date;
    private int max;
    private int min;
    private int type;

    public PhysicalMentalStatData() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    public static /* synthetic */ PhysicalMentalStatData copy$default(PhysicalMentalStatData physicalMentalStatData, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = physicalMentalStatData.date;
        }
        if ((i7 & 2) != 0) {
            i2 = physicalMentalStatData.avg;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = physicalMentalStatData.type;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = physicalMentalStatData.max;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = physicalMentalStatData.min;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = physicalMentalStatData.compareLastDay;
        }
        return physicalMentalStatData.copy(i, i8, i9, i10, i11, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getCompareLastDay() {
        return this.compareLastDay;
    }

    @NotNull
    public final PhysicalMentalStatData copy(int date, int avg, int type, int max, int min, int compareLastDay) {
        return new PhysicalMentalStatData(date, avg, type, max, min, compareLastDay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhysicalMentalStatData)) {
            return false;
        }
        PhysicalMentalStatData physicalMentalStatData = (PhysicalMentalStatData) other;
        return this.date == physicalMentalStatData.date && this.avg == physicalMentalStatData.avg && this.type == physicalMentalStatData.type && this.max == physicalMentalStatData.max && this.min == physicalMentalStatData.min && this.compareLastDay == physicalMentalStatData.compareLastDay;
    }

    public final int getAvg() {
        return this.avg;
    }

    public final int getCompareLastDay() {
        return this.compareLastDay;
    }

    public final int getDate() {
        return this.date;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.date) * 31) + Integer.hashCode(this.avg)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.compareLastDay);
    }

    public final void setAvg(int i) {
        this.avg = i;
    }

    public final void setCompareLastDay(int i) {
        this.compareLastDay = i;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "PhysicalMentalStatData(date=" + this.date + ", avg=" + this.avg + ", type=" + this.type + ", max=" + this.max + ", min=" + this.min + ", compareLastDay=" + this.compareLastDay + ")";
    }

    public PhysicalMentalStatData(int i, int i2, int i3, int i4, int i5, int i6) {
        this.date = i;
        this.avg = i2;
        this.type = i3;
        this.max = i4;
        this.min = i5;
        this.compareLastDay = i6;
    }

    public /* synthetic */ PhysicalMentalStatData(int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }
}
