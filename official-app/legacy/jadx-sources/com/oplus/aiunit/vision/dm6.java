package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes13.dex */
public final class dm6 implements ona {
    public static final dm6 a = new dm6();

    @NonNull
    public static dm6 a() {
        return a;
    }

    public String toString() {
        return "EmptySignature";
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
