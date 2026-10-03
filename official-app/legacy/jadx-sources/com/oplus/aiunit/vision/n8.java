package com.oplus.aiunit.vision;

import java.io.IOException;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class n8 extends r7 {
    public static final String DYNAMIC_HOST_HEADER = "X-Dynamic-Host";

    public final uk9 a(uk9 uk9Var, String str) {
        uk9 uk9VarN = uk9.n(str);
        return uk9Var.l().q(uk9VarN.getScheme()).g(uk9VarN.getHost()).m(uk9VarN.getPort()).c();
    }

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request request = aVar.request();
        if (isIgnoreIntercept(request)) {
            mb.b("AcIntercept._AcDynamicHostInterceptor", "ignore intercept!");
            return aVar.c(request);
        }
        String strG = request.g(DYNAMIC_HOST_HEADER);
        if (strG == null || strG.isEmpty()) {
            mb.b("AcIntercept._AcDynamicHostInterceptor", "no dynamic host, ignore intercept!");
            return aVar.c(request);
        }
        try {
            mb.b("AcIntercept._AcDynamicHostInterceptor", "replace " + request.getUrl() + " to new host: " + strG);
            return aVar.c(request.n().removeHeader(DYNAMIC_HOST_HEADER).url(a(request.getUrl(), strG)).build());
        } catch (Throwable th) {
            mb.a("AcIntercept._AcDynamicHostInterceptor", "intercept exception " + th.getMessage());
            return aVar.c(request);
        }
    }
}
