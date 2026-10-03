package com.heytap.health.step.detail.ui.stephistory2.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.internal.view.SupportMenu;
import com.heytap.health.step.R$array;
import com.heytap.health.step.R$color;
import com.heytap.store.base.widget.banner.config.BannerConfig;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes18.dex */
public class InstructionProgressBarView extends View {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6009j;
    public Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f6010l;
    public int[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String[] f6011n;
    public int o;

    public InstructionProgressBarView(Context context) {
        super(context);
        this.i = 2;
        this.f6009j = 20;
        this.k = new Path();
        this.f6010l = new Paint();
        this.m = new int[]{BannerConfig.INDICATOR_SELECTED_COLOR, -16711936, SupportMenu.CATEGORY_MASK};
        this.o = 1;
        f();
    }

    private float getTextDrawY() {
        Paint.FontMetrics fontMetrics = this.f6010l.getFontMetrics();
        float f = fontMetrics.bottom;
        return (f - fontMetrics.top) - Math.abs(f);
    }

    public final void a(Canvas canvas) {
        float fMin;
        float f;
        float fA = ejg.a(getContext(), 8.0f);
        float fA2 = ejg.a(getContext(), 12.0f);
        int length = this.m.length;
        int measuredWidth = getMeasuredWidth();
        int i = this.i;
        int i2 = (int) ((measuredWidth - ((length - 1) * i)) / length);
        float f2 = (this.o * (i + i2)) + (i2 * 0.5f);
        float f3 = measuredWidth / 2.0f;
        if (f2 > f3) {
            fMin = Math.min(getMeasuredWidth(), f2 + f3);
            f = fMin - fA2;
        } else {
            float fMax = Math.max(0.0f, f2 - (fA2 / 2.0f));
            fMin = fA2 + fMax;
            f = fMax;
        }
        this.f6010l.setColor(-16777216);
        this.f6010l.setStyle(Paint.Style.FILL);
        this.k.reset();
        this.k.moveTo(f, 0.0f);
        this.k.lineTo((f + fMin) / 2.0f, fA);
        this.k.lineTo(fMin, 0.0f);
        this.k.lineTo(f, 0.0f);
        canvas.drawPath(this.k, this.f6010l);
    }

    public final void b(Canvas canvas) {
        int length = this.m.length;
        int i = length - 1;
        int measuredWidth = (int) ((getMeasuredWidth() - (this.i * i)) / length);
        float measuredHeight = getMeasuredHeight() * 0.2157f;
        float measuredHeight2 = getMeasuredHeight() * 0.6078f;
        this.k.reset();
        this.f6010l.setStyle(Paint.Style.FILL);
        this.f6010l.setColor(-16711936);
        float fA = ejg.a(getContext(), 9.0f);
        float f = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 == 0) {
                Paint paint = this.f6010l;
                int[] iArr = this.m;
                paint.setColor(iArr[d(i2, iArr)]);
                this.k.reset();
                this.k.addRoundRect(new RectF(f, measuredHeight, measuredWidth + f, measuredHeight2), new float[]{fA, fA, 0.0f, 0.0f, 0.0f, 0.0f, fA, fA}, Path.Direction.CW);
                canvas.drawPath(this.k, this.f6010l);
            } else if (i2 == i) {
                Paint paint2 = this.f6010l;
                int[] iArr2 = this.m;
                paint2.setColor(iArr2[d(i2, iArr2)]);
                this.k.reset();
                this.k.addRoundRect(new RectF(f, measuredHeight, measuredWidth + f, measuredHeight2), new float[]{0.0f, 0.0f, fA, fA, fA, fA, 0.0f, 0.0f}, Path.Direction.CW);
                canvas.drawPath(this.k, this.f6010l);
            } else {
                Paint paint3 = this.f6010l;
                int[] iArr3 = this.m;
                paint3.setColor(iArr3[d(i2, iArr3)]);
                this.k.reset();
                this.k.addRoundRect(new RectF(f, measuredHeight, measuredWidth + f, measuredHeight2), new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
                canvas.drawPath(this.k, this.f6010l);
            }
            f += this.i + measuredWidth;
        }
    }

    public final void c(Canvas canvas) {
        int length = this.m.length;
        int measuredWidth = (int) ((getMeasuredWidth() - (this.i * (length - 1))) / length);
        float measuredHeight = getMeasuredHeight() * 0.6078f;
        for (int i = 0; i < this.m.length; i++) {
            g();
            String[] strArr = this.f6011n;
            canvas.drawText(strArr[e(i, strArr)], ((this.i + measuredWidth) * i) + (measuredWidth / 2.0f), getTextDrawY() + measuredHeight, this.f6010l);
        }
    }

    public final int d(int i, int[] iArr) {
        return Math.max(0, Math.min(i, iArr.length - 1));
    }

    public final int e(int i, String[] strArr) {
        return Math.max(0, Math.min(i, strArr.length - 1));
    }

    public final void f() {
        this.i = ejg.a(getContext(), this.i);
        this.f6010l.setAntiAlias(true);
        this.f6011n = getContext().getResources().getStringArray(R$array.step_card_evaluation_level);
        this.m = new int[]{getContext().getColor(R$color.step_EC3E3E), getContext().getColor(R$color.step_FF6738), getContext().getColor(R$color.step_FFC30E), getContext().getColor(R$color.step_29CD68), getContext().getColor(R$color.step_266BF5)};
    }

    public final void g() {
        this.f6010l.setTextAlign(Paint.Align.CENTER);
        this.f6010l.setTextSize(ejg.a(getContext(), 12.0f));
        this.f6010l.setStrokeWidth(3.0f);
        this.f6010l.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
        a(canvas);
        c(canvas);
    }

    public void setColorList(int[] iArr) {
        this.m = iArr;
    }

    public void setTargetPos(int i) {
        this.o = i;
    }

    public void setTextList(String[] strArr) {
        this.f6011n = strArr;
    }

    public InstructionProgressBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 2;
        this.f6009j = 20;
        this.k = new Path();
        this.f6010l = new Paint();
        this.m = new int[]{BannerConfig.INDICATOR_SELECTED_COLOR, -16711936, SupportMenu.CATEGORY_MASK};
        this.o = 1;
        f();
    }

    public InstructionProgressBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 2;
        this.f6009j = 20;
        this.k = new Path();
        this.f6010l = new Paint();
        this.m = new int[]{BannerConfig.INDICATOR_SELECTED_COLOR, -16711936, SupportMenu.CATEGORY_MASK};
        this.o = 1;
        f();
    }
}
