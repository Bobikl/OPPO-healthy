package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public interface kf1 {
    void a(int i);

    void b(Bitmap bitmap);

    @NonNull
    Bitmap c(int i, int i2, Bitmap.Config config);

    void clearMemory();

    @NonNull
    Bitmap d(int i, int i2, Bitmap.Config config);
}
