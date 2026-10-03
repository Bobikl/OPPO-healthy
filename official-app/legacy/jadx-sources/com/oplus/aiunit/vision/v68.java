package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes18.dex */
public class v68 extends sf1 {
    public static float a;

    public v68(Context context, int i) {
        a = i;
    }

    public static Bitmap b(kf1 kf1Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Bitmap bitmapC = kf1Var.c(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        if (bitmapC == null) {
            bitmapC = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmapC);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        float f = a;
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmapC;
    }

    @Override // com.oplus.aiunit.vision.sf1
    public Bitmap a(kf1 kf1Var, Bitmap bitmap, int i, int i2) {
        return b(kf1Var, bitmap);
    }

    @Override // com.oplus.aiunit.vision.ona
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
    }
}
