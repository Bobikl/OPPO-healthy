package com.heytap.health.core.widget.charts;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.ChartScrollState;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.al1;
import com.oplus.aiunit.vision.cjd;
import com.oplus.aiunit.vision.f59;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lx8;
import com.oplus.aiunit.vision.qmg;
import com.oplus.aiunit.vision.rjd;
import com.oplus.aiunit.vision.sp8;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bI\u0010JB\u001d\b\u0016\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bI\u0010MB%\b\u0016\u0012\b\u0010H\u001a\u0004\u0018\u00010G\u0012\b\u0010L\u001a\u0004\u0018\u00010K\u0012\u0006\u0010N\u001a\u00020\b¢\u0006\u0004\bI\u0010OJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\u0011\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001f\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 J\u0010\u0010#\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 J\u000e\u0010&\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$J\u000e\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020$J\u0006\u0010)\u001a\u00020$R\u0014\u0010,\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.RA\u0010:\u001a!\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020\u0002\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R?\u0010?\u001a\u001f\u0012\u0013\u0012\u00110$¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(;\u0012\u0004\u0012\u00020\u0002\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00105\u001a\u0004\b=\u00107\"\u0004\b>\u00109R\"\u0010F\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006P"}, d2 = {"Lcom/heytap/health/core/widget/charts/BloodOxCandleChart;", "Lcom/heytap/health/core/widget/charts/HeartRateBarChart;", "", "init", "n", "", "spo2RangeStr", "setSpo2RangeStr", "", "index", "setSelected", "", "Lcom/oplus/aiunit/vision/f59;", "data", "setHeartRateData", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "entryList", "setEntryList", "", "min", "setYAxisMinimum", "minValue", "setYAxisLabel", "warnNumber", "setWarnNumber", "radius", "setRadius", "Lcom/oplus/aiunit/vision/cjd;", "listener", "setOnHighestVisibleIndexChangeListener", "Lcom/oplus/aiunit/vision/rjd;", "setOnLowestVisibleIndexChangeListener", "Lcom/github/mikephil/charting/model/GradientColor;", "color", "setNormalGradientColor", "setUrgentGradientColor", "", "limitLabelStyleSameAsAxis", "setLimitLabelStyleSameAsAxis", "needChangeMonthBar", "setNeedChangeMonthBar", "N", "R", UserInfo.SEX_FEMALE, "fixedYMin", "S", "Ljava/lang/String;", "Lkotlin/Function1;", "Lcom/heytap/health/core/widget/charts/data/ChartScrollState;", "Lkotlin/ParameterName;", "name", "state", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/jvm/functions/Function1;", "getOnChartScrolledCallback", "()Lkotlin/jvm/functions/Function1;", "setOnChartScrolledCallback", "(Lkotlin/jvm/functions/Function1;)V", "onChartScrolledCallback", "visible", "U", "getOnMarkerViewVisibleChange", "setOnMarkerViewVisibleChange", "onMarkerViewVisibleChange", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "I", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "selectedIndex", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class BloodOxCandleChart extends HeartRateBarChart {

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public final float fixedYMin;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    public String spo2RangeStr;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public Function1<? super ChartScrollState, Unit> onChartScrolledCallback;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> onMarkerViewVisibleChange;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public int selectedIndex;

    public BloodOxCandleChart(@Nullable Context context) {
        super(context);
        this.fixedYMin = 70.0f;
        this.selectedIndex = -1;
    }

    public final boolean N() {
        ChartAnimator chartAnimator = this.mAnimator;
        if (!(chartAnimator instanceof CustomChartAnimator)) {
            return false;
        }
        Intrinsics.checkNotNull(chartAnimator, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.animator.CustomChartAnimator");
        return ((CustomChartAnimator) chartAnimator).isAnimate();
    }

    @Nullable
    public final Function1<ChartScrollState, Unit> getOnChartScrolledCallback() {
        return this.onChartScrolledCallback;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnMarkerViewVisibleChange() {
        return this.onMarkerViewVisibleChange;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart, com.heytap.health.core.widget.charts.HealthCandleStickChart, com.heytap.health.core.widget.charts.ControllableOffsetCandleChart, com.github.mikephil.charting.charts.CandleStickChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new al1(this, this.mAnimator, this.mViewPortHandler);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart, com.heytap.health.core.widget.charts.HealthCandleStickChart
    public void n() {
        super.n();
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        Intrinsics.checkNotNull(yAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.HealthYAxisRenderer");
        ((f) yAxisRenderer).H(this.G);
        int[][] iArr = if0.y(getContext()) ? new int[][]{new int[]{R$color.lib_core_charts_blood_ox_candle_warn_start_color_night, R$color.lib_core_charts_blood_ox_candle_warn_end_color_night}, new int[]{R$color.lib_core_charts_blood_ox_candle_normal_start_color_night, R$color.lib_core_charts_blood_ox_candle_normal_end_color_night}} : new int[][]{new int[]{R$color.lib_core_charts_blood_ox_candle_warn_start_color, R$color.lib_core_charts_blood_ox_candle_warn_end_color}, new int[]{R$color.lib_core_charts_blood_ox_candle_normal_start_color, R$color.lib_core_charts_blood_ox_candle_normal_end_color}};
        int length = iArr.length;
        GradientColor[] gradientColorArr = new GradientColor[length];
        for (int i = 0; i < length; i++) {
            gradientColorArr[i] = new GradientColor(ContextCompat.getColor(getContext(), iArr[i][0]), ContextCompat.getColor(getContext(), iArr[i][1]));
        }
        DataRenderer dataRenderer = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
        al1 al1Var = (al1) dataRenderer;
        al1Var.m((GradientColor) ArraysKt___ArraysKt.getOrNull(gradientColorArr, 0));
        al1Var.i((GradientColor) ArraysKt___ArraysKt.getOrNull(gradientColorArr, 1));
        DataRenderer dataRenderer2 = this.mRenderer;
        Intrinsics.checkNotNull(dataRenderer2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
        ((al1) dataRenderer2).h(true);
        f(true, true, true, true);
        l(0.0f, 78.0f, 34.0f, 22.0f);
        setWarnNumber(90.0f);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f);
        XAxis xAxis = getXAxis();
        xAxis.setDrawAxisLine(true);
        xAxis.setAxisLineColor(getContext().getColor(com.heytap.health.base.R$color.lib_base_color_nx_transparence));
        xAxis.setGranularity(1.0f);
        xAxis.setYOffset(8.0f);
        xAxis.setDrawGridLines(true);
        xAxis.setGridDashedLine(dashPathEffect);
        xAxis.setGridLineWidth(0.6f);
        if (getRendererXAxis() instanceof lx8) {
            XAxisRenderer rendererXAxis = getRendererXAxis();
            Intrinsics.checkNotNull(rendererXAxis, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.HealthXAxisRenderer");
            ((lx8) rendererXAxis).d(true);
            float fA = qmg.a(getContext(), 294.0f);
            XAxisRenderer rendererXAxis2 = getRendererXAxis();
            Intrinsics.checkNotNull(rendererXAxis2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.HealthXAxisRenderer");
            ((lx8) rendererXAxis2).e(new float[]{0.3f, (fA - 0.3f) / 2, fA});
        }
        o();
        YAxis axisRight = getAxisRight();
        axisRight.setAxisMaximum(100.0f);
        axisRight.setXOffset(17.0f);
        axisRight.setDrawGridLines(true);
        axisRight.setGridDashedLine(dashPathEffect);
        axisRight.setGridLineWidth(0.6f);
        setHighlightPerDragEnabled(true);
        setHighlightPerTapEnabled(true);
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart
    public void setEntryList(@NotNull List<? extends HealthCandleEntry> entryList) {
        Intrinsics.checkNotNullParameter(entryList, "entryList");
        int size = entryList.size();
        float low = 100.0f;
        for (int i = 0; i < size; i++) {
            if (entryList.get(i).getLow() < low) {
                low = entryList.get(i).getLow();
            }
        }
        getAxisRight().setLabelCount(4, true);
        super.setEntryList(entryList);
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart
    public void setHeartRateData(@NotNull List<? extends f59> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.isEmpty()) {
            clear();
            return;
        }
        LinkedList linkedList = new LinkedList();
        int size = data.size();
        float f = 100.0f;
        for (int i = 0; i < size; i++) {
            f59 f59Var = data.get(i);
            float fMin = Math.min(f59Var.b(), f59Var.a());
            float fMax = Math.max(f59Var.b(), f59Var.a());
            if (fMin < f) {
                f = fMin;
            }
            linkedList.add(new HealthCandleEntry((float) (this.H.timeStampToUnitDouble(f59Var.c()) - this.L), fMin, fMax, f59Var));
        }
        setEntryList(linkedList);
    }

    public final void setLimitLabelStyleSameAsAxis(boolean limitLabelStyleSameAsAxis) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererLeft;
        if (yAxisRenderer instanceof f) {
            Intrinsics.checkNotNull(yAxisRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.HealthYAxisRenderer");
            ((f) yAxisRenderer).u(limitLabelStyleSameAsAxis);
        }
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererRight;
        if (yAxisRenderer2 instanceof f) {
            Intrinsics.checkNotNull(yAxisRenderer2, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.HealthYAxisRenderer");
            ((f) yAxisRenderer2).u(limitLabelStyleSameAsAxis);
        }
    }

    public final void setNeedChangeMonthBar(boolean needChangeMonthBar) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof al1) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
            ((al1) dataRenderer).d(needChangeMonthBar);
        }
    }

    public final void setNormalGradientColor(@Nullable GradientColor color) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof al1) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
            ((al1) dataRenderer).i(color);
        }
    }

    public final void setOnChartScrolledCallback(@Nullable Function1<? super ChartScrollState, Unit> function1) {
        this.onChartScrolledCallback = function1;
    }

    public final void setOnHighestVisibleIndexChangeListener(@Nullable cjd listener) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof al1) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
            ((al1) dataRenderer).setOnHighestVisibleIndexChangeListener(listener);
        }
    }

    public final void setOnLowestVisibleIndexChangeListener(@Nullable rjd listener) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof al1) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
            ((al1) dataRenderer).setOnLowestVisibleIndexChangeListener(listener);
        }
    }

    public final void setOnMarkerViewVisibleChange(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onMarkerViewVisibleChange = function1;
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart
    public void setRadius(float radius) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof al1) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
            ((al1) dataRenderer).k(Utils.convertDpToPixel(radius));
        }
    }

    @Override // com.heytap.health.core.widget.charts.HealthCandleStickChart
    public void setSelected(int index) {
        this.selectedIndex = index;
        super.setSelected(index);
    }

    public final void setSelectedIndex(int i) {
        this.selectedIndex = i;
    }

    public final void setSpo2RangeStr(@Nullable String spo2RangeStr) {
        this.spo2RangeStr = spo2RangeStr;
    }

    public final void setUrgentGradientColor(@Nullable GradientColor color) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof al1) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
            ((al1) dataRenderer).l(color);
        }
    }

    public final void setWarnNumber(float warnNumber) {
        if (warnNumber > 100.0f || warnNumber < this.fixedYMin) {
            return;
        }
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof al1) {
            Intrinsics.checkNotNull(dataRenderer, "null cannot be cast to non-null type com.heytap.health.core.widget.charts.renderer.BloodOxCandleChartRenderer");
            ((al1) dataRenderer).n(warnNumber);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    public final void setYAxisLabel(float minValue) {
        setShowYAxisStartLine(true);
        if (minValue >= 90.0f) {
            setYAxisLabelCount(2);
            setYAxisMinimum(90.0f);
            setYAxisValues(new float[]{90.0f, 95.0f, 100.0f});
        } else {
            if (minValue == 0.0f) {
                setYAxisLabelCount(2);
                setYAxisMinimum(90.0f);
                setYAxisValues(new float[]{90.0f, 95.0f, 100.0f});
            } else if (minValue >= 80.0f) {
                setYAxisLabelCount(2);
                setYAxisMinimum(80.0f);
                setYAxisValues(new float[]{80.0f, 90.0f, 100.0f});
            } else {
                setYAxisLabelCount(3);
                setYAxisMinimum(70.0f);
                setYAxisValues(new float[]{70.0f, 80.0f, 90.0f, 100.0f});
            }
        }
        notifyDataSetChanged();
        invalidate();
    }

    @Override // com.heytap.health.core.widget.charts.HeartRateBarChart
    public void setYAxisMinimum(float min) {
        float f = this.fixedYMin;
        if (min < f) {
            min = f;
        }
        getAxisRight().setAxisMinimum(min);
    }

    public BloodOxCandleChart(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fixedYMin = 70.0f;
        this.selectedIndex = -1;
    }

    public BloodOxCandleChart(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fixedYMin = 70.0f;
        this.selectedIndex = -1;
    }
}