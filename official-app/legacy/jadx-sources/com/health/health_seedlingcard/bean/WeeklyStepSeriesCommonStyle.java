package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/health/health_seedlingcard/bean/WeeklyStepSeriesCommonStyle;", "", "color", "", "labelMargin", "seriesLabel", "Lcom/health/health_seedlingcard/bean/CommonStyleSeriesLabel;", "(Ljava/lang/String;Ljava/lang/String;Lcom/health/health_seedlingcard/bean/CommonStyleSeriesLabel;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getLabelMargin", "setLabelMargin", "getSeriesLabel", "()Lcom/health/health_seedlingcard/bean/CommonStyleSeriesLabel;", "setSeriesLabel", "(Lcom/health/health_seedlingcard/bean/CommonStyleSeriesLabel;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeeklyStepSeriesCommonStyle {

    @NotNull
    private String color;

    @NotNull
    private String labelMargin;

    @NotNull
    private CommonStyleSeriesLabel seriesLabel;

    public WeeklyStepSeriesCommonStyle(@NotNull String color, @NotNull String labelMargin, @NotNull CommonStyleSeriesLabel seriesLabel) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(labelMargin, "labelMargin");
        Intrinsics.checkNotNullParameter(seriesLabel, "seriesLabel");
        this.color = color;
        this.labelMargin = labelMargin;
        this.seriesLabel = seriesLabel;
    }

    public static /* synthetic */ WeeklyStepSeriesCommonStyle copy$default(WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle, String str, String str2, CommonStyleSeriesLabel commonStyleSeriesLabel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weeklyStepSeriesCommonStyle.color;
        }
        if ((i & 2) != 0) {
            str2 = weeklyStepSeriesCommonStyle.labelMargin;
        }
        if ((i & 4) != 0) {
            commonStyleSeriesLabel = weeklyStepSeriesCommonStyle.seriesLabel;
        }
        return weeklyStepSeriesCommonStyle.copy(str, str2, commonStyleSeriesLabel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabelMargin() {
        return this.labelMargin;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CommonStyleSeriesLabel getSeriesLabel() {
        return this.seriesLabel;
    }

    @NotNull
    public final WeeklyStepSeriesCommonStyle copy(@NotNull String color, @NotNull String labelMargin, @NotNull CommonStyleSeriesLabel seriesLabel) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(labelMargin, "labelMargin");
        Intrinsics.checkNotNullParameter(seriesLabel, "seriesLabel");
        return new WeeklyStepSeriesCommonStyle(color, labelMargin, seriesLabel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyStepSeriesCommonStyle)) {
            return false;
        }
        WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle = (WeeklyStepSeriesCommonStyle) other;
        return Intrinsics.areEqual(this.color, weeklyStepSeriesCommonStyle.color) && Intrinsics.areEqual(this.labelMargin, weeklyStepSeriesCommonStyle.labelMargin) && Intrinsics.areEqual(this.seriesLabel, weeklyStepSeriesCommonStyle.seriesLabel);
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getLabelMargin() {
        return this.labelMargin;
    }

    @NotNull
    public final CommonStyleSeriesLabel getSeriesLabel() {
        return this.seriesLabel;
    }

    public int hashCode() {
        return (((this.color.hashCode() * 31) + this.labelMargin.hashCode()) * 31) + this.seriesLabel.hashCode();
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final void setLabelMargin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.labelMargin = str;
    }

    public final void setSeriesLabel(@NotNull CommonStyleSeriesLabel commonStyleSeriesLabel) {
        Intrinsics.checkNotNullParameter(commonStyleSeriesLabel, "<set-?>");
        this.seriesLabel = commonStyleSeriesLabel;
    }

    @NotNull
    public String toString() {
        return "WeeklyStepSeriesCommonStyle(color=" + this.color + ", labelMargin=" + this.labelMargin + ", seriesLabel=" + this.seriesLabel + ")";
    }

    public /* synthetic */ WeeklyStepSeriesCommonStyle(String str, String str2, CommonStyleSeriesLabel commonStyleSeriesLabel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "rgba(0, 0, 0, 0.15)" : str, (i & 2) != 0 ? "5px" : str2, commonStyleSeriesLabel);
    }
}
