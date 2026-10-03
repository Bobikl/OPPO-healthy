package com.heytap.health.stress.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.health.core.widget.charts.data.HealthGradientColor;
import com.heytap.health.core.widget.charts.data.TimeStampedData;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StressTSData extends TimeStampedData {
    private int avgStress;
    private int maxStress;
    private int minStress;

    public StressTSData() {
    }

    public int getAvgStress() {
        return this.avgStress;
    }

    public int getMaxStress() {
        return this.maxStress;
    }

    public int getMinStress() {
        return this.minStress;
    }

    public void setAvgStress(int i) {
        this.avgStress = i;
    }

    public void setMaxStress(int i) {
        this.maxStress = i;
    }

    public void setMinStress(int i) {
        this.minStress = i;
    }

    @Override // com.heytap.health.core.widget.charts.data.TimeStampedData
    @NonNull
    public String toString() {
        return "StressTSData{maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", avgStress=" + this.avgStress + '}';
    }

    public StressTSData(long j2, float f) {
        super(j2, f);
    }

    public StressTSData(long j2, float f, int i) {
        super(j2, f, i);
    }

    public StressTSData(long j2, float f, HealthGradientColor healthGradientColor) {
        super(j2, f, healthGradientColor);
    }
}
