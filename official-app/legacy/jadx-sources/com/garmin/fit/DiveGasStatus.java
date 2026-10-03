package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum DiveGasStatus {
    DISABLED(0),
    ENABLED(1),
    BACKUP_ONLY(2),
    INVALID(255);

    protected short value;

    DiveGasStatus(short s) {
        this.value = s;
    }

    public static DiveGasStatus getByValue(Short sh) {
        for (DiveGasStatus diveGasStatus : values()) {
            if (sh.shortValue() == diveGasStatus.value) {
                return diveGasStatus;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(DiveGasStatus diveGasStatus) {
        return diveGasStatus.name();
    }

    public short getValue() {
        return this.value;
    }
}
