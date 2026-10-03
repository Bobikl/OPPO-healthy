package com.lifesense.plugin.ble;

import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSDevicePairSetting;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OnPairingListener {
    public void onMessageUpdate(String str, LSDevicePairSetting lSDevicePairSetting) {
    }

    public void onStateChanged(LSDeviceInfo lSDeviceInfo, int i) {
    }
}
