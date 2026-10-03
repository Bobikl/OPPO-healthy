package com.heytap.health;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* JADX INFO: loaded from: classes15.dex */
public class ColorosAppServicesManagerClient extends Service {
    public IBinder i = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.i;
    }
}
