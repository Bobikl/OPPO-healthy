package com.oplus.aiunit.vision;

import com.heytap.health.protocol.dm.DMProto$WiFiInfo;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
public class fwl {
    public static void a() {
        a7b.f("WifiConfigPresenter", "requestEncryptKey");
        gl4.devicePrimary.messageApi.b(new MessageEvent(1, 116, null));
    }

    public static void b(DMProto$WiFiInfo.Builder builder) {
        gl4.devicePrimary.messageApi.b(new MessageEvent(1, 117, builder.build().toByteArray()));
    }
}
