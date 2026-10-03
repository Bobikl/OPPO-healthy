package com.oplus.wearable.linkservice.transport.connect.ipc.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class IpcBtService extends Service {
    public final IpcBtAdapterImpl i = new IpcBtAdapterImpl();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.i;
    }
}
