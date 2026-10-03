package io.netty.handler.codec.compression;

import com.oplus.aiunit.vision.oei;
import io.netty.buffer.ByteBuf;

/* JADX INFO: loaded from: classes10.dex */
public final class Snappy {
    private static final int COPY_1_BYTE_OFFSET = 1;
    private static final int COPY_2_BYTE_OFFSET = 2;
    private static final int COPY_4_BYTE_OFFSET = 3;
    private static final int LITERAL = 0;
    private static final int MAX_HT_SIZE = 16384;
    private static final int MIN_COMPRESSIBLE_BYTES = 15;
    private static final int NOT_ENOUGH_INPUT = -1;
    private static final int PREAMBLE_NOT_FULL = -1;
    private State state = State.READING_PREAMBLE;
    private byte tag;
    private int written;

    /* JADX INFO: renamed from: io.netty.handler.codec.compression.Snappy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$Snappy$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$compression$Snappy$State = iArr;
            try {
                iArr[State.READING_PREAMBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$Snappy$State[State.READING_TAG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$Snappy$State[State.READING_LITERAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$Snappy$State[State.READING_COPY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum State {
        READING_PREAMBLE,
        READING_TAG,
        READING_LITERAL,
        READING_COPY
    }

    private static int bitsToEncode(int i) {
        int iHighestOneBit = Integer.highestOneBit(i);
        int i2 = 0;
        while (true) {
            iHighestOneBit >>= 1;
            if (iHighestOneBit == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int calculateChecksum(ByteBuf byteBuf) {
        return calculateChecksum(byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    private static int decodeCopyWith1ByteOffset(byte b, ByteBuf byteBuf, ByteBuf byteBuf2, int i) {
        if (!byteBuf.isReadable()) {
            return -1;
        }
        int iWriterIndex = byteBuf2.writerIndex();
        int i2 = ((b & 28) >> 2) + 4;
        int unsignedByte = (((b & oei.TAI_CHI) << 8) >> 5) | byteBuf.readUnsignedByte();
        validateOffset(unsignedByte, i);
        byteBuf2.markReaderIndex();
        if (unsignedByte < i2) {
            for (int i3 = i2 / unsignedByte; i3 > 0; i3--) {
                byteBuf2.readerIndex(iWriterIndex - unsignedByte);
                byteBuf2.readBytes(byteBuf2, unsignedByte);
            }
            int i4 = i2 % unsignedByte;
            if (i4 != 0) {
                byteBuf2.readerIndex(iWriterIndex - unsignedByte);
                byteBuf2.readBytes(byteBuf2, i4);
            }
        } else {
            byteBuf2.readerIndex(iWriterIndex - unsignedByte);
            byteBuf2.readBytes(byteBuf2, i2);
        }
        byteBuf2.resetReaderIndex();
        return i2;
    }

    private static int decodeCopyWith2ByteOffset(byte b, ByteBuf byteBuf, ByteBuf byteBuf2, int i) {
        if (byteBuf.readableBytes() < 2) {
            return -1;
        }
        int iWriterIndex = byteBuf2.writerIndex();
        int i2 = ((b >> 2) & 63) + 1;
        int unsignedShortLE = byteBuf.readUnsignedShortLE();
        validateOffset(unsignedShortLE, i);
        byteBuf2.markReaderIndex();
        if (unsignedShortLE < i2) {
            for (int i3 = i2 / unsignedShortLE; i3 > 0; i3--) {
                byteBuf2.readerIndex(iWriterIndex - unsignedShortLE);
                byteBuf2.readBytes(byteBuf2, unsignedShortLE);
            }
            int i4 = i2 % unsignedShortLE;
            if (i4 != 0) {
                byteBuf2.readerIndex(iWriterIndex - unsignedShortLE);
                byteBuf2.readBytes(byteBuf2, i4);
            }
        } else {
            byteBuf2.readerIndex(iWriterIndex - unsignedShortLE);
            byteBuf2.readBytes(byteBuf2, i2);
        }
        byteBuf2.resetReaderIndex();
        return i2;
    }

    private static int decodeCopyWith4ByteOffset(byte b, ByteBuf byteBuf, ByteBuf byteBuf2, int i) {
        if (byteBuf.readableBytes() < 4) {
            return -1;
        }
        int iWriterIndex = byteBuf2.writerIndex();
        int i2 = ((b >> 2) & 63) + 1;
        int intLE = byteBuf.readIntLE();
        validateOffset(intLE, i);
        byteBuf2.markReaderIndex();
        if (intLE < i2) {
            for (int i3 = i2 / intLE; i3 > 0; i3--) {
                byteBuf2.readerIndex(iWriterIndex - intLE);
                byteBuf2.readBytes(byteBuf2, intLE);
            }
            int i4 = i2 % intLE;
            if (i4 != 0) {
                byteBuf2.readerIndex(iWriterIndex - intLE);
                byteBuf2.readBytes(byteBuf2, i4);
            }
        } else {
            byteBuf2.readerIndex(iWriterIndex - intLE);
            byteBuf2.readBytes(byteBuf2, i2);
        }
        byteBuf2.resetReaderIndex();
        return i2;
    }

    public static int decodeLiteral(byte b, ByteBuf byteBuf, ByteBuf byteBuf2) {
        byteBuf.markReaderIndex();
        int unsignedByte = (b >> 2) & 63;
        switch (unsignedByte) {
            case 60:
                if (!byteBuf.isReadable()) {
                    return -1;
                }
                unsignedByte = byteBuf.readUnsignedByte();
                break;
                break;
            case 61:
                if (byteBuf.readableBytes() < 2) {
                    return -1;
                }
                unsignedByte = byteBuf.readUnsignedShortLE();
                break;
            case 62:
                if (byteBuf.readableBytes() < 3) {
                    return -1;
                }
                unsignedByte = byteBuf.readUnsignedMediumLE();
                break;
            case 63:
                if (byteBuf.readableBytes() < 4) {
                    return -1;
                }
                unsignedByte = byteBuf.readIntLE();
                break;
        }
        int i = unsignedByte + 1;
        if (byteBuf.readableBytes() < i) {
            byteBuf.resetReaderIndex();
            return -1;
        }
        byteBuf2.writeBytes(byteBuf, i);
        return i;
    }

    private static void encodeCopy(ByteBuf byteBuf, int i, int i2) {
        while (i2 >= 68) {
            encodeCopyWithOffset(byteBuf, i, 64);
            i2 -= 64;
        }
        if (i2 > 64) {
            encodeCopyWithOffset(byteBuf, i, 60);
            i2 -= 60;
        }
        encodeCopyWithOffset(byteBuf, i, i2);
    }

    private static void encodeCopyWithOffset(ByteBuf byteBuf, int i, int i2) {
        if (i2 < 12 && i < 2048) {
            byteBuf.writeByte(((i2 - 4) << 2) | 1 | ((i >> 8) << 5));
            byteBuf.writeByte(i & 255);
        } else {
            byteBuf.writeByte(((i2 - 1) << 2) | 2);
            byteBuf.writeByte(i & 255);
            byteBuf.writeByte((i >> 8) & 255);
        }
    }

    public static void encodeLiteral(ByteBuf byteBuf, ByteBuf byteBuf2, int i) {
        if (i < 61) {
            byteBuf2.writeByte((i - 1) << 2);
        } else {
            int i2 = i - 1;
            int iBitsToEncode = (bitsToEncode(i2) / 8) + 1;
            byteBuf2.writeByte((iBitsToEncode + 59) << 2);
            for (int i3 = 0; i3 < iBitsToEncode; i3++) {
                byteBuf2.writeByte((i2 >> (i3 * 8)) & 255);
            }
        }
        byteBuf2.writeBytes(byteBuf, i);
    }

    private static int findMatchingLength(ByteBuf byteBuf, int i, int i2, int i3) {
        int i4 = 0;
        while (i2 <= i3 - 4 && byteBuf.getInt(i2) == byteBuf.getInt(i + i4)) {
            i2 += 4;
            i4 += 4;
        }
        while (i2 < i3 && byteBuf.getByte(i + i4) == byteBuf.getByte(i2)) {
            i2++;
            i4++;
        }
        return i4;
    }

    private static short[] getHashTable(int i) {
        int i2 = 256;
        while (i2 < 16384 && i2 < i) {
            i2 <<= 1;
        }
        return new short[i2];
    }

    private static int hash(ByteBuf byteBuf, int i, int i2) {
        return (byteBuf.getInt(i) * 506832829) >>> i2;
    }

    public static int maskChecksum(long j2) {
        return (int) (((j2 << 17) | (j2 >> 15)) - 1568478504);
    }

    private static int readPreamble(ByteBuf byteBuf) {
        int i = 0;
        int i2 = 0;
        while (byteBuf.isReadable()) {
            short unsignedByte = byteBuf.readUnsignedByte();
            int i3 = i2 + 1;
            i |= (unsignedByte & 127) << (i2 * 7);
            if ((unsignedByte & 128) == 0) {
                return i;
            }
            if (i3 >= 4) {
                throw new DecompressionException("Preamble is greater than 4 bytes");
            }
            i2 = i3;
        }
        return 0;
    }

    public static void validateChecksum(int i, ByteBuf byteBuf) {
        validateChecksum(i, byteBuf, byteBuf.readerIndex(), byteBuf.readableBytes());
    }

    private static void validateOffset(int i, int i2) {
        if (i == 0) {
            throw new DecompressionException("Offset is less than minimum permissible value");
        }
        if (i < 0) {
            throw new DecompressionException("Offset is greater than maximum value supported by this implementation");
        }
        if (i > i2) {
            throw new DecompressionException("Offset exceeds size of chunk");
        }
    }

    public void decode(ByteBuf byteBuf, ByteBuf byteBuf2) {
        while (byteBuf.isReadable()) {
            int i = AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State[this.state.ordinal()];
            if (i == 1) {
                int preamble = readPreamble(byteBuf);
                if (preamble == -1 || preamble == 0) {
                    return;
                }
                byteBuf2.ensureWritable(preamble);
                this.state = State.READING_TAG;
            } else if (i != 2) {
                if (i == 3) {
                    int iDecodeLiteral = decodeLiteral(this.tag, byteBuf, byteBuf2);
                    if (iDecodeLiteral == -1) {
                        return;
                    }
                    this.state = State.READING_TAG;
                    this.written += iDecodeLiteral;
                } else if (i == 4) {
                    byte b = this.tag;
                    int i2 = b & 3;
                    if (i2 == 1) {
                        int iDecodeCopyWith1ByteOffset = decodeCopyWith1ByteOffset(b, byteBuf, byteBuf2, this.written);
                        if (iDecodeCopyWith1ByteOffset == -1) {
                            return;
                        }
                        this.state = State.READING_TAG;
                        this.written += iDecodeCopyWith1ByteOffset;
                    } else if (i2 == 2) {
                        int iDecodeCopyWith2ByteOffset = decodeCopyWith2ByteOffset(b, byteBuf, byteBuf2, this.written);
                        if (iDecodeCopyWith2ByteOffset == -1) {
                            return;
                        }
                        this.state = State.READING_TAG;
                        this.written += iDecodeCopyWith2ByteOffset;
                    } else if (i2 == 3) {
                        int iDecodeCopyWith4ByteOffset = decodeCopyWith4ByteOffset(b, byteBuf, byteBuf2, this.written);
                        if (iDecodeCopyWith4ByteOffset == -1) {
                            return;
                        }
                        this.state = State.READING_TAG;
                        this.written += iDecodeCopyWith4ByteOffset;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (!byteBuf.isReadable()) {
                return;
            }
            byte b2 = byteBuf.readByte();
            this.tag = b2;
            int i3 = b2 & 3;
            if (i3 == 0) {
                this.state = State.READING_LITERAL;
            } else if (i3 == 1 || i3 == 2 || i3 == 3) {
                this.state = State.READING_COPY;
            }
        }
    }

    public void encode(ByteBuf byteBuf, ByteBuf byteBuf2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            i2 = i >>> (i6 * 7);
            if ((i2 & (-128)) == 0) {
                break;
            }
            byteBuf2.writeByte((i2 & 127) | 128);
            i6++;
        }
        byteBuf2.writeByte(i2);
        int i7 = byteBuf.readerIndex();
        short[] hashTable = getHashTable(i);
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(hashTable.length) + 1;
        if (i - i7 >= 15) {
            int i8 = i7 + 1;
            int iHash = hash(byteBuf, i8, iNumberOfLeadingZeros);
            int i9 = i7;
            loop1: while (true) {
                int i10 = 32;
                while (true) {
                    int i11 = i10 + 1;
                    int i12 = (i10 >> 5) + i8;
                    i3 = i - 4;
                    if (i12 > i3) {
                        break loop1;
                    }
                    int iHash2 = hash(byteBuf, i12, iNumberOfLeadingZeros);
                    i4 = hashTable[iHash] + i7;
                    hashTable[iHash] = (short) (i8 - i7);
                    if (byteBuf.getInt(i8) == byteBuf.getInt(i4)) {
                        break;
                    }
                    i8 = i12;
                    i10 = i11;
                    iHash = iHash2;
                }
                encodeLiteral(byteBuf, byteBuf2, i8 - i9);
                while (true) {
                    int iFindMatchingLength = findMatchingLength(byteBuf, i4 + 4, i8 + 4, i) + 4;
                    i9 = i8 + iFindMatchingLength;
                    encodeCopy(byteBuf2, i8 - i4, iFindMatchingLength);
                    byteBuf.readerIndex(byteBuf.readerIndex() + iFindMatchingLength);
                    i5 = i9 - 1;
                    if (i9 >= i3) {
                        break loop1;
                    }
                    int i13 = i9 - i7;
                    hashTable[hash(byteBuf, i5, iNumberOfLeadingZeros)] = (short) (i13 - 1);
                    int i14 = i5 + 1;
                    int iHash3 = hash(byteBuf, i14, iNumberOfLeadingZeros);
                    i4 = i7 + hashTable[iHash3];
                    hashTable[iHash3] = (short) i13;
                    if (byteBuf.getInt(i14) != byteBuf.getInt(i4)) {
                        break;
                    } else {
                        i8 = i9;
                    }
                }
                iHash = hash(byteBuf, i5 + 2, iNumberOfLeadingZeros);
                i8 = i9 + 1;
            }
            i7 = i9;
        }
        if (i7 < i) {
            encodeLiteral(byteBuf, byteBuf2, i - i7);
        }
    }

    public int getPreamble(ByteBuf byteBuf) {
        if (this.state != State.READING_PREAMBLE) {
            return 0;
        }
        int i = byteBuf.readerIndex();
        try {
            return readPreamble(byteBuf);
        } finally {
            byteBuf.readerIndex(i);
        }
    }

    public void reset() {
        this.state = State.READING_PREAMBLE;
        this.tag = (byte) 0;
        this.written = 0;
    }

    public static int calculateChecksum(ByteBuf byteBuf, int i, int i2) {
        Crc32c crc32c = new Crc32c();
        try {
            crc32c.update(byteBuf, i, i2);
            return maskChecksum(crc32c.getValue());
        } finally {
            crc32c.reset();
        }
    }

    public static void validateChecksum(int i, ByteBuf byteBuf, int i2, int i3) {
        int iCalculateChecksum = calculateChecksum(byteBuf, i2, i3);
        if (iCalculateChecksum == i) {
            return;
        }
        throw new DecompressionException("mismatching checksum: " + Integer.toHexString(iCalculateChecksum) + " (expected: " + Integer.toHexString(i) + ')');
    }
}
