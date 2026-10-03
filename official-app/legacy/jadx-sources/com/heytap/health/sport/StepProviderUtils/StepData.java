package com.heytap.health.sport.StepProviderUtils;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class StepData {
    private int modifiedIndex;
    private int offset;
    private int offsetRun;
    private int offsetWalk;
    private int state;
    private int step;
    private int stepRun;
    private int stepWalk;
    private String time;
    private long timestamp;
    private int type;

    public StepData() {
        this.time = "";
        this.timestamp = 0L;
        this.step = 0;
        this.type = 1;
        this.state = 0;
        this.offset = 0;
        this.modifiedIndex = 0;
        this.stepWalk = 0;
        this.stepRun = 0;
        this.offsetWalk = 0;
        this.offsetRun = 0;
    }

    public int getModifiedIndex() {
        return this.modifiedIndex;
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

    public int getState() {
        return this.state;
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

    public String getTime() {
        return this.time;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getType() {
        return this.type;
    }

    public void setModifiedIndex(int i) {
        this.modifiedIndex = i;
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

    public void setState(int i) {
        this.state = i;
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

    public void setTime(String str) {
        this.time = str;
    }

    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "StepData{time=" + this.timestamp + ", timestamp=" + this.time + ", value=" + this.modifiedIndex + ", walkStep=" + this.stepWalk + ", runStep=" + this.stepRun + ", offset=" + this.offset + ", walkStepOffset=" + this.offsetWalk + ", runStepOffset=" + this.offsetRun + ", type=" + this.type + ", state=" + this.state + '}';
    }

    public StepData(long j2, int i) {
        this.time = "";
        this.step = 0;
        this.type = 1;
        this.state = 0;
        this.offset = 0;
        this.stepWalk = 0;
        this.stepRun = 0;
        this.offsetWalk = 0;
        this.offsetRun = 0;
        this.timestamp = j2;
        this.modifiedIndex = i;
    }

    public StepData(long j2, int i, int i2, int i3, int i4) {
        this.time = "";
        this.step = 0;
        this.stepWalk = 0;
        this.stepRun = 0;
        this.offsetWalk = 0;
        this.offsetRun = 0;
        this.timestamp = j2;
        this.modifiedIndex = i;
        this.type = i2;
        this.state = i3;
        this.offset = i4;
    }
}
