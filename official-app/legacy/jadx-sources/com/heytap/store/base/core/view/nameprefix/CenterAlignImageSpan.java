package com.heytap.store.base.core.view.nameprefix;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JR\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/base/core/view/nameprefix/CenterAlignImageSpan;", "Landroid/text/style/ImageSpan;", "d", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "", TextEntity.ELLIPSIZE_END, "x", "", "top", "y", "bottom", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CenterAlignImageSpan extends ImageSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterAlignImageSpan(@NotNull Drawable d) {
        super(d);
        Intrinsics.checkNotNullParameter(d, "d");
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(fontMetricsInt, "paint.fontMetricsInt");
        int i = ((((fontMetricsInt.descent + y) + y) + fontMetricsInt.ascent) / 2) - (getDrawable().getBounds().bottom / 2);
        canvas.save();
        canvas.translate(x, i);
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
