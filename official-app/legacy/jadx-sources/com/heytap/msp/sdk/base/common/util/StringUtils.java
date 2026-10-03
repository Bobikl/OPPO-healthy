package com.heytap.msp.sdk.base.common.util;

/* JADX INFO: loaded from: classes19.dex */
public class StringUtils {
    public static String join(String[] strArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append(str);
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }
}
