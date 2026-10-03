package com.heytap.store.product_support.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.product_support.R;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JR\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0002J4\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/heytap/store/product_support/widget/VerticalCenterImageSpan;", "Landroid/text/style/ImageSpan;", ResourcesUtil.ResourceType.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "paddingEnd", "", "weakRef", "Ljava/lang/ref/WeakReference;", ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", TextEntity.ELLIPSIZE_END, "x", "", "top", "y", "bottom", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "getCachedDrawable", "getSize", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class VerticalCenterImageSpan extends ImageSpan {
    private int paddingEnd;

    @Nullable
    private WeakReference<Drawable> weakRef;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalCenterImageSpan(@NotNull Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.paddingEnd = ContextGetterUtils.INSTANCE.getApp().getResources().getDimensionPixelSize(R.dimen.pf_product_tag_icon_margin_end);
    }

    private final Drawable getCachedDrawable() {
        WeakReference<Drawable> weakReference = this.weakRef;
        Drawable drawable = weakReference != null ? weakReference.get() : null;
        if (drawable == null) {
            drawable = getDrawable();
            this.weakRef = new WeakReference<>(drawable);
        }
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @Nullable CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Drawable cachedDrawable = getCachedDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i = fontMetricsInt.descent;
        canvas.translate(x, ((y + i) - ((i - fontMetricsInt.ascent) / 2)) - ((cachedDrawable.getBounds().bottom - cachedDrawable.getBounds().top) / 2));
        cachedDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @Nullable CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Rect bounds = getCachedDrawable().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "drawable.bounds");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i = fontMetricsInt2.descent;
            int i2 = fontMetricsInt2.ascent;
            int i3 = i2 + ((i - i2) / 2);
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 - i4;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            int i6 = i3 + i4;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right + this.paddingEnd;
    }
}
