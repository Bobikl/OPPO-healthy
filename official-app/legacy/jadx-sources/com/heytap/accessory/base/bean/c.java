package com.heytap.accessory.base.bean;

/* JADX INFO: loaded from: classes14.dex */
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
