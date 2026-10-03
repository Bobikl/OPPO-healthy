package com.heytap.accessory.connectivity.wifi.tools;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static volatile a b;
    public static final int[] c = {46888, 47888, 48888};
    public int a = 0;

    public static a b() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public int a() {
        return this.a;
    }

    public void c() {
        this.a = 0;
    }

    public void a(int i) {
        this.a = i;
    }
}
