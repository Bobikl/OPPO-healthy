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
import com.oplus.aiunit.vision.hum;

/* JADX INFO: loaded from: classes19.dex */
public class DataMessageCallbackService extends Service implements IDataMessageCallBackService {

    public class a implements Runnable {
        public final /* synthetic */ Intent i;

        public a(Intent intent) {
            this.i = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            PushService.j().x(DataMessageCallbackService.this.getApplicationContext());
            glm.a(DataMessageCallbackService.this.getApplicationContext(), this.i, DataMessageCallbackService.this);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        hum.a(new a(intent));
        return 2;
    }

    public void processMessage(Context context, b bVar) {
        cpm.a("Receive DataMessageCallbackService:messageTitle: " + bVar.l() + " ------content:" + bVar.b() + "------describe:" + bVar.d());
    }
}
