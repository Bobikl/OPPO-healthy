package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class rs5 {
    public static ns5 a(n1 n1Var) {
        if (n1Var.equals(fec.id_sha256)) {
            return new a6g();
        }
        if (n1Var.equals(fec.id_sha512)) {
            return new d6g();
        }
        if (n1Var.equals(fec.id_shake128)) {
            return new f6g(128);
        }
        if (n1Var.equals(fec.id_shake256)) {
            return new f6g(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + n1Var);
    }

    public static String b(n1 n1Var) {
        if (n1Var.equals(fec.id_sha256)) {
            return gc0.SHA256;
        }
        if (n1Var.equals(fec.id_sha512)) {
            return "SHA512";
        }
        if (n1Var.equals(fec.id_shake128)) {
            return "SHAKE128";
        }
        if (n1Var.equals(fec.id_shake256)) {
            return "SHAKE256";
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + n1Var);
    }
}
