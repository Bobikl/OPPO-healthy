package com.heytap.health.device_app_store.impl;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DeviceAppStoreInitializer extends a8a {
    private static final String TAG = "DeviceAppStoreInitializer";

    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 30;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.a8a
    @SuppressLint({"CheckResult"})
    public void init() {
        gl4.devicePrimary.messageApi.c(267, "/device_app_store/WatchAppMessageReceiveClient");
        a7b.f(TAG, "[init] -->  finish");
    }
}
