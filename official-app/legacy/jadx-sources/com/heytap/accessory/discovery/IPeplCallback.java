package com.heytap.accessory.discovery;

import com.heytap.accessory.bean.AuthenticateMessage;
import com.heytap.accessory.bean.ConnectMessage;
import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: classes14.dex */
public interface IPeplCallback {
    void onAdvertiseFailure();

    void onAdvertiseStopped();

    void onAdvertiseSuccess();

    void onPairFailure(DeviceInfo deviceInfo, int i);

    void onPairSuccess(DeviceInfo deviceInfo);

    int onRequestAuthenticate(DeviceInfo deviceInfo, AuthenticateMessage authenticateMessage);

    int onRequestConnect(DeviceInfo deviceInfo, ConnectMessage connectMessage);
}
