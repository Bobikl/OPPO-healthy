package com.heytap.health.core.widget.charts;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.renderer.XAxisRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.core.widget.charts.renderer.BaseYAxisRenderer;
import com.oplus.aiunit.vision.oya;
import com.oplus.aiunit.vision.xp0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTimeXBarChart extends HealthBarChart {
    public double O;
    public ViewPortHandler P;

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
            HealthTimeXBarChart healthTimeXBarChart = HealthTimeXBarChart.this;
            xp0 xp0Var = healthTimeXBarChart.K;
            return xp0Var != null ? xp0Var.a(i, ((double) f) + healthTimeXBarChart.O) : super.getAxisLabel((float) (((double) f) + healthTimeXBarChart.O), axisBase);
        }
    }

    public HealthTimeXBarChart(Context context) {
        this(context, null, 0);
    }

    public float E(LocalDateTime localDateTime) {
        return (((int) (this.J.timeStampToUnitDouble(localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()) - this.O)) - (getBarWidth() / 2.0f)) - this.N;
    }

    public List<HealthSingleBarEntry> F(List<TimeStampedData> list) {
        if (list == null || list.isEmpty()) {
            clear();
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            TimeStampedData timeStampedData = list.get(i);
            if (this.J == TimeUnit.ORIGINAL) {
                arrayList.add(new HealthSingleBarEntry((float) (((double) i) - this.O), timeStampedData.getY(), timeStampedData, timeStampedData.getColor(), timeStampedData.getGradientColor()));
            } else {
                arrayList.add(new HealthSingleBarEntry((float) (this.J.timeStampToUnitDouble(timeStampedData.getTimestamp()) - this.O), timeStampedData.getY(), timeStampedData, timeStampedData.getColor(), timeStampedData.getGradientColor()));
            }
        }
        return arrayList;
    }

    public void G(Boolean bool) {
        XAxisRenderer xAxisRenderer = this.mXAxisRenderer;
        if (xAxisRenderer instanceof oya) {
            ((oya) xAxisRenderer).g(bool.booleanValue());
        }
    }

    public void H(double d) {
        super.moveViewToX((float) (d - this.O));
    }

    public double getHighestVisibleValueX() {
        return ((double) getHighestVisibleX()) + this.O;
    }

    public LocalDateTime getLowestVisiableDate() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli((long) (((double) (((int) getLowestVisibleValueX()) + 1)) * getXAxisTimeUnit().getUnit())), ZoneId.systemDefault());
    }

    public double getLowestVisibleValueX() {
        return ((double) getLowestVisibleX()) + this.O;
    }

    public double getXAxisOffset() {
        return this.O;
    }

    public double getxStart() {
        return this.O;
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void r() {
        super.r();
        getXAxis().setValueFormatter(new a());
        f(true, false, true, false);
        n(24.0f, 0.0f, 35.0f, 0.0f);
        B(BaseYAxisRenderer.LinePosition.END, 0.0f);
    }

    @Override // com.heytap.health.core.widget.charts.HealthBarChart
    public void setBarData(List<TimeStampedData> list) {
        setEntryList(F(list));
    }

    public void setTimeXAxisMaximum(double d) {
        getXAxis().setAxisMaximum(((float) (d - this.O)) + (getBarWidth() / 2.0f) + this.N);
        postInvalidate();
    }

    public void setTimeXAxisMinimum(double d) {
        this.O = d - 0.0d;
        getXAxis().setAxisMinimum((0.0f - (getBarWidth() / 2.0f)) - this.N);
        postInvalidate();
    }

    public void setXStart(double d) {
        this.O = d;
    }

    public HealthTimeXBarChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HealthTimeXBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.O = 0.0d;
        this.P = this.mViewPortHandler;
    }
}