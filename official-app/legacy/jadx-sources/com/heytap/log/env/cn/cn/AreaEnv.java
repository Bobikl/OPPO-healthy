package com.heytap.log.env.cn.cn;

/* JADX INFO: loaded from: classes19.dex */
public class AreaEnv {
    private static final int key = 17;
    private static final int[] https = {121, 101, 101, 97, 98, 43, 62, 62};
    private static final int[] mdp = {124, 117, 97};
    private static final int[] _usertrace = {60, 100, 98, 116, 99, 101, 99, 112, 114, 116};
    private static final int[] _cn = {60, 114, 127};
    private static final int[] heytapmobi = {63, 121, 116, 104, 101, 112, 97, 117, 126, 102, 127, 125, 126, 112, 117};

    /* JADX INFO: renamed from: com, reason: collision with root package name */
    private static final int[] f7299com = {63, 114, 126, 124};

    public static String getHost() {
        return tostring(https, mdp, _usertrace, _cn, heytapmobi, f7299com);
    }

    private static String tostring(int[]... iArr) {
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
