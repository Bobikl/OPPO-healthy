package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
public class v6l {
    @Nullable
    public static final Drawable a(@NotNull Context context, int i) {
        return AppCompatResources.getDrawable(context, i);
    }

    @Nullable
    public static final Drawable b(@Nullable Drawable drawable, int i) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof AnimatedStateListDrawableCompat) {
            return drawable;
        }
        Drawable drawableWrap = DrawableCompat.wrap(drawable);
        DrawableCompat.setTint(drawableWrap.mutate(), i);
        return drawableWrap;
    }
}
