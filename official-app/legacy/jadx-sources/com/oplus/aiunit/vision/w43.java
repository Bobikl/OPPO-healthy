package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public class w43 extends sf1 {
    public static final byte[] a = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(ona.CHARSET);

    @Override // com.oplus.aiunit.vision.sf1
    public Bitmap a(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        return z9k.c(kf1Var, bitmap, i, i2);
    }

    @Override // com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        return obj instanceof w43;
    }

    @Override // com.oplus.aiunit.vision.ona
    public int hashCode() {
        return -670243078;
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(a);
    }
}
