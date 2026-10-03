package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class a1j {
    public static String a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
