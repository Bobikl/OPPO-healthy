package com.lifesense.android.bluetooth.core.protocol.parser;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public void onInitRequestDataPackage(String str, com.lifesense.android.bluetooth.core.protocol.frame.a aVar) {
    }

    public void onLoginRequestDataPackage(String str, com.lifesense.android.bluetooth.core.protocol.frame.a aVar) {
    }

    public abstract void onMeasuredDataDataPackage(String str, com.lifesense.android.bluetooth.core.protocol.frame.a aVar);

    public void onReceiveAckDataPackage(String str, com.lifesense.android.bluetooth.core.protocol.frame.a aVar) {
    }

    public void onReceiveSettingDataPackage(String str, com.lifesense.android.bluetooth.core.protocol.frame.a aVar) {
    }

    public void onReceiveUserInfoDataPackage(String str, com.lifesense.android.bluetooth.core.protocol.frame.a aVar) {
    }

    public void onReceiveWifiConfigInfo(int i, String str) {
    }

    public void onReceiveWifiConnectStatePackage(int i) {
    }

    public void onReceiveWifiScanEndPackage() {
    }

    public void onReceiveWifiScanPackage(String str, byte[] bArr, int i, int i2, int i3) {
    }

    public void onUntreatedDataPackage(String str, Collection<com.lifesense.android.bluetooth.core.protocol.frame.a> collection) {
    }
}
