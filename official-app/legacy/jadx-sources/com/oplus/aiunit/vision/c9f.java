package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class c9f {
    public static final n1[] rsaOids = {h1e.rsaEncryption, b5m.id_ea_rsa, h1e.id_RSAES_OAEP, h1e.id_RSASSA_PSS};

    public static String a(BigInteger bigInteger, BigInteger bigInteger2) {
        return new fg7(eh0.j(bigInteger.toByteArray(), bigInteger2.toByteArray())).toString();
    }
}
