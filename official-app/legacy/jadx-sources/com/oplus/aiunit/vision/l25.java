package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class l25 {
    public static void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("CommonSync.");
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append(Thread.currentThread().getName());
        sb2.append(")");
        sb2.append(str2);
    }

    public static void b(String str, String str2) {
        a7b.b("CommonSync." + str, "(" + Thread.currentThread().getName() + ")" + str2);
    }

    public static void c(String str, String str2) {
        a7b.m("CommonSync." + str, "(" + Thread.currentThread().getName() + ")" + str2);
    }
}
