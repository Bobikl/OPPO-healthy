package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class cc1 implements l1j {
    public static final int CAP_BUTT = 0;
    public static final int JOIN_MITER = 0;
    public final float a;
    public final float b;

    public cc1(float f, int i, int i2) {
        this(f, i, i2, 10.0f);
    }

    @Override // com.oplus.aiunit.vision.l1j
    public float a() {
        return this.a;
    }

    public String toString() {
        return "BasicStroke{width=" + this.a + ", miterLimit=" + this.b + '}';
    }

    public cc1(float f, int i, int i2, float f2) {
        this.a = f;
        this.b = f2;
    }
}
