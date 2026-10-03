package com.heytap.log.nx.encry;

/* JADX INFO: loaded from: classes19.dex */
public class DecryptUtils {
    private static final int KEY = 17;

    public static String toEncryString(String str) {
        int length = str.length();
        byte[] bytes = str.getBytes();
        int[] iArr = new int[length];
        String str2 = "";
        for (int i = 0; i < length; i++) {
            iArr[i] = bytes[i] ^ 17;
            str2 = str2 + iArr[i] + " ";
        }
        return str2;
    }

    public static int[] toInt(String str) {
        int length = str.length();
        byte[] bytes = str.getBytes();
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = bytes[i] ^ 17;
        }
        return iArr;
    }

    public static String tostring(int[]... iArr) {
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
