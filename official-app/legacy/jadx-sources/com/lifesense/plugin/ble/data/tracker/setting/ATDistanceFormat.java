package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATDistanceFormat {
    Kilometer(0),
    Mile(1);

    private int command;

    ATDistanceFormat(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
