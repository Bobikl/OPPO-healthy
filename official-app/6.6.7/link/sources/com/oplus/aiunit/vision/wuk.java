package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wuk {
    public static final String AUTO_RETRY_ACTION = "OAF_AUTO_RECONNECT";

    public static byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (~bArr[i]);
        }
        return bArr2;
    }

    public static boolean b() {
        return false;
    }
}
