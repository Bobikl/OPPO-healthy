package com.heytap.health.core.widget.charts;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.model.GradientColor;
import com.heytap.health.core.widget.charts.data.SleepDailyEntry;
import com.heytap.health.core.widget.charts.data.SleepUnitData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.hfh;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.ifh;
import com.oplus.aiunit.vision.jfh;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.sp8;
import com.oplus.aiunit.vision.xp0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class SleepDailyChart extends HealthBarChart {
    public double O;
    public xp0 P;
    public float Q;
    public float R;
    public List<SleepUnitData> S;
    public Style T;
    public ifh U;

    public enum Style {
        STANDARD,
        MINI
    }

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
            if (SleepDailyChart.this.P != null) {
                return SleepDailyChart.this.P.a(i, ((double) f) + SleepDailyChart.this.getXStart());
            }
            double d = f;
            long unit = (long) (SleepDailyChart.this.J.getUnit() * d);
            if (SleepDailyChart.this.getXStart() != 0.0d) {
                unit = (long) ((d + SleepDailyChart.this.getXStart()) * SleepDailyChart.this.J.getUnit());
            }
            return DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), o15.DATE_FORMAT_HOUR), new Date(unit)).toString();
        }
    }

    public SleepDailyChart(Context context) {
        this(context, null);
    }

    public final float F(SleepUnitData sleepUnitData) {
        int type;
        if (sleepUnitData == null || this.T == Style.STANDARD || (type = sleepUnitData.getType()) == 1) {
            return 0.0f;
        }
        if (type == 2) {
            return 1.0f;
        }
        if (type != 3) {
            return type != 4 ? 4.0f : 3.0f;
        }
        return 2.0f;
    }

    public final float G(SleepUnitData sleepUnitData) {
        if (sleepUnitData == null) {
            return 0.0f;
        }
        if (this.T == Style.STANDARD) {
            return 90.0f;
        }
        int type = sleepUnitData.getType();
        if (type == 1) {
            return 1.0f;
        }
        if (type == 2) {
            return 2.0f;
        }
        if (type != 3) {
            return type != 4 ? 5.0f : 4.0f;
        }
        return 3.0f;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider
    public float getHighestVisibleX() {
        return super.getHighestVisibleX();
    }

    public float getXMinuteOffset() {
        return this.R;
    }

    public double getXStart() {
        return this.O;
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart, com.heytap.health.core.widget.charts.ControllableOffsetBarChart, com.github.mikephil.charting.charts.BarChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new hfh(this, this.mAnimator, this.mViewPortHandler);
        this.mAxisRendererLeft = new f(this, this.mViewPortHandler, this.mAxisLeft, this.mLeftAxisTransformer);
        this.mAxisRendererRight = new f(this, this.mViewPortHandler, this.mAxisRight, this.mRightAxisTransformer);
        this.mXAxisRenderer = new jfh(this.mViewPortHandler, this.mXAxis, this.mLeftAxisTransformer);
        setOnTouchListener((ChartTouchListener) new sp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
        this.T = Style.STANDARD;
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void r() {
        super.r();
        Style style = this.T;
        Style style2 = Style.STANDARD;
        if (style == style2) {
            setExtraTopOffset(55.67f);
        } else {
            setExtraTopOffset(0.0f);
            setMinOffset(0.0f);
        }
        getAxisLeft().setEnabled(false);
        YAxis axisRight = getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawZeroLine(false);
        axisRight.setDrawGridLines(false);
        axisRight.setDrawLabels(false);
        axisRight.setAxisMinimum(0.0f);
        XAxis xAxis = getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setDrawAxisLine(false);
        if (this.T == style2) {
            xAxis.setDrawGridLines(true);
            xAxis.setDrawLabels(true);
            xAxis.setTextSize(10.0f);
            xAxis.setAvoidFirstLastClipping(true);
        } else {
            xAxis.setDrawLabels(false);
            xAxis.setDrawGridLines(false);
        }
        this.J = TimeUnit.MINUTE;
        xAxis.setValueFormatter(new a());
        f(true, false, true, false);
        n(14.0f, 0.0f, 14.0f, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setSelected(int i) {
        ifh ifhVar;
        List<SleepUnitData> list = this.S;
        if (list == null || list.isEmpty() || i < 0 || i >= this.S.size() || (ifhVar = this.U) == null) {
            return;
        }
        highlightValue(((BarEntry) ifhVar.getEntryForIndex(i)).getX(), 0);
    }

    public void setSleepData(List<SleepUnitData> list) {
        if (list == null || list.isEmpty()) {
            clear();
            this.S = null;
            return;
        }
        this.S = list;
        ArrayList arrayList = new ArrayList();
        getXAxis().setAxisMinimum(this.R + 0.0f);
        setXStart(this.J.timeStampToUnitDouble(list.get(0).getTimestamp()));
        for (int i = 0; i < list.size(); i++) {
            SleepUnitData sleepUnitData = list.get(i);
            arrayList.add(new SleepDailyEntry((float) ((this.J.timeStampToUnitDouble(sleepUnitData.getTimestamp()) - this.O) + ((double) this.R)), (float) (sleepUnitData.getDuration() / this.J.getUnit()), F(sleepUnitData), G(sleepUnitData), sleepUnitData));
        }
        ifh ifhVar = new ifh(arrayList, "Sleep daily chart");
        this.U = ifhVar;
        ifhVar.setDrawValues(false);
        this.U.setHighlightEnabled(true);
        this.U.setHighLightAlpha(0);
        this.U.setAxisDependency(YAxis.AxisDependency.RIGHT);
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
        this.U.setGradientColors(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(this.U);
        BarData barData = new BarData(arrayList3);
        SleepUnitData sleepUnitData2 = list.get(list.size() - 1);
        if (sleepUnitData2.getDuration() > 0) {
            getXAxis().setAxisMaximum(((float) (this.J.timeStampToUnitDouble(sleepUnitData2.getTimestamp() + sleepUnitData2.getDuration()) - getXStart())) + this.R);
        } else {
            getXAxis().setAxisMaximum(((float) (this.J.timeStampToUnitDouble(sleepUnitData2.getTimestamp()) - getXStart())) + this.R);
        }
        YAxis axisRight = getAxisRight();
        float yMax = this.Q;
        if (yMax <= 0.0f) {
            yMax = this.U.getYMax();
        }
        axisRight.setAxisMaximum(yMax);
        setData(barData);
        invalidate();
    }

    public void setStyle(@NonNull Style style) {
        this.T = style;
        r();
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setXAxisValueFormatter(xp0 xp0Var) {
        this.P = xp0Var;
    }

    public void setXMinuteOffset(float f) {
        this.R = f;
    }

    public void setXStart(double d) {
        this.O = d;
    }

    public void setyMaximum(float f) {
        this.Q = f;
    }

    public SleepDailyChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepDailyChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O = 0.0d;
        this.Q = 90.0f;
        this.R = 0.0f;
        this.T = Style.STANDARD;
    }
}