package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes3.dex */
public class j25 {
    public static final String HEAD = "InterConnHealth.";

    public static void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(HEAD);
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append(Thread.currentThread().getName());
        sb2.append(")");
        sb2.append(str2);
    }
}
