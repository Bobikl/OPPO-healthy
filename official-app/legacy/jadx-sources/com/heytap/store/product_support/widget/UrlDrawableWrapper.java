package com.heytap.store.product_support.widget;

import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\u0007\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/product_support/widget/UrlDrawableWrapper;", "Landroid/graphics/drawable/BitmapDrawable;", "()V", ResourcesUtil.ResourceType.DRAWABLE, "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "d", ParserTag.TAG_TEXT_SIZE, "", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class UrlDrawableWrapper extends BitmapDrawable {

    @Nullable
    private Drawable drawable;

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.drawable;
        if (drawable == null) {
            return;
        }
        drawable.draw(canvas);
    }

    @Nullable
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final void setDrawable(@Nullable Drawable drawable) {
        this.drawable = drawable;
    }

    public final void setDrawable(@NotNull Drawable d, float textSize) {
        Intrinsics.checkNotNullParameter(d, "d");
        this.drawable = d;
        int intrinsicWidth = (int) ((d.getIntrinsicWidth() / d.getIntrinsicHeight()) * textSize);
        int i = (int) textSize;
        setBounds(0, 0, intrinsicWidth, i);
        Drawable drawable = this.drawable;
        Intrinsics.checkNotNull(drawable);
        drawable.setBounds(0, 0, intrinsicWidth, i);
        invalidateSelf();
    }
}
