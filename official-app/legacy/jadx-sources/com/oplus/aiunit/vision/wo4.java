package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;

/* JADX INFO: loaded from: classes11.dex */
public class wo4 {
    public static final n1[] dsaOids = {n5m.id_dsa, y2d.dsaWithSHA1};

    public static String a(BigInteger bigInteger, DSAParams dSAParams) {
        return new fg7(eh0.l(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    public static to4 b(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new to4(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}
