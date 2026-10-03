package com.heytap.accessory.base.bean;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static c b;
    public boolean a;

    public static c a() {
        synchronized (c.class) {
            if (b == null) {
                b = new c();
            }
        }
        return b;
    }

    public boolean b() {
        return this.a;
    }

    public void a(boolean z) {
        this.a = z;
    }
}
