package com.lifesense.device.scale.application.interfaces;

import com.lifesense.device.scale.application.interfaces.callback.BleReceiveCallback;

/* JADX INFO: loaded from: classes4.dex */
public interface ILZDeviceSyncService {
    void registerDataReceiveCallBack(BleReceiveCallback bleReceiveCallback);

    void resetScanCount();

    void restartDataReceive();

    void setAutoLogin(boolean z);

    void startDataReceive();

    boolean stopDataReceive();
}
