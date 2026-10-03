package com.oplus.drs.core.track;

/* JADX INFO: loaded from: classes6.dex */
public enum DataType {
    BIZ(0),
    TECH(1);

    private final int dataType;

    DataType(int i) {
        this.dataType = i;
    }

    public int value() {
        return this.dataType;
    }
}
