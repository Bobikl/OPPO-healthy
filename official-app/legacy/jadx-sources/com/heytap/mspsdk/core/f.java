package com.heytap.mspsdk.core;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.msp.IMspCoreBinder;
import com.heytap.msp.ipc.annotation.IPCModule;
import com.heytap.mspsdk.log.MspLog;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes19.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f7398c;
    public static AtomicBoolean d = new AtomicBoolean(false);
    public volatile IMspCoreBinder a;
    public IBinder.DeathRecipient b;

    public static class a {
        public static final f a = new f(null);
    }

    public /* synthetic */ f(SdkRunTime$1 sdkRunTime$1) {
        this();
    }

    public static f d() {
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        MspLog.iIgnore("SdkRunTime", "binderDied");
        this.a = null;
        d.a();
    }

    public Context b() {
        return f7398c;
    }

    public synchronized IMspCoreBinder c() {
        return this.a;
    }

    public final synchronized IMspCoreBinder e(ArrayList<String> arrayList) {
        try {
            IPCModule iPCModule = (IPCModule) com.heytap.mspsdk.core.a.class.getAnnotation(IPCModule.class);
            if (iPCModule == null) {
                return null;
            }
            b bVarG = b.g(b());
            com.heytap.msp.ipc.client.e eVar = new com.heytap.msp.ipc.client.e(b(), iPCModule, null, new Bundle());
            eVar.h(new com.heytap.mspsdk.proxy.c(bVarG));
            Object objI = eVar.i(0, new Object[0]);
            if (objI instanceof IBinder) {
                MspLog.iIgnore("SdkRunTime", "start connect");
                IMspCoreBinder iMspCoreBinderAsInterface = IMspCoreBinder.Stub.asInterface((IBinder) objI);
                j(iMspCoreBinderAsInterface);
                iMspCoreBinderAsInterface.call("getMspCoreBinder", null, null);
                MspLog.iIgnore("SdkRunTime", "connect success by provider");
                return iMspCoreBinderAsInterface;
            }
        } catch (Exception e2) {
            if (arrayList != null) {
                arrayList.add(e2.getMessage());
            }
            e2.printStackTrace();
            MspLog.w("SdkRunTime", e2);
        }
        return null;
    }

    public void f(Context context) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        f7398c = context;
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(com.heytap.mspsdk.common.a.c());
        } else {
            MspLog.e("SdkRunTime", "context is not Application");
        }
        d.set(true);
    }

    public synchronized boolean g(ArrayList<String> arrayList) {
        if (this.a == null || !this.a.asBinder().pingBinder()) {
            return e(arrayList) != null;
        }
        MspLog.iIgnore("SdkRunTime", "ping OK");
        return true;
    }

    public void i() {
    }

    public synchronized void j(IMspCoreBinder iMspCoreBinder) {
        if (this.a == null) {
            this.a = iMspCoreBinder;
            try {
                this.a.asBinder().linkToDeath(this.b, 0);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setOnDownloadInstallListener(com.heytap.mspsdk.guide.b bVar) {
        if (!d.get()) {
            throw new RuntimeException("MspSdk.init() must be invoked at first!");
        }
    }

    public f() {
        this.a = null;
        this.b = new IBinder.DeathRecipient() { // from class: com.heytap.mspsdk.core.e
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                this.a.h();
            }
        };
    }
}
