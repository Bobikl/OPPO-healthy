package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import s_a.s_a;
import s_a.s_b;
import s_a.s_c;

/* JADX INFO: loaded from: classes11.dex */
public final class b8n implements ServiceConnection {
    public final /* synthetic */ f8n i;

    public b8n(f8n f8nVar) {
        this.i = f8nVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface s_aVar;
        k8n.a("2014");
        f8n f8nVar = this.i;
        if (iBinder == null) {
            String str = s_b.f20844s_a;
            s_aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(s_b.f20844s_a);
            s_aVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s_c)) ? new s_a(iBinder) : (s_c) iInterfaceQueryLocalInterface;
        }
        f8nVar.a = s_aVar;
        try {
            iBinder.linkToDeath(this.i.k, 0);
        } catch (RemoteException e2) {
            k8n.b("1028", e2);
        } catch (Exception e3) {
            k8n.b("1067", e3);
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
