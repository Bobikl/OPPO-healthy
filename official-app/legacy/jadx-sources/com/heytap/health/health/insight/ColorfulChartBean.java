package com.heytap.health.health.insight;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugar;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/heytap/health/health/insight/ColorfulChartBean;", "", "bars", "", "Lcom/heytap/health/health/insight/ColorfulBar;", "dataDesc", "", "dataDescZh", "topDesc", "topDescZh", DBBloodSugar.TREND, "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBars", "()Ljava/util/List;", "getDataDesc", "()Ljava/lang/String;", "getDataDescZh", "getTopDesc", "getTopDescZh", "getTrend", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ColorfulChartBean {

    @Nullable
    private final List<ColorfulBar> bars;

    @NotNull
    private final String dataDesc;

    @NotNull
    private final String dataDescZh;

    @NotNull
    private final String topDesc;

    @NotNull
    private final String topDescZh;
    private final int trend;

    public ColorfulChartBean(@Nullable List<ColorfulBar> list, @NotNull String dataDesc, @NotNull String dataDescZh, @NotNull String topDesc, @NotNull String topDescZh, int i) {
        Intrinsics.checkNotNullParameter(dataDesc, "dataDesc");
        Intrinsics.checkNotNullParameter(dataDescZh, "dataDescZh");
        Intrinsics.checkNotNullParameter(topDesc, "topDesc");
        Intrinsics.checkNotNullParameter(topDescZh, "topDescZh");
        this.bars = list;
        this.dataDesc = dataDesc;
        this.dataDescZh = dataDescZh;
        this.topDesc = topDesc;
        this.topDescZh = topDescZh;
        this.trend = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorfulChartBean copy$default(ColorfulChartBean colorfulChartBean, List list, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = colorfulChartBean.bars;
        }
        if ((i2 & 2) != 0) {
            str = colorfulChartBean.dataDesc;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = colorfulChartBean.dataDescZh;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = colorfulChartBean.topDesc;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = colorfulChartBean.topDescZh;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            i = colorfulChartBean.trend;
        }
        return colorfulChartBean.copy(list, str5, str6, str7, str8, i);
    }

    @Nullable
    public final List<ColorfulBar> component1() {
        return this.bars;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataDesc() {
        return this.dataDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataDescZh() {
        return this.dataDescZh;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTopDesc() {
        return this.topDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTopDescZh() {
        return this.topDescZh;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTrend() {
        return this.trend;
    }

    @NotNull
    public final ColorfulChartBean copy(@Nullable List<ColorfulBar> bars, @NotNull String dataDesc, @NotNull String dataDescZh, @NotNull String topDesc, @NotNull String topDescZh, int trend) {
        Intrinsics.checkNotNullParameter(dataDesc, "dataDesc");
        Intrinsics.checkNotNullParameter(dataDescZh, "dataDescZh");
        Intrinsics.checkNotNullParameter(topDesc, "topDesc");
        Intrinsics.checkNotNullParameter(topDescZh, "topDescZh");
        return new ColorfulChartBean(bars, dataDesc, dataDescZh, topDesc, topDescZh, trend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorfulChartBean)) {
            return false;
        }
        ColorfulChartBean colorfulChartBean = (ColorfulChartBean) other;
        return Intrinsics.areEqual(this.bars, colorfulChartBean.bars) && Intrinsics.areEqual(this.dataDesc, colorfulChartBean.dataDesc) && Intrinsics.areEqual(this.dataDescZh, colorfulChartBean.dataDescZh) && Intrinsics.areEqual(this.topDesc, colorfulChartBean.topDesc) && Intrinsics.areEqual(this.topDescZh, colorfulChartBean.topDescZh) && this.trend == colorfulChartBean.trend;
    }

    @Nullable
    public final List<ColorfulBar> getBars() {
        return this.bars;
    }

    @NotNull
    public final String getDataDesc() {
        return this.dataDesc;
    }

    @NotNull
    public final String getDataDescZh() {
        return this.dataDescZh;
    }

    @NotNull
    public final String getTopDesc() {
        return this.topDesc;
    }

    @NotNull
    public final String getTopDescZh() {
        return this.topDescZh;
    }

    public final int getTrend() {
        return this.trend;
    }

    public int hashCode() {
        List<ColorfulBar> list = this.bars;
        return ((((((((((list == null ? 0 : list.hashCode()) * 31) + this.dataDesc.hashCode()) * 31) + this.dataDescZh.hashCode()) * 31) + this.topDesc.hashCode()) * 31) + this.topDescZh.hashCode()) * 31) + Integer.hashCode(this.trend);
    }

    @NotNull
    public String toString() {
        return "ColorfulChartBean(bars=" + this.bars + ", dataDesc=" + this.dataDesc + ", dataDescZh=" + this.dataDescZh + ", topDesc=" + this.topDesc + ", topDescZh=" + this.topDescZh + ", trend=" + this.trend + ")";
    }
}
