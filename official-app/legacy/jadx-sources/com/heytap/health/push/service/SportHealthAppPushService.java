package com.heytap.health.push.service;

import android.content.Context;
import com.heytap.msp.push.mode.b;
import com.heytap.msp.push.service.DataMessageCallbackService;
import com.oplus.aiunit.vision.us8;

/* JADX INFO: loaded from: classes17.dex */
public class SportHealthAppPushService extends DataMessageCallbackService {
    public us8 i;

    @Override // com.heytap.msp.push.service.DataMessageCallbackService, com.heytap.msp.push.callback.IDataMessageCallBackService
    public void processMessage(Context context, b bVar) {
        super.processMessage(context, bVar);
        if (this.i == null) {
            this.i = new us8();
        }
        this.i.c(context, bVar);
    }
}
