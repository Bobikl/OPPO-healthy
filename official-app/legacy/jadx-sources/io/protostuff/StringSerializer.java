package io.protostuff;

import com.heytap.nearx.uikit.scroll.NearNestedScrollableHost;
import com.oplus.aiunit.vision.oei;
import java.io.UTFDataFormatException;
import java.io.UnsupportedEncodingException;
import okio.Utf8;

/* JADX INFO: loaded from: classes10.dex */
public final class StringSerializer {
    static final int FIVE_BYTE_LOWER_LIMIT = 268435456;
    static final int FOUR_BYTE_EXCLUSIVE = 89478486;
    static final int FOUR_BYTE_LOWER_LIMIT = 2097152;
    static final int ONE_BYTE_EXCLUSIVE = 43;
    static final int THREE_BYTE_EXCLUSIVE = 699051;
    static final int THREE_BYTE_LOWER_LIMIT = 16384;
    static final int TWO_BYTE_EXCLUSIVE = 5462;
    static final int TWO_BYTE_LOWER_LIMIT = 128;
    static final int[] sizeTable = {9, 99, 999, 9999, 99999, NearNestedScrollableHost.CUSTOM, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    static final char[] DigitTens = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
    static final char[] DigitOnes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final byte[] INT_MIN_VALUE = {45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 56};
    static final byte[] LONG_MIN_VALUE = {45, 57, 50, 50, 51, 51, 55, 50, 48, 51, 54, 56, 53, 52, 55, 55, 53, 56, 48, 56};

    public static final class STRING {
        static final boolean CESU8_COMPAT = Boolean.getBoolean("io.protostuff.cesu8_compat");

        private STRING() {
        }

        public static String deser(byte[] bArr) {
            return deser(bArr, 0, bArr.length);
        }

        public static String deserCustomOnly(byte[] bArr) {
            try {
                return readUTF(bArr, 0, bArr.length);
            } catch (UTFDataFormatException e2) {
                throw new RuntimeException(e2);
            }
        }

        private static String readUTF(byte[] bArr, int i, int i2) throws UTFDataFormatException {
            int i3;
            char[] cArr = new char[i2];
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                int i6 = bArr[i + i4] & 255;
                if (i6 > 127) {
                    break;
                }
                cArr[i5] = (char) i6;
                i4++;
                i5++;
            }
            while (i4 < i2) {
                int i7 = bArr[i + i4] & 255;
                int i8 = i7 >> 4;
                if (i8 <= 7) {
                    cArr[i5] = (char) i7;
                    i4++;
                    i5++;
                } else if (i8 == 12 || i8 == 13) {
                    i4 += 2;
                    if (i4 > i2) {
                        throw new UTFDataFormatException("Malformed input: Partial character at end");
                    }
                    byte b = bArr[(i + i4) - 1];
                    if ((b & 192) != 128) {
                        throw new UTFDataFormatException("Malformed input around byte " + i4);
                    }
                    i3 = i5 + 1;
                    cArr[i5] = (char) (((i7 & 31) << 6) | (b & Utf8.REPLACEMENT_BYTE));
                    i5 = i3;
                } else if (i8 == 14) {
                    i4 += 3;
                    if (i4 > i2) {
                        throw new UTFDataFormatException("Malformed input: Partial character at end");
                    }
                    int i9 = i + i4;
                    byte b2 = bArr[i9 - 2];
                    byte b3 = bArr[i9 - 1];
                    if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Malformed input around byte ");
                        sb.append(i4 - 1);
                        throw new UTFDataFormatException(sb.toString());
                    }
                    i3 = i5 + 1;
                    cArr[i5] = (char) (((i7 & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                    i5 = i3;
                } else {
                    if ((i7 >> 3) != 30) {
                        throw new UTFDataFormatException("Malformed input at byte " + i4);
                    }
                    i4 += 4;
                    if (i4 > i2) {
                        throw new UTFDataFormatException("Malformed input: Partial character at end");
                    }
                    int i10 = i + i4;
                    int i11 = ((i7 & 7) << 18) | ((bArr[i10 - 3] & Utf8.REPLACEMENT_BYTE) << 12) | ((bArr[i10 - 2] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i10 - 1] & Utf8.REPLACEMENT_BYTE);
                    int i12 = i5 + 1;
                    cArr[i5] = StringSerializer.highSurrogate(i11);
                    i5 = i12 + 1;
                    cArr[i12] = StringSerializer.lowSurrogate(i11);
                }
            }
            return new String(cArr, 0, i5);
        }

        public static byte[] ser(String str) {
            try {
                return str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }

        public static String deser(byte[] bArr, int i, int i2) {
            try {
                String str = new String(bArr, i, i2, "UTF-8");
                if (CESU8_COMPAT && str.indexOf(65533) != -1) {
                    try {
                        return readUTF(bArr, i, i2);
                    } catch (UTFDataFormatException unused) {
                    }
                }
                return str;
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private StringSerializer() {
    }

    public static int computeUTF8Size(CharSequence charSequence, int i, int i2) {
        int i3 = i2;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt >= 128) {
                i3 = cCharAt < 2048 ? i3 + 1 : i3 + 2;
            }
            i++;
        }
        return i3;
    }

    public static char highSurrogate(int i) {
        return (char) ((i >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
    }

    public static char lowSurrogate(int i) {
        return (char) ((i & 1023) + 56320);
    }

    public static void putBytesFromInt(int i, int i2, int i3, byte[] bArr) {
        int i4;
        int i5 = i2 + i3;
        if (i < 0) {
            i = -i;
            i4 = 45;
        } else {
            i4 = 0;
        }
        while (i >= 65536) {
            int i6 = i / 100;
            int i7 = i - (((i6 << 6) + (i6 << 5)) + (i6 << 2));
            int i8 = i5 - 1;
            bArr[i8] = (byte) DigitOnes[i7];
            i5 = i8 - 1;
            bArr[i5] = (byte) DigitTens[i7];
            i = i6;
        }
        while (true) {
            int i9 = (52429 * i) >>> 19;
            i5--;
            bArr[i5] = (byte) digits[i - ((i9 << 3) + (i9 << 1))];
            if (i9 == 0) {
                break;
            } else {
                i = i9;
            }
        }
        if (i4 != 0) {
            bArr[i5 - 1] = (byte) i4;
        }
    }

    public static void putBytesFromLong(long j2, int i, int i2, byte[] bArr) {
        int i3;
        int i4 = i + i2;
        if (j2 < 0) {
            j2 = -j2;
            i3 = 45;
        } else {
            i3 = 0;
        }
        while (j2 > 2147483647L) {
            long j3 = j2 / 100;
            int i5 = (int) (j2 - (((j3 << 6) + (j3 << 5)) + (j3 << 2)));
            int i6 = i4 - 1;
            bArr[i6] = (byte) DigitOnes[i5];
            i4 = i6 - 1;
            bArr[i4] = (byte) DigitTens[i5];
            j2 = j3;
        }
        int i7 = (int) j2;
        while (i7 >= 65536) {
            int i8 = i7 / 100;
            int i9 = i7 - (((i8 << 6) + (i8 << 5)) + (i8 << 2));
            int i10 = i4 - 1;
            bArr[i10] = (byte) DigitOnes[i9];
            i4 = i10 - 1;
            bArr[i4] = (byte) DigitTens[i9];
            i7 = i8;
        }
        while (true) {
            int i11 = (52429 * i7) >>> 19;
            i4--;
            bArr[i4] = (byte) digits[i7 - ((i11 << 3) + (i11 << 1))];
            if (i11 == 0) {
                break;
            } else {
                i7 = i11;
            }
        }
        if (i3 != 0) {
            bArr[i4 - 1] = (byte) i3;
        }
    }

    public static int stringSize(long j2) {
        long j3 = 10;
        for (int i = 1; i < 19; i++) {
            if (j2 < j3) {
                return i;
            }
            j3 *= 10;
        }
        return 19;
    }

    public static LinkedBuffer writeAscii(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int length = charSequence.length();
        if (length == 0) {
            return linkedBuffer;
        }
        byte[] bArr = linkedBuffer.buffer;
        int i = linkedBuffer.offset;
        int length2 = bArr.length;
        writeSession.size += length;
        int i2 = 0;
        if (i + length > length2) {
            int i3 = 0;
            while (i3 < length) {
                if (i == length2) {
                    linkedBuffer.offset = i;
                    int i4 = writeSession.nextBufferSize;
                    byte[] bArr2 = new byte[i4];
                    linkedBuffer = new LinkedBuffer(bArr2, 0, linkedBuffer);
                    length2 = i4;
                    bArr = bArr2;
                    i = 0;
                }
                bArr[i] = (byte) charSequence.charAt(i3);
                i3++;
                i++;
            }
        } else {
            while (i2 < length) {
                bArr[i] = (byte) charSequence.charAt(i2);
                i2++;
                i++;
            }
        }
        linkedBuffer.offset = i;
        return linkedBuffer;
    }

    public static LinkedBuffer writeDouble(double d, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        return writeAscii(Double.toString(d), writeSession, linkedBuffer);
    }

    public static void writeFixed2ByteInt(int i, byte[] bArr, int i2, boolean z) {
        if (z) {
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) ((i >>> 8) & 255);
        } else {
            bArr[i2] = (byte) ((i >>> 8) & 255);
            bArr[i2 + 1] = (byte) i;
        }
    }

    public static LinkedBuffer writeFloat(float f, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        return writeAscii(Float.toString(f), writeSession, linkedBuffer);
    }

    public static LinkedBuffer writeInt(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        if (i != Integer.MIN_VALUE) {
            int iStringSize = i < 0 ? stringSize(-i) + 1 : stringSize(i);
            if (linkedBuffer.offset + iStringSize > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            putBytesFromInt(i, linkedBuffer.offset, iStringSize, linkedBuffer.buffer);
            linkedBuffer.offset += iStringSize;
            writeSession.size += iStringSize;
            return linkedBuffer;
        }
        byte[] bArr = INT_MIN_VALUE;
        int length = bArr.length;
        if (linkedBuffer.offset + length > linkedBuffer.buffer.length) {
            linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }
        System.arraycopy(bArr, 0, linkedBuffer.buffer, linkedBuffer.offset, length);
        linkedBuffer.offset += length;
        writeSession.size += length;
        return linkedBuffer;
    }

    public static LinkedBuffer writeLong(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        if (j2 != Long.MIN_VALUE) {
            int iStringSize = j2 < 0 ? stringSize(-j2) + 1 : stringSize(j2);
            if (linkedBuffer.offset + iStringSize > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            putBytesFromLong(j2, linkedBuffer.offset, iStringSize, linkedBuffer.buffer);
            linkedBuffer.offset += iStringSize;
            writeSession.size += iStringSize;
            return linkedBuffer;
        }
        byte[] bArr = LONG_MIN_VALUE;
        int length = bArr.length;
        if (linkedBuffer.offset + length > linkedBuffer.buffer.length) {
            linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }
        System.arraycopy(bArr, 0, linkedBuffer.buffer, linkedBuffer.offset, length);
        linkedBuffer.offset += length;
        writeSession.size += length;
        return linkedBuffer;
    }

    public static LinkedBuffer writeUTF8(CharSequence charSequence, int i, int i2, byte[] bArr, int i3, int i4, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        while (true) {
            char c2 = 0;
            while (i != i2 && i3 != i4) {
                int i5 = i + 1;
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    c2 = cCharAt;
                    i = i5;
                    break;
                }
                bArr[i3] = (byte) cCharAt;
                i3++;
                c2 = cCharAt;
                i = i5;
            }
            if (i == i2 && c2 < 128) {
                writeSession.size += i3 - linkedBuffer.offset;
                linkedBuffer.offset = i3;
                return linkedBuffer;
            }
            if (i3 == i4) {
                writeSession.size += i3 - linkedBuffer.offset;
                linkedBuffer.offset = i3;
                LinkedBuffer linkedBuffer2 = linkedBuffer.next;
                if (linkedBuffer2 == null) {
                    int i6 = writeSession.nextBufferSize;
                    byte[] bArr2 = new byte[i6];
                    linkedBuffer = new LinkedBuffer(bArr2, 0, linkedBuffer);
                    i4 = i6;
                    bArr = bArr2;
                    i3 = 0;
                } else {
                    i3 = linkedBuffer2.start;
                    linkedBuffer2.offset = i3;
                    byte[] bArr3 = linkedBuffer2.buffer;
                    linkedBuffer = linkedBuffer2;
                    bArr = bArr3;
                    i4 = bArr3.length;
                }
            } else if (c2 < 2048) {
                if (i3 == i4) {
                    writeSession.size += i3 - linkedBuffer.offset;
                    linkedBuffer.offset = i3;
                    LinkedBuffer linkedBuffer3 = linkedBuffer.next;
                    if (linkedBuffer3 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i3 = 0;
                    } else {
                        i3 = linkedBuffer3.start;
                        linkedBuffer3.offset = i3;
                        byte[] bArr4 = linkedBuffer3.buffer;
                        linkedBuffer = linkedBuffer3;
                        bArr = bArr4;
                        i4 = bArr4.length;
                    }
                }
                int i7 = i3 + 1;
                bArr[i3] = (byte) (((c2 >> 6) & 31) | 192);
                if (i7 == i4) {
                    writeSession.size += i7 - linkedBuffer.offset;
                    linkedBuffer.offset = i7;
                    LinkedBuffer linkedBuffer4 = linkedBuffer.next;
                    if (linkedBuffer4 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i7 = 0;
                    } else {
                        i7 = linkedBuffer4.start;
                        linkedBuffer4.offset = i7;
                        byte[] bArr5 = linkedBuffer4.buffer;
                        i4 = bArr5.length;
                        linkedBuffer = linkedBuffer4;
                        bArr = bArr5;
                    }
                }
                i3 = i7 + 1;
                bArr[i7] = (byte) (((c2 >> 0) & 63) | 128);
            } else if (Character.isHighSurrogate(c2) && i < i2 && Character.isLowSurrogate(charSequence.charAt(i))) {
                if (i3 == i4) {
                    writeSession.size += i3 - linkedBuffer.offset;
                    linkedBuffer.offset = i3;
                    LinkedBuffer linkedBuffer5 = linkedBuffer.next;
                    if (linkedBuffer5 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i3 = 0;
                    } else {
                        i3 = linkedBuffer5.start;
                        linkedBuffer5.offset = i3;
                        byte[] bArr6 = linkedBuffer5.buffer;
                        linkedBuffer = linkedBuffer5;
                        bArr = bArr6;
                        i4 = bArr6.length;
                    }
                }
                int codePoint = Character.toCodePoint(c2, charSequence.charAt(i));
                int i8 = i3 + 1;
                bArr[i3] = (byte) (((codePoint >> 18) & 7) | 240);
                if (i8 == i4) {
                    writeSession.size += i8 - linkedBuffer.offset;
                    linkedBuffer.offset = i8;
                    LinkedBuffer linkedBuffer6 = linkedBuffer.next;
                    if (linkedBuffer6 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i8 = 0;
                    } else {
                        i8 = linkedBuffer6.start;
                        linkedBuffer6.offset = i8;
                        byte[] bArr7 = linkedBuffer6.buffer;
                        i4 = bArr7.length;
                        linkedBuffer = linkedBuffer6;
                        bArr = bArr7;
                    }
                }
                int i9 = i8 + 1;
                bArr[i8] = (byte) (((codePoint >> 12) & 63) | 128);
                if (i9 == i4) {
                    writeSession.size += i9 - linkedBuffer.offset;
                    linkedBuffer.offset = i9;
                    LinkedBuffer linkedBuffer7 = linkedBuffer.next;
                    if (linkedBuffer7 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i9 = 0;
                    } else {
                        i9 = linkedBuffer7.start;
                        linkedBuffer7.offset = i9;
                        byte[] bArr8 = linkedBuffer7.buffer;
                        linkedBuffer = linkedBuffer7;
                        bArr = bArr8;
                        i4 = bArr8.length;
                    }
                }
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((codePoint >> 6) & 63) | 128);
                if (i10 == i4) {
                    writeSession.size += i10 - linkedBuffer.offset;
                    linkedBuffer.offset = i10;
                    LinkedBuffer linkedBuffer8 = linkedBuffer.next;
                    if (linkedBuffer8 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i10 = 0;
                    } else {
                        i10 = linkedBuffer8.start;
                        linkedBuffer8.offset = i10;
                        byte[] bArr9 = linkedBuffer8.buffer;
                        i4 = bArr9.length;
                        linkedBuffer = linkedBuffer8;
                        bArr = bArr9;
                    }
                }
                i3 = i10 + 1;
                bArr[i10] = (byte) (((codePoint >> 0) & 63) | 128);
                i++;
            } else {
                if (i3 == i4) {
                    writeSession.size += i3 - linkedBuffer.offset;
                    linkedBuffer.offset = i3;
                    LinkedBuffer linkedBuffer9 = linkedBuffer.next;
                    if (linkedBuffer9 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i3 = 0;
                    } else {
                        i3 = linkedBuffer9.start;
                        linkedBuffer9.offset = i3;
                        byte[] bArr10 = linkedBuffer9.buffer;
                        linkedBuffer = linkedBuffer9;
                        bArr = bArr10;
                        i4 = bArr10.length;
                    }
                }
                int i11 = i3 + 1;
                bArr[i3] = (byte) (((c2 >> '\f') & 15) | oei.TAI_CHI);
                if (i11 == i4) {
                    writeSession.size += i11 - linkedBuffer.offset;
                    linkedBuffer.offset = i11;
                    LinkedBuffer linkedBuffer10 = linkedBuffer.next;
                    if (linkedBuffer10 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i11 = 0;
                    } else {
                        i11 = linkedBuffer10.start;
                        linkedBuffer10.offset = i11;
                        byte[] bArr11 = linkedBuffer10.buffer;
                        i4 = bArr11.length;
                        linkedBuffer = linkedBuffer10;
                        bArr = bArr11;
                    }
                }
                int i12 = i11 + 1;
                bArr[i11] = (byte) (((c2 >> 6) & 63) | 128);
                if (i12 == i4) {
                    writeSession.size += i12 - linkedBuffer.offset;
                    linkedBuffer.offset = i12;
                    LinkedBuffer linkedBuffer11 = linkedBuffer.next;
                    if (linkedBuffer11 == null) {
                        i4 = writeSession.nextBufferSize;
                        bArr = new byte[i4];
                        linkedBuffer = new LinkedBuffer(bArr, 0, linkedBuffer);
                        i12 = 0;
                    } else {
                        i12 = linkedBuffer11.start;
                        linkedBuffer11.offset = i12;
                        byte[] bArr12 = linkedBuffer11.buffer;
                        linkedBuffer = linkedBuffer11;
                        bArr = bArr12;
                        i4 = bArr12.length;
                    }
                }
                bArr[i12] = (byte) (((c2 >> 0) & 63) | 128);
                i3 = i12 + 1;
            }
        }
    }

    public static LinkedBuffer writeUTF8FixedDelimited(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        return writeUTF8FixedDelimited(charSequence, false, writeSession, linkedBuffer);
    }

    private static LinkedBuffer writeUTF8OneByteDelimited(CharSequence charSequence, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int i3 = writeSession.size;
        int i4 = linkedBuffer.offset;
        byte[] bArr = linkedBuffer.buffer;
        if (i4 == bArr.length) {
            int i5 = i2 + 1;
            int i6 = writeSession.nextBufferSize;
            if (i5 <= i6) {
                i5 = i6;
            }
            LinkedBuffer linkedBuffer2 = new LinkedBuffer(i5, linkedBuffer);
            linkedBuffer2.offset = 1;
            LinkedBuffer linkedBufferWriteUTF8 = writeUTF8(charSequence, i, i2, writeSession, linkedBuffer2);
            byte[] bArr2 = linkedBuffer2.buffer;
            int i7 = writeSession.size;
            bArr2[0] = (byte) (i7 - i3);
            writeSession.size = i7 + 1;
            return linkedBufferWriteUTF8;
        }
        int i8 = i4 + 1;
        if (i8 + i2 > bArr.length) {
            linkedBuffer.offset = i8;
            LinkedBuffer linkedBufferWriteUTF9 = writeUTF8(charSequence, i, i2, bArr, i8, bArr.length, writeSession, linkedBuffer);
            int i9 = writeSession.size;
            bArr[i8 - 1] = (byte) (i9 - i3);
            writeSession.size = i9 + 1;
            return linkedBufferWriteUTF9;
        }
        linkedBuffer.offset = i8;
        LinkedBuffer linkedBufferWriteUTF10 = writeUTF8(charSequence, i, i2, writeSession, linkedBuffer);
        int i10 = writeSession.size;
        linkedBuffer.buffer[i8 - 1] = (byte) (i10 - i3);
        writeSession.size = i10 + 1;
        return linkedBufferWriteUTF10;
    }

    private static LinkedBuffer writeUTF8VarDelimited(CharSequence charSequence, int i, int i2, int i3, int i4, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int i5;
        int i6;
        int i7;
        int i8 = writeSession.size;
        int i9 = linkedBuffer.offset;
        int i10 = i9 + i4;
        byte[] bArr = linkedBuffer.buffer;
        if (i10 > bArr.length) {
            int i11 = i2 + i4;
            int i12 = writeSession.nextBufferSize;
            if (i11 <= i12) {
                i11 = i12;
            }
            LinkedBuffer linkedBuffer2 = new LinkedBuffer(i11, linkedBuffer);
            int i13 = linkedBuffer2.start;
            int i14 = i13 + i4;
            linkedBuffer2.offset = i14;
            LinkedBuffer linkedBufferWriteUTF8 = writeUTF8(charSequence, i, i2, writeSession, linkedBuffer2);
            int i15 = writeSession.size - i8;
            if (i15 < i3) {
                byte[] bArr2 = linkedBuffer2.buffer;
                System.arraycopy(bArr2, i14, bArr2, i14 - 1, linkedBuffer2.offset - i14);
                i7 = i4 - 1;
                linkedBuffer2.offset--;
            } else {
                i7 = i4;
            }
            writeSession.size += i7;
            while (true) {
                i7--;
                if (i7 <= 0) {
                    linkedBuffer2.buffer[i13] = (byte) i15;
                    return linkedBufferWriteUTF8;
                }
                linkedBuffer2.buffer[i13] = (byte) ((i15 & 127) | 128);
                i15 >>>= 7;
                i13++;
            }
        } else if (i10 + i2 > bArr.length) {
            linkedBuffer.offset = i10;
            LinkedBuffer linkedBufferWriteUTF9 = writeUTF8(charSequence, i, i2, bArr, i10, bArr.length, writeSession, linkedBuffer);
            int i16 = writeSession.size - i8;
            if (i16 < i3) {
                byte[] bArr3 = linkedBuffer.buffer;
                System.arraycopy(bArr3, i10, bArr3, i10 - 1, linkedBuffer.offset - i10);
                i6 = i4 - 1;
                linkedBuffer.offset--;
            } else {
                i6 = i4;
            }
            writeSession.size += i6;
            while (true) {
                i6--;
                if (i6 <= 0) {
                    linkedBuffer.buffer[i9] = (byte) i16;
                    return linkedBufferWriteUTF9;
                }
                linkedBuffer.buffer[i9] = (byte) ((i16 & 127) | 128);
                i16 >>>= 7;
                i9++;
            }
        } else {
            linkedBuffer.offset = i10;
            LinkedBuffer linkedBufferWriteUTF10 = writeUTF8(charSequence, i, i2, writeSession, linkedBuffer);
            int i17 = writeSession.size - i8;
            if (i17 < i3) {
                byte[] bArr4 = linkedBuffer.buffer;
                System.arraycopy(bArr4, i10, bArr4, i10 - 1, linkedBuffer.offset - i10);
                i5 = i4 - 1;
                linkedBuffer.offset--;
            } else {
                i5 = i4;
            }
            writeSession.size += i5;
            while (true) {
                i5--;
                if (i5 <= 0) {
                    linkedBuffer.buffer[i9] = (byte) i17;
                    return linkedBufferWriteUTF10;
                }
                linkedBuffer.buffer[i9] = (byte) ((i17 & 127) | 128);
                i17 >>>= 7;
                i9++;
            }
        }
    }

    public static int stringSize(int i) {
        int i2 = 0;
        while (i > sizeTable[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    public static LinkedBuffer writeUTF8FixedDelimited(CharSequence charSequence, boolean z, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int i = writeSession.size;
        int length = charSequence.length();
        int i2 = linkedBuffer.offset;
        int i3 = i2 + 2;
        byte[] bArr = linkedBuffer.buffer;
        if (i3 > bArr.length) {
            int i4 = length + 2;
            int i5 = writeSession.nextBufferSize;
            if (i4 <= i5) {
                i4 = i5;
            }
            LinkedBuffer linkedBuffer2 = new LinkedBuffer(i4, linkedBuffer);
            linkedBuffer2.offset = 2;
            if (length == 0) {
                writeFixed2ByteInt(0, linkedBuffer2.buffer, 0, z);
                writeSession.size += 2;
                return linkedBuffer2;
            }
            LinkedBuffer linkedBufferWriteUTF8 = writeUTF8(charSequence, 0, length, writeSession, linkedBuffer2);
            writeFixed2ByteInt(writeSession.size - i, linkedBuffer2.buffer, 0, z);
            writeSession.size += 2;
            return linkedBufferWriteUTF8;
        }
        if (length == 0) {
            writeFixed2ByteInt(0, bArr, i2, z);
            linkedBuffer.offset = i3;
            writeSession.size += 2;
            return linkedBuffer;
        }
        if (i3 + length > bArr.length) {
            linkedBuffer.offset = i3;
            LinkedBuffer linkedBufferWriteUTF9 = writeUTF8(charSequence, 0, length, bArr, i3, bArr.length, writeSession, linkedBuffer);
            writeFixed2ByteInt(writeSession.size - i, linkedBuffer.buffer, i3 - 2, z);
            writeSession.size += 2;
            return linkedBufferWriteUTF9;
        }
        linkedBuffer.offset = i3;
        LinkedBuffer linkedBufferWriteUTF10 = writeUTF8(charSequence, 0, length, writeSession, linkedBuffer);
        writeFixed2ByteInt(writeSession.size - i, linkedBuffer.buffer, i3 - 2, z);
        writeSession.size += 2;
        return linkedBufferWriteUTF10;
    }

    public static LinkedBuffer writeUTF8VarDelimited(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int length = charSequence.length();
        if (length == 0) {
            if (linkedBuffer.offset == linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            byte[] bArr = linkedBuffer.buffer;
            int i = linkedBuffer.offset;
            linkedBuffer.offset = i + 1;
            bArr[i] = 0;
            writeSession.size++;
            return linkedBuffer;
        }
        if (length < 43) {
            return writeUTF8OneByteDelimited(charSequence, 0, length, writeSession, linkedBuffer);
        }
        if (length < TWO_BYTE_EXCLUSIVE) {
            return writeUTF8VarDelimited(charSequence, 0, length, 128, 2, writeSession, linkedBuffer);
        }
        if (length < THREE_BYTE_EXCLUSIVE) {
            return writeUTF8VarDelimited(charSequence, 0, length, 16384, 3, writeSession, linkedBuffer);
        }
        if (length < FOUR_BYTE_EXCLUSIVE) {
            return writeUTF8VarDelimited(charSequence, 0, length, 2097152, 4, writeSession, linkedBuffer);
        }
        return writeUTF8VarDelimited(charSequence, 0, length, 268435456, 5, writeSession, linkedBuffer);
    }

    public static LinkedBuffer writeUTF8(CharSequence charSequence, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        byte[] bArr = linkedBuffer.buffer;
        int i3 = linkedBuffer.offset;
        int i4 = i3 + i2;
        int i5 = i3;
        while (true) {
            char c2 = 0;
            while (i != i2) {
                int i6 = i + 1;
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= 128) {
                    c2 = cCharAt;
                    i = i6;
                    break;
                }
                bArr[i5] = (byte) cCharAt;
                i5++;
                c2 = cCharAt;
                i = i6;
            }
            if (i == i2 && c2 < 128) {
                writeSession.size += i5 - linkedBuffer.offset;
                linkedBuffer.offset = i5;
                return linkedBuffer;
            }
            if (c2 < 2048) {
                i4++;
                if (i4 > bArr.length) {
                    writeSession.size += i5 - linkedBuffer.offset;
                    linkedBuffer.offset = i5;
                    return writeUTF8(charSequence, i - 1, i2, bArr, i5, bArr.length, writeSession, linkedBuffer);
                }
                int i7 = i5 + 1;
                bArr[i5] = (byte) (((c2 >> 6) & 31) | 192);
                i5 = i7 + 1;
                bArr[i7] = (byte) (((c2 >> 0) & 63) | 128);
            } else {
                char c3 = c2;
                if (Character.isHighSurrogate(c3) && i < i2 && Character.isLowSurrogate(charSequence.charAt(i))) {
                    i4 += 3;
                    if (i4 > bArr.length) {
                        writeSession.size += i5 - linkedBuffer.offset;
                        linkedBuffer.offset = i5;
                        return writeUTF8(charSequence, i - 1, i2, bArr, i5, bArr.length, writeSession, linkedBuffer);
                    }
                    int codePoint = Character.toCodePoint(c3, charSequence.charAt(i));
                    int i8 = i5 + 1;
                    bArr[i5] = (byte) (((codePoint >> 18) & 7) | 240);
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) (((codePoint >> 12) & 63) | 128);
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) (((codePoint >> 6) & 63) | 128);
                    i5 = i10 + 1;
                    bArr[i10] = (byte) (((codePoint >> 0) & 63) | 128);
                    i++;
                } else {
                    i4 += 2;
                    if (i4 > bArr.length) {
                        writeSession.size += i5 - linkedBuffer.offset;
                        linkedBuffer.offset = i5;
                        return writeUTF8(charSequence, i - 1, i2, bArr, i5, bArr.length, writeSession, linkedBuffer);
                    }
                    int i11 = i5 + 1;
                    bArr[i5] = (byte) (((c2 >> '\f') & 15) | oei.TAI_CHI);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (((c2 >> 6) & 63) | 128);
                    bArr[i12] = (byte) (((c2 >> 0) & 63) | 128);
                    i5 = i12 + 1;
                }
            }
        }
    }

    public static LinkedBuffer writeUTF8(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int length = charSequence.length();
        if (length == 0) {
            return linkedBuffer;
        }
        int i = linkedBuffer.offset;
        int i2 = i + length;
        byte[] bArr = linkedBuffer.buffer;
        return i2 > bArr.length ? writeUTF8(charSequence, 0, length, bArr, i, bArr.length, writeSession, linkedBuffer) : writeUTF8(charSequence, 0, length, writeSession, linkedBuffer);
    }
}
