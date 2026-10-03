package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATControlState {
    LoginReset(0),
    Disconnect(1),
    Unbind(2),
    Restart(3),
    Reset(4),
    Shutdown(5);

    private int state;

    ATControlState(int i) {
        this.state = i;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
    }
}
