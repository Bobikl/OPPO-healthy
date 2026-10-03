package com.oplus.aiunit.vision;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class fwj {
    public final Object a = new Object();
    public final Map<SoftReference<z72>, Boolean> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferenceQueue<z72> f11537c = new ReferenceQueue<>();

    public static final class a {
        public static final fwj a = new fwj();
    }

    public static fwj a() {
        return a.a;
    }

    public final void b() {
        while (true) {
            SoftReference softReference = (SoftReference) this.f11537c.poll();
            if (softReference == null) {
                return;
            } else {
                this.b.remove(softReference);
            }
        }
    }

    public SoftReference<z72> c(z72 z72Var) {
        SoftReference<z72> softReference = new SoftReference<>(z72Var, this.f11537c);
        this.b.put(softReference, Boolean.TRUE);
        b();
        return softReference;
    }
}
