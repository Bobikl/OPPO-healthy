package com.oplus.oms.split.full.splitload.d;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes8.dex */
public class c extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        stopSelf();
        return super.onStartCommand(intent, i, i2);
    }
}
