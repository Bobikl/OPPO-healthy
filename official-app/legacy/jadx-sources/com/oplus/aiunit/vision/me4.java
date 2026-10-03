package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.ColorUtils;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/me4;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "", ParserTag.TAG_DRAW, "", "alpha", ClickApiEntity.SET_ALPHA, "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "getIntrinsicWidth", "getIntrinsicHeight", "a", "I", "circleColor", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "<init>", "(I)V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class me4 extends Drawable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int circleColor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;
    public static final int $stable = 8;

    public me4(int i) {
        this.circleColor = i;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float intrinsicWidth = getIntrinsicWidth();
        float intrinsicHeight = getIntrinsicHeight();
        this.paint.setColor(ColorUtils.setAlphaComponent(this.circleColor, 153));
        float f = 2;
        float f2 = intrinsicWidth / f;
        float f3 = intrinsicHeight / f;
        float f4 = getBounds().left;
        float f5 = getBounds().top + f3;
        canvas.drawRoundRect(new RectF(f4, f5 - at5.a(1.0f), intrinsicWidth + f4, at5.a(1.0f) + f5), at5.a(3.0f), at5.a(3.0f), this.paint);
        float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(f2, f3);
        this.paint.setColor(-1);
        float f6 = f4 + f2;
        canvas.drawCircle(f6, f5, fCoerceAtMost, this.paint);
        float fA = fCoerceAtMost - (at5.a(2.0f) / 2);
        this.paint.setColor(this.circleColor);
        canvas.drawCircle(f6, f5, fA, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return at5.a(8.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return at5.a(14.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
