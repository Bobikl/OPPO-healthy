package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum RiderPositionType {
    SEATED(0),
    STANDING(1),
    TRANSITION_TO_SEATED(2),
    TRANSITION_TO_STANDING(3),
    INVALID(255);

    protected short value;

    RiderPositionType(short s) {
        this.value = s;
    }

    public static RiderPositionType getByValue(Short sh) {
        for (RiderPositionType riderPositionType : values()) {
            if (sh.shortValue() == riderPositionType.value) {
                return riderPositionType;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(RiderPositionType riderPositionType) {
        return riderPositionType.name();
    }

    public short getValue() {
        return this.value;
    }
}
