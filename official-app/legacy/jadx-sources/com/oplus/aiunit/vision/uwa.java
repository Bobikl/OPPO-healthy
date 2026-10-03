package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class uwa extends CombinedData {
    private final BarDataSet barDataSet;
    private final List<LineDataSet> lineDataSets;

    public uwa(BarDataSet barDataSet, List<LineDataSet> list) {
        this.barDataSet = barDataSet;
        this.lineDataSets = list;
    }

    public BarDataSet getBarDataSet() {
        return this.barDataSet;
    }

    public List<LineDataSet> getLineDataSets() {
        return this.lineDataSets;
    }
}
