package com.heytap.health.watchpair.account;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.receiver.AccountReceiver;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.tk9;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/device_pair/WatchAccountServiceImpl")
public class WatchAccountServiceImpl extends DMIMessageHandler {
    public final void c() {
        a7b.f("WatchAccountServiceImpl", "send broad cast , currentProcess:" + gxe.c());
        Bundle bundle = new Bundle();
        bundle.putBoolean(AccountReceiver.FLAG_FROM_WATCH, true);
        tk9.a(bundle);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(Context context) {
        super.onCreate(context);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onDestroy() {
        super.onDestroy();
        a7b.f("WatchAccountServiceImpl", "onDestroy");
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        super.onMessageReceived(str, messageEvent);
        a7b.f("WatchAccountServiceImpl", "onMessageReceived, serviceId:" + messageEvent.getServiceId() + ", commandId:" + messageEvent.getCommandId());
        if (messageEvent.getCommandId() == 50) {
            a7b.f("WatchAccountServiceImpl", "onMessageReceived, get confirm login request success");
            c();
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onProgressChanged(String str, mc7 mc7Var) {
        super.onProgressChanged(str, mc7Var);
        a7b.f("WatchAccountServiceImpl", "onProgressChanged");
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onTransferCompleted(String str, mc7 mc7Var) {
        super.onTransferCompleted(str, mc7Var);
        a7b.f("WatchAccountServiceImpl", "onTransferCompleted");
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onTransferRequested(String str, mc7 mc7Var) {
        super.onTransferRequested(str, mc7Var);
        a7b.f("WatchAccountServiceImpl", "onTransferRequested");
    }
}
