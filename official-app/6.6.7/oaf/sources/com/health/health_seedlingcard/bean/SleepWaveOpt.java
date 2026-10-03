package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JA\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006."}, d2 = {"Lcom/health/health_seedlingcard/bean/SleepWaveOpt;", "", "type", "", "seriesStyle", "Lcom/health/health_seedlingcard/bean/SeriesStyle;", "xAxis", "Lcom/health/health_seedlingcard/bean/XAxis;", "yAxis", "Lcom/health/health_seedlingcard/bean/YAxis;", "series", "", "Lcom/health/health_seedlingcard/bean/Series;", "(Ljava/lang/String;Lcom/health/health_seedlingcard/bean/SeriesStyle;Lcom/health/health_seedlingcard/bean/XAxis;Lcom/health/health_seedlingcard/bean/YAxis;Ljava/util/List;)V", "getSeries", "()Ljava/util/List;", "setSeries", "(Ljava/util/List;)V", "getSeriesStyle", "()Lcom/health/health_seedlingcard/bean/SeriesStyle;", "setSeriesStyle", "(Lcom/health/health_seedlingcard/bean/SeriesStyle;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getXAxis", "()Lcom/health/health_seedlingcard/bean/XAxis;", "setXAxis", "(Lcom/health/health_seedlingcard/bean/XAxis;)V", "getYAxis", "()Lcom/health/health_seedlingcard/bean/YAxis;", "setYAxis", "(Lcom/health/health_seedlingcard/bean/YAxis;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepWaveOpt {

    @NotNull
    private List<Series> series;

    @NotNull
    private SeriesStyle seriesStyle;

    @NotNull
    private String type;

    @NotNull
    private XAxis xAxis;

    @NotNull
    private YAxis yAxis;

    public SleepWaveOpt(@NotNull String str, @NotNull SeriesStyle seriesStyle, @NotNull XAxis xAxis, @NotNull YAxis yAxis, @NotNull List<Series> list) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(seriesStyle, "seriesStyle");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(list, "series");
        this.type = str;
        this.seriesStyle = seriesStyle;
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.series = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepWaveOpt copy$default(SleepWaveOpt sleepWaveOpt, String str, SeriesStyle seriesStyle, XAxis xAxis, YAxis yAxis, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sleepWaveOpt.type;
        }
        if ((i & 2) != 0) {
            seriesStyle = sleepWaveOpt.seriesStyle;
        }
        SeriesStyle seriesStyle2 = seriesStyle;
        if ((i & 4) != 0) {
            xAxis = sleepWaveOpt.xAxis;
        }
        XAxis xAxis2 = xAxis;
        if ((i & 8) != 0) {
            yAxis = sleepWaveOpt.yAxis;
        }
        YAxis yAxis2 = yAxis;
        if ((i & 16) != 0) {
            list = sleepWaveOpt.series;
        }
        return sleepWaveOpt.copy(str, seriesStyle2, xAxis2, yAxis2, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SeriesStyle getSeriesStyle() {
        return this.seriesStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final XAxis getXAxis() {
        return this.xAxis;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final YAxis getYAxis() {
        return this.yAxis;
    }

    @NotNull
    public final List<Series> component5() {
        return this.series;
    }

    @NotNull
    public final SleepWaveOpt copy(@NotNull String type, @NotNull SeriesStyle seriesStyle, @NotNull XAxis xAxis, @NotNull YAxis yAxis, @NotNull List<Series> series) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(seriesStyle, "seriesStyle");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        Intrinsics.checkNotNullParameter(yAxis, "yAxis");
        Intrinsics.checkNotNullParameter(series, "series");
        return new SleepWaveOpt(type, seriesStyle, xAxis, yAxis, series);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepWaveOpt)) {
            return false;
        }
        SleepWaveOpt sleepWaveOpt = (SleepWaveOpt) other;
        return Intrinsics.areEqual(this.type, sleepWaveOpt.type) && Intrinsics.areEqual(this.seriesStyle, sleepWaveOpt.seriesStyle) && Intrinsics.areEqual(this.xAxis, sleepWaveOpt.xAxis) && Intrinsics.areEqual(this.yAxis, sleepWaveOpt.yAxis) && Intrinsics.areEqual(this.series, sleepWaveOpt.series);
    }

    @NotNull
    public final List<Series> getSeries() {
        return this.series;
    }

    @NotNull
    public final SeriesStyle getSeriesStyle() {
        return this.seriesStyle;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final XAxis getXAxis() {
        return this.xAxis;
    }

    @NotNull
    public final YAxis getYAxis() {
        return this.yAxis;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.seriesStyle.hashCode()) * 31) + this.xAxis.hashCode()) * 31) + this.yAxis.hashCode()) * 31) + this.series.hashCode();
    }

    public final void setSeries(@NotNull List<Series> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.series = list;
    }

    public final void setSeriesStyle(@NotNull SeriesStyle seriesStyle) {
        Intrinsics.checkNotNullParameter(seriesStyle, "<set-?>");
        this.seriesStyle = seriesStyle;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setXAxis(@NotNull XAxis xAxis) {
        Intrinsics.checkNotNullParameter(xAxis, "<set-?>");
        this.xAxis = xAxis;
    }

    public final void setYAxis(@NotNull YAxis yAxis) {
        Intrinsics.checkNotNullParameter(yAxis, "<set-?>");
        this.yAxis = yAxis;
    }

    @NotNull
    public String toString() {
        return "SleepWaveOpt(type=" + this.type + ", seriesStyle=" + this.seriesStyle + ", xAxis=" + this.xAxis + ", yAxis=" + this.yAxis + ", series=" + this.series + ")";
    }

    public /* synthetic */ SleepWaveOpt(String str, SeriesStyle seriesStyle, XAxis xAxis, YAxis yAxis, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "wave" : str, seriesStyle, xAxis, yAxis, list);
    }
}
