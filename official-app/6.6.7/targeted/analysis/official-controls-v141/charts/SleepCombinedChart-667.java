package com.heytap.health.core.widget.charts;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.heytap.health.core.widget.charts.SleepCombinedChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.dfh;
import com.oplus.aiunit.vision.efh;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.ifh;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.w0b;
import com.oplus.aiunit.vision.xp0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class SleepCombinedChart extends ControllableOffsetCombinedChart implements IFillFormatter {
    public static final int LINE_DRAW_MODE_HEART_RATE = 1;
    public static final int LINE_DRAW_MODE_NULL = 0;
    public static final int LINE_DRAW_MODE_SPO2 = 2;
    public static final int SLEEP_ABNORMAL = 0;
    public static final int SLEEP_NORMAL = 1;
    public final String F;
    public double G;
    public TimeUnit H;
    public XAxis I;
    public YAxis J;
    public xp0 K;
    public xp0 L;
    public float[] M;
    public int N;
    public boolean O;
    public List<GradientColor> P;
    public int Q;
    public float R;
    public int S;
    public float T;
    public int U;
    public Map<Integer, Integer> V;
    public float[] W;

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
            SleepCombinedChart sleepCombinedChart = SleepCombinedChart.this;
            xp0 xp0Var = sleepCombinedChart.K;
            if (xp0Var != null) {
                return xp0Var.a(i, sleepCombinedChart.G + ((double) f));
            }
            double d = f;
            long unit = (long) (sleepCombinedChart.H.getUnit() * d);
            if (SleepCombinedChart.this.getXStart() != 0.0d) {
                unit = (long) ((d + SleepCombinedChart.this.getXStart()) * SleepCombinedChart.this.H.getUnit());
            }
            return DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), o15.DATE_FORMAT_HOUR), new Date(unit)).toString();
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
            SleepCombinedChart sleepCombinedChart = SleepCombinedChart.this;
            boolean z = sleepCombinedChart.O;
            if ((z || i > 0) && (xp0Var = sleepCombinedChart.L) != null) {
                if (!z) {
                    i--;
                }
                return xp0Var.a(i, f);
            }
            return super.getAxisLabel(f, axisBase);
        }
    }

    public SleepCombinedChart(Context context) {
        super(context);
        this.F = "SleepCombinedChart";
        this.H = TimeUnit.MINUTE;
        this.M = new float[8];
        this.N = 2;
        this.O = false;
        this.R = 1.5f;
        this.T = 1.5f;
        this.U = 0;
        this.V = new Hashtable();
        this.W = new float[]{0.5f, 2.5f, 4.5f, 6.5f, 8.5f};
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(ValueAnimator valueAnimator) {
        postInvalidate();
    }

    public static /* synthetic */ String B(int i, double d) {
        return ((int) d) + "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ValueAnimator valueAnimator) {
        postInvalidate();
    }

    private void setSleepCombinedDataParameter(efh efhVar) {
        ifh ifhVarD = efhVar.d();
        ifhVarD.setDrawValues(false);
        ifhVarD.setHighlightEnabled(true);
        ifhVarD.setHighLightAlpha(0);
        YAxis.AxisDependency axisDependency = YAxis.AxisDependency.RIGHT;
        ifhVarD.setAxisDependency(axisDependency);
        ifhVarD.setGradientColors(this.P);
        if (if0.y(getContext())) {
            Context context = getContext();
            int i = R$color.lib_core_charts_heart_rate_day_line_night;
            this.Q = ContextCompat.getColor(context, i);
            this.S = ContextCompat.getColor(getContext(), i);
        } else {
            Context context2 = getContext();
            int i2 = R$color.lib_core_charts_heart_rate_day_line;
            this.Q = ContextCompat.getColor(context2, i2);
            this.S = ContextCompat.getColor(getContext(), i2);
        }
        LineDataSet lineDataSetA = efhVar.a();
        lineDataSetA.setDrawCircleHole(false);
        lineDataSetA.setDrawCircles(false);
        lineDataSetA.setDrawValues(false);
        lineDataSetA.setDrawHighlightIndicators(false);
        lineDataSetA.setColor(this.Q);
        lineDataSetA.setLineWidth(this.R);
        lineDataSetA.setDrawFilled(false);
        lineDataSetA.setHighlightEnabled(false);
        lineDataSetA.setAxisDependency(axisDependency);
        LineDataSet.Mode mode = LineDataSet.Mode.HORIZONTAL_BEZIER;
        lineDataSetA.setMode(mode);
        LineDataSet lineDataSetE = efhVar.e();
        lineDataSetE.setMode(mode);
        lineDataSetE.setDrawCircleHole(false);
        lineDataSetE.setDrawCircles(false);
        lineDataSetE.setDrawValues(false);
        lineDataSetE.setDrawHighlightIndicators(false);
        lineDataSetE.setColor(this.S);
        lineDataSetE.setLineWidth(this.T);
        lineDataSetE.setDrawFilled(false);
        lineDataSetE.setHighlightEnabled(false);
        lineDataSetE.setAxisDependency(axisDependency);
    }

    private void setXAxisMinAndMax(List<SleepUnitData> list) {
        SleepUnitData sleepUnitData = list.get(list.size() - 1);
        if (sleepUnitData.getDuration() > 0) {
            this.I.setAxisMaximum((float) (this.H.timeStampToUnitDouble(sleepUnitData.getTimestamp() + sleepUnitData.getDuration()) - getXStart()));
        } else {
            this.I.setAxisMaximum((float) (this.H.timeStampToUnitDouble(sleepUnitData.getTimestamp()) - getXStart()));
        }
        BaseYAxisRenderer.LinePosition linePosition = BaseYAxisRenderer.LinePosition.WITH_X;
        l(linePosition, this.I.mAxisMaximum);
        m(linePosition, this.I.mAxisMinimum);
    }

    public void C(List<SleepUnitData> list, List<TimeStampedData> list2, List<TimeStampedData> list3) {
        if (w0b.a(list) || list2 == null || list3 == null) {
            clear();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("setChartData:");
        sb.append(list.size());
        sb.append("/");
        sb.append(list2.size());
        sb.append("/");
        sb.append(list3.size());
        this.I.setAxisMinimum(0.0f);
        setXStart(this.H.timeStampToUnitDouble(list.get(0).getTimestamp()));
        setXAxisMinAndMax(list);
        D(list2, list3);
        efh efhVar = new efh();
        efhVar.g(list, this.G, this.H, this.M);
        efhVar.f(list2, list3, this.H, this.G);
        setSleepCombinedDataParameter(efhVar);
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof dfh) {
            ((dfh) dataRenderer).c(this.U);
        }
        setData((CombinedData) efhVar);
    }

    public final void D(List<TimeStampedData> list, List<TimeStampedData> list2) {
        int i = this.U;
        if (i == 1) {
            if (w0b.a(list)) {
                this.W = new float[]{40.0f, 120.0f};
            } else {
                float y = 0.0f;
                float y2 = 0.0f;
                for (TimeStampedData timeStampedData : list) {
                    if (timeStampedData.getY() > y2) {
                        y2 = timeStampedData.getY();
                    }
                    if (y == 0.0f || y > timeStampedData.getY()) {
                        y = timeStampedData.getY();
                    }
                }
                this.W = new float[]{((int) (y / 20.0f)) * 20, (((int) (y2 / 20.0f)) * 20) + 20};
            }
            this.J.setDrawLabels(true);
        } else if (i == 2) {
            float y3 = 100.0f;
            if (!w0b.a(list2)) {
                for (TimeStampedData timeStampedData2 : list2) {
                    if (timeStampedData2.getY() < y3) {
                        y3 = timeStampedData2.getY();
                    }
                }
            }
            if (y3 >= 80.0f) {
                this.W = new float[]{80.0f, 85.0f, 90.0f, 95.0f, 100.0f};
            } else {
                this.W = new float[]{60.0f, 70.0f, 80.0f, 90.0f, 100.0f};
            }
            this.J.setDrawLabels(true);
        } else {
            this.J.setDrawLabels(false);
        }
        float[] fArr = this.W;
        float f = fArr[0];
        float f2 = fArr[fArr.length - 1];
        StringBuilder sb = new StringBuilder();
        sb.append("original minY:");
        sb.append(f);
        sb.append("/max:");
        sb.append(f2);
        float f3 = (f2 - f) / 2.0f;
        float f4 = f3 / 2.0f;
        float f5 = f4 / 2.0f;
        float f6 = f4 / 4.0f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("halved:");
        sb2.append(f3);
        sb2.append("/");
        sb2.append(f4);
        sb2.append("/");
        sb2.append(f5);
        sb2.append("/");
        sb2.append(f6);
        for (int i2 = 0; i2 < 4; i2++) {
            float f7 = (i2 * f4) + f6 + f;
            float[] fArr2 = this.M;
            int i3 = i2 * 2;
            fArr2[i3] = f7;
            fArr2[i3 + 1] = f7 + f5;
        }
        for (int i4 = 0; i4 < this.M.length; i4++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("sleepYRange:");
            sb3.append(this.M[i4]);
        }
        this.J.setAxisMinimum(f);
        this.J.setAxisMaximum(f2);
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        return getAxisRight().getAxisMinimum();
    }

    public Map<Integer, Integer> getSleepDrawModelMap() {
        return this.V;
    }

    public TimeUnit getXAxisTimeUnit() {
        return this.H;
    }

    public double getXStart() {
        return this.G;
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart, com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mDrawOrder = new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.SCATTER};
        this.mRenderer = new dfh(this, new CustomChartAnimator(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.bfh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.j(valueAnimator);
            }
        }), new CustomChartAnimator(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.cfh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.A(valueAnimator);
            }
        }), this.mViewPortHandler);
        this.mAxisRendererLeft = new nya(this, this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new nya(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new oya(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        l(BaseYAxisRenderer.LinePosition.CUSTOM_PERCENT, 0.922f);
        m(BaseYAxisRenderer.LinePosition.END, 0.0f);
        this.P = new ArrayList();
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof dfh) {
            com.heytap.health.core.widget.charts.renderer.a bloodOxLineChartRenderer = ((dfh) dataRenderer).a().getBloodOxLineChartRenderer();
            if (if0.y(getContext())) {
                bloodOxLineChartRenderer.S(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_blood_ox_candle_normal_start_color_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_blood_ox_candle_normal_end_color_night)));
                Context context = getContext();
                int i = R$color.lib_core_charts_blood_ox_candle_warn_start_color_night;
                bloodOxLineChartRenderer.W(new GradientColor(ContextCompat.getColor(context, i), ContextCompat.getColor(getContext(), i)));
                bloodOxLineChartRenderer.U(new GradientColor(ContextCompat.getColor(getContext(), i), ContextCompat.getColor(getContext(), i)));
            } else {
                bloodOxLineChartRenderer.S(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_blood_ox_candle_normal_start_color_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_blood_ox_candle_normal_end_color_night)));
                Context context2 = getContext();
                int i2 = R$color.lib_core_charts_blood_ox_candle_warn_start_color_night;
                bloodOxLineChartRenderer.W(new GradientColor(ContextCompat.getColor(context2, i2), ContextCompat.getColor(getContext(), i2)));
                bloodOxLineChartRenderer.U(new GradientColor(ContextCompat.getColor(getContext(), i2), ContextCompat.getColor(getContext(), i2)));
            }
            this.P.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_end)));
            this.P.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_end)));
            this.P.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_end_green)));
            this.P.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_end)));
            this.P.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_un_select_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_un_select_end_green)));
        }
    }

    public void setLineDrawModel(int i) {
        this.U = i;
    }

    public void setXAxisValueFormatter(xp0 xp0Var) {
        this.K = xp0Var;
    }

    public void setXStart(double d) {
        this.G = d;
    }

    public void setYAxisValueFormatter(xp0 xp0Var) {
        this.L = xp0Var;
    }

    public void w() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof dfh) {
            ((dfh) dataRenderer).d();
        }
    }

    public final void x() {
        setExtraTopOffset(54.0f);
        setExtraLeftOffset(0.0f);
        setExtraRightOffset(0.0f);
        setExtraBottomOffset(0.0f);
        XAxis xAxis = getXAxis();
        this.I = xAxis;
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        this.I.setDrawLabels(true);
        this.I.setDrawAxisLine(false);
        this.I.setDrawGridLines(true);
        this.I.setLabelCount(this.N);
        this.I.setTextSize(10.0f);
        this.I.setGridLineWidth(0.7f);
        this.I.setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        YAxis axisRight = getAxisRight();
        this.J = axisRight;
        axisRight.setDrawAxisLine(false);
        this.J.setDrawZeroLine(false);
        this.J.setDrawGridLines(true);
        this.J.setDrawLabels(true);
        this.J.setLabelCount(5, true);
        this.J.setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        getAxisLeft().setEnabled(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        setHighlightPerDragEnabled(false);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        y();
        z();
        this.V.put(1, 1);
        this.V.put(2, 1);
        this.V.put(3, 1);
        this.V.put(4, 1);
        if (if0.y(getContext())) {
            XAxis xAxis2 = this.I;
            Context context = getContext();
            int i = R$color.lib_core_charts_axis_label_night;
            xAxis2.setTextColor(ContextCompat.getColor(context, i));
            XAxis xAxis3 = this.I;
            Context context2 = getContext();
            int i2 = R$color.lib_core_charts_grid_line_night;
            xAxis3.setGridColor(ContextCompat.getColor(context2, i2));
            this.J.setGridColor(ContextCompat.getColor(getContext(), i2));
            this.J.setTextColor(ContextCompat.getColor(getContext(), i));
        } else {
            XAxis xAxis4 = this.I;
            Context context3 = getContext();
            int i3 = R$color.lib_core_charts_axis_label;
            xAxis4.setTextColor(ContextCompat.getColor(context3, i3));
            XAxis xAxis5 = this.I;
            Context context4 = getContext();
            int i4 = R$color.lib_core_charts_grid_line;
            xAxis5.setGridColor(ContextCompat.getColor(context4, i4));
            this.J.setGridColor(ContextCompat.getColor(getContext(), i4));
            this.J.setTextColor(ContextCompat.getColor(getContext(), i3));
        }
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof dfh) {
            ((dfh) dataRenderer).b().j(this.V);
        }
        e(true, false, true, false);
        p(24.0f, 0.0f, 34.0f, 0.0f);
    }

    public final void y() {
        this.I.setValueFormatter(new a());
    }

    public final void z() {
        setYAxisValueFormatter(new xp0() { // from class: com.oplus.aiunit.vision.afh
            @Override // com.oplus.aiunit.vision.xp0
            public final String a(int i, double d) {
                return SleepCombinedChart.B(i, d);
            }
        });
        this.J.setValueFormatter(new b());
    }

    @Override // com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.Chart
    public void setData(CombinedData combinedData) {
        super.setData(combinedData);
        invalidate();
    }

    public SleepCombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = "SleepCombinedChart";
        this.H = TimeUnit.MINUTE;
        this.M = new float[8];
        this.N = 2;
        this.O = false;
        this.R = 1.5f;
        this.T = 1.5f;
        this.U = 0;
        this.V = new Hashtable();
        this.W = new float[]{0.5f, 2.5f, 4.5f, 6.5f, 8.5f};
        x();
    }

    public SleepCombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = "SleepCombinedChart";
        this.H = TimeUnit.MINUTE;
        this.M = new float[8];
        this.N = 2;
        this.O = false;
        this.R = 1.5f;
        this.T = 1.5f;
        this.U = 0;
        this.V = new Hashtable();
        this.W = new float[]{0.5f, 2.5f, 4.5f, 6.5f, 8.5f};
        x();
    }
}