package com.oplus.aiunit.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public class ra8 {
    public final float[] a;
    public final int[] b;

    public ra8(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public ra8 a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = b(fArr[i]);
        }
        return new ra8(fArr, iArr);
    }

    public final int b(float f) {
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
        return h38.c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    public int[] c() {
        return this.b;
    }

    public float[] d() {
        return this.a;
    }

    public int e() {
        return this.b.length;
    }

    public void f(ra8 ra8Var, ra8 ra8Var2, float f) {
        if (ra8Var.b.length == ra8Var2.b.length) {
            for (int i = 0; i < ra8Var.b.length; i++) {
                this.a[i] = l0c.i(ra8Var.a[i], ra8Var2.a[i], f);
                this.b[i] = h38.c(f, ra8Var.b[i], ra8Var2.b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + ra8Var.b.length + " vs " + ra8Var2.b.length + ")");
    }
}
