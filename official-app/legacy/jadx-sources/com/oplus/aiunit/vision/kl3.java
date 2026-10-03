package com.oplus.aiunit.vision;

import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kl3 {
    @ColorInt
    public static int a(@ColorInt int i, @IntRange(from = 0, to = 255) int i2) {
        return (i & 16777215) | (i2 << 24);
    }
}
