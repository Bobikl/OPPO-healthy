package com.oplus.epona;

/* JADX INFO: loaded from: classes2.dex */
public enum ResponseCode {
    SUCCESS(1),
    FAILED(-1),
    PERMISSION_DENY(-2);

    private int code;

    ResponseCode(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
