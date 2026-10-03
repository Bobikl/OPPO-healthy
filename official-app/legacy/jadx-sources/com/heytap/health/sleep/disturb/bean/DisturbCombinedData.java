package com.heytap.health.sleep.disturb.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.LineDataSet;
import com.oplus.aiunit.vision.uwa;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class DisturbCombinedData extends uwa {
    private String fallSleepEvaluate1;
    private String fallSleepEvaluate2;
    private long fallSleepMax;
    private long fallSleepMin;
    private boolean isEmpty;
    private String sleepDurationEvaluate1;
    private String sleepDurationEvaluate2;

    public DisturbCombinedData(BarDataSet barDataSet, List<LineDataSet> list) {
        super(barDataSet, list);
    }

    public String getFallSleepEvaluate1() {
        return this.fallSleepEvaluate1;
    }

    public String getFallSleepEvaluate2() {
        return this.fallSleepEvaluate2;
    }

    public long getFallSleepMax() {
        return this.fallSleepMax;
    }

    public long getFallSleepMin() {
        return this.fallSleepMin;
    }

    public String getSleepDurationEvaluate1() {
        return this.sleepDurationEvaluate1;
    }

    public String getSleepDurationEvaluate2() {
        return this.sleepDurationEvaluate2;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public void setEmpty(boolean z) {
        this.isEmpty = z;
    }

    public void setFallSleepEvaluate1(String str) {
        this.fallSleepEvaluate1 = str;
    }

    public void setFallSleepEvaluate2(String str) {
        this.fallSleepEvaluate2 = str;
    }

    public void setFallSleepMax(long j2) {
        this.fallSleepMax = j2;
    }

    public void setFallSleepMin(long j2) {
        this.fallSleepMin = j2;
    }

    public void setSleepDurationEvaluate1(String str) {
        this.sleepDurationEvaluate1 = str;
    }

    public void setSleepDurationEvaluate2(String str) {
        this.sleepDurationEvaluate2 = str;
    }

    @NonNull
    public String toString() {
        return "DisturbCombinedData{isEmpty=" + this.isEmpty + ", fallSleepMin=" + this.fallSleepMin + ", fallSleepMax=" + this.fallSleepMax + ", fallSleepEvaluate1='" + this.fallSleepEvaluate1 + "', fallSleepEvaluate2='" + this.fallSleepEvaluate2 + "', sleepDurationEvaluate1='" + this.sleepDurationEvaluate1 + "', sleepDurationEvaluate2='" + this.sleepDurationEvaluate2 + "'}";
    }
}
