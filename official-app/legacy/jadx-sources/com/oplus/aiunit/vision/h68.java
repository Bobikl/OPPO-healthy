package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class h68 implements i68.a {
    public final kf1 a;

    @Nullable
    public final ch0 b;

    public h68(kf1 kf1Var, @Nullable ch0 ch0Var) {
        this.a = kf1Var;
        this.b = ch0Var;
    }

    @Override // com.oplus.aiunit.vision.i68.a
    @NonNull
    public byte[] a(int i) {
        ch0 ch0Var = this.b;
        return ch0Var == null ? new byte[i] : (byte[]) ch0Var.b(i, byte[].class);
    }

    @Override // com.oplus.aiunit.vision.i68.a
    @NonNull
    public Bitmap b(int i, int i2, @NonNull Bitmap.Config config) {
        return this.a.d(i, i2, config);
    }

    @Override // com.oplus.aiunit.vision.i68.a
    public void c(@NonNull Bitmap bitmap) {
        this.a.b(bitmap);
    }

    @Override // com.oplus.aiunit.vision.i68.a
    @NonNull
    public int[] d(int i) {
        ch0 ch0Var = this.b;
        return ch0Var == null ? new int[i] : (int[]) ch0Var.b(i, int[].class);
    }

    @Override // com.oplus.aiunit.vision.i68.a
    public void e(@NonNull byte[] bArr) {
        ch0 ch0Var = this.b;
        if (ch0Var == null) {
            return;
        }
        ch0Var.put(bArr);
    }

    @Override // com.oplus.aiunit.vision.i68.a
    public void f(@NonNull int[] iArr) {
        ch0 ch0Var = this.b;
        if (ch0Var == null) {
            return;
        }
        ch0Var.put(iArr);
    }
}
