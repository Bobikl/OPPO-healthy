package com.heytap.msp.okipc.server.routing;

import android.net.Uri;
import com.heytap.msp.okipc.IPCRawCall;
import com.heytap.msp.okipc.server.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    public final Route a;
    public final IPCRawCall b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f7345c;

    public c(Route route, IPCRawCall iPCRawCall) {
        this.a = route;
        this.b = iPCRawCall;
        this.f7345c = Uri.parse(iPCRawCall.request().a).getPathSegments();
    }

    public final Handler a() {
        return this.a.a(this.f7345c.isEmpty() ? null : this.f7345c.get(0));
    }

    public RouteResolveResult b() {
        if (this.f7345c.size() > 1) {
            return new RouteResolveResult.a("nested path segments are not supported");
        }
        if (this.a.a.a(this, 0) != RouterSelectorEvaluation.Success) {
            return new RouteResolveResult.a("root path mismatch");
        }
        Handler handlerA = a();
        String str = "/";
        if (handlerA != null) {
            if (!this.f7345c.isEmpty()) {
                str = "/" + this.f7345c.get(0);
            }
            return new RouteResolveResult.b(handlerA, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("no handler registered for path ");
        if (!this.f7345c.isEmpty()) {
            str = "/" + this.f7345c.get(0);
        }
        sb.append(str);
        return new RouteResolveResult.a(sb.toString());
    }
}
