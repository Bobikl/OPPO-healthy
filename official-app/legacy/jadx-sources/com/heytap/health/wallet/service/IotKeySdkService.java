package com.heytap.health.wallet.service;

import android.content.Intent;
import android.os.IBinder;
import com.heytap.health.base.base.BaseService;
import com.heytap.health.wallet.service.impl.OperateCardStub;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.j6l;
import com.oplus.aiunit.vision.mr0;

/* JADX INFO: loaded from: classes18.dex */
public class IotKeySdkService extends BaseService {
    public OperateCardStub i;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a7b.f("Wallet_MainActivity", "KeySdkService onBind start");
        if (intent == null) {
            throw new UnsupportedOperationException("intent is null");
        }
        new j6l().a();
        if (!"com.heytap.health.wallet.sdk.nfc.action.OPERATE_CARD_SERVICE".equals(intent.getAction())) {
            a7b.f("Wallet_MainActivity", "KeySdkService onBind end2");
            throw new UnsupportedOperationException("Not yet implemented");
        }
        if (this.i == null) {
            this.i = new OperateCardStub(new mr0(this));
        }
        a7b.f("Wallet_MainActivity", "KeySdkService onBind end1");
        return this.i;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        a7b.f("Wallet_MainActivity", "onDestroy service");
    }
}
