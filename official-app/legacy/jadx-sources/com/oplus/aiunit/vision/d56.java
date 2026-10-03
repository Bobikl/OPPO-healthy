package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes13.dex */
public final class d56 {
    public static final kf1 a = new a();

    public class a extends lf1 {
        @Override // com.oplus.aiunit.vision.lf1, com.oplus.aiunit.vision.kf1
        public void b(Bitmap bitmap) {
        }
    }

    @Nullable
    public static usf<Bitmap> a(kf1 kf1Var, Drawable drawable, int i, int i2) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(kf1Var, current, i, i2);
            z = true;
        }
        if (!z) {
            kf1Var = a;
        }
        return mf1.c(bitmapB, kf1Var);
    }

    @Nullable
    public static Bitmap b(kf1 kf1Var, Drawable drawable, int i, int i2) {
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i2 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        Lock lockI = z9k.i();
        lockI.lock();
        Bitmap bitmapC = kf1Var.c(i, i2, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapC);
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapC;
        } finally {
            lockI.unlock();
        }
    }
}
