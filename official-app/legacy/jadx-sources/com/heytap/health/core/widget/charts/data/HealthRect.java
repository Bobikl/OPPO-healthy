package com.heytap.health.core.widget.charts.data;

import androidx.annotation.NonNull;
import com.github.mikephil.charting.data.Entry;

/* JADX INFO: loaded from: classes16.dex */
public class HealthRect extends Entry {
    private float leftBottomRadius;
    private float leftTopRadius;
    private float rightBottomRadius;
    private float rightTopRadius;
    private float x1;
    private float y1;

    public HealthRect(float f, float f2, float f3, float f4, Object obj) {
        super(f, f2, obj);
        this.x1 = f3;
        this.y1 = f4;
    }

    public float getLeftBottomRadius() {
        return this.leftBottomRadius;
    }

    public float getLeftTopRadius() {
        return this.leftTopRadius;
    }

    public float getRightBottomRadius() {
        return this.rightBottomRadius;
    }

    public float getRightTopRadius() {
        return this.rightTopRadius;
    }

    public float getX1() {
        return this.x1;
    }

    public float getY1() {
        return this.y1;
    }

    public void setLeftBottomRadius(float f) {
        this.leftBottomRadius = f;
    }

    public void setLeftTopRadius(float f) {
        this.leftTopRadius = f;
    }

    public void setRightBottomRadius(float f) {
        this.rightBottomRadius = f;
    }

    public void setRightTopRadius(float f) {
        this.rightTopRadius = f;
    }

    public void setX1(float f) {
        this.x1 = f;
    }

    public void setY1(float f) {
        this.y1 = f;
    }

    @Override // com.github.mikephil.charting.data.Entry
    @NonNull
    public String toString() {
        return "HealthRect{x=" + getX() + "y=" + getY() + "x1=" + this.x1 + ", y1=" + this.y1 + ", leftTopRadius=" + this.leftTopRadius + ", leftBottomRadius=" + this.leftBottomRadius + ", rightTopRadius=" + this.rightTopRadius + ", rightBottomRadius=" + this.rightBottomRadius + '}';
    }

    public HealthRect(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, Object obj) {
        super(f, f2, obj);
        this.x1 = f3;
        this.y1 = f4;
        this.leftTopRadius = f5;
        this.leftBottomRadius = f6;
        this.rightTopRadius = f7;
        this.rightBottomRadius = f8;
    }
}
