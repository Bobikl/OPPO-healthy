package com.heytap.store.base.widget.view;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ \u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u0007J\"\u0010Q\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010O\u001a\u00020\u00072\b\b\u0002\u0010R\u001a\u00020\u0007R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\u001a\u0010%\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010R\u001a\u0010(\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u000e\"\u0004\b*\u0010\u0010R\u001a\u0010+\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000e\"\u0004\b0\u0010\u0010R\u001a\u00101\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0012\"\u0004\bB\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u000e\"\u0004\bD\u0010\u0010R\u001a\u0010E\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010\u0014R\u001a\u0010H\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u000e\"\u0004\bJ\u0010\u0010¨\u0006S"}, d2 = {"Lcom/heytap/store/base/widget/view/Element;", "", "text", "", ParserTag.TAG_TEXT_COLOR, "", ParserTag.TAG_TEXT_SIZE, "", "backgroundColor", "backgroundStyle", "Landroid/graphics/Paint$Style;", "(Ljava/lang/String;IFILandroid/graphics/Paint$Style;)V", "backGroundStrokeWidth", "getBackGroundStrokeWidth", "()F", "setBackGroundStrokeWidth", "(F)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getBackgroundStyle", "()Landroid/graphics/Paint$Style;", "setBackgroundStyle", "(Landroid/graphics/Paint$Style;)V", "backgroundWidth", "getBackgroundWidth", "setBackgroundWidth", "bottom", "getBottom", "setBottom", "measureTextWidth", "getMeasureTextWidth", "setMeasureTextWidth", "measuredContentWidth", "getMeasuredContentWidth", "setMeasuredContentWidth", "measuredExtractWidth", "getMeasuredExtractWidth", "setMeasuredExtractWidth", "measuredHeight", "getMeasuredHeight", "setMeasuredHeight", "measuredTextSize", "getMeasuredTextSize", "setMeasuredTextSize", "paddingEnd", "getPaddingEnd", "setPaddingEnd", "paddingStart", "getPaddingStart", "setPaddingStart", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "strokePaint", "getStrokePaint", "setStrokePaint", "getText", "()Ljava/lang/String;", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;)V", "getTextColor", ClickApiEntity.SET_TEXT_COLOR, "getTextSize", ClickApiEntity.SET_TEXT_SIZE, "textStrokeTextColor", "getTextStrokeTextColor", "setTextStrokeTextColor", "textStrokeWidth", "getTextStrokeWidth", "setTextStrokeWidth", "drawBackGround", "", "canvas", "Landroid/graphics/Canvas;", TypedValues.CycleType.S_WAVE_OFFSET, Fields.HEIGHT_FIELD, "drawText", "startY", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
class Element {
    private float backGroundStrokeWidth;
    private int backgroundColor;

    @NotNull
    private Paint.Style backgroundStyle;
    private float backgroundWidth;
    private int bottom;
    private float measureTextWidth;
    private float measuredContentWidth;
    private float measuredExtractWidth;
    private float measuredHeight;
    private float measuredTextSize;
    private float paddingEnd;
    private float paddingStart;

    @NotNull
    private Paint paint;

    @NotNull
    private Paint strokePaint;

    @NotNull
    private String text;
    private int textColor;
    private float textSize;
    private int textStrokeTextColor;
    private float textStrokeWidth;

    public Element() {
        this(null, 0, 0.0f, 0, null, 31, null);
    }

    public static /* synthetic */ void drawText$default(Element element, Canvas canvas, float f, float f2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawText");
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        element.drawText(canvas, f, f2);
    }

    public final void drawBackGround(@Nullable Canvas canvas, float offset, float height) {
        this.paint.setColor(this.backgroundColor);
        this.paint.setStyle(this.backgroundStyle);
        this.paint.setStrokeWidth(this.backGroundStrokeWidth);
        Rect rect = new Rect((int) offset, 0, (int) (offset + this.measuredContentWidth), (int) height);
        if (canvas == null) {
            return;
        }
        canvas.drawRect(rect, this.paint);
    }

    public final void drawText(@Nullable Canvas canvas, float offset, float startY) {
        this.paint.setColor(this.textColor);
        this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.paint.setStrokeWidth(this.textStrokeWidth);
        if (canvas == null) {
            return;
        }
        canvas.drawText(this.text, offset, startY + (((this.measuredHeight + this.paint.getTextSize()) - this.bottom) / 2), this.paint);
    }

    public final float getBackGroundStrokeWidth() {
        return this.backGroundStrokeWidth;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final Paint.Style getBackgroundStyle() {
        return this.backgroundStyle;
    }

    public final float getBackgroundWidth() {
        return this.backgroundWidth;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getMeasureTextWidth() {
        return this.measureTextWidth;
    }

    public final float getMeasuredContentWidth() {
        return this.measuredContentWidth;
    }

    public final float getMeasuredExtractWidth() {
        return this.measuredExtractWidth;
    }

    public final float getMeasuredHeight() {
        return this.measuredHeight;
    }

    public final float getMeasuredTextSize() {
        return this.measuredTextSize;
    }

    public final float getPaddingEnd() {
        return this.paddingEnd;
    }

    public final float getPaddingStart() {
        return this.paddingStart;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final Paint getStrokePaint() {
        return this.strokePaint;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    public final int getTextStrokeTextColor() {
        return this.textStrokeTextColor;
    }

    public final float getTextStrokeWidth() {
        return this.textStrokeWidth;
    }

    public final void setBackGroundStrokeWidth(float f) {
        this.backGroundStrokeWidth = f;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBackgroundStyle(@NotNull Paint.Style style) {
        Intrinsics.checkNotNullParameter(style, "<set-?>");
        this.backgroundStyle = style;
    }

    public final void setBackgroundWidth(float f) {
        this.backgroundWidth = f;
    }

    public final void setBottom(int i) {
        this.bottom = i;
    }

    public final void setMeasureTextWidth(float f) {
        this.measureTextWidth = f;
    }

    public final void setMeasuredContentWidth(float f) {
        this.measuredContentWidth = f;
    }

    public final void setMeasuredExtractWidth(float f) {
        this.measuredExtractWidth = f;
    }

    public final void setMeasuredHeight(float f) {
        this.measuredHeight = f;
    }

    public final void setMeasuredTextSize(float f) {
        this.measuredTextSize = f;
    }

    public final void setPaddingEnd(float f) {
        this.paddingEnd = f;
    }

    public final void setPaddingStart(float f) {
        this.paddingStart = f;
    }

    public final void setPaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.paint = paint;
    }

    public final void setStrokePaint(@NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<set-?>");
        this.strokePaint = paint;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final void setTextColor(int i) {
        this.textColor = i;
    }

    public final void setTextSize(float f) {
        this.textSize = f;
    }

    public final void setTextStrokeTextColor(int i) {
        this.textStrokeTextColor = i;
    }

    public final void setTextStrokeWidth(float f) {
        this.textStrokeWidth = f;
    }

    public Element(@NotNull String text, int i, float f, int i2, @NotNull Paint.Style backgroundStyle) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundStyle, "backgroundStyle");
        this.text = text;
        this.textColor = i;
        this.textSize = f;
        this.backgroundColor = i2;
        this.backgroundStyle = backgroundStyle;
        this.paint = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(860504120);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint = paint;
        this.paddingStart = 20.0f;
        this.paddingEnd = 20.0f;
        this.backGroundStrokeWidth = 10.0f;
        this.textStrokeWidth = 10.0f;
        this.paint.setTextSize(this.textSize);
        this.textStrokeWidth = this.paint.getStrokeWidth();
        this.paint.setAntiAlias(true);
    }

    public /* synthetic */ Element(String str, int i, float f, int i2, Paint.Style style, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? -256 : i2, (i3 & 16) != 0 ? Paint.Style.FILL_AND_STROKE : style);
    }
}
