package com.heytap.wearable.support.watchface.base;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.gbl;
import com.oplus.aiunit.vision.m25;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WatchFaceService extends Service {
    private String className = getClass().getName();

    public abstract gbl createWatchFaceView(Context context, int i);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m25.a().b(this);
    }
}
