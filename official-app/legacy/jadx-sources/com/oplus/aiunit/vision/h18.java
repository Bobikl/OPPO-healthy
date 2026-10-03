package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes11.dex */
public class h18 extends rnb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[][] f11962c;
    public int d;

    public h18(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.a = j0b.e(bArr, 0);
        int iE = j0b.e(bArr, 4);
        this.b = iE;
        int i = this.a;
        int i2 = ((iE + 7) >>> 3) * i;
        if (i > 0) {
            int i3 = 8;
            if (i2 == bArr.length - 8) {
                int i4 = (iE + 31) >>> 5;
                this.d = i4;
                this.f11962c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, i4);
                int i5 = this.b;
                int i6 = i5 >> 5;
                int i7 = i5 & 31;
                for (int i8 = 0; i8 < this.a; i8++) {
                    int i9 = 0;
                    while (i9 < i6) {
                        this.f11962c[i8][i9] = j0b.e(bArr, i3);
                        i9++;
                        i3 += 4;
                    }
                    int i10 = 0;
                    while (i10 < i7) {
                        int[] iArr = this.f11962c[i8];
                        iArr[i6] = ((bArr[i3] & 255) << i10) ^ iArr[i6];
                        i10 += 8;
                        i3++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    public byte[] c() {
        int i = (this.b + 7) >>> 3;
        int i2 = this.a;
        int i3 = 8;
        byte[] bArr = new byte[(i * i2) + 8];
        j0b.a(i2, bArr, 0);
        j0b.a(this.b, bArr, 4);
        int i4 = this.b;
        int i5 = i4 >>> 5;
        int i6 = i4 & 31;
        for (int i7 = 0; i7 < this.a; i7++) {
            int i8 = 0;
            while (i8 < i5) {
                j0b.a(this.f11962c[i7][i8], bArr, i3);
                i8++;
                i3 += 4;
            }
            int i9 = 0;
            while (i9 < i6) {
                bArr[i3] = (byte) ((this.f11962c[i7][i5] >>> i9) & 255);
                i9 += 8;
                i3++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h18)) {
            return false;
        }
        h18 h18Var = (h18) obj;
        if (this.a != h18Var.a || this.b != h18Var.b || this.d != h18Var.d) {
            return false;
        }
        for (int i = 0; i < this.a; i++) {
            if (!cca.b(this.f11962c[i], h18Var.f11962c[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = (((this.a * 31) + this.b) * 31) + this.d;
        for (int i = 0; i < this.a; i++) {
            iHashCode = (iHashCode * 31) + this.f11962c[i].hashCode();
        }
        return iHashCode;
    }

    public String toString() {
        int i = this.b & 31;
        int i2 = i == 0 ? this.d : this.d - 1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < this.a; i3++) {
            stringBuffer.append(i3 + ": ");
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.f11962c[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(StringUtil.SPACE);
            }
            int i7 = this.f11962c[i3][this.d - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public h18(int i, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length == ((i + 31) >> 5)) {
            this.b = i;
            this.a = iArr.length;
            this.d = iArr2.length;
            int i2 = i & 31;
            int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
            for (int i4 = 0; i4 < this.a; i4++) {
                int[] iArr3 = iArr[i4];
                int i5 = this.d - 1;
                iArr3[i5] = iArr3[i5] & i3;
            }
            this.f11962c = iArr;
            return;
        }
        throw new ArithmeticException("Int array does not match given number of columns.");
    }

    public h18(h18 h18Var) {
        this.b = h18Var.a();
        this.a = h18Var.b();
        this.d = h18Var.d;
        this.f11962c = new int[h18Var.f11962c.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.f11962c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = cca.a(h18Var.f11962c[i]);
            i++;
        }
    }
}
