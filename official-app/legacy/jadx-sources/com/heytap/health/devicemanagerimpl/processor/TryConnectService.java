package com.heytap.health.devicemanagerimpl.processor;

import android.content.Intent;
import android.os.IBinder;
import com.heytap.health.base.base.BaseService;
import com.oplus.aiunit.vision.ml4;

/* JADX INFO: loaded from: classes16.dex */
public class TryConnectService extends BaseService {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ml4.a("TryConnectService", "onBind");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ml4.a("TryConnectService", "onCreate");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ml4.a("TryConnectService", "onDestroy");
    }

    @Override // com.heytap.health.base.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        ml4.a("TryConnectService", "onStartCommand");
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
