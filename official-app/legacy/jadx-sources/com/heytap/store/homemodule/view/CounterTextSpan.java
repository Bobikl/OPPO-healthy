package com.heytap.store.homemodule.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.heytap.store.platform.tools.SizeUtils;
import com.lifesense.plugin.ble.data.other.DeviceTypeConstants;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JP\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u000208H\u0016J\u0006\u00109\u001a\u00020\u0012J2\u0010:\u001a\u00020\u00062\u0006\u00107\u001a\u0002082\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010<H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\u0012X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/heytap/store/homemodule/view/CounterTextSpan;", "Landroid/text/style/ReplacementSpan;", "()V", "countDownRadius", "", "countdown", "", "getCountdown", "()I", "setCountdown", "(I)V", "countdownColor", "getCountdownColor", "setCountdownColor", "countdownTextColorValue", "getCountdownTextColorValue", "setCountdownTextColorValue", "counterHouse", "", "getCounterHouse", "()Ljava/lang/String;", "setCounterHouse", "(Ljava/lang/String;)V", "counterMinis", "getCounterMinis", "setCounterMinis", "counterSecond", "getCounterSecond", "setCounterSecond", "days", "getDays", "setDays", "intervalSymbols", "getIntervalSymbols", "margin", "getMargin", "()F", "setMargin", "(F)V", "unitPadding", "getUnitPadding", "setUnitPadding", "widthSize", ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", TextEntity.ELLIPSIZE_END, "x", "top", "y", "bottom", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "getShowText", "getSize", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CounterTextSpan extends ReplacementSpan {
    private final float countDownRadius;
    private int days;
    private float margin;
    private float unitPadding;
    private int widthSize;
    private int countdown = 1000;
    private int countdownColor = Color.parseColor("#FFFFE9D4");
    private int countdownTextColorValue = Color.parseColor("#FFEA2810");

    @NotNull
    private String counterHouse = "00";

    @NotNull
    private String counterMinis = "02";

    @NotNull
    private String counterSecond = DeviceTypeConstants.KITCHEN_SCALE;

    @NotNull
    private final String intervalSymbols = ":";

    public CounterTextSpan() {
        SizeUtils sizeUtils = SizeUtils.INSTANCE;
        this.margin = sizeUtils.dp2px(2.0f);
        this.unitPadding = sizeUtils.dp2px(0.0f);
        this.countDownRadius = sizeUtils.dp2px(2.0f);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x, int top, int y, int bottom, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setFakeBoldText(true);
        int color = paint.getColor();
        paint.setColor(this.countdownTextColorValue);
        canvas.drawText(getShowText(), x + this.margin, y, paint);
        paint.setFakeBoldText(false);
        paint.setColor(color);
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
        if (this.days <= 0) {
            return this.counterHouse + this.intervalSymbols + this.counterMinis + this.intervalSymbols + this.counterSecond;
        }
        return this.days + (char) 22825 + this.counterHouse + this.intervalSymbols + this.counterMinis + this.intervalSymbols + this.counterSecond;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        int iMeasureText = (int) (((int) paint.measureText(getShowText())) + (this.margin * 2));
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
}
