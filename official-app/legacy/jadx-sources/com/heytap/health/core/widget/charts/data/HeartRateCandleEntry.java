package com.heytap.health.core.widget.charts.data;

import com.github.mikephil.charting.data.CandleEntry;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateCandleEntry extends CandleEntry {
    private Object data;
    private float high;
    private float low;
    private float middleHigh;
    private float middleHighV2;
    private float middleLow;
    private float middleLowV2;

    public HeartRateCandleEntry(float f, float f2, float f3, float f4, float f5) {
        super(f, f2, f3, f4, f5);
        this.low = f3;
        this.high = f2;
        this.middleHigh = f4;
        this.middleLow = f5;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public Object getData() {
        return this.data;
    }

    @Override // com.github.mikephil.charting.data.CandleEntry
    public float getHigh() {
        return this.high;
    }

    @Override // com.github.mikephil.charting.data.CandleEntry
    public float getLow() {
        return this.low;
    }

    public float getMiddleHigh() {
        return this.middleHigh;
    }

    public float getMiddleHighV2() {
        return this.middleHighV2;
    }

    public float getMiddleLow() {
        return this.middleLow;
    }

    public float getMiddleLowV2() {
        return this.middleLowV2;
    }

    public void setMiddleHighV2(float f) {
        this.middleHighV2 = f;
    }

    public void setMiddleLowV2(float f) {
        this.middleLowV2 = f;
    }

    @Override // com.github.mikephil.charting.data.CandleEntry, com.github.mikephil.charting.data.Entry
    public CandleEntry copy() {
        return new HeartRateCandleEntry(getX(), this.high, this.low, this.middleHigh, this.middleLow, this.middleHighV2, this.middleLowV2, getData());
    }

    public HeartRateCandleEntry(float f, float f2, float f3, float f4, float f5, float f6, float f7, Object obj) {
        super(f, f2, f3, f4, f5, obj);
        this.low = f3;
        this.high = f2;
        this.middleHigh = f4;
        this.middleLow = f5;
        this.middleHighV2 = f6;
        this.middleLowV2 = f7;
        this.data = obj;
    }
}
