package com.oplus.phonenoareainquire;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class b {
    public static final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();
    public static volatile b b = null;

    public static class a {
        public String a;
        public String b;

        public String a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }

        public void c(String str) {
            this.b = str;
        }

        public void d(String str) {
            this.a = str;
        }
    }

    public b() {
        a.clear();
    }

    public static void a() {
        a.clear();
    }

    public static b c() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public a b(String str) {
        return a.get(str);
    }

    public synchronized void d(String str, String str2, String str3) {
        a aVar = new a();
        aVar.d(str2);
        aVar.c(str3);
        a.put(str, aVar);
    }
}
