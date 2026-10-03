package com.heytap.health.devicemanager.api;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.ald;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes16.dex */
public interface DeviceConnectionApi extends IProvider {
    public static final String SERVICE_DEVICECONNECTIONAPI = "/devicepair/DeviceConnectionApi";

    void Ga(ald aldVar);

    boolean a(MessageEvent messageEvent);

    void c6(ald aldVar);
}
