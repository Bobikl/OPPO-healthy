package com.xingin.xhssharesdk.a;

import com.oplus.aiunit.vision.eui;
import com.oplus.aiunit.vision.q9m;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {
    public static final a a;

    public static abstract class a {
        public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

        public abstract int b(byte[] bArr, int i, int i2);
    }

    public static final class b extends a {
        @Override // com.xingin.xhssharesdk.a.b0.a
        public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char cCharAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (cCharAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char cCharAt2 = charSequence.charAt(i7);
                if (cCharAt2 >= 128 || i8 >= i6) {
                    if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                        int i9 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                        i8 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                            if (i8 > i6 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i4 = i7 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i4)))) {
                                    throw new c(i7, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i8);
                            }
                            int i10 = i7 + 1;
                            if (i10 != charSequence.length()) {
                                char cCharAt3 = charSequence.charAt(i10);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i11 = i8 + 1;
                                    bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i13 = i12 + 1;
                                    bArr[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i8 = i13 + 1;
                                    bArr[i13] = (byte) ((codePoint & 63) | 128);
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                            throw new c(i7 - 1, length);
                        }
                        int i14 = i8 + 1;
                        bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) ((cCharAt2 & '?') | 128);
                    }
                    i7++;
                } else {
                    i3 = i8 + 1;
                    bArr[i8] = (byte) cCharAt2;
                }
                i8 = i3;
                i7++;
            }
            return i8;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        
            if (r8 > (-12)) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x009f, code lost:
        
            if (r8 > (-12)) goto L66;
         */
        @Override // com.xingin.xhssharesdk.a.b0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i < i2) {
                while (i < i2) {
                    int i3 = i + 1;
                    byte b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 >= i2) {
                                return b;
                            }
                            if (b >= -62) {
                                i = i3 + 1;
                                if (bArr[i3] > -65) {
                                }
                            }
                            return -1;
                        }
                        if (b < -16) {
                            if (i3 >= i2 - 1) {
                                b = bArr[i3 - 1];
                                int i4 = i2 - i3;
                                if (i4 != 0) {
                                    if (i4 == 1) {
                                        return b0.a(b, bArr[i3]);
                                    }
                                    if (i4 == 2) {
                                        return b0.b(b, bArr[i3], bArr[i3 + 1]);
                                    }
                                    throw new AssertionError();
                                }
                            } else {
                                int i5 = i3 + 1;
                                byte b2 = bArr[i3];
                                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                    i = i5 + 1;
                                    if (bArr[i5] > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        if (i3 >= i2 - 2) {
                            b = bArr[i3 - 1];
                            int i6 = i2 - i3;
                            if (i6 != 0) {
                                if (i6 == 1) {
                                    return b0.a(b, bArr[i3]);
                                }
                                if (i6 == 2) {
                                    return b0.b(b, bArr[i3], bArr[i3 + 1]);
                                }
                                throw new AssertionError();
                            }
                        } else {
                            int i7 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 <= -65) {
                                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                    int i8 = i7 + 1;
                                    if (bArr[i7] <= -65) {
                                        i = i8 + 1;
                                        if (bArr[i8] > -65) {
                                        }
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    i = i3;
                }
            }
            return 0;
        }
    }

    public static class c extends IllegalArgumentException {
        public c(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static final class d extends a {
        @Override // com.xingin.xhssharesdk.a.b0.a
        public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c2;
            long j2;
            long j3;
            long j4;
            long j5;
            char c3;
            int i3;
            char cCharAt;
            long j6 = q9m.d + ((long) i);
            long j7 = ((long) i2) + j6;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                c2 = 128;
                j2 = 1;
                if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                q9m.d(bArr, j6, (byte) cCharAt);
                i4++;
                j6 = 1 + j6;
            }
            if (i4 == length) {
                j3 = q9m.d;
            } else {
                while (i4 < length) {
                    char cCharAt2 = charSequence.charAt(i4);
                    if (cCharAt2 < c2 && j6 < j7) {
                        long j8 = j6 + j2;
                        q9m.d(bArr, j6, (byte) cCharAt2);
                        j5 = j2;
                        j4 = j8;
                        c3 = c2;
                    } else if (cCharAt2 < 2048 && j6 <= j7 - 2) {
                        long j9 = j6 + j2;
                        q9m.d(bArr, j6, (byte) ((cCharAt2 >>> 6) | 960));
                        long j10 = j9 + j2;
                        q9m.d(bArr, j9, (byte) ((cCharAt2 & '?') | 128));
                        long j11 = j2;
                        c3 = 128;
                        j4 = j10;
                        j5 = j11;
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j6 > j7 - 3) {
                            if (j6 > j7 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                    throw new c(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j6);
                            }
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char cCharAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    long j12 = j6 + 1;
                                    q9m.d(bArr, j6, (byte) ((codePoint >>> 18) | 240));
                                    long j13 = j12 + 1;
                                    c3 = 128;
                                    q9m.d(bArr, j12, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = j13 + 1;
                                    q9m.d(bArr, j13, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j5 = 1;
                                    j4 = j14 + 1;
                                    q9m.d(bArr, j14, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new c(i4 - 1, length);
                        }
                        long j15 = j6 + j2;
                        q9m.d(bArr, j6, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j16 = j15 + j2;
                        q9m.d(bArr, j15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        q9m.d(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                        j4 = j16 + 1;
                        j5 = 1;
                        c3 = 128;
                    }
                    i4++;
                    c2 = c3;
                    long j17 = j5;
                    j6 = j4;
                    j2 = j17;
                }
                j3 = q9m.d;
            }
            return (int) (j6 - j3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
        
            if (r13 > (-12)) goto L84;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00fc, code lost:
        
            if (r13 > (-12)) goto L84;
         */
        @Override // com.xingin.xhssharesdk.a.b0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(byte[] bArr, int i, int i2) {
            int i3;
            long j2;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            long j3 = q9m.d;
            long j4 = ((long) i) + j3;
            int i4 = (int) ((j3 + ((long) i2)) - j4);
            if (i4 >= 16) {
                int i5 = ((int) j4) & 7;
                int i6 = i5;
                long j5 = j4;
                while (true) {
                    if (i6 <= 0) {
                        int i7 = i4 - i5;
                        while (i7 >= 8 && (q9m.e(bArr, j5) & (-9187201950435737472L)) == 0) {
                            j5 += 8;
                            i7 -= 8;
                        }
                        i3 = i4 - i7;
                        break;
                    }
                    long j6 = j5 + 1;
                    if (q9m.a(bArr, j5) < 0) {
                        i3 = i5 - i6;
                        break;
                    }
                    i6--;
                    j5 = j6;
                }
            } else {
                i3 = 0;
            }
            int i8 = i4 - i3;
            long j7 = j4 + ((long) i3);
            while (true) {
                byte bA = 0;
                while (i8 > 0) {
                    long j8 = j7 + 1;
                    bA = q9m.a(bArr, j7);
                    if (bA < 0) {
                        j7 = j8;
                        break;
                    }
                    i8--;
                    j7 = j8;
                }
                if (i8 != 0) {
                    int i9 = i8 - 1;
                    if (bA >= -32) {
                        if (bA >= -16) {
                            if (i9 >= 3) {
                                i8 = i9 - 3;
                                long j9 = j7 + 1;
                                byte bA2 = q9m.a(bArr, j7);
                                if (bA2 > -65) {
                                    break;
                                }
                                if ((((bA2 + 112) + (bA << 28)) >> 30) != 0) {
                                    break;
                                }
                                long j10 = j9 + 1;
                                if (q9m.a(bArr, j9) > -65) {
                                    break;
                                }
                                j2 = j10 + 1;
                                if (q9m.a(bArr, j10) > -65) {
                                    break;
                                }
                                j7 = j2;
                            } else {
                                if (i9 != 0) {
                                    if (i9 == 1) {
                                        return b0.a(bA, q9m.a(bArr, j7));
                                    }
                                    if (i9 == 2) {
                                        return b0.b(bA, q9m.a(bArr, j7), q9m.a(bArr, j7 + 1));
                                    }
                                    throw new AssertionError();
                                }
                                a aVar = b0.a;
                            }
                        } else if (i9 >= 2) {
                            i8 = i9 - 2;
                            long j11 = j7 + 1;
                            byte bA3 = q9m.a(bArr, j7);
                            if (bA3 > -65 || ((bA == -32 && bA3 < -96) || (bA == -19 && bA3 >= -96))) {
                                break;
                            }
                            j7 = j11 + 1;
                            if (q9m.a(bArr, j11) > -65) {
                                break;
                            }
                        } else {
                            if (i9 != 0) {
                                if (i9 == 1) {
                                    return b0.a(bA, q9m.a(bArr, j7));
                                }
                                if (i9 == 2) {
                                    return b0.b(bA, q9m.a(bArr, j7), q9m.a(bArr, j7 + 1));
                                }
                                throw new AssertionError();
                            }
                            a aVar2 = b0.a;
                        }
                    } else if (i9 != 0) {
                        i8 = i9 - 1;
                        if (bA < -62) {
                            break;
                        }
                        j2 = j7 + 1;
                        if (q9m.a(bArr, j7) > -65) {
                            break;
                        }
                        j7 = j2;
                    } else {
                        return bA;
                    }
                } else {
                    return 0;
                }
            }
            return -1;
        }
    }

    static {
        a = q9m.f15694c && q9m.b ? new d() : new b();
    }

    public static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char cCharAt2 = charSequence.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new c(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + eui.MIN_CAP_LIMIT));
    }

    public static boolean d(byte[] bArr, int i, int i2) {
        return a.b(bArr, i, i2) == 0;
    }
}
