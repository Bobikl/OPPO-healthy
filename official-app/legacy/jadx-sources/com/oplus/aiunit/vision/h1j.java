package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class h1j {
    public static final String COMMA_SEPARATOR = ",";
    public static final Charset UTF8 = Charset.forName("UTF-8");
    public static final Locale a = Locale.ENGLISH;
    public static final Pattern linePattern = Pattern.compile("\\r|\\n");

    public static void a(StringBuilder sb, String str) {
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (!c(cCharAt)) {
                sb.append(cCharAt);
                z = false;
            } else if (!z) {
                sb.append(StringUtil.SPACE);
                z = true;
            }
        }
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean c(char c2) {
        return c2 == ' ' || c2 == '\t' || c2 == '\n' || c2 == 11 || c2 == '\r' || c2 == '\f';
    }

    public static String d(String str) {
        return b(str) ? str : str.toLowerCase(a);
    }

    public static String[] e(String str, char c2) {
        String[] strArr = new String[2];
        if (str != null && !str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (c2 == str.charAt(i)) {
                    strArr[0] = str.substring(0, i);
                    strArr[1] = str.substring(i + 1);
                    return strArr;
                }
            }
        }
        strArr[0] = str;
        return strArr;
    }

    public static String f(String str) {
        return b(str) ? str : str.toUpperCase(a);
    }
}
