package com.heytap.health.core.widget.charts.data;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class SleepBarData extends TimeStampedData {
    private long awake;
    private long deepSleep;
    private long eyeMovement;
    private long lightSleep;

    public SleepBarData() {
    }

    public boolean deepEquals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepBarData)) {
            return false;
        }
        SleepBarData sleepBarData = (SleepBarData) obj;
        return this.timestamp == sleepBarData.timestamp && this.deepSleep == sleepBarData.deepSleep && this.lightSleep == sleepBarData.lightSleep && this.eyeMovement == sleepBarData.eyeMovement && this.awake == sleepBarData.awake;
    }

    @Override // com.heytap.health.core.widget.charts.data.TimeStampedData
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SleepBarData) && this.timestamp == ((SleepBarData) obj).timestamp;
    }

    public long getAwake() {
        return this.awake;
    }

    public long getDeepSleep() {
        return this.deepSleep;
    }

    public long getEyeMovement() {
        return this.eyeMovement;
    }

    public long getLightSleep() {
        return this.lightSleep;
    }

    public long getMaxY() {
        return this.deepSleep + this.lightSleep + this.awake + this.eyeMovement;
    }

    public long getShowMaxY() {
        return this.deepSleep + this.lightSleep + this.eyeMovement;
    }

    @Override // com.heytap.health.core.widget.charts.data.TimeStampedData
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.timestamp));
    }

    public void setAwake(long j2) {
        this.awake = j2;
    }

    public void setDeepSleep(long j2) {
        this.deepSleep = j2;
    }

    public void setEyeMovement(long j2) {
        this.eyeMovement = j2;
    }

    public void setLightSleep(long j2) {
        this.lightSleep = j2;
    }

    @Override // com.heytap.health.core.widget.charts.data.TimeStampedData
    public void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    @Override // com.heytap.health.core.widget.charts.data.TimeStampedData
    public String toString() {
        return "SleepBarData{timestamp=" + this.timestamp + ", deepSleep=" + this.deepSleep + ", lightSleep=" + this.lightSleep + ", eyeMovement=" + this.eyeMovement + ", awake=" + this.awake + '}';
    }

    public SleepBarData(long j2, long j3, long j4, long j5, long j6) {
        this.timestamp = j2;
        this.deepSleep = j3;
        this.lightSleep = j4;
        this.eyeMovement = j5;
        this.awake = j6;
    }
}