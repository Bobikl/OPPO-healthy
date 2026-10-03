package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class doa {
    public static String a(String str, String str2) {
        int iMin = Math.min(str.length(), str2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iMin; i++) {
            sb.append(str.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString();
    }
}
