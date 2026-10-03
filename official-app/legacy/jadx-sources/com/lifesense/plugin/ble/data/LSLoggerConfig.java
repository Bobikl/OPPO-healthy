package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public class LSLoggerConfig extends IBManagerConfig {
    private boolean enable;

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public String toString() {
        return "LSLoggerConfig{enable=" + this.enable + '}';
    }
}
