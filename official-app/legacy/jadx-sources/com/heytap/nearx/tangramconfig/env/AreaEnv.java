package com.heytap.nearx.tangramconfig.env;

/* JADX INFO: loaded from: classes17.dex */
public class AreaEnv {
    private static final int KEY = 17;
    private static final int[] HTTPS = {121, 101, 101, 97, 98, 43, 62, 62};
    private static final int[] APPCONF = {124, 117, 97, 60, 112, 97, 97, 114, 126, 127, 119};
    private static final int[] CLOUDCONF = {114, 125, 126, 100, 117, 114, 126, 127, 119};
    private static final int[] APP = {60, 112, 97, 97};
    private static final int[] HEYTAPMOBI = {121, 116, 104, 101, 112, 97, 124, 126, 115, 120};
    private static final int[] HEYTAP = {121, 116, 104, 101, 112, 97};
    private static final int[] DOWNLOAD = {117, 126, 102, 127, 125, 126, 112, 117};
    private static final int[] COM = {114, 126, 124};
    private static final int[] DL = {117, 125};
    private static final int[] DOT = {63};
    private static final int[] S = {60, 52, 98};
    private static final int[] CN = {60, 114, 127};
    private static final int[] CNR = {114, 127};
    private static final int[] EU = {116, 100};
    private static final int[] OC = {126, 114};
    private static final int[] EUEX = {116, 100, 116, 105};
    private static final int[] HEYTAPMOBILE = {121, 116, 104, 101, 112, 97, 124, 126, 115, 120, 125, 116};

    public static final String cnUrl() {
        int[] iArr = DOT;
        return toString(HTTPS, CLOUDCONF, APP, CN, iArr, HEYTAPMOBI, iArr, COM);
    }

    public static final String configUrl(String str) {
        if (str == null || str.isEmpty()) {
            int[] iArr = DOT;
            return String.format(toString(HTTPS, CLOUDCONF, APP, iArr, HEYTAPMOBILE, iArr, COM), "");
        }
        if (toString(CNR).equalsIgnoreCase(str) || toString(OC).equalsIgnoreCase(str)) {
            return cnUrl();
        }
        if (toString(EUEX).equalsIgnoreCase(str)) {
            str = toString(EU);
        }
        String lowerCase = str.toLowerCase();
        int[] iArr2 = DOT;
        return String.format(toString(HTTPS, CLOUDCONF, APP, S, iArr2, HEYTAPMOBILE, iArr2, COM), lowerCase);
    }

    public static final String toString(int[]... iArr) {
        int length = iArr.length;
        int length2 = 0;
        for (int[] iArr2 : iArr) {
            length2 += iArr2.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (int i = 0; i < length; i++) {
            System.arraycopy(xor(iArr[i]), 0, bArr, length3, iArr[i].length);
            length3 += iArr[i].length;
        }
        return new String(bArr);
    }

    private static byte[] xor(int[] iArr) {
        int length = iArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (iArr[i] ^ 17);
        }
        return bArr;
    }
}
