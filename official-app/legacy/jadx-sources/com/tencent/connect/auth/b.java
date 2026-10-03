package com.tencent.connect.auth;

import com.oplus.aiunit.vision.iz9;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class b {
    public static b a;
    public static int d;
    public HashMap<String, a> b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20274c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static class a {
        public iz9 a;
        public com.tencent.connect.auth.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20275c;
    }

    public static b a() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    public static int c() {
        int i = d + 1;
        d = i;
        return i;
    }

    public String b(a aVar) {
        int iC = c();
        try {
            this.b.put("" + iC, aVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "" + iC;
    }

    public String d() {
        int iCeil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iCeil; i++) {
            stringBuffer.append(charArray[(int) (Math.random() * ((double) length))]);
        }
        return stringBuffer.toString();
    }
}
