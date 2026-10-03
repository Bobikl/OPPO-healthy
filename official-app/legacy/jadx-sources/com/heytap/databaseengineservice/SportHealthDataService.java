package com.heytap.databaseengineservice;

import android.app.Service;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.oplus.aiunit.vision.cj4;
import com.oplus.aiunit.vision.cui;
import com.oplus.aiunit.vision.qa2;

/* JADX INFO: loaded from: classes15.dex */
public class SportHealthDataService extends Service {
    public IBinder i;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        cj4.a("SportDaemonService", "onBind");
        return this.i;
    }

    @Override // android.app.Service
    public void onCreate() {
        try {
            super.onCreate();
            this.i = new OIBinderPool();
        } catch (Exception e2) {
            cj4.b("SportDaemonService", "onCreate e:" + e2.getMessage());
            stopSelf();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            cj4.a("SportDaemonService", "onDestroy()...");
            super.onDestroy();
        } catch (Exception e2) {
            cj4.b("SportDaemonService", "onDestroy e:" + e2.getMessage());
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            cj4.c("SportDaemonService", "onStartCommand()...");
            if (cui.a(this)) {
                qa2.dataProcess.m(this);
                qa2.common.l("SportHealthDataService, onStartCommand");
            }
            super.onStartCommand(intent, i, i2);
            return 2;
        } catch (Exception e2) {
            cj4.b("SportDaemonService", "onStartCommand e:" + e2.getMessage());
            return 2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void unbindService(ServiceConnection serviceConnection) {
        try {
            super.unbindService(serviceConnection);
        } catch (Exception e2) {
            cj4.b("SportDaemonService", "unbindService e:" + e2.getMessage());
        }
    }
}
