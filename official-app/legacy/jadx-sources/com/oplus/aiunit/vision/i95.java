package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.support.appcompat.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class i95 extends ReplacementSpan {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f12440j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextPaint f12441l;
    public TextPaint m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12442n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;

    public i95(Context context, String str, String str2, int i, int i2, int i3, int i4, Paint paint, boolean z) {
        this.f12440j = str;
        this.k = str2;
        this.f12442n = i;
        this.o = i2 < 0 ? 0 : i2;
        this.i = context;
        this.r = i3;
        this.s = i4;
        this.u = z;
        this.f12441l = new TextPaint(paint);
        f();
        e();
    }

    public final int a() {
        return ((int) this.f12441l.measureText(" ")) / 2;
    }

    public final int b() {
        return Math.abs(this.p - this.q) / 2;
    }

    public final String c(String str, int i, TextPaint textPaint) {
        return (TextUtils.isEmpty(str) || i < 0) ? "" : StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, i).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build().getText().toString();
    }

    public final int d() {
        if (TextUtils.isEmpty(this.k) || TextUtils.isEmpty(this.f12440j)) {
            return 0;
        }
        return Math.max(this.q, this.p);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = this.m.getFontMetricsInt();
        Paint.FontMetricsInt fontMetricsInt2 = this.f12441l.getFontMetricsInt();
        int i6 = fontMetricsInt.descent;
        int i7 = fontMetricsInt.ascent;
        int i8 = fontMetricsInt.leading;
        int i9 = i4 - ((((i6 - i7) + i8) + this.t) / 2);
        int iAbs = fontMetricsInt2.bottom + i9 + i8 + Math.abs(i7) + this.t;
        int iA = a();
        int iB = b();
        if (this.u) {
            iA = -iA;
        }
        float f2 = f - iA;
        if (this.p > this.q) {
            canvas.drawText(this.f12440j, f2, i9, this.f12441l);
            canvas.drawText(this.k, f2 + iB, iAbs, this.m);
        } else {
            canvas.drawText(this.f12440j, iB + f2, i9, this.f12441l);
            canvas.drawText(this.k, f2, iAbs, this.m);
        }
    }

    public final void e() {
        int i = this.q;
        int i2 = this.f12442n;
        if (i > i2) {
            String strC = c(this.k, i2, this.m);
            this.k = strC;
            this.q = (int) this.m.measureText(strC);
        }
        int i3 = this.p;
        int i4 = this.f12442n;
        if (i3 > i4) {
            String strC2 = c(this.f12440j, i4, this.f12441l);
            this.f12440j = strC2;
            this.p = (int) this.f12441l.measureText(strC2);
        }
    }

    public final void f() {
        float f = this.i.getResources().getConfiguration().fontScale;
        int dimensionPixelSize = this.i.getResources().getDimensionPixelSize(R$dimen.coui_btn_desc_text_size);
        int dimensionPixelSize2 = this.i.getResources().getDimensionPixelSize(R$dimen.coui_btn_desc_sub_text_size);
        int iG = (int) gg2.g(dimensionPixelSize, f, 2);
        int iG2 = (int) gg2.g(dimensionPixelSize2, f, 2);
        this.f12441l.setTextSize(iG);
        this.f12441l.setColor(this.s);
        TextPaint textPaint = new TextPaint(this.f12441l);
        this.m = textPaint;
        textPaint.setTextSize(iG2);
        this.m.setColor(this.s);
        this.q = (int) this.m.measureText(this.k);
        this.p = (int) this.f12441l.measureText(this.f12440j);
        this.t = this.i.getResources().getDimensionPixelSize(R$dimen.coui_btn_desc_top_margin);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        return d();
    }
}
