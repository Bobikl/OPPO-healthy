package com.lifesense.android.bluetooth.core.business.detect.common;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static a a(int i) {
        if (b.GATT_RESOURCE_BLOCKING.a() == i) {
            return a.BLUETOOTH_UNAVAILIABLE;
        }
        if (b.FREQUENTLY_DISCONNECTED.a() == i) {
            return a.FREQUENTLY_DISCONNECT_EXCEPTION;
        }
        if (b.CONNECT_FAILURE_WITH_SCAN_RESULT.a() == i || b.CONNECT_FAILURE_WITHOUT_SCAN_RESULT.a() == i || b.CONNECT_FAILURE.a() == i) {
            return a.CONNECT_EXCEPTION;
        }
        return b.ABNORMAL_DISCONNECTED.a() == i ? a.ABNORMAL_DISCONNECT_EXCEPTION : a.BLUETOOTH_EXCEPTION;
    }
}
