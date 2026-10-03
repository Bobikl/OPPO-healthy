package com.lifesense.plugin.ble;

import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.tracker.ATDeviceData;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OnSyncingListener {
    public void onActivityTrackerDataUpdate(String str, int i, ATDeviceData aTDeviceData) {
    }

    public void onDeviceInformationUpdate(String str, LSDeviceInfo lSDeviceInfo) {
    }

    public void onStateChanged(String str, LSConnectState lSConnectState) {
    }
}
