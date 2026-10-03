package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class gt7 {
    public float[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11890c;

    public gt7() {
        this(true, 16);
    }

    public void a(float f) {
        float[] fArrD = this.a;
        int i = this.b;
        if (i == fArrD.length) {
            fArrD = d(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.b;
        this.b = i2 + 1;
        fArrD[i2] = f;
    }

    public void b() {
        this.b = 0;
    }

    public float c(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
    }

    public float[] d(int i) {
        float[] fArr = new float[i];
        System.arraycopy(this.a, 0, fArr, 0, Math.min(this.b, i));
        this.a = fArr;
        return fArr;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.f11890c || !(obj instanceof gt7)) {
            return false;
        }
        gt7 gt7Var = (gt7) obj;
        if (!gt7Var.f11890c || (i = this.b) != gt7Var.b) {
            return false;
        }
        float[] fArr = this.a;
        float[] fArr2 = gt7Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] != fArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (!this.f11890c) {
            return super.hashCode();
        }
        float[] fArr = this.a;
        int i = this.b;
        int iB = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iB = (iB * 31) + rzc.b(fArr[i2]);
        }
        return iB;
    }

    public String toString() {
        if (this.b == 0) {
            return "[]";
        }
        float[] fArr = this.a;
        t0j t0jVar = new t0j(32);
        t0jVar.append('[');
        t0jVar.c(fArr[0]);
        for (int i = 1; i < this.b; i++) {
            t0jVar.n(", ");
            t0jVar.c(fArr[i]);
        }
        t0jVar.append(']');
        return t0jVar.toString();
    }

    public gt7(int i) {
        this(true, i);
    }

    public gt7(boolean z, int i) {
        this.f11890c = z;
        this.a = new float[i];
    }
}
