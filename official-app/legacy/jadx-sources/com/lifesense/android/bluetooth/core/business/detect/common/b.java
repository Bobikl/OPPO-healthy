package com.lifesense.android.bluetooth.core.business.detect.common;

/* JADX INFO: loaded from: classes4.dex */
public enum b {
    UNKNOWN(0),
    SCAN_ERROR(1),
    CREATE_GATT_ERROR(2),
    CONNECT_TIMEOUT(3),
    DISCOVER_SERVICE_ERROR(4),
    ENABLE_CHARACTERISTIC_ERROR(5),
    WRITE_CHARACTERISTIC_ERROR(6),
    READ_CHARACTERISTIC_ERROR(7),
    CONNECT_FAILURE_WITHOUT_SCAN_RESULT(8),
    CONNECT_FAILURE_WITH_SCAN_RESULT(9),
    FREQUENTLY_DISCONNECTED(10),
    ABNORMAL_DISCONNECTED(11),
    GATT_RESOURCE_BLOCKING(12),
    READ_CHARACTERISTIC_TIMEOUT(13),
    WRITE_CHARACTERISTIC_TIMEOUT(14),
    ENABLE_CHARACTERISTIC_TIMEOUT(15),
    DISCOVER_SERVICE_TIMEOUT(16),
    CONNECT_FAILURE(17);

    public int a;

    b(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }
}
