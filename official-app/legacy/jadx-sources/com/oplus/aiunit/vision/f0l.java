package com.oplus.aiunit.vision;

import android.graphics.Paint;
import android.graphics.Rect;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u001e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¨\u0006\r"}, d2 = {"Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "", "str", "Landroid/graphics/Rect;", "rect", "", "b", "c", "textPaint", "", "textCenterY", "a", "health_base_release"}, k = 2, mv = {1, 8, 0})
public final class f0l {
    public static final float a(@NotNull Paint textPaint, float f) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        return f + ((-(fontMetrics.bottom + fontMetrics.top)) / 2);
    }

    public static final int b(@NotNull Paint paint, @NotNull String str, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static final int c(@NotNull Paint paint, @NotNull String str, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }
}
