package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class deg {
    public float a;
    public float b;

    public deg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public boolean a(float f, float f2) {
        return this.a == f && this.b == f2;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public void d(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public deg() {
        this(1.0f, 1.0f);
    }
}
