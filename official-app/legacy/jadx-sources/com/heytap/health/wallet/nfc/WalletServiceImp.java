package com.heytap.health.wallet.nfc;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.ydc;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/device_wallet/WalletServiceImp")
public class WalletServiceImp extends DMIMessageHandler {
    public static final String TAG = "WalletServiceImp";

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onCreate(Context context) {
        ydc.n().r(context);
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(String str, MessageEvent messageEvent) {
        int serviceId = messageEvent.getServiceId();
        int commandId = messageEvent.getCommandId();
        t6b.d(TAG, "messageEvent    " + commandId);
        if (serviceId == 12) {
            ydc.n().q(commandId, messageEvent);
        }
    }
}
