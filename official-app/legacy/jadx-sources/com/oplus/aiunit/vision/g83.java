package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class g83 {
    public static final Pattern a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    public static String a(String str) {
        if (str != null) {
            Matcher matcher = a.matcher(str.toLowerCase());
            if (matcher.find()) {
                String strGroup = matcher.group(1);
                if (!TextUtils.isEmpty(strGroup)) {
                    return b(strGroup.replace("charset=", "").trim());
                }
            }
        }
        return Charset.defaultCharset().name();
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String strReplaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(strReplaceAll)) {
                    return strReplaceAll;
                }
                String upperCase = strReplaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return Charset.defaultCharset().name();
    }
}
