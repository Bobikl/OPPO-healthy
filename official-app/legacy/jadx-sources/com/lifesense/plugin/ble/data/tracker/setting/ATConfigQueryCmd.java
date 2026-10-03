package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATConfigQueryCmd {
    Flash(0),
    UserInfo(1),
    IncomingCallRemind(3),
    SedentaryRemind(5),
    VibrationIntensity(8),
    DisplayBrightness(9),
    AlarmClock(10),
    Settings(11),
    Stride(2828),
    NightMode(2832),
    DisturbMode(2848);

    private int value;

    ATConfigQueryCmd(int i) {
        this.value = i;
    }

    public static ATConfigQueryCmd getConfigQueryItem(int i) {
        for (ATConfigQueryCmd aTConfigQueryCmd : values()) {
            if (aTConfigQueryCmd.value == i) {
                return aTConfigQueryCmd;
            }
        }
        return Flash;
    }

    public int getValue() {
        return this.value;
    }
}
