package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import s_a.s_d;
import s_a.s_e;
import s_a.s_f;

/* JADX INFO: loaded from: classes11.dex */
public final class l8n implements ServiceConnection {
    public final /* synthetic */ n8n i;

    public l8n(n8n n8nVar) {
        this.i = n8nVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface s_dVar;
        k8n.a("2014");
        n8n n8nVar = this.i;
        int i = s_e.f20846s_a;
        if (iBinder == null) {
            s_dVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.oplus.stdid.IStdID");
            s_dVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s_f)) ? new s_d(iBinder) : (s_f) iInterfaceQueryLocalInterface;
        }
        n8nVar.a = s_dVar;
        try {
            iBinder.linkToDeath(this.i.k, 0);
        } catch (RemoteException e2) {
            k8n.b("1028", e2);
        } catch (Exception e3) {
            k8n.b("1071", e3);
        }
        synchronized (this.i.d) {
            k8n.a("2015");
            this.i.d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k8n.a("2016");
        this.i.a = null;
    }
}
