package com.oplus.aiunit.vision;

import com.heytap.accessory.sdk.BuildConfig;

/* JADX INFO: loaded from: classes11.dex */
public interface uxf {
    public static final n1 id_tc26;
    public static final n1 id_tc26_agreement;
    public static final n1 id_tc26_agreement_gost_3410_12_256;
    public static final n1 id_tc26_agreement_gost_3410_12_512;
    public static final n1 id_tc26_gost_28147_param_Z;
    public static final n1 id_tc26_gost_3410_12_256;
    public static final n1 id_tc26_gost_3410_12_256_paramSetA;
    public static final n1 id_tc26_gost_3410_12_512;
    public static final n1 id_tc26_gost_3410_12_512_paramSetA;
    public static final n1 id_tc26_gost_3410_12_512_paramSetB;
    public static final n1 id_tc26_gost_3410_12_512_paramSetC;
    public static final n1 id_tc26_gost_3411_12_256;
    public static final n1 id_tc26_gost_3411_12_512;
    public static final n1 id_tc26_hmac_gost_3411_12_256;
    public static final n1 id_tc26_hmac_gost_3411_12_512;
    public static final n1 id_tc26_signwithdigest_gost_3410_12_256;
    public static final n1 id_tc26_signwithdigest_gost_3410_12_512;
    public static final n1 rosstandart;

    static {
        n1 n1Var = new n1("1.2.643.7");
        rosstandart = n1Var;
        n1 n1VarM = n1Var.m("1");
        id_tc26 = n1VarM;
        id_tc26_gost_3411_12_256 = n1VarM.m(BuildConfig.VERSION_NAME);
        id_tc26_gost_3411_12_512 = n1VarM.m("1.2.3");
        id_tc26_hmac_gost_3411_12_256 = n1VarM.m("1.4.1");
        id_tc26_hmac_gost_3411_12_512 = n1VarM.m("1.4.2");
        id_tc26_gost_3410_12_256 = n1VarM.m("1.1.1");
        id_tc26_gost_3410_12_512 = n1VarM.m(com.oplus.omes.srp.sysintegrity.BuildConfig.stdsrpVersion);
        id_tc26_signwithdigest_gost_3410_12_256 = n1VarM.m("1.3.2");
        id_tc26_signwithdigest_gost_3410_12_512 = n1VarM.m("1.3.3");
        n1 n1VarM2 = n1VarM.m("1.6");
        id_tc26_agreement = n1VarM2;
        id_tc26_agreement_gost_3410_12_256 = n1VarM2.m("1");
        id_tc26_agreement_gost_3410_12_512 = n1VarM2.m("2");
        id_tc26_gost_3410_12_256_paramSetA = n1VarM.m("2.1.1.1");
        id_tc26_gost_3410_12_512_paramSetA = n1VarM.m("2.1.2.1");
        id_tc26_gost_3410_12_512_paramSetB = n1VarM.m("2.1.2.2");
        id_tc26_gost_3410_12_512_paramSetC = n1VarM.m("2.1.2.3");
        id_tc26_gost_28147_param_Z = n1VarM.m("2.5.1.1");
    }
}
