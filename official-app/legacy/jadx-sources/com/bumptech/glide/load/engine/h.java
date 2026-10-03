package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.ona;
import com.oplus.aiunit.vision.usf;

/* JADX INFO: loaded from: classes13.dex */
public class h<Z> implements usf<Z> {
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1390j;
    public final usf<Z> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f1391l;
    public final ona m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1392n;
    public boolean o;

    public interface a {
        void b(ona onaVar, h<?> hVar);
    }

    public h(usf<Z> usfVar, boolean z, boolean z2, ona onaVar, a aVar) {
        this.k = (usf) cpe.d(usfVar);
        this.i = z;
        this.f1390j = z2;
        this.m = onaVar;
        this.f1391l = (a) cpe.d(aVar);
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Class<Z> a() {
        return this.k.a();
    }

    public synchronized void b() {
        if (this.o) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f1392n++;
    }

    public usf<Z> c() {
        return this.k;
    }

    public boolean d() {
        return this.i;
    }

    public void e() {
        boolean z;
        synchronized (this) {
            int i = this.f1392n;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f1392n = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f1391l.b(this.m, this);
        }
    }

    @Override // com.oplus.aiunit.vision.usf
    @NonNull
    public Z get() {
        return this.k.get();
    }

    @Override // com.oplus.aiunit.vision.usf
    public int getSize() {
        return this.k.getSize();
    }

    @Override // com.oplus.aiunit.vision.usf
    public synchronized void recycle() {
        if (this.f1392n > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.o) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.o = true;
        if (this.f1390j) {
            this.k.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.i + ", listener=" + this.f1391l + ", key=" + this.m + ", acquired=" + this.f1392n + ", isRecycled=" + this.o + ", resource=" + this.k + '}';
    }
}
