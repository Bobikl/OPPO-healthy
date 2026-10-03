package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes13.dex */
public class g56 {
    public static Bitmap a(Drawable drawable) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static Drawable b(Context context, Drawable drawable, float f, boolean z) {
        Bitmap bitmapA = a(drawable);
        Matrix matrix = new Matrix();
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.postRotate(f);
        return new BitmapDrawable(context.getResources(), Bitmap.createBitmap(bitmapA, 0, 0, bitmapA.getWidth(), bitmapA.getHeight(), matrix, true));
    }
}
