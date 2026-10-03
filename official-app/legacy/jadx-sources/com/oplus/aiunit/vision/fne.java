package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class fne {
    public static final char RANDOM_IRREDUCIBLE_POLYNOMIAL = 'I';
    public j18 a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f11438c;

    public fne(j18 j18Var, int i) {
        this.a = j18Var;
        this.b = i;
        int[] iArr = new int[i + 1];
        this.f11438c = iArr;
        iArr[i] = 1;
    }

    public static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    public static int i(int[] iArr) {
        int iC = c(iArr);
        if (iC == -1) {
            return 0;
        }
        return iArr[iC];
    }

    public static boolean j(int[] iArr, int[] iArr2) {
        int iC = c(iArr);
        if (iC != c(iArr2)) {
            return false;
        }
        for (int i = 0; i <= iC; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] p(int[] iArr, int i) {
        int iC = c(iArr);
        if (iC == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[iC + i + 1];
        System.arraycopy(iArr, 0, iArr2, i, iC + 1);
        return iArr2;
    }

    public static int[] q(int[] iArr) {
        int iC = c(iArr);
        if (iC == -1) {
            return new int[1];
        }
        int i = iC + 1;
        if (iArr.length == i) {
            return cca.a(iArr);
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public final int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    public void b(fne fneVar) {
        this.f11438c = a(this.f11438c, fneVar.f11438c);
        d();
    }

    public final void d() {
        this.b = this.f11438c.length - 1;
        while (true) {
            int i = this.b;
            if (i < 0 || this.f11438c[i] != 0) {
                return;
            } else {
                this.b = i - 1;
            }
        }
    }

    public int e(int i) {
        int[] iArr = this.f11438c;
        int i2 = this.b;
        int iH = iArr[i2];
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            iH = this.a.h(iH, i) ^ this.f11438c[i3];
        }
        return iH;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fne)) {
            fne fneVar = (fne) obj;
            if (this.a.equals(fneVar.a) && this.b == fneVar.b && j(this.f11438c, fneVar.f11438c)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i) {
        if (i < 0 || i > this.b) {
            return 0;
        }
        return this.f11438c[i];
    }

    public int g() {
        int[] iArr = this.f11438c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i = 8;
        int i2 = 1;
        while (this.a.d() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.f11438c.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.f11438c.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.f11438c[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int iHashCode = this.a.hashCode();
        int i = 0;
        while (true) {
            int[] iArr = this.f11438c;
            if (i >= iArr.length) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 31) + iArr[i];
            i++;
        }
    }

    public fne k(fne fneVar) {
        return new fne(this.a, l(this.f11438c, fneVar.f11438c));
    }

    public final int[] l(int[] iArr, int[] iArr2) {
        int iC = c(iArr2);
        if (iC == -1) {
            throw new ArithmeticException("Division by zero");
        }
        int length = iArr.length;
        int[] iArrA = new int[length];
        int iF = this.a.f(i(iArr2));
        System.arraycopy(iArr, 0, iArrA, 0, length);
        while (iC <= c(iArrA)) {
            iArrA = a(o(p(iArr2, c(iArrA) - iC), this.a.h(i(iArrA), iF)), iArrA);
        }
        return iArrA;
    }

    public void m(int i) {
        if (!this.a.g(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.f11438c = o(this.f11438c, i);
        d();
    }

    public fne n(int i) {
        if (!this.a.g(i)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        return new fne(this.a, o(this.f11438c, i));
    }

    public final int[] o(int[] iArr, int i) {
        int iC = c(iArr);
        if (iC == -1 || i == 0) {
            return new int[1];
        }
        if (i == 1) {
            return cca.a(iArr);
        }
        int[] iArr2 = new int[iC + 1];
        while (iC >= 0) {
            iArr2[iC] = this.a.h(iArr[iC], i);
            iC--;
        }
        return iArr2;
    }

    public String toString() {
        String str = " Polynomial over " + this.a.toString() + ": \n";
        for (int i = 0; i < this.f11438c.length; i++) {
            str = str + this.a.b(this.f11438c[i]) + "Y^" + i + "+";
        }
        return str + ";";
    }

    public fne(j18 j18Var, int[] iArr) {
        this.a = j18Var;
        this.f11438c = q(iArr);
        d();
    }

    public fne(j18 j18Var, byte[] bArr) {
        this.a = j18Var;
        int i = 8;
        int i2 = 1;
        while (j18Var.d() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 == 0) {
            this.f11438c = new int[bArr.length / i2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr = this.f11438c;
                if (i3 < iArr.length) {
                    int i5 = 0;
                    while (i5 < i) {
                        int[] iArr2 = this.f11438c;
                        iArr2[i3] = ((bArr[i4] & 255) << i5) ^ iArr2[i3];
                        i5 += 8;
                        i4++;
                    }
                    if (!this.a.g(this.f11438c[i3])) {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                    i3++;
                } else {
                    if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                        throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                    }
                    d();
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
    }

    public fne(fne fneVar) {
        this.a = fneVar.a;
        this.b = fneVar.b;
        this.f11438c = cca.a(fneVar.f11438c);
    }
}
