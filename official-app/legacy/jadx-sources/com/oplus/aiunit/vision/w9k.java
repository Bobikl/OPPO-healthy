package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes12.dex */
public class w9k {
    public static byte[] a(@NonNull byte[] bArr, @NonNull byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}
