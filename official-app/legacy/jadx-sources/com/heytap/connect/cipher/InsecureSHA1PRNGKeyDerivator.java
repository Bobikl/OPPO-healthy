package com.heytap.connect.cipher;

import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes13.dex */
public class InsecureSHA1PRNGKeyDerivator {
    private static final int BYTES_OFFSET = 81;
    private static final int COUNTER_BASE = 0;
    private static final int DIGEST_LENGTH = 20;
    private static final int EXTRAFRAME_OFFSET = 5;
    private static final int FRAME_LENGTH = 16;
    private static final int FRAME_OFFSET = 21;
    private static final int H0 = 1732584193;
    private static final int H1 = -271733879;
    private static final int H2 = -1732584194;
    private static final int H3 = 271733878;
    private static final int H4 = -1009589776;
    private static final int HASHBYTES_TO_USE = 20;
    private static final int HASHCOPY_OFFSET = 0;
    private static final int HASH_OFFSET = 82;
    private static final int MAX_BYTES = 48;
    private static final int NEXT_BYTES = 2;
    private static final int SET_SEED = 1;
    private static final int UNDEFINED = 0;
    private transient int[] copies;
    private transient long counter;
    private transient int nextBIndex;
    private transient byte[] nextBytes;
    private transient int[] seed;
    private transient long seedLength;
    private transient int state;
    private static final int[] END_FLAGS = {Integer.MIN_VALUE, 8388608, 32768, 128};
    private static final int[] RIGHT1 = {0, 40, 48, 56};
    private static final int[] RIGHT2 = {0, 8, 16, 24};
    private static final int[] LEFT = {0, 24, 16, 8};
    private static final int[] MASK = {-1, 16777215, 65535, 255};

    private InsecureSHA1PRNGKeyDerivator() {
        int[] iArr = new int[87];
        this.seed = iArr;
        iArr[82] = H0;
        iArr[83] = H1;
        iArr[84] = H2;
        iArr[85] = H3;
        iArr[86] = H4;
        this.seedLength = 0L;
        this.copies = new int[37];
        this.nextBytes = new byte[20];
        this.nextBIndex = 20;
        this.counter = 0L;
        this.state = 0;
    }

    private static void computeHash(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4 = iArr[82];
        int i5 = iArr[83];
        int i6 = iArr[84];
        int i7 = iArr[85];
        int i8 = iArr[86];
        for (int i9 = 16; i9 < 80; i9++) {
            int i10 = ((iArr[i9 - 3] ^ iArr[i9 - 8]) ^ iArr[i9 - 14]) ^ iArr[i9 - 16];
            iArr[i9] = (i10 >>> 31) | (i10 << 1);
        }
        int i11 = 0;
        while (true) {
            i = 20;
            if (i11 >= 20) {
                break;
            }
            int i12 = i8 + iArr[i11] + 1518500249 + ((i4 << 5) | (i4 >>> 27)) + ((i5 & i6) | ((~i5) & i7));
            int i13 = (i5 >>> 2) | (i5 << 30);
            i11++;
            i5 = i4;
            i4 = i12;
            i8 = i7;
            i7 = i6;
            i6 = i13;
        }
        while (true) {
            i2 = 40;
            if (i >= 40) {
                break;
            }
            int i14 = i8 + iArr[i] + 1859775393 + ((i4 << 5) | (i4 >>> 27)) + ((i5 ^ i6) ^ i7);
            int i15 = (i5 >>> 2) | (i5 << 30);
            i++;
            i5 = i4;
            i4 = i14;
            i8 = i7;
            i7 = i6;
            i6 = i15;
        }
        while (true) {
            i3 = 60;
            if (i2 >= 60) {
                break;
            }
            int i16 = ((i8 + iArr[i2]) - 1894007588) + ((i4 << 5) | (i4 >>> 27)) + ((i5 & i6) | (i5 & i7) | (i6 & i7));
            int i17 = (i5 >>> 2) | (i5 << 30);
            i2++;
            i5 = i4;
            i4 = i16;
            i8 = i7;
            i7 = i6;
            i6 = i17;
        }
        while (i3 < 80) {
            int i18 = ((i8 + iArr[i3]) - 899497514) + ((i4 << 5) | (i4 >>> 27)) + ((i5 ^ i6) ^ i7);
            int i19 = (i5 >>> 2) | (i5 << 30);
            i3++;
            i5 = i4;
            i4 = i18;
            i8 = i7;
            i7 = i6;
            i6 = i19;
        }
        iArr[82] = iArr[82] + i4;
        iArr[83] = iArr[83] + i5;
        iArr[84] = iArr[84] + i6;
        iArr[85] = iArr[85] + i7;
        iArr[86] = iArr[86] + i8;
    }

    public static byte[] deriveInsecureKey(byte[] bArr, int i) {
        InsecureSHA1PRNGKeyDerivator insecureSHA1PRNGKeyDerivator = new InsecureSHA1PRNGKeyDerivator();
        insecureSHA1PRNGKeyDerivator.setSeed(bArr);
        byte[] bArr2 = new byte[i];
        insecureSHA1PRNGKeyDerivator.nextBytes(bArr2);
        return bArr2;
    }

    private void setSeed(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("seed == null");
        }
        if (this.state == 2) {
            System.arraycopy(this.copies, 0, this.seed, 82, 5);
        }
        this.state = 1;
        if (bArr.length != 0) {
            updateSeed(bArr);
        }
    }

    private static void updateHash(int[] iArr, byte[] bArr, int i, int i2) {
        int i3 = iArr[81];
        int i4 = i3 >> 2;
        int i5 = i3 & 3;
        iArr[81] = (((i3 + i2) - i) + 1) & 63;
        if (i5 != 0) {
            while (i <= i2 && i5 < 4) {
                iArr[i4] = iArr[i4] | ((bArr[i] & 255) << ((3 - i5) << 3));
                i5++;
                i++;
            }
            if (i5 == 4 && (i4 = i4 + 1) == 16) {
                computeHash(iArr);
                i4 = 0;
            }
            if (i > i2) {
                return;
            }
        }
        int i6 = ((i2 - i) + 1) >> 2;
        for (int i7 = 0; i7 < i6; i7++) {
            iArr[i4] = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
            i += 4;
            i4++;
            if (i4 >= 16) {
                computeHash(iArr);
                i4 = 0;
            }
        }
        int i8 = (i2 - i) + 1;
        if (i8 != 0) {
            int i9 = (bArr[i] & 255) << 24;
            if (i8 != 1) {
                i9 |= (bArr[i + 1] & 255) << 16;
                if (i8 != 2) {
                    i9 |= (bArr[i + 2] & 255) << 8;
                }
            }
            iArr[i4] = i9;
        }
    }

    private void updateSeed(byte[] bArr) {
        updateHash(this.seed, bArr, 0, bArr.length - 1);
        this.seedLength += (long) bArr.length;
    }

    public synchronized void nextBytes(byte[] bArr) {
        int i;
        try {
            if (bArr == null) {
                throw new NullPointerException("bytes == null");
            }
            int[] iArr = this.seed;
            int i2 = iArr[81];
            int i3 = i2 == 0 ? 0 : (i2 + 7) >> 2;
            int i4 = this.state;
            if (i4 == 0) {
                throw new IllegalStateException("No seed supplied!");
            }
            char c2 = StringUtil.SPACE;
            long j2 = -1;
            if (i4 == 1) {
                System.arraycopy(iArr, 82, this.copies, 0, 5);
                for (int i5 = i3 + 3; i5 < 18; i5++) {
                    this.seed[i5] = 0;
                }
                long j3 = (this.seedLength << 3) + 64;
                int[] iArr2 = this.seed;
                if (iArr2[81] < 48) {
                    iArr2[14] = (int) (j3 >>> 32);
                    iArr2[15] = (int) (j3 & (-1));
                } else {
                    int[] iArr3 = this.copies;
                    iArr3[19] = (int) (j3 >>> 32);
                    iArr3[20] = (int) (j3 & (-1));
                }
                this.nextBIndex = 20;
            }
            this.state = 2;
            if (bArr.length == 0) {
                return;
            }
            int i6 = this.nextBIndex;
            int length = 20 - i6;
            if (length >= bArr.length - 0) {
                length = bArr.length - 0;
            }
            if (length > 0) {
                System.arraycopy(this.nextBytes, i6, bArr, 0, length);
                this.nextBIndex += length;
                i = length + 0;
            } else {
                i = 0;
            }
            if (i >= bArr.length) {
                return;
            }
            int i7 = this.seed[81] & 3;
            while (true) {
                if (i7 == 0) {
                    int[] iArr4 = this.seed;
                    long j4 = this.counter;
                    iArr4[i3] = (int) (j4 >>> c2);
                    iArr4[i3 + 1] = (int) (j4 & j2);
                    iArr4[i3 + 2] = END_FLAGS[0];
                } else {
                    int[] iArr5 = this.seed;
                    int i8 = iArr5[i3];
                    long j5 = this.counter;
                    iArr5[i3] = ((int) ((j5 >>> RIGHT1[i7]) & ((long) MASK[i7]))) | i8;
                    iArr5[i3 + 1] = (int) ((j5 >>> RIGHT2[i7]) & j2);
                    iArr5[i3 + 2] = (int) (((long) END_FLAGS[i7]) | (j5 << LEFT[i7]));
                }
                int[] iArr6 = this.seed;
                if (iArr6[81] > 48) {
                    int[] iArr7 = this.copies;
                    iArr7[5] = iArr6[16];
                    iArr7[6] = iArr6[17];
                }
                computeHash(iArr6);
                int[] iArr8 = this.seed;
                if (iArr8[81] > 48) {
                    System.arraycopy(iArr8, 0, this.copies, 21, 16);
                    System.arraycopy(this.copies, 5, this.seed, 0, 16);
                    computeHash(this.seed);
                    System.arraycopy(this.copies, 21, this.seed, 0, 16);
                }
                this.counter++;
                int i9 = 0;
                for (int i10 = 0; i10 < 5; i10++) {
                    int i11 = this.seed[i10 + 82];
                    byte[] bArr2 = this.nextBytes;
                    bArr2[i9] = (byte) (i11 >>> 24);
                    bArr2[i9 + 1] = (byte) (i11 >>> 16);
                    bArr2[i9 + 2] = (byte) (i11 >>> 8);
                    bArr2[i9 + 3] = (byte) i11;
                    i9 += 4;
                }
                this.nextBIndex = 0;
                int length2 = 20 < bArr.length - i ? 20 : bArr.length - i;
                if (length2 > 0) {
                    System.arraycopy(this.nextBytes, 0, bArr, i, length2);
                    i += length2;
                    this.nextBIndex += length2;
                }
                if (i >= bArr.length) {
                    return;
                }
                c2 = StringUtil.SPACE;
                j2 = -1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
