package com.omron.lib.ohc;

import com.omron.ep;

/* JADX INFO: loaded from: classes5.dex */
class b extends ep {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f9041c = "b";
    private static final ep.b d = ep.b.Verbose;

    public static void a() {
        a(ep.b.Verbose, "[IN]", "");
    }

    public static void b(String str) {
        a(ep.b.Error, "[ERROR]", str);
    }

    public static void c(String str) {
        a(ep.b.Info, "[INFO]", str);
    }

    public static void d(String str) {
        a(ep.b.Verbose, "[IN]", str);
    }

    public static void e(String str) {
        a(ep.b.Warn, "[WARN]", str);
    }

    private static void a(ep.b bVar, String str) {
        if (d.ordinal() > bVar.ordinal()) {
            return;
        }
        ep.a(f9041c, bVar, true, str);
    }

    private static void a(ep.b bVar, String str, String str2) {
        a(bVar, str + " " + ep.a(5) + " " + str2);
    }

    public static void a(String str) {
        a(ep.b.Debug, "[DEBUG]", str);
    }
}
