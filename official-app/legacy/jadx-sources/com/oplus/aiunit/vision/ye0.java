package com.oplus.aiunit.vision;

import p010kotlin.UShort;

/* JADX INFO: loaded from: classes9.dex */
public class ye0 {
    public static final int ALERT = 21;
    public static final int CERTIFICATE = 11;
    public static final int CERTIFICATE_REQUEST = 13;
    public static final int CERTIFICATE_VERIFY = 15;
    public static final int CLIENT_HELLO = 1;
    public static final int CLIENT_KEY_EXCHANGE = 16;
    public static final int CONTENT_TYPE_APPLICATION_DATA = 23;
    public static final int CONTENT_TYPE_CHANGE_CLIPHER_SPEC = 20;
    public static final int CONTENT_TYPE_HANDSHAKE = 22;
    public static final int FINISHED = 20;
    public static final int HELLO_REQUEST = 0;
    public static final int SERVER_HELL0_DONE = 14;
    public static final int SERVER_HELLO = 2;
    public static final int SERVER_KET_EXCHANGE = 12;

    public static String a(byte[] bArr) {
        if (bArr == null) {
            c3f.e("TLSPackage", "fullClientHelloData is null！");
            return null;
        }
        try {
            if (grk.c(bArr[5]) != 1) {
                c3f.a("TLSPackage", "不是 Client Hello 消息！");
                return null;
            }
            int iC = 43 + grk.c(bArr[43]) + 1;
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, iC, bArr2, 0, 2);
            int iB = iC + grk.b(bArr2) + 2;
            int iC2 = iB + grk.c(bArr[iB]) + 1 + 2;
            while (iC2 + 4 <= bArr.length) {
                int i = iC2 + 1;
                int i2 = bArr[iC2] & 255;
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int iB2 = b(bArr, i3) & UShort.MAX_VALUE;
                int i5 = i3 + 2;
                if (i2 == 0 && i4 == 0 && iB2 > 5) {
                    int i6 = i5 + 5;
                    int i7 = iB2 - 5;
                    if (i6 + i7 > bArr.length) {
                        return null;
                    }
                    String str = new String(bArr, i6, i7);
                    c3f.a("TLSPackage", ">>>>> host:+ " + str + "hostLength:=" + i7 + "  hostStartIndex:=" + i6);
                    return str;
                }
                iC2 = i5 + iB2;
            }
            return "";
        } catch (Exception e2) {
            c3f.b("TLSPackage", "findDestHost: ex " + e2);
            return null;
        }
    }

    public static short b(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }
}
