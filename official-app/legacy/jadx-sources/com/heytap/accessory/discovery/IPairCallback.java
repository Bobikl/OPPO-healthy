package com.heytap.accessory.discovery;

import android.os.Bundle;
import com.heytap.accessory.bean.DeviceInfo;

/* JADX INFO: loaded from: classes14.dex */
public interface IPairCallback {
    byte[] onPairData(DeviceInfo deviceInfo, Bundle bundle);

    void onPairFailure(DeviceInfo deviceInfo, Bundle bundle);

    void onPairSuccess(DeviceInfo deviceInfo, Bundle bundle);
}
