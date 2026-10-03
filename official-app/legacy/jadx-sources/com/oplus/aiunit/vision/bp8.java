package com.oplus.aiunit.vision;

import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.highlight.ChartHighlighter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.MPPointD;

/* JADX INFO: loaded from: classes16.dex */
public class bp8 extends ChartHighlighter {
    public boolean a;
    public boolean b;

    public bp8(BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider, boolean z, boolean z2) {
        super(barLineScatterCandleBubbleDataProvider);
        this.a = z;
        this.b = z2;
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter, com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f, float f2) {
        return super.getHighlight(f, f2);
    }

    @Override // com.github.mikephil.charting.highlight.ChartHighlighter
    public MPPointD getValsForTouch(float f, float f2) {
        MPPointD valuesByTouchPoint = this.mChart.getTransformer(this.b ? YAxis.AxisDependency.RIGHT : YAxis.AxisDependency.LEFT).getValuesByTouchPoint(f, f2);
        if (!this.a && !this.b) {
            a7b.f(Chart.LOG_TAG, "warning , Y axis is not enabled !");
        }
        return valuesByTouchPoint;
    }
}
