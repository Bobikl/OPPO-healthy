package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class an extends ep {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ep.b f8814c = ep.b.Verbose;

    public static void a() {
        a(ep.b.Verbose, "[IN]", "");
    }

    public static void b(String str) {
        a(ep.b.Info, "[INFO]", str);
    }

    public static void c(String str) {
        a(ep.b.Verbose, "[IN]", str);
    }

    private static void a(ep.b bVar, String str) {
        if (f8814c.ordinal() > bVar.ordinal()) {
            return;
        }
        ep.a("BleSampleOmron", bVar, true, str);
    }

    private static void a(ep.b bVar, String str, String str2) {
        a(bVar, str + " " + ep.a(5) + " " + str2);
    }

    public static void a(String str) {
        a(ep.b.Error, "[ERROR]", str);
    }
}
