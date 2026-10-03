package com.oplus.aiunit.vision;

import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ip8 extends CandleDataSet {
    public float a;

    public ip8(List<CandleEntry> list, String str) {
        super(list, str);
        this.a = 1.0f;
    }

    @Override // com.github.mikephil.charting.data.CandleDataSet, com.github.mikephil.charting.interfaces.datasets.ICandleDataSet
    public float getBarSpace() {
        return this.a;
    }

    @Override // com.github.mikephil.charting.data.CandleDataSet
    public void setBarSpace(float f) {
        super.setBarSpace(f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        this.a = f;
    }
}
