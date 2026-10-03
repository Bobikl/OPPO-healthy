package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(api = 23)
public class mlc extends RippleDrawable {

    @ColorInt
    public static final int i = Color.parseColor(wrf.DEFAULT_COLOR);

    /* JADX WARN: Illegal instructions before constructor call */
    public mlc(@NonNull Context context) {
        int iA = thc.a(context, R$attr.nxColorRipplePressBackground);
        int i2 = i;
        super(ilc.a(iA, i2), new ColorDrawable(i2), new llc());
        a(context);
    }

    public final void a(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_horizontal);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_vertical);
        setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
    }
}
