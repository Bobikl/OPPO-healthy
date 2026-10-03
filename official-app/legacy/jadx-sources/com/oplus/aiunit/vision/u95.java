package com.oplus.aiunit.vision;

import com.garmin.fit.Fit;
import com.garmin.fit.FitRuntimeException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class u95 extends fa7 {
    public ga7 a;
    public r95 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17369c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short f17370e;

    public u95() {
        this.a = null;
        this.d = 2;
    }

    @Override // com.oplus.aiunit.vision.fa7
    public int a() {
        return this.f17369c;
    }

    public t95 b() {
        return new t95(this);
    }

    public short c() {
        Short shZ = j() ? this.a.z() : null;
        return shZ == null ? Fit.UINT8_INVALID.shortValue() : shZ.shortValue();
    }

    public String d() {
        if (j()) {
            return this.a.B(0);
        }
        return null;
    }

    public short e() {
        return this.f17370e;
    }

    public short f() {
        if (!j() || this.a.D() == null || this.a.D().equals(Fit.SINT8_INVALID)) {
            return (short) 0;
        }
        return this.a.D().byteValue();
    }

    public short g() {
        if (!j() || this.a.E() == null || this.a.E().equals(Fit.UINT8_INVALID)) {
            return (short) 1;
        }
        return this.a.E().shortValue();
    }

    public int h() {
        return this.d;
    }

    public String i() {
        if (j()) {
            return this.a.F(0);
        }
        return null;
    }

    public boolean j() {
        return (this.a == null || this.b == null) ? false : true;
    }

    public void k(r95 r95Var) {
        this.b = r95Var;
    }

    public void l(ga7 ga7Var) {
        this.a = ga7Var;
        this.f17370e = ga7Var.A().shortValue();
        this.d = this.a.C().shortValue();
    }

    public void m(short s) {
        this.f17370e = s;
    }

    public void n(int i) {
        this.f17369c = i;
    }

    public void o(OutputStream outputStream) {
        try {
            outputStream.write(this.a.A().shortValue());
            outputStream.write(this.f17369c);
            outputStream.write(this.a.z().shortValue());
        } catch (IOException e2) {
            throw new FitRuntimeException(e2);
        }
    }

    public u95(t95 t95Var) {
        this(t95Var.S());
        this.f17369c = t95Var.y();
    }

    public u95(u95 u95Var) {
        l(u95Var.a);
        this.b = u95Var.b;
        this.f17369c = u95Var.a();
    }
}
