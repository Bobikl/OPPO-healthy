package com.oplus.aiunit.vision;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public class g8i {
    public static final AtomicReference<d8i> a = new AtomicReference<>();
    public static final AtomicReference<f8i> b = new AtomicReference<>();

    public static d8i a() {
        return a.get();
    }

    public static f8i b() {
        return b.get();
    }

    public static void c(d8i d8iVar) {
        fue.a(a, null, d8iVar);
    }

    public static void d(f8i f8iVar) {
        fue.a(b, null, f8iVar);
    }
}
