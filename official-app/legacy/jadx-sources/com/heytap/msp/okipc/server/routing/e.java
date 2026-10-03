package com.heytap.msp.okipc.server.routing;

import android.util.Log;
import com.heytap.msp.okipc.exception.IPCServerRouteException;
import com.heytap.msp.okipc.server.ExecuteOnceHandler;
import com.heytap.msp.okipc.server.Handler;
import com.heytap.msp.okipc.server.UncontrollHandler;

/* JADX INFO: loaded from: classes19.dex */
public class e {
    public final Route a;
    public final com.heytap.msp.okipc.server.b b;

    public e(Route route, com.heytap.msp.okipc.server.b bVar) {
        this.a = route;
        this.b = bVar;
    }

    public void a() {
        RouteResolveResult routeResolveResultB = new c(this.a, this.b).b();
        if (!(routeResolveResultB instanceof RouteResolveResult.b)) {
            if (routeResolveResultB instanceof RouteResolveResult.a) {
                this.b.d(new IPCServerRouteException(this.b.request().a));
                Log.i("error", ((RouteResolveResult.a) routeResolveResultB).a);
                return;
            }
            return;
        }
        RouteResolveResult.b bVar = (RouteResolveResult.b) routeResolveResultB;
        Handler handler = bVar.a;
        if (handler instanceof ExecuteOnceHandler) {
            try {
                this.b.c(((ExecuteOnceHandler) handler).handle(this.b));
                return;
            } catch (Throwable th) {
                this.b.d(th);
                return;
            }
        }
        if (handler instanceof UncontrollHandler) {
            ((UncontrollHandler) handler).handle(this.b);
            return;
        }
        Log.w("ipcserver", "No handler bound for path " + bVar.a());
    }
}
