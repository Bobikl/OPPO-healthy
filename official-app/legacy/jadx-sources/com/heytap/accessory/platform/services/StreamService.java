package com.heytap.accessory.platform.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.heytap.accessory.file.utils.a;
import com.heytap.accessory.stream.StreamServiceStub;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes14.dex */
public class StreamService extends Service {
    private static final String ACTION = "com.heytap.accessory.IStreamAction";
    private static final String TAG = "StreamService";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String str = TAG;
        Log.d(str, "StreamService onBind=" + intent);
        if (intent == null || !"com.heytap.accessory.IStreamAction".equals(intent.getAction())) {
            Log.d(str, "StreamService intent is null ");
            return null;
        }
        a.a(getApplicationContext());
        return new StreamServiceStub(getApplicationContext());
    }

    @Override // android.app.Service
    public void onCreate() {
        Log.d(TAG, "StreamService onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        Log.d(TAG, "StreamService onStartCommand");
        if (intent == null) {
            return 1;
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        com.heytap.accessory.base.logging.a.a(TAG, "all clients have unbinded from FTCore");
        stopSelf();
        return super.onUnbind(intent);
    }
}
