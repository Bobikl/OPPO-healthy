package com.heytap.store.homemodule.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJP\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,H\u0016J4\u0010\u0019\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000f¨\u0006/"}, d2 = {"Lcom/heytap/store/homemodule/widget/RoundBackgroundSpan;", "Landroid/text/style/ReplacementSpan;", "bgColor", "", "radius", "", ParserTag.TAG_TEXT_COLOR, "spaceSize", "(IFII)V", "paddingX", "paddingY", "(IFIIII)V", "getBgColor", "()I", "setBgColor", "(I)V", "getPaddingX", "setPaddingX", "getPaddingY", "setPaddingY", "getRadius", "()F", "setRadius", "(F)V", "size", "getSize", "setSize", "getSpaceSize", "setSpaceSize", "getTextColor", ClickApiEntity.SET_TEXT_COLOR, ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", TextEntity.ELLIPSIZE_END, "x", "top", "y", "bottom", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RoundBackgroundSpan extends ReplacementSpan {
    private int bgColor;
    private int paddingX;
    private int paddingY;
    private float radius;
    private int size;
    private int spaceSize;
    private int textColor;

    public RoundBackgroundSpan(int i, float f, int i2, int i3) {
        this.bgColor = i;
        this.radius = f;
        this.textColor = i2;
        this.spaceSize = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.save();
        canvas.translate(this.spaceSize, 0.0f);
        paint.setColor(this.bgColor);
        paint.setAntiAlias(true);
        float f = this.paddingX;
        float f2 = y;
        float f3 = this.paddingY;
        RectF rectF = new RectF(x - f, (paint.ascent() + f2) - f3, x + this.size + f, paint.descent() + f2 + f3);
        float fDescent = this.radius;
        if (fDescent <= 0.0f) {
            fDescent = (paint.descent() + f3) - (paint.ascent() - f);
        }
        canvas.drawRoundRect(rectF, fDescent, fDescent, paint);
        paint.setColor(this.textColor);
        canvas.drawText(text, start, end, x + f, f2, paint);
        canvas.restore();
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final int getPaddingX() {
        return this.paddingX;
    }

    public final int getPaddingY() {
        return this.paddingY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSpaceSize() {
        return this.spaceSize;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
    }

    public final void setPaddingX(int i) {
        this.paddingX = i;
    }

    public final void setPaddingY(int i) {
        this.paddingY = i;
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public final void setSize(int i) {
        this.size = i;
    }

    public final void setSpaceSize(int i) {
        this.spaceSize = i;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @Nullable CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        float fMeasureText;
        float f;
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.paddingX == 0) {
            fMeasureText = paint.measureText(text, start, end);
            f = 2 * this.radius;
        } else {
            fMeasureText = paint.measureText(text, start, end);
            f = this.paddingX * 2;
        }
        int i = (int) (fMeasureText + f);
        this.size = i;
        return i + (this.spaceSize * 2);
    }

    public /* synthetic */ RoundBackgroundSpan(int i, float f, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i6 & 2) != 0 ? 0.0f : f, i2, i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5);
    }

    public RoundBackgroundSpan(int i, float f, int i2, int i3, int i4, int i5) {
        this.bgColor = i;
        this.radius = f;
        this.textColor = i2;
        this.spaceSize = i3;
        this.paddingX = i4;
        this.paddingY = i5;
    }
}
