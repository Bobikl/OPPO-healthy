package com.oplus.aiunit.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class sa8 {
    public final float[] a;
    public final int[] b;

    public sa8(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(sa8 sa8Var) {
        int i = 0;
        while (true) {
            int[] iArr = sa8Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = sa8Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public sa8 b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = c(fArr[i]);
        }
        return new sa8(fArr, iArr);
    }

    public final int c(float f) {
        int iBinarySearch = Arrays.binarySearch(this.a, f);
        if (iBinarySearch >= 0) {
            return this.b[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.b[0];
        }
        int[] iArr = this.b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return i38.c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    public int[] d() {
        return this.b;
    }

    public float[] e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        sa8 sa8Var = (sa8) obj;
        return Arrays.equals(this.a, sa8Var.a) && Arrays.equals(this.b, sa8Var.b);
    }

    public int f() {
        return this.b.length;
    }

    public void g(sa8 sa8Var, sa8 sa8Var2, float f) {
        int[] iArr;
        if (sa8Var.equals(sa8Var2)) {
            a(sa8Var);
            return;
        }
        if (f <= 0.0f) {
            a(sa8Var);
            return;
        }
        if (f >= 1.0f) {
            a(sa8Var2);
            return;
        }
        if (sa8Var.b.length != sa8Var2.b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + sa8Var.b.length + " vs " + sa8Var2.b.length + ")");
        }
        int i = 0;
        while (true) {
            iArr = sa8Var.b;
            if (i >= iArr.length) {
                break;
            }
            this.a[i] = m0c.i(sa8Var.a[i], sa8Var2.a[i], f);
            this.b[i] = i38.c(f, sa8Var.b[i], sa8Var2.b[i]);
            i++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = sa8Var.b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }
}
