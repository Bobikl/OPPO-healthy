package com.heytap.health.core.widget.charts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.heytap.health.core.widget.charts.HeartRateBarChart;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.formatter.HealthTimeXAxisValueFormatter$Style;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.lib_chart.R$color;
import com.heytap.health.lib_chart.R$dimen;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.f59;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.lq8;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.p30;
import com.oplus.aiunit.vision.qp8;
import com.oplus.aiunit.vision.sed;
import com.oplus.aiunit.vision.tdd;
import com.oplus.aiunit.vision.w0b;
import com.oplus.aiunit.vision.wv8;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateBarChart extends HealthCandleStickChart {
    public final String B;
    public int C;
    public GradientColor D;
    public int E;
    public int F;
    public boolean G;
    public TimeUnit H;
    public boolean I;
    public xp0 J;
    public xp0 K;
    public double L;
    public List<Integer> M;
    public Style N;
    public float O;
    public float P;
    public MutableLiveData<Boolean> Q;

    public enum Style {
        WEEK,
        MONTH,
        YEAR
    }

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
            HeartRateBarChart heartRateBarChart = HeartRateBarChart.this;
            xp0 xp0Var = heartRateBarChart.J;
            return xp0Var != null ? xp0Var.a(i, ((double) f) + heartRateBarChart.L) : super.getAxisLabel((float) (((double) f) + heartRateBarChart.L), axisBase);
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
            HeartRateBarChart heartRateBarChart = HeartRateBarChart.this;
            boolean z = heartRateBarChart.G;
            if ((z || i > 0) && (xp0Var = heartRateBarChart.K) != null) {
                if (!z) {
                    i--;
                }
                return xp0Var.a(i, f);
            }
            return super.getAxisLabel(f, axisBase);
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Style.values().length];
            a = iArr;
            try {
                iArr[Style.WEEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Style.MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Style.YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class d {
        public List<HealthCandleEntry> a;
        public List<HealthCandleEntry> b;

        public d() {
        }

        public void c(List<HealthCandleEntry> list) {
            this.a = list;
        }

        public void d(List<HealthCandleEntry> list) {
            this.b = list;
        }
    }

    public HeartRateBarChart(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(List list, tdd tddVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            f59 f59Var = (f59) list.get(i);
            arrayList.add(new HealthCandleEntry((float) (this.H.timeStampToUnitDouble(f59Var.c()) - this.L), Math.min(f59Var.b(), f59Var.a()), Math.max(f59Var.b(), f59Var.a()), f59Var));
        }
        tddVar.onNext(arrayList);
        tddVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(List list) throws Throwable {
        setEntryList(list);
        MutableLiveData<Boolean> mutableLiveData = this.Q;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        } else {
            m8b.f("HeartRateBarChart", "setHeartRateData mObservableChartData is null");
        }
    }

    public static /* synthetic */ void D(Throwable th) throws Throwable {
        m8b.f("setSleepData", "throwable : " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(List list, List list2, tdd tddVar) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            f59 f59Var = (f59) list.get(i);
            arrayList.add(new HealthCandleEntry((float) (this.H.timeStampToUnitDouble(f59Var.c()) - this.L), Math.min(f59Var.b(), f59Var.a()), Math.max(f59Var.b(), f59Var.a()), f59Var));
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            f59 f59Var2 = (f59) list2.get(i2);
            arrayList2.add(new HealthCandleEntry((float) (this.H.timeStampToUnitDouble(f59Var2.c()) - this.L), Math.min(f59Var2.b(), f59Var2.a()), Math.max(f59Var2.b(), f59Var2.a()), f59Var2));
        }
        d dVar = new d();
        dVar.c(arrayList);
        dVar.d(arrayList2);
        tddVar.onNext(dVar);
        tddVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(d dVar) throws Throwable {
        K(dVar.a, dVar.b);
        MutableLiveData<Boolean> mutableLiveData = this.Q;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        } else {
            m8b.f("HeartRateBarChart", "setHeartRateData mObservableChartData is null");
        }
    }

    public static /* synthetic */ void G(Throwable th) throws Throwable {
        m8b.f("setSleepData", "throwable : " + th.getMessage());
    }

    private int getBarSpaceRes() {
        int i = c.a[this.N.ordinal()];
        if (i == 1) {
            return R$dimen.lib_core_charts_heart_rate_day_bar_space;
        }
        if (i == 2) {
            return R$dimen.lib_core_charts_heart_rate_month_bar_space;
        }
        if (i == 3) {
            return R$dimen.lib_core_charts_heart_rate_year_bar_space;
        }
        throw new IllegalArgumentException();
    }

    private int getBarVisibleCount() {
        int i = c.a[this.N.ordinal()];
        if (i == 1) {
            return 7;
        }
        if (i == 2) {
            return 31;
        }
        if (i == 3) {
            return 12;
        }
        throw new IllegalArgumentException();
    }

    private int getBarWidthRes() {
        int i = c.a[this.N.ordinal()];
        if (i == 1) {
            return R$dimen.lib_core_charts_heart_rate_day_bar_width;
        }
        if (i == 2) {
            return R$dimen.lib_core_charts_heart_rate_month_bar_width;
        }
        if (i == 3) {
            return R$dimen.lib_core_charts_heart_rate_year_bar_width;
        }
        throw new IllegalArgumentException();
    }

    private HealthTimeXAxisValueFormatter$Style getXAxisStyle() {
        int i = c.a[this.N.ordinal()];
        if (i == 1) {
            return HealthTimeXAxisValueFormatter$Style.WEEK;
        }
        if (i == 2) {
            return HealthTimeXAxisValueFormatter$Style.MONTH;
        }
        if (i == 3) {
            return HealthTimeXAxisValueFormatter$Style.YEAR;
        }
        throw new IllegalArgumentException();
    }

    public boolean A() {
        return this.I;
    }

    public void H(double d2) {
        super.moveViewToX(((float) (d2 - this.L)) + (getBarWidth() / 2.0f));
    }

    public void I(double d2, float f, YAxis.AxisDependency axisDependency) {
        super.moveViewTo((float) (d2 - this.L), f, axisDependency);
    }

    public void J(List<HealthCandleEntry> list, List<Integer> list2) {
        if (list == null || list.isEmpty()) {
            clear();
            return;
        }
        lq8 lq8Var = new lq8(new ArrayList(list), "Heart Rate");
        setDataSetCommonAttr(lq8Var);
        CandleData candleData = new CandleData(lq8Var);
        lq8Var.setIncreasingColor(ColorTemplate.COLOR_NONE);
        lq8Var.setColors(list2);
        setData(candleData);
        invalidate();
    }

    public void K(List<HealthCandleEntry> list, List<HealthCandleEntry> list2) {
        if (list == null || list2.isEmpty()) {
            clear();
            return;
        }
        lq8 lq8Var = new lq8(new ArrayList(list), "");
        lq8 lq8Var2 = new lq8(new ArrayList(list2), "");
        setDataSetCommonAttr(lq8Var);
        setDataSetCommonAttr(lq8Var2);
        CandleData candleData = new CandleData(lq8Var);
        candleData.addDataSet(lq8Var2);
        setData(candleData);
        if (!w0b.a(this.M)) {
            setBarColorList(this.M);
        }
        invalidate();
    }

    @SuppressLint({"CheckResult"})
    public void L(final List<? extends f59> list, final List<? extends f59> list2) {
        if (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) {
            clear();
        } else {
            ddd.w(new sed() { // from class: com.oplus.aiunit.vision.l39
                @Override // com.oplus.aiunit.vision.sed
                public final void a(tdd tddVar) throws Throwable {
                    this.a.E(list, list2, tddVar);
                }
            }).K0(wv8.f()).n0(p30.c()).b(new b24() { // from class: com.oplus.aiunit.vision.m39
                @Override // com.oplus.aiunit.vision.b24
                public final void accept(Object obj) throws Throwable {
                    this.i.F((HeartRateBarChart.d) obj);
                }
            }, new b24() { // from class: com.oplus.aiunit.vision.n39
                @Override // com.oplus.aiunit.vision.b24
                public final void accept(Object obj) throws Throwable {
                    HeartRateBarChart.G((Throwable) obj);
                }
            });
        }
    }

    public void M(List<? extends f59> list, List<? extends f59> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new HealthCandleEntry(i, list.get(i).b(), list.get(i).a(), list.get(i)));
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            arrayList2.add(new HealthCandleEntry(i2, list2.get(i2).b(), list2.get(i2).a(), list2.get(i2)));
        }
        K(arrayList, arrayList2);
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCandleChart
    public float getBarWidth() {
        return this.A;
    }

    public long getHighestVisibleTime() {
        return (long) (((((double) getHighestVisibleX()) + this.L) - ((double) getBarWidth())) * this.H.getUnit());
    }

    public double getHighestVisibleValueX() {
        return ((double) getHighestVisibleX()) + this.L;
    }

    public LocalDateTime getLowestVisibleDate() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(getLowestVisibleTime()), ZoneId.systemDefault());
    }

    public long getLowestVisibleTime() {
        return (long) ((((double) getLowestVisibleX()) + this.L + ((double) getBarWidth())) * this.H.getUnit());
    }

    public double getLowestVisibleValueX() {
        return ((double) getLowestVisibleX()) + this.L;
    }

    public MutableLiveData<Boolean> getObservableChartData() {
        if (this.Q == null) {
            this.Q = new MutableLiveData<>();
        }
        return this.Q;
    }

    public float getRadius() {
        return this.P;
    }

    public Style getStyle() {
        return this.N;
    }

    public double getXAxisOffset() {
        return this.L;
    }

    public TimeUnit getXAxisTimeUnit() {
        return this.H;
    }

    public xp0 getXAxisValueFormatter() {
        return this.J;
    }

    public xp0 getYAxisValueFormatter() {
        return this.K;
    }

    public double getxStart() {
        return this.L;
    }

    @Override // com.heytap.health.core.widget.charts.HealthCandleStickChart, com.heytap.health.core.widget.charts.ControllableOffsetCandleChart, com.github.mikephil.charting.charts.CandleStickChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        ((f) this.mAxisRendererRight).J(0.922f);
        ((f) this.mAxisRendererLeft).J(0.922f);
        setOnTouchListener((ChartTouchListener) new qp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
    }

    @Override // com.heytap.health.core.widget.charts.HealthCandleStickChart
    public void n() {
        super.n();
        if (if0.y(getContext())) {
            this.D = new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_heart_rate_start_night), ContextCompat.getColor(getContext(), R$color.lib_core_charts_heart_rate_end_night));
        } else {
            this.D = new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_heart_rate_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_heart_rate_end));
        }
        setExtraTopOffset(54.0f);
        setHighlightPerDragEnabled(true);
        getAxisLeft().setEnabled(false);
        XAxis xAxis = getXAxis();
        xAxis.setDrawLabels(true);
        xAxis.setDrawAxisLine(false);
        xAxis.setLabelCount(this.F);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setTextSize(10.0f);
        xAxis.setGridLineWidth(0.7f);
        xAxis.setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
        xAxis.setValueFormatter(new a());
        getAxisLeft().setEnabled(false);
        YAxis axisRight = getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawZeroLine(false);
        axisRight.setAxisMinimum(0.0f);
        axisRight.setLabelCount(this.G ? this.E : this.E + 1, true);
        ((f) this.mAxisRendererRight).H(false);
        axisRight.setValueFormatter(new b());
        axisRight.setGridLineWidth(0.7f);
        axisRight.setTextSize(10.0f);
        if (if0.y(getContext())) {
            Context context = getContext();
            int i = R$color.lib_core_charts_axis_label_night;
            xAxis.setTextColor(ContextCompat.getColor(context, i));
            axisRight.setTextColor(ContextCompat.getColor(getContext(), i));
            Context context2 = getContext();
            int i2 = R$color.lib_core_charts_grid_line_night;
            xAxis.setGridColor(ContextCompat.getColor(context2, i2));
            axisRight.setGridColor(ContextCompat.getColor(getContext(), i2));
        } else {
            Context context3 = getContext();
            int i3 = R$color.lib_core_charts_axis_label;
            xAxis.setTextColor(ContextCompat.getColor(context3, i3));
            axisRight.setTextColor(ContextCompat.getColor(getContext(), i3));
            Context context4 = getContext();
            int i4 = R$color.lib_core_charts_grid_line;
            xAxis.setGridColor(ContextCompat.getColor(context4, i4));
            axisRight.setGridColor(ContextCompat.getColor(getContext(), i4));
        }
        f(true, false, true, false);
        l(24.0f, 0.0f, 35.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBarColor(int i) {
        if (this.C == i) {
            return;
        }
        this.C = i;
        CandleData candleData = (CandleData) getData();
        if (candleData == null || candleData.getDataSetCount() < 1) {
            return;
        }
        for (T t : candleData.getDataSets()) {
            if (t instanceof lq8) {
                lq8 lq8Var = (lq8) t;
                lq8Var.setColor(i);
                lq8Var.setIncreasingColor(i);
            }
        }
        postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBarColorList(List<Integer> list) {
        this.M = list;
        CandleData candleData = (CandleData) getData();
        if (candleData == null || candleData.getDataSetCount() < 1 || w0b.a(list)) {
            return;
        }
        if (list.size() < candleData.getDataSetCount()) {
            int dataSetCount = candleData.getDataSetCount() - list.size();
            int iIntValue = list.get(list.size() - 1).intValue();
            for (int i = 0; i < dataSetCount; i++) {
                list.add(Integer.valueOf(iIntValue));
            }
        }
        for (int i2 = 0; i2 < candleData.getDataSetCount(); i2++) {
            CandleDataSet candleDataSet = (CandleDataSet) candleData.getDataSetByIndex(i2);
            if (candleDataSet instanceof lq8) {
                lq8 lq8Var = (lq8) candleDataSet;
                lq8Var.setColor(list.get(i2).intValue());
                lq8Var.setIncreasingColor(list.get(i2).intValue());
            }
        }
        postInvalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBarGradientColor(GradientColor gradientColor) {
        this.D = gradientColor;
        CandleData candleData = (CandleData) getData();
        if (candleData == null || candleData.getDataSetCount() < 1) {
            return;
        }
        if (gradientColor != null) {
            for (T t : candleData.getDataSets()) {
                if (t instanceof lq8) {
                    ((lq8) t).setGradientColor(gradientColor.getStartColor(), gradientColor.getEndColor());
                }
            }
        } else {
            for (T t2 : candleData.getDataSets()) {
                if (t2 instanceof lq8) {
                    ((lq8) t2).setGradientColors(null);
                }
            }
        }
        postInvalidate();
    }

    public void setBarMinHeight(float f) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof mq8) {
            ((mq8) dataRenderer).j(f);
        }
    }

    public void setCompelLocationToEnd(boolean z) {
        this.I = z;
    }

    public void setDataSetCommonAttr(CandleDataSet candleDataSet) {
        candleDataSet.setDrawIcons(false);
        candleDataSet.setDrawValues(false);
        candleDataSet.setDrawHighlightIndicators(false);
        candleDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        candleDataSet.setShowCandleBar(false);
        candleDataSet.setShadowColorSameAsCandle(true);
        candleDataSet.setBarSpace(1.0f - this.A);
        candleDataSet.setIncreasingPaintStyle(Paint.Style.FILL);
        candleDataSet.setDecreasingPaintStyle(Paint.Style.FILL);
    }

    public void setEntryList(List<HealthCandleEntry> list) {
        if (list == null || list.isEmpty()) {
            clear();
            return;
        }
        lq8 lq8Var = new lq8(new ArrayList(list), "Heart Rate");
        setDataSetCommonAttr(lq8Var);
        CandleData candleData = new CandleData(lq8Var);
        lq8Var.setColor(this.C);
        GradientColor gradientColor = this.D;
        if (gradientColor != null) {
            lq8Var.setGradientColor(gradientColor.getStartColor(), this.D.getEndColor());
        }
        lq8Var.setIncreasingColor(this.C);
        setData(candleData);
        invalidate();
    }

    public void setForceCandleHeightBiggerThanWidth(boolean z) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof mq8) {
            ((mq8) dataRenderer).k(z);
        }
    }

    @SuppressLint({"CheckResult"})
    public void setHeartRateData(final List<f59> list) {
        if (list == null || list.isEmpty()) {
            clear();
        } else {
            ddd.w(new sed() { // from class: com.oplus.aiunit.vision.o39
                @Override // com.oplus.aiunit.vision.sed
                public final void a(tdd tddVar) throws Throwable {
                    this.a.B(list, tddVar);
                }
            }).K0(wv8.f()).n0(p30.c()).b(new b24() { // from class: com.oplus.aiunit.vision.p39
                @Override // com.oplus.aiunit.vision.b24
                public final void accept(Object obj) throws Throwable {
                    this.i.C((List) obj);
                }
            }, new b24() { // from class: com.oplus.aiunit.vision.q39
                @Override // com.oplus.aiunit.vision.b24
                public final void accept(Object obj) throws Throwable {
                    HeartRateBarChart.D((Throwable) obj);
                }
            });
        }
    }

    public void setHeartRateDataForActivityFrequency(List<f59> list) {
        if (list == null || list.isEmpty()) {
            clear();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            f59 f59Var = list.get(i);
            arrayList.add(new HealthCandleEntry((float) (this.H.timeStampToUnitDouble(f59Var.c()) - this.L), Math.min(f59Var.b(), f59Var.a()), Math.max(f59Var.b(), f59Var.a()), f59Var));
        }
        setEntryList(arrayList);
    }

    public void setRadius(float f) {
        this.P = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setShowYAxisEndLine(boolean z) {
        CandleData candleData = (CandleData) getData();
        ((f) this.mAxisRendererRight).G(z);
        if (candleData == null || candleData.getDataSetCount() < 1) {
            return;
        }
        postInvalidate();
    }

    public void setShowYAxisStartLine(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        ((f) this.mAxisRendererRight).H(z);
        postInvalidate();
    }

    public void setStyle(Style style) {
        this.N = style;
        n();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase
    public void setVisibleXRange(float f, float f2) {
        super.setVisibleXRange(f + getBarWidth(), f2 + getBarWidth());
    }

    public void setXAxisLabelCount(int i) {
        if (this.F == i) {
            return;
        }
        this.F = i;
        getXAxis().setLabelCount(i);
        postInvalidate();
    }

    public void setXAxisMaximum(double d2) {
        getXAxis().setAxisMaximum(((float) (d2 - this.L)) + (getBarWidth() / 2.0f));
        postInvalidate();
    }

    public void setXAxisMinimum(double d2) {
        this.L = d2 - 0.0d;
        getXAxis().setAxisMinimum(0.0f - (getBarWidth() / 2.0f));
        postInvalidate();
    }

    public void setXAxisTimeUnit(@NonNull TimeUnit timeUnit) {
        this.H = timeUnit;
    }

    public void setXAxisValueFormatter(xp0 xp0Var) {
        this.J = xp0Var;
    }

    public void setYAxisLabelCount(int i) {
        if (this.E == i) {
            return;
        }
        this.E = i;
        if (this.G) {
            getAxisRight().setLabelCount(i, true);
        } else {
            getAxisRight().setLabelCount(i + 1, true);
        }
        postInvalidate();
    }

    public void setYAxisMaximum(float f) {
        getAxisRight().setAxisMaximum(f);
        postInvalidate();
    }

    public void setYAxisMinimum(float f) {
        getAxisRight().setAxisMinimum(f);
        postInvalidate();
    }

    public void setYAxisValueFormatter(xp0 xp0Var) {
        this.K = xp0Var;
    }

    public HeartRateBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartRateBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = "HeartRateBarChart";
        this.E = 2;
        this.F = 5;
        this.G = false;
        this.H = TimeUnit.ORIGINAL;
        this.I = false;
        this.L = 0.0d;
        this.M = new ArrayList();
        this.N = Style.WEEK;
        this.O = 7.0f;
        this.P = 5.0f;
    }
}