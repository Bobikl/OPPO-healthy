package com.heytap.nearx.cloudconfig.env;

/* JADX INFO: loaded from: classes17.dex */
public class AreaEnv {
    private static final int key = 17;
    private static final int[] https = {121, 101, 101, 97, 98, 43, 62, 62};
    private static final int[] appconf = {124, 117, 97, 60, 112, 97, 97, 114, 126, 127, 119};

    /* JADX INFO: renamed from: heytap, reason: collision with root package name */
    private static final int[] f7411heytap = {121, 116, 104, 101, 112, 97};
    private static final int[] download = {117, 126, 102, 127, 125, 126, 112, 117};

    /* JADX INFO: renamed from: com, reason: collision with root package name */
    private static final int[] f7410com = {114, 126, 124};
    private static final int[] dl = {117, 125};
    private static final int[] dot = {63};
    private static final int[] _s = {60, 52, 98};
    private static final int[] _cn = {60, 114, 127};

    public static final String cnUrl() {
        int[] iArr = dot;
        return toString(https, appconf, _cn, iArr, f7411heytap, download, iArr, f7410com);
    }

    public static final String configUrl(String str) {
        if (str == null || str.isEmpty()) {
            int[] iArr = dot;
            return toString(https, appconf, iArr, f7411heytap, dl, iArr, f7410com);
        }
        int[] iArr2 = dot;
        return String.format(toString(https, appconf, _s, iArr2, f7411heytap, dl, iArr2, f7410com), str);
    }

    private static final String toString(int[]... iArr) {
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
