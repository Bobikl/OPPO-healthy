package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public abstract class efc {
    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        afc.w(iArr, iArr2, iArr3);
        afc.v(iArr, 8, iArr2, 8, iArr3, 16);
        int iE = afc.e(iArr3, 8, iArr3, 16);
        int iC = iE + afc.c(iArr3, 24, iArr3, 16, afc.c(iArr3, 0, iArr3, 8, 0) + iE);
        int[] iArrF = afc.f();
        int[] iArrF2 = afc.f();
        boolean z = afc.j(iArr, 8, iArr, 0, iArrF, 0) != afc.j(iArr2, 8, iArr2, 0, iArrF2, 0);
        int[] iArrH = afc.h();
        afc.w(iArrF, iArrF2, iArrH);
        gfc.f(32, iC + (z ? gfc.d(16, iArrH, 0, iArr3, 8) : gfc.L(16, iArrH, 0, iArr3, 8)), iArr3, 24);
    }

    public static void b(int[] iArr, int[] iArr2) {
        afc.D(iArr, iArr2);
        afc.C(iArr, 8, iArr2, 16);
        int iE = afc.e(iArr2, 8, iArr2, 16);
        int iC = iE + afc.c(iArr2, 24, iArr2, 16, afc.c(iArr2, 0, iArr2, 8, 0) + iE);
        int[] iArrF = afc.f();
        afc.j(iArr, 8, iArr, 0, iArrF, 0);
        int[] iArrH = afc.h();
        afc.D(iArrF, iArrH);
        gfc.f(32, iC + gfc.L(16, iArrH, 0, iArr2, 8), iArr2, 24);
    }
}
