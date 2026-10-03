package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public class u43 extends sf1 {
    public static final byte[] a = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(ona.CHARSET);

    @Override // com.oplus.aiunit.vision.sf1
    public Bitmap a(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        return z9k.b(kf1Var, bitmap, i, i2);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        return obj instanceof u43;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return -599754482;
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(a);
    }
}
