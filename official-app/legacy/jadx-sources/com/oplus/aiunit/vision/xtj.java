package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Texture;

/* JADX INFO: loaded from: classes13.dex */
public class xtj {
    public Texture a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18762c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18763e;
    public int f;
    public int g;

    public xtj() {
    }

    public void a(boolean z, boolean z2) {
        if (z) {
            float f = this.b;
            this.b = this.d;
            this.d = f;
        }
        if (z2) {
            float f2 = this.f18762c;
            this.f18762c = this.f18763e;
            this.f18763e = f2;
        }
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return Math.round(this.b * this.a.E());
    }

    public int e() {
        return Math.round(this.f18762c * this.a.B());
    }

    public Texture f() {
        return this.a;
    }

    public void g(float f, float f2, float f3, float f4) {
        int iE = this.a.E();
        int iB = this.a.B();
        float f5 = iE;
        this.f = Math.round(Math.abs(f3 - f) * f5);
        float f6 = iB;
        int iRound = Math.round(Math.abs(f4 - f2) * f6);
        this.g = iRound;
        if (this.f == 1 && iRound == 1) {
            float f7 = 0.25f / f5;
            f += f7;
            f3 -= f7;
            float f8 = 0.25f / f6;
            f2 += f8;
            f4 -= f8;
        }
        this.b = f;
        this.f18762c = f2;
        this.d = f3;
        this.f18763e = f4;
    }

    public void h(int i, int i2, int i3, int i4) {
        float fE = 1.0f / this.a.E();
        float fB = 1.0f / this.a.B();
        g(i * fE, i2 * fB, (i + i3) * fE, (i2 + i4) * fB);
        this.f = Math.abs(i3);
        this.g = Math.abs(i4);
    }

    public void i(xtj xtjVar) {
        this.a = xtjVar.a;
        g(xtjVar.b, xtjVar.f18762c, xtjVar.d, xtjVar.f18763e);
    }

    public void j(xtj xtjVar, int i, int i2, int i3, int i4) {
        this.a = xtjVar.a;
        h(xtjVar.d() + i, xtjVar.e() + i2, i3, i4);
    }

    public xtj(Texture texture) {
        if (texture == null) {
            throw new IllegalArgumentException("texture cannot be null.");
        }
        this.a = texture;
        h(0, 0, texture.E(), texture.B());
    }

    public xtj(Texture texture, int i, int i2, int i3, int i4) {
        this.a = texture;
        h(i, i2, i3, i4);
    }

    public xtj(xtj xtjVar, int i, int i2, int i3, int i4) {
        j(xtjVar, i, i2, i3, i4);
    }
}
