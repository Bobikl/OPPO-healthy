package com.heytap.health.esim.mgr;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/esim/messageHandler")
public class EsimSubHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        EsimSubManager.INSTANCE.d(messageEvent);
    }
}
