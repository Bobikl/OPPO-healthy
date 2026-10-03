package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class r1h {
    public short[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16019c;

    public r1h() {
        this(true, 16);
    }

    public void a(short s) {
        short[] sArrE = this.a;
        int i = this.b;
        if (i == sArrE.length) {
            sArrE = e(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.b;
        this.b = i2 + 1;
        sArrE[i2] = s;
    }

    public void b() {
        this.b = 0;
    }

    public short[] c(int i) {
        if (i >= 0) {
            int i2 = this.b + i;
            if (i2 > this.a.length) {
                e(Math.max(Math.max(8, i2), (int) (this.b * 1.75f)));
            }
            return this.a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i);
    }

    public short d(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
        }
        short[] sArr = this.a;
        short s = sArr[i];
        int i3 = i2 - 1;
        this.b = i3;
        if (this.f16019c) {
            System.arraycopy(sArr, i + 1, sArr, i, i3 - i);
        } else {
            sArr[i] = sArr[i3];
        }
        return s;
    }

    public short[] e(int i) {
        short[] sArr = new short[i];
        System.arraycopy(this.a, 0, sArr, 0, Math.min(this.b, i));
        this.a = sArr;
        return sArr;
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.f16019c || !(obj instanceof r1h)) {
            return false;
        }
        r1h r1hVar = (r1h) obj;
        if (!r1hVar.f16019c || (i = this.b) != r1hVar.b) {
            return false;
        }
        short[] sArr = this.a;
        short[] sArr2 = r1hVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (sArr[i2] != sArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public short[] f() {
        int i = this.b;
        short[] sArr = new short[i];
        System.arraycopy(this.a, 0, sArr, 0, i);
        return sArr;
    }

    public int hashCode() {
        if (!this.f16019c) {
            return super.hashCode();
        }
        short[] sArr = this.a;
        int i = this.b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + sArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (this.b == 0) {
            return "[]";
        }
        short[] sArr = this.a;
        t0j t0jVar = new t0j(32);
        t0jVar.append('[');
        t0jVar.d(sArr[0]);
        for (int i = 1; i < this.b; i++) {
            t0jVar.n(", ");
            t0jVar.d(sArr[i]);
        }
        t0jVar.append(']');
        return t0jVar.toString();
    }

    public r1h(boolean z, int i) {
        this.f16019c = z;
        this.a = new short[i];
    }
}
