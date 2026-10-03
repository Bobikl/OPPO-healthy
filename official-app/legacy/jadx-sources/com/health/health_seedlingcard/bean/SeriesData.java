package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/health/health_seedlingcard/bean/SeriesData;", "", "commonStyle", "Lcom/health/health_seedlingcard/bean/WeeklyStepSeriesCommonStyle;", "barStyle", "Lcom/health/health_seedlingcard/bean/SeriesBarStyle;", "averageLine", "Lcom/health/health_seedlingcard/bean/SeriesAverageLine;", "data", "", "Lcom/health/health_seedlingcard/bean/SeriesStepData;", "(Lcom/health/health_seedlingcard/bean/WeeklyStepSeriesCommonStyle;Lcom/health/health_seedlingcard/bean/SeriesBarStyle;Lcom/health/health_seedlingcard/bean/SeriesAverageLine;Ljava/util/List;)V", "getAverageLine", "()Lcom/health/health_seedlingcard/bean/SeriesAverageLine;", "setAverageLine", "(Lcom/health/health_seedlingcard/bean/SeriesAverageLine;)V", "getBarStyle", "()Lcom/health/health_seedlingcard/bean/SeriesBarStyle;", "setBarStyle", "(Lcom/health/health_seedlingcard/bean/SeriesBarStyle;)V", "getCommonStyle", "()Lcom/health/health_seedlingcard/bean/WeeklyStepSeriesCommonStyle;", "setCommonStyle", "(Lcom/health/health_seedlingcard/bean/WeeklyStepSeriesCommonStyle;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeriesData {

    @NotNull
    private SeriesAverageLine averageLine;

    @NotNull
    private SeriesBarStyle barStyle;

    @NotNull
    private WeeklyStepSeriesCommonStyle commonStyle;

    @NotNull
    private List<SeriesStepData> data;

    public SeriesData(@NotNull WeeklyStepSeriesCommonStyle commonStyle, @NotNull SeriesBarStyle barStyle, @NotNull SeriesAverageLine averageLine, @NotNull List<SeriesStepData> data) {
        Intrinsics.checkNotNullParameter(commonStyle, "commonStyle");
        Intrinsics.checkNotNullParameter(barStyle, "barStyle");
        Intrinsics.checkNotNullParameter(averageLine, "averageLine");
        Intrinsics.checkNotNullParameter(data, "data");
        this.commonStyle = commonStyle;
        this.barStyle = barStyle;
        this.averageLine = averageLine;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeriesData copy$default(SeriesData seriesData, WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle, SeriesBarStyle seriesBarStyle, SeriesAverageLine seriesAverageLine, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            weeklyStepSeriesCommonStyle = seriesData.commonStyle;
        }
        if ((i & 2) != 0) {
            seriesBarStyle = seriesData.barStyle;
        }
        if ((i & 4) != 0) {
            seriesAverageLine = seriesData.averageLine;
        }
        if ((i & 8) != 0) {
            list = seriesData.data;
        }
        return seriesData.copy(weeklyStepSeriesCommonStyle, seriesBarStyle, seriesAverageLine, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WeeklyStepSeriesCommonStyle getCommonStyle() {
        return this.commonStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SeriesBarStyle getBarStyle() {
        return this.barStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SeriesAverageLine getAverageLine() {
        return this.averageLine;
    }

    @NotNull
    public final List<SeriesStepData> component4() {
        return this.data;
    }

    @NotNull
    public final SeriesData copy(@NotNull WeeklyStepSeriesCommonStyle commonStyle, @NotNull SeriesBarStyle barStyle, @NotNull SeriesAverageLine averageLine, @NotNull List<SeriesStepData> data) {
        Intrinsics.checkNotNullParameter(commonStyle, "commonStyle");
        Intrinsics.checkNotNullParameter(barStyle, "barStyle");
        Intrinsics.checkNotNullParameter(averageLine, "averageLine");
        Intrinsics.checkNotNullParameter(data, "data");
        return new SeriesData(commonStyle, barStyle, averageLine, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeriesData)) {
            return false;
        }
        SeriesData seriesData = (SeriesData) other;
        return Intrinsics.areEqual(this.commonStyle, seriesData.commonStyle) && Intrinsics.areEqual(this.barStyle, seriesData.barStyle) && Intrinsics.areEqual(this.averageLine, seriesData.averageLine) && Intrinsics.areEqual(this.data, seriesData.data);
    }

    @NotNull
    public final SeriesAverageLine getAverageLine() {
        return this.averageLine;
    }

    @NotNull
    public final SeriesBarStyle getBarStyle() {
        return this.barStyle;
    }

    @NotNull
    public final WeeklyStepSeriesCommonStyle getCommonStyle() {
        return this.commonStyle;
    }

    @NotNull
    public final List<SeriesStepData> getData() {
        return this.data;
    }

    public int hashCode() {
        return (((((this.commonStyle.hashCode() * 31) + this.barStyle.hashCode()) * 31) + this.averageLine.hashCode()) * 31) + this.data.hashCode();
    }

    public final void setAverageLine(@NotNull SeriesAverageLine seriesAverageLine) {
        Intrinsics.checkNotNullParameter(seriesAverageLine, "<set-?>");
        this.averageLine = seriesAverageLine;
    }

    public final void setBarStyle(@NotNull SeriesBarStyle seriesBarStyle) {
        Intrinsics.checkNotNullParameter(seriesBarStyle, "<set-?>");
        this.barStyle = seriesBarStyle;
    }

    public final void setCommonStyle(@NotNull WeeklyStepSeriesCommonStyle weeklyStepSeriesCommonStyle) {
        Intrinsics.checkNotNullParameter(weeklyStepSeriesCommonStyle, "<set-?>");
        this.commonStyle = weeklyStepSeriesCommonStyle;
    }

    public final void setData(@NotNull List<SeriesStepData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    @NotNull
    public String toString() {
        return "SeriesData(commonStyle=" + this.commonStyle + ", barStyle=" + this.barStyle + ", averageLine=" + this.averageLine + ", data=" + this.data + ")";
    }
}
