package com.heytap.wearable.watch.export;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.xg3;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/ic/ClockSyncHandler")
public class ClockSyncHandler extends DMIMessageHandler {
    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(ra5 ra5Var, String str, MessageEvent messageEvent) throws Throwable {
        xg3.d().f(str, messageEvent);
    }
}
