package com.heytap.health.core.widget.charts;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.model.GradientColor;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.Utils;
import com.heytap.health.core.widget.charts.SleepBarChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.SleepBarData;
import com.heytap.health.core.widget.charts.renderer.BaseBarChartRenderer;
import com.heytap.health.core.widget.charts.renderer.f;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.jjk;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.p30;
import com.oplus.aiunit.vision.pqh;
import com.oplus.aiunit.vision.sed;
import com.oplus.aiunit.vision.tdd;
import com.oplus.aiunit.vision.wv8;
import com.oplus.aiunit.vision.xp0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class SleepBarChart extends HealthTimeXBarChart {
    public float Q;
    public Style R;
    public MutableLiveData<Boolean> S;

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
            SleepBarChart sleepBarChart = SleepBarChart.this;
            boolean z = sleepBarChart.I;
            if ((z || i > 0) && (xp0Var = sleepBarChart.L) != null) {
                if (!z) {
                    i--;
                }
                return xp0Var.a(i, f * 3600000.0f);
            }
            return super.getAxisLabel(f, axisBase);
        }
    }

    public SleepBarChart(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(ValueAnimator valueAnimator) {
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(List list, tdd tddVar) throws Throwable {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            SleepBarData sleepBarData = (SleepBarData) list.get(i);
            arrayList.add(new BarEntry((float) (this.J.timeStampToUnitDouble(sleepBarData.getTimestamp()) - this.O), new float[]{(float) ((sleepBarData.getDeepSleep() * 1.0d) / 3600000.0d), (float) ((sleepBarData.getLightSleep() * 1.0d) / 3600000.0d), (float) ((sleepBarData.getEyeMovement() * 1.0d) / 3600000.0d), (float) ((sleepBarData.getAwake() * 1.0d) / 3600000.0d)}, sleepBarData));
        }
        tddVar.onNext(arrayList);
        tddVar.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(List list) throws Throwable {
        setSleepEntryData(list);
        MutableLiveData<Boolean> mutableLiveData = this.S;
        if (mutableLiveData != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
    }

    public static /* synthetic */ void P(Throwable th) throws Throwable {
        m8b.f("setSleepData", "throwable : " + th.getMessage());
    }

    public void Q(List<SleepBarData> list, boolean z) {
        if (list == null || list.isEmpty()) {
            clear();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            SleepBarData sleepBarData = list.get(i);
            arrayList.add(new BarEntry(z ? (float) (this.J.timeStampToUnitDouble(sleepBarData.getTimestamp()) - this.O) : i, new float[]{(float) ((sleepBarData.getDeepSleep() * 1.0d) / 3600000.0d), (float) ((sleepBarData.getLightSleep() * 1.0d) / 3600000.0d), (float) ((sleepBarData.getEyeMovement() * 1.0d) / 3600000.0d), (float) ((sleepBarData.getAwake() * 1.0d) / 3600000.0d)}, sleepBarData));
        }
        setSleepEntryData(arrayList);
    }

    public MutableLiveData<Boolean> getObservableChartData() {
        if (this.S == null) {
            this.S = new MutableLiveData<>();
        }
        return this.S;
    }

    public Style getStyle() {
        return this.R;
    }

    public double getXStart() {
        return this.O;
    }

    @Override // com.heytap.health.core.widget.charts.HealthTimeXBarChart, com.heytap.health.core.widget.charts.HealthBarChart
    public void r() {
        super.r();
        CustomChartAnimator customChartAnimator = new CustomChartAnimator(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.xdh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.i.M(valueAnimator);
            }
        });
        this.mAnimator = customChartAnimator;
        this.mRenderer = new pqh(this, customChartAnimator, this.mViewPortHandler);
        setExtraTopOffset(55.0f);
        setHighlightFullBarEnabled(true);
        YAxis axisRight = getAxisRight();
        axisRight.setDrawAxisLine(false);
        axisRight.setDrawZeroLine(false);
        axisRight.setAxisMinimum(0.0f);
        axisRight.setLabelCount(6);
        axisRight.setGranularity(2.0f);
        axisRight.setValueFormatter(new a());
        ((f) this.mAxisRendererRight).H(true);
        ((f) this.mAxisRendererRight).I(false);
        axisRight.setGridDashedLine(new DashPathEffect(new float[]{jjk.a(getContext(), 3.67f), jjk.a(getContext(), 3.67f)}, 0.0f));
    }

    public void setChartData(List<SleepBarData> list) {
        Q(list, true);
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setRadius(float f) {
        DataRenderer dataRenderer = this.mRenderer;
        if (dataRenderer instanceof BaseBarChartRenderer) {
            ((BaseBarChartRenderer) dataRenderer).A(Utils.convertDpToPixel(f));
        }
    }

    @SuppressLint({"CheckResult"})
    public void setSleepData(final List<SleepBarData> list) {
        if (list == null || list.isEmpty()) {
            clear();
        } else {
            ddd.w(new sed() { // from class: com.oplus.aiunit.vision.ydh
                @Override // com.oplus.aiunit.vision.sed
                public final void a(tdd tddVar) throws Throwable {
                    this.a.N(list, tddVar);
                }
            }).K0(wv8.f()).n0(p30.c()).b(new b24() { // from class: com.oplus.aiunit.vision.zdh
                @Override // com.oplus.aiunit.vision.b24
                public final void accept(Object obj) throws Throwable {
                    this.i.O((List) obj);
                }
            }, new b24() { // from class: com.oplus.aiunit.vision.aeh
                @Override // com.oplus.aiunit.vision.b24
                public final void accept(Object obj) throws Throwable {
                    SleepBarChart.P((Throwable) obj);
                }
            });
        }
    }

    public void setSleepEntryData(List<BarEntry> list) {
        if (list == null || list.isEmpty()) {
            clear();
            return;
        }
        BarDataSet barDataSet = new BarDataSet(new ArrayList(list), "Sleep Bar Chart");
        barDataSet.setDrawIcons(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_deep_sleep_end)));
        arrayList.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_start), ContextCompat.getColor(getContext(), R$color.lib_core_charts_light_sleep_end)));
        arrayList.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_rem_end_green)));
        arrayList.add(new GradientColor(ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_start_green), ContextCompat.getColor(getContext(), R$color.lib_core_charts_sleep_awake_end_green)));
        barDataSet.setGradientColors(arrayList);
        barDataSet.setDrawValues(false);
        barDataSet.setHighLightAlpha(0);
        barDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(barDataSet);
        BarData barData = new BarData(arrayList2);
        barData.setBarWidth(this.C);
        setData(barData);
        invalidate();
    }

    public void setStyle(@NonNull Style style) {
        this.R = style;
        r();
    }

    public SleepBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q = 33.3f;
        this.R = Style.WEEK;
    }
}