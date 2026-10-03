package com.lifesense.device.scale.application.interfaces.listener;

import com.lifesense.android.bluetooth.core.bean.WifiInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.enums.WifiState;

/* JADX INFO: loaded from: classes4.dex */
public interface OnDeviceConnectStateListener {
    void onDeviceConnectStateChange(String str, DeviceConnectState deviceConnectState);

    void onReceiveWifiConfigInfo(int i, String str);

    void onReceiveWifiConnectState(WifiState wifiState);

    void onReceiveWifiScanEnd();

    void onReceiveWifiScanResult(WifiInfo wifiInfo);
}
