package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public enum LSPhoneCallState {
    Ringing(0),
    Offhook(2),
    Idle(2);

    private int value;

    LSPhoneCallState(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
