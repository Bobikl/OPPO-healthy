package com.heytap.omas.omkms.feature;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    public static final class a {
        private static b a = f.b();
        private static b b = g.b();

        private a() {
        }
    }

    private h() {
    }

    public static b a(com.heytap.omas.omkms.data.h hVar) {
        String authMode = hVar.getAuthMode();
        authMode.hashCode();
        if (authMode.equals(com.heytap.omas.a.b.c.b)) {
            return a.a;
        }
        if (authMode.equals("WB")) {
            return a.b;
        }
        throw new IllegalStateException("Should not take place always, Unexpected ticket auth type value: " + hVar.getAuthMode());
    }
}
