package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public enum ATSleepState {
    Awake(0),
    LightSleep(1),
    DeepSleep(2),
    Unknown(3);

    private int value;

    ATSleepState(int i) {
        this.value = i;
    }

    public static ATSleepState getSleepState(int i) {
        for (ATSleepState aTSleepState : values()) {
            if (aTSleepState.getValue() == i) {
                return aTSleepState;
            }
        }
        return Unknown;
    }

    public int getValue() {
        return this.value;
    }
}
