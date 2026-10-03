package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class uik<T> implements x9k<T> {
    public static final x9k<?> a = new uik();

    @NonNull
    public static <T> uik<T> a() {
        return (uik) a;
    }

    @Override // com.oplus.aiunit.vision.x9k
    @NonNull
    public usf<T> transform(@NonNull Context context, @NonNull usf<T> usfVar, int i, int i2) {
        return usfVar;
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
