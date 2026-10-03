package com.lifesense.plugin.ble.device.proto.A5;

/* JADX INFO: loaded from: classes5.dex */
/* synthetic */ class c {
    static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.lifesense.plugin.ble.device.proto.a.values().length];
        a = iArr;
        try {
            iArr[com.lifesense.plugin.ble.device.proto.a.WRITE_UPGRADE_FILE_HEADER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DATA_TO_DEVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_BLOCK_CONFIRM_COMMAND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[com.lifesense.plugin.ble.device.proto.a.WRITE_START_VERIFY_COMMAND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[com.lifesense.plugin.ble.device.proto.a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[com.lifesense.plugin.ble.device.proto.a.WRITE_START_UPGRADING_NOTIFY_COMMAND.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[com.lifesense.plugin.ble.device.proto.a.WAITING_TO_RECEIVE_DATA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
