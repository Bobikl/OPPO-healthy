package com.oplus.aiunit.vision;

import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public abstract class c2c {
    public static int a(int i) {
        int i2 = 0;
        while ((i & 1) == 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static void b(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            gfc.a(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    public static int c(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int i3;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            gfc.B(i, iArr2, 0);
            i4 += 32;
        }
        int iA = a(i3);
        if (iA > 0) {
            gfc.z(i, iArr2, iA, 0);
            i4 += iA;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if ((iArr3[0] & 1) != 0) {
                i2 += i2 < 0 ? gfc.e(length, iArr, iArr3) : gfc.M(length, iArr, iArr3);
            }
            gfc.y(length, iArr3, i2);
        }
        return i2;
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (gfc.v(length, iArr2)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        int iC = 0;
        if (gfc.u(length, iArr2)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArrH = gfc.h(length, iArr2);
        int[] iArrI = gfc.i(length);
        iArrI[0] = 1;
        int iC2 = (1 & iArrH[0]) == 0 ? c(iArr, iArrH, length, iArrI, 0) : 0;
        if (gfc.u(length, iArrH)) {
            b(iArr, iC2, iArrI, iArr3);
            return;
        }
        int[] iArrH2 = gfc.h(length, iArr);
        int[] iArrI2 = gfc.i(length);
        int i = length;
        while (true) {
            int i2 = i - 1;
            if (iArrH[i2] == 0 && iArrH2[i2] == 0) {
                i--;
            } else if (gfc.p(i, iArrH, iArrH2)) {
                gfc.M(i, iArrH2, iArrH);
                iC2 = c(iArr, iArrH, i, iArrI, iC2 + (gfc.M(length, iArrI2, iArrI) - iC));
                if (gfc.u(i, iArrH)) {
                    b(iArr, iC2, iArrI, iArr3);
                    return;
                }
            } else {
                gfc.M(i, iArrH, iArrH2);
                iC = c(iArr, iArrH2, i, iArrI2, iC + (gfc.M(length, iArrI, iArrI2) - iC2));
                if (gfc.u(i, iArrH2)) {
                    b(iArr, iC, iArrI2, iArr3);
                    return;
                }
            }
        }
    }

    public static int[] e(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] iArrI = gfc.i(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                iArrI[i8] = random.nextInt();
            }
            iArrI[i] = iArrI[i] & i7;
        } while (gfc.p(length, iArrI, iArr));
        return iArrI;
    }
}
