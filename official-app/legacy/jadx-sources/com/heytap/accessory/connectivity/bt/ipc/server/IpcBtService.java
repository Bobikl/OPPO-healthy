package com.heytap.accessory.connectivity.bt.ipc.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes14.dex */
public class IpcBtService extends Service {
    public IpcBtAdapterImpl a = new IpcBtAdapterImpl();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
