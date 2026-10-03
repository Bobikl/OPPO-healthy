package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public class lf1 implements kf1 {
    @Override // com.oplus.aiunit.vision.kf1
    public void a(int i) {
    }

    @Override // com.oplus.aiunit.vision.kf1
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.oplus.aiunit.vision.kf1
    @NonNull
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.oplus.aiunit.vision.kf1
    public void clearMemory() {
    }

    @Override // com.oplus.aiunit.vision.kf1
    @NonNull
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return c(i, i2, config);
    }
}
