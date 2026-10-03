package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class ml4 {
    public static void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("DMLog.");
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        sb2.append(Thread.currentThread().getName());
        sb2.append("]");
        sb2.append(str2);
    }

    public static void b(String str) {
        a7b.b("DMLog.", "[" + Thread.currentThread().getName() + "]" + str);
    }

    public static void c(String str, String str2) {
        a7b.b("DMLog." + str, "[" + Thread.currentThread().getName() + "]" + str2);
    }

    public static void d(String str, String str2) {
        a7b.f("DMLog." + str, "[" + Thread.currentThread().getName() + "]" + str2);
    }

    public static void e(String str, String str2) {
        a7b.m("DMLog." + str, "[" + Thread.currentThread().getName() + "]" + str2);
    }
}
