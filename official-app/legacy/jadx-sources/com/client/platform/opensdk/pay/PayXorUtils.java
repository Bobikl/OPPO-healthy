package com.client.platform.opensdk.pay;

/* JADX INFO: loaded from: classes13.dex */
public class PayXorUtils {
    public static String payEncrypt(String str, int i) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            bytes[i2] = (byte) (bytes[i2] ^ i);
        }
        return new String(bytes);
    }

    public byte[] payDecrypt(byte[] bArr) {
        for (int length = bArr.length - 1; length > 0; length--) {
            bArr[length] = (byte) (bArr[length] ^ bArr[length - 1]);
        }
        bArr[0] = (byte) (bArr[0] ^ 18);
        return bArr;
    }

    public byte[] payEncrypt(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte b = 18;
        for (int i = 0; i < length; i++) {
            b = (byte) (b ^ bArr[i]);
            bArr[i] = b;
        }
        return bArr;
    }
}
