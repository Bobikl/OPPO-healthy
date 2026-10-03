package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import com.support.appcompat.R$color;
import com.support.reddot.R$dimen;
import com.support.reddot.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class oi2 {
    public static final int CONSTANT_VALUE_0 = 0;
    public static final int CONSTANT_VALUE_10 = 10;
    public static final int CONSTANT_VALUE_100 = 100;
    public static final int CONSTANT_VALUE_1000 = 1000;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14946c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14947e;
    public int f;
    public int g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14948j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14949l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14950n;
    public int o;
    public TextPaint p;
    public Paint q;
    public Paint r;

    public oi2(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIHintRedDot_couiHintRedDotColor, 0);
        this.f14946c = typedArrayObtainStyledAttributes.getColor(R$styleable.COUIHintRedDot_couiHintRedDotTextColor, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiHintTextSize, 0);
        this.f14947e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiSmallWidth, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiMediumWidth, 0);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiLargeWidth, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiHeight, 0);
        this.f14948j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiCornerRadius, 0);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiDotDiameter, 0);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIHintRedDot_couiEllipsisDiameter, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f14949l = context.getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_rect_radius);
        this.h = context.getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_navi_small_width);
        this.f14950n = context.getResources().getDimensionPixelSize(R$dimen.coui_hint_red_dot_ellipsis_spacing);
        this.o = context.getResources().getDimensionPixelSize(R$dimen.coui_dot_stroke_width);
        this.b = ContextCompat.getColor(context, R$color.coui_color_white);
        TextPaint textPaint = new TextPaint();
        this.p = textPaint;
        textPaint.setAntiAlias(true);
        this.p.setColor(this.f14946c);
        this.p.setTextSize(this.d);
        this.p.setTypeface(Typeface.create("sans-serif-medium", 0));
        Paint paint = new Paint();
        this.q = paint;
        paint.setAntiAlias(true);
        this.q.setColor(this.a);
        this.q.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setAntiAlias(true);
        this.r.setColor(this.b);
        this.r.setStyle(Paint.Style.FILL);
    }

    public void A(int i) {
        this.i = i;
        s(i / 2);
    }

    public final void a(Canvas canvas, int i, int i2, RectF rectF, boolean z) {
        if (i <= 0) {
            return;
        }
        if (z) {
            this.p.setAlpha(Math.max(0, Math.min(255, i2)));
        }
        if (i < 1000) {
            String strValueOf = String.valueOf(i);
            Paint.FontMetricsInt fontMetricsInt = this.p.getFontMetricsInt();
            int iMeasureText = (int) this.p.measureText(strValueOf);
            float f = rectF.left;
            canvas.drawText(strValueOf, f + (((rectF.right - f) - iMeasureText) / 2.0f), (((rectF.top + rectF.bottom) - fontMetricsInt.ascent) - fontMetricsInt.descent) / 2.0f, this.p);
        } else {
            float f2 = (rectF.left + rectF.right) / 2.0f;
            float f3 = (rectF.top + rectF.bottom) / 2.0f;
            for (int i3 = -1; i3 <= 1; i3++) {
                int i4 = this.f14950n;
                int i5 = this.m;
                canvas.drawCircle(((i4 + i5) * i3) + f2, f3, i5 / 2.0f, this.p);
            }
        }
        this.p.setColor(this.f14946c);
    }

    public final void b(Canvas canvas, RectF rectF) {
        float f = rectF.bottom;
        float f2 = rectF.top;
        float f3 = (f - f2) / 2.0f;
        canvas.drawCircle(rectF.left + f3, f2 + f3, f3, this.q);
    }

    public final void c(Canvas canvas, RectF rectF) {
        float f = rectF.bottom;
        float f2 = rectF.top;
        float f3 = (f - f2) / 2.0f;
        canvas.drawCircle(rectF.left + f3, f2 + f3, f3 - this.o, this.q);
    }

    public void d(Canvas canvas, int i, int i2, int i3, int i4, RectF rectF) {
        canvas.drawPath(sk2.a().d(rectF, this.f14948j), this.q);
        if (i2 > i4) {
            a(canvas, i, i2, rectF, true);
            a(canvas, i3, i4, rectF, true);
        } else {
            a(canvas, i3, i4, rectF, true);
            a(canvas, i, i2, rectF, true);
        }
    }

    public final void e(Canvas canvas, Object obj, RectF rectF) {
        Path pathD;
        boolean z = obj instanceof String;
        if (z) {
            if (TextUtils.isEmpty((CharSequence) obj)) {
                return;
            }
        } else {
            if (!(obj instanceof Integer)) {
                throw new IllegalArgumentException("params 'number' must be String or Integer!");
            }
            if (((Integer) obj).intValue() <= 0) {
                return;
            }
        }
        if (Math.min(rectF.right - rectF.left, rectF.bottom - rectF.top) < this.f14948j * 2) {
            pathD = sk2.a().d(rectF, ((int) Math.min(rectF.right - rectF.left, rectF.bottom - rectF.top)) / 2);
        } else {
            pathD = sk2.a().d(rectF, this.f14948j);
        }
        canvas.drawPath(pathD, this.q);
        if (z) {
            h(canvas, (String) obj, rectF);
        } else {
            a(canvas, ((Integer) obj).intValue(), 255, rectF, false);
        }
    }

    public final void f(Canvas canvas, Object obj, RectF rectF) {
        boolean z = obj instanceof String;
        if (z) {
            if (TextUtils.isEmpty((CharSequence) obj)) {
                return;
            }
        } else {
            if (!(obj instanceof Integer)) {
                throw new IllegalArgumentException("params 'number' must be String or Integer!");
            }
            if (((Integer) obj).intValue() <= 0) {
                return;
            }
        }
        RectF rectF2 = new RectF();
        rectF2.left = 0.0f;
        float f = rectF.right;
        int i = this.o;
        float f2 = f - (i * 2);
        rectF2.right = f2;
        rectF2.top = 0.0f;
        float f3 = rectF.bottom - (i * 2);
        rectF2.bottom = f3;
        int iMin = ((int) Math.min(f2 - 0.0f, f3 - 0.0f)) / 2;
        canvas.drawPath(sk2.a().d(rectF, this.f14948j), this.r);
        canvas.save();
        int i2 = this.o;
        canvas.translate(i2, i2);
        canvas.drawPath(sk2.a().d(rectF2, iMin), this.q);
        canvas.restore();
        if (z) {
            h(canvas, (String) obj, rectF);
        } else {
            a(canvas, ((Integer) obj).intValue(), 255, rectF, false);
        }
    }

    public void g(Canvas canvas, int i, Object obj, RectF rectF) {
        if (i == 1) {
            b(canvas, rectF);
            return;
        }
        if (i == 2 || i == 3) {
            e(canvas, obj, rectF);
        } else if (i == 4) {
            c(canvas, rectF);
        } else {
            if (i != 5) {
                return;
            }
            f(canvas, obj, rectF);
        }
    }

    public final void h(Canvas canvas, String str, RectF rectF) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        float fMeasureText = this.p.measureText(str);
        if (fMeasureText < this.p.measureText(String.valueOf(1000))) {
            Paint.FontMetricsInt fontMetricsInt = this.p.getFontMetricsInt();
            float f = rectF.left;
            canvas.drawText(str, f + (((rectF.right - f) - fMeasureText) / 2.0f), (((rectF.top + rectF.bottom) - fontMetricsInt.ascent) - fontMetricsInt.descent) / 2.0f, this.p);
            return;
        }
        float f2 = (rectF.left + rectF.right) / 2.0f;
        float f3 = (rectF.top + rectF.bottom) / 2.0f;
        for (int i = -1; i <= 1; i++) {
            int i2 = this.f14950n;
            int i3 = this.m;
            canvas.drawCircle(((i2 + i3) * i) + f2, f3, i3 / 2.0f, this.p);
        }
    }

    public final int i() {
        return this.i;
    }

    public final int j(int i) {
        if (i < 10) {
            return Math.max(this.f14947e, this.i);
        }
        if (i >= 100 && i < 1000) {
            return Math.max(this.g, this.i);
        }
        return Math.max(this.f, this.i);
    }

    public final int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f14947e;
        }
        if (q(str)) {
            return j(Integer.parseInt(str));
        }
        float fMeasureText = (int) this.p.measureText(str);
        if (fMeasureText < this.p.measureText(String.valueOf(10))) {
            return Math.max(this.f14947e, this.i);
        }
        if (fMeasureText >= this.p.measureText(String.valueOf(100)) && fMeasureText < this.p.measureText(String.valueOf(1000))) {
            return Math.max(this.g, this.i);
        }
        return Math.max(this.f, this.i);
    }

    public final int l(int i) {
        if (i < 10) {
            return this.h;
        }
        return i < 100 ? this.f14947e : this.f;
    }

    public final int m(String str) {
        float fMeasureText = (int) this.p.measureText(str);
        if (fMeasureText < this.p.measureText(String.valueOf(10))) {
            return this.h;
        }
        if (fMeasureText >= this.p.measureText(String.valueOf(100)) && fMeasureText < this.p.measureText(String.valueOf(1000))) {
            return this.g;
        }
        return this.f;
    }

    public int n(int i) {
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return 0;
                    }
                }
            }
            return i();
        }
        return this.k;
    }

    public int o(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return l(i2);
                }
                if (i != 4) {
                    if (i != 5) {
                        return 0;
                    }
                }
            }
            return j(i2);
        }
        return this.k;
    }

    public int p(int i, String str) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m(str);
                }
                if (i != 4) {
                    if (i != 5) {
                        return 0;
                    }
                }
            }
            return k(str);
        }
        return this.k;
    }

    public final boolean q(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (Character.isDigit(str.charAt(length)));
        return false;
    }

    public void r(int i) {
        this.a = i;
        this.q.setColor(i);
    }

    public void s(int i) {
        this.f14948j = i;
    }

    public void t(int i) {
        this.k = i;
    }

    public void u(int i) {
        this.m = i;
    }

    public void v(int i) {
        this.g = i;
    }

    public void w(int i) {
        this.f = i;
    }

    public void x(int i) {
        this.f14947e = i;
    }

    public void y(int i) {
        this.f14946c = i;
        this.p.setColor(i);
    }

    public void z(int i) {
        this.d = i;
    }
}
