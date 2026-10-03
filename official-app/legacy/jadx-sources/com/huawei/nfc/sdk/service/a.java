package com.huawei.nfc.sdk.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.oplus.aiunit.vision.f1n;

/* JADX INFO: loaded from: classes4.dex */
public class a implements ServiceConnection {
    public final /* synthetic */ b i;

    public a(b bVar) {
        this.i = bVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f1n.c("HwOpenPayTask", "---onServiceConnected---begin");
        synchronized (this.i.a) {
            this.i.f8568c = ICUPOnlinePayService.Stub.asInterface(iBinder);
            f1n.c("HwOpenPayTask", "---onServiceConnected---");
            this.i.a.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        f1n.c("HwOpenPayTask", "---onServiceDisconnected---begin");
        synchronized (this.i.a) {
            f1n.c("HwOpenPayTask", "---onServiceDisconnected---");
            this.i.f8568c = null;
            this.i.a.notifyAll();
        }
    }
}
