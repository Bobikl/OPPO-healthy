package com.autonavi.minimap.wearable;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes13.dex */
public class AMapWearableConnectService extends Service {
    private AMapConnectBinder mBinder;

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        if (this.mBinder == null) {
            this.mBinder = new AMapConnectBinder();
        }
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        AMapWearableConnector.getInstance().onServiceDisconnect();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        this.mBinder = null;
        return super.onUnbind(intent);
    }
}
