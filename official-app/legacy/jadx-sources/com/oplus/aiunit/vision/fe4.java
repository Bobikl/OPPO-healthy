package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes18.dex */
public class fe4 extends sf1 {
    public fe4(Context context) {
    }

    @Override // com.oplus.aiunit.vision.sf1
    public Bitmap a(kf1 kf1Var, Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap.getWidth() - iMin) / 2;
        int height = (bitmap.getHeight() - iMin) / 2;
        Bitmap bitmapC = kf1Var.c(iMin, iMin, Bitmap.Config.ARGB_8888);
        if (bitmapC == null) {
            bitmapC = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapC);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (width != 0 || height != 0) {
            Matrix matrix = new Matrix();
            matrix.setTranslate(-width, -height);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        float f = iMin / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        return bitmapC;
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
