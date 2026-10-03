package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class ze1 implements mtf<Bitmap, BitmapDrawable> {
    public final Resources a;

    public ze1(@NonNull Resources resources) {
        this.a = (Resources) cpe.d(resources);
    }

    @Override // com.oplus.aiunit.vision.mtf
    @Nullable
    public usf<BitmapDrawable> a(@NonNull usf<Bitmap> usfVar, @NonNull erd erdVar) {
        return xua.c(this.a, usfVar);
    }
}
