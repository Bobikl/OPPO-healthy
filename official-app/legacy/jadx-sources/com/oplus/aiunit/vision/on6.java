package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class on6 implements ona {
    public final Object a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14991c;
    public final Class<?> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class<?> f14992e;
    public final ona f;
    public final Map<Class<?>, x9k<?>> g;
    public final erd h;
    public int i;

    public on6(Object obj, ona onaVar, int i, int i2, Map<Class<?>, x9k<?>> map, Class<?> cls, Class<?> cls2, erd erdVar) {
        this.a = cpe.d(obj);
        this.f = (ona) cpe.e(onaVar, "Signature must not be null");
        this.b = i;
        this.f14991c = i2;
        this.g = (Map) cpe.d(map);
        this.d = (Class) cpe.e(cls, "Resource class must not be null");
        this.f14992e = (Class) cpe.e(cls2, "Transcode class must not be null");
        this.h = (erd) cpe.d(erdVar);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (!(obj instanceof on6)) {
            return false;
        }
        on6 on6Var = (on6) obj;
        return this.a.equals(on6Var.a) && this.f.equals(on6Var.f) && this.f14991c == on6Var.f14991c && this.b == on6Var.b && this.g.equals(on6Var.g) && this.d.equals(on6Var.d) && this.f14992e.equals(on6Var.f14992e) && this.h.equals(on6Var.h);
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        if (this.i == 0) {
            int iHashCode = this.a.hashCode();
            this.i = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f.hashCode()) * 31) + this.b) * 31) + this.f14991c;
            this.i = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.g.hashCode();
            this.i = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.d.hashCode();
            this.i = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f14992e.hashCode();
            this.i = iHashCode5;
            this.i = (iHashCode5 * 31) + this.h.hashCode();
        }
        return this.i;
    }

    public String toString() {
        return "EngineKey{model=" + this.a + ", width=" + this.b + ", height=" + this.f14991c + ", resourceClass=" + this.d + ", transcodeClass=" + this.f14992e + ", signature=" + this.f + ", hashCode=" + this.i + ", transformations=" + this.g + ", options=" + this.h + '}';
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
