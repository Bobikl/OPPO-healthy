package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/health/health_seedlingcard/bean/Series;", "", "commonStyle", "Lcom/health/health_seedlingcard/bean/CommonStyle;", "waveStyle", "Lcom/health/health_seedlingcard/bean/WaveStyle;", "data", "", "Lcom/health/health_seedlingcard/bean/SeriesSleepItemData;", "(Lcom/health/health_seedlingcard/bean/CommonStyle;Lcom/health/health_seedlingcard/bean/WaveStyle;Ljava/util/List;)V", "getCommonStyle", "()Lcom/health/health_seedlingcard/bean/CommonStyle;", "setCommonStyle", "(Lcom/health/health_seedlingcard/bean/CommonStyle;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getWaveStyle", "()Lcom/health/health_seedlingcard/bean/WaveStyle;", "setWaveStyle", "(Lcom/health/health_seedlingcard/bean/WaveStyle;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Series {

    @NotNull
    private CommonStyle commonStyle;

    @NotNull
    private List<SeriesSleepItemData> data;

    @NotNull
    private WaveStyle waveStyle;

    public Series(@NotNull CommonStyle commonStyle, @NotNull WaveStyle waveStyle, @NotNull List<SeriesSleepItemData> data) {
        Intrinsics.checkNotNullParameter(commonStyle, "commonStyle");
        Intrinsics.checkNotNullParameter(waveStyle, "waveStyle");
        Intrinsics.checkNotNullParameter(data, "data");
        this.commonStyle = commonStyle;
        this.waveStyle = waveStyle;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Series copy$default(Series series, CommonStyle commonStyle, WaveStyle waveStyle, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            commonStyle = series.commonStyle;
        }
        if ((i & 2) != 0) {
            waveStyle = series.waveStyle;
        }
        if ((i & 4) != 0) {
            list = series.data;
        }
        return series.copy(commonStyle, waveStyle, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CommonStyle getCommonStyle() {
        return this.commonStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WaveStyle getWaveStyle() {
        return this.waveStyle;
    }

    @NotNull
    public final List<SeriesSleepItemData> component3() {
        return this.data;
    }

    @NotNull
    public final Series copy(@NotNull CommonStyle commonStyle, @NotNull WaveStyle waveStyle, @NotNull List<SeriesSleepItemData> data) {
        Intrinsics.checkNotNullParameter(commonStyle, "commonStyle");
        Intrinsics.checkNotNullParameter(waveStyle, "waveStyle");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Series(commonStyle, waveStyle, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Series)) {
            return false;
        }
        Series series = (Series) other;
        return Intrinsics.areEqual(this.commonStyle, series.commonStyle) && Intrinsics.areEqual(this.waveStyle, series.waveStyle) && Intrinsics.areEqual(this.data, series.data);
    }

    @NotNull
    public final CommonStyle getCommonStyle() {
        return this.commonStyle;
    }

    @NotNull
    public final List<SeriesSleepItemData> getData() {
        return this.data;
    }

    @NotNull
    public final WaveStyle getWaveStyle() {
        return this.waveStyle;
    }

    public int hashCode() {
        return (((this.commonStyle.hashCode() * 31) + this.waveStyle.hashCode()) * 31) + this.data.hashCode();
    }

    public final void setCommonStyle(@NotNull CommonStyle commonStyle) {
        Intrinsics.checkNotNullParameter(commonStyle, "<set-?>");
        this.commonStyle = commonStyle;
    }

    public final void setData(@NotNull List<SeriesSleepItemData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setWaveStyle(@NotNull WaveStyle waveStyle) {
        Intrinsics.checkNotNullParameter(waveStyle, "<set-?>");
        this.waveStyle = waveStyle;
    }

    @NotNull
    public String toString() {
        return "Series(commonStyle=" + this.commonStyle + ", waveStyle=" + this.waveStyle + ", data=" + this.data + ")";
    }
}
