package com.heytap.health.watch.wifi;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.watch.wifi.WifiConfigHandler;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.i37;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/wifi/config")
public class WifiConfigHandler extends DMIMessageHandler {
    public static /* synthetic */ void h1(MessageEvent messageEvent, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("WifiConfigHandler onMessageReceived messageEvent = [");
        sb.append(messageEvent);
        sb.append("]");
        if (i37.c(str)) {
            a7b.f("WifiConfigHandler", "[onMessageReceived]--> family device, return");
        } else {
            WifiSyncOnceApi.j(messageEvent);
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(final String str, final MessageEvent messageEvent) {
        ThreadUtils.doInBackground("wifi_sync", new Runnable() { // from class: com.oplus.aiunit.vision.bwl
            @Override // java.lang.Runnable
            public final void run() {
                WifiConfigHandler.h1(messageEvent, str);
            }
        });
    }
}
