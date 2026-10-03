package com.lifesense.android.bluetooth.core;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceData;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.WifiInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.bean.constant.ProductUserInfoType;
import com.lifesense.android.bluetooth.core.enums.WifiState;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReceiveDataCallback {
    @Deprecated
    public void onDeviceConfigInfoSettingSuccess(String str, String str2, ProductUserInfoType productUserInfoType) {
    }

    public void onDeviceConnectStateChange(DeviceConnectState deviceConnectState, String str) {
    }

    public void onReceiveDeviceInfo(LsDeviceInfo lsDeviceInfo) {
    }

    public void onReceiveDeviceMeasureData(BaseDeviceData baseDeviceData) {
    }

    public void onReceiveWifiConfigInfo(String str, int i, String str2) {
    }

    public void onReceiveWifiConnectState(String str, WifiState wifiState) {
    }

    public void onReceiveWifiScanEnd() {
    }

    public void onReceiveWifiScanResult(String str, WifiInfo wifiInfo) {
    }

    public void onWeightScaleInfoUpdate(Object obj, PacketProfile packetProfile, String str) {
    }
}
