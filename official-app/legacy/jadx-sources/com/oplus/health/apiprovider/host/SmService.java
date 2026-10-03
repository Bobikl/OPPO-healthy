package com.oplus.health.apiprovider.host;

import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.heytap.health.annotation.ProcessName;
import com.heytap.health.base.base.BaseService;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SmService extends BaseService {
    public final ProcessName i;

    public SmService(ProcessName processName) {
        this.i = processName;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return ServiceManager.getInstance(getApplicationContext(), this.i);
    }
}
