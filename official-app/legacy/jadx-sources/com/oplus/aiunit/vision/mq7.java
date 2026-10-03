package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class mq7 extends CombinedData {
    public LineDataSet a;
    public zd7 b;

    public mq7(List<BarEntry> list, List<Entry> list2) {
        this.a = new LineDataSet(list2, "");
        this.b = new zd7(list);
        LineData lineData = new LineData();
        lineData.addDataSet(this.a);
        BarData barData = new BarData();
        barData.addDataSet(this.b);
        setData(barData);
        setData(lineData);
    }

    public zd7 a() {
        return this.b;
    }

    public LineDataSet b() {
        return this.a;
    }
}
