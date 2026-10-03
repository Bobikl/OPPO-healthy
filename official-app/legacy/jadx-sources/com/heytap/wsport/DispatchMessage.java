package com.heytap.wsport;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.hji;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.sfd;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/device_data_sync/MessageDispatch")
public class DispatchMessage extends DMIMessageHandler {
    public static final boolean i;

    static {
        boolean zL = gxe.l(b78.a());
        i = zL;
        if (zL) {
            sfd.c();
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public long getKeepAlive() {
        return super.getKeepAlive();
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler, com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        super.init(context);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(Context context) {
        super.onCreate(context);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        super.onMessageReceived(str, messageEvent);
        if (i) {
            sfd.b().a(messageEvent);
        } else {
            hji.c().a(messageEvent);
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onProgressChanged(String str, mc7 mc7Var) {
        super.onProgressChanged(str, mc7Var);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onTransferCompleted(String str, mc7 mc7Var) {
        super.onTransferCompleted(str, mc7Var);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onTransferRequested(String str, mc7 mc7Var) {
        super.onTransferRequested(str, mc7Var);
    }
}
