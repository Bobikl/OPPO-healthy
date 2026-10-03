package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.usercenter.accountsdk.helper.AccountHelper;

/* JADX INFO: loaded from: classes19.dex */
public final class uvg {
    public static final int XOR_KEY = 8;

    public static String a(String str) {
        return l(str, 8);
    }

    public static String b() {
        return "com.oplus.account";
    }

    public static String c() {
        return "com.heytap.member";
    }

    public static String d() {
        return "com.oneplus.member";
    }

    public static String e() {
        return "com.oplus.member";
    }

    public static String f() {
        return a("kge&gxd}{&~ax");
    }

    public static String g() {
        return a(AccountHelper.OP_ACCOUNT_PACKAGE_NAME_XOR8);
    }

    public static String h() {
        return a("kge&`mq|ix&}{mzkmf|mz");
    }

    public static String i() {
        return a("kge&`mq|ix&~ax");
    }

    public static String j() {
        return a("kge&gxxg&}{mzkmf|mz");
    }

    public static String k() {
        return a("kge&gxxg&{mz~akm&ikkg}f|");
    }

    public static String l(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bytes[i2] = (byte) (bytes[i2] ^ i);
        }
        return new String(bytes);
    }
}
