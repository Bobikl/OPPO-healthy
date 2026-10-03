package com.garmin.fit;

/* JADX INFO: loaded from: classes13.dex */
public enum TissueModelType {
    ZHL_16C(0),
    INVALID(255);

    protected short value;

    TissueModelType(short s) {
        this.value = s;
    }

    public static TissueModelType getByValue(Short sh) {
        for (TissueModelType tissueModelType : values()) {
            if (sh.shortValue() == tissueModelType.value) {
                return tissueModelType;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(TissueModelType tissueModelType) {
        return tissueModelType.name();
    }

    public short getValue() {
        return this.value;
    }
}
