package com.heytap.msp.comm;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static final String TAG = "InfoUtils";

    public static String a(String str) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int length = str.length();
            if (length <= 1) {
                str2 = "********1********";
            } else if (length <= 1 || length >= 6) {
                str2 = "********" + (str.length() - 6) + "********" + str.substring(str.length() - 6, str.length());
            } else {
                str2 = "********" + (str.length() - 1) + "********" + TextUtils.substring(str, str.length() - 1, str.length());
            }
            return str2;
        } catch (Exception e2) {
            Log.e(TAG, e2.toString());
            return "";
        }
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return "*****" + str.substring(str.length() - 1, str.length());
    }
}
