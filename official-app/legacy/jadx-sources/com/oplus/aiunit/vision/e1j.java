package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes18.dex */
public class e1j {
    public static final String REGEX_MAIL = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
    public static final String REGEX_PHONE = "((13[0-9])|(14[0-9])|(15[0-9])|(16[0-9])|(17[0-9])|(18[0-9])|(19[0-9]))\\d{8}$";
    public static byte[] a = new byte[128];
    public static final SimpleDateFormat format1;
    public static final SimpleDateFormat format2;
    public static final SimpleDateFormat format3;
    public static final SimpleDateFormat format6;

    static {
        j();
        format1 = new SimpleDateFormat(v05.DATE_FORMAT_14);
        format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        format3 = new SimpleDateFormat("yyMMddHHmmss");
        format6 = new SimpleDateFormat(z0j.DATA_FMT1);
    }

    public static String a(String str) {
        if (k(str) || str.length() != 84) {
            return null;
        }
        return str.substring(0, 4) + str.substring(20, 36);
    }

    public static String b(long j2, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat == null ? "" : simpleDateFormat.format(new Date(j2));
    }

    public static String c(Date date, SimpleDateFormat simpleDateFormat) {
        return (simpleDateFormat == null || date == null) ? "" : simpleDateFormat.format(date);
    }

    public static long d(String str, SimpleDateFormat simpleDateFormat) {
        if (TextUtils.isEmpty(str) || simpleDateFormat == null) {
            return 0L;
        }
        try {
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e2) {
            t6b.d("StringUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return 0L;
        }
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (q(charArray[i2 + 1]) | (q(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static int f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static int g(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3) {
            i4 = (i4 << 8) | (bArr[i] & 255);
            i++;
        }
        return i4;
    }

    public static String h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static String i(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = bArr[i3 + i] & 255;
            if (i4 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i4));
        }
        return stringBuffer.toString();
    }

    public static void j() {
        for (int i = 0; i <= 9; i++) {
            a[i + 48] = (byte) i;
        }
        for (int i2 = 0; i2 <= 5; i2++) {
            a[i2 + 97] = (byte) (i2 + 10);
        }
        for (int i3 = 0; i3 <= 5; i3++) {
            a[i3 + 65] = (byte) (i3 + 10);
        }
    }

    public static boolean k(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean l(String str) {
        return str == null || "".equals(str.trim()) || "null".equals(str.trim());
    }

    public static boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^1[3456789]\\d{9}$");
    }

    public static boolean n(String str) {
        return (str == null || "".equals(str.trim()) || "null".equals(str.trim())) ? false : true;
    }

    public static final String o(int i) {
        String hexString = Integer.toHexString(i);
        if (hexString.length() != 1) {
            return hexString;
        }
        return "0" + hexString;
    }

    public static String p(long j2, String str) {
        if (str == null || str.isEmpty()) {
            str = "yyyyMMdd";
        }
        return new SimpleDateFormat(str).format(new Date(j2));
    }

    public static byte q(char c2) {
        return a[c2];
    }

    public static String r(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            if ((b & 255) < 16) {
                stringBuffer.append("0" + Integer.toHexString(bArr[i] & 255));
            } else {
                stringBuffer.append(Integer.toHexString(b & 255));
            }
        }
        return stringBuffer.toString().toUpperCase();
    }

    public static int s(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
