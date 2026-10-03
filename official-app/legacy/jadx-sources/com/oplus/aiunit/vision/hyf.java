package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class hyf extends sf1 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(ona.CHARSET);
    public final int a;

    public hyf(int i) {
        cpe.a(i > 0, "roundingRadius must be greater than 0.");
        this.a = i;
    }

    @Override // com.oplus.aiunit.vision.sf1
    public Bitmap a(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        return z9k.p(kf1Var, bitmap, this.a);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        return (obj instanceof hyf) && this.a == ((hyf) obj).a;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return uqk.p(-569625254, uqk.o(this.a));
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.a).array());
    }
}
