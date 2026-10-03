package com.heytap.store.homemodule.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/heytap/store/homemodule/utils/GrayManager;", "", "()V", "mGrayPaint", "Landroid/graphics/Paint;", "setLayerGrayType", "", "view", "Landroid/view/View;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class GrayManager {

    @NotNull
    public static final GrayManager INSTANCE = new GrayManager();

    @NotNull
    private static final Paint mGrayPaint;

    static {
        Paint paint = new Paint();
        mGrayPaint = paint;
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
    }

    private GrayManager() {
    }

    public final void setLayerGrayType(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setLayerType(2, mGrayPaint);
    }
}
