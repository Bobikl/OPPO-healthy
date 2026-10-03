package com.oplus.aiunit.vision;

import com.oplus.epona.Call$Callback;
import com.oplus.epona.Request;
import com.oplus.epona.Response;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ecf {
    public final ryf a;
    public final Request b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AtomicBoolean f10868c = new AtomicBoolean(false);

    public class b implements Runnable {
        public final Call$Callback i;

        public b(Call$Callback call$Callback) {
            this.i = call$Callback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            boolean z = 0;
            z = 0;
            z = 0;
            try {
                try {
                    ecf.this.f(this.i, true);
                    ryf ryfVar = ecf.this.a;
                    ryfVar.f(this, true);
                    z = ryfVar;
                } catch (Exception e2) {
                    l7b.d("Epona->RealCall", "AsyncCall run failed and exception is %s", e2.toString());
                    this.i.onReceive(Response.defaultErrorResponse());
                    ecf.this.a.f(this, false);
                }
            } catch (Throwable th) {
                ecf.this.a.f(this, z);
                throw th;
            }
        }
    }

    public static class c implements Call$Callback {
        public Response a;

        public c() {
            this.a = null;
        }

        public Response a() {
            return this.a;
        }

        @Override // com.oplus.epona.Call$Callback
        public void onReceive(Response response) {
            this.a = response;
        }
    }

    public ecf(ryf ryfVar, Request request) {
        this.a = ryfVar;
        this.b = request;
    }

    public static ecf e(ryf ryfVar, Request request) {
        return new ecf(ryfVar, request);
    }

    public void c(Call$Callback call$Callback) {
        b bVar = new b(call$Callback);
        if (this.f10868c.getAndSet(true)) {
            l7b.i("Epona->RealCall", "asyncExecute has been executed", new Object[0]);
            call$Callback.onReceive(Response.defaultErrorResponse());
        }
        this.a.b(bVar);
    }

    public Response d() {
        Response responseErrorResponse;
        try {
            if (this.f10868c.getAndSet(true)) {
                l7b.i("Epona->RealCall", "execute has been executed", new Object[0]);
                return Response.defaultErrorResponse();
            }
            try {
                this.a.d(this);
                c cVar = new c();
                f(cVar, false);
                responseErrorResponse = cVar.a();
            } catch (Exception e2) {
                l7b.d("Epona->RealCall", "call has exception:" + e2.toString() + ", message:" + e2.getMessage(), new Object[0]);
                responseErrorResponse = Response.errorResponse(e2.getMessage());
            }
            return responseErrorResponse;
        } finally {
            this.a.g(this);
        }
    }

    public final void f(Call$Callback call$Callback, boolean z) {
        ArrayList arrayList = new ArrayList(ep6.k());
        arrayList.add(new es2());
        arrayList.add(new rs2());
        arrayList.add(new aua());
        arrayList.add(ep6.i());
        new ncf(arrayList, 0, this.b, call$Callback, z).a();
    }
}
