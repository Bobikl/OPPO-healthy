package com.oplus.aiunit.vision;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes15.dex */
public class is4 {
    public final ByteArrayOutputStream a = new ByteArrayOutputStream();

    @NonNull
    public byte[] a() {
        return this.a.toByteArray();
    }

    public boolean b(@Nullable byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        return c(bArr, 0, bArr.length);
    }

    public boolean c(@Nullable byte[] bArr, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        if (bArr == null || bArr.length < i) {
            return false;
        }
        this.a.write(bArr, i, Math.min(bArr.length - i, i2));
        return true;
    }
}
