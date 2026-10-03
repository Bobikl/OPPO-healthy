package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class aca {
    public int[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9292c;

    public aca() {
        this(true, 16);
    }

    public void a(int i) {
        int[] iArrH = this.a;
        int i2 = this.b;
        if (i2 == iArrH.length) {
            iArrH = h(Math.max(8, (int) (i2 * 1.75f)));
        }
        int i3 = this.b;
        this.b = i3 + 1;
        iArrH[i3] = i;
    }

    public void b(int... iArr) {
        c(iArr, 0, iArr.length);
    }

    public void c(int[] iArr, int i, int i2) {
        int[] iArrH = this.a;
        int i3 = this.b + i2;
        if (i3 > iArrH.length) {
            iArrH = h(Math.max(Math.max(8, i3), (int) (this.b * 1.75f)));
        }
        System.arraycopy(iArr, i, iArrH, this.b, i2);
        this.b += i2;
    }

    public void d() {
        this.b = 0;
    }

    public int[] e(int i) {
        if (i >= 0) {
            int i2 = this.b + i;
            if (i2 > this.a.length) {
                h(Math.max(Math.max(8, i2), (int) (this.b * 1.75f)));
            }
            return this.a;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i);
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.f9292c || !(obj instanceof aca)) {
            return false;
        }
        aca acaVar = (aca) obj;
        if (!acaVar.f9292c || (i = this.b) != acaVar.b) {
            return false;
        }
        int[] iArr = this.a;
        int[] iArr2 = acaVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public int f(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
    }

    public int g(int i) {
        int i2 = this.b;
        if (i >= i2) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.b);
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        int i4 = i2 - 1;
        this.b = i4;
        if (this.f9292c) {
            System.arraycopy(iArr, i + 1, iArr, i, i4 - i);
        } else {
            iArr[i] = iArr[i4];
        }
        return i3;
    }

    public int[] h(int i) {
        int[] iArr = new int[i];
        System.arraycopy(this.a, 0, iArr, 0, Math.min(this.b, i));
        this.a = iArr;
        return iArr;
    }

    public int hashCode() {
        if (!this.f9292c) {
            return super.hashCode();
        }
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public String toString() {
        if (this.b == 0) {
            return "[]";
        }
        int[] iArr = this.a;
        t0j t0jVar = new t0j(32);
        t0jVar.append('[');
        t0jVar.d(iArr[0]);
        for (int i = 1; i < this.b; i++) {
            t0jVar.n(", ");
            t0jVar.d(iArr[i]);
        }
        t0jVar.append(']');
        return t0jVar.toString();
    }

    public aca(int i) {
        this(true, i);
    }

    public aca(boolean z, int i) {
        this.f9292c = z;
        this.a = new int[i];
    }
}
