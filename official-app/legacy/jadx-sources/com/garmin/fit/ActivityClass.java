package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum ActivityClass {
    LEVEL(127),
    LEVEL_MAX(100),
    ATHLETE(128),
    INVALID(255);

    protected short value;

    ActivityClass(short s) {
        this.value = s;
    }

    public static ActivityClass getByValue(Short sh) {
        for (ActivityClass activityClass : values()) {
            if (sh.shortValue() == activityClass.value) {
                return activityClass;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(ActivityClass activityClass) {
        return activityClass.name();
    }

    public short getValue() {
        return this.value;
    }
}
