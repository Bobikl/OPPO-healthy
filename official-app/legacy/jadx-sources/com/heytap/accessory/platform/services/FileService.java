package com.heytap.accessory.platform.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.heytap.accessory.file.FileServiceNative;
import com.heytap.accessory.file.utils.a;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes14.dex */
public class FileService extends Service {
    private static final String ACTION = "com.heytap.accessory.IAfFtManager";
    private static final String TAG = "FileService";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String str = TAG;
        Log.d(str, "FileService onBind=" + intent);
        if (intent == null || !"com.heytap.accessory.IAfFtManager".equals(intent.getAction())) {
            Log.d(str, "FileService intent is null ");
            return null;
        }
        a.a(getApplicationContext());
        return new FileServiceNative(getApplicationContext());
    }

    @Override // android.app.Service
    public void onCreate() {
        Log.d(TAG, "FileService onCreate");
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        Log.d(TAG, "FileService onStartCommand");
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
