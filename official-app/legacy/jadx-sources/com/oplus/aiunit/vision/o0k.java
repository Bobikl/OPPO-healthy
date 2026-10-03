package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;

/* JADX INFO: loaded from: classes9.dex */
public class o0k {
    public static Drawable a(Drawable drawable, int i) {
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap.mutate(), i);
        return drawableWrap;
    }
}
