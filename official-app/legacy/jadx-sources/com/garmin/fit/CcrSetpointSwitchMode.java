package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum CcrSetpointSwitchMode {
    MANUAL(0),
    AUTOMATIC(1),
    INVALID(255);

    protected short value;

    CcrSetpointSwitchMode(short s) {
        this.value = s;
    }

    public static CcrSetpointSwitchMode getByValue(Short sh) {
        for (CcrSetpointSwitchMode ccrSetpointSwitchMode : values()) {
            if (sh.shortValue() == ccrSetpointSwitchMode.value) {
                return ccrSetpointSwitchMode;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(CcrSetpointSwitchMode ccrSetpointSwitchMode) {
        return ccrSetpointSwitchMode.name();
    }

    public short getValue() {
        return this.value;
    }
}
