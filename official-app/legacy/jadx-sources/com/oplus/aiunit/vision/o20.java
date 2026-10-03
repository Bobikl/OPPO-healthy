package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes11.dex */
public class o20 implements tb8 {
    public final RectF a = new RectF();
    public final Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Canvas f14740c;
    public lk3 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l1j f14741e;
    public bw7 f;
    public qq g;

    public o20() {
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeJoin(Paint.Join.MITER);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void a(qq qqVar) {
        if (this.f14740c != qqVar.c()) {
            throw new IllegalStateException("Supplied transform has different Canvas attached");
        }
        this.g = qqVar.f();
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void b(cjf.a aVar) {
        this.b.setStyle(Paint.Style.FILL);
        Canvas canvas = this.f14740c;
        float f = aVar.a;
        float f2 = aVar.b;
        canvas.drawRect(f, f2, f + aVar.f10128c, f2 + aVar.d, this.b);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void c(double d, double d2) {
        this.g.q((float) d, (float) d2);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void d(bw7 bw7Var) {
        this.f = bw7Var;
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b.setStyle(Paint.Style.STROKE);
        this.a.set(i, i2, i + i3, i2 + i4);
        this.f14740c.drawArc(this.a, i5, i6, false, this.b);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void f(mpf mpfVar) {
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void g(gyf gyfVar) {
        this.b.setStyle(Paint.Style.STROKE);
        RectF rectF = this.a;
        float f = gyfVar.a;
        float f2 = gyfVar.b;
        rectF.set(f, f2, gyfVar.f11943c + f, gyfVar.d + f2);
        this.f14740c.drawRoundRect(this.a, gyfVar.f11944e, gyfVar.f, this.b);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public lk3 getColor() {
        if (this.d == null) {
            this.d = new lk3(this.b.getColor());
        }
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.tb8
    public qq getTransform() {
        qq qqVarI = this.g.i();
        this.g = qqVarI;
        return qqVarI;
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void h(mpf.a aVar, Object obj) {
    }

    @Override // com.oplus.aiunit.vision.tb8
    public bw7 i() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void j(l1j l1jVar) {
        this.f14741e = l1jVar;
        this.b.setStrokeWidth(l1jVar.a());
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void k(char[] cArr, int i, int i2, int i3, int i4) {
        bw7 bw7Var = this.f;
        if (bw7Var != null) {
            this.b.setTypeface(bw7Var.g());
            this.b.setTextSize(this.f.e());
        }
        this.f14740c.drawText(cArr, i, i2, i3, i4, this.b);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void l(rwa rwaVar) {
        this.b.setStyle(Paint.Style.STROKE);
        this.f14740c.drawLine((float) rwaVar.a, (float) rwaVar.b, (float) rwaVar.f16377c, (float) rwaVar.d, this.b);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void m(double d, double d2) {
        this.g.j(d, d2);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void n(cjf.a aVar) {
        this.b.setStyle(Paint.Style.STROKE);
        Canvas canvas = this.f14740c;
        float f = aVar.a;
        float f2 = aVar.b;
        canvas.drawRect(f, f2, f + aVar.f10128c, f2 + aVar.d, this.b);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public l1j o() {
        if (this.f14741e == null) {
            this.f14741e = new cc1(this.b.getStrokeWidth(), 0, 0, this.b.getStrokeMiter());
        }
        return this.f14741e;
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void p(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b.setStyle(Paint.Style.FILL);
        this.a.set(i, i2, i + i3, i2 + i4);
        this.f14740c.drawArc(this.a, i5, i6, false, this.b);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void q(double d) {
        this.f14740c.rotate((float) Math.toDegrees(d));
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void r(double d, double d2, double d3) {
        this.f14740c.rotate((float) Math.toDegrees(d), (float) d2, (float) d3);
    }

    @Override // com.oplus.aiunit.vision.tb8
    public mpf s() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.tb8
    public void t(lk3 lk3Var) {
        this.d = lk3Var;
        this.b.setColor(lk3Var.b());
    }

    public void u(Canvas canvas) {
        this.f14740c = canvas;
        this.g = qq.b(canvas);
    }
}
