package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class m5n extends x6n {
    public static int a(u6n u6nVar) {
        return u6nVar.n();
    }

    public static int b(u6n u6nVar, byte b, int i) {
        u6nVar.q(2);
        e(u6nVar, i);
        d(u6nVar, b);
        return a(u6nVar);
    }

    public static int c(u6n u6nVar, byte[] bArr) {
        u6nVar.h(1, bArr.length, 1);
        for (int length = bArr.length - 1; length >= 0; length--) {
            u6nVar.d(bArr[length]);
        }
        return u6nVar.a();
    }

    public static void d(u6n u6nVar, byte b) {
        u6nVar.f(0, b);
    }

    public static void e(u6n u6nVar, int i) {
        u6nVar.r(1, i);
    }
}
