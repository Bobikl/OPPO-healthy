package com.heytap.msp.sdk.base.common.util;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class SensitiveInfoUtils {
    private static final int LENGTH_1 = 1;
    private static final int LENGTH_2 = 2;
    private static final int LENGTH_3 = 3;
    private static final int LENGTH_6 = 6;
    private static final String REGX_VERSION = ".";
    private static final String STAR = "********";

    public static String bizNoReplace(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "*****" + str.substring(str.length() - 1, str.length());
    }

    public static String currencyReplace(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return "********1********";
        }
        if (length < 6) {
            return STAR + (str.length() - 1) + STAR + TextUtils.substring(str, str.length() - 1, str.length());
        }
        return STAR + (str.length() - 6) + STAR + str.substring(str.length() - 6, str.length());
    }

    public static String getNewSdkVersion(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace(".", "");
    }

    public static String getNewUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str.contains("/")) {
            String[] strArrSplit = str.split("/");
            for (int i = 0; i < strArrSplit.length; i++) {
                if (i > 3) {
                    sb.append("/" + strArrSplit[i]);
                }
            }
        }
        return sb.toString();
    }

    public static String userName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return "********1********";
        }
        if (length == 2) {
            return "********1********" + TextUtils.substring(str, str.length() - 1, str.length());
        }
        if (length == 3) {
            return "********1********" + TextUtils.substring(str, str.length() - 2, str.length());
        }
        return STAR + (length - 2) + STAR + TextUtils.substring(str, str.length() - 2, str.length());
    }
}
