package io.protostuff;

import com.oplus.aiunit.vision.oei;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class StreamedStringSerializer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private StreamedStringSerializer() {
    }

    private static void flushAndReset(LinkedBuffer linkedBuffer, WriteSession writeSession) throws IOException {
        do {
            int i = linkedBuffer.offset;
            int i2 = linkedBuffer.start;
            int i3 = i - i2;
            if (i3 > 0) {
                linkedBuffer.offset = writeSession.flush(linkedBuffer, linkedBuffer.buffer, i2, i3);
            }
            linkedBuffer = linkedBuffer.next;
        } while (linkedBuffer != null);
    }

    public static LinkedBuffer writeAscii(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int length = charSequence.length();
        if (length == 0) {
            return linkedBuffer;
        }
        int iFlush = linkedBuffer.offset;
        byte[] bArr = linkedBuffer.buffer;
        int length2 = bArr.length;
        writeSession.size += length;
        int i = 0;
        if (iFlush + length > length2) {
            int i2 = linkedBuffer.start;
            int i3 = length2 - i2;
            int i4 = length2 - iFlush;
            int i5 = length - i4;
            while (true) {
                int i6 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                bArr[iFlush] = (byte) charSequence.charAt(i);
                iFlush++;
                i4 = i6;
                i++;
            }
            iFlush = writeSession.flush(bArr, i2, i3);
            while (true) {
                int i7 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                if (iFlush == length2) {
                    iFlush = writeSession.flush(bArr, i2, i3);
                }
                bArr[iFlush] = (byte) charSequence.charAt(i);
                iFlush++;
                i5 = i7;
                i++;
            }
        } else {
            while (i < length) {
                bArr[iFlush] = (byte) charSequence.charAt(i);
                i++;
                iFlush++;
            }
        }
        linkedBuffer.offset = iFlush;
        return linkedBuffer;
    }

    public static LinkedBuffer writeDouble(double d, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeAscii(Double.toString(d), writeSession, linkedBuffer);
    }

    public static LinkedBuffer writeFloat(float f, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeAscii(Float.toString(f), writeSession, linkedBuffer);
    }

    public static LinkedBuffer writeInt(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        if (i != Integer.MIN_VALUE) {
            int iStringSize = i < 0 ? StringSerializer.stringSize(-i) + 1 : StringSerializer.stringSize(i);
            writeSession.size += iStringSize;
            int i2 = linkedBuffer.offset;
            int i3 = i2 + iStringSize;
            byte[] bArr = linkedBuffer.buffer;
            if (i3 > bArr.length) {
                int i4 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i4, i2 - i4);
            }
            StringSerializer.putBytesFromInt(i, linkedBuffer.offset, iStringSize, linkedBuffer.buffer);
            linkedBuffer.offset += iStringSize;
            return linkedBuffer;
        }
        byte[] bArr2 = StringSerializer.INT_MIN_VALUE;
        int length = bArr2.length;
        writeSession.size += length;
        int i5 = linkedBuffer.offset;
        int i6 = i5 + length;
        byte[] bArr3 = linkedBuffer.buffer;
        if (i6 > bArr3.length) {
            int i7 = linkedBuffer.start;
            linkedBuffer.offset = writeSession.flush(bArr3, i7, i5 - i7);
        }
        System.arraycopy(bArr2, 0, linkedBuffer.buffer, linkedBuffer.offset, length);
        linkedBuffer.offset += length;
        return linkedBuffer;
    }

    public static LinkedBuffer writeLong(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        if (j2 != Long.MIN_VALUE) {
            int iStringSize = j2 < 0 ? StringSerializer.stringSize(-j2) + 1 : StringSerializer.stringSize(j2);
            writeSession.size += iStringSize;
            int i = linkedBuffer.offset;
            int i2 = i + iStringSize;
            byte[] bArr = linkedBuffer.buffer;
            if (i2 > bArr.length) {
                int i3 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i3, i - i3);
            }
            StringSerializer.putBytesFromLong(j2, linkedBuffer.offset, iStringSize, linkedBuffer.buffer);
            linkedBuffer.offset += iStringSize;
            return linkedBuffer;
        }
        byte[] bArr2 = StringSerializer.LONG_MIN_VALUE;
        int length = bArr2.length;
        writeSession.size += length;
        int i4 = linkedBuffer.offset;
        int i5 = i4 + length;
        byte[] bArr3 = linkedBuffer.buffer;
        if (i5 > bArr3.length) {
            int i6 = linkedBuffer.start;
            linkedBuffer.offset = writeSession.flush(bArr3, i6, i4 - i6);
        }
        System.arraycopy(bArr2, 0, linkedBuffer.buffer, linkedBuffer.offset, length);
        linkedBuffer.offset += length;
        return linkedBuffer;
    }

    public static LinkedBuffer writeUTF8(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int length = charSequence.length();
        if (length == 0) {
            return linkedBuffer;
        }
        byte[] bArr = linkedBuffer.buffer;
        int length2 = bArr.length;
        int iFlush = linkedBuffer.offset;
        int i = 0;
        do {
            int i2 = i + 1;
            char cCharAt = charSequence.charAt(i);
            if (cCharAt < 128) {
                if (iFlush == length2) {
                    writeSession.size += iFlush - linkedBuffer.offset;
                    int i3 = linkedBuffer.start;
                    iFlush = writeSession.flush(bArr, i3, iFlush - i3);
                    linkedBuffer.offset = iFlush;
                }
                bArr[iFlush] = (byte) cCharAt;
                i = i2;
                iFlush++;
            } else {
                if (cCharAt < 2048) {
                    if (iFlush + 2 > length2) {
                        writeSession.size += iFlush - linkedBuffer.offset;
                        int i4 = linkedBuffer.start;
                        iFlush = writeSession.flush(bArr, i4, iFlush - i4);
                        linkedBuffer.offset = iFlush;
                    }
                    int i5 = iFlush + 1;
                    bArr[iFlush] = (byte) (((cCharAt >> 6) & 31) | 192);
                    iFlush = i5 + 1;
                    bArr[i5] = (byte) (((cCharAt >> 0) & 63) | 128);
                } else if (Character.isHighSurrogate(cCharAt) && i2 < length && Character.isLowSurrogate(charSequence.charAt(i2))) {
                    if (iFlush + 4 > bArr.length) {
                        writeSession.size += iFlush - linkedBuffer.offset;
                        int i6 = linkedBuffer.start;
                        iFlush = writeSession.flush(bArr, i6, iFlush - i6);
                        linkedBuffer.offset = iFlush;
                    }
                    int codePoint = Character.toCodePoint(cCharAt, charSequence.charAt(i2));
                    int i7 = iFlush + 1;
                    bArr[iFlush] = (byte) (((codePoint >> 18) & 7) | 240);
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) (((codePoint >> 12) & 63) | 128);
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) (((codePoint >> 6) & 63) | 128);
                    iFlush = i9 + 1;
                    bArr[i9] = (byte) (((codePoint >> 0) & 63) | 128);
                    i2++;
                } else {
                    if (iFlush + 3 > length2) {
                        writeSession.size += iFlush - linkedBuffer.offset;
                        int i10 = linkedBuffer.start;
                        iFlush = writeSession.flush(bArr, i10, iFlush - i10);
                        linkedBuffer.offset = iFlush;
                    }
                    int i11 = iFlush + 1;
                    bArr[iFlush] = (byte) (((cCharAt >> '\f') & 15) | oei.TAI_CHI);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (((cCharAt >> 6) & 63) | 128);
                    bArr[i12] = (byte) (((cCharAt >> 0) & 63) | 128);
                    i = i2;
                    iFlush = i12 + 1;
                }
                i = i2;
            }
        } while (i < length);
        writeSession.size += iFlush - linkedBuffer.offset;
        linkedBuffer.offset = iFlush;
        return linkedBuffer;
    }

    public static LinkedBuffer writeUTF8FixedDelimited(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeUTF8FixedDelimited(charSequence, false, writeSession, linkedBuffer);
    }

    private static LinkedBuffer writeUTF8OneByteDelimited(CharSequence charSequence, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int i3 = writeSession.size;
        int i4 = linkedBuffer.offset;
        int i5 = i4 + 1;
        int i6 = i5 + i2;
        byte[] bArr = linkedBuffer.buffer;
        if (i6 > bArr.length) {
            int i7 = linkedBuffer.start;
            int iFlush = writeSession.flush(bArr, i7, i4 - i7);
            linkedBuffer.offset = iFlush;
            i5 = iFlush + 1;
        }
        linkedBuffer.offset = i5;
        LinkedBuffer linkedBufferWriteUTF8 = StringSerializer.writeUTF8(charSequence, i, i2, writeSession, linkedBuffer);
        int i8 = writeSession.size;
        linkedBuffer.buffer[i5 - 1] = (byte) (i8 - i3);
        writeSession.size = i8 + 1;
        if (linkedBufferWriteUTF8 != linkedBuffer) {
            flushAndReset(linkedBuffer, writeSession);
        }
        return linkedBuffer;
    }

    private static LinkedBuffer writeUTF8VarDelimited(CharSequence charSequence, int i, int i2, int i3, int i4, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int i5 = i4;
        int i6 = writeSession.size;
        int i7 = linkedBuffer.offset;
        int i8 = i7 + i5;
        int i9 = i8 + i2;
        byte[] bArr = linkedBuffer.buffer;
        if (i9 > bArr.length) {
            int i10 = linkedBuffer.start;
            int iFlush = writeSession.flush(bArr, i10, i7 - i10);
            int i11 = iFlush + i5;
            int i12 = i11 + i2;
            byte[] bArr2 = linkedBuffer.buffer;
            if (i12 > bArr2.length) {
                linkedBuffer.offset = i11;
                StringSerializer.writeUTF8(charSequence, i, i2, bArr2, i11, bArr2.length, writeSession, linkedBuffer);
                int i13 = writeSession.size;
                int i14 = i13 - i6;
                if (i14 < i3) {
                    int i15 = i5 - 1;
                    writeSession.size = i13 + i15;
                    int i16 = iFlush + 1;
                    int i17 = i16;
                    while (true) {
                        i15--;
                        if (i15 <= 0) {
                            byte[] bArr3 = linkedBuffer.buffer;
                            bArr3[i17] = (byte) i14;
                            linkedBuffer.offset = writeSession.flush(linkedBuffer, bArr3, i16, linkedBuffer.offset - i16);
                            flushAndReset(linkedBuffer.next, writeSession);
                            return linkedBuffer;
                        }
                        linkedBuffer.buffer[i17] = (byte) ((i14 & 127) | 128);
                        i14 >>>= 7;
                        i17++;
                    }
                } else {
                    writeSession.size = i13 + i5;
                    while (true) {
                        i5--;
                        if (i5 <= 0) {
                            linkedBuffer.buffer[iFlush] = (byte) i14;
                            flushAndReset(linkedBuffer, writeSession);
                            return linkedBuffer;
                        }
                        linkedBuffer.buffer[iFlush] = (byte) ((i14 & 127) | 128);
                        i14 >>>= 7;
                        iFlush++;
                    }
                }
            } else {
                i8 = i11;
                i7 = iFlush;
            }
        }
        linkedBuffer.offset = i8;
        LinkedBuffer linkedBufferWriteUTF8 = StringSerializer.writeUTF8(charSequence, i, i2, writeSession, linkedBuffer);
        int i18 = writeSession.size;
        int i19 = i18 - i6;
        if (i19 < i3) {
            if (linkedBufferWriteUTF8 != linkedBuffer || i5 != 2) {
                int i20 = i5 - 1;
                writeSession.size = i18 + i20;
                int i21 = i7 + 1;
                int i22 = i21;
                while (true) {
                    i20--;
                    if (i20 <= 0) {
                        break;
                    }
                    linkedBuffer.buffer[i22] = (byte) ((i19 & 127) | 128);
                    i19 >>>= 7;
                    i22++;
                }
                byte[] bArr4 = linkedBuffer.buffer;
                bArr4[i22] = (byte) i19;
                int i23 = linkedBuffer.start;
                if (i7 == i23) {
                    linkedBuffer.offset = writeSession.flush(linkedBuffer, bArr4, i21, linkedBuffer.offset - i21);
                } else {
                    linkedBuffer.offset = writeSession.flush(bArr4, i23, i7 - i23, bArr4, i21, linkedBuffer.offset - i21);
                }
                if (linkedBufferWriteUTF8 != linkedBuffer) {
                    flushAndReset(linkedBuffer.next, writeSession);
                }
                return linkedBuffer;
            }
            byte[] bArr5 = linkedBuffer.buffer;
            System.arraycopy(bArr5, i8, bArr5, i8 - 1, linkedBuffer.offset - i8);
            linkedBuffer.offset--;
            i5--;
        }
        writeSession.size += i5;
        while (true) {
            i5--;
            if (i5 <= 0) {
                break;
            }
            linkedBuffer.buffer[i7] = (byte) ((i19 & 127) | 128);
            i19 >>>= 7;
            i7++;
        }
        linkedBuffer.buffer[i7] = (byte) i19;
        if (linkedBufferWriteUTF8 != linkedBuffer) {
            flushAndReset(linkedBuffer, writeSession);
        }
        return linkedBuffer;
    }

    public static LinkedBuffer writeUTF8FixedDelimited(CharSequence charSequence, boolean z, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int i = writeSession.size;
        int length = charSequence.length();
        int i2 = linkedBuffer.offset;
        int i3 = i2 + 2;
        int i4 = i3 + length;
        byte[] bArr = linkedBuffer.buffer;
        if (i4 > bArr.length) {
            int i5 = linkedBuffer.start;
            int iFlush = writeSession.flush(bArr, i5, i2 - i5);
            linkedBuffer.offset = iFlush;
            int i6 = iFlush + 2;
            if (length == 0) {
                StringSerializer.writeFixed2ByteInt(0, linkedBuffer.buffer, i6 - 2, z);
                linkedBuffer.offset = i6;
                writeSession.size += 2;
                return linkedBuffer;
            }
            int i7 = i6 + length;
            byte[] bArr2 = linkedBuffer.buffer;
            if (i7 > bArr2.length) {
                linkedBuffer.offset = i6;
                StringSerializer.writeUTF8(charSequence, 0, length, bArr2, i6, bArr2.length, writeSession, linkedBuffer);
                StringSerializer.writeFixed2ByteInt(writeSession.size - i, linkedBuffer.buffer, i6 - 2, z);
                writeSession.size += 2;
                flushAndReset(linkedBuffer, writeSession);
                return linkedBuffer;
            }
            i3 = i6;
        } else if (length == 0) {
            StringSerializer.writeFixed2ByteInt(0, bArr, i3 - 2, z);
            linkedBuffer.offset = i3;
            writeSession.size += 2;
            return linkedBuffer;
        }
        linkedBuffer.offset = i3;
        LinkedBuffer linkedBufferWriteUTF8 = StringSerializer.writeUTF8(charSequence, 0, length, writeSession, linkedBuffer);
        StringSerializer.writeFixed2ByteInt(writeSession.size - i, linkedBuffer.buffer, i3 - 2, z);
        writeSession.size += 2;
        if (linkedBufferWriteUTF8 != linkedBuffer) {
            flushAndReset(linkedBuffer, writeSession);
        }
        return linkedBuffer;
    }

    public static LinkedBuffer writeUTF8VarDelimited(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        int length = charSequence.length();
        if (length != 0) {
            if (length < 43) {
                return writeUTF8OneByteDelimited(charSequence, 0, length, writeSession, linkedBuffer);
            }
            if (length < 5462) {
                return writeUTF8VarDelimited(charSequence, 0, length, 128, 2, writeSession, linkedBuffer);
            }
            if (length < 699051) {
                return writeUTF8VarDelimited(charSequence, 0, length, 16384, 3, writeSession, linkedBuffer);
            }
            if (length < 89478486) {
                return writeUTF8VarDelimited(charSequence, 0, length, 2097152, 4, writeSession, linkedBuffer);
            }
            return writeUTF8VarDelimited(charSequence, 0, length, 268435456, 5, writeSession, linkedBuffer);
        }
        int i = linkedBuffer.offset;
        byte[] bArr = linkedBuffer.buffer;
        if (i == bArr.length) {
            int i2 = linkedBuffer.start;
            linkedBuffer.offset = writeSession.flush(bArr, i2, i - i2);
        }
        byte[] bArr2 = linkedBuffer.buffer;
        int i3 = linkedBuffer.offset;
        linkedBuffer.offset = i3 + 1;
        bArr2[i3] = 0;
        writeSession.size++;
        return linkedBuffer;
    }
}
