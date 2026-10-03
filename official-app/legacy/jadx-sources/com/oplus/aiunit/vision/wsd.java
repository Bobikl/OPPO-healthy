package com.oplus.aiunit.vision;

import com.heytap.accessory.constant.FastPairConstants;
import okio.Utf8;
import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes16.dex */
public class wsd extends d11 {
    public static final byte[] k = {13, 10};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f18385l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] m = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f18386n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_SEEKER, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
    public final byte[] f;
    public final byte[] g;
    public final byte[] h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18387j;

    public wsd() {
        this(0);
    }

    public static byte[] k(byte[] bArr) {
        return new wsd().decode(bArr);
    }

    public static byte[] l(byte[] bArr, boolean z) {
        return m(bArr, z, false);
    }

    public static byte[] m(byte[] bArr, boolean z, boolean z2) {
        return n(bArr, z, z2, Integer.MAX_VALUE);
    }

    public static byte[] n(byte[] bArr, boolean z, boolean z2, int i) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        wsd wsdVar = z ? new wsd(z2) : new wsd(0, k, z2);
        long jG = wsdVar.g(bArr);
        if (jG <= i) {
            return wsdVar.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jG + ") than the specified maximum size of " + i);
    }

    public static String o(byte[] bArr) {
        return new String(l(bArr, false));
    }

    @Override // com.oplus.aiunit.vision.d11
    public void c(byte[] bArr, int i, int i2, d11.a aVar) {
        byte b;
        if (aVar.f) {
            return;
        }
        if (i2 < 0) {
            aVar.f = true;
        }
        int i3 = 0;
        while (i3 < i2) {
            byte[] bArrE = e(this.i, aVar);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == this.a) {
                aVar.f = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = f18386n;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (aVar.h + 1) % 4;
                    aVar.h = i5;
                    int i6 = (aVar.a << 6) + b;
                    aVar.a = i6;
                    if (i5 == 0) {
                        int i7 = aVar.d;
                        int i8 = i7 + 1;
                        bArrE[i7] = (byte) ((i6 >> 16) & 255);
                        int i9 = i8 + 1;
                        bArrE[i8] = (byte) ((i6 >> 8) & 255);
                        aVar.d = i9 + 1;
                        bArrE[i9] = (byte) (i6 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!aVar.f || aVar.h == 0) {
            return;
        }
        byte[] bArrE2 = e(this.i, aVar);
        int i10 = aVar.h;
        if (i10 != 1) {
            if (i10 == 2) {
                int i11 = aVar.a >> 4;
                aVar.a = i11;
                int i12 = aVar.d;
                aVar.d = i12 + 1;
                bArrE2[i12] = (byte) (i11 & 255);
                return;
            }
            if (i10 != 3) {
                throw new IllegalStateException("Impossible modulus " + aVar.h);
            }
            int i13 = aVar.a >> 2;
            aVar.a = i13;
            int i14 = aVar.d;
            int i15 = i14 + 1;
            bArrE2[i14] = (byte) ((i13 >> 8) & 255);
            aVar.d = i15 + 1;
            bArrE2[i15] = (byte) (i13 & 255);
        }
    }

    @Override // com.oplus.aiunit.vision.d11
    public void d(byte[] bArr, int i, int i2, d11.a aVar) {
        if (aVar.f) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                byte[] bArrE = e(this.f18387j, aVar);
                int i4 = (aVar.h + 1) % 3;
                aVar.h = i4;
                int i5 = i + 1;
                int i6 = bArr[i];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (aVar.a << 8) + i6;
                aVar.a = i7;
                if (i4 == 0) {
                    int i8 = aVar.d;
                    int i9 = i8 + 1;
                    byte[] bArr2 = this.f;
                    bArrE[i8] = bArr2[(i7 >> 18) & 63];
                    int i10 = i9 + 1;
                    bArrE[i9] = bArr2[(i7 >> 12) & 63];
                    int i11 = i10 + 1;
                    bArrE[i10] = bArr2[(i7 >> 6) & 63];
                    int i12 = i11 + 1;
                    aVar.d = i12;
                    bArrE[i11] = bArr2[i7 & 63];
                    int i13 = aVar.g + 4;
                    aVar.g = i13;
                    int i14 = this.b;
                    if (i14 > 0 && i14 <= i13) {
                        byte[] bArr3 = this.h;
                        System.arraycopy(bArr3, 0, bArrE, i12, bArr3.length);
                        aVar.d += this.h.length;
                        aVar.g = 0;
                    }
                }
                i3++;
                i = i5;
            }
            return;
        }
        aVar.f = true;
        if (aVar.h == 0 && this.b == 0) {
            return;
        }
        byte[] bArrE2 = e(this.f18387j, aVar);
        int i15 = aVar.d;
        int i16 = aVar.h;
        if (i16 != 0) {
            if (i16 == 1) {
                int i17 = i15 + 1;
                byte[] bArr4 = this.f;
                int i18 = aVar.a;
                bArrE2[i15] = bArr4[(i18 >> 2) & 63];
                int i19 = i17 + 1;
                aVar.d = i19;
                bArrE2[i17] = bArr4[(i18 << 4) & 63];
                if (bArr4 == f18385l) {
                    int i20 = i19 + 1;
                    byte b = this.a;
                    bArrE2[i19] = b;
                    aVar.d = i20 + 1;
                    bArrE2[i20] = b;
                }
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("Impossible modulus " + aVar.h);
                }
                int i21 = i15 + 1;
                byte[] bArr5 = this.f;
                int i22 = aVar.a;
                bArrE2[i15] = bArr5[(i22 >> 10) & 63];
                int i23 = i21 + 1;
                bArrE2[i21] = bArr5[(i22 >> 4) & 63];
                int i24 = i23 + 1;
                aVar.d = i24;
                bArrE2[i23] = bArr5[(i22 << 2) & 63];
                if (bArr5 == f18385l) {
                    aVar.d = i24 + 1;
                    bArrE2[i24] = this.a;
                }
            }
        }
        int i25 = aVar.g;
        int i26 = aVar.d;
        int i27 = i25 + (i26 - i15);
        aVar.g = i27;
        if (this.b <= 0 || i27 <= 0) {
            return;
        }
        byte[] bArr6 = this.h;
        System.arraycopy(bArr6, 0, bArrE2, i26, bArr6.length);
        aVar.d += this.h.length;
    }

    @Override // com.oplus.aiunit.vision.d11
    public boolean h(byte b) {
        if (b >= 0) {
            byte[] bArr = this.g;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public wsd(boolean z) {
        this(76, k, z);
    }

    public wsd(int i) {
        this(i, k);
    }

    public wsd(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    public wsd(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.g = f18386n;
        if (bArr != null) {
            if (b(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + new String(bArr) + "]");
            }
            if (i > 0) {
                this.f18387j = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.h = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f18387j = 4;
                this.h = null;
            }
        } else {
            this.f18387j = 4;
            this.h = null;
        }
        this.i = this.f18387j - 1;
        this.f = z ? m : f18385l;
    }
}
