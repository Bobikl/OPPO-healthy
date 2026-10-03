package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.text.TextUtils;
import androidx.core.graphics.ColorKt;

/* JADX INFO: loaded from: classes2.dex */
public class fxa {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11552e;
    public Context f;
    public float g;
    public float h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f11553j;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean u;
    public float v;
    public float w;
    public final int a = 2;
    public final float b = 10.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11551c = 2.0f;
    public int d = 50;
    public Paint k = new Paint(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Paint f11554l = new Paint(1);
    public Paint m = new Paint();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Paint f11555n = new Paint(1);
    public float s = 10.0f;
    public boolean t = true;
    public float x = 20.0f;
    public Path y = new Path();

    public fxa(Context context) {
        this.f = context;
        this.f11552e = ejg.a(context, 2.0f);
    }

    public void a(Canvas canvas) {
        c(canvas);
        b(canvas);
        e(canvas);
        d(canvas);
    }

    public final void b(Canvas canvas) {
        if (this.t) {
            this.y.rewind();
            this.y.moveTo(this.q, this.r);
            this.y.lineTo(this.q, this.o + this.d);
            this.y.lineTo(this.q + this.p, this.o + this.d);
            this.y.lineTo(this.q + this.p, this.f11553j);
            canvas.drawPath(this.y, this.m);
        }
    }

    public final void c(Canvas canvas) {
        if (this.t) {
            float f = this.f11553j;
            float f2 = this.w;
            canvas.drawLine(f2, this.r, this.p + f2, f, this.k);
        }
    }

    public final void d(Canvas canvas) {
        if (!this.u || TextUtils.isEmpty(this.i)) {
            return;
        }
        this.f11554l.setAlpha((int) (this.v * 255.0f));
        canvas.drawText(this.i, this.w, this.r - this.x, this.f11554l);
    }

    public final void e(Canvas canvas) {
        canvas.drawCircle(this.q, this.r, this.s, this.f11555n);
    }

    public final void f() {
        this.m.setShader(new LinearGradient(0.0f, 0.0f, this.p, this.o, ColorKt.toColorInt("#3300BFFF"), ColorKt.toColorInt("#33434352"), Shader.TileMode.CLAMP));
        this.f11554l.setTextSize(ejg.a(this.f, 10.0f));
        this.f11554l.setColor(-1);
        this.f11554l.setTextAlign(Paint.Align.CENTER);
        this.k.setPathEffect(null);
        this.k.setStyle(Paint.Style.FILL);
        this.k.setColor(ColorKt.toColorInt("#4c00C9F4"));
        this.k.setStrokeWidth(2.0f);
        this.k.setAntiAlias(true);
        this.f11555n.setColor(ColorKt.toColorInt("#ff00C9F4"));
        this.f11555n.setStrokeWidth(2.0f);
    }

    public void g(float f, float f2) {
        this.o = (f2 - this.f11552e) - this.d;
        this.p = f;
        f();
    }

    public void h(int i, float f) {
        float f2 = this.g;
        if (f > f2) {
            f = (int) f2;
        }
        float f3 = this.h;
        if (f < f3) {
            f = (int) f3;
        }
        float f4 = i * this.p;
        this.w = f4;
        this.q = f4;
        this.r = ((1.0f - (f / (f2 - f3))) * this.o) + this.d;
    }

    public void i(boolean z) {
        this.t = z;
    }

    public void j(String str) {
        this.i = str;
    }

    public void k(float f) {
        this.v = f;
    }

    public void l(int i) {
        this.g = i;
    }

    public void m(int i) {
        this.h = i;
    }

    public void n(float f) {
        float f2 = this.g;
        if (f > f2) {
            f = (int) f2;
        }
        float f3 = this.h;
        if (f < f3) {
            f = (int) f3;
        }
        this.f11553j = ((1.0f - (f / (f2 - f3))) * this.o) + this.d;
    }

    public void o(float f) {
        if (f != 0.0f) {
            this.s = f;
        }
    }

    public void p(boolean z) {
        this.u = z;
    }
}
