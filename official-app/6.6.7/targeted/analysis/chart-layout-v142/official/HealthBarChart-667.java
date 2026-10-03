package com.heytap.health.core.widget.charts;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.BarLineChartTouchListener;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.listener.HealthBarChartTouchListener;
import com.heytap.health.core.widget.charts.renderer.BaseBarChartRenderer;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.core.widget.charts.renderer.d;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.djd;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lx8;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.qp8;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import com.oplus.aiunit.vision.z8h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthBarChart extends ControllableOffsetBarChart {
    public float C;
    public float D;
    public int E;
    public GradientColor F;
    public int G;
    public int H;
    public boolean I;
    public TimeUnit J;
    public xp0 K;
    public xp0 L;
    public boolean M;
    public float N;

    public class a extends ValueFormatter {
        public a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getAxisLabel(float f, AxisBase axisBase) {
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
            xp0 xp0Var = HealthBarChart.this.K;
            return xp0Var != null ? xp0Var.a(i, f) : super.getAxisLabel(f, axisBase);
        }
    }

    public class b extends ValueFormatter {
        public b() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getAxisLabel(float f, AxisBase axisBase) {
            xp0 xp0Var;
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
            HealthBarChart healthBarChart = HealthBarChart.this;
            boolean z = healthBarChart.I;
            if ((z || i > 0) && (xp0Var = healthBarChart.L) != null) {
                if (!z) {
                    i--;
                }
                return xp0Var.a(i, f);
            }
            return super.getAxisLabel(f, axisBase);
        }
    }

    public class c extends ValueFormatter {
        public c() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getAxisLabel(float f, AxisBase axisBase) {
            xp0 xp0Var;
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
            HealthBarChart healthBarChart = HealthBarChart.this;
            boolean z = healthBarChart.I;
            if ((z || i > 0) && (xp0Var = healthBarChart.L) != null) {
                if (!z) {
                    i--;
                }
                return xp0Var.a(i, f);
            }
            return super.getAxisLabel(f, axisBase);
        }
    }

    public HealthBarChart(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(float f, NearUIConfig.Status status) {
        if (status == NearUIConfig.Status.UNFOLD) {
            f /= 2.0f;
        }
        setBarWidth(f);
    }

    public void A(BaseYAxisRenderer.LinePosition linePosition, float f) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer).z(linePosition, f);
        }
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererLeft;
        if (yAxisRenderer2 instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer2).z(linePosition, f);
        }
    }

    public void B(BaseYAxisRenderer.LinePosition linePosition, float f) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer).B(linePosition, f);
        }
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererLeft;
        if (yAxisRenderer2 instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer2).B(linePosition, f);
        }
    }

    public void C(boolean z, int i) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            this.M = z;
            ((d) dataRenderer).L(z, i);
        }
    }

    public void D(float f, String str, int i) {
        LimitLine limitLine = new LimitLine(f, str);
        limitLine.setLineWidth(0.7f);
        limitLine.setLineColor(i);
        limitLine.setTextColor(i);
        limitLine.enableDashedLine(jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f), 0.0f);
        getAxisRight().setDrawLimitLinesBehindData(true);
        getAxisRight().removeAllLimitLines();
        getAxisRight().addLimitLine(limitLine);
        notifyDataSetChanged();
        invalidate();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof sp8) {
            ((sp8) chartTouchListener).computeScroll();
            return;
        }
        if (chartTouchListener instanceof BarLineChartTouchListener) {
            ((BarLineChartTouchListener) chartTouchListener).computeScroll();
        } else if (chartTouchListener instanceof qp8) {
            ((qp8) chartTouchListener).computeScroll();
        } else if (chartTouchListener instanceof HealthBarChartTouchListener) {
            ((HealthBarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetBarChart
    public float getBarWidth() {
        return this.C;
    }

    public float getExtraXAxisSpace() {
        return this.N;
    }

    public float getRadius() {
        return this.D;
    }

    public float getVisibleRangeMaxValue() {
        return u(true);
    }

    public float getXAxisMaximum() {
        return getXAxis().getAxisMaximum() - (getBarWidth() / 2.0f);
    }

    public float getXAxisMinimum() {
        return getXAxis().getAxisMinimum() + (getBarWidth() / 2.0f);
    }

    public TimeUnit getXAxisTimeUnit() {
        return this.J;
    }

    public xp0 getXAxisValueFormatter() {
        return this.K;
    }

    public xp0 getYAxisValueFormatter() {
        return this.L;
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetBarChart, com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new d(this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererLeft = new f(this, this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new f(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new oya(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        A(BaseYAxisRenderer.LinePosition.CUSTOM_PERCENT, 0.922f);
        B(BaseYAxisRenderer.LinePosition.WITH_X, 0.0f);
        setForceRadiusHalfBarWidth(true);
    }

    public void q(boolean z) {
        m8b.f(CustomChartAnimator.TAG, "animateMarker");
        ChartAnimator chartAnimator = this.mAnimator;
        if (chartAnimator instanceof CustomChartAnimator) {
            ((CustomChartAnimator) chartAnimator).animateMarker(z);
        }
    }

    public void r() {
        this.E = ContextCompat.getColor(getContext(), R$color.lib_core_charts_heart_rate_line_start);
        setScaleEnabled(false);
        setPinchZoom(false);
        setDoubleTapToZoomEnabled(false);
        setHighlightPerDragEnabled(false);
        getLegend().setEnabled(false);
        getDescription().setEnabled(false);
        setUnbindEnabled(true);
        XAxis xAxis = getXAxis();
        xAxis.setDrawLabels(true);
        xAxis.setDrawAxisLine(false);
        xAxis.setLabelCount(this.H, true);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10.0f);
        xAxis.setGridLineWidth(0.7f);
        xAxis.setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        xAxis.setValueFormatter(new a());
        YAxis axisLeft = getAxisLeft();
        axisLeft.setEnabled(false);
        axisLeft.setDrawAxisLine(false);
        axisLeft.setDrawZeroLine(false);
        YAxis axisRight = getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawZeroLine(false);
        axisRight.setAxisMinimum(0.0f);
        axisRight.setLabelCount(this.I ? this.G : this.G + 1, true);
        ((f) this.mAxisRendererRight).H(false);
        axisRight.setValueFormatter(new b());
        axisLeft.setValueFormatter(new c());
        axisLeft.setGridLineWidth(0.7f);
        axisLeft.setTextSize(10.0f);
        axisRight.setGridLineWidth(0.7f);
        axisRight.setTextSize(10.0f);
        if (if0.y(getContext())) {
            Context context = getContext();
            int i = R$color.lib_core_charts_axis_label_night;
            xAxis.setTextColor(ContextCompat.getColor(context, i));
            Context context2 = getContext();
            int i2 = R$color.lib_core_charts_grid_line_night;
            xAxis.setGridColor(ContextCompat.getColor(context2, i2));
            axisRight.setGridColor(ContextCompat.getColor(getContext(), i2));
            axisRight.setTextColor(ContextCompat.getColor(getContext(), i));
            axisLeft.setGridColor(ContextCompat.getColor(getContext(), i2));
            axisLeft.setTextColor(ContextCompat.getColor(getContext(), i));
        } else {
            Context context3 = getContext();
            int i3 = R$color.lib_core_charts_axis_label;
            xAxis.setTextColor(ContextCompat.getColor(context3, i3));
            Context context4 = getContext();
            int i4 = R$color.lib_core_charts_grid_line;
            xAxis.setGridColor(ContextCompat.getColor(context4, i4));
            axisRight.setGridColor(ContextCompat.getColor(getContext(), i4));
            axisRight.setTextColor(ContextCompat.getColor(getContext(), i3));
            axisLeft.setGridColor(ContextCompat.getColor(getContext(), i4));
            axisLeft.setTextColor(ContextCompat.getColor(getContext(), i3));
        }
        f(true, false, true, false);
        n(24.0f, 0.0f, 35.0f, 0.0f);
    }

    public void s() {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).k(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBarColor(int i) {
        if (this.E == i) {
            return;
        }
        this.E = i;
        BarData barData = (BarData) getData();
        if (barData == null || barData.getDataSetCount() < 1) {
            return;
        }
        for (T t : barData.getDataSets()) {
            if (t instanceof BarDataSet) {
                ((BarDataSet) t).setColor(i);
            }
        }
        postInvalidate();
    }

    public void setBarData(List<TimeStampedData> list) {
        if (list == null || list.isEmpty()) {
            clear();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            TimeStampedData timeStampedData = list.get(i);
            arrayList.add(new HealthSingleBarEntry((float) (timeStampedData.getTimestamp() / this.J.getUnit()), timeStampedData.getY(), timeStampedData, timeStampedData.getColor(), timeStampedData.getGradientColor()));
        }
        setEntryList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBarGradientColor(GradientColor gradientColor) {
        this.F = gradientColor;
        BarData barData = (BarData) getData();
        if (barData == null || barData.getDataSetCount() < 1) {
            return;
        }
        if (gradientColor != null) {
            for (T t : barData.getDataSets()) {
                if (t instanceof BarDataSet) {
                    ((BarDataSet) t).setGradientColors(Collections.singletonList(gradientColor));
                }
            }
        } else {
            for (T t2 : barData.getDataSets()) {
                if (t2 instanceof BarDataSet) {
                    ((BarDataSet) t2).setGradientColors(null);
                }
            }
        }
        postInvalidate();
    }

    public void setBarStyle(BaseBarChartRenderer.BarStyle barStyle) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            ((d) dataRenderer).x(barStyle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.health.core.widget.charts.ControllableOffsetBarChart
    public void setBarWidth(float f) {
        if (this.C != f) {
            this.C = f;
            if (getData() != 0) {
                ((BarData) getData()).setBarWidth(f);
            }
            XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
            if (xAxisRenderer instanceof oya) {
                ((oya) xAxisRenderer).h(f);
            }
            super.setBarWidth(f);
        }
    }

    public void setDefaultBatHeightScale(float f) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            ((d) dataRenderer).K(f, getAxisRight().mAxisMinimum);
        }
    }

    public void setDrawAllBarShadow(boolean z) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof BaseBarChartRenderer) {
            ((BaseBarChartRenderer) dataRenderer).y(z);
        }
        setDrawBarShadow(z);
    }

    public void setEntryList(List<HealthSingleBarEntry> list) {
        if (!v(list)) {
            list = new ArrayList<>();
        }
        BarDataSet barDataSet = new BarDataSet(new ArrayList(list), "health bar data set");
        barDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        barDataSet.setColor(this.E);
        GradientColor gradientColor = this.F;
        if (gradientColor != null) {
            barDataSet.setGradientColors(Collections.singletonList(gradientColor));
        }
        barDataSet.setHighLightAlpha(0);
        barDataSet.setColor(this.E);
        barDataSet.setDrawValues(false);
        barDataSet.setDrawIcons(false);
        BarData barData = new BarData(barDataSet);
        barData.setBarWidth(this.C);
        setData(barData);
        postInvalidate();
    }

    public void setExtraXAxisSpace(float f) {
        this.N = f;
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).i(f);
        }
    }

    public void setForceGranularity(boolean z) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof lx8) {
            ((lx8) xAxisRenderer).d(z);
        }
    }

    public void setForceLabelMultipleOfGranularity(boolean z) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).j(z);
        }
    }

    public void setForceRadiusHalfBarWidth(boolean z) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof BaseBarChartRenderer) {
            ((BaseBarChartRenderer) dataRenderer).z(z);
        }
    }

    public void setGridLinePos(float[] fArr) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).e(fArr);
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void setMarker(IMarker iMarker) {
        if (iMarker instanceof MarkerView) {
            ((MarkerView) iMarker).setChartView(this);
        }
        super.setMarker(iMarker);
    }

    public void setNeedChangeMonthBar(boolean z) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            ((d) dataRenderer).N(z);
        }
    }

    public void setOnHighestVisibleIndexValueChangeListener(djd djdVar) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            ((d) dataRenderer).setOnHighestVisibleIndexValueChangeListener(djdVar);
        }
    }

    public void setRadius(float f) {
        this.D = f;
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof BaseBarChartRenderer) {
            ((BaseBarChartRenderer) dataRenderer).A(Utils.convertDpToPixel(f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(int i) {
        BarData barData = (BarData) getData();
        if (barData == null || barData.getDataSetCount() < 1 || !(barData.getDataSetByIndex(0) instanceof BarDataSet)) {
            return;
        }
        BarDataSet barDataSet = (BarDataSet) barData.getDataSetByIndex(0);
        if (i < 0 || i >= barDataSet.getEntryCount()) {
            return;
        }
        highlightValue(((BarEntry) barDataSet.getEntryForIndex(i)).getX(), 0);
    }

    public void setShowBarRoundTop(boolean z) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            ((d) dataRenderer).D(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setShowYAxisEndLine(boolean z) {
        BarData barData = (BarData) getData();
        if (barData == null || barData.getDataSetCount() < 1) {
            return;
        }
        ((f) this.mAxisRendererRight).G(z);
        ((f) this.mAxisRendererLeft).G(z);
        postInvalidate();
    }

    public void setShowYAxisStartLine(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        ((f) this.mAxisRendererRight).H(z);
        ((f) this.mAxisRendererLeft).H(z);
        postInvalidate();
    }

    public void setSingleBarColorChangeBean(z8h z8hVar) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            ((d) dataRenderer).P(z8hVar);
        }
    }

    public void setUseDefaultLabelPosition(boolean z) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer).D(z);
        }
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererLeft;
        if (yAxisRenderer2 instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer2).D(z);
        }
    }

    public void setVibrate(boolean z) {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof sp8) {
            ((sp8) chartTouchListener).c(z);
        } else if (chartTouchListener instanceof qp8) {
            ((qp8) chartTouchListener).g(z);
        } else if (chartTouchListener instanceof HealthBarChartTouchListener) {
            ((HealthBarChartTouchListener) chartTouchListener).n(z);
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f, float f2) {
        float f3 = this.C;
        float f4 = this.N;
        super.setVisibleXRange(f + f3 + (f4 * 2.0f), f2 + f3 + (f4 * 2.0f));
    }

    public void setXAxisLabelCount(int i) {
        if (this.H == i) {
            return;
        }
        this.H = i;
        getXAxis().setLabelCount(i, true);
        postInvalidate();
    }

    public void setXAxisLabelOffsetX(float f) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).l(f);
        }
    }

    public void setXAxisMaximum(float f) {
        getXAxis().setAxisMaximum(f + (getBarWidth() / 2.0f) + this.N);
        postInvalidate();
    }

    public void setXAxisMinimum(float f) {
        getXAxis().setAxisMinimum((f - (getBarWidth() / 2.0f)) - this.N);
        postInvalidate();
    }

    public void setXAxisTimeUnit(@NonNull TimeUnit timeUnit) {
        this.J = timeUnit;
    }

    public void setXAxisValueFormatter(xp0 xp0Var) {
        this.K = xp0Var;
    }

    public void setYAxisLabelCount(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        if (this.I) {
            getAxisRight().setLabelCount(i, true);
            getAxisLeft().setLabelCount(i, true);
        } else {
            int i2 = i + 1;
            getAxisRight().setLabelCount(i2, true);
            getAxisLeft().setLabelCount(i2, true);
        }
        postInvalidate();
    }

    public void setYAxisMaximum(float f) {
        getAxisRight().setAxisMaximum(f);
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof d) {
            ((d) dataRenderer).M(f);
        }
        postInvalidate();
    }

    public void setYAxisMinimum(float f) {
        getAxisRight().setAxisMinimum(f);
        postInvalidate();
    }

    public void setYAxisValueFormatter(xp0 xp0Var) {
        this.L = xp0Var;
    }

    public void setYInterval(float f) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer).t(f, false);
        }
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererLeft;
        if (yAxisRenderer2 instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer2).t(f, false);
        }
    }

    public void setYLabelsIndent(boolean z) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof f) {
            ((f) yAxisRenderer).K(z);
        }
        YAxisRenderer yAxisRenderer2 = this.mAxisRendererLeft;
        if (yAxisRenderer2 instanceof f) {
            ((f) yAxisRenderer2).K(z);
        }
    }

    public void t() {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof lx8) {
            ((lx8) xAxisRenderer).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float u(boolean z) {
        float lowestVisibleX = getLowestVisibleX();
        float highestVisibleX = getHighestVisibleX();
        if (!z && ((int) highestVisibleX) % 24 == 0) {
            highestVisibleX -= 1.0f;
        }
        IDataSet iDataSet = (IDataSet) ((BarData) getData()).getDataSets().get(0);
        int iW = w(iDataSet, lowestVisibleX);
        int iW2 = w(iDataSet, highestVisibleX);
        if (iW < 0) {
            iW = Math.abs(iW) - 5;
        }
        if (iW2 < 0) {
            iW2 = Math.abs(iW2) + 5;
        }
        int iMin = Math.min(iDataSet.getEntryCount() - 1, iW2);
        float f = 0.0f;
        for (int iMax = Math.max(0, iW); iMax <= iMin; iMax++) {
            float x = iDataSet.getEntryForIndex(iMax).getX();
            if (x > lowestVisibleX && x < highestVisibleX) {
                float y = ((TimeStampedData) iDataSet.getEntryForIndex(iMax).getData()).getY();
                if (y >= f) {
                    f = y;
                }
            }
        }
        return f;
    }

    public final boolean v(List<HealthSingleBarEntry> list) {
        if (list == null) {
            return false;
        }
        Iterator<HealthSingleBarEntry> it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                it.remove();
            }
        }
        return true;
    }

    public int w(@NonNull IDataSet iDataSet, float f) {
        int entryCount = iDataSet.getEntryCount() - 1;
        int i = 0;
        while (i <= entryCount) {
            int i2 = ((entryCount - i) >> 1) + i;
            float x = iDataSet.getEntryForIndex(i2).getX();
            if (x < f) {
                i = i2 + 1;
            } else {
                if (x <= f) {
                    return i2;
                }
                entryCount = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public boolean x() {
        return this.M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void z(final float f, Context context) {
        if (context instanceof LifecycleOwner) {
            com.heytap.health.base.resposiveui.config.a.m(context).q().observe((LifecycleOwner) context, new Observer() { // from class: com.oplus.aiunit.vision.pp8
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.y(f, (NearUIConfig.Status) obj);
                }
            });
        } else {
            setBarWidth(f);
        }
    }

    public HealthBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = 0.85f;
        this.D = 0.0f;
        this.G = 2;
        this.H = 5;
        this.I = false;
        this.J = TimeUnit.ORIGINAL;
        this.N = 0.0f;
        r();
    }
}