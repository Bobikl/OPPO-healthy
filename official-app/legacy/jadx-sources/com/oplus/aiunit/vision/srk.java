package com.oplus.aiunit.vision;

import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes12.dex */
public class srk {
    public static final int UUID_LENGTH = 36;
    public static final int UUID_SEGMENT_COUNT = 4;
    public static boolean[] a;
    public static boolean[] b;

    static {
        b();
    }

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        boolean z = true;
        while (i < str.length()) {
            if (str.charAt(i) == '-') {
                i2++;
                z = z && (i == 8 || i == 13 || i == 18 || i == 23);
            }
            i++;
        }
        return z && 4 == i2 && 36 == i;
    }

    public static void b() {
        b = new boolean[256];
        a = new boolean[256];
        char c2 = 0;
        while (true) {
            boolean[] zArr = b;
            if (c2 >= zArr.length) {
                return;
            }
            boolean[] zArr2 = a;
            boolean z = true;
            boolean z2 = c2 == ':' || ('A' <= c2 && c2 <= 'Z') || c2 == '_' || (('a' <= c2 && c2 <= 'z') || ((192 <= c2 && c2 <= 214) || ((216 <= c2 && c2 <= 246) || (248 <= c2 && c2 <= 255))));
            zArr2[c2] = z2;
            if (!z2 && c2 != '-' && c2 != '.' && (('0' > c2 || c2 > '9') && c2 != 183)) {
                z = false;
            }
            zArr[c2] = z;
            c2 = (char) (c2 + 1);
        }
    }

    public static boolean c(char c2) {
        return ((c2 > 31 && c2 != 127) || c2 == '\t' || c2 == '\n' || c2 == '\r') ? false : true;
    }

    public static boolean d(char c2) {
        return (c2 <= 255 && b[c2]) || e(c2) || (c2 >= 768 && c2 <= 879) || (c2 >= 8255 && c2 <= 8256);
    }

    public static boolean e(char c2) {
        return (c2 <= 255 && a[c2]) || (c2 >= 256 && c2 <= 767) || ((c2 >= 880 && c2 <= 893) || ((c2 >= 895 && c2 <= 8191) || ((c2 >= 8204 && c2 <= 8205) || ((c2 >= 8304 && c2 <= 8591) || ((c2 >= 11264 && c2 <= 12271) || ((c2 >= 12289 && c2 <= 55295) || ((c2 >= 63744 && c2 <= 64975) || ((c2 >= 65008 && c2 <= 65533) || (c2 >= 0 && c2 <= 65535)))))))));
    }

    public static boolean f(String str) {
        if (str.length() > 0 && !e(str.charAt(0))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!d(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(String str) {
        if (str.length() > 0 && (!e(str.charAt(0)) || str.charAt(0) == ':')) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!d(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
        }
        return true;
    }

    public static String h(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt == '-' || cCharAt == '_') {
                    stringBuffer.append(Soundex.SILENT_MARKER);
                    i++;
                } else {
                    stringBuffer.append(i != 2 ? Character.toLowerCase(str.charAt(i2)) : Character.toUpperCase(str.charAt(i2)));
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String[] i(String str) {
        int iIndexOf = str.indexOf(61);
        String strSubstring = str.substring(str.charAt(1) == '?' ? 2 : 1, iIndexOf);
        int i = iIndexOf + 1;
        char cCharAt = str.charAt(i);
        int i2 = i + 1;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - iIndexOf);
        while (i2 < length) {
            stringBuffer.append(str.charAt(i2));
            i2++;
            if (str.charAt(i2) == cCharAt) {
                i2++;
            }
        }
        return new String[]{strSubstring, stringBuffer.toString()};
    }
}
