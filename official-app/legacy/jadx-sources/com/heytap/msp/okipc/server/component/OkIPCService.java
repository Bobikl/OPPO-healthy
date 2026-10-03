package com.heytap.msp.okipc.server.component;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.msp.okipc.server.a;
import com.heytap.msp.okipc.server.core.ChannelServer;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public class OkIPCService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a.i().h().k();
        return new ChannelServer();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a.i().h().l();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a.i().h().m();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        a.i().h().n();
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a.i().h().o();
        return super.onUnbind(intent);
    }
}
