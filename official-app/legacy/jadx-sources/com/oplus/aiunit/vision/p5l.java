package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class p5l extends e6 {
    public static rb6.a c(rb6.a aVar, byte[] bArr, qoe qoeVar) {
        rb6.a[] aVarArrD;
        a86.a aVar2 = (a86.a) aVar.i();
        byte bByteValue = aVar2.n().t().byteValue();
        if (qoeVar == null || !(qoeVar instanceof q5l)) {
            aVarArrD = u0k.d(aVar, bByteValue);
            q5l q5lVar = new q5l();
            q5lVar.b(aVarArrD);
            aVar2.A(aVar, "bc_wtnaf", q5lVar);
        } else {
            aVarArrD = ((q5l) qoeVar).a();
        }
        rb6.a[] aVarArr = new rb6.a[aVarArrD.length];
        for (int i = 0; i < aVarArrD.length; i++) {
            aVarArr[i] = (rb6.a) aVarArrD[i].x();
        }
        rb6.a aVar3 = (rb6.a) aVar.i().t();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b = bArr[length];
            if (b != 0) {
                aVar3 = (rb6.a) aVar3.I(i2).a(b > 0 ? aVarArrD[b >>> 1] : aVarArr[(-b) >>> 1]);
                i2 = 0;
            }
        }
        return i2 > 0 ? aVar3.I(i2) : aVar3;
    }

    @Override // com.oplus.aiunit.vision.e6
    public rb6 b(rb6 rb6Var, BigInteger bigInteger) {
        if (!(rb6Var instanceof rb6.a)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        rb6.a aVar = (rb6.a) rb6Var;
        a86.a aVar2 = (a86.a) aVar.i();
        int iS = aVar2.s();
        byte bByteValue = aVar2.n().t().byteValue();
        byte bC = u0k.c(bByteValue);
        return d(aVar, u0k.j(bigInteger, iS, bByteValue, aVar2.F(), bC, (byte) 10), aVar2.w(aVar, "bc_wtnaf"), bByteValue, bC);
    }

    public final rb6.a d(rb6.a aVar, q7m q7mVar, qoe qoeVar, byte b, byte b2) {
        q7m[] q7mVarArr = b == 0 ? u0k.alpha0 : u0k.alpha1;
        return c(aVar, u0k.l(b2, q7mVar, (byte) 4, BigInteger.valueOf(16L), u0k.g(b2, 4), q7mVarArr), qoeVar);
    }
}
