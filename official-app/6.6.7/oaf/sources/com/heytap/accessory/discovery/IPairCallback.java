package com.heytap.accessory.discovery;

import android.os.Bundle;
import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface IPairCallback {
    byte[] onPairData(DeviceInfo deviceInfo, Bundle bundle);

    void onPairFailure(DeviceInfo deviceInfo, Bundle bundle);

    void onPairSuccess(DeviceInfo deviceInfo, Bundle bundle);
}
