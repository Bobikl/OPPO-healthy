package com.heytap.store.base.core.util;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class DataParserUtil {
    private static final String TAG = "DataParserUtil";

    public static boolean isNumeric(String str) {
        return Pattern.compile("^[0-9]+(.[0-9]+)?$").matcher(str).matches();
    }

    public static double parseDouble(String str, int i) {
        try {
            return Double.parseDouble(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return i;
        }
    }

    public static float parseFloat(String str, float f) {
        if (str == null) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return f;
        }
    }

    public static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long parseLong(String str, int i) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str) {
        return parseLong(str, 0);
    }

    public static double parseDouble(String str) {
        return parseDouble(str, 0);
    }

    public static float parseFloat(String str) {
        return parseFloat(str, 0.0f);
    }
}
