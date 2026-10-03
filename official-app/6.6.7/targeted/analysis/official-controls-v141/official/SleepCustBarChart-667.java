package com.heytap.health.sleep.view;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.heytap.health.core.widget.charts.SleepBarChart;
import com.heytap.health.core.widget.charts.animator.CustomChartAnimator;
import com.heytap.health.core.widget.charts.data.SleepBarData;
import com.oplus.aiunit.vision.q15;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SleepCustBarChart extends SleepBarChart {
    public final String T;
    public int U;
    public final long V;

    public SleepCustBarChart(Context context) {
        super(context);
        this.T = "SleepCustBarChart";
        this.U = -1;
        this.V = 10800000L;
    }

    public void R() {
        ((CustomChartAnimator) this.mAnimator).resetChartYAxisToZeroState();
    }

    public void S(float f) {
        float[] fArr;
        if (f <= 2.16E7f) {
            fArr = new float[]{0.0f, 2.0f, 4.0f, 6.0f};
        } else if (f <= 3.24E7f) {
            fArr = new float[]{0.0f, 3.0f, 6.0f, 9.0f};
        } else {
            fArr = f <= 4.32E7f ? new float[]{0.0f, 4.0f, 8.0f, 12.0f} : new float[]{0.0f, 8.0f, 16.0f, 24.0f};
        }
        o(fArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void T(long j2, long j3, boolean z) {
        BarDataSet barDataSet;
        StringBuilder sb = new StringBuilder();
        sb.append("getVisibleXMaxBarIndex startTime");
        sb.append(q15.a(j2, "yyyy-MM-dd HH:mm:ss"));
        sb.append(" endTime");
        sb.append(q15.a(j3, "yyyy-MM-dd HH:mm:ss"));
        if (j2 < j3 && ((BarData) getData()).getDataSets() != null && ((BarData) getData()).getDataSets().size() > 0) {
            if (!(((BarData) getData()).getDataSets().get(0) instanceof BarDataSet) || (barDataSet = (BarDataSet) ((BarData) getData()).getDataSets().get(0)) == null || barDataSet.getEntryCount() <= 0 || !(((BarEntry) barDataSet.getEntryForIndex(0)).getData() instanceof SleepBarData)) {
                return;
            }
            long showMaxY = 0;
            int i = 0;
            long maxY = 0;
            for (int i2 = 0; i2 < barDataSet.getEntryCount(); i2++) {
                SleepBarData sleepBarData = (SleepBarData) ((BarEntry) barDataSet.getEntryForIndex(i2)).getData();
                if (sleepBarData.getTimestamp() >= j2 && sleepBarData.getTimestamp() <= j3) {
                    if (sleepBarData.getShowMaxY() >= showMaxY) {
                        showMaxY = sleepBarData.getShowMaxY();
                        i = i2;
                    }
                    if (sleepBarData.getMaxY() >= maxY) {
                        maxY = sleepBarData.getMaxY();
                    }
                }
            }
            if (z) {
                setSelected(i);
            }
            S(maxY);
        }
    }

    @Override // com.heytap.health.core.widget.charts.SleepBarChart
    public void setChartData(List<SleepBarData> list) {
        this.mAnimator.setPhaseY(0.0f);
        super.setChartData(list);
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setSelected(int i) {
        this.U = i;
        super.setSelected(i);
    }

    public SleepCustBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.T = "SleepCustBarChart";
        this.U = -1;
        this.V = 10800000L;
    }

    public SleepCustBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.T = "SleepCustBarChart";
        this.U = -1;
        this.V = 10800000L;
    }
}