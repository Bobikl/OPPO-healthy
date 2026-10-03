package com.heytap.msp.okipc;

import android.os.Bundle;
import android.os.RemoteException;
import com.heytap.msp.okipc.aidl.IChannelCallback;

/* JADX INFO: loaded from: classes19.dex */
public abstract class c implements IPCRawCall {
    public d a;
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IChannelCallback f7324c;

    public void a() {
        d(new RemoteException("binderDied"));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBundle("ipc_request", this.a.a());
        bundle.putBinder("ipc_callback", this.f7324c.asBinder());
        return bundle;
    }

    public void c(e eVar) {
        try {
            this.f7324c.callback(eVar.i());
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void d(Throwable th) {
    }

    @Override // com.heytap.msp.okipc.IPCRawCall
    public d request() {
        return this.a;
    }
}
