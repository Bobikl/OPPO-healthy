package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class sb8 extends sf1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f16535e = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(ona.CHARSET);
    public final float a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f16536c;
    public final float d;

    public sb8(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.f16536c = f3;
        this.d = f4;
    }

    @Override // com.oplus.aiunit.vision.sf1
    public Bitmap a(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        return z9k.o(kf1Var, bitmap, this.a, this.b, this.f16536c, this.d);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (!(obj instanceof sb8)) {
            return false;
        }
        sb8 sb8Var = (sb8) obj;
        return this.a == sb8Var.a && this.b == sb8Var.b && this.f16536c == sb8Var.f16536c && this.d == sb8Var.d;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return uqk.n(this.d, uqk.n(this.f16536c, uqk.n(this.b, uqk.p(-2013597734, uqk.m(this.a)))));
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f16535e);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.a).putFloat(this.b).putFloat(this.f16536c).putFloat(this.d).array());
    }
}
