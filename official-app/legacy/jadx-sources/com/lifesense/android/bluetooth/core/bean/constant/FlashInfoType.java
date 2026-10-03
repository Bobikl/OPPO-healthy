package com.lifesense.android.bluetooth.core.bean.constant;

/* JADX INFO: loaded from: classes4.dex */
public enum FlashInfoType {
    BLUETOOTH_CHIP(0),
    EXTERNAL_FALSH_CHIP(1),
    EXTERNAL_MCU_FLASH_CHIP(2);

    public int value;

    FlashInfoType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
