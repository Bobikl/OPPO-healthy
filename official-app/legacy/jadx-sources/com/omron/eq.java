package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class eq extends ep {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ep.b f8993c = ep.b.Verbose;
    private static String d = eq.class.getSimpleName();

    private static void a(String str, ep.b bVar, String str2) {
        if (f8993c.ordinal() > bVar.ordinal()) {
            return;
        }
        if (str == null) {
            str = d;
        }
        ep.a(str, bVar, true, str2);
    }

    private static void a(String str, ep.b bVar, String str2, String str3) {
        a(str, bVar, str2 + " " + ep.a(6) + " " + str3);
    }

    public static void a(String str, String str2) {
        a(str, ep.b.Debug, "[DEBUG]", str2);
    }
}
