package com.heytap.health.sport.StepProviderUtils;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StepStatData {
    private String date;
    private int offset;
    private int offsetRun;
    private int offsetWalk;
    private int step;
    private int stepRun;
    private int stepWalk;
    private long timestamp;

    public String getDate() {
        return this.date;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getOffsetRun() {
        return this.offsetRun;
    }

    public int getOffsetWalk() {
        return this.offsetWalk;
    }

    public int getStep() {
        return this.step;
    }

    public int getStepRun() {
        return this.stepRun;
    }

    public int getStepWalk() {
        return this.stepWalk;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setOffsetRun(int i) {
        this.offsetRun = i;
    }

    public void setOffsetWalk(int i) {
        this.offsetWalk = i;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public void setStepRun(int i) {
        this.stepRun = i;
    }

    public void setStepWalk(int i) {
        this.stepWalk = i;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public String toString() {
        return "StepStatData{date='" + this.date + "', timestamp=" + this.timestamp + ", step=" + this.step + ", offset=" + this.offset + ", stepRun=" + this.stepRun + ", stepWalk=" + this.stepWalk + ", offsetRun=" + this.offsetRun + ", offsetWalk=" + this.offsetWalk + '}';
    }
}
