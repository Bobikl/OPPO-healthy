package com.heytap.msp.okipc.server.routing;

import com.heytap.msp.okipc.server.Handler;

/* JADX INFO: loaded from: classes19.dex */
public interface RouteResolveResult {

    public static final class a implements RouteResolveResult {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    public static final class b implements RouteResolveResult {
        public final Handler a;
        public final String b;

        public b(Handler handler, String str) {
            this.a = handler;
            this.b = str;
        }

        public String a() {
            return this.b;
        }
    }
}
