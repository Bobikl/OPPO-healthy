package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class c5l extends e6 {
    @Override // com.oplus.aiunit.vision.e6
    public rb6 b(rb6 rb6Var, BigInteger bigInteger) {
        rb6 rb6VarA;
        int iMax = Math.max(2, Math.min(16, c(bigInteger.bitLength())));
        d5l d5lVarJ = e5l.j(rb6Var, iMax, true);
        rb6[] rb6VarArrA = d5lVarJ.a();
        rb6[] rb6VarArrB = d5lVarJ.b();
        int[] iArrB = e5l.b(iMax, bigInteger);
        rb6 rb6VarT = rb6Var.i().t();
        int length = iArrB.length;
        if (length > 1) {
            length--;
            int i = iArrB[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int iAbs = Math.abs(i2);
            rb6[] rb6VarArr = i2 < 0 ? rb6VarArrB : rb6VarArrA;
            if ((iAbs << 2) < (1 << iMax)) {
                byte b = u8b.o[iAbs];
                int i4 = iMax - b;
                rb6VarA = rb6VarArr[((1 << (iMax - 1)) - 1) >>> 1].a(rb6VarArr[(((iAbs ^ (1 << (b - 1))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                rb6VarA = rb6VarArr[iAbs >>> 1];
            }
            rb6VarT = rb6VarA.F(i3);
        }
        while (length > 0) {
            length--;
            int i5 = iArrB[length];
            int i6 = i5 >> 16;
            rb6VarT = rb6VarT.H((i6 < 0 ? rb6VarArrB : rb6VarArrA)[Math.abs(i6) >>> 1]).F(i5 & 65535);
        }
        return rb6VarT;
    }

    public int c(int i) {
        return e5l.g(i);
    }
}
