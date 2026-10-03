package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes8.dex */
public class nuk {
    public float a;
    public float b;

    public nuk() {
        this(0.0f, 0.0f);
    }

    public final nuk a(nuk nukVar) {
        this.a += nukVar.a;
        this.b += nukVar.b;
        return this;
    }

    public final nuk b(float f) {
        this.a *= f;
        this.b *= f;
        return this;
    }

    public final nuk c() {
        this.a = -this.a;
        this.b = -this.b;
        return this;
    }

    public final nuk d(float f, float f2) {
        this.a = f;
        this.b = f2;
        return this;
    }

    public final nuk e(nuk nukVar) {
        this.a = nukVar.a;
        this.b = nukVar.b;
        return this;
    }

    public final void f() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public final nuk g(nuk nukVar) {
        this.a -= nukVar.a;
        this.b -= nukVar.b;
        return this;
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + ")";
    }

    public nuk(float f, float f2) {
        this.a = f;
        this.b = f2;
    }
}
