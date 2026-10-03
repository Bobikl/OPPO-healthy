package com.heytap.health.extenalcard.view;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.lo9;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"getDrawTextY", "", "textPaint", "Landroid/graphics/Paint;", "textCenterY", "getTextHeight", "", lo9.TAG_DEFAULT_CREATION_PAINT, "str", "", "rect", "Landroid/graphics/Rect;", "extenalcard_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewExtendKt {
    @Keep
    public static final float getDrawTextY(@NotNull Paint textPaint, float f) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return f + ((-(fontMetrics.bottom + fontMetrics.top)) / 2);
    }

    @Keep
    public static final int getTextHeight(@NotNull Paint paint, @NotNull String str, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }
}
