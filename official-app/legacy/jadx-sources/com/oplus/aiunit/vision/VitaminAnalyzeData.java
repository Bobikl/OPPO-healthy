package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.x1l, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\t\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/x1l;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "d", "()I", b2n.g, "(I)V", "todayIntake", "b", "c", b2n.f, "dailySunshineSynthesis", "f", "dailyManualRecord", "Lcom/oplus/aiunit/vision/y1l;", "Lcom/oplus/aiunit/vision/y1l;", "()Lcom/oplus/aiunit/vision/y1l;", MapSchema.FIELD_NAME_ENTRY, "(Lcom/oplus/aiunit/vision/y1l;)V", "chartData", "<init>", "(IIILcom/oplus/aiunit/vision/y1l;)V", "sunshine_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class VitaminAnalyzeData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int todayIntake;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int dailySunshineSynthesis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int dailyManualRecord;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public VitaminChartData chartData;

    public VitaminAnalyzeData() {
        this(0, 0, 0, null, 15, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final VitaminChartData getChartData() {
        return this.chartData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDailyManualRecord() {
        return this.dailyManualRecord;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDailySunshineSynthesis() {
        return this.dailySunshineSynthesis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTodayIntake() {
        return this.todayIntake;
    }

    public final void e(@NotNull VitaminChartData vitaminChartData) {
        Intrinsics.checkNotNullParameter(vitaminChartData, "<set-?>");
        this.chartData = vitaminChartData;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VitaminAnalyzeData)) {
            return false;
        }
        VitaminAnalyzeData vitaminAnalyzeData = (VitaminAnalyzeData) other;
        return this.todayIntake == vitaminAnalyzeData.todayIntake && this.dailySunshineSynthesis == vitaminAnalyzeData.dailySunshineSynthesis && this.dailyManualRecord == vitaminAnalyzeData.dailyManualRecord && Intrinsics.areEqual(this.chartData, vitaminAnalyzeData.chartData);
    }

    public final void f(int i) {
        this.dailyManualRecord = i;
    }

    public final void g(int i) {
        this.dailySunshineSynthesis = i;
    }

    public final void h(int i) {
        this.todayIntake = i;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.todayIntake) * 31) + Integer.hashCode(this.dailySunshineSynthesis)) * 31) + Integer.hashCode(this.dailyManualRecord)) * 31) + this.chartData.hashCode();
    }

    @NotNull
    public String toString() {
        return "VitaminAnalyzeData(todayIntake=" + this.todayIntake + ", dailySunshineSynthesis=" + this.dailySunshineSynthesis + ", dailyManualRecord=" + this.dailyManualRecord + ", chartData=" + this.chartData + ")";
    }

    public VitaminAnalyzeData(int i, int i2, int i3, @NotNull VitaminChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.todayIntake = i;
        this.dailySunshineSynthesis = i2;
        this.dailyManualRecord = i3;
        this.chartData = chartData;
    }

    public /* synthetic */ VitaminAnalyzeData(int i, int i2, int i3, VitaminChartData vitaminChartData, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? new VitaminChartData(0, null, null, 7, null) : vitaminChartData);
    }
}
