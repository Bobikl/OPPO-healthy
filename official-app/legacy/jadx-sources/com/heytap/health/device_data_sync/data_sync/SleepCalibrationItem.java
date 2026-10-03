package com.heytap.health.device_data_sync.data_sync;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class SleepCalibrationItem {
    private int calibrateType;
    private int endTimestamp;
    private int startTimestamp;
    private int status;

    public int getCalibrateType() {
        return this.calibrateType;
    }

    public int getEndTimestamp() {
        return this.endTimestamp;
    }

    public int getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getStatus() {
        return this.status;
    }

    public void setEndTimestamp(int i) {
        this.endTimestamp = i;
    }

    public void setStartTimestamp(int i) {
        this.startTimestamp = i;
    }

    public String toString() {
        return "SleepCalibrationItem{calibrateType=" + this.calibrateType + ", startTimestamp=" + this.startTimestamp + ", endTimestamp=" + this.endTimestamp + ", status=" + this.status + '}';
    }
}
