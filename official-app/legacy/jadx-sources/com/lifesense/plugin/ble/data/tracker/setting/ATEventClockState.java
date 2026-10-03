package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATEventClockState {
    Disable(0),
    Enable(1),
    Remove(128);

    private int state;

    ATEventClockState(int i) {
        this.state = i;
    }

    public static ATEventClockState getClockState(int i) {
        return (i & 1) == 1 ? Enable : Disable;
    }

    public int getState() {
        return this.state;
    }
}
