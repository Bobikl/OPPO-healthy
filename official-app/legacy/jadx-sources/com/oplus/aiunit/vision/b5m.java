package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public interface b5m {
    public static final n1 crlAccessMethod;
    public static final n1 id_ad;
    public static final n1 id_ad_caIssuers;
    public static final n1 id_ad_ocsp;
    public static final n1 id_ce;
    public static final n1 id_pe;
    public static final n1 id_pkix;
    public static final n1 ocspAccessMethod;
    public static final n1 commonName = new n1("2.5.4.3").t();
    public static final n1 countryName = new n1("2.5.4.6").t();
    public static final n1 localityName = new n1("2.5.4.7").t();
    public static final n1 stateOrProvinceName = new n1("2.5.4.8").t();
    public static final n1 organization = new n1("2.5.4.10").t();
    public static final n1 organizationalUnitName = new n1("2.5.4.11").t();
    public static final n1 id_at_telephoneNumber = new n1("2.5.4.20").t();
    public static final n1 id_at_name = new n1("2.5.4.41").t();
    public static final n1 id_at_organizationIdentifier = new n1("2.5.4.97").t();
    public static final n1 id_SHA1 = new n1("1.3.14.3.2.26").t();
    public static final n1 ripemd160 = new n1("1.3.36.3.2.1").t();
    public static final n1 ripemd160WithRSAEncryption = new n1("1.3.36.3.3.1.2").t();
    public static final n1 id_ea_rsa = new n1("2.5.8.1.1").t();

    static {
        n1 n1Var = new n1("1.3.6.1.5.5.7");
        id_pkix = n1Var;
        id_pe = n1Var.m("1");
        id_ce = new n1("2.5.29");
        n1 n1VarM = n1Var.m("48");
        id_ad = n1VarM;
        n1 n1VarT = n1VarM.m("2").t();
        id_ad_caIssuers = n1VarT;
        n1 n1VarT2 = n1VarM.m("1").t();
        id_ad_ocsp = n1VarT2;
        ocspAccessMethod = n1VarT2;
        crlAccessMethod = n1VarT;
    }
}
