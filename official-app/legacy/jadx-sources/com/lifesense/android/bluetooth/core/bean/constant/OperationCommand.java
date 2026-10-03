package com.lifesense.android.bluetooth.core.bean.constant;

/* JADX INFO: loaded from: classes4.dex */
public enum OperationCommand {
    UNKNOWN(0),
    CMD_RANDOM_NUMBER(1),
    CMD_DEVICE_ID(2),
    CMD_PAIRED_CONFIRM(3),
    CMD_UNBIND_CONFIRM(4),
    CMD_VERIFY_DEVICE(5);

    public int value;

    OperationCommand(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
