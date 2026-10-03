package com.heytap.store.business.component.widget.integral;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.heytap.store.platform.tools.SizeUtils;
import com.lifesense.plugin.ble.data.other.DeviceTypeConstants;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JP\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u000209H\u0016J\u0006\u0010:\u001a\u00020\u0003J2\u0010;\u001a\u00020\n2\u0006\u00108\u001a\u0002092\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u0014\u0010!\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0006R\u001a\u0010#\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/heytap/store/business/component/widget/integral/IntegralCounterTextSpan;", "Landroid/text/style/ReplacementSpan;", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "countDownRadius", "", "countdown", "", "getCountdown", "()I", "setCountdown", "(I)V", "countdownColor", "getCountdownColor", "setCountdownColor", "countdownTextColorValue", "getCountdownTextColorValue", "setCountdownTextColorValue", "counterHouse", "getCounterHouse", "setCounterHouse", "counterMinis", "getCounterMinis", "setCounterMinis", "counterSecond", "getCounterSecond", "setCounterSecond", "days", "getDays", "setDays", "intervalSymbols", "getIntervalSymbols", "margin", "getMargin", "()F", "setMargin", "(F)V", "unitPadding", "getUnitPadding", "setUnitPadding", "widthSize", ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", TextEntity.ELLIPSIZE_END, "x", "top", "y", "bottom", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "getShowText", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IntegralCounterTextSpan extends ReplacementSpan {

    @NotNull
    private final String content;
    private final float countDownRadius;
    private int countdown;
    private int countdownColor;
    private int countdownTextColorValue;

    @NotNull
    private String counterHouse;

    @NotNull
    private String counterMinis;

    @NotNull
    private String counterSecond;
    private int days;

    @NotNull
    private final String intervalSymbols;
    private float margin;
    private float unitPadding;
    private int widthSize;

    /* JADX WARN: Multi-variable type inference failed */
    public IntegralCounterTextSpan() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setFakeBoldText(true);
        int color = paint.getColor();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setColor(this.countdownTextColorValue);
        canvas.drawText(getShowText(), x + this.margin, y, paint);
        paint.setFakeBoldText(false);
        paint.setColor(color);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final int getCountdown() {
        return this.countdown;
    }

    public final int getCountdownColor() {
        return this.countdownColor;
    }

    public final int getCountdownTextColorValue() {
        return this.countdownTextColorValue;
    }

    @NotNull
    public final String getCounterHouse() {
        return this.counterHouse;
    }

    @NotNull
    public final String getCounterMinis() {
        return this.counterMinis;
    }

    @NotNull
    public final String getCounterSecond() {
        return this.counterSecond;
    }

    public final int getDays() {
        return this.days;
    }

    @NotNull
    public final String getIntervalSymbols() {
        return this.intervalSymbols;
    }

    public final float getMargin() {
        return this.margin;
    }

    @NotNull
    public final String getShowText() {
        String str = this.content;
        if (!(str == null || str.length() == 0)) {
            return this.content;
        }
        if (this.days <= 0) {
            return this.counterHouse + this.intervalSymbols + this.counterMinis + this.intervalSymbols + this.counterSecond;
        }
        return this.days + (char) 22825 + this.counterHouse + this.intervalSymbols + this.counterMinis + this.intervalSymbols + this.counterSecond;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        int iMeasureText = ((int) (((int) paint.measureText(getShowText())) + (this.margin * 2))) + 2;
        this.widthSize = iMeasureText;
        return iMeasureText;
    }

    public final float getUnitPadding() {
        return this.unitPadding;
    }

    public final void setCountdown(int i) {
        this.countdown = i;
    }

    public final void setCountdownColor(int i) {
        this.countdownColor = i;
    }

    public final void setCountdownTextColorValue(int i) {
        this.countdownTextColorValue = i;
    }

    public final void setCounterHouse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.counterHouse = str;
    }

    public final void setCounterMinis(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.counterMinis = str;
    }

    public final void setCounterSecond(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.counterSecond = str;
    }

    public final void setDays(int i) {
        this.days = i;
    }

    public final void setMargin(float f) {
        this.margin = f;
    }

    public final void setUnitPadding(float f) {
        this.unitPadding = f;
    }

    public IntegralCounterTextSpan(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.countdown = 1000;
        this.countdownColor = Color.parseColor("#FFFFE9D4");
        this.countdownTextColorValue = Color.parseColor("#F8600B");
        this.counterHouse = "00";
        this.counterMinis = "02";
        this.counterSecond = DeviceTypeConstants.KITCHEN_SCALE;
        this.intervalSymbols = ":";
        SizeUtils sizeUtils = SizeUtils.INSTANCE;
        this.margin = sizeUtils.dp2px(2.0f);
        this.unitPadding = sizeUtils.dp2px(0.0f);
        this.countDownRadius = sizeUtils.dp2px(2.0f);
    }

    public /* synthetic */ IntegralCounterTextSpan(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
