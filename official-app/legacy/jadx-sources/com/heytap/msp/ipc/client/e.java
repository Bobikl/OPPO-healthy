package com.heytap.msp.ipc.client;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;
import com.heytap.msp.ipc.common.exception.IPCBridgeException;
import com.heytap.msp.ipc.interceptor.ClientMethodInterceptor;
import com.heytap.msp.ipc.server.ServerFilter;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class e extends a {
    public e(Context context, IPCModule iPCModule, Parcelable parcelable, Bundle bundle) {
        this(context, g.a(iPCModule), iPCModule.targetComponentClass(), iPCModule.targetModuleClass(), parcelable, bundle);
    }

    @Override // com.heytap.msp.ipc.client.f
    public IPCType b() {
        return IPCType.PROVIDER;
    }

    @Override // com.heytap.msp.ipc.client.a
    public /* bridge */ /* synthetic */ Object i(int i, Object[] objArr) throws IPCBridgeException {
        return super.i(i, objArr);
    }

    @Override // com.heytap.msp.ipc.client.a
    public Object j(Context context, String str, Parcelable parcelable, int i, Object... objArr) throws IPCBridgeException {
        h.a("BaseProviderClient", "callForResult method call");
        return super.j(context, str, parcelable, i, objArr);
    }

    @Override // com.heytap.msp.ipc.client.a
    public Bundle k(Context context, String str, Parcelable parcelable, int i, Object... objArr) throws IPCBridgeException {
        h.a("BaseProviderClient", "callRemote");
        if (!c.b(objArr)) {
            return c.f(101006, "Invalid params");
        }
        com.heytap.msp.ipc.interceptor.b bVarA = new com.heytap.msp.ipc.interceptor.b.a().c(context).b(context.getPackageName()).d(this.d).f(str).g(parcelable).e(i).a();
        h.g("BaseProviderClient", "call clientMethodInterceptors");
        for (ClientMethodInterceptor clientMethodInterceptor : this.f7317e) {
            com.heytap.msp.ipc.interceptor.a aVarIntercept = clientMethodInterceptor.intercept(bVarA);
            h.g("BaseProviderClient", "clientMethodInterceptor --- interceptor:" + clientMethodInterceptor.getClass().getName() + ", result:" + aVarIntercept.toString());
            if (aVarIntercept.c()) {
                throw new IPCBridgeException(aVarIntercept.b(), aVarIntercept.a());
            }
        }
        j jVarG = null;
        try {
            if (this.f7311j.tryLock() || this.f7311j.tryLock((long) this.k, TimeUnit.MILLISECONDS)) {
                jVarG = g(context);
                this.f7311j.unlock();
            } else {
                h.a("BaseProviderClient", "lock fail");
            }
        } catch (InterruptedException e2) {
            h.c("BaseProviderClient", "lock", e2);
            try {
                this.f7311j.unlock();
            } catch (Exception e3) {
                h.c("BaseProviderClient", "unlock", e3);
            }
        }
        if (jVarG != null) {
            return n(bVarA, jVarG, objArr);
        }
        throw new IPCBridgeException("No target found for all authority", 101001);
    }

    @Override // com.heytap.msp.ipc.client.a
    public /* bridge */ /* synthetic */ void m(ServerFilter serverFilter) {
        super.m(serverFilter);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[EXC_TOP_SPLITTER, PHI: r0 r5
  0x0087: PHI (r0v10 ??) = (r0v9 ??), (r0v12 ??) binds: [B:20:0x0098, B:10:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r5v9 android.os.Bundle) = (r5v8 android.os.Bundle), (r5v13 android.os.Bundle) binds: [B:20:0x0098, B:10:0x0085] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Bundle n(com.heytap.msp.ipc.interceptor.b bVar, j jVar, Object[] objArr) throws Throwable {
        Throwable th;
        h.a("BaseProviderClient", "multi process --- call remote");
        Bundle bundleC = c.c(bVar.c(), bVar.d(), bVar.b(), objArr);
        Bundle bundle = this.d;
        if (bundle != null) {
            bundleC.putBundle(BridgeConstant.KEY_EXTRAS, bundle);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("auth:");
        sb.append(jVar.f7318c);
        ?? AcquireUnstableContentProviderClient = ",bundle:";
        sb.append(",bundle:");
        sb.append(bundleC);
        h.a("BaseProviderClient", sb.toString());
        Bundle bundleCall = null;
        try {
            try {
                Context contextA = bVar.a();
                AcquireUnstableContentProviderClient = contextA.getContentResolver().acquireUnstableContentProviderClient(jVar.f7318c);
                try {
                    if (AcquireUnstableContentProviderClient == 0) {
                        bundleCall = c.f(101010, "acquireUnstableContentProviderClient error");
                    } else {
                        h.d("COMPONENT", "provider call, src = " + contextA.getPackageName() + " dst = auth:" + jVar.f7318c);
                        bundleCall = AcquireUnstableContentProviderClient.call(BridgeConstant.PROVIDER_DISPATCH_METHOD, "", bundleC);
                    }
                    if (AcquireUnstableContentProviderClient != 0) {
                        try {
                            AcquireUnstableContentProviderClient.release();
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    h.c("BaseProviderClient", "resolve error", e);
                    if (AcquireUnstableContentProviderClient != 0) {
                        AcquireUnstableContentProviderClient.release();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (AcquireUnstableContentProviderClient != 0) {
                    try {
                        AcquireUnstableContentProviderClient.release();
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            AcquireUnstableContentProviderClient = 0;
        } catch (Throwable th3) {
            AcquireUnstableContentProviderClient = 0;
            th = th3;
            if (AcquireUnstableContentProviderClient != 0) {
                AcquireUnstableContentProviderClient.release();
            }
            throw th;
        }
        return bundleCall;
    }

    public e(Context context, List<j> list, String str, String str2, Parcelable parcelable, Bundle bundle) {
        super(list, str, str2, parcelable, bundle);
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }
}
