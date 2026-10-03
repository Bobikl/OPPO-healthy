package com.heytap.accessory.discovery;

import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: classes14.dex */
public interface IScanCallback {
    void onCancel();

    void onDeviceFound(DeviceInfo deviceInfo);
}
