package com.oplusos.vfxmodelviewer.filament;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Size;

/* JADX INFO: loaded from: classes9.dex */
public final class MathUtils {
    private MathUtils() {
    }

    private static native void nPackTangentFrame(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, @NonNull @Size(min = 4) float[] fArr, @IntRange(from = 0) int i);

    public static void packTangentFrame(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, @NonNull @Size(min = 4) float[] fArr) {
        nPackTangentFrame(f, f2, f3, f4, f5, f6, f7, f8, f9, fArr, 0);
    }

    public static void packTangentFrame(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, @NonNull @Size(min = 4) float[] fArr, @IntRange(from = 0) int i) {
        nPackTangentFrame(f, f2, f3, f4, f5, f6, f7, f8, f9, fArr, i);
    }
}
