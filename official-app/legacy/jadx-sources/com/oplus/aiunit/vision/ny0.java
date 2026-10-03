package com.oplus.aiunit.vision;

import com.heytap.connect.cipher.AESUtil;
import com.oppo.osec.signer.util.CodecUtils;

/* JADX INFO: loaded from: classes9.dex */
public class ny0 {
    public final byte[] a;

    public static class a {
        public static final byte[] a = b();

        public static byte[] b() {
            byte[] bArr = new byte[103];
            for (int i = 0; i <= 102; i++) {
                if (i >= 48 && i <= 57) {
                    bArr[i] = (byte) (i - 48);
                } else if (i >= 65 && i <= 70) {
                    bArr[i] = (byte) (i - 55);
                } else if (i < 97 || i > 102) {
                    bArr[i] = -1;
                } else {
                    bArr[i] = (byte) (i - 87);
                }
            }
            return bArr;
        }
    }

    public ny0() {
        this(true);
    }

    public byte[] a(byte[] bArr, int i) {
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Input is expected to be encoded in multiple of 2 bytes but found: " + i);
        }
        int i2 = i / 2;
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            bArr2[i3] = (byte) ((c(bArr[i4]) << 4) | c(bArr[i5]));
            i3++;
            i4 = i5 + 1;
        }
        return bArr2;
    }

    public byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            byte[] bArr3 = this.a;
            bArr2[i] = bArr3[(b >>> 4) & 15];
            i = i2 + 1;
            bArr2[i2] = bArr3[b & 15];
        }
        return bArr2;
    }

    public int c(byte b) {
        byte b2 = a.a[b];
        if (b2 > -1) {
            return b2;
        }
        throw new IllegalArgumentException("Invalid base 16 character: '" + ((char) b) + "'");
    }

    public ny0(boolean z) {
        this.a = z ? CodecUtils.toBytesDirect(AESUtil.HEX) : CodecUtils.toBytesDirect("0123456789abcdef");
    }
}
