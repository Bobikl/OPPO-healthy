package com.oplus.aiunit.vision;

import com.heytap.epona.Request;
import com.heytap.epona.Response;
import com.heytap.epona.interceptor.CallIPCComponentInterceptor;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes15.dex */
public class ccf {
    public final tyf a;
    public final Request b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f10030c = new AtomicBoolean(false);

    public class b implements Runnable {
        public final vr2 i;

        public b(vr2 vr2Var) {
            this.i = vr2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            boolean z = 0;
            z = 0;
            z = 0;
            try {
                try {
                    ccf.this.f(this.i, true);
                    tyf tyfVar = ccf.this.a;
                    tyfVar.f(this, true);
                    z = tyfVar;
                } catch (Exception e2) {
                    s7b.c("RealCall", "AsyncCall run failed and exception is %s", e2.toString());
                    this.i.onReceive(Response.defaultErrorResponse());
                    ccf.this.a.f(this, false);
                }
            } catch (Throwable th) {
                ccf.this.a.f(this, z);
                throw th;
            }
        }
    }

    public static class c implements vr2 {
        public Response a;

        public c() {
            this.a = null;
        }

        public Response a() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.vr2
        public void onReceive(Response response) {
            this.a = response;
        }
    }

    public ccf(tyf tyfVar, Request request) {
        this.a = tyfVar;
        this.b = request;
    }

    public static ccf e(tyf tyfVar, Request request) {
        return new ccf(tyfVar, request);
    }

    public void c(vr2 vr2Var) {
        b bVar = new b(vr2Var);
        if (this.f10030c.getAndSet(true)) {
            s7b.f("RealCall", "asyncExecute has been executed", new Object[0]);
            vr2Var.onReceive(Response.defaultErrorResponse());
        }
        this.a.b(bVar);
    }

    public Response d() {
        if (this.f10030c.getAndSet(true)) {
            s7b.f("RealCall", "execute has been executed", new Object[0]);
            return Response.defaultErrorResponse();
        }
        try {
            this.a.d(this);
            c cVar = new c();
            f(cVar, false);
            return cVar.a();
        } finally {
            this.a.g(this);
        }
    }

    public final void f(vr2 vr2Var, boolean z) {
        ArrayList arrayList = new ArrayList(fp6.h());
        arrayList.add(new fs2());
        arrayList.add(new ss2());
        arrayList.add(new bua());
        arrayList.add(new CallIPCComponentInterceptor());
        new pcf(arrayList, 0, this.b, vr2Var, z).a();
    }
}
