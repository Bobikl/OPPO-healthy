package com.heytap.connect.cipher;

import android.content.Context;
import android.text.TextUtils;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public class McsCipher {
    public static final int KEY_AES_FIEXED = 1;
    public static final int KEY_AES_RANDOM = 0;
    private static final int KEY_TYPE = 0;

    public static byte[] decrypt(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return CipherAlgoNative.nativeAESDecrypt(bArr, bArr.length, 0);
    }

    public static String encrypt(String str) {
        return encrypt(str, 0);
    }

    public static String getAESKey(Context context, String str) {
        return CryptoUtil.parseByte2HexStr(CipherAlgoNative.nativeGenerateAESKey(context, CryptoUtil.parseHexStr2Byte(str)));
    }

    public static String getApiKey() {
        return CryptoUtil.parseByte2HexStr(CipherAlgoNative.nativeGetApiKey(0));
    }

    public static String getApiSecret() {
        return CryptoUtil.parseByte2HexStr(CipherAlgoNative.nativeGetApiSecret(0));
    }

    public static String getOrigApiKey() {
        return new String(CipherAlgoNative.nativeGetOrigApiKey(), Charset.defaultCharset());
    }

    public static String getOrigApiSecret() {
        return new String(CipherAlgoNative.nativeGetOrigApiSecret(), Charset.defaultCharset());
    }

    public static byte[] decrypt(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        return CipherAlgoNative.nativeAESDecrypt(bArr, bArr.length, i);
    }

    public static String encrypt(String str, int i) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes(Charset.defaultCharset());
            return CryptoUtil.parseByte2HexStr(CipherAlgoNative.nativeAESEncrypt(bytes, bytes.length, i));
        } catch (Throwable unused) {
            return str;
        }
    }

    public static final byte[] encrypt(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return CipherAlgoNative.nativeAESEncrypt(bArr, bArr.length, 0);
    }
}
