package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.util.Random;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bp4 {
    public static rb6 a(a86 a86Var, byte[] bArr) {
        h86 h86VarJ;
        h86 h86VarM = a86Var.m(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        h86 h86VarM2 = a86Var.m(new BigInteger(1, bArr));
        if (!d(h86VarM2).equals(a86Var.n())) {
            h86VarM2 = h86VarM2.b();
        }
        if (h86VarM2.i()) {
            h86VarJ = a86Var.o().n();
        } else {
            h86 h86VarC = c(a86Var, h86VarM2.o().g().j(a86Var.o()).a(a86Var.n()).a(h86VarM2));
            if (h86VarC != null) {
                if (!d(h86VarC).equals(h86VarM)) {
                    h86VarC = h86VarC.b();
                }
                h86VarJ = h86VarM2.j(h86VarC);
            } else {
                h86VarJ = null;
            }
        }
        if (h86VarJ != null) {
            return a86Var.C(h86VarM2.t(), h86VarJ.t());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static byte[] b(rb6 rb6Var) {
        rb6 rb6VarY = rb6Var.y();
        h86 h86VarF = rb6VarY.f();
        byte[] bArrE = h86VarF.e();
        if (!h86VarF.i()) {
            if (d(rb6VarY.g().d(h86VarF)).h()) {
                int length = bArrE.length - 1;
                bArrE[length] = (byte) (bArrE[length] | 1);
            } else {
                int length2 = bArrE.length - 1;
                bArrE[length2] = (byte) (bArrE[length2] & 254);
            }
        }
        return bArrE;
    }

    public static h86 c(a86 a86Var, h86 h86Var) {
        h86 h86VarA;
        if (h86Var.i()) {
            return h86Var;
        }
        h86 h86VarM = a86Var.m(z76.ZERO);
        Random random = new Random();
        int iF = h86Var.f();
        do {
            h86 h86VarM2 = a86Var.m(new BigInteger(iF, random));
            h86 h86VarA2 = h86Var;
            h86VarA = h86VarM;
            for (int i = 1; i <= iF - 1; i++) {
                h86 h86VarO = h86VarA2.o();
                h86VarA = h86VarA.o().a(h86VarO.j(h86VarM2));
                h86VarA2 = h86VarO.a(h86Var);
            }
            if (!h86VarA2.i()) {
                return null;
            }
        } while (h86VarA.o().a(h86VarA).i());
        return h86VarA;
    }

    public static h86 d(h86 h86Var) {
        h86 h86VarA = h86Var;
        for (int i = 1; i < h86Var.f(); i++) {
            h86VarA = h86VarA.o().a(h86Var);
        }
        return h86VarA;
    }
}
