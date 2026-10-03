package com.oplus.quickgame.sdk.engine.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.aiunit.vision.dsm;
import java.util.HashMap;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes8.dex */
public class d {
    public static HashMap<String, String> a = new HashMap<>(8);

    public enum a {
        INSTALL,
        OPEN
    }

    public static int a(char c2) {
        int i;
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        int i2 = 65;
        if (c2 < 'A' || c2 > 'Z') {
            i2 = 97;
            if (c2 < 'a' || c2 > 'z') {
                return 0;
            }
            i = c2 + Typography.dollar;
        } else {
            i = c2 + '\n';
        }
        return i - i2;
    }

    public static void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        a.put(str, str2);
    }

    public static boolean c(a aVar) {
        String strG = g(aVar == a.INSTALL ? "xgame_install_android_version_black_list" : "xgame_open_android_version_black_list");
        String[] strArrSplit = !TextUtils.isEmpty(strG) ? strG.split("#") : null;
        if (strArrSplit != null) {
            String strValueOf = String.valueOf(dsm.a());
            for (String str : strArrSplit) {
                if (strValueOf.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(a aVar, Context context) {
        String strG = g(aVar == a.INSTALL ? "xgame_install_imei_range_2" : "xgame_open_imei_range_2");
        String[] strArrSplit = !TextUtils.isEmpty(strG) ? strG.split("-") : null;
        if (strArrSplit != null && strArrSplit.length >= 2) {
            int[] iArr = new int[2];
            try {
                iArr[0] = Integer.parseInt(strArrSplit[0]);
                iArr[1] = Integer.parseInt(strArrSplit[1]);
                String strB = dsm.b(context);
                if (TextUtils.isEmpty(strB)) {
                    return true;
                }
                int iE = e(strB);
                if (iE != -1 && iE >= iArr[0] && iE <= iArr[1]) {
                    return true;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static int e(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 3) {
            return -1;
        }
        String strSubstring = str.substring(str.length() - 1);
        String strSubstring2 = str.substring(str.length() - 2, str.length() - 1);
        String strSubstring3 = str.substring(str.length() - 3, str.length() - 2);
        try {
            char c2 = strSubstring.toCharArray()[0];
            char c3 = strSubstring2.toCharArray()[0];
            return ((((a(strSubstring3.toCharArray()[0]) * 100) + (a(c3) * 10)) + a(c2)) * 999) / 6882;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static boolean f(a aVar) {
        String strG = g(aVar == a.INSTALL ? "xgame_install_phone_black_list" : "xgame_open_phone_black_list");
        String[] strArrSplit = !TextUtils.isEmpty(strG) ? strG.split("#") : null;
        if (strArrSplit != null) {
            for (String str : strArrSplit) {
                if (Build.MODEL.equalsIgnoreCase(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String g(String str) {
        return TextUtils.isEmpty(str) ? "" : a.get(str);
    }
}
