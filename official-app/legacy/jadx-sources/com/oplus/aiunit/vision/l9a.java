package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes15.dex */
public class l9a {
    public static final int[] h = {Integer.MIN_VALUE, 8388608, 32768, 128};
    public static final int[] i = {0, 40, 48, 56};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f13590j = {0, 8, 16, 24};
    public static final int[] k = {0, 24, 16, 8};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f13591l = {-1, 16777215, 65535, 255};
    public transient int[] a;
    public transient long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int[] f13592c;
    public transient byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient int f13593e;
    public transient long f;
    public transient int g;

    public l9a() {
        int[] iArr = new int[87];
        this.a = iArr;
        iArr[82] = 1732584193;
        iArr[83] = -271733879;
        iArr[84] = -1732584194;
        iArr[85] = 271733878;
        iArr[86] = -1009589776;
        this.b = 0L;
        this.f13592c = new int[37];
        this.d = new byte[20];
        this.f13593e = 20;
        this.f = 0L;
        this.g = 0;
    }

    public static void a(int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5 = iArr[82];
        int i6 = iArr[83];
        int i7 = iArr[84];
        int i8 = iArr[85];
        int i9 = iArr[86];
        for (int i10 = 16; i10 < 80; i10++) {
            int i11 = ((iArr[i10 - 3] ^ iArr[i10 - 8]) ^ iArr[i10 - 14]) ^ iArr[i10 - 16];
            iArr[i10] = (i11 >>> 31) | (i11 << 1);
        }
        int i12 = 0;
        while (true) {
            i2 = 20;
            if (i12 >= 20) {
                break;
            }
            int i13 = i9 + iArr[i12] + 1518500249 + ((i5 << 5) | (i5 >>> 27)) + ((i6 & i7) | ((~i6) & i8));
            int i14 = (i6 >>> 2) | (i6 << 30);
            i12++;
            i6 = i5;
            i5 = i13;
            i9 = i8;
            i8 = i7;
            i7 = i14;
        }
        while (true) {
            i3 = 40;
            if (i2 >= 40) {
                break;
            }
            int i15 = i9 + iArr[i2] + 1859775393 + ((i5 << 5) | (i5 >>> 27)) + ((i6 ^ i7) ^ i8);
            int i16 = (i6 >>> 2) | (i6 << 30);
            i2++;
            i6 = i5;
            i5 = i15;
            i9 = i8;
            i8 = i7;
            i7 = i16;
        }
        while (true) {
            i4 = 60;
            if (i3 >= 60) {
                break;
            }
            int i17 = ((i9 + iArr[i3]) - 1894007588) + ((i5 << 5) | (i5 >>> 27)) + ((i6 & i7) | (i6 & i8) | (i7 & i8));
            int i18 = (i6 >>> 2) | (i6 << 30);
            i3++;
            i6 = i5;
            i5 = i17;
            i9 = i8;
            i8 = i7;
            i7 = i18;
        }
        while (i4 < 80) {
            int i19 = ((i9 + iArr[i4]) - 899497514) + ((i5 << 5) | (i5 >>> 27)) + ((i6 ^ i7) ^ i8);
            int i20 = (i6 >>> 2) | (i6 << 30);
            i4++;
            i6 = i5;
            i5 = i19;
            i9 = i8;
            i8 = i7;
            i7 = i20;
        }
        iArr[82] = iArr[82] + i5;
        iArr[83] = iArr[83] + i6;
        iArr[84] = iArr[84] + i7;
        iArr[85] = iArr[85] + i8;
        iArr[86] = iArr[86] + i9;
    }

    public static byte[] b(byte[] bArr, int i2) {
        l9a l9aVar = new l9a();
        l9aVar.d(bArr);
        byte[] bArr2 = new byte[i2];
        l9aVar.c(bArr2);
        return bArr2;
    }

    public static void e(int[] iArr, byte[] bArr, int i2, int i3) {
        int i4 = iArr[81];
        int i5 = i4 >> 2;
        int i6 = i4 & 3;
        iArr[81] = (((i4 + i3) - i2) + 1) & 63;
        if (i6 != 0) {
            while (i2 <= i3 && i6 < 4) {
                iArr[i5] = iArr[i5] | ((bArr[i2] & 255) << ((3 - i6) << 3));
                i6++;
                i2++;
            }
            if (i6 == 4 && (i5 = i5 + 1) == 16) {
                a(iArr);
                i5 = 0;
            }
            if (i2 > i3) {
                return;
            }
        }
        int i7 = ((i3 - i2) + 1) >> 2;
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i5] = ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8) | (bArr[i2 + 3] & 255);
            i2 += 4;
            i5++;
            if (i5 >= 16) {
                a(iArr);
                i5 = 0;
            }
        }
        int i9 = (i3 - i2) + 1;
        if (i9 != 0) {
            int i10 = (bArr[i2] & 255) << 24;
            if (i9 != 1) {
                i10 |= (bArr[i2 + 1] & 255) << 16;
                if (i9 != 2) {
                    i10 |= (bArr[i2 + 2] & 255) << 8;
                }
            }
            iArr[i5] = i10;
        }
    }

    public synchronized void c(byte[] bArr) {
        int i2;
        try {
            if (bArr == null) {
                throw new NullPointerException("bytes == null");
            }
            int[] iArr = this.a;
            int i3 = iArr[81];
            int i4 = i3 == 0 ? 0 : (i3 + 7) >> 2;
            int i5 = this.g;
            if (i5 == 0) {
                throw new IllegalStateException("No seed supplied!");
            }
            char c2 = StringUtil.SPACE;
            long j2 = -1;
            if (i5 == 1) {
                System.arraycopy(iArr, 82, this.f13592c, 0, 5);
                for (int i6 = i4 + 3; i6 < 18; i6++) {
                    this.a[i6] = 0;
                }
                long j3 = (this.b << 3) + 64;
                int[] iArr2 = this.a;
                if (iArr2[81] < 48) {
                    iArr2[14] = (int) (j3 >>> 32);
                    iArr2[15] = (int) (j3 & (-1));
                } else {
                    int[] iArr3 = this.f13592c;
                    iArr3[19] = (int) (j3 >>> 32);
                    iArr3[20] = (int) (j3 & (-1));
                }
                this.f13593e = 20;
            }
            this.g = 2;
            if (bArr.length == 0) {
                return;
            }
            int i7 = this.f13593e;
            int length = 20 - i7 < bArr.length - 0 ? 20 - i7 : bArr.length - 0;
            if (length > 0) {
                System.arraycopy(this.d, i7, bArr, 0, length);
                this.f13593e += length;
                i2 = length + 0;
            } else {
                i2 = 0;
            }
            if (i2 >= bArr.length) {
                return;
            }
            int i8 = this.a[81] & 3;
            while (true) {
                if (i8 == 0) {
                    int[] iArr4 = this.a;
                    long j4 = this.f;
                    iArr4[i4] = (int) (j4 >>> c2);
                    iArr4[i4 + 1] = (int) (j4 & j2);
                    iArr4[i4 + 2] = h[0];
                } else {
                    int[] iArr5 = this.a;
                    int i9 = iArr5[i4];
                    long j5 = this.f;
                    iArr5[i4] = ((int) ((j5 >>> i[i8]) & ((long) f13591l[i8]))) | i9;
                    iArr5[i4 + 1] = (int) ((j5 >>> f13590j[i8]) & j2);
                    iArr5[i4 + 2] = (int) (((long) h[i8]) | (j5 << k[i8]));
                }
                int[] iArr6 = this.a;
                if (iArr6[81] > 48) {
                    int[] iArr7 = this.f13592c;
                    iArr7[5] = iArr6[16];
                    iArr7[6] = iArr6[17];
                }
                a(iArr6);
                int[] iArr8 = this.a;
                if (iArr8[81] > 48) {
                    System.arraycopy(iArr8, 0, this.f13592c, 21, 16);
                    System.arraycopy(this.f13592c, 5, this.a, 0, 16);
                    a(this.a);
                    System.arraycopy(this.f13592c, 21, this.a, 0, 16);
                }
                this.f++;
                int i10 = 0;
                for (int i11 = 0; i11 < 5; i11++) {
                    int i12 = this.a[i11 + 82];
                    byte[] bArr2 = this.d;
                    bArr2[i10] = (byte) (i12 >>> 24);
                    bArr2[i10 + 1] = (byte) (i12 >>> 16);
                    bArr2[i10 + 2] = (byte) (i12 >>> 8);
                    bArr2[i10 + 3] = (byte) i12;
                    i10 += 4;
                }
                this.f13593e = 0;
                int length2 = 20 < bArr.length - i2 ? 20 : bArr.length - i2;
                if (length2 > 0) {
                    System.arraycopy(this.d, 0, bArr, i2, length2);
                    i2 += length2;
                    this.f13593e += length2;
                }
                if (i2 >= bArr.length) {
                    return;
                }
                c2 = StringUtil.SPACE;
                j2 = -1;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(byte[] bArr) {
        try {
            if (bArr == null) {
                throw new NullPointerException("seed == null");
            }
            if (this.g == 2) {
                System.arraycopy(this.f13592c, 0, this.a, 82, 5);
            }
            this.g = 1;
            if (bArr.length != 0) {
                f(bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(byte[] bArr) {
        e(this.a, bArr, 0, bArr.length - 1);
        this.b += (long) bArr.length;
    }
}
