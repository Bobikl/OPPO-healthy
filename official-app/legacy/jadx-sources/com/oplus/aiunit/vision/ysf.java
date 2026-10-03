package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class ysf implements ona {
    public static final pbb<Class<?>, byte[]> i = new pbb<>(50);
    public final ch0 a;
    public final ona b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ona f19132c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19133e;
    public final Class<?> f;
    public final erd g;
    public final x9k<?> h;

    public ysf(ch0 ch0Var, ona onaVar, ona onaVar2, int i2, int i3, x9k<?> x9kVar, Class<?> cls, erd erdVar) {
        this.a = ch0Var;
        this.b = onaVar;
        this.f19132c = onaVar2;
        this.d = i2;
        this.f19133e = i3;
        this.h = x9kVar;
        this.f = cls;
        this.g = erdVar;
    }

    public final byte[] a() {
        pbb<Class<?>, byte[]> pbbVar = i;
        byte[] bArrF = pbbVar.f(this.f);
        if (bArrF != null) {
            return bArrF;
        }
        byte[] bytes = this.f.getName().getBytes(ona.CHARSET);
        pbbVar.j(this.f, bytes);
        return bytes;
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (!(obj instanceof ysf)) {
            return false;
        }
        ysf ysfVar = (ysf) obj;
        return this.f19133e == ysfVar.f19133e && this.d == ysfVar.d && uqk.e(this.h, ysfVar.h) && this.f.equals(ysfVar.f) && this.b.equals(ysfVar.b) && this.f19132c.equals(ysfVar.f19132c) && this.g.equals(ysfVar.g);
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        int iHashCode = (((((this.b.hashCode() * 31) + this.f19132c.hashCode()) * 31) + this.d) * 31) + this.f19133e;
        x9k<?> x9kVar = this.h;
        if (x9kVar != null) {
            iHashCode = (iHashCode * 31) + x9kVar.hashCode();
        }
        return (((iHashCode * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.b + ", signature=" + this.f19132c + ", width=" + this.d + ", height=" + this.f19133e + ", decodedResourceClass=" + this.f + ", transformation='" + this.h + "', options=" + this.g + '}';
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.a.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.d).putInt(this.f19133e).array();
        this.f19132c.updateDiskCacheKey(messageDigest);
        this.b.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        x9k<?> x9kVar = this.h;
        if (x9kVar != null) {
            x9kVar.updateDiskCacheKey(messageDigest);
        }
        this.g.updateDiskCacheKey(messageDigest);
        messageDigest.update(a());
        this.a.put(bArr);
    }
}
