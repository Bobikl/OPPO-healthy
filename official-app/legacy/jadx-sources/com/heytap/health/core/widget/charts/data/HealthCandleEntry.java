package com.heytap.health.core.widget.charts.data;

import com.github.mikephil.charting.data.CandleEntry;

/* JADX INFO: loaded from: classes16.dex */
public class HealthCandleEntry extends CandleEntry {
    private float high;
    private float low;

    public HealthCandleEntry(float f, float f2, float f3) {
        super(f, f3, f2, f2, f3);
        this.low = f2;
        this.high = f3;
    }

    @Override // com.github.mikephil.charting.data.CandleEntry
    public float getHigh() {
        return this.high;
    }

    @Override // com.github.mikephil.charting.data.CandleEntry
    public float getLow() {
        return this.low;
    }

    @Override // com.github.mikephil.charting.data.CandleEntry
    public void setHigh(float f) {
        this.high = f;
        setClose(f);
    }

    @Override // com.github.mikephil.charting.data.CandleEntry
    public void setLow(float f) {
        this.low = f;
        setOpen(f);
    }

    public HealthCandleEntry(float f, float f2, float f3, Object obj) {
        super(f, f3, f2, f2, f3, obj);
        this.low = f2;
        this.high = f3;
    }
}
