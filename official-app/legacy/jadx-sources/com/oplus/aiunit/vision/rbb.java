package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public interface rbb {
    String a(int i, int i2, Bitmap.Config config);

    void b(Bitmap bitmap);

    @Nullable
    Bitmap c(int i, int i2, Bitmap.Config config);

    int d(Bitmap bitmap);

    String e(Bitmap bitmap);

    @Nullable
    Bitmap removeLast();
}
