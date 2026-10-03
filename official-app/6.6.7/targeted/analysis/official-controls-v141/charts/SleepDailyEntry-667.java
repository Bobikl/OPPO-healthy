package com.heytap.health.core.widget.charts.data;

import com.github.mikephil.charting.data.BarEntry;

/* JADX INFO: loaded from: classes16.dex */
public class SleepDailyEntry extends BarEntry {
    private float duration;
    private float lowY;

    public SleepDailyEntry(float f, float f2, float f3, float f4, Object obj) {
        super(f, f4, obj);
        this.duration = f2;
        this.lowY = f3;
    }

    public float getDuration() {
        return this.duration;
    }

    public float getEndX() {
        return getX() + this.duration;
    }

    public float getLowY() {
        return this.lowY;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public String toString() {
        return "SleepDailyEntry{/x=" + getX() + "/y=" + getY() + "/x2=" + (getX() + this.duration) + "/y2=" + this.lowY + '}';
    }
}