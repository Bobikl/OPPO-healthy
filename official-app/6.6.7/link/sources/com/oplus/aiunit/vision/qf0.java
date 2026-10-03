package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class qf0 {
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
            o5f.e("TLSPackage", "fullClientHelloData is null！");
            return null;
        }
        try {
            if (evk.c(bArr[5]) != 1) {
                o5f.a("TLSPackage", "不是 Client Hello 消息！");
                return null;
            }
            int iC = 43 + evk.c(bArr[43]) + 1;
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, iC, bArr2, 0, 2);
            int iB = iC + evk.b(bArr2) + 2;
            int iC2 = iB + evk.c(bArr[iB]) + 1 + 2;
            while (iC2 + 4 <= bArr.length) {
                int i = iC2 + 1;
                int i2 = bArr[iC2] & 255;
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                int iB2 = b(bArr, i3) & 65535;
                int i5 = i3 + 2;
                if (i2 == 0 && i4 == 0 && iB2 > 5) {
                    int i6 = i5 + 5;
                    int i7 = iB2 - 5;
                    if (i6 + i7 > bArr.length) {
                        return null;
                    }
                    String str = new String(bArr, i6, i7);
                    o5f.a("TLSPackage", ">>>>> host:+ " + str + "hostLength:=" + i7 + "  hostStartIndex:=" + i6);
                    return str;
                }
                iC2 = i5 + iB2;
            }
            return "";
        } catch (Exception e) {
            o5f.b("TLSPackage", "findDestHost: ex " + e);
            return null;
        }
    }

    public static short b(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }
}
