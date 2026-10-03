package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class c35 {
    public static String a(int[]... iArr) {
        int length = iArr.length;
        int length2 = 0;
        for (int[] iArr2 : iArr) {
            length2 += iArr2.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (int i = 0; i < length; i++) {
            System.arraycopy(b(iArr[i]), 0, bArr, length3, iArr[i].length);
            length3 += iArr[i].length;
        }
        return new String(bArr);
    }

    public static byte[] b(int[] iArr) {
        int length = iArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (iArr[i] ^ 17);
        }
        return bArr;
    }
}
