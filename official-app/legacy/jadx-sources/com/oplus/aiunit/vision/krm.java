package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class krm {
    public static volatile krm b;
    public com.amap.api.col.p0003sl.q0 a;

    public krm() {
        this.a = null;
        this.a = com.amap.api.col.p0003sl.r.b("AMapThreadUtil");
    }

    public static krm a() {
        if (b == null) {
            synchronized (krm.class) {
                if (b == null) {
                    b = new krm();
                }
            }
        }
        return b;
    }

    public static void c() {
        if (b != null) {
            try {
                if (b.a != null) {
                    b.a.g();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            b.a = null;
            b = null;
        }
    }

    public static void d(u4n u4nVar) {
        if (u4nVar != null) {
            try {
                u4nVar.cancelTask();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void b(u4n u4nVar) {
        try {
            this.a.b(u4nVar);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
