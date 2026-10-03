package com.lifesense.android.bluetooth.core.business.detect.common;

/* JADX INFO: loaded from: classes4.dex */
public enum a {
    UNKNOWN(0),
    BLUETOOTH_EXCEPTION(225),
    CONNECT_EXCEPTION(226),
    FREQUENTLY_DISCONNECT_EXCEPTION(227),
    ABNORMAL_DISCONNECT_EXCEPTION(228),
    BLUETOOTH_UNAVAILIABLE(229);

    public int a;

    a(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
