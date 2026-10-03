package com.heytap.accessory.discovery;

import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IScanCallback {
    void onCancel();

    void onDeviceFound(DeviceInfo deviceInfo);
}
