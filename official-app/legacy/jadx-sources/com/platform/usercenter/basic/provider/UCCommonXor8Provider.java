package com.platform.usercenter.basic.provider;

import com.platform.usercenter.tools.algorithm.XORUtils;

/* JADX INFO: loaded from: classes9.dex */
public class UCCommonXor8Provider {
    private static final String BRAND_COLOR = "KgdgzG[";
    private static final String BRAND_GREEN = "gxxg";
    private static final String BRAND_GREEN_UPPERCASE = "GXXG";
    private static final String BRAND_ORANGE = "zmidem";
    private static final String BRAND_ORANGE_UPPERCASE = "Zmidem";
    private static final String BRAND_RED = "gfmxd}{";
    private static final String BRAND_RED_UPPERCASE = "GfmXd}{";
    private static final String PKGNAME_OP_XOR_8 = "kge&gfmxd}{&ikkg}f|";
    private static final String PKGNAME_O_PLUS_XOR_8 = "kge&gxd}{&~ax";
    private static final String PKGNAME_UC_HT_XOR_8 = "kge&`mq|ix&}{mzkmf|mz";
    private static final String PKGNAME_UC_PLUS_XOR_8 = "kge&`mq|ix&~ax";
    private static final String PKGNAME_UC_SERVICE_XOR_8 = "kge&gxxg&{mz~akm&ikkg}f|";
    private static final String PKGNAME_UC_XOR_8 = "kge&gxxg&}{mzkmf|mz";
    private static final String PK_ACCOUNT = "com.oplus.account";
    private static final String PK_HT_MEMBER = "com.heytap.member";
    private static final String PK_ONE_MEMBER = "com.oneplus.member";
    private static final String PK_OP_MEMBER = "com.oplus.member";
    public static final int XOR_encrypt_K = 8;

    public static String getAcPkgName() {
        return PK_ACCOUNT;
    }

    public static String getBrandGreen() {
        return XORUtils.encrypt(BRAND_GREEN, 8);
    }

    public static String getBrandGreenUppercase() {
        return XORUtils.encrypt(BRAND_GREEN_UPPERCASE, 8);
    }

    public static String getBrandOrange() {
        return XORUtils.encrypt(BRAND_ORANGE, 8);
    }

    public static String getBrandOrangeUppercase() {
        return XORUtils.encrypt(BRAND_ORANGE_UPPERCASE, 8);
    }

    public static String getBrandRed() {
        return XORUtils.encrypt(BRAND_RED, 8);
    }

    public static String getBrandRedUppercase() {
        return XORUtils.encrypt(BRAND_RED_UPPERCASE, 8);
    }

    public static String getColorSysName() {
        return XORUtils.encrypt(BRAND_COLOR, 8);
    }

    public static String getNormalStrByDecryptXOR8(String str) {
        return XORUtils.encrypt(str, 8);
    }

    public static String getPkHtMember() {
        return PK_HT_MEMBER;
    }

    public static String getPkOneMember() {
        return PK_ONE_MEMBER;
    }

    public static String getPkOpMember() {
        return PK_OP_MEMBER;
    }

    public static String getPkgnameOPlusXor8() {
        return getNormalStrByDecryptXOR8(PKGNAME_O_PLUS_XOR_8);
    }

    public static String getPkgnameOpHtXor8() {
        return getNormalStrByDecryptXOR8("kge&gfmxd}{&ikkg}f|");
    }

    public static String getPkgnameUcHtXor8() {
        return getNormalStrByDecryptXOR8(PKGNAME_UC_HT_XOR_8);
    }

    public static String getPkgnameUcPlusXor8() {
        return getNormalStrByDecryptXOR8(PKGNAME_UC_PLUS_XOR_8);
    }

    public static String getProviderAppCodeXor8() {
        return XORUtils.encrypt("`IxxKglm", 8);
    }

    public static String getProviderHomeKeyXor8() {
        return XORUtils.encrypt("`gemcmq", 8);
    }

    public static String getProviderKeyXor8() {
        return XORUtils.encrypt("cmq", 8);
    }

    public static String getProviderXKeyXor8() {
        return XORUtils.encrypt("P%Cmq", 8);
    }

    public static String getUCPackageName() {
        return getNormalStrByDecryptXOR8(PKGNAME_UC_XOR_8);
    }

    public static String getUCServicePackageName() {
        return getNormalStrByDecryptXOR8(PKGNAME_UC_SERVICE_XOR_8);
    }

    public static boolean isBrandGreen(String str) {
        return XORUtils.encrypt(BRAND_GREEN, 8).equalsIgnoreCase(str);
    }

    public static boolean isBrandOrange(String str) {
        return XORUtils.encrypt(BRAND_ORANGE, 8).equalsIgnoreCase(str);
    }

    public static boolean isBrandRed(String str) {
        return XORUtils.encrypt(BRAND_RED, 8).equalsIgnoreCase(str);
    }
}
