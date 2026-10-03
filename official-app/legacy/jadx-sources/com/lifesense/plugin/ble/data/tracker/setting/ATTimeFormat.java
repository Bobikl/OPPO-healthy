package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATTimeFormat {
    H24(0),
    H12(1);

    private int command;

    ATTimeFormat(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
