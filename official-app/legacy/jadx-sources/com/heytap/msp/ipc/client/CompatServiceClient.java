package com.heytap.msp.ipc.client;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;
import com.heytap.msp.ipc.common.exception.IPCBridgeException;
import com.heytap.msp.ipc.interceptor.ClientMethodInterceptor;
import com.heytap.msp.ipc.server.ServerFilter;
import com.opos.process.bridge.IBridgeInterface;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class CompatServiceClient extends com.heytap.msp.ipc.client.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IBinder f7309l;
    public j m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ServiceListener f7310n;
    public final ServiceListener o;

    public interface ServiceListener {
        void onServiceConnected(ComponentName componentName);

        void onServiceDisconnected(ComponentName componentName);
    }

    public class a implements ServiceListener {
        public a() {
        }

        @Override // com.heytap.msp.ipc.client.CompatServiceClient.ServiceListener
        public void onServiceConnected(ComponentName componentName) {
            h.a("BaseServiceClient", "onServiceConnected:" + componentName);
            if (CompatServiceClient.this.f7310n != null) {
                CompatServiceClient.this.f7310n.onServiceConnected(componentName);
            }
        }

        @Override // com.heytap.msp.ipc.client.CompatServiceClient.ServiceListener
        public void onServiceDisconnected(ComponentName componentName) {
            h.a("BaseServiceClient", "onServiceDisconnected:" + componentName);
            h.a("BaseServiceClient", "reset baseBinder to null");
            CompatServiceClient compatServiceClient = CompatServiceClient.this;
            compatServiceClient.f7309l = null;
            if (compatServiceClient.f7310n != null) {
                CompatServiceClient.this.f7310n.onServiceDisconnected(componentName);
            }
            CompatServiceClient.this.m = null;
        }
    }

    public CompatServiceClient(Context context, IPCModule iPCModule, Parcelable parcelable, Bundle bundle) {
        this(context, g.a(iPCModule), iPCModule.targetComponentClass(), iPCModule.targetModuleClass(), parcelable, bundle);
    }

    @Override // com.heytap.msp.ipc.client.f
    public IPCType b() {
        return IPCType.SERVICE;
    }

    @Override // com.heytap.msp.ipc.client.a
    public /* bridge */ /* synthetic */ Object i(int i, Object[] objArr) throws IPCBridgeException {
        return super.i(i, objArr);
    }

    @Override // com.heytap.msp.ipc.client.a
    public Object j(Context context, String str, Parcelable parcelable, int i, Object... objArr) throws IPCBridgeException {
        h.a("BaseServiceClient", "callForResult method call");
        return super.j(context, str, parcelable, i, objArr);
    }

    @Override // com.heytap.msp.ipc.client.a
    public Bundle k(Context context, String str, Parcelable parcelable, int i, Object... objArr) throws IPCBridgeException {
        h.a("BaseServiceClient", "callRemote");
        if (!c.b(objArr)) {
            return c.f(101006, "Invalid params");
        }
        com.heytap.msp.ipc.interceptor.b bVarA = new com.heytap.msp.ipc.interceptor.b.a().c(context).b(context.getPackageName()).d(this.d).f(str).g(parcelable).e(i).a();
        h.g("BaseServiceClient", "call clientMethodInterceptors");
        for (ClientMethodInterceptor clientMethodInterceptor : this.f7317e) {
            com.heytap.msp.ipc.interceptor.a aVarIntercept = clientMethodInterceptor.intercept(bVarA);
            h.g("BaseServiceClient", "clientMethodInterceptor --- interceptor:" + clientMethodInterceptor.getClass().getName() + ", result:" + aVarIntercept.toString());
            if (aVarIntercept.c()) {
                throw new IPCBridgeException(aVarIntercept.b(), aVarIntercept.a());
            }
        }
        if (this.f7309l == null) {
            if (this.m == null) {
                try {
                    h.a("BaseServiceClient", "try to lock");
                    if (this.f7311j.tryLock() || this.f7311j.tryLock((long) this.k, TimeUnit.MILLISECONDS)) {
                        this.m = g(context);
                        this.f7311j.unlock();
                    } else {
                        h.a("BaseServiceClient", "lock fail");
                    }
                } catch (InterruptedException e2) {
                    h.c("BaseServiceClient", "lock", e2);
                    try {
                        this.f7311j.unlock();
                    } catch (Exception e3) {
                        h.c("BaseServiceClient", "unlock", e3);
                    }
                }
                if (this.m == null) {
                    throw new IPCBridgeException("No target found for all targets", 101001);
                }
                h.a("BaseServiceClient", "getBinder");
            } else {
                h.a("BaseServiceClient", "getBinder use exist package & action");
            }
            q(context, this.m);
        }
        return o(bVarA, objArr);
    }

    @Override // com.heytap.msp.ipc.client.a
    public /* bridge */ /* synthetic */ void m(ServerFilter serverFilter) {
        super.m(serverFilter);
    }

    public final Bundle o(com.heytap.msp.ipc.interceptor.b bVar, Object[] objArr) throws IPCBridgeException {
        IBinder iBinder = this.f7309l;
        if (iBinder == null) {
            h.b("BaseServiceClient", "baseBinder is NULL");
            return c.f(101005, "connect error");
        }
        IBridgeInterface iBridgeInterfaceAsInterface = IBridgeInterface.Stub.asInterface(iBinder);
        Bundle bundleC = c.c(bVar.c(), bVar.d(), bVar.b(), objArr);
        Bundle bundle = this.d;
        if (bundle != null) {
            bundleC.putBundle(BridgeConstant.KEY_EXTRAS, bundle);
        }
        try {
            h.g("BaseServiceClient", "bundle:" + bundleC);
            return iBridgeInterfaceAsInterface.executeSync(bundleC);
        } catch (RemoteException e2) {
            h.c("BaseServiceClient", "executeSync", e2);
            throw new IPCBridgeException(e2, 101007);
        }
    }

    public final void p() {
        b.d().b(this.a, c(this.m.b, d(), this.m.e(), this.d), this.o);
        this.f7310n = null;
        this.f7309l = null;
        this.m = null;
    }

    public final void q(Context context, j jVar) throws IPCBridgeException {
        if (this.f7309l != null) {
            h.a("BaseServiceClient", "get Binder");
            return;
        }
        h.a("BaseServiceClient", "use package:" + jVar);
        this.f7309l = b.d().c(context, c(jVar.b, d(), jVar.d, this.d), this.k, this.o);
    }

    public CompatServiceClient(Context context, List<j> list, String str, String str2, Parcelable parcelable, Bundle bundle) {
        super(list, str, str2, parcelable, bundle);
        this.f7310n = null;
        this.o = new a();
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }
}
