package com.heytap.health.core.widget.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.BarLineChartTouchListener;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.health.base.R$color;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.HeartRateCandleEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.listener.HealthBarChartTouchListener;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.heytap.health.lib_chart.R$drawable;
import com.oplus.aiunit.vision.e3k;
import com.oplus.aiunit.vision.hya;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.iya;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.nya;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.qid;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class LineCandleCombinedChart extends ControllableOffsetCombinedChart implements IFillFormatter {
    public double F;
    public TimeUnit G;
    public XAxis H;
    public YAxis I;
    public int J;
    public Drawable K;
    public int L;
    public Drawable M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public xp0 d0;
    public xp0 e0;
    public boolean f0;
    public float g0;
    public float h0;
    public int i0;
    public int j0;
    public LineDataSet.Mode k0;
    public float l0;

    public class a extends ValueFormatter {
        public final Map<String, String> a = new HashMap();

        public a() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getAxisLabel(float f, AxisBase axisBase) {
            if (LineCandleCombinedChart.this.d0 == null) {
                return super.getAxisLabel(f, axisBase);
            }
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
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("_");
            double d = f;
            sb.append(LineCandleCombinedChart.this.F + d);
            String string = sb.toString();
            String str = this.a.get(string);
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            LineCandleCombinedChart lineCandleCombinedChart = LineCandleCombinedChart.this;
            String strA = lineCandleCombinedChart.d0.a(i, lineCandleCombinedChart.F + d);
            this.a.put(string, strA);
            return strA;
        }
    }

    public class b extends ValueFormatter {
        public final Map<String, String> a = new HashMap();

        public b() {
        }

        @Override // com.github.mikephil.charting.formatter.ValueFormatter
        public String getAxisLabel(float f, AxisBase axisBase) {
            if (LineCandleCombinedChart.this.e0 == null) {
                return super.getAxisLabel(f, axisBase);
            }
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
            boolean z = LineCandleCombinedChart.this.f0;
            if (!z && i <= 0) {
                return super.getAxisLabel(f, axisBase);
            }
            if (!z) {
                i--;
            }
            String str = i + "_" + f;
            String str2 = this.a.get(str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String strA = LineCandleCombinedChart.this.e0.a(i, f);
            this.a.put(str, strA);
            return strA;
        }
    }

    public LineCandleCombinedChart(Context context) {
        super(context);
        this.G = TimeUnit.ORIGINAL;
        this.U = 1.5f;
        this.V = 1.3f;
        this.W = true;
        this.a0 = false;
        this.b0 = false;
        this.c0 = true;
        this.f0 = false;
        this.g0 = 0.0f;
        this.h0 = 1.5f;
        this.i0 = 5;
        this.j0 = 3;
        this.k0 = LineDataSet.Mode.HORIZONTAL_BEZIER;
        this.l0 = 0.0f;
        s();
    }

    public final void A() {
        this.I.setValueFormatter(new b());
    }

    public boolean B() {
        return this.a0;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    public final boolean C(float f, float f2, float f3, float f4) {
        float[] fArr = {f, f4, f3, f2};
        getTransformer(((CombinedData) this.mData).getDataSetByIndex(0).getAxisDependency()).pointValuesToPixel(fArr);
        return Math.abs(fArr[3] - fArr[1]) < Math.abs(fArr[2] - fArr[0]);
    }

    public void D() {
        this.mIndicesToHighlight = null;
        this.mChartTouchListener.setLastHighlighted(null);
        invalidate();
    }

    public void E(double d) {
        super.moveViewToX((float) (d - this.F));
    }

    public void F(float f) {
        super.moveViewToX(f);
    }

    public void G(float f, float f2) {
        float fConvertDpToPixel = (Utils.convertDpToPixel(f) * f2) / (getWindowWidthInPx() - (Utils.convertDpToPixel(16) + Utils.convertDpToPixel(50)));
        this.g0 = fConvertDpToPixel;
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            ((hya) dataRenderer).j(fConvertDpToPixel);
        }
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).h(this.g0);
        }
        super.setBarWidth(this.g0);
    }

    public CombinedData H(List<TimeStampedData> list, List<e3k> list2, boolean z) {
        TimeUnit xAxisTimeUnit = getXAxisTimeUnit() != null ? getXAxisTimeUnit() : TimeUnit.ORIGINAL;
        if (getXAxisTimeUnit() == TimeUnit.ORIGINAL) {
            return I(v(list), u(list2));
        }
        iya iyaVar = new iya();
        iyaVar.g(xAxisTimeUnit, getXStart(), list, this.h0);
        iyaVar.d(xAxisTimeUnit, getXStart(), list2);
        if (z) {
            setCombinedData(iyaVar);
        }
        return iyaVar;
    }

    public iya I(List<Entry> list, List<CandleEntry> list2) {
        iya iyaVar = new iya();
        iyaVar.h(list, this.h0);
        iyaVar.e(list2);
        setCombinedData(iyaVar);
        return iyaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J() {
        if (getCombinedData() == null || getCombinedData().getLineData() == null) {
            this.k0 = LineDataSet.Mode.LINEAR;
            return;
        }
        LineDataSet lineDataSet = (LineDataSet) getCombinedData().getLineData().getDataSetByIndex(0);
        lineDataSet.setDrawCircles(true);
        lineDataSet.setDrawCircleHole(true);
        lineDataSet.setCircleColor(this.J);
        lineDataSet.setCircleHoleColor(this.S);
        lineDataSet.setCircleRadius(3.0f);
        lineDataSet.setMode(LineDataSet.Mode.LINEAR);
    }

    public void K(boolean z, boolean z2) {
        this.W = z;
        this.a0 = z2;
        setLineTouchable(z);
        setCandleTouchable(z2);
        setLineHighLightEnabled(z);
        setCandleHighlightEnabled(z2);
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            ((hya) dataRenderer).g().u(z);
            ((hya) this.mRenderer).b().r(z2);
        }
        invalidate();
    }

    public void L(int i, boolean z) {
        getXAxis().setLabelCount(i, z);
        postInvalidate();
    }

    public CombinedData M(List<TimeStampedData> list, List<e3k> list2, long j2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new Entry(w(j2, list.get(i).getTimestamp()), list.get(i).getY(), list.get(i)));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            e3k e3kVar = list2.get(i2);
            arrayList2.add(new HeartRateCandleEntry(w(j2, e3kVar.h()), e3kVar.b(), e3kVar.c(), e3kVar.d(), e3kVar.f(), e3kVar.e(), e3kVar.g(), e3kVar));
        }
        iya iyaVar = new iya();
        iyaVar.h(arrayList, this.h0);
        iyaVar.e(arrayList2);
        setCombinedData(iyaVar);
        return iyaVar;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof sp8) {
            ((sp8) chartTouchListener).computeScroll();
        } else if (chartTouchListener instanceof BarLineChartTouchListener) {
            ((BarLineChartTouchListener) chartTouchListener).computeScroll();
        } else if (chartTouchListener instanceof HealthBarChartTouchListener) {
            ((HealthBarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart, com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.Chart
    public void drawMarkers(Canvas canvas) {
        Entry entryForHighlight;
        if (this.mMarker == null || !isDrawMarkersEnabled() || !valuesToHighlight()) {
            return;
        }
        int i = 0;
        while (true) {
            Highlight[] highlightArr = this.mIndicesToHighlight;
            if (i >= highlightArr.length) {
                return;
            }
            Highlight highlight = highlightArr[i];
            IBarLineScatterCandleBubbleDataSet<? extends Entry> dataSetByHighlight = ((CombinedData) this.mData).getDataSetByHighlight(highlight);
            if (dataSetByHighlight != null && (entryForHighlight = ((CombinedData) this.mData).getEntryForHighlight(highlight)) != null && dataSetByHighlight.getEntryIndex(entryForHighlight) <= dataSetByHighlight.getEntryCount() * this.mAnimator.getPhaseX()) {
                float[] markerPosition = getMarkerPosition(highlight);
                if (this.mViewPortHandler.isInBounds(markerPosition[0], markerPosition[1])) {
                    this.mMarker.refreshContent(entryForHighlight, highlight);
                    if (entryForHighlight instanceof HeartRateCandleEntry) {
                        HeartRateCandleEntry heartRateCandleEntry = (HeartRateCandleEntry) entryForHighlight;
                        Transformer transformer = getTransformer(dataSetByHighlight.getAxisDependency());
                        MPPointD pixelForValues = transformer.getPixelForValues(heartRateCandleEntry.getX(), heartRateCandleEntry.getHigh());
                        if (this.a0 && C(heartRateCandleEntry.getX() - (this.g0 / 2.0f), heartRateCandleEntry.getHigh(), heartRateCandleEntry.getX() + (this.g0 / 2.0f), heartRateCandleEntry.getLow())) {
                            pixelForValues = transformer.getPixelForValues(heartRateCandleEntry.getX(), ((heartRateCandleEntry.getHigh() + heartRateCandleEntry.getLow()) / 2.0f) - y(this.g0 / 2.0f));
                        }
                        if (this.mAnimator instanceof CustomChartAnimator) {
                            f(canvas, (float) pixelForValues.x, (float) pixelForValues.y);
                        } else {
                            this.mMarker.draw(canvas, (float) pixelForValues.x, (float) pixelForValues.y);
                        }
                    } else if (this.mAnimator instanceof CustomChartAnimator) {
                        f(canvas, markerPosition[0], markerPosition[1]);
                    } else {
                        this.mMarker.draw(canvas, markerPosition[0], markerPosition[1]);
                    }
                }
            }
            i++;
        }
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart
    public float getBarWidth() {
        return this.g0;
    }

    public float getBottomOffset() {
        XAxis xAxis = this.mXAxis;
        float yOffset = xAxis.mLabelRotatedHeight + xAxis.getYOffset();
        float minOffset = getMinOffset();
        return yOffset > minOffset ? yOffset : minOffset;
    }

    public float getCandleRadius() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            return ((hya) dataRenderer).c();
        }
        return 0.0f;
    }

    public boolean getCandleTouchable() {
        return this.c0;
    }

    public float getExtraXAxisSpace() {
        return this.l0;
    }

    @Override // com.github.mikephil.charting.formatter.IFillFormatter
    public float getFillLinePosition(ILineDataSet iLineDataSet, LineDataProvider lineDataProvider) {
        return getAxisRight().getAxisMinimum();
    }

    public int getHighestVisibleIndexInAllBar() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            return ((hya) dataRenderer).b().g();
        }
        return -1;
    }

    public int getHighestVisibleIndexInMiddleBar() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            return ((hya) dataRenderer).d();
        }
        return -1;
    }

    public int getHighestVisibleIndexInMiddleV2Bar() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            return ((hya) dataRenderer).e();
        }
        return -1;
    }

    public double getHighestVisibleValueX() {
        return ((double) getHighestVisibleX()) + this.F;
    }

    public float getHighestYValueInCandle() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            return ((hya) dataRenderer).f();
        }
        return 0.0f;
    }

    public boolean getLineTouchable() {
        return this.b0;
    }

    public MPPointF getLineVisibleHighestResult() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            return ((hya) dataRenderer).h().a();
        }
        return null;
    }

    public LocalDateTime getLowestVisiableDate() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli((long) (((double) (((int) getLowestVisibleValueX()) + 1)) * getXAxisTimeUnit().getUnit())), ZoneId.systemDefault());
    }

    public double getLowestVisibleValueX() {
        return ((double) getLowestVisibleX()) + this.F;
    }

    public float getLowestYValueInCandle() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            return ((hya) dataRenderer).i();
        }
        return 0.0f;
    }

    public int getWindowWidthInPx() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.x;
    }

    public float getXAxisMaximum() {
        return getXAxis().getAxisMaximum() - (getBarWidth() / 2.0f);
    }

    public float getXAxisMinimum() {
        return getXAxis().getAxisMinimum() + (getBarWidth() / 2.0f);
    }

    public float getXAxisOffset() {
        return this.g0;
    }

    public TimeUnit getXAxisTimeUnit() {
        return this.G;
    }

    public double getXStart() {
        return this.F;
    }

    public double getxStart() {
        return this.F;
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart, com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mDrawOrder = new CombinedChart.DrawOrder[]{CombinedChart.DrawOrder.CANDLE, CombinedChart.DrawOrder.LINE, CombinedChart.DrawOrder.BAR, CombinedChart.DrawOrder.BUBBLE, CombinedChart.DrawOrder.SCATTER};
        this.mRenderer = new hya(this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererLeft = new nya(this, this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new nya(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new oya(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        l(BaseYAxisRenderer.LinePosition.CUSTOM_PERCENT, 0.922f);
        m(BaseYAxisRenderer.LinePosition.END, 0.0f);
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void s() {
        XAxis xAxis = getXAxis();
        this.H = xAxis;
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        this.H.setDrawLabels(true);
        this.H.setDrawAxisLine(false);
        this.H.setLabelCount(this.i0);
        this.H.setTextSize(10.0f);
        this.H.setGridLineWidth(0.7f);
        this.H.setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        YAxis axisRight = getAxisRight();
        this.I = axisRight;
        axisRight.setDrawAxisLine(false);
        this.I.setDrawZeroLine(false);
        getAxisLeft().setEnabled(false);
        setScaleEnabled(false);
        setPinchZoom(false);
        setHighlightPerDragEnabled(false);
        getDescription().setEnabled(false);
        getLegend().setEnabled(false);
        z();
        A();
        e(true, false, true, false);
        p(24.0f, 0.0f, 35.0f, 0.0f);
        this.T = ContextCompat.getColor(getContext(), R$color.lib_base_color_nx_transparence);
        if (if0.y(getContext())) {
            XAxis xAxis2 = this.H;
            Context context = getContext();
            int i = com.heytap.health.lib_chart.R$color.lib_core_charts_grid_line_night;
            xAxis2.setGridColor(ContextCompat.getColor(context, i));
            XAxis xAxis3 = this.H;
            Context context2 = getContext();
            int i2 = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label_night;
            xAxis3.setTextColor(ContextCompat.getColor(context2, i2));
            this.I.setGridColor(ContextCompat.getColor(getContext(), i));
            this.I.setTextColor(ContextCompat.getColor(getContext(), i2));
            getAxisLeft().setGridColor(ContextCompat.getColor(getContext(), i));
            getAxisLeft().setTextColor(ContextCompat.getColor(getContext(), i2));
            this.J = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_line_night);
            this.N = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_bar_night);
            this.O = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_middle_bar_night);
            this.L = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_line_invisible_night);
            this.P = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_bar_invisible_night);
            this.Q = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_middle_bar_invisible_night);
            this.R = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_limit_line_night);
            this.K = ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_heart_rate_line_chart_fill_night);
            this.M = ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_heart_rate_line_chart_fill_invisible_night);
            this.S = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_line_circle_color);
            return;
        }
        XAxis xAxis4 = this.H;
        Context context3 = getContext();
        int i3 = com.heytap.health.lib_chart.R$color.lib_core_charts_grid_line;
        xAxis4.setGridColor(ContextCompat.getColor(context3, i3));
        XAxis xAxis5 = this.H;
        Context context4 = getContext();
        int i4 = com.heytap.health.lib_chart.R$color.lib_core_charts_axis_label;
        xAxis5.setTextColor(ContextCompat.getColor(context4, i4));
        this.I.setGridColor(ContextCompat.getColor(getContext(), i3));
        this.I.setTextColor(ContextCompat.getColor(getContext(), i4));
        getAxisLeft().setGridColor(ContextCompat.getColor(getContext(), i3));
        getAxisLeft().setTextColor(ContextCompat.getColor(getContext(), i4));
        this.J = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_line);
        this.K = ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_heart_rate_line_chart_fill);
        this.L = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_line_invisible);
        this.M = ContextCompat.getDrawable(getContext(), R$drawable.lib_core_charts_heart_rate_line_chart_fill_invisible);
        this.N = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_bar);
        this.O = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_middle_bar);
        this.P = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_bar_invisible);
        this.Q = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_middle_bar_invisible);
        this.R = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_limit_line);
        this.S = ContextCompat.getColor(getContext(), com.heytap.health.lib_chart.R$color.lib_core_charts_heart_rate_day_line_circle_color);
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart
    public void setBarWidth(float f) {
        this.g0 = f;
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            ((hya) dataRenderer).j(f);
        }
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).h(f);
        }
        super.setBarWidth(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCandleHighlightEnabled(boolean z) {
        if (getCandleData() != null) {
            ((CandleDataSet) getCandleData().getDataSetByIndex(0)).setHighlightEnabled(z);
        }
    }

    public void setCandleRadius(float f) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            ((hya) dataRenderer).k(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCandleSelected(int i) {
        CandleData candleData;
        if (getCandleTouchable() && this.a0 && getCombinedData() != null && (candleData = getCombinedData().getCandleData()) != null && candleData.getDataSetCount() >= 1 && (candleData.getDataSetByIndex(0) instanceof CandleDataSet)) {
            CandleDataSet candleDataSet = (CandleDataSet) candleData.getDataSetByIndex(0);
            if (i < 0 || i >= candleDataSet.getEntryCount()) {
                D();
                return;
            }
            Highlight highlight = new Highlight(((CandleEntry) candleDataSet.getEntryForIndex(i)).getX(), ((CandleEntry) candleDataSet.getEntryForIndex(i)).getY(), 0);
            highlight.setDataIndex(1);
            highlightValue(highlight);
        }
    }

    public void setCandleTouchable(boolean z) {
        this.c0 = z;
    }

    public void setCombinedData(iya iyaVar) {
        LineDataSet lineDataSetB = iyaVar.b();
        if (lineDataSetB != null) {
            lineDataSetB.setAxisDependency(YAxis.AxisDependency.RIGHT);
            lineDataSetB.setDrawCircles(false);
            lineDataSetB.setDrawValues(false);
            lineDataSetB.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
            lineDataSetB.setDrawHighlightIndicators(false);
            lineDataSetB.setColor(this.J);
            lineDataSetB.setLineWidth(this.U);
            if (this.K != null) {
                lineDataSetB.setDrawFilled(true);
                lineDataSetB.setFillFormatter(this);
                lineDataSetB.setFillDrawable(this.K);
            }
            lineDataSetB.setHighlightEnabled(this.b0);
        }
        CandleDataSet candleDataSetA = iyaVar.a();
        if (candleDataSetA != null) {
            candleDataSetA.setDrawValues(false);
            candleDataSetA.setAxisDependency(YAxis.AxisDependency.RIGHT);
            candleDataSetA.setDrawHighlightIndicators(false);
            candleDataSetA.setDecreasingColor(this.O);
            candleDataSetA.setDecreasingPaintStyle(Paint.Style.FILL);
            candleDataSetA.setNeutralColor(this.O);
            candleDataSetA.setIncreasingColor(this.N);
            candleDataSetA.setIncreasingPaintStyle(Paint.Style.FILL);
            candleDataSetA.setHighlightEnabled(this.c0);
        }
        setData((CombinedData) iyaVar);
        if (this.k0 == LineDataSet.Mode.LINEAR) {
            J();
        }
    }

    public void setExtraXAxisSpace(float f) {
        this.l0 = f;
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).i(f);
        }
    }

    public void setForceGranularity(boolean z) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).d(z);
        }
    }

    public void setForceLabelMultipleOfGranularity(boolean z) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).j(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setLineHighLightEnabled(boolean z) {
        if (getLineData() != null) {
            ((LineDataSet) getLineData().getDataSetByIndex(0)).setHighlightEnabled(z);
        }
    }

    public void setLineTouchable(boolean z) {
        this.b0 = z;
    }

    public void setNeedChangeMonthBar(boolean z) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            ((hya) dataRenderer).b().d(z);
        }
    }

    public void setOnCandleHighestIndexListener(qid qidVar) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            ((hya) dataRenderer).setOnCandleHighestAllMiddleIndexListener(qidVar);
        }
    }

    public void setShowYAxisStartLine(boolean z) {
        this.f0 = z;
    }

    public void setTimeXAxisMaximum(long j2) {
        TimeUnit timeUnit = this.G;
        if (timeUnit != null) {
            this.H.setAxisMaximum(((float) (timeUnit.timeStampToUnitDouble(j2) - this.F)) + (getBarWidth() / 2.0f) + this.l0);
        } else {
            this.H.setAxisMaximum(j2);
        }
    }

    public void setTimeXAxisMinimum(long j2) {
        TimeUnit timeUnit = this.G;
        if (timeUnit != null) {
            this.F = timeUnit.timeStampToUnitDouble(j2);
        }
        this.H.setAxisMinimum((0.0f - (this.g0 / 2.0f)) - this.l0);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f, float f2) {
        float f3 = this.g0;
        float f4 = this.l0;
        super.setVisibleXRange(f + f3 + (f4 * 2.0f), f2 + f3 + (f4 * 2.0f));
    }

    public void setXAxisLabelCount(int i) {
        getXAxis().setLabelCount(i);
        postInvalidate();
    }

    public void setXAxisTimeUnit(TimeUnit timeUnit) {
        this.G = timeUnit;
    }

    public void setXAxisValueFormatter(xp0 xp0Var) {
        this.d0 = xp0Var;
    }

    public void setYAxisMaximum(float f) {
        getAxisRight().setAxisMaximum(f);
    }

    public void setYAxisMinimum(float f) {
        getAxisRight().setAxisMinimum(f);
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart
    public void setYAxisRightValues(float[] fArr) {
        YAxisRenderer yAxisRenderer = this.mAxisRendererRight;
        if (yAxisRenderer instanceof BaseYAxisRenderer) {
            ((BaseYAxisRenderer) yAxisRenderer).F(fArr, false);
        }
    }

    public void setYAxisValueFormatter(xp0 xp0Var) {
        this.e0 = xp0Var;
    }

    public void t() {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof hya) {
            ((hya) dataRenderer).a();
        }
    }

    public final List<CandleEntry> u(List<e3k> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            e3k e3kVar = list.get(i);
            arrayList.add(new HeartRateCandleEntry(i, e3kVar.b(), e3kVar.c(), e3kVar.d(), e3kVar.f(), e3kVar.e(), e3kVar.g(), e3kVar));
        }
        return arrayList;
    }

    public final List<Entry> v(List<TimeStampedData> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new Entry(i, list.get(i).getY(), list.get(i)));
        }
        return arrayList;
    }

    public final int w(long j2, long j3) {
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(j3), ZoneId.systemDefault()).toLocalDate();
        return (((localDate2.getYear() - localDate.getYear()) * 12) + localDate2.getMonthValue()) - localDate.getMonthValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    public final float x(float f) {
        float[] fArr = {0.0f, 0.0f, 0.0f, f};
        getTransformer(((CombinedData) this.mData).getDataSetByIndex(0).getAxisDependency()).pixelsToValue(fArr);
        return fArr[3] - fArr[1];
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.github.mikephil.charting.interfaces.datasets.IDataSet] */
    public final float y(float f) {
        float[] fArr = {0.0f, 0.0f, f, 0.0f};
        getTransformer(((CombinedData) this.mData).getDataSetByIndex(0).getAxisDependency()).pointValuesToPixel(fArr);
        return x(fArr[2] - fArr[0]);
    }

    public final void z() {
        this.H.setValueFormatter(new a());
    }

    @Override // com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.Chart
    public void setData(CombinedData combinedData) {
        super.setData(combinedData);
        invalidate();
    }

    public LineCandleCombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = TimeUnit.ORIGINAL;
        this.U = 1.5f;
        this.V = 1.3f;
        this.W = true;
        this.a0 = false;
        this.b0 = false;
        this.c0 = true;
        this.f0 = false;
        this.g0 = 0.0f;
        this.h0 = 1.5f;
        this.i0 = 5;
        this.j0 = 3;
        this.k0 = LineDataSet.Mode.HORIZONTAL_BEZIER;
        this.l0 = 0.0f;
        s();
    }

    public LineCandleCombinedChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.G = TimeUnit.ORIGINAL;
        this.U = 1.5f;
        this.V = 1.3f;
        this.W = true;
        this.a0 = false;
        this.b0 = false;
        this.c0 = true;
        this.f0 = false;
        this.g0 = 0.0f;
        this.h0 = 1.5f;
        this.i0 = 5;
        this.j0 = 3;
        this.k0 = LineDataSet.Mode.HORIZONTAL_BEZIER;
        this.l0 = 0.0f;
        s();
    }
}