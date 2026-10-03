package com.heytap.health.core.widget.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Pair;
import androidx.annotation.ColorInt;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.SleepDailyEntry;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.ifh;
import com.oplus.aiunit.vision.jfh;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.okh;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class SleepDetailsChart extends HealthBarChart {
    public double O;
    public xp0 P;
    public float Q;
    public List<SleepUnitData> R;
    public CustomChartAnimator S;
    public ObjectAnimator T;
    public boolean U;
    public ifh V;

    public class a extends ValueFormatter {
        public a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getAxisLabel(float f, AxisBase axisBase) {
            super.getAxisLabel(f, axisBase);
            int i = 0;
            while (true) {
                float[] fArr = axisBase.mEntries;
                if (i >= fArr.length) {
                    i = -1;
                    break;
                }
                if (f == fArr[i]) {
                    break;
                }
                i++;
            }
            if (SleepDetailsChart.this.P != null) {
                return SleepDetailsChart.this.P.a(i, ((double) f) + SleepDetailsChart.this.getXStart());
            }
            double d = f;
            long unit = (long) (SleepDetailsChart.this.J.getUnit() * d);
            if (SleepDetailsChart.this.getXStart() != 0.0d) {
                unit = (long) ((d + SleepDetailsChart.this.getXStart()) * SleepDetailsChart.this.J.getUnit());
            }
            return DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), o15.DATE_FORMAT_HOUR), new Date(unit)).toString();
        }
    }

    public SleepDetailsChart(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        if (L() && !M() && getVisibility() == 0) {
            this.T = this.S.animateY2(500);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(ValueAnimator valueAnimator) {
        invalidate();
    }

    public final float[] H(float f, float f2) {
        YAxis axisRight = getAxisRight();
        float f3 = f * 2.0f;
        float f4 = 2.0f * f2;
        float f5 = f * 3.0f;
        return new float[]{axisRight.getAxisMinimum(), f, f + f2, f3 + f2, f3 + f4, f4 + f5, f5 + (f2 * 3.0f), axisRight.getAxisMaximum()};
    }

    public final float I(SleepUnitData sleepUnitData) {
        if (sleepUnitData == null) {
            return 0.0f;
        }
        int type = sleepUnitData.getType();
        if (type == 1) {
            return 1.0f;
        }
        if (type == 2) {
            return 3.0f;
        }
        if (type != 3) {
            return type != 4 ? 0.0f : 7.0f;
        }
        return 5.0f;
    }

    public final Pair<Float, Float> J(int i, float f, float f2) {
        YAxis axisRight = getAxisRight();
        if (i == 1) {
            return new Pair<>(Float.valueOf(axisRight.getAxisMinimum()), Float.valueOf(f));
        }
        if (i == 2) {
            float f3 = f2 + f;
            return new Pair<>(Float.valueOf(f3), Float.valueOf(f3 + f));
        }
        if (i != 3) {
            return new Pair<>(Float.valueOf((f * 3.0f) + (f2 * 3.0f)), Float.valueOf(axisRight.getAxisMaximum()));
        }
        float f4 = (f * 2.0f) + (f2 * 2.0f);
        return new Pair<>(Float.valueOf(f4), Float.valueOf(f4 + f));
    }

    public final float K(SleepUnitData sleepUnitData) {
        if (sleepUnitData == null) {
            return 1.0f;
        }
        int type = sleepUnitData.getType();
        if (type == 1) {
            return 2.0f;
        }
        if (type == 2) {
            return 4.0f;
        }
        if (type != 3) {
            return type != 4 ? 1.0f : 8.0f;
        }
        return 6.0f;
    }

    public boolean L() {
        List<SleepUnitData> list = this.R;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean M() {
        ObjectAnimator objectAnimator = this.T;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public void O(int i) {
        List<SleepUnitData> list = this.R;
        if (list == null || list.isEmpty() || i < 0 || i >= this.R.size()) {
            return;
        }
        moveViewToX((float) ((this.R.get(i).getTimestamp() / this.J.getUnit()) - this.O));
    }

    public void P(List<SleepUnitData> list, float f, float f2) {
        if (list == null || list.isEmpty()) {
            clear();
            this.R = null;
            return;
        }
        YAxis axisRight = getAxisRight();
        axisRight.setAxisMinimum(0.0f);
        axisRight.setAxisMaximum((4.0f * f) + (3.0f * f2));
        getXAxis().setAxisMinimum(this.Q + 0.0f);
        setXStart(this.J.timeStampToUnitDouble(list.get(0).getTimestamp()));
        this.R = list;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SleepUnitData sleepUnitData = list.get(i);
            Pair<Float, Float> pairJ = J(sleepUnitData.getType(), f, f2);
            arrayList.add(new SleepDailyEntry((float) ((this.J.timeStampToUnitDouble(sleepUnitData.getTimestamp()) - this.O) + ((double) this.Q)), (float) (sleepUnitData.getDuration() / this.J.getUnit()), ((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue(), sleepUnitData));
        }
        ifh ifhVar = new ifh(arrayList, "Sleep daily chart");
        this.V = ifhVar;
        ifhVar.setDrawValues(false);
        this.V.setHighlightEnabled(true);
        this.V.setHighLightAlpha(0);
        this.V.setAxisDependency(YAxis.AxisDependency.RIGHT);
        ArrayList arrayList2 = new ArrayList();
        if (if0.y(getContext())) {
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_start_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_end_night)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_start_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_end_night)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_start_green_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_end_green_night)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_start_green_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_end_green_night)));
        } else {
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_end)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_end)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_end_green)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_end_green)));
        }
        this.V.setGradientColors(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.V);
        BarData barData = new BarData(arrayList3);
        SleepUnitData sleepUnitData2 = list.get(list.size() - 1);
        if (sleepUnitData2.getDuration() > 0) {
            getXAxis().setAxisMaximum(((float) (this.J.timeStampToUnitDouble(sleepUnitData2.getTimestamp() + sleepUnitData2.getDuration()) - getXStart())) + this.Q);
        } else {
            getXAxis().setAxisMaximum(((float) (this.J.timeStampToUnitDouble(sleepUnitData2.getTimestamp()) - getXStart())) + this.Q);
        }
        if (this.U) {
            ((okh) this.mRenderer).f(H(f, f2));
        }
        this.S.setPhaseY(0.0f);
        setData(barData);
    }

    public void Q() {
        if (L() && !M()) {
            if (getVisibility() != 0 || getParent() == null) {
                post(new Runnable() { // from class: com.oplus.aiunit.vision.mkh
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.N();
                    }
                });
            } else {
                this.T = this.S.animateY2(500);
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        return super.getHighestVisibleX();
    }

    public float getPhaseY() {
        return this.S.getPhaseY();
    }

    public float getXMinuteOffset() {
        return this.Q;
    }

    public double getXStart() {
        return this.O;
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart, com.heytap.health.core.widget.charts.ControllableOffsetBarChart, com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        CustomChartAnimator customChartAnimator = new CustomChartAnimator(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.nkh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.k(valueAnimator);
            }
        });
        this.S = customChartAnimator;
        this.mRenderer = new okh(this, customChartAnimator, this.mViewPortHandler);
        this.mAxisRendererLeft = new f(this, this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new f(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new jfh(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        ((okh) this.mRenderer).h(ContextCompat.getColor(getContext(), R$color.lib_core_charts_heart_rate_day_middle_bar_night));
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetBarChart
    public void m() {
        ObjectAnimator objectAnimator = this.T;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.S.setPhaseY(0.0f);
        invalidate();
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void r() {
        super.r();
        setExtraTopOffset(55.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setExtraBottomOffset(0.0f);
        getAxisLeft().setEnabled(false);
        YAxis axisRight = getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawZeroLine(false);
        axisRight.setDrawGridLines(true);
        axisRight.setDrawLabels(false);
        axisRight.setAxisMinimum(0.5f);
        axisRight.setAxisMaximum(8.5f);
        axisRight.setLabelCount(5, true);
        ((f) this.mAxisRendererRight).H(true);
        axisRight.setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        XAxis xAxis = getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawGridLines(true);
        xAxis.setDrawLabels(true);
        xAxis.setTextSize(10.0f);
        xAxis.setAvoidFirstLastClipping(true);
        this.J = TimeUnit.MINUTE;
        xAxis.setValueFormatter(new a());
        setBarWidth(0.0f);
        f(true, false, true, true);
        n(0.0f, 0.0f, 0.0f, 0.0f);
        setHighlightPerTapEnabled(true);
        setHighlightPerDragEnabled(false);
    }

    public void setBgColor(@ColorInt int i) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof okh) {
            ((okh) dataRenderer).g(i);
        }
    }

    public void setDrawBg(boolean z) {
        this.U = z;
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setRadius(float f) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof okh) {
            ((okh) dataRenderer).i(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setSelected(int i) {
        ifh ifhVar;
        List<SleepUnitData> list = this.R;
        if (list == null || list.isEmpty() || i < 0 || i >= this.R.size() || (ifhVar = this.V) == null) {
            return;
        }
        highlightValue(((BarEntry) ifhVar.getEntryForIndex(i)).getX(), 0);
    }

    public void setSleepData(List<SleepUnitData> list) {
        if (list == null || list.isEmpty()) {
            clear();
            this.R = null;
            return;
        }
        getXAxis().setAxisMinimum(this.Q + 0.0f);
        setXStart(this.J.timeStampToUnitDouble(list.get(0).getTimestamp()));
        this.R = list;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            SleepUnitData sleepUnitData = list.get(i);
            arrayList.add(new SleepDailyEntry((float) ((this.J.timeStampToUnitDouble(sleepUnitData.getTimestamp()) - this.O) + ((double) this.Q)), (float) (sleepUnitData.getDuration() / this.J.getUnit()), I(sleepUnitData), K(sleepUnitData), sleepUnitData));
        }
        ifh ifhVar = new ifh(arrayList, "Sleep daily chart");
        this.V = ifhVar;
        ifhVar.setDrawValues(false);
        this.V.setHighlightEnabled(true);
        this.V.setHighLightAlpha(0);
        this.V.setAxisDependency(YAxis.AxisDependency.RIGHT);
        ArrayList arrayList2 = new ArrayList();
        if (if0.y(getContext())) {
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_start_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_end_night)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_start_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_end_night)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_start_green_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_end_green_night)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_start_green_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_end_green_night)));
        } else {
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_end)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_end)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_end_green)));
            arrayList2.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_end_green)));
        }
        this.V.setGradientColors(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.V);
        BarData barData = new BarData(arrayList3);
        SleepUnitData sleepUnitData2 = list.get(list.size() - 1);
        if (sleepUnitData2.getDuration() > 0) {
            getXAxis().setAxisMaximum(((float) (this.J.timeStampToUnitDouble(sleepUnitData2.getTimestamp() + sleepUnitData2.getDuration()) - getXStart())) + this.Q);
        } else {
            getXAxis().setAxisMaximum(((float) (this.J.timeStampToUnitDouble(sleepUnitData2.getTimestamp()) - getXStart())) + this.Q);
        }
        this.S.setPhaseY(0.0f);
        setData(barData);
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setXAxisValueFormatter(xp0 xp0Var) {
        this.P = xp0Var;
    }

    public void setXMinuteOffset(float f) {
        this.Q = f;
    }

    public void setXStart(double d) {
        this.O = d;
    }

    public SleepDetailsChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepDetailsChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O = 0.0d;
        this.Q = 0.0f;
        this.U = false;
    }
}