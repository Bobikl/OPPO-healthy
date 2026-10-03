package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public class LSOtaProfilesConfig extends IBManagerConfig {
    private boolean disableReconnect;
    private boolean fullDebugPermission;
    private int reconnectCount;

    public LSOtaProfilesConfig() {
        this.fullDebugPermission = false;
        this.reconnectCount = 3;
        this.disableReconnect = false;
    }

    public int getReconnectCount() {
        return this.reconnectCount;
    }

    public boolean isDisableReconnect() {
        return this.disableReconnect;
    }

    public boolean isFullDebugPermission() {
        return this.fullDebugPermission;
    }

    public void setDisableReconnect(boolean z) {
        this.disableReconnect = z;
    }

    public void setFullDebugPermission(boolean z) {
        this.fullDebugPermission = z;
    }

    public void setReconnectCount(int i) {
        this.reconnectCount = i;
    }

    public String toString() {
        return "LSOtaProfilesConfig{fullDebugPermission=" + this.fullDebugPermission + ", reconnectCount=" + this.reconnectCount + ", disableReconnect=" + this.disableReconnect + '}';
    }

    public LSOtaProfilesConfig(boolean z) {
        this.fullDebugPermission = z;
        this.reconnectCount = 3;
        this.disableReconnect = false;
    }
}
