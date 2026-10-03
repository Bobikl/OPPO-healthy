package com.heytap.msp.push.encrypt;

import com.heytap.accessory.constant.FastPairConstants;
import okio.Utf8;
import org.apache.commons.codec.binary.StringUtils;
import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes19.dex */
public class b extends c {
    public static final byte[] t = {13, 10};
    public static final byte[] u = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] v = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] w = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.padSymbol, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, Utf8.REPLACEMENT_BYTE, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_SEEKER, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_PROVIDER, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f7346n;
    public final byte[] o;
    public final byte[] p;
    public final int q;
    public final int r;
    public int s;

    public b() {
        this(0);
    }

    public static byte[] l(String str) {
        return new b().h(str);
    }

    @Override // com.heytap.msp.push.encrypt.c
    public void c(byte[] bArr, int i, int i2) {
        if (this.k) {
            return;
        }
        if (i2 >= 0) {
            int i3 = 0;
            while (i3 < i2) {
                b(this.r);
                int i4 = (this.m + 1) % 3;
                this.m = i4;
                int i5 = i + 1;
                int i6 = bArr[i];
                if (i6 < 0) {
                    i6 += 256;
                }
                int i7 = (this.s << 8) + i6;
                this.s = i7;
                if (i4 == 0) {
                    byte[] bArr2 = this.h;
                    int i8 = this.i;
                    int i9 = i8 + 1;
                    byte[] bArr3 = this.f7346n;
                    bArr2[i8] = bArr3[(i7 >> 18) & 63];
                    int i10 = i9 + 1;
                    bArr2[i9] = bArr3[(i7 >> 12) & 63];
                    int i11 = i10 + 1;
                    bArr2[i10] = bArr3[(i7 >> 6) & 63];
                    int i12 = i11 + 1;
                    this.i = i12;
                    bArr2[i11] = bArr3[i7 & 63];
                    int i13 = this.f7350l + 4;
                    this.f7350l = i13;
                    int i14 = this.f;
                    if (i14 > 0 && i14 <= i13) {
                        byte[] bArr4 = this.p;
                        System.arraycopy(bArr4, 0, bArr2, i12, bArr4.length);
                        this.i += this.p.length;
                        this.f7350l = 0;
                    }
                }
                i3++;
                i = i5;
            }
            return;
        }
        this.k = true;
        if (this.m == 0 && this.f == 0) {
            return;
        }
        b(this.r);
        int i15 = this.i;
        int i16 = this.m;
        if (i16 == 1) {
            byte[] bArr5 = this.h;
            int i17 = i15 + 1;
            byte[] bArr6 = this.f7346n;
            int i18 = this.s;
            bArr5[i15] = bArr6[(i18 >> 2) & 63];
            int i19 = i17 + 1;
            this.i = i19;
            bArr5[i17] = bArr6[(i18 << 4) & 63];
            if (bArr6 == u) {
                int i20 = i19 + 1;
                bArr5[i19] = Base64.padSymbol;
                this.i = i20 + 1;
                bArr5[i20] = Base64.padSymbol;
            }
        } else if (i16 == 2) {
            byte[] bArr7 = this.h;
            int i21 = i15 + 1;
            byte[] bArr8 = this.f7346n;
            int i22 = this.s;
            bArr7[i15] = bArr8[(i22 >> 10) & 63];
            int i23 = i21 + 1;
            bArr7[i21] = bArr8[(i22 >> 4) & 63];
            int i24 = i23 + 1;
            this.i = i24;
            bArr7[i23] = bArr8[(i22 << 2) & 63];
            if (bArr8 == u) {
                this.i = i24 + 1;
                bArr7[i24] = Base64.padSymbol;
            }
        }
        int i25 = this.f7350l;
        int i26 = this.i;
        int i27 = i25 + (i26 - i15);
        this.f7350l = i27;
        if (this.f <= 0 || i27 <= 0) {
            return;
        }
        byte[] bArr9 = this.p;
        System.arraycopy(bArr9, 0, this.h, i26, bArr9.length);
        this.i += this.p.length;
    }

    @Override // com.heytap.msp.push.encrypt.c
    public void d(byte[] bArr, int i, int i2) {
        byte b;
        if (this.k) {
            return;
        }
        if (i2 < 0) {
            this.k = true;
        }
        int i3 = 0;
        while (i3 < i2) {
            b(this.q);
            int i4 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 61) {
                this.k = true;
                break;
            }
            if (b2 >= 0) {
                byte[] bArr2 = w;
                if (b2 < bArr2.length && (b = bArr2[b2]) >= 0) {
                    int i5 = (this.m + 1) % 4;
                    this.m = i5;
                    int i6 = (this.s << 6) + b;
                    this.s = i6;
                    if (i5 == 0) {
                        byte[] bArr3 = this.h;
                        int i7 = this.i;
                        int i8 = i7 + 1;
                        bArr3[i7] = (byte) ((i6 >> 16) & 255);
                        int i9 = i8 + 1;
                        bArr3[i8] = (byte) ((i6 >> 8) & 255);
                        this.i = i9 + 1;
                        bArr3[i9] = (byte) (i6 & 255);
                    }
                }
            }
            i3++;
            i = i4;
        }
        if (!this.k || this.m == 0) {
            return;
        }
        b(this.q);
        int i10 = this.m;
        if (i10 == 2) {
            int i11 = this.s >> 4;
            this.s = i11;
            byte[] bArr4 = this.h;
            int i12 = this.i;
            this.i = i12 + 1;
            bArr4[i12] = (byte) (i11 & 255);
            return;
        }
        if (i10 != 3) {
            return;
        }
        int i13 = this.s >> 2;
        this.s = i13;
        byte[] bArr5 = this.h;
        int i14 = this.i;
        int i15 = i14 + 1;
        bArr5[i14] = (byte) ((i13 >> 8) & 255);
        this.i = i15 + 1;
        bArr5[i15] = (byte) (i13 & 255);
    }

    @Override // com.heytap.msp.push.encrypt.c
    public boolean e(byte b) {
        if (b >= 0) {
            byte[] bArr = this.o;
            if (b < bArr.length && bArr[b] != -1) {
                return true;
            }
        }
        return false;
    }

    public b(int i) {
        this(i, t);
    }

    public b(int i, byte[] bArr) {
        this(i, bArr, false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    public b(int i, byte[] bArr, boolean z) {
        super(3, 4, i, bArr == null ? 0 : bArr.length);
        this.o = w;
        if (bArr == null) {
            this.r = 4;
            this.p = null;
        } else {
            if (k(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + StringUtils.newStringUtf8(bArr) + "]");
            }
            if (i > 0) {
                this.r = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.p = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.r = 4;
                this.p = null;
            }
        }
        this.q = this.r - 1;
        this.f7346n = z ? v : u;
    }
}
