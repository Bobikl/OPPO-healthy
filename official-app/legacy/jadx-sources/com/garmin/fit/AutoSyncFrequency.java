package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum AutoSyncFrequency {
    NEVER(0),
    OCCASIONALLY(1),
    FREQUENT(2),
    ONCE_A_DAY(3),
    REMOTE(4),
    INVALID(255);

    protected short value;

    AutoSyncFrequency(short s) {
        this.value = s;
    }

    public static AutoSyncFrequency getByValue(Short sh) {
        for (AutoSyncFrequency autoSyncFrequency : values()) {
            if (sh.shortValue() == autoSyncFrequency.value) {
                return autoSyncFrequency;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(AutoSyncFrequency autoSyncFrequency) {
        return autoSyncFrequency.name();
    }

    public short getValue() {
        return this.value;
    }
}
