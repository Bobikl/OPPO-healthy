package com.heytap.store.business.component.transform;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import com.bumptech.glide.a;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.mf1;
import com.oplus.aiunit.vision.uqk;
import com.oplus.aiunit.vision.usf;
import com.oplus.aiunit.vision.x9k;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BitmapTransformation implements x9k<Bitmap> {
    @Override // com.oplus.aiunit.vision.ona
    public abstract boolean equals(Object obj);

    @Override // com.oplus.aiunit.vision.ona
    public abstract int hashCode();

    public void setCanvasBitmapDensity(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2) {
        bitmap2.setDensity(bitmap.getDensity());
    }

    public abstract Bitmap transform(@NonNull Context context, @NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2);

    @Override // com.oplus.aiunit.vision.x9k
    @NonNull
    public final usf<Bitmap> transform(@NonNull Context context, @NonNull usf<Bitmap> usfVar, int i, int i2) {
        if (!uqk.v(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        kf1 kf1VarG = a.d(context).g();
        Bitmap bitmap = usfVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        int i3 = i;
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapTransform = transform(context.getApplicationContext(), kf1VarG, bitmap, i3, i2);
        return bitmap.equals(bitmapTransform) ? usfVar : mf1.c(bitmapTransform, kf1VarG);
    }

    @Override // com.oplus.aiunit.vision.ona
    public abstract void updateDiskCacheKey(@NonNull MessageDigest messageDigest);
}
