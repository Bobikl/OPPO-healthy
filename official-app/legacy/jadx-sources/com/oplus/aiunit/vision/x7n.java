package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public final class x7n extends Handler {
    public final /* synthetic */ a8n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7n(a8n a8nVar, Looper looper) {
        super(looper);
        this.a = a8nVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        super.handleMessage(message);
        String string = message.getData().getString("IdType");
        int i = message.what;
        if (i == 1) {
            k8n.a("2017");
            this.a.getClass();
            if (this.a.a == null) {
                Log.e("IDHelper", this.a.b + " 1009");
            } else {
                try {
                    String strI = this.a.i(string);
                    a8n a8nVar = this.a;
                    a8nVar.b(a8nVar.h, string, strI);
                    synchronized (this.a.d) {
                        try {
                            this.a.d.notify();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e2) {
                    k8n.b("1005", e2);
                } catch (Exception e3) {
                    k8n.b("1054", e3);
                }
            }
            k8n.a("2018");
            return;
        }
        if (i == 2) {
            a8n.d(this.a);
            return;
        }
        if (i != 3) {
            return;
        }
        k8n.a("2017");
        if (this.a.a == null) {
            Log.e("IDHelper", this.a.b + " 1009");
        } else {
            try {
                this.a.i(string);
                synchronized (this.a.d) {
                    try {
                        this.a.d.notify();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (RemoteException e4) {
                k8n.b("1055", e4);
            } catch (Exception e5) {
                k8n.b("1056", e5);
            }
        }
        k8n.a("2018");
    }
}
