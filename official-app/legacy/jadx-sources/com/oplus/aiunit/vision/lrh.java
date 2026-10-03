package com.oplus.aiunit.vision;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.BarLineScatterCandleBubbleData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;

/* JADX INFO: loaded from: classes16.dex */
public abstract class lrh extends ChartTouchListener<BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>>> {
    public ahd i;

    public lrh(BarLineChartBase<? extends BarLineScatterCandleBubbleData<? extends IBarLineScatterCandleBubbleDataSet<? extends Entry>>> barLineChartBase) {
        super(barLineChartBase);
    }

    public void setOnChartScrollListener(ahd ahdVar) {
        this.i = ahdVar;
    }
}
