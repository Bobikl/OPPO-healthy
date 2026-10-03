package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class ik2 extends RippleDrawable {
    public static final int U = 34;

    @ColorInt
    public static final int i = Color.parseColor(wrf.DEFAULT_COLOR);

    /* JADX WARN: Illegal instructions before constructor call */
    public ik2(@NonNull Context context, int i2, boolean z) {
        int iA = lh2.a(context, b());
        int i3 = i;
        super(im2.a(iA, i3), new ColorDrawable(i3), new hk2(i2));
        if (z) {
            a(context);
        }
    }

    public static int b() {
        return Build.VERSION.SDK_INT >= 34 ? R$attr.couiColorPressBackground : R$attr.couiColorRipplePressBackground;
    }

    public final void a(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_horizontal);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_vertical);
        setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
    }
}
