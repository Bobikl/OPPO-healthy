package com.heytap.health.core.widget.charts.data;

import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;

/* JADX INFO: loaded from: classes16.dex */
public class HealthBarEntry extends BarEntry {
    private int color;
    private HealthGradientColor gradientColor;

    public HealthBarEntry(float f, float f2) {
        super(f, f2);
    }

    public int getColor() {
        return this.color;
    }

    public HealthGradientColor getGradientColor() {
        return this.gradientColor;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setGradientColor(HealthGradientColor healthGradientColor) {
        this.gradientColor = healthGradientColor;
    }

    public HealthBarEntry(float f, float f2, int i) {
        super(f, f2);
        this.color = i;
    }

    public HealthBarEntry(float f, float f2, HealthGradientColor healthGradientColor) {
        super(f, f2);
        this.gradientColor = healthGradientColor;
    }

    public HealthBarEntry(float f, float f2, Object obj) {
        super(f, f2, obj);
    }

    public HealthBarEntry(float f, float f2, Object obj, int i) {
        super(f, f2, obj);
        this.color = i;
    }

    public HealthBarEntry(float f, float f2, int i, HealthGradientColor healthGradientColor) {
        super(f, f2);
        this.color = i;
        this.gradientColor = healthGradientColor;
    }

    public HealthBarEntry(float f, float f2, Object obj, HealthGradientColor healthGradientColor) {
        super(f, f2, obj);
        this.gradientColor = healthGradientColor;
    }

    public HealthBarEntry(float f, float f2, Object obj, int i, HealthGradientColor healthGradientColor) {
        super(f, f2, obj);
        this.color = i;
        this.gradientColor = healthGradientColor;
    }

    public HealthBarEntry(float f, float f2, Drawable drawable) {
        super(f, f2, drawable);
    }

    public HealthBarEntry(float f, float f2, Drawable drawable, Object obj) {
        super(f, f2, drawable, obj);
    }
}
