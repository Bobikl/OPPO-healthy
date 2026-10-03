package com.lifesense.android.bluetooth.core.tools;

/* JADX INFO: loaded from: classes4.dex */
public class d {
    static {
        com.lifesense.android.bluetooth.core.protocol.b.getInstance();
    }

    public static int a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return -1;
        }
        return bArr[0];
    }

    public static boolean b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.startsWith("LsD") || str.startsWith("LsDfu");
    }

    public static String a(String str) {
        if (str == null || str.length() <= 2 || str.indexOf("_") < 2) {
            return null;
        }
        String strSubstring = str.substring(2, str.indexOf("_"));
        if ("".equals(strSubstring)) {
            return null;
        }
        return (strSubstring + "    ").substring(0, 4);
    }
}
