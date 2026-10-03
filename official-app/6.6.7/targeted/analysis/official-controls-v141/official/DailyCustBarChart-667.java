package com.heytap.health.daily.view;

import android.content.Context;
import android.util.AttributeSet;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.heytap.health.core.widget.charts.HealthTimeXBarChart;
import com.heytap.health.core.widget.charts.data.HealthSingleBarEntry;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.core.widget.charts.data.TimeUnit;
import com.heytap.health.daily.bean.ConsumptionCompareData;
import com.heytap.health.daily.utils.ScrollMode;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.q15;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class DailyCustBarChart extends HealthTimeXBarChart {
    public static String Q = "DailyCustBarChart";

    public DailyCustBarChart(Context context) {
        super(context);
    }

    public List<HealthSingleBarEntry> I(List<ConsumptionCompareData> list) {
        if (list == null || list.isEmpty()) {
            clear();
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ConsumptionCompareData consumptionCompareData = list.get(i);
            if (this.J == TimeUnit.ORIGINAL) {
                arrayList.add(new HealthSingleBarEntry((float) (((double) i) - this.O), consumptionCompareData.getY(), consumptionCompareData, consumptionCompareData.getColor(), consumptionCompareData.getGradientColor()));
            } else {
                arrayList.add(new HealthSingleBarEntry((float) (this.J.timeStampToUnitDouble(consumptionCompareData.getTimestamp()) - this.O), consumptionCompareData.getY(), consumptionCompareData, consumptionCompareData.getColor(), consumptionCompareData.getGradientColor()));
            }
        }
        return arrayList;
    }

    public void J(float f) {
        setYAxisLabelCount(3);
        float f2 = f / 1000.0f;
        float f3 = 20.0f;
        if (f2 <= 0.0f) {
            f2 = 20.0f;
        }
        if (f2 > 80.0f && f2 <= 400.0f) {
            f3 = 50.0f;
        } else if (f2 > 400.0f) {
            f3 = 100.0f;
        }
        float fCeil = f3 * ((float) Math.ceil(f2 / f3));
        o(new float[]{0.0f, (fCeil / 2.0f) * 1000.0f, fCeil * 1000.0f}, false);
    }

    public float K(long j2, long j3, float f, ScrollMode scrollMode) {
        float fL = L(j2, j3);
        if (scrollMode == ScrollMode.DAY) {
            J(fL);
        } else {
            M(f, fL);
        }
        return fL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float L(long j2, long j3) {
        m8b.f(Q, "getVisibleXMaxBarIndex startTime" + q15.a(j2, "yyyy-MM-dd HH:mm:ss") + "endTime:" + q15.a(j3, "yyyy-MM-dd HH:mm:ss"));
        BarData barData = getBarData();
        float f = 0.0f;
        if (barData != null && barData.getDataSetCount() >= 1) {
            if (barData.getDataSetByIndex(0) instanceof BarDataSet) {
                BarDataSet barDataSet = (BarDataSet) barData.getDataSetByIndex(0);
                if (barDataSet.getEntryCount() <= 0) {
                    return 0.0f;
                }
                for (int i = 0; i < barDataSet.getEntryCount(); i++) {
                    TimeStampedData timeStampedData = (TimeStampedData) ((BarEntry) barDataSet.getEntryForIndex(i)).getData();
                    if (timeStampedData.getTimestamp() >= j2 && timeStampedData.getTimestamp() <= j3) {
                        float y = timeStampedData.getY();
                        if (y >= f) {
                            f = y;
                        }
                    }
                }
            }
        }
        return f;
    }

    public void M(float f, float f2) {
        float fMax = Math.max(f, f2) / 1000.0f;
        float f3 = 100.0f;
        if (fMax < 100.0f) {
            fMax = 100.0f;
        }
        if (fMax <= 200.0f) {
            if (fMax > 100.0f) {
                fMax = 200.0f;
            }
            f3 = 50.0f;
        } else if (fMax <= 2000.0f) {
            if (fMax > 1200.0f) {
                fMax = 2000.0f;
            }
            f3 = 200.0f;
        }
        float fCeil = f3 * ((float) Math.ceil(fMax / f3));
        getAxisRight().setLabelCount(3, true);
        o(new float[]{0.0f, (fCeil / 2.0f) * 1000.0f, fCeil * 1000.0f}, false);
    }

    public void setConsumptionData(List<ConsumptionCompareData> list) {
        setEntryList(I(list));
    }

    public DailyCustBarChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DailyCustBarChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}