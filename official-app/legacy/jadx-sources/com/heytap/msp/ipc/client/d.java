package com.heytap.msp.ipc.client;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.msp.ipc.annotation.IPCType;
import com.heytap.msp.ipc.common.exception.IPCBridgeException;
import com.heytap.msp.ipc.interceptor.ClientMethodInterceptor;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes19.dex */
public class d extends f {
    public final ReentrantLock g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f7315j;

    public d(Context context, IPCModule iPCModule, Bundle bundle) {
        this(context, g.a(iPCModule), iPCModule.targetComponentClass(), bundle);
    }

    @Override // com.heytap.msp.ipc.client.f
    public IPCType b() {
        return IPCType.ACTIVITY;
    }

    @Override // com.heytap.msp.ipc.client.f
    public String d() {
        return this.f7315j;
    }

    public void i(int i, Object... objArr) throws IPCBridgeException {
        Object[] objArr2;
        Activity activity = null;
        Object[] objArr3 = null;
        if (objArr == null || objArr.length <= 0) {
            objArr2 = null;
        } else {
            Object obj = objArr[0];
            Activity activity2 = obj instanceof Activity ? (Activity) obj : null;
            if (objArr.length > 1) {
                objArr3 = new Object[objArr.length - 1];
                System.arraycopy(objArr, 1, objArr3, 0, objArr.length - 1);
            }
            objArr2 = objArr3;
            activity = activity2;
        }
        j(activity, d(), i, objArr2);
    }

    public void j(Activity activity, String str, int i, Object... objArr) throws IPCBridgeException {
        j jVar;
        j jVarG;
        h.a("BaseActivityClient", "call --- activity:" + activity.getClass().getName() + ", targetClass:" + str + ", methodId:" + i);
        if (!c.b(objArr)) {
            throw new IPCBridgeException("Invalid params", 101006);
        }
        com.heytap.msp.ipc.interceptor.b bVarA = new com.heytap.msp.ipc.interceptor.b.a().c(activity).b(activity.getPackageName()).d(this.d).f(str).e(i).a();
        h.g("BaseActivityClient", "call clientMethodInterceptors");
        for (ClientMethodInterceptor clientMethodInterceptor : this.f7317e) {
            com.heytap.msp.ipc.interceptor.a aVarIntercept = clientMethodInterceptor.intercept(bVarA);
            h.g("BaseActivityClient", "clientMethodInterceptor --- interceptor:" + clientMethodInterceptor.getClass().getName() + ", result:" + aVarIntercept.toString());
            if (aVarIntercept.c()) {
                throw new IPCBridgeException(aVarIntercept.b(), aVarIntercept.a());
            }
        }
        try {
            if (this.g.tryLock() || this.g.tryLock((long) this.h, TimeUnit.MILLISECONDS)) {
                jVarG = g(activity);
                try {
                    this.g.unlock();
                } catch (InterruptedException e2) {
                    jVar = jVarG;
                    e = e2;
                    h.c("BaseActivityClient", "lock", e);
                    try {
                        this.g.unlock();
                    } catch (Exception e3) {
                        h.c("BaseActivityClient", "unlock", e3);
                    }
                    jVarG = jVar;
                }
            } else {
                h.a("BaseActivityClient", "lock fail");
                jVarG = null;
            }
        } catch (InterruptedException e4) {
            e = e4;
            jVar = null;
        }
        if (jVarG == null) {
            throw new IPCBridgeException("No target found", 101001);
        }
        h.a("BaseActivityClient", "use package:" + jVarG);
        Bundle bundleC = c.c(str, null, i, objArr);
        Bundle bundle = this.d;
        if (bundle != null) {
            bundleC.putBundle(BridgeConstant.KEY_EXTRAS, bundle);
        }
        h.d("COMPONENT", "activity start src = " + activity.getPackageName() + " , dst = " + jVarG.b + ", cmp = " + d() + ", act = " + jVarG.d);
        activity.startActivityForResult(a(jVarG.b, d(), jVarG.d, bundleC), this.i);
    }

    public d(Context context, List<j> list, String str, Bundle bundle) {
        super(list);
        this.g = new ReentrantLock(true);
        this.h = 5000;
        this.i = 65244;
        this.a = context;
        this.d = bundle;
        this.f7315j = str;
    }
}
