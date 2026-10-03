package com.heytap.sports.coach.tips.bean;

import android.graphics.Color;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.oplus.aiunit.vision.b2n;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001b\u0012\u0014\b\u0002\u0010&\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 \u0012\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 \u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 \u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040*¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00128\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020 8\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\"\u0010%R#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b'\u0010%R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040*8\u0006¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b\u001c\u0010,¨\u00060"}, d2 = {"Lcom/heytap/sports/coach/tips/bean/BurnFatChartUIBean;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", b2n.g, "()I", "themeColor", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "avgValue", "", "Lcom/heytap/health/core/widget/charts/data/HealthSingleBarEntry;", "c", "Ljava/util/List;", "()Ljava/util/List;", "entryList", "", "d", "dateTimeList", "Lcom/heytap/sports/coach/tips/bean/BurnFatChartHighlightType;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/sports/coach/tips/bean/BurnFatChartHighlightType;", "()Lcom/heytap/sports/coach/tips/bean/BurnFatChartHighlightType;", "highlightType", "Lkotlin/Function1;", "", "f", "Lkotlin/jvm/functions/Function1;", "i", "()Lkotlin/jvm/functions/Function1;", "yAxisValueFormatter", b2n.f, "markerValueFormatter", "maxYLineConvert", "", "Ljava/util/Set;", "()Ljava/util/Set;", "invalidDataIndexSet", "<init>", "(ILjava/lang/Integer;Ljava/util/List;Ljava/util/List;Lcom/heytap/sports/coach/tips/bean/BurnFatChartHighlightType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/util/Set;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BurnFatChartUIBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int themeColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer avgValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<HealthSingleBarEntry> entryList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Long> dateTimeList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final BurnFatChartHighlightType highlightType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<Float, String> yAxisValueFormatter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<Float, String> markerValueFormatter;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final Function1<Integer, Integer> maxYLineConvert;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final Set<Integer> invalidDataIndexSet;

    public BurnFatChartUIBean() {
        this(0, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAvgValue() {
        return this.avgValue;
    }

    @NotNull
    public final List<Long> b() {
        return this.dateTimeList;
    }

    @NotNull
    public final List<HealthSingleBarEntry> c() {
        return this.entryList;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final BurnFatChartHighlightType getHighlightType() {
        return this.highlightType;
    }

    @NotNull
    public final Set<Integer> e() {
        return this.invalidDataIndexSet;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BurnFatChartUIBean)) {
            return false;
        }
        BurnFatChartUIBean burnFatChartUIBean = (BurnFatChartUIBean) other;
        return this.themeColor == burnFatChartUIBean.themeColor && Intrinsics.areEqual(this.avgValue, burnFatChartUIBean.avgValue) && Intrinsics.areEqual(this.entryList, burnFatChartUIBean.entryList) && Intrinsics.areEqual(this.dateTimeList, burnFatChartUIBean.dateTimeList) && this.highlightType == burnFatChartUIBean.highlightType && Intrinsics.areEqual(this.yAxisValueFormatter, burnFatChartUIBean.yAxisValueFormatter) && Intrinsics.areEqual(this.markerValueFormatter, burnFatChartUIBean.markerValueFormatter) && Intrinsics.areEqual(this.maxYLineConvert, burnFatChartUIBean.maxYLineConvert) && Intrinsics.areEqual(this.invalidDataIndexSet, burnFatChartUIBean.invalidDataIndexSet);
    }

    @NotNull
    public final Function1<Float, String> f() {
        return this.markerValueFormatter;
    }

    @NotNull
    public final Function1<Integer, Integer> g() {
        return this.maxYLineConvert;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getThemeColor() {
        return this.themeColor;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.themeColor) * 31;
        Integer num = this.avgValue;
        return ((((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.entryList.hashCode()) * 31) + this.dateTimeList.hashCode()) * 31) + this.highlightType.hashCode()) * 31) + this.yAxisValueFormatter.hashCode()) * 31) + this.markerValueFormatter.hashCode()) * 31) + this.maxYLineConvert.hashCode()) * 31) + this.invalidDataIndexSet.hashCode();
    }

    @NotNull
    public final Function1<Float, String> i() {
        return this.yAxisValueFormatter;
    }

    @NotNull
    public String toString() {
        return "BurnFatChartUIBean(themeColor=" + this.themeColor + ", avgValue=" + this.avgValue + ", entryList=" + this.entryList + ", dateTimeList=" + this.dateTimeList + ", highlightType=" + this.highlightType + ", yAxisValueFormatter=" + this.yAxisValueFormatter + ", markerValueFormatter=" + this.markerValueFormatter + ", maxYLineConvert=" + this.maxYLineConvert + ", invalidDataIndexSet=" + this.invalidDataIndexSet + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BurnFatChartUIBean(int i, @Nullable Integer num, @NotNull List<? extends HealthSingleBarEntry> entryList, @NotNull List<Long> dateTimeList, @NotNull BurnFatChartHighlightType highlightType, @NotNull Function1<? super Float, String> yAxisValueFormatter, @NotNull Function1<? super Float, String> markerValueFormatter, @NotNull Function1<? super Integer, Integer> maxYLineConvert, @NotNull Set<Integer> invalidDataIndexSet) {
        Intrinsics.checkNotNullParameter(entryList, "entryList");
        Intrinsics.checkNotNullParameter(dateTimeList, "dateTimeList");
        Intrinsics.checkNotNullParameter(highlightType, "highlightType");
        Intrinsics.checkNotNullParameter(yAxisValueFormatter, "yAxisValueFormatter");
        Intrinsics.checkNotNullParameter(markerValueFormatter, "markerValueFormatter");
        Intrinsics.checkNotNullParameter(maxYLineConvert, "maxYLineConvert");
        Intrinsics.checkNotNullParameter(invalidDataIndexSet, "invalidDataIndexSet");
        this.themeColor = i;
        this.avgValue = num;
        this.entryList = entryList;
        this.dateTimeList = dateTimeList;
        this.highlightType = highlightType;
        this.yAxisValueFormatter = yAxisValueFormatter;
        this.markerValueFormatter = markerValueFormatter;
        this.maxYLineConvert = maxYLineConvert;
        this.invalidDataIndexSet = invalidDataIndexSet;
    }

    public /* synthetic */ BurnFatChartUIBean(int i, Integer num, List list, List list2, BurnFatChartHighlightType burnFatChartHighlightType, Function1 function1, Function1 function2, Function1 function3, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Color.parseColor("#ffFF6738") : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 16) != 0 ? BurnFatChartHighlightType.None : burnFatChartHighlightType, (i2 & 32) != 0 ? new Function1<Float, String>() { // from class: com.heytap.sports.coach.tips.bean.BurnFatChartUIBean.1
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Float f) {
                return invoke(f.floatValue());
            }

            @NotNull
            public final String invoke(float f) {
                return String.valueOf(f);
            }
        } : function1, (i2 & 64) != 0 ? new Function1<Float, String>() { // from class: com.heytap.sports.coach.tips.bean.BurnFatChartUIBean.2
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ String invoke(Float f) {
                return invoke(f.floatValue());
            }

            @NotNull
            public final String invoke(float f) {
                return String.valueOf(f);
            }
        } : function2, (i2 & 128) != 0 ? new Function1<Integer, Integer>() { // from class: com.heytap.sports.coach.tips.bean.BurnFatChartUIBean.3
            @NotNull
            public final Integer invoke(int i3) {
                return Integer.valueOf(i3);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Integer invoke(Integer num2) {
                return invoke(num2.intValue());
            }
        } : function3, (i2 & 256) != 0 ? SetsKt__SetsKt.emptySet() : set);
    }
}
