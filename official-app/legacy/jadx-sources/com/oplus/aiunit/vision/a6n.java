package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class a6n extends x6n {
    public static int a(u6n u6nVar) {
        return u6nVar.n();
    }

    public static int b(u6n u6nVar, int i) {
        u6nVar.q(1);
        d(u6nVar, i);
        return a(u6nVar);
    }

    public static int c(u6n u6nVar, int[] iArr) {
        u6nVar.h(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            u6nVar.e(iArr[length]);
        }
        return u6nVar.a();
    }

    public static void d(u6n u6nVar, int i) {
        u6nVar.r(0, i);
    }
}
