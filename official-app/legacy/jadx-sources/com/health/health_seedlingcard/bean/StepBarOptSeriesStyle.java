package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/health/health_seedlingcard/bean/StepBarOptSeriesStyle;", "", "seriesType", "", "regionGap", "barWidth", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBarWidth", "()Ljava/lang/String;", "setBarWidth", "(Ljava/lang/String;)V", "getRegionGap", "setRegionGap", "getSeriesType", "setSeriesType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StepBarOptSeriesStyle {

    @NotNull
    private String barWidth;

    @NotNull
    private String regionGap;

    @NotNull
    private String seriesType;

    public StepBarOptSeriesStyle() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StepBarOptSeriesStyle copy$default(StepBarOptSeriesStyle stepBarOptSeriesStyle, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stepBarOptSeriesStyle.seriesType;
        }
        if ((i & 2) != 0) {
            str2 = stepBarOptSeriesStyle.regionGap;
        }
        if ((i & 4) != 0) {
            str3 = stepBarOptSeriesStyle.barWidth;
        }
        return stepBarOptSeriesStyle.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSeriesType() {
        return this.seriesType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegionGap() {
        return this.regionGap;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBarWidth() {
        return this.barWidth;
    }

    @NotNull
    public final StepBarOptSeriesStyle copy(@NotNull String seriesType, @NotNull String regionGap, @NotNull String barWidth) {
        Intrinsics.checkNotNullParameter(seriesType, "seriesType");
        Intrinsics.checkNotNullParameter(regionGap, "regionGap");
        Intrinsics.checkNotNullParameter(barWidth, "barWidth");
        return new StepBarOptSeriesStyle(seriesType, regionGap, barWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepBarOptSeriesStyle)) {
            return false;
        }
        StepBarOptSeriesStyle stepBarOptSeriesStyle = (StepBarOptSeriesStyle) other;
        return Intrinsics.areEqual(this.seriesType, stepBarOptSeriesStyle.seriesType) && Intrinsics.areEqual(this.regionGap, stepBarOptSeriesStyle.regionGap) && Intrinsics.areEqual(this.barWidth, stepBarOptSeriesStyle.barWidth);
    }

    @NotNull
    public final String getBarWidth() {
        return this.barWidth;
    }

    @NotNull
    public final String getRegionGap() {
        return this.regionGap;
    }

    @NotNull
    public final String getSeriesType() {
        return this.seriesType;
    }

    public int hashCode() {
        return (((this.seriesType.hashCode() * 31) + this.regionGap.hashCode()) * 31) + this.barWidth.hashCode();
    }

    public final void setBarWidth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.barWidth = str;
    }

    public final void setRegionGap(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.regionGap = str;
    }

    public final void setSeriesType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.seriesType = str;
    }

    @NotNull
    public String toString() {
        return "StepBarOptSeriesStyle(seriesType=" + this.seriesType + ", regionGap=" + this.regionGap + ", barWidth=" + this.barWidth + ")";
    }

    public StepBarOptSeriesStyle(@NotNull String seriesType, @NotNull String regionGap, @NotNull String barWidth) {
        Intrinsics.checkNotNullParameter(seriesType, "seriesType");
        Intrinsics.checkNotNullParameter(regionGap, "regionGap");
        Intrinsics.checkNotNullParameter(barWidth, "barWidth");
        this.seriesType = seriesType;
        this.regionGap = regionGap;
        this.barWidth = barWidth;
    }

    public /* synthetic */ StepBarOptSeriesStyle(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "distributed" : str, (i & 2) != 0 ? "6%" : str2, (i & 4) != 0 ? "10px" : str3);
    }
}
