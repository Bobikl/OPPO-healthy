package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public interface n1e {
    public static final n1 gmss;
    public static final n1 gmssWithSha1;
    public static final n1 gmssWithSha224;
    public static final n1 gmssWithSha256;
    public static final n1 gmssWithSha384;
    public static final n1 gmssWithSha512;
    public static final n1 mcEliece;
    public static final n1 mcElieceCca2;
    public static final n1 mcElieceFujisaki;
    public static final n1 mcElieceKobara_Imai;
    public static final n1 mcEliecePointcheval;
    public static final n1 newHope;
    public static final n1 rainbow;
    public static final n1 rainbowWithSha1;
    public static final n1 rainbowWithSha224;
    public static final n1 rainbowWithSha256;
    public static final n1 rainbowWithSha384;
    public static final n1 rainbowWithSha512;
    public static final n1 sphincs256;
    public static final n1 sphincs256_with_BLAKE512;
    public static final n1 sphincs256_with_SHA3_512;
    public static final n1 sphincs256_with_SHA512;
    public static final n1 xmss;
    public static final n1 xmss_mt;
    public static final n1 xmss_mt_with_SHA256;
    public static final n1 xmss_mt_with_SHA512;
    public static final n1 xmss_mt_with_SHAKE128;
    public static final n1 xmss_mt_with_SHAKE256;
    public static final n1 xmss_with_SHA256;
    public static final n1 xmss_with_SHA512;
    public static final n1 xmss_with_SHAKE128;
    public static final n1 xmss_with_SHAKE256;

    static {
        n1 n1Var = new n1("1.3.6.1.4.1.8301.3.1.3.5.3.2");
        rainbow = n1Var;
        rainbowWithSha1 = n1Var.m("1");
        rainbowWithSha224 = n1Var.m("2");
        rainbowWithSha256 = n1Var.m("3");
        rainbowWithSha384 = n1Var.m("4");
        rainbowWithSha512 = n1Var.m("5");
        n1 n1Var2 = new n1("1.3.6.1.4.1.8301.3.1.3.3");
        gmss = n1Var2;
        gmssWithSha1 = n1Var2.m("1");
        gmssWithSha224 = n1Var2.m("2");
        gmssWithSha256 = n1Var2.m("3");
        gmssWithSha384 = n1Var2.m("4");
        gmssWithSha512 = n1Var2.m("5");
        mcEliece = new n1(xob.OID);
        mcElieceCca2 = new n1(rob.OID);
        mcElieceFujisaki = new n1("1.3.6.1.4.1.8301.3.1.3.4.2.1");
        mcEliecePointcheval = new n1("1.3.6.1.4.1.8301.3.1.3.4.2.2");
        mcElieceKobara_Imai = new n1("1.3.6.1.4.1.8301.3.1.3.4.2.3");
        sphincs256 = jp0.sphincs256;
        sphincs256_with_BLAKE512 = jp0.sphincs256_with_BLAKE512;
        sphincs256_with_SHA512 = jp0.sphincs256_with_SHA512;
        sphincs256_with_SHA3_512 = jp0.sphincs256_with_SHA3_512;
        newHope = jp0.newHope;
        xmss = jp0.xmss;
        xmss_with_SHA256 = jp0.xmss_with_SHA256;
        xmss_with_SHA512 = jp0.xmss_with_SHA512;
        xmss_with_SHAKE128 = jp0.xmss_with_SHAKE128;
        xmss_with_SHAKE256 = jp0.xmss_with_SHAKE256;
        xmss_mt = jp0.xmss_mt;
        xmss_mt_with_SHA256 = jp0.xmss_mt_with_SHA256;
        xmss_mt_with_SHA512 = jp0.xmss_mt_with_SHA512;
        xmss_mt_with_SHAKE128 = jp0.xmss_mt_with_SHAKE128;
        xmss_mt_with_SHAKE256 = jp0.xmss_mt_with_SHAKE256;
    }
}
