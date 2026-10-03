package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import s_a.s_d;
import s_a.s_e;
import s_a.s_f;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class ycn implements ServiceConnection {
    public final /* synthetic */ edn i;

    public ycn(edn ednVar) {
        this.i = ednVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IInterface s_dVar;
        mdn.a("2014");
        edn ednVar = this.i;
        int i = s_e.s_a;
        if (iBinder == null) {
            s_dVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.oplus.stdid.IStdID");
            s_dVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s_f)) ? new s_d(iBinder) : (s_f) iInterfaceQueryLocalInterface;
        }
        ((cdn) ednVar).a = s_dVar;
        try {
            iBinder.linkToDeath(((cdn) this.i).k, 0);
        } catch (RemoteException e) {
            mdn.b("1076", e);
        } catch (Exception e2) {
            mdn.b("1077", e2);
        }
        synchronized (((cdn) this.i).d) {
            mdn.a("2015");
            ((cdn) this.i).d.notify();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        mdn.a("2016");
        ((cdn) this.i).a = null;
    }
}
