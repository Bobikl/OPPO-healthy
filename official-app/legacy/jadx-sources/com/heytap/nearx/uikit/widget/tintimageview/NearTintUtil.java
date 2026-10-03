package com.heytap.nearx.uikit.widget.tintimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes18.dex */
public class NearTintUtil {
    public static Bitmap tintBitmap(Bitmap bitmap, int i) {
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        bitmapCreateBitmap.setDensity(bitmap.getDensity());
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Drawable tintDrawable(Drawable drawable, ColorStateList colorStateList) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(drawableWrap.mutate(), colorStateList);
        return drawableWrap;
    }

    public static Drawable tintDrawable(Drawable drawable, int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap.mutate(), i);
        return drawableWrap;
    }
}
