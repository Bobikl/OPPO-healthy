package com.oplus.wearable.crypto;

import com.oplus.aiunit.vision.bp9;
import com.oplus.aiunit.vision.vml;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AESCipher implements bp9 {
    public Object a = new Object();

    static {
        System.loadLibrary("encrypt");
    }

    private static native int decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    private static native int decrypt256(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i);

    private static native int encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    private static native int encrypt256(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i);

    private static native int generatorKey(long j, long j2, byte[] bArr);

    @Override // com.oplus.aiunit.vision.bp9
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 == null || bArr == null) {
            throw new IllegalArgumentException("Missing argument");
        }
        if (bArr2.length == 0) {
            throw new IllegalArgumentException("Empty key");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Empty data");
        }
        byte[] bArr4 = bArr.length % 16 == 0 ? new byte[bArr.length + 1] : new byte[(((bArr.length / 16) + 1) * 16) + 1];
        if (encrypt(bArr, bArr2, bArr4, bArr.length) > 0) {
            return bArr4;
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.bp9
    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 == null || bArr == null) {
            throw new IllegalArgumentException("Missing argument");
        }
        if (bArr2.length == 0) {
            throw new IllegalArgumentException("Empty key");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Empty cipher");
        }
        int length = bArr.length;
        byte[] bArr4 = new byte[length];
        int iDecrypt = decrypt(bArr, bArr2, bArr4, bArr.length);
        if (iDecrypt <= 0 || iDecrypt > length) {
            return null;
        }
        byte[] bArr5 = new byte[iDecrypt];
        System.arraycopy(bArr4, 0, bArr5, 0, iDecrypt);
        return bArr5;
    }

    @Override // com.oplus.aiunit.vision.bp9
    public byte[] c(long j, long j2) {
        synchronized (this.a) {
            byte[] bArr = new byte[16];
            if (generatorKey(j, j2, bArr) == 0) {
                vml.b("AESCipher", "generatorKey: success");
                return bArr;
            }
            vml.b("AESCipher", "generator key failed");
            return null;
        }
    }

    public byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2 == null || bArr == null) {
            throw new IllegalArgumentException("Missing argument");
        }
        if (bArr2.length == 0) {
            throw new IllegalArgumentException("Empty key");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Empty cipher");
        }
        int length = bArr.length - 1;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 1, bArr4, 0, bArr.length - 1);
        int i = bArr[0];
        if (i == 16) {
            i = 0;
        }
        int iDecrypt256 = decrypt256(bArr4, bArr2, bArr4, bArr3, length) - i;
        if (iDecrypt256 <= 0 || iDecrypt256 > length) {
            return null;
        }
        byte[] bArr5 = new byte[iDecrypt256];
        System.arraycopy(bArr4, 0, bArr5, 0, iDecrypt256);
        return bArr5;
    }

    public byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        byte[] bArr5;
        if (bArr2 == null || bArr == null) {
            throw new IllegalArgumentException("Missing argument");
        }
        if (bArr2.length == 0) {
            throw new IllegalArgumentException("Empty key");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("Empty data");
        }
        int length = bArr.length / 16;
        int length2 = bArr.length % 16;
        if (length2 == 0) {
            bArr5 = new byte[bArr.length + 1];
            bArr4 = new byte[bArr.length];
            bArr5[0] = 0;
        } else {
            int i = (length + 1) * 16;
            byte[] bArr6 = new byte[i + 1];
            bArr6[0] = (byte) (16 - length2);
            bArr4 = new byte[i];
            bArr5 = bArr6;
        }
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        if (encrypt256(bArr4, bArr2, bArr5, bArr3, bArr4.length) <= 0) {
            return null;
        }
        System.arraycopy(bArr4, 0, bArr5, 1, bArr4.length);
        return bArr5;
    }
}
