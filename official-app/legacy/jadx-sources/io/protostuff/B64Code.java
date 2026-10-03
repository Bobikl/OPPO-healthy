package io.protostuff;

import com.oplus.aiunit.vision.kam;
import java.io.IOException;
import okio.Utf8;

/* JADX INFO: loaded from: classes10.dex */
public final class B64Code {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final byte pad = 61;
    static final byte[] nibble2code = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    static final byte[] code2nibble = new byte[256];

    static {
        for (int i = 0; i < 256; i++) {
            code2nibble[i] = -1;
        }
        for (byte b = 0; b < 64; b = (byte) (b + 1)) {
            code2nibble[nibble2code[b]] = b;
        }
        code2nibble[61] = 0;
    }

    private B64Code() {
    }

    public static byte[] cdecode(char[] cArr) {
        return cdecode(cArr, 0, cArr.length);
    }

    public static char[] cencode(byte[] bArr) {
        return cencode(bArr, 0, bArr.length);
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length);
    }

    public static int decodeTo(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 % 4 != 0) {
            throw new IllegalArgumentException("Input block size is not 4");
        }
        int i4 = i2 + i3;
        int i5 = i3;
        while (true) {
            i4--;
            if (bArr2[i4] != 61) {
                int i6 = (i5 * 3) / 4;
                decode(bArr2, i2, i3, bArr, i, i6);
                return i6;
            }
            i5--;
        }
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static LinkedBuffer sencode(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int i3 = ((i2 + 2) / 3) * 4;
        writeSession.size += i3;
        byte[] bArr2 = linkedBuffer.buffer;
        int length = bArr2.length;
        int iFlush = linkedBuffer.offset;
        int i4 = length - iFlush;
        if (i3 <= i4) {
            encode(bArr, i, i2, bArr2, iFlush);
            linkedBuffer.offset += i3;
            return linkedBuffer;
        }
        int i5 = i2 % 3;
        int length2 = i4 / 4;
        int i6 = (i2 - i5) + i;
        while (i < i6) {
            if (length2 == 0) {
                int i7 = linkedBuffer.start;
                iFlush = writeSession.flush(bArr2, i7, iFlush - i7);
                length2 = (bArr2.length - iFlush) / 4;
            }
            int i8 = i + 1;
            byte b = bArr[i];
            int i9 = i8 + 1;
            byte b2 = bArr[i8];
            int i10 = i9 + 1;
            byte b3 = bArr[i9];
            int i11 = iFlush + 1;
            byte[] bArr3 = nibble2code;
            bArr2[iFlush] = bArr3[(b >>> 2) & 63];
            int i12 = i11 + 1;
            bArr2[i11] = bArr3[((b << 4) & 63) | ((b2 >>> 4) & 15)];
            int i13 = i12 + 1;
            bArr2[i12] = bArr3[((b2 << 2) & 63) | ((b3 >>> 6) & 3)];
            iFlush = i13 + 1;
            bArr2[i13] = bArr3[b3 & Utf8.REPLACEMENT_BYTE];
            length2--;
            i = i10;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                if (length2 == 0) {
                    int i14 = linkedBuffer.start;
                    iFlush = writeSession.flush(bArr2, i14, iFlush - i14);
                }
                byte b4 = bArr[i];
                int i15 = iFlush + 1;
                byte[] bArr4 = nibble2code;
                bArr2[iFlush] = bArr4[(b4 >>> 2) & 63];
                int i16 = i15 + 1;
                bArr2[i15] = bArr4[(b4 << 4) & 63];
                int i17 = i16 + 1;
                bArr2[i16] = 61;
                iFlush = i17 + 1;
                bArr2[i17] = 61;
            } else {
                if (i5 != 2) {
                    throw new IllegalStateException("should not happen");
                }
                if (length2 == 0) {
                    int i18 = linkedBuffer.start;
                    iFlush = writeSession.flush(bArr2, i18, iFlush - i18);
                }
                int i19 = i + 1;
                byte b5 = bArr[i];
                byte b6 = bArr[i19];
                int i20 = iFlush + 1;
                byte[] bArr5 = nibble2code;
                bArr2[iFlush] = bArr5[(b5 >>> 2) & 63];
                int i21 = i20 + 1;
                bArr2[i20] = bArr5[((b5 << 4) & 63) | ((b6 >>> 4) & 15)];
                int i22 = i21 + 1;
                bArr2[i21] = bArr5[(b6 << 2) & 63];
                iFlush = i22 + 1;
                bArr2[i22] = 61;
            }
        }
        linkedBuffer.offset = iFlush;
        return linkedBuffer;
    }

    public static byte[] cdecode(char[] cArr, int i, int i2) {
        if (i2 == 0) {
            return ByteString.EMPTY_BYTE_ARRAY;
        }
        if (i2 % 4 != 0) {
            throw new IllegalArgumentException("Input block size is not 4");
        }
        int i3 = i + i2;
        int i4 = i2;
        while (true) {
            i3--;
            if (cArr[i3] != '=') {
                int i5 = (i4 * 3) / 4;
                byte[] bArr = new byte[i5];
                cdecode(cArr, i, i2, bArr, 0, i5);
                return bArr;
            }
            i4--;
        }
    }

    public static char[] cencode(byte[] bArr, int i, int i2) {
        char[] cArr = new char[((i2 + 2) / 3) * 4];
        cencode(bArr, i, i2, cArr, 0);
        return cArr;
    }

    public static byte[] decode(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return ByteString.EMPTY_BYTE_ARRAY;
        }
        if (i2 % 4 != 0) {
            throw new IllegalArgumentException("Input block size is not 4");
        }
        int i3 = i + i2;
        int i4 = i2;
        while (true) {
            i3--;
            if (bArr[i3] != 61) {
                int i5 = (i4 * 3) / 4;
                byte[] bArr2 = new byte[i5];
                decode(bArr, i, i2, bArr2, 0, i5);
                return bArr2;
            }
            i4--;
        }
    }

    public static byte[] encode(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[((i2 + 2) / 3) * 4];
        encode(bArr, i, i2, bArr2, 0);
        return bArr2;
    }

    private static void cencode(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        int i4 = i2 % 3;
        int i5 = (i2 - i4) + i;
        while (i < i5) {
            int i6 = i + 1;
            byte b = bArr[i];
            int i7 = i6 + 1;
            byte b2 = bArr[i6];
            int i8 = i7 + 1;
            byte b3 = bArr[i7];
            int i9 = i3 + 1;
            byte[] bArr2 = nibble2code;
            cArr[i3] = (char) bArr2[(b >>> 2) & 63];
            int i10 = i9 + 1;
            cArr[i9] = (char) bArr2[((b << 4) & 63) | ((b2 >>> 4) & 15)];
            int i11 = i10 + 1;
            cArr[i10] = (char) bArr2[((b2 << 2) & 63) | ((b3 >>> 6) & 3)];
            i3 = i11 + 1;
            cArr[i11] = (char) bArr2[b3 & Utf8.REPLACEMENT_BYTE];
            i = i8;
        }
        if (i4 != 0) {
            if (i4 == 1) {
                byte b4 = bArr[i];
                int i12 = i3 + 1;
                byte[] bArr3 = nibble2code;
                cArr[i3] = (char) bArr3[(b4 >>> 2) & 63];
                int i13 = i12 + 1;
                cArr[i12] = (char) bArr3[(b4 << 4) & 63];
                cArr[i13] = kam.h;
                cArr[i13 + 1] = kam.h;
                return;
            }
            if (i4 == 2) {
                int i14 = i + 1;
                byte b5 = bArr[i];
                byte b6 = bArr[i14];
                int i15 = i3 + 1;
                byte[] bArr4 = nibble2code;
                cArr[i3] = (char) bArr4[(b5 >>> 2) & 63];
                int i16 = i15 + 1;
                cArr[i15] = (char) bArr4[((b5 << 4) & 63) | ((b6 >>> 4) & 15)];
                cArr[i16] = (char) bArr4[(b6 << 2) & 63];
                cArr[i16 + 1] = kam.h;
                return;
            }
            throw new IllegalStateException("should not happen");
        }
    }

    private static void encode(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i2 % 3;
        int i5 = (i2 - i4) + i;
        while (i < i5) {
            int i6 = i + 1;
            byte b = bArr[i];
            int i7 = i6 + 1;
            byte b2 = bArr[i6];
            int i8 = i7 + 1;
            byte b3 = bArr[i7];
            int i9 = i3 + 1;
            byte[] bArr3 = nibble2code;
            bArr2[i3] = bArr3[(b >>> 2) & 63];
            int i10 = i9 + 1;
            bArr2[i9] = bArr3[((b << 4) & 63) | ((b2 >>> 4) & 15)];
            int i11 = i10 + 1;
            bArr2[i10] = bArr3[((b2 << 2) & 63) | ((b3 >>> 6) & 3)];
            i3 = i11 + 1;
            bArr2[i11] = bArr3[b3 & Utf8.REPLACEMENT_BYTE];
            i = i8;
        }
        if (i4 != 0) {
            if (i4 == 1) {
                byte b4 = bArr[i];
                int i12 = i3 + 1;
                byte[] bArr4 = nibble2code;
                bArr2[i3] = bArr4[(b4 >>> 2) & 63];
                int i13 = i12 + 1;
                bArr2[i12] = bArr4[(b4 << 4) & 63];
                bArr2[i13] = 61;
                bArr2[i13 + 1] = 61;
                return;
            }
            if (i4 == 2) {
                int i14 = i + 1;
                byte b5 = bArr[i];
                byte b6 = bArr[i14];
                int i15 = i3 + 1;
                byte[] bArr5 = nibble2code;
                bArr2[i3] = bArr5[(b5 >>> 2) & 63];
                int i16 = i15 + 1;
                bArr2[i15] = bArr5[((b5 << 4) & 63) | ((b6 >>> 4) & 15)];
                bArr2[i16] = bArr5[(b6 << 2) & 63];
                bArr2[i16 + 1] = 61;
                return;
            }
            throw new IllegalStateException("should not happen");
        }
    }

    public static int decodeTo(byte[] bArr, int i, String str, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (i3 % 4 != 0) {
            throw new IllegalArgumentException("Input block size is not 4");
        }
        int i4 = i2 + i3;
        int i5 = i3;
        while (true) {
            i4--;
            if (str.charAt(i4) != '=') {
                int i6 = (i5 * 3) / 4;
                decode(str, i2, i3, bArr, i, i6);
                return i6;
            }
            i5--;
        }
    }

    private static void cdecode(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5;
        int i6 = (i4 / 3) * 3;
        while (i3 < i6) {
            try {
                byte[] bArr2 = code2nibble;
                int i7 = (i == true ? 1 : 0) + 1;
                try {
                    byte b = bArr2[cArr[i == true ? 1 : 0]];
                    int i8 = i7 + 1;
                    try {
                        byte b2 = bArr2[cArr[i7]];
                        int i9 = i8 + 1;
                        try {
                            byte b3 = bArr2[cArr[i8]];
                            int i10 = i9 + 1;
                            try {
                                byte b4 = bArr2[cArr[i9]];
                                if (b >= 0 && b2 >= 0 && b3 >= 0 && b4 >= 0) {
                                    int i11 = i3 + 1;
                                    bArr[i3] = (byte) ((b << 2) | (b2 >>> 4));
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) ((b2 << 4) | (b3 >>> 2));
                                    i3 = i12 + 1;
                                    bArr[i12] = (byte) ((b3 << 6) | b4);
                                    i = i10;
                                } else {
                                    throw new IllegalArgumentException("Not B64 encoded");
                                }
                            } catch (IndexOutOfBoundsException unused) {
                                i = i10;
                                throw new IllegalArgumentException("char " + i + " was not B64 encoded");
                            }
                        } catch (IndexOutOfBoundsException unused2) {
                            i = i9;
                        }
                    } catch (IndexOutOfBoundsException unused3) {
                        i = i8;
                    }
                } catch (IndexOutOfBoundsException unused4) {
                    i = i7;
                }
            } catch (IndexOutOfBoundsException unused5) {
            }
        }
        if (i4 == i3 || (i5 = i4 % 3) == 0) {
            return;
        }
        int i13 = 1;
        try {
            if (i5 == 1) {
                byte[] bArr3 = code2nibble;
                i13 = (i == true ? 1 : 0) + 1;
                byte b5 = bArr3[cArr[i == true ? 1 : 0]];
                int i14 = i13 + 1;
                byte b6 = bArr3[cArr[i13]];
                if (b5 >= 0 && b6 >= 0) {
                    bArr[i3] = (byte) ((b6 >>> 4) | (b5 << 2));
                } else {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
            } else if (i5 == 2) {
                byte[] bArr4 = code2nibble;
                int i15 = (i == true ? 1 : 0) + 1;
                byte b7 = bArr4[cArr[i == true ? 1 : 0]];
                int i16 = i15 + 1;
                i13 = bArr4[cArr[i15]];
                int i17 = i16 + 1;
                byte b8 = bArr4[cArr[i16]];
                if (b7 >= 0 && i13 >= 0 && b8 >= 0) {
                    bArr[i3] = (byte) ((b7 << 2) | (i13 >>> 4));
                    bArr[i3 + 1] = (byte) ((b8 >>> 2) | (i13 << 4));
                } else {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
            } else {
                throw new IllegalStateException("should not happen");
            }
        } catch (IndexOutOfBoundsException unused6) {
            i = i13;
            throw new IllegalArgumentException("char " + i + " was not B64 encoded");
        }
    }

    private static void decode(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        int i6 = (i4 / 3) * 3;
        while (i3 < i6) {
            try {
                byte[] bArr3 = code2nibble;
                int i7 = (i == true ? 1 : 0) + 1;
                try {
                    byte b = bArr3[bArr[i == true ? 1 : 0]];
                    int i8 = i7 + 1;
                    try {
                        byte b2 = bArr3[bArr[i7]];
                        int i9 = i8 + 1;
                        try {
                            byte b3 = bArr3[bArr[i8]];
                            int i10 = i9 + 1;
                            try {
                                byte b4 = bArr3[bArr[i9]];
                                if (b >= 0 && b2 >= 0 && b3 >= 0 && b4 >= 0) {
                                    int i11 = i3 + 1;
                                    bArr2[i3] = (byte) ((b << 2) | (b2 >>> 4));
                                    int i12 = i11 + 1;
                                    bArr2[i11] = (byte) ((b2 << 4) | (b3 >>> 2));
                                    i3 = i12 + 1;
                                    bArr2[i12] = (byte) ((b3 << 6) | b4);
                                    i = i10;
                                } else {
                                    throw new IllegalArgumentException("Not B64 encoded");
                                }
                            } catch (IndexOutOfBoundsException unused) {
                                i = i10;
                                throw new IllegalArgumentException("char " + i + " was not B64 encoded");
                            }
                        } catch (IndexOutOfBoundsException unused2) {
                            i = i9;
                        }
                    } catch (IndexOutOfBoundsException unused3) {
                        i = i8;
                    }
                } catch (IndexOutOfBoundsException unused4) {
                    i = i7;
                }
            } catch (IndexOutOfBoundsException unused5) {
            }
        }
        if (i4 == i3 || (i5 = i4 % 3) == 0) {
            return;
        }
        int i13 = 1;
        try {
            if (i5 == 1) {
                byte[] bArr4 = code2nibble;
                i13 = (i == true ? 1 : 0) + 1;
                byte b5 = bArr4[bArr[i == true ? 1 : 0]];
                int i14 = i13 + 1;
                byte b6 = bArr4[bArr[i13]];
                if (b5 >= 0 && b6 >= 0) {
                    bArr2[i3] = (byte) ((b6 >>> 4) | (b5 << 2));
                } else {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
            } else if (i5 == 2) {
                byte[] bArr5 = code2nibble;
                int i15 = (i == true ? 1 : 0) + 1;
                byte b7 = bArr5[bArr[i == true ? 1 : 0]];
                int i16 = i15 + 1;
                i13 = bArr5[bArr[i15]];
                int i17 = i16 + 1;
                byte b8 = bArr5[bArr[i16]];
                if (b7 >= 0 && i13 >= 0 && b8 >= 0) {
                    bArr2[i3] = (byte) ((b7 << 2) | (i13 >>> 4));
                    bArr2[i3 + 1] = (byte) ((b8 >>> 2) | (i13 << 4));
                } else {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
            } else {
                throw new IllegalStateException("should not happen");
            }
        } catch (IndexOutOfBoundsException unused6) {
            i = i13;
            throw new IllegalArgumentException("char " + i + " was not B64 encoded");
        }
    }

    public static LinkedBuffer encode(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int i3 = ((i2 + 2) / 3) * 4;
        writeSession.size += i3;
        byte[] bArr2 = linkedBuffer.buffer;
        int length = bArr2.length;
        int i4 = linkedBuffer.offset;
        int i5 = length - i4;
        if (i3 > i5) {
            int i6 = i5 / 4;
            if (i6 == 0) {
                int i7 = writeSession.nextBufferSize;
                if (i3 > i7) {
                    byte[] bArr3 = new byte[i3];
                    encode(bArr, i, i2, bArr3, 0);
                    return new LinkedBuffer(writeSession.nextBufferSize, new LinkedBuffer(bArr3, 0, i3, linkedBuffer));
                }
                byte[] bArr4 = new byte[i7];
                encode(bArr, i, i2, bArr4, 0);
                return new LinkedBuffer(bArr4, 0, i3, linkedBuffer);
            }
            int i8 = i;
            while (true) {
                int i9 = i6 - 1;
                if (i6 <= 0) {
                    break;
                }
                int i10 = i8 + 1;
                byte b = bArr[i8];
                int i11 = i10 + 1;
                byte b2 = bArr[i10];
                int i12 = i11 + 1;
                byte b3 = bArr[i11];
                int i13 = i4 + 1;
                byte[] bArr5 = nibble2code;
                bArr2[i4] = bArr5[(b >>> 2) & 63];
                int i14 = i13 + 1;
                bArr2[i13] = bArr5[((b << 4) & 63) | ((b2 >>> 4) & 15)];
                int i15 = i14 + 1;
                bArr2[i14] = bArr5[((b2 << 2) & 63) | ((b3 >>> 6) & 3)];
                i4 = i15 + 1;
                bArr2[i15] = bArr5[b3 & Utf8.REPLACEMENT_BYTE];
                i6 = i9;
                i8 = i12;
            }
            int i16 = i2 - (i8 - i);
            int i17 = i3 - (i4 - linkedBuffer.offset);
            linkedBuffer.offset = i4;
            int i18 = writeSession.nextBufferSize;
            if (i17 > i18) {
                byte[] bArr6 = new byte[i17];
                encode(bArr, i8, i16, bArr6, 0);
                return new LinkedBuffer(writeSession.nextBufferSize, new LinkedBuffer(bArr6, 0, i17, linkedBuffer));
            }
            byte[] bArr7 = new byte[i18];
            encode(bArr, i8, i16, bArr7, 0);
            return new LinkedBuffer(bArr7, 0, i17, linkedBuffer);
        }
        encode(bArr, i, i2, bArr2, i4);
        linkedBuffer.offset += i3;
        return linkedBuffer;
    }

    public static byte[] decode(String str) {
        return decode(str, 0, str.length());
    }

    public static byte[] decode(String str, int i, int i2) {
        if (i2 == 0) {
            return new byte[0];
        }
        if (i2 % 4 != 0) {
            throw new IllegalArgumentException("Input block size is not 4");
        }
        int i3 = i + i2;
        int i4 = i2;
        while (true) {
            i3--;
            if (str.charAt(i3) != '=') {
                int i5 = (i4 * 3) / 4;
                byte[] bArr = new byte[i5];
                decode(str, i, i2, bArr, 0, i5);
                return bArr;
            }
            i4--;
        }
    }

    private static void decode(String str, int i, int i2, byte[] bArr, int i3, int i4) {
        int i5;
        int i6 = (i4 / 3) * 3;
        while (i3 < i6) {
            try {
                byte[] bArr2 = code2nibble;
                int i7 = (i == true ? 1 : 0) + 1;
                try {
                    byte b = bArr2[str.charAt(i == true ? 1 : 0)];
                    int i8 = i7 + 1;
                    try {
                        byte b2 = bArr2[str.charAt(i7)];
                        int i9 = i8 + 1;
                        try {
                            byte b3 = bArr2[str.charAt(i8)];
                            int i10 = i9 + 1;
                            try {
                                byte b4 = bArr2[str.charAt(i9)];
                                if (b >= 0 && b2 >= 0 && b3 >= 0 && b4 >= 0) {
                                    int i11 = i3 + 1;
                                    bArr[i3] = (byte) ((b << 2) | (b2 >>> 4));
                                    int i12 = i11 + 1;
                                    bArr[i11] = (byte) ((b2 << 4) | (b3 >>> 2));
                                    i3 = i12 + 1;
                                    bArr[i12] = (byte) ((b3 << 6) | b4);
                                    i = i10;
                                } else {
                                    throw new IllegalArgumentException("Not B64 encoded");
                                }
                            } catch (IndexOutOfBoundsException unused) {
                                i = i10;
                                throw new IllegalArgumentException("char " + i + " was not B64 encoded");
                            }
                        } catch (IndexOutOfBoundsException unused2) {
                            i = i9;
                        }
                    } catch (IndexOutOfBoundsException unused3) {
                        i = i8;
                    }
                } catch (IndexOutOfBoundsException unused4) {
                    i = i7;
                }
            } catch (IndexOutOfBoundsException unused5) {
            }
        }
        if (i4 == i3 || (i5 = i4 % 3) == 0) {
            return;
        }
        int i13 = 1;
        try {
            if (i5 == 1) {
                byte[] bArr3 = code2nibble;
                i13 = (i == true ? 1 : 0) + 1;
                byte b5 = bArr3[str.charAt(i == true ? 1 : 0)];
                int i14 = i13 + 1;
                byte b6 = bArr3[str.charAt(i13)];
                if (b5 >= 0 && b6 >= 0) {
                    bArr[i3] = (byte) ((b6 >>> 4) | (b5 << 2));
                } else {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
            } else if (i5 == 2) {
                byte[] bArr4 = code2nibble;
                int i15 = (i == true ? 1 : 0) + 1;
                byte b7 = bArr4[str.charAt(i == true ? 1 : 0)];
                int i16 = i15 + 1;
                i13 = bArr4[str.charAt(i15)];
                int i17 = i16 + 1;
                byte b8 = bArr4[str.charAt(i16)];
                if (b7 >= 0 && i13 >= 0 && b8 >= 0) {
                    bArr[i3] = (byte) ((b7 << 2) | (i13 >>> 4));
                    bArr[i3 + 1] = (byte) ((b8 >>> 2) | (i13 << 4));
                } else {
                    throw new IllegalArgumentException("Not B64 encoded");
                }
            } else {
                throw new IllegalStateException("should not happen");
            }
        } catch (IndexOutOfBoundsException unused6) {
            i = i13;
            throw new IllegalArgumentException("char " + i + " was not B64 encoded");
        }
    }
}
