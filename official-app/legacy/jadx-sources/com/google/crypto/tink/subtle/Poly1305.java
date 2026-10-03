package com.google.crypto.tink.subtle;

import com.oplus.aiunit.vision.zz4;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
    }

    public static byte[] computeMac(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        int i = 0;
        long jLoad26 = load26(bArr, 0, 0) & 67108863;
        int i2 = 3;
        long jLoad27 = load26(bArr, 3, 2) & 67108611;
        long jLoad28 = load26(bArr, 6, 4) & 67092735;
        long jLoad29 = load26(bArr, 9, 6) & 66076671;
        long jLoad210 = load26(bArr, 12, 8) & 1048575;
        long j2 = jLoad27 * 5;
        long j3 = jLoad28 * 5;
        long j4 = jLoad29 * 5;
        long j5 = jLoad210 * 5;
        byte[] bArr3 = new byte[17];
        long j6 = 0;
        int i3 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        while (i3 < bArr2.length) {
            copyBlockSize(bArr3, bArr2, i3);
            long jLoad211 = j10 + load26(bArr3, i, i);
            long jLoad212 = j6 + load26(bArr3, i2, 2);
            long jLoad213 = j7 + load26(bArr3, 6, 4);
            long jLoad214 = j8 + load26(bArr3, 9, 6);
            long jLoad215 = j9 + (load26(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j11 = (jLoad211 * jLoad26) + (jLoad212 * j5) + (jLoad213 * j4) + (jLoad214 * j3) + (jLoad215 * j2);
            long j12 = (jLoad211 * jLoad27) + (jLoad212 * jLoad26) + (jLoad213 * j5) + (jLoad214 * j4) + (jLoad215 * j3);
            long j13 = (jLoad211 * jLoad28) + (jLoad212 * jLoad27) + (jLoad213 * jLoad26) + (jLoad214 * j5) + (jLoad215 * j4);
            long j14 = (jLoad211 * jLoad29) + (jLoad212 * jLoad28) + (jLoad213 * jLoad27) + (jLoad214 * jLoad26) + (jLoad215 * j5);
            long j15 = j12 + (j11 >> 26);
            long j16 = j13 + (j15 >> 26);
            long j17 = j14 + (j16 >> 26);
            long j18 = (jLoad211 * jLoad210) + (jLoad212 * jLoad29) + (jLoad213 * jLoad28) + (jLoad214 * jLoad27) + (jLoad215 * jLoad26) + (j17 >> 26);
            long j19 = (j11 & 67108863) + ((j18 >> 26) * 5);
            j6 = (j15 & 67108863) + (j19 >> 26);
            i3 += 16;
            j7 = j16 & 67108863;
            j8 = j17 & 67108863;
            j9 = j18 & 67108863;
            i2 = 3;
            j10 = j19 & 67108863;
            i = 0;
        }
        long j20 = j7 + (j6 >> 26);
        long j21 = j20 & 67108863;
        long j22 = j8 + (j20 >> 26);
        long j23 = j22 & 67108863;
        long j24 = j9 + (j22 >> 26);
        long j25 = j24 & 67108863;
        long j26 = j10 + ((j24 >> 26) * 5);
        long j27 = j26 & 67108863;
        long j28 = (j6 & 67108863) + (j26 >> 26);
        long j29 = j27 + 5;
        long j30 = j29 & 67108863;
        long j31 = (j29 >> 26) + j28;
        long j32 = j21 + (j31 >> 26);
        long j33 = j23 + (j32 >> 26);
        long j34 = (j25 + (j33 >> 26)) - zz4.JOURNAL_SIZE_LIMIT_HIGH;
        long j35 = j34 >> 63;
        long j36 = j27 & j35;
        long j37 = j28 & j35;
        long j38 = j21 & j35;
        long j39 = j23 & j35;
        long j40 = j25 & j35;
        long j41 = ~j35;
        long j42 = (j31 & 67108863 & j41) | j37;
        long j43 = (j32 & 67108863 & j41) | j38;
        long j44 = (j33 & 67108863 & j41) | j39;
        long j45 = (j34 & j41) | j40;
        long j46 = (j36 | (j30 & j41) | (j42 << 26)) & 4294967295L;
        long j47 = ((j42 >> 6) | (j43 << 20)) & 4294967295L;
        long j48 = ((j43 >> 12) | (j44 << 14)) & 4294967295L;
        long j49 = ((j44 >> 18) | (j45 << 8)) & 4294967295L;
        long jLoad32 = j46 + load32(bArr, 16);
        long j50 = jLoad32 & 4294967295L;
        long jLoad33 = j47 + load32(bArr, 20) + (jLoad32 >> 32);
        long j51 = jLoad33 & 4294967295L;
        long jLoad34 = j48 + load32(bArr, 24) + (jLoad33 >> 32);
        long j52 = jLoad34 & 4294967295L;
        long jLoad35 = (j49 + load32(bArr, 28) + (jLoad34 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        toByteArray(bArr4, j50, 0);
        toByteArray(bArr4, j51, 4);
        toByteArray(bArr4, j52, 8);
        toByteArray(bArr4, jLoad35, 12);
        return bArr4;
    }

    private static void copyBlockSize(byte[] bArr, byte[] bArr2, int i) {
        int iMin = Math.min(16, bArr2.length - i);
        System.arraycopy(bArr2, i, bArr, 0, iMin);
        bArr[iMin] = 1;
        if (iMin != 16) {
            Arrays.fill(bArr, iMin + 1, bArr.length, (byte) 0);
        }
    }

    private static long load26(byte[] bArr, int i, int i2) {
        return (load32(bArr, i) >> i2) & 67108863;
    }

    private static long load32(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    private static void toByteArray(byte[] bArr, long j2, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j2);
            i2++;
            j2 >>= 8;
        }
    }

    public static void verifyMac(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!Bytes.equal(computeMac(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
