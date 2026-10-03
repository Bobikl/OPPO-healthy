package com.heytap.store.business.component.transform;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.RSRuntimeException;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.kf1;
import com.oplus.aiunit.vision.ona;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class BlurTransformation extends BitmapTransformation {
    private static final int DEFAULT_DOWN_SAMPLING = 1;
    private static final String ID = "jp.wasabeef.glide.transformations.BlurTransformation.1";
    private static final int MAX_RADIUS = 50;
    private static final int VERSION = 1;
    private final int radius;
    private final int sampling;

    public BlurTransformation() {
        this(50, 1);
    }

    @Override // com.heytap.store.business.component.transform.BitmapTransformation, com.oplus.aiunit.vision.ona
    public boolean equals(Object obj) {
        if (obj instanceof BlurTransformation) {
            BlurTransformation blurTransformation = (BlurTransformation) obj;
            if (blurTransformation.radius == this.radius && blurTransformation.sampling == this.sampling) {
                return true;
            }
        }
        return false;
    }

    @Override // com.heytap.store.business.component.transform.BitmapTransformation, com.oplus.aiunit.vision.ona
    public int hashCode() {
        return 737513610 + (this.radius * 1000) + (this.sampling * 10);
    }

    public String toString() {
        return "BlurTransformation(radius=" + this.radius + ", sampling=" + this.sampling + ")";
    }

    @Override // com.heytap.store.business.component.transform.BitmapTransformation
    public Bitmap transform(@NonNull Context context, @NonNull kf1 kf1Var, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = this.sampling;
        Bitmap bitmapC = kf1Var.c(width / i3, height / i3, Bitmap.Config.ARGB_8888);
        setCanvasBitmapDensity(bitmap, bitmapC);
        Canvas canvas = new Canvas(bitmapC);
        int i4 = this.sampling;
        canvas.scale(1.0f / i4, 1.0f / i4);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            return RSBlur.blur(context, bitmapC, this.radius);
        } catch (RSRuntimeException unused) {
            return FastBlur.blur(bitmapC, this.radius, true);
        }
    }

    @Override // com.heytap.store.business.component.transform.BitmapTransformation, com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update((ID + this.radius + this.sampling).getBytes(ona.CHARSET));
    }

    public BlurTransformation(int i) {
        this(i, 1);
    }

    public BlurTransformation(int i, int i2) {
        this.radius = i;
        this.sampling = i2;
    }
}
