package com.lifesense.plugin.ble.data.tracker.config;

/* JADX INFO: loaded from: classes5.dex */
public enum ATDisplayItem {
    Time(1),
    Bluetooth(2),
    Power(4),
    Step(8),
    Date(16),
    Week(32);

    private int value;

    ATDisplayItem(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
