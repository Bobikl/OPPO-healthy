package com.oplus.aiunit.vision;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.apache.commons.codec.language.Soundex;
import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class sy0 {

    public static class a {
        public static final a RFC2045;
        public static final a RFC4648;
        public static final a RFC4648_URLSAFE;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int[] f16813c;
        public static final int[] d;
        public final boolean a;
        public final boolean b;

        static {
            int[] iArr = new int[256];
            f16813c = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < b.f16814e.length; i++) {
                f16813c[b.f16814e[i]] = i;
            }
            f16813c[61] = -2;
            int[] iArr2 = new int[256];
            d = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < b.f.length; i2++) {
                d[b.f[i2]] = i2;
            }
            d[61] = -2;
            RFC4648 = new a(false, false);
            RFC4648_URLSAFE = new a(true, false);
            RFC2045 = new a(false, true);
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public byte[] a(String str) {
            return b(str.getBytes(StandardCharsets.ISO_8859_1));
        }

        public byte[] b(byte[] bArr) {
            int iD = d(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[iD];
            int iC = c(bArr, 0, bArr.length, bArr2);
            return iC != iD ? Arrays.copyOf(bArr2, iC) : bArr2;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0076 A[PHI: r5 r7
  0x0076: PHI (r5v6 int) = (r5v1 int), (r5v1 int), (r5v20 int) binds: [B:9:0x001a, B:11:0x001e, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r7v6 int) = (r7v1 int), (r7v1 int), (r7v11 int) binds: [B:9:0x001a, B:11:0x001e, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x0080  */
        /* JADX WARN: Code duplicated, block: B:25:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x0087  */
        /* JADX WARN: Code duplicated, block: B:28:0x008f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0091  */
        /* JADX WARN: Code duplicated, block: B:34:0x009d  */
        /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:60:0x00a2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:63:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:65:0x00dc A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00dc A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
        
            if (r6 != 18) goto L43;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int c(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            int i4;
            int i5;
            int[] iArr = this.a ? d : f16813c;
            int i6 = i;
            int i7 = 0;
            int i8 = 0;
            int i9 = 18;
            while (i6 < i2) {
                if (i9 != 18 || i6 + 4 >= i2) {
                    i3 = i6 + 1;
                    i4 = iArr[bArr[i6] & 255];
                    if (i4 < 0) {
                        i8 |= i4 << i9;
                        i9 -= 6;
                        if (i9 < 0) {
                            int i10 = i7 + 1;
                            bArr2[i7] = (byte) (i8 >> 16);
                            int i11 = i10 + 1;
                            bArr2[i10] = (byte) (i8 >> 8);
                            i7 = i11 + 1;
                            bArr2[i11] = (byte) i8;
                            i8 = 0;
                            i9 = 18;
                        }
                    } else if (i4 == -2) {
                        if (i9 == 6) {
                            if (i3 != i2) {
                                i5 = i3 + 1;
                                if (bArr[i3] == 61) {
                                    i6 = i5;
                                }
                            }
                            throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                        }
                        i6 = i3;
                    } else if (this.b) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bArr[i3 - 1], 16));
                    }
                    i6 = i3;
                } else {
                    int i12 = ((i2 - i6) & (-4)) + i6;
                    while (i6 < i12) {
                        int i13 = i6 + 1;
                        int i14 = iArr[bArr[i6] & 255];
                        int i15 = i13 + 1;
                        int i16 = iArr[bArr[i13] & 255];
                        int i17 = i15 + 1;
                        int i18 = iArr[bArr[i15] & 255];
                        int i19 = i17 + 1;
                        int i20 = iArr[bArr[i17] & 255];
                        if ((i14 | i16 | i18 | i20) < 0) {
                            i6 = i19 - 4;
                            break;
                        }
                        int i21 = (i14 << 18) | (i16 << 12) | (i18 << 6) | i20;
                        int i22 = i7 + 1;
                        bArr2[i7] = (byte) (i21 >> 16);
                        int i23 = i22 + 1;
                        bArr2[i22] = (byte) (i21 >> 8);
                        bArr2[i23] = (byte) i21;
                        i7 = i23 + 1;
                        i6 = i19;
                    }
                    if (i6 >= i2) {
                        break;
                    }
                    i3 = i6 + 1;
                    i4 = iArr[bArr[i6] & 255];
                    if (i4 < 0) {
                        i8 |= i4 << i9;
                        i9 -= 6;
                        if (i9 < 0) {
                            int i110 = i7 + 1;
                            bArr2[i7] = (byte) (i8 >> 16);
                            int i111 = i110 + 1;
                            bArr2[i110] = (byte) (i8 >> 8);
                            i7 = i111 + 1;
                            bArr2[i111] = (byte) i8;
                            i8 = 0;
                            i9 = 18;
                        }
                    } else if (i4 == -2) {
                        if (i9 == 6) {
                            if (i3 != i2) {
                                i5 = i3 + 1;
                                if (bArr[i3] == 61) {
                                    i6 = i5;
                                }
                            }
                            throw new IllegalArgumentException("Input byte array has wrong 4-byte ending unit");
                        }
                        i6 = i3;
                    } else if (this.b) {
                        throw new IllegalArgumentException("Illegal base64 character " + Integer.toString(bArr[i3 - 1], 16));
                    }
                    i6 = i3;
                }
            }
            if (i9 == 6) {
                bArr2[i7] = (byte) (i8 >> 16);
                i7++;
            } else if (i9 == 0) {
                int i24 = i7 + 1;
                bArr2[i7] = (byte) (i8 >> 16);
                i7 = i24 + 1;
                bArr2[i24] = (byte) (i8 >> 8);
            } else if (i9 == 12) {
                throw new IllegalArgumentException("Last unit does not have enough valid bits");
            }
            while (i6 < i2) {
                if (this.b) {
                    int i25 = iArr[bArr[i6] & 255];
                    i6++;
                    if (i25 < 0) {
                    }
                }
                throw new IllegalArgumentException("Input byte array has incorrect ending byte at " + i6);
            }
            return i7;
        }

        public final int d(byte[] bArr, int i, int i2) {
            int i3;
            int[] iArr = this.a ? d : f16813c;
            int i4 = i2 - i;
            int i5 = 0;
            if (i4 == 0) {
                return 0;
            }
            boolean z = this.b;
            if (i4 < 2) {
                if (z && iArr[0] == -1) {
                    return 0;
                }
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
            if (z) {
                int i6 = 0;
                while (i < i2) {
                    int i7 = i + 1;
                    int i8 = bArr[i] & 255;
                    if (i8 == 61) {
                        i4 -= (i2 - i7) + 1;
                        break;
                    }
                    if (iArr[i8] == -1) {
                        i6++;
                    }
                    i = i7;
                }
                i4 -= i6;
            } else if (bArr[i2 - 1] == 61) {
                i5 = bArr[i2 - 2] == 61 ? 2 : 1;
            }
            if (i5 == 0 && (i3 = i4 & 3) != 0) {
                i5 = 4 - i3;
            }
            return (((i4 + 3) / 4) * 3) - i5;
        }
    }

    public static class b {
        public static final b RFC2045;
        public static final byte[] g;
        public final byte[] a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16815c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final char[] f16814e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', rnb.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', rnb.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', mla.SEPARATOR};
        public static final char[] f = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', rnb.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', rnb.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', rnb.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', rnb.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', Soundex.SILENT_MARKER, '_'};
        public static final b RFC4648 = new b(false, null, -1, true);
        public static final b RFC4648_URLSAFE = new b(true, null, -1, true);

        static {
            byte[] bArr = {13, 10};
            g = bArr;
            RFC2045 = new b(false, bArr, 76, true);
        }

        public b(boolean z, byte[] bArr, int i, boolean z2) {
            this.f16815c = z;
            this.a = bArr;
            this.b = i;
            this.d = z2;
        }

        public byte[] c(byte[] bArr) {
            int iG = g(bArr.length);
            byte[] bArr2 = new byte[iG];
            int iD = d(bArr, 0, bArr.length, bArr2);
            return iD != iG ? Arrays.copyOf(bArr2, iD) : bArr2;
        }

        public final int d(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3;
            char[] cArr = this.f16815c ? f : f16814e;
            int i4 = ((i2 - i) / 3) * 3;
            int i5 = i + i4;
            int i6 = this.b;
            int i7 = (i6 <= 0 || i4 <= (i3 = (i6 / 4) * 3)) ? i4 : i3;
            int i8 = i;
            int i9 = 0;
            while (i8 < i5) {
                int iMin = Math.min(i8 + i7, i5);
                e(bArr, i8, iMin, bArr2, i9, this.f16815c);
                int i10 = ((iMin - i8) / 3) * 4;
                i9 += i10;
                if (i10 == this.b && iMin < i2) {
                    byte[] bArr3 = this.a;
                    int length = bArr3.length;
                    int i11 = 0;
                    while (i11 < length) {
                        bArr2[i9] = bArr3[i11];
                        i11++;
                        i9++;
                    }
                }
                i8 = iMin;
            }
            if (i8 >= i2) {
                return i9;
            }
            int i12 = i8 + 1;
            int i13 = bArr[i8] & 255;
            int i14 = i9 + 1;
            bArr2[i9] = (byte) cArr[i13 >> 2];
            if (i12 == i2) {
                int i15 = i14 + 1;
                bArr2[i14] = (byte) cArr[(i13 << 4) & 63];
                if (!this.d) {
                    return i15;
                }
                int i16 = i15 + 1;
                bArr2[i15] = Base64.padSymbol;
                int i17 = i16 + 1;
                bArr2[i16] = Base64.padSymbol;
                return i17;
            }
            int i18 = bArr[i12] & 255;
            int i19 = i14 + 1;
            bArr2[i14] = (byte) cArr[((i13 << 4) & 63) | (i18 >> 4)];
            int i20 = i19 + 1;
            bArr2[i19] = (byte) cArr[(i18 << 2) & 63];
            if (!this.d) {
                return i20;
            }
            int i21 = i20 + 1;
            bArr2[i20] = Base64.padSymbol;
            return i21;
        }

        public final void e(byte[] bArr, int i, int i2, byte[] bArr2, int i3, boolean z) {
            char[] cArr = z ? f : f16814e;
            while (i < i2) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8);
                int i7 = i5 + 1;
                int i8 = i6 | (bArr[i5] & 255);
                int i9 = i3 + 1;
                bArr2[i3] = (byte) cArr[(i8 >>> 18) & 63];
                int i10 = i9 + 1;
                bArr2[i9] = (byte) cArr[(i8 >>> 12) & 63];
                int i11 = i10 + 1;
                bArr2[i10] = (byte) cArr[(i8 >>> 6) & 63];
                i3 = i11 + 1;
                bArr2[i11] = (byte) cArr[i8 & 63];
                i = i7;
            }
        }

        public String f(byte[] bArr) {
            return new String(c(bArr), StandardCharsets.ISO_8859_1);
        }

        public final int g(int i) {
            int i2;
            if (this.d) {
                i2 = ((i + 2) / 3) * 4;
            } else {
                int i3 = i % 3;
                i2 = ((i / 3) * 4) + (i3 == 0 ? 0 : i3 + 1);
            }
            int i4 = this.b;
            return i4 > 0 ? i2 + (((i2 - 1) / i4) * this.a.length) : i2;
        }
    }

    public static a a() {
        return a.RFC4648;
    }

    public static b b() {
        return b.RFC4648;
    }
}
