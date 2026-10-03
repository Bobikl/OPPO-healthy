package com.heytap.health.core.widget.charts.data;

import com.github.mikephil.charting.data.Entry;
import com.oplus.aiunit.vision.fn9;

/* JADX INFO: loaded from: classes16.dex */
public class SmartScaleCircleFlagEntry extends Entry {
    private boolean circleVisible;
    private Object data;
    private long timestamp;
    private float x;
    private float y;

    public SmartScaleCircleFlagEntry(float f, float f2, boolean z) {
        super(f, f2);
        this.circleVisible = z;
        this.x = f;
        this.y = f2;
        this.data = null;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public Entry copy() {
        return new SmartScaleCircleFlagEntry(this.x, this.y, this.timestamp, this.circleVisible, this.data);
    }

    public boolean getCircleVisible() {
        return this.circleVisible;
    }

    @Override // com.github.mikephil.charting.data.BaseEntry
    public Object getData() {
        return this.data;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public float getX() {
        return this.x;
    }

    public void setCircleVisible(boolean z) {
        this.circleVisible = z;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    @Override // com.github.mikephil.charting.data.Entry
    public String toString() {
        return "SmartScaleCircleFlagEntry{, x=" + this.x + ", y=" + this.y + ", circleVisible=" + this.circleVisible + ", timestamp=" + this.timestamp + ", timestamp=" + fn9.g(this.timestamp, "MMMdd HH:mm") + ", data=" + this.data + '}';
    }

    public SmartScaleCircleFlagEntry(float f, float f2, boolean z, Object obj) {
        super(f, f2, obj);
        this.circleVisible = z;
        this.x = f;
        this.y = f2;
        this.data = obj;
    }

    public SmartScaleCircleFlagEntry(float f, float f2, long j2, boolean z, Object obj) {
        super(f, f2, obj);
        this.circleVisible = z;
        this.x = f;
        this.y = f2;
        this.timestamp = j2;
        this.data = obj;
    }
}
