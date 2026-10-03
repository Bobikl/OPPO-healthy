package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public abstract class hia {
    public static final hia a;

    static {
        hia hiaVar;
        try {
            hiaVar = (hia) nc3.l(iia.class, false);
        } catch (Throwable unused) {
            hiaVar = null;
        }
        a = hiaVar;
    }

    public static hia c() {
        return a;
    }

    public abstract lka<?> a(Class<?> cls);

    public abstract yla<?> b(Class<?> cls);
}
