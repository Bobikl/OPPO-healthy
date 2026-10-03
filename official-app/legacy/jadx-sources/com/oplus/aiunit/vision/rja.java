package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public final class rja {
    public boolean a;
    public String b;
    public static rja NOT_INVOKED = new rja(false, null);
    public static rja NO_RESULT = new rja(true, null);
    public static rja NOT_SUPPORT = new rja(false, "{\"code\":202}");

    public rja(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public static final rja b(String str) {
        return new rja(true, str);
    }

    public static final rja c(boolean z, String str) {
        return new rja(z, str);
    }

    public String a() {
        return this.b;
    }
}
