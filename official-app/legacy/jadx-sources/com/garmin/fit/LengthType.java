package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum LengthType {
    IDLE(0),
    ACTIVE(1),
    INVALID(255);

    protected short value;

    LengthType(short s) {
        this.value = s;
    }

    public static LengthType getByValue(Short sh) {
        for (LengthType lengthType : values()) {
            if (sh.shortValue() == lengthType.value) {
                return lengthType;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(LengthType lengthType) {
        return lengthType.name();
    }

    public short getValue() {
        return this.value;
    }
}
