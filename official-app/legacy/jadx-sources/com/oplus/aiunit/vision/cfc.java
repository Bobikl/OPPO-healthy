package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class cfc {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        yec.v(iArr, iArr2, iArr3);
        yec.u(iArr, 6, iArr2, 6, iArr3, 12);
        int iD = yec.d(iArr3, 6, iArr3, 12);
        int iC = iD + yec.c(iArr3, 18, iArr3, 12, yec.c(iArr3, 0, iArr3, 6, 0) + iD);
        int[] iArrE = yec.e();
        int[] iArrE2 = yec.e();
        boolean z = yec.i(iArr, 6, iArr, 0, iArrE, 0) != yec.i(iArr2, 6, iArr2, 0, iArrE2, 0);
        int[] iArrG = yec.g();
        yec.v(iArrE, iArrE2, iArrG);
        gfc.f(24, iC + (z ? gfc.d(12, iArrG, 0, iArr3, 6) : gfc.L(12, iArrG, 0, iArr3, 6)), iArr3, 18);
    }

    public static void b(int[] iArr, int[] iArr2) {
        yec.B(iArr, iArr2);
        yec.A(iArr, 6, iArr2, 12);
        int iD = yec.d(iArr2, 6, iArr2, 12);
        int iC = iD + yec.c(iArr2, 18, iArr2, 12, yec.c(iArr2, 0, iArr2, 6, 0) + iD);
        int[] iArrE = yec.e();
        yec.i(iArr, 6, iArr, 0, iArrE, 0);
        int[] iArrG = yec.g();
        yec.B(iArrE, iArrG);
        gfc.f(24, iC + gfc.L(12, iArrG, 0, iArr2, 6), iArr2, 18);
    }
}
