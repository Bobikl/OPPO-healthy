package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes13.dex */
public final class v5b<Z> implements usf<Z>, x07.f {
    public static final Pools.Pool<v5b<?>> m = x07.d(20, new a());
    public final umi i = umi.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public usf<Z> f17721j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17722l;

    public class a implements x07.d<v5b<?>> {
        @Override // com.oplus.aiunit.vision.x07.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public v5b<?> create() {
            return new v5b<>();
        }
    }

    @NonNull
    public static <Z> v5b<Z> c(usf<Z> usfVar) {
        v5b<Z> v5bVar = (v5b) cpe.d(m.acquire());
        v5bVar.b(usfVar);
        return v5bVar;
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<Z> a() {
        return this.f17721j.a();
    }

    public final void b(usf<Z> usfVar) {
        this.f17722l = false;
        this.k = true;
        this.f17721j = usfVar;
    }

    public final void d() {
        this.f17721j = null;
        m.release(this);
    }

    @Override // com.oplus.aiunit.vision.x07.f
    @NonNull
    public umi e() {
        return this.i;
    }

    public synchronized void f() {
        this.i.c();
        if (!this.k) {
            throw new IllegalStateException("Already unlocked");
        }
        this.k = false;
        if (this.f17722l) {
            recycle();
        }
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Z get() {
        return this.f17721j.get();
    }

    @Override // com.oplus.aiunit.vision.usf
    public int getSize() {
        return this.f17721j.getSize();
    }

    @Override // com.oplus.aiunit.vision.usf
    public synchronized void recycle() {
        this.i.c();
        this.f17722l = true;
        if (!this.k) {
            this.f17721j.recycle();
            d();
        }
    }
}
