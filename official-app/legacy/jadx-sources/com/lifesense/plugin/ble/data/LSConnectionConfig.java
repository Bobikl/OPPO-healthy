package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public class LSConnectionConfig extends IBManagerConfig {
    private long delayTime;

    public LSConnectionConfig(long j2) {
        this.delayTime = 5000L;
        if (j2 >= 0) {
            this.delayTime = j2;
        }
    }

    public long getDelayTime() {
        return this.delayTime;
    }

    public void setDelayTime(long j2) {
        this.delayTime = j2;
    }

    public String toString() {
        return "LSConnectionConfig{delayTime=" + this.delayTime + '}';
    }
}
