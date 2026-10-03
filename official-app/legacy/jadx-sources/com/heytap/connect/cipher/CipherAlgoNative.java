package com.heytap.connect.cipher;

import android.content.Context;

/* JADX INFO: loaded from: classes13.dex */
public class CipherAlgoNative {
    static {
        System.loadLibrary("heytap_tapconnect_cipher");
    }

    public static native byte[] nativeAESDecrypt(byte[] bArr, int i, int i2);

    public static native byte[] nativeAESEncrypt(byte[] bArr, int i, int i2);

    public static native byte[] nativeGenerateAESKey(Context context, byte[] bArr);

    public static native byte[] nativeGetApiKey(int i);

    public static native byte[] nativeGetApiSecret(int i);

    public static native byte[] nativeGetOrigApiKey();

    public static native byte[] nativeGetOrigApiSecret();
}
