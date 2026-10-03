package com.heytap.msp.okipc.client;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.msp.okipc.IErrorHandler;
import com.heytap.msp.okipc.aidl.IChannel;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public volatile IChannel a;
    public Intent b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ServiceConnection f7327c;

    /* JADX INFO: renamed from: com.heytap.msp.okipc.client.a$a, reason: collision with other inner class name */
    public class C0718a implements IBinder.DeathRecipient {
        public final /* synthetic */ IChannel a;

        public C0718a(IChannel iChannel) {
            this.a = iChannel;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            synchronized (a.class) {
                if (a.this.a == this.a) {
                    a.this.f();
                }
            }
        }
    }

    public static class b {
        public static final a a = new a(null);
    }

    public /* synthetic */ a(C0718a c0718a) {
        this();
    }

    public static a e() {
        return b.a;
    }

    public synchronized IChannel b(Intent intent, ServiceConnection serviceConnection, IBinder iBinder) {
        IChannel iChannelAsInterface;
        iChannelAsInterface = IChannel.Stub.asInterface(iBinder);
        try {
            iChannelAsInterface.asBinder().linkToDeath(new C0718a(iChannelAsInterface), 0);
            this.a = iChannelAsInterface;
            this.f7327c = serviceConnection;
            this.b = intent;
        } catch (RemoteException e2) {
            IErrorHandler iErrorHandlerI = c.i();
            if (iErrorHandlerI == null) {
                return null;
            }
            iErrorHandlerI.handleError(e2);
            return null;
        }
        return iChannelAsInterface;
    }

    public IChannel c(IBinder iBinder) {
        return b(null, null, iBinder);
    }

    public synchronized IChannel d() {
        return this.a;
    }

    public synchronized void f() {
        this.a = null;
        this.f7327c = null;
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0014  */
    public synchronized int g(Context context) {
        int i;
        if (context != null) {
            ServiceConnection serviceConnection = this.f7327c;
            if (serviceConnection == null || this.b == null) {
                i = 2;
            } else {
                try {
                    context.unbindService(serviceConnection);
                    i = 0;
                } catch (Exception unused) {
                    i = 1;
                }
            }
            f();
        } else {
            i = 2;
            f();
        }
        throw th;
        return i;
    }

    public a() {
    }
}
