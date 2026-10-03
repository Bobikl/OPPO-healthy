package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.heytap.health.annotation.ProcessName;
import com.oplus.health.apiprovider.IServiceCallback;
import com.oplus.health.apiprovider.IServiceManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class o2f {
    public static final String SM_NAME = "ISM";
    public final Context a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IServiceCallback f14747c;
    public final HashMap<ProcessName, e2f<IServiceManager>> d = new HashMap<>();

    public o2f(Context context, String str, IServiceCallback iServiceCallback) {
        this.a = context;
        this.b = str;
        this.f14747c = iServiceCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IServiceManager h(ProcessName processName) {
        return new xw9(this.a, this.b, processName).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(IServiceManager iServiceManager) {
        try {
            a7b.f("ProviderHelper", "ClientManager: addCallback.");
            iServiceManager.addCallback(this.a.getPackageName(), gxe.c(), this.f14747c);
        } catch (RemoteException unused) {
            a7b.b("ProviderHelper", "ClientManager: addCallback failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ProcessName processName) {
        IServiceCallback iServiceCallback = this.f14747c;
        if (iServiceCallback != null) {
            try {
                iServiceCallback.onRemoteDied(processName.mPName);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    @SuppressLint({"HealthLint_ExceptionPrintDetector"})
    public final e2f<IServiceManager> d(final ProcessName processName) {
        return new e2f<>("CM", new e2f.d() { // from class: com.oplus.aiunit.vision.n2f
        }, new e2f.c() { // from class: com.oplus.aiunit.vision.k2f
            @Override // com.oplus.aiunit.vision.e2f.c
            public final Object getInterface() {
                return this.a.h(processName);
            }
        }, new e2f.e() { // from class: com.oplus.aiunit.vision.l2f
            @Override // com.oplus.aiunit.vision.e2f.e
            public final void a(IInterface iInterface) {
                this.a.i((IServiceManager) iInterface);
            }
        }, new e2f.b() { // from class: com.oplus.aiunit.vision.m2f
            @Override // com.oplus.aiunit.vision.e2f.b
            public final void a() {
                this.a.j(processName);
            }
        });
    }

    public IServiceManager e(ProcessName processName, boolean z) {
        return f(processName, z, true);
    }

    public IServiceManager f(ProcessName processName, boolean z, boolean z2) {
        return (IServiceManager) g(processName, z2).h(this.a, z, this.b + processName.mPName);
    }

    public synchronized e2f<IServiceManager> g(ProcessName processName, boolean z) {
        e2f<IServiceManager> e2fVarD;
        e2fVarD = this.d.get(processName);
        if (!z || e2fVarD == null) {
            e2fVarD = d(processName);
            this.d.put(processName, e2fVarD);
        }
        return e2fVarD;
    }
}
