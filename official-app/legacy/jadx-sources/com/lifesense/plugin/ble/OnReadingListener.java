package com.lifesense.plugin.ble;

import com.lifesense.plugin.ble.data.tracker.ATBatteryInfo;
import com.lifesense.plugin.ble.data.tracker.ATImageInfo;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OnReadingListener {
    public void onDeviceBatteryInfoUpdate(String str, ATBatteryInfo aTBatteryInfo) {
    }

    public void onDeviceImageInfoUpdate(String str, ATImageInfo aTImageInfo) {
    }
}
