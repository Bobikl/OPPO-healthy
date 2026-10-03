package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class sf1 implements x9k<Bitmap> {
    public abstract Bitmap a(@NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2);

    @Override // com.oplus.aiunit.vision.x9k
    @NonNull
    public final usf<Bitmap> transform(@NonNull Context context, @NonNull usf<Bitmap> usfVar, int i, int i2) {
        if (!uqk.v(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        kf1 kf1VarG = com.bumptech.glide.a.d(context).g();
        Bitmap bitmap = usfVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapA = a(kf1VarG, bitmap, i, i2);
        return bitmap.equals(bitmapA) ? usfVar : mf1.c(bitmapA, kf1VarG);
    }
}
