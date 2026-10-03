package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class md6 extends LineDataSet {
    public float a;
    public boolean b;

    public md6(List<Entry> list, String str) {
        super(list, str);
        this.b = false;
    }

    @Override // com.github.mikephil.charting.data.LineRadarDataSet, com.github.mikephil.charting.interfaces.datasets.ILineRadarDataSet
    public float getLineWidth() {
        return this.a;
    }

    @Override // com.github.mikephil.charting.data.LineRadarDataSet
    public void setLineWidth(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 10.0f) {
            f = 10.0f;
        }
        this.a = f;
    }
}
