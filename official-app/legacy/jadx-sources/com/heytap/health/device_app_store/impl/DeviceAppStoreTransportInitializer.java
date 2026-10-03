package com.heytap.health.device_app_store.impl;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.a8a;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.kb0;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DeviceAppStoreTransportInitializer extends a8a {
    @Override // com.oplus.aiunit.vision.a8a
    public int configPriority() {
        return 80;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        gl4.devicePrimary.messageApi.c(267, "/device_app_store/WatchAppMessageReceiveClient");
        kb0.h().j();
    }
}
