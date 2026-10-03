package com.heytap.health.sleep.view;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.heytap.health.core.widget.charts.HeartRateBarChart;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.ui.R$color;
import com.oplus.aiunit.vision.czj;
import com.oplus.aiunit.vision.hfk;
import com.oplus.aiunit.vision.ip8;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.w52;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u001d\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0013\u0010\u0017B%\b\u0016\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0013\u0010\u001aJ\u0016\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\u001a\u0010\t\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/sleep/view/BreathRateChart;", "Lcom/heytap/health/core/widget/charts/HeartRateBarChart;", "", "Lcom/oplus/aiunit/vision/czj;", "dataList", "", "setData", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "entryList", "setEntryList", "Lcom/github/mikephil/charting/data/CandleDataSet;", "dataSet", "setDataSetCommonAttr", "N", "", "maxValue", "O", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class BreathRateChart extends HeartRateBarChart {
    public static final int $stable = 0;

    public BreathRateChart(@Nullable Context context) {
        super(context);
        N();
    }

    public final void N() {
        super.n();
        setOnTouchListener((ChartTouchListener) new w52(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        setExtraTopOffset(54.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setExtraBottomOffset(0.0f);
        this.H = TimeUnit.HALF_AN_HOUR;
        this.A = 0.2f;
        setRadius(5.0f);
        setYAxisMinimum(0.0f);
        setYAxisMaximum(60.0f);
        getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        getXAxis().setLabelCount(2, true);
        getXAxis().setDrawLabels(false);
        getXAxis().setDrawGridLines(true);
        getXAxis().setGranularity(60.0f);
        getXAxis().setGridDashedLine(new DashPathEffect(new float[]{hfk.a(getContext(), 3.67f), hfk.a(getContext(), 3.67f)}, 0.0f));
        getAxisRight().setDrawLabels(true);
        getAxisRight().setLabelCount(4, true);
        getAxisRight().setGridDashedLine(new DashPathEffect(new float[]{hfk.a(getContext(), 3.67f), hfk.a(getContext(), 3.67f)}, 0.0f));
        getAxisRight().setDrawGridLines(true);
        getAxisRight().setTextColor(getContext().getColor(R$color.fit_colorAccent));
        setShowYAxisStartLine(true);
        setShowYAxisEndLine(true);
        setBarColor(getContext().getColor(com.heytap.health.sleep.R$color.health_sleep_FF266BF5));
        setBarGradientColor(null);
        setForceCandleHeightBiggerThanWidth(true);
        if (qe0.y(getContext())) {
            XAxis xAxis = getXAxis();
            Context context = getContext();
            int i = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label_night;
            xAxis.setTextColor(ContextCompat.getColor(context, i));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i));
            XAxis xAxis2 = getXAxis();
            Context context2 = getContext();
            int i2 = com.heytap.health.lib_chart.R$color.lib_core_charts_grid_line_night;
            xAxis2.setGridColor(ContextCompat.getColor(context2, i2));
            getAxisRight().setGridColor(ContextCompat.getColor(getContext(), i2));
        } else {
            XAxis xAxis3 = getXAxis();
            Context context3 = getContext();
            int i3 = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label;
            xAxis3.setTextColor(ContextCompat.getColor(context3, i3));
            getAxisRight().setTextColor(ContextCompat.getColor(getContext(), i3));
            XAxis xAxis4 = getXAxis();
            Context context4 = getContext();
            int i4 = com.heytap.health.lib_chart.R$color.lib_core_charts_grid_line;
            xAxis4.setGridColor(ContextCompat.getColor(context4, i4));
            getAxisRight().setGridColor(ContextCompat.getColor(getContext(), i4));
        }
        f(true, false, true, true);
        l(16.0f, 0.0f, 35.0f, 8.0f);
        BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.DEFAULT;
        s(linePosition, 0.0f);
        t(linePosition, 0.0f);
    }

    public final void O(float maxValue) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        Intrinsics.checkNotNull(yAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.HealthYAxisRenderer");
        f fVar = (f) yAxisRenderer;
        getAxisRight().setAxisMinimum(0.0f);
        getAxisRight().setLabelCount(4, true);
        if (maxValue <= 20.0f) {
            getAxisRight().setLabelCount(5, true);
            getAxisRight().setAxisMaximum(20.0f);
            fVar.E(new float[]{0.0f, 5.0f, 10.0f, 15.0f, 20.0f});
        } else if (maxValue <= 30.0f) {
            getAxisRight().setAxisMaximum(30.0f);
            fVar.E(new float[]{0.0f, 10.0f, 20.0f, 30.0f});
        } else if (maxValue <= 45.0f) {
            getAxisRight().setAxisMaximum(45.0f);
            fVar.E(new float[]{0.0f, 15.0f, 30.0f, 45.0f});
        } else if (maxValue <= 60.0f) {
            getAxisRight().setAxisMaximum(60.0f);
            fVar.E(new float[]{0.0f, 20.0f, 40.0f, 60.0f});
        }
    }

    public final void setData(@Nullable List<? extends czj> dataList) {
        if (dataList == null || dataList.isEmpty()) {
            clear();
            return;
        }
        ArrayList arrayList = new ArrayList();
        float f = 0.0f;
        for (czj czjVar : dataList) {
            float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(czjVar.c(), czjVar.b());
            float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(czjVar.c(), czjVar.b());
            arrayList.add(new HealthCandleEntry((float) (this.H.timeStampToUnitDouble(czjVar.h()) - this.L), fCoerceAtMost, fCoerceAtLeast, czjVar));
            if (fCoerceAtLeast > f) {
                f = fCoerceAtLeast;
            }
        }
        O(f);
        setEntryList(arrayList);
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart
    public void setDataSetCommonAttr(@NotNull CandleDataSet dataSet) {
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        dataSet.setDrawIcons(false);
        dataSet.setDrawValues(false);
        dataSet.setDrawHighlightIndicators(false);
        dataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        dataSet.setShowCandleBar(false);
        dataSet.setShadowColorSameAsCandle(true);
        dataSet.setBarSpace(1 - this.A);
        dataSet.setIncreasingPaintStyle(Paint.Style.FILL);
        dataSet.setDecreasingPaintStyle(Paint.Style.FILL);
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart
    public void setEntryList(@Nullable List<? extends HealthCandleEntry> entryList) {
        if (entryList == null || entryList.isEmpty()) {
            clear();
            return;
        }
        ip8 ip8Var = new ip8(new ArrayList(entryList), "Breath Rate");
        setDataSetCommonAttr(ip8Var);
        CandleData candleData = new CandleData(ip8Var);
        ip8Var.setColor(this.C);
        ip8Var.setIncreasingColor(this.C);
        setData(candleData);
        invalidate();
    }

    public BreathRateChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        N();
    }

    public BreathRateChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        N();
    }
}
