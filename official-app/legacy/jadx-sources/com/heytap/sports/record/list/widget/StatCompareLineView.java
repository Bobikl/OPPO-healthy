package com.heytap.sports.record.list.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$styleable;
import com.oplus.aiunit.vision.lo9;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001!B\u0011\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b=\u0010>B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b=\u0010?B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010@\u001a\u00020\u0006¢\u0006\u0004\b=\u0010AJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0015J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006J\u0010\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\u0010\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002J\u0012\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010(R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006B"}, d2 = {"Lcom/heytap/sports/record/list/widget/StatCompareLineView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "xTextColor", "setXTextColor", "", "xTextSize", "setXTextSize", "yTextColor", "setYTextColor", "yTextSize", "setYTextSize", "dataLineWidth", "setDataLineWidth", "dataLineColor", "setDataLineColor", "fillTop", "setFillTop", "fillBottom", "setFillBottom", "Lcom/heytap/sports/record/list/widget/StatCompareLineView$a;", "valueTextFormat", "setValueTextFormat", "xAxisTextFormat", "setXAxisTextFormat", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "a", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "b", "i", "I", "j", UserInfo.SEX_FEMALE, MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "n", "o", LogFieldKey.PROCESS_NAME_KEY, "q", "startValue", "r", "endValue", "s", "Landroid/graphics/Paint;", "t", "yTextPaint", "u", "xTextPaint", "Landroid/graphics/Path;", "v", "Landroid/graphics/Path;", "linePath", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class StatCompareLineView extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int xTextColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float xTextSize;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int yTextColor;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float yTextSize;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float dataLineWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int dataLineColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int fillTop;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int fillBottom;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float startValue;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float endValue;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public Paint paint;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public Paint yTextPaint;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public Paint xTextPaint;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public Path linePath;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/heytap/sports/record/list/widget/StatCompareLineView$a;", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatCompareLineView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, null);
    }

    public final void a(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.sports_StatCompareLine);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…e.sports_StatCompareLine)");
        float f = 12;
        this.xTextSize = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_StatCompareLine_sports_xTextSize, (context.getResources().getDisplayMetrics().scaledDensity * f) + 0.5f);
        this.xTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.sports_StatCompareLine_sports_xTextColor, -16777216);
        this.yTextSize = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_StatCompareLine_sports_yTextSize, (context.getResources().getDisplayMetrics().scaledDensity * f) + 0.5f);
        this.yTextColor = typedArrayObtainStyledAttributes.getColor(R$styleable.sports_StatCompareLine_sports_yTextColor, -16777216);
        this.dataLineWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.sports_StatCompareLine_sports_dataLineWidth, (f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        this.dataLineColor = typedArrayObtainStyledAttributes.getColor(R$styleable.sports_StatCompareLine_sports_dataLineColor, -16777216);
        this.fillTop = typedArrayObtainStyledAttributes.getColor(R$styleable.sports_StatCompareLine_sports_fillTop, 16777215);
        this.fillBottom = typedArrayObtainStyledAttributes.getColor(R$styleable.sports_StatCompareLine_sports_fillBottom, 16777215);
        typedArrayObtainStyledAttributes.recycle();
        this.linePath = new Path();
        Paint paint = new Paint();
        this.paint = paint;
        Intrinsics.checkNotNull(paint);
        paint.setAntiAlias(true);
        Paint paint2 = this.paint;
        Intrinsics.checkNotNull(paint2);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.yTextPaint = paint3;
        Intrinsics.checkNotNull(paint3);
        paint3.setAntiAlias(true);
        Paint paint4 = this.yTextPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.xTextPaint = paint5;
        Intrinsics.checkNotNull(paint5);
        paint5.setAntiAlias(true);
        Paint paint6 = this.xTextPaint;
        Intrinsics.checkNotNull(paint6);
        paint6.setStyle(Paint.Style.FILL);
    }

    public final float b(Paint paint) {
        Rect rect = new Rect();
        Intrinsics.checkNotNull(paint);
        paint.getTextBounds("Hey", 0, 3, rect);
        return rect.height();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Paint paint = this.yTextPaint;
        Intrinsics.checkNotNull(paint);
        paint.setTextSize(this.yTextSize);
        Paint paint2 = this.yTextPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setColor(this.yTextColor);
        Paint paint3 = this.xTextPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setTextSize(this.xTextSize);
        Paint paint4 = this.xTextPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(this.xTextColor);
        float fB = b(this.xTextPaint);
        float fB2 = b(this.yTextPaint);
        float f = fB * 1.5f;
        float height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) - f) - (1.5f * fB2);
        float f2 = this.startValue;
        StringBuilder sb = new StringBuilder();
        sb.append(f2);
        String string = sb.toString();
        float f3 = this.endValue;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f3);
        String string2 = sb2.toString();
        Paint paint5 = this.yTextPaint;
        Intrinsics.checkNotNull(paint5);
        float fMeasureText = paint5.measureText(string);
        Paint paint6 = this.yTextPaint;
        Intrinsics.checkNotNull(paint6);
        float fMeasureText2 = paint6.measureText(string2);
        Paint paint7 = this.yTextPaint;
        Intrinsics.checkNotNull(paint7);
        paint7.setTextAlign(Paint.Align.LEFT);
        Intrinsics.checkNotNull(string);
        float paddingStart = getPaddingStart();
        float height2 = (getHeight() - getPaddingBottom()) - f;
        float f4 = this.startValue;
        float f5 = fB2 * 0.3f;
        float fMax = (height2 - ((f4 / Math.max(f4, this.endValue)) * height)) - f5;
        Paint paint8 = this.yTextPaint;
        Intrinsics.checkNotNull(paint8);
        canvas.drawText(string, paddingStart, fMax, paint8);
        Intrinsics.checkNotNull(string2);
        float width = (getWidth() - getPaddingEnd()) - fMeasureText2;
        float height3 = (getHeight() - getPaddingBottom()) - f;
        float f6 = this.endValue;
        float fMax2 = (height3 - ((f6 / Math.max(this.startValue, f6)) * height)) - f5;
        Paint paint9 = this.yTextPaint;
        Intrinsics.checkNotNull(paint9);
        canvas.drawText(string2, width, fMax2, paint9);
        Paint paint10 = this.xTextPaint;
        Intrinsics.checkNotNull(paint10);
        paint10.setTextAlign(Paint.Align.CENTER);
        Intrinsics.checkNotNull("0");
        float f7 = 2;
        float f8 = fMeasureText / f7;
        float paddingStart2 = getPaddingStart() + f8;
        float f9 = fB * 0.25f;
        float height4 = (getHeight() - getPaddingBottom()) - f9;
        Paint paint11 = this.xTextPaint;
        Intrinsics.checkNotNull(paint11);
        canvas.drawText("0", paddingStart2, height4, paint11);
        Intrinsics.checkNotNull("1");
        float f10 = fMeasureText2 / f7;
        float width2 = (getWidth() - getPaddingEnd()) - f10;
        float height5 = (getHeight() - getPaddingBottom()) - f9;
        Paint paint12 = this.xTextPaint;
        Intrinsics.checkNotNull(paint12);
        canvas.drawText("1", width2, height5, paint12);
        Paint paint13 = this.paint;
        Intrinsics.checkNotNull(paint13);
        paint13.setShader(null);
        Paint paint14 = this.paint;
        Intrinsics.checkNotNull(paint14);
        paint14.setColor(this.dataLineColor);
        Paint paint15 = this.paint;
        Intrinsics.checkNotNull(paint15);
        paint15.setStrokeWidth(this.dataLineWidth);
        Paint paint16 = this.paint;
        Intrinsics.checkNotNull(paint16);
        paint16.setStyle(Paint.Style.STROKE);
        float paddingStart3 = getPaddingStart() + f8;
        float height6 = (getHeight() - getPaddingBottom()) - f;
        float f11 = this.startValue;
        float fMax3 = height6 - ((f11 / Math.max(f11, this.endValue)) * height);
        float width3 = (getWidth() - getPaddingEnd()) - f10;
        float height7 = (getHeight() - getPaddingBottom()) - f;
        float f12 = this.endValue;
        float fMax4 = height7 - ((f12 / Math.max(this.startValue, f12)) * height);
        Paint paint17 = this.paint;
        Intrinsics.checkNotNull(paint17);
        canvas.drawLine(paddingStart3, fMax3, width3, fMax4, paint17);
        Path path = this.linePath;
        Intrinsics.checkNotNull(path);
        path.reset();
        Paint paint18 = this.paint;
        Intrinsics.checkNotNull(paint18);
        paint18.setStrokeWidth(this.dataLineWidth);
        Paint paint19 = this.paint;
        Intrinsics.checkNotNull(paint19);
        paint19.setStyle(Paint.Style.FILL);
        Path path2 = this.linePath;
        Intrinsics.checkNotNull(path2);
        float paddingStart4 = getPaddingStart() + f8;
        float height8 = (getHeight() - getPaddingBottom()) - f;
        float f13 = this.startValue;
        path2.moveTo(paddingStart4, height8 - ((f13 / Math.max(f13, this.endValue)) * height));
        Path path3 = this.linePath;
        Intrinsics.checkNotNull(path3);
        float width4 = (getWidth() - getPaddingEnd()) - f10;
        float height9 = (getHeight() - getPaddingBottom()) - f;
        float f14 = this.endValue;
        path3.lineTo(width4, height9 - ((f14 / Math.max(this.startValue, f14)) * height));
        Path path4 = this.linePath;
        Intrinsics.checkNotNull(path4);
        path4.lineTo((getWidth() - getPaddingEnd()) - f10, (getHeight() - getPaddingBottom()) - f);
        Path path5 = this.linePath;
        Intrinsics.checkNotNull(path5);
        path5.lineTo(getPaddingStart() + f8, (getHeight() - getPaddingBottom()) - f);
        Path path6 = this.linePath;
        Intrinsics.checkNotNull(path6);
        path6.close();
        Paint paint20 = this.paint;
        Intrinsics.checkNotNull(paint20);
        paint20.setShader(new LinearGradient(getWidth() / 2.0f, (getHeight() - height) / f7, getWidth() / 2.0f, (getHeight() + height) / f7, this.fillTop, this.fillBottom, Shader.TileMode.MIRROR));
        Path path7 = this.linePath;
        Intrinsics.checkNotNull(path7);
        Paint paint21 = this.paint;
        Intrinsics.checkNotNull(paint21);
        canvas.drawPath(path7, paint21);
    }

    public final void setDataLineColor(int dataLineColor) {
        this.dataLineColor = dataLineColor;
    }

    public final void setDataLineWidth(float dataLineWidth) {
        this.dataLineWidth = dataLineWidth;
    }

    public final void setFillBottom(int fillBottom) {
        this.fillBottom = fillBottom;
    }

    public final void setFillTop(int fillTop) {
        this.fillTop = fillTop;
    }

    public final void setValueTextFormat(@Nullable a valueTextFormat) {
    }

    public final void setXAxisTextFormat(@Nullable a xAxisTextFormat) {
    }

    public final void setXTextColor(int xTextColor) {
        this.xTextColor = xTextColor;
    }

    public final void setXTextSize(float xTextSize) {
        this.xTextSize = xTextSize;
    }

    public final void setYTextColor(int yTextColor) {
        this.yTextColor = yTextColor;
    }

    public final void setYTextSize(float yTextSize) {
        this.yTextSize = yTextSize;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatCompareLineView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatCompareLineView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        a(context, attributeSet);
    }
}
