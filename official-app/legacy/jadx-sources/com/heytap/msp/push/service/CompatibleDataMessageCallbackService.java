package com.heytap.msp.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.b;
import com.oplus.aiunit.vision.cpm;
import com.oplus.aiunit.vision.glm;

/* JADX INFO: loaded from: classes19.dex */
public class CompatibleDataMessageCallbackService extends Service implements IDataMessageCallBackService {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        PushService.j().x(getApplicationContext());
        glm.a(getApplicationContext(), intent, this);
        return 2;
    }

    public void processMessage(Context context, b bVar) {
        cpm.a("Receive CompatibleDataMessageCallbackService:messageTitle: " + bVar.l() + " ------content:" + bVar.b() + "------describe:" + bVar.d());
    }
}
