package com.heytap.health.watch.commonsync.export;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.commonsync.messagemanager.TransportSyncMessageManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/commonsync/basicSync")
public class TransportCommonSyncHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public long getKeepAlive() {
        return 0L;
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        TransportSyncMessageManager.INSTANCE.d(str, messageEvent);
    }
}
