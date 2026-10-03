package com.heytap.accessory.discovery;

import com.heytap.accessory.bean.DeviceInfo;
import com.heytap.accessory.bean.Message;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IDirectCallback {
    void onPairFailure(DeviceInfo deviceInfo, Message message);

    void onPairSuccess(DeviceInfo deviceInfo, Message message);
}
