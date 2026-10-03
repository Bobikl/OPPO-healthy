package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import com.heytap.udeviceui.R$color;
import com.heytap.udeviceui.R$dimen;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(api = 23)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/uek;", "Landroid/graphics/drawable/RippleDrawable;", "Landroid/content/Context;", "context", "", "a", "<init>", "(Landroid/content/Context;)V", "Companion", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class uek extends RippleDrawable {

    @ColorInt
    public static final int i = Color.parseColor(wrf.DEFAULT_COLOR);

    /* JADX WARN: Illegal instructions before constructor call */
    public uek(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        sek sekVar = sek.INSTANCE;
        int color = context.getResources().getColor(R$color.text_ripple_bg_color);
        int i2 = i;
        super(sekVar.a(color, i2), new ColorDrawable(i2), new tek());
        a(context);
    }

    public final void a(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_horizontal);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_vertical);
        setPadding(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2);
    }
}
