package com.heytap.wearable.watch.export;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.wearable.watch.clock.ClockMessageManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/ic/ClockMessageHandler")
public class ClockMessageHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        ClockMessageManager.e().i(str, messageEvent);
    }
}
