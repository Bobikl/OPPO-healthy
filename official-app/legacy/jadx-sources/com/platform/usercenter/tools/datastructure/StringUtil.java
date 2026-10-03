package com.platform.usercenter.tools.datastructure;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public final class StringUtil {
    public static final String EMPTY_STRING = "";

    private StringUtil() {
    }

    public static String escapeSpecialCharForUrlSegments(String str) {
        return str.replace(" ", "%20").replace("[", "%5B").replace("]", "%5D").replace("|", "%7C");
    }

    public static String getUTF8String(byte[] bArr) {
        return bArr == null ? "" : getUTF8String(bArr, 0, bArr.length);
    }

    public static boolean isEmpty(String str) {
        return TextUtils.isEmpty(str);
    }

    public static boolean isEmptyOrNull(String str) {
        return str == null || "".equals(str) || "null".equals(str);
    }

    public static String subString(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() < i) ? str : TextUtils.substring(str, 0, i - 1);
    }

    public static String value(String str) {
        return str != null ? String.format("'%s'", str) : str;
    }

    public static String getUTF8String(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "";
        }
        try {
            return new String(bArr, i, i2, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }
}
