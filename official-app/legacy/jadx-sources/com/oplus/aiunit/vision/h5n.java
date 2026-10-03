package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class h5n extends x6n {
    public static int a(u6n u6nVar) {
        return u6nVar.n();
    }

    public static int b(u6n u6nVar, int i, int i2, int i3) {
        u6nVar.q(3);
        h(u6nVar, i3);
        g(u6nVar, i2);
        e(u6nVar, i);
        return a(u6nVar);
    }

    public static int c(u6n u6nVar, byte[] bArr) {
        u6nVar.h(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            u6nVar.d(bArr[length]);
        }
        return u6nVar.a();
    }

    public static int d(u6n u6nVar, int[] iArr) {
        u6nVar.h(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            u6nVar.e(iArr[length]);
        }
        return u6nVar.a();
    }

    public static void e(u6n u6nVar, int i) {
        u6nVar.r(0, i);
    }

    public static int f(u6n u6nVar, byte[] bArr) {
        u6nVar.h(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            u6nVar.d(bArr[length]);
        }
        return u6nVar.a();
    }

    public static void g(u6n u6nVar, int i) {
        u6nVar.r(1, i);
    }

    public static void h(u6n u6nVar, int i) {
        u6nVar.r(2, i);
    }
}
