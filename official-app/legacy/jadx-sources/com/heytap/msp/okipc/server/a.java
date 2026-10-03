package com.heytap.msp.okipc.server;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.heytap.msp.okipc.IErrorHandler;
import com.heytap.msp.okipc.aidl.IChannelCallback;
import com.heytap.msp.okipc.d;
import com.heytap.msp.okipc.exception.IPCServerRejectedException;
import com.heytap.msp.okipc.exception.IPCServerRouteException;
import com.heytap.msp.okipc.server.routing.Route;
import com.heytap.msp.okipc.server.routing.e;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public Context a;
    public Route b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IErrorHandler f7341c;
    public Executor d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.heytap.msp.okipc.server.c f7342e;
    public volatile boolean f;

    /* JADX INFO: renamed from: com.heytap.msp.okipc.server.a$a, reason: collision with other inner class name */
    public class C0720a implements IErrorHandler {
        public C0720a() {
        }

        @Override // com.heytap.msp.okipc.IErrorHandler
        public void handleError(Throwable th) {
            Log.e("IPC_LOG_SER", "respond", th);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Bundle f7343j;

        public b(int i, Bundle bundle) {
            this.i = i;
            this.f7343j = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.heytap.msp.okipc.server.b bVarJ = null;
            try {
                a aVar = a.this;
                bVarJ = aVar.j(this.i, this.f7343j, aVar.f7342e);
                a.this.f(bVarJ);
            } catch (IPCServerRejectedException e2) {
                a.this.f7342e.c(bVarJ, e2);
                if (bVarJ != null) {
                    bVarJ.d(e2);
                }
                if (a.this.f7341c != null) {
                    a.this.f7341c.handleError(e2);
                }
            } catch (Throwable th) {
                a.this.f7342e.c(bVarJ, th);
                if (a.this.f7341c != null) {
                    a.this.f7341c.handleError(th);
                }
            }
        }
    }

    public static class c {

        @SuppressLint({"StaticFieldLeak"})
        public static final a a = new a(null);
    }

    public /* synthetic */ a(C0720a c0720a) {
        this();
    }

    public static void e(Bundle bundle) {
        a aVarI = i();
        if (aVarI.f) {
            aVarI.d(bundle);
        } else {
            Log.e("IPC_LOG_SER", "IPCServer not initialized. Call IPCServer.getInstance().start() first.");
        }
    }

    public static a i() {
        return c.a;
    }

    public void d(Bundle bundle) {
        int callingUid = Binder.getCallingUid();
        this.f7342e.e(callingUid);
        this.d.execute(new b(callingUid, bundle));
    }

    public void f(com.heytap.msp.okipc.server.b bVar) {
        this.f7342e.b(bVar);
        try {
            if (this.b != null) {
                this.f7342e.h(bVar, bVar.request().a);
                new e(this.b, bVar).a();
                this.f7342e.a(bVar);
            } else {
                IPCServerRouteException iPCServerRouteException = new IPCServerRouteException("no route registered for path " + bVar.request().a);
                this.f7342e.c(bVar, iPCServerRouteException);
                bVar.d(iPCServerRouteException);
            }
        } catch (Throwable th) {
            this.f7342e.c(bVar, th);
            throw th;
        }
    }

    public IErrorHandler g() {
        return this.f7341c;
    }

    public com.heytap.msp.okipc.server.c h() {
        return this.f7342e;
    }

    public final com.heytap.msp.okipc.server.b j(int i, Bundle bundle, com.heytap.msp.okipc.server.c cVar) {
        try {
            com.heytap.msp.okipc.server.b bVarE = com.heytap.msp.okipc.server.b.e(d.c(bundle.getBundle("ipc_request")), IChannelCallback.Stub.asInterface(bundle.getBinder("ipc_callback")), cVar);
            String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
            String strE = bVarE.request().e();
            boolean z = false;
            if (packagesForUid != null) {
                for (String str : packagesForUid) {
                    if (str.equals(strE)) {
                        z = true;
                        break;
                    }
                }
            }
            if (packagesForUid != null && z) {
                cVar.d(bVarE);
                return bVarE;
            }
            throw new RuntimeException("Invalid calling package: " + strE + " for uid " + i);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public a k(com.heytap.msp.okipc.server.c cVar) {
        if (cVar == null) {
            cVar = com.heytap.msp.okipc.server.c.NONE;
        }
        this.f7342e = cVar;
        return this;
    }

    public a l(Context context, Route route, Executor executor) {
        return m(context, route, executor, null);
    }

    public synchronized a m(Context context, Route route, Executor executor, IErrorHandler iErrorHandler) {
        if (this.f) {
            Log.w("IPC_LOG_SER", "IPCServer already started, ignoring start call");
            return this;
        }
        this.f7342e.j();
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
            if (!(context instanceof Application)) {
                context = null;
            }
        }
        if (context == null) {
            throw new RuntimeException("context is not application or applicationContext is null");
        }
        this.a = context;
        this.b = route;
        if (executor == null) {
            throw new IllegalArgumentException("executor must not be null");
        }
        this.d = executor;
        this.f7341c = iErrorHandler;
        this.f = true;
        this.f7342e.i();
        if (this.f7341c == null) {
            this.f7341c = new C0720a();
        }
        return this;
    }

    public a() {
        this.f7342e = com.heytap.msp.okipc.server.c.NONE;
        this.f = false;
    }
}
