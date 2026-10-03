package com.heytap.wearable.watch.game;

import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.heytap.health.base.base.BaseService;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceSdkService extends BaseService {
    public DeviceGameImpl i;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        synchronized (DeviceSdkService.class) {
            if (this.i == null) {
                this.i = new DeviceGameImpl();
            }
        }
        return this.i;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a7b.f("GameHealth.DSS", "onCreate()...");
        this.i = new DeviceGameImpl();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a7b.f("GameHealth.DSS", "onDestroy()...");
        DeviceGameImpl deviceGameImpl = this.i;
        if (deviceGameImpl != null) {
            deviceGameImpl.onDestroy();
        }
        super.onDestroy();
    }

    @Override // com.heytap.health.base.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        a7b.f("GameHealth.DSS", "onStartCommand()...");
        return 2;
    }
}
