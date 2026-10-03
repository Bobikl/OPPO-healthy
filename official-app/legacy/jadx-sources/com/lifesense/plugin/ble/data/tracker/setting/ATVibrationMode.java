package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATVibrationMode {
    Continuous(0),
    Intermittent1(1),
    Intermittent2(2),
    Intermittent3(3),
    Intermittent4(4);

    private int vibrationModeValue;

    ATVibrationMode(int i) {
        this.vibrationModeValue = i;
    }

    public static ATVibrationMode getVibrationMode(int i) {
        for (ATVibrationMode aTVibrationMode : values()) {
            if (aTVibrationMode.getValue() == i) {
                return aTVibrationMode;
            }
        }
        return Continuous;
    }

    public int getValue() {
        return this.vibrationModeValue;
    }
}
