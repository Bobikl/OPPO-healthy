package com.heytap.health.heartrate.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.heytap.health.core.widget.charts.LineCandleCombinedChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.iya;
import com.oplus.aiunit.vision.rp8;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateDayChart extends LineCandleCombinedChart {
    public HeartRateDayChart(Context context) {
        super(context);
    }

    public void N(int i, int i2) {
        int i3 = i - 40;
        int i4 = i3 / 10;
        if (i3 % 10 != 0) {
            i3 = (i4 + 1) * 10;
        }
        int iMax = Math.max(i3, 0);
        int i5 = ((i2 / 10) + 4) * 10;
        setYAxisRightValues(new float[]{iMax, (i5 + iMax) / 2, i5});
    }

    public void O(int i, Drawable drawable) {
        if (getData() instanceof iya) {
            iya iyaVar = (iya) getData();
            LineDataSet lineDataSetB = iyaVar.b();
            lineDataSetB.setColor(i);
            lineDataSetB.setFillDrawable(drawable);
            setData((CombinedData) iyaVar);
        }
    }

    public void P() {
        StringBuilder sb = new StringBuilder();
        sb.append("reset  ");
        sb.append(this);
        ChartAnimator chartAnimator = this.mAnimator;
        if (chartAnimator instanceof CustomChartAnimator) {
            ((CustomChartAnimator) chartAnimator).resetChartYAxisToZeroState();
        }
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart
    public void b() {
        if (!(getAnimator() instanceof CustomChartAnimator)) {
            animateY(AnimatorUtil.d());
            return;
        }
        int iF = AnimatorUtil.f(this, !this.W ? 1 : 0, Float.valueOf(getLowestVisibleX()), Float.valueOf(getHighestVisibleX()), Boolean.TRUE);
        ((CustomChartAnimator) getAnimator()).animateWaveY(AnimatorUtil.d(), iF);
        StringBuilder sb = new StringBuilder();
        sb.append("animateWaveY visibleCount is ");
        sb.append(iF);
        sb.append("   ");
        sb.append(this);
    }

    @Override // com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart
    public void c(@Nullable Float f, @Nullable Float f2) {
        if (!(getAnimator() instanceof CustomChartAnimator)) {
            animateY(AnimatorUtil.d());
        } else {
            ((CustomChartAnimator) getAnimator()).animateWaveY(AnimatorUtil.d(), AnimatorUtil.f(this, !this.W ? 1 : 0, f, f2, Boolean.TRUE));
        }
    }

    @Override // com.heytap.health.core.widget.charts.LineCandleCombinedChart, com.heytap.health.core.widget.charts.ControllableOffsetCombinedChart, com.github.mikephil.charting.charts.CombinedChart, com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        setOnTouchListener((ChartTouchListener) new rp8(this, this.mViewPortHandler.getMatrixTouch(), 3.0f));
    }

    @Override // com.heytap.health.core.widget.charts.LineCandleCombinedChart
    public void s() {
        super.s();
        if (if0.y(getContext())) {
            XAxis xAxis = getXAxis();
            Context context = getContext();
            int i = R$color.lib_core_charts_grid_line_night;
            xAxis.setAxisLineColor(ContextCompat.getColor(context, i));
            getAxisRight().setAxisLineColor(ContextCompat.getColor(getContext(), i));
            return;
        }
        XAxis xAxis2 = getXAxis();
        Context context2 = getContext();
        int i2 = R$color.lib_core_charts_grid_line;
        xAxis2.setAxisLineColor(ContextCompat.getColor(context2, i2));
        getAxisRight().setAxisLineColor(ContextCompat.getColor(getContext(), i2));
    }

    public HeartRateDayChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeartRateDayChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}