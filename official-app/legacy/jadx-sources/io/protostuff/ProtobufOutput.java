package io.protostuff;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class ProtobufOutput extends WriteSession implements Output {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;

    public ProtobufOutput(LinkedBuffer linkedBuffer) {
        super(linkedBuffer);
    }

    public static int computeRawVarint32Size(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static byte[] getRawVarInt32Bytes(int i) {
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        int i2 = 0;
        if (iComputeRawVarint32Size == 1) {
            return new byte[]{(byte) i};
        }
        byte[] bArr = new byte[iComputeRawVarint32Size];
        int i3 = iComputeRawVarint32Size - 1;
        int i4 = 0;
        while (i2 < i3) {
            bArr[i4] = (byte) ((i & 127) | 128);
            i2++;
            i >>>= 7;
            i4++;
        }
        bArr[i4] = (byte) i;
        return bArr;
    }

    public static byte[] getTagAndRawLittleEndian32Bytes(int i, int i2) {
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        byte[] bArr = new byte[iComputeRawVarint32Size + 4];
        int i3 = 0;
        int i4 = 1;
        if (iComputeRawVarint32Size == 1) {
            bArr[0] = (byte) i;
        } else {
            int i5 = iComputeRawVarint32Size - 1;
            int i6 = 0;
            while (i3 < i5) {
                bArr[i6] = (byte) ((i & 127) | 128);
                i3++;
                i >>>= 7;
                i6++;
            }
            bArr[i6] = (byte) i;
            i4 = i6 + 1;
        }
        writeRawLittleEndian32(i2, bArr, i4);
        return bArr;
    }

    public static byte[] getTagAndRawLittleEndian64Bytes(int i, long j2) {
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        byte[] bArr = new byte[iComputeRawVarint32Size + 8];
        int i2 = 0;
        int i3 = 1;
        if (iComputeRawVarint32Size == 1) {
            bArr[0] = (byte) i;
        } else {
            int i4 = iComputeRawVarint32Size - 1;
            int i5 = 0;
            while (i2 < i4) {
                bArr[i5] = (byte) ((i & 127) | 128);
                i2++;
                i >>>= 7;
                i5++;
            }
            bArr[i5] = (byte) i;
            i3 = i5 + 1;
        }
        writeRawLittleEndian64(j2, bArr, i3);
        return bArr;
    }

    public static byte[] getTagAndRawVarInt32Bytes(int i, int i2) {
        int i3;
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        int iComputeRawVarint32Size2 = computeRawVarint32Size(i2);
        byte[] bArr = new byte[iComputeRawVarint32Size + iComputeRawVarint32Size2];
        int i4 = 0;
        if (iComputeRawVarint32Size == 1) {
            bArr[0] = (byte) i;
            i3 = 1;
        } else {
            int i5 = iComputeRawVarint32Size - 1;
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5) {
                bArr[i7] = (byte) ((i & 127) | 128);
                i6++;
                i >>>= 7;
                i7++;
            }
            i3 = i7 + 1;
            bArr[i7] = (byte) i;
        }
        if (iComputeRawVarint32Size2 == 1) {
            bArr[i3] = (byte) i2;
        } else {
            int i8 = iComputeRawVarint32Size2 - 1;
            while (i4 < i8) {
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i4++;
                i2 >>>= 7;
                i3++;
            }
            bArr[i3] = (byte) i2;
        }
        return bArr;
    }

    public static byte[] getTagAndRawVarInt64Bytes(int i, long j2) {
        int i2;
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        int iComputeRawVarint64Size = computeRawVarint64Size(j2);
        byte[] bArr = new byte[iComputeRawVarint32Size + iComputeRawVarint64Size];
        int i3 = 0;
        if (iComputeRawVarint32Size == 1) {
            bArr[0] = (byte) i;
            i2 = 1;
        } else {
            int i4 = iComputeRawVarint32Size - 1;
            int i5 = 0;
            int i6 = 0;
            while (i5 < i4) {
                bArr[i6] = (byte) ((i & 127) | 128);
                i5++;
                i >>>= 7;
                i6++;
            }
            i2 = i6 + 1;
            bArr[i6] = (byte) i;
        }
        if (iComputeRawVarint64Size == 1) {
            bArr[i2] = (byte) j2;
        } else {
            int i7 = iComputeRawVarint64Size - 1;
            while (i3 < i7) {
                bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                i3++;
                j2 >>>= 7;
                i2++;
            }
            bArr[i2] = (byte) j2;
        }
        return bArr;
    }

    public static int writeRawLittleEndian32(int i, byte[] bArr, int i2) {
        if (bArr.length - i2 < 4) {
            throw new IllegalArgumentException("buffer capacity not enough.");
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & 255);
        bArr[i4] = (byte) ((i >> 16) & 255);
        bArr[i4 + 1] = (byte) ((i >> 24) & 255);
        return 4;
    }

    public static int writeRawLittleEndian64(long j2, byte[] bArr, int i) {
        if (bArr.length - i < 8) {
            throw new IllegalArgumentException("buffer capacity not enough.");
        }
        int i2 = i + 1;
        bArr[i] = (byte) (j2 & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >> 24) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >> 40) & 255);
        bArr[i7] = (byte) ((j2 >> 48) & 255);
        bArr[i7 + 1] = (byte) ((j2 >> 56) & 255);
        return 8;
    }

    public static LinkedBuffer writeRawVarInt32(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        if (linkedBuffer.offset + iComputeRawVarint32Size > linkedBuffer.buffer.length) {
            linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }
        byte[] bArr = linkedBuffer.buffer;
        int i2 = linkedBuffer.offset;
        linkedBuffer.offset = i2 + iComputeRawVarint32Size;
        writeSession.size += iComputeRawVarint32Size;
        if (iComputeRawVarint32Size == 1) {
            bArr[i2] = (byte) i;
        } else {
            int i3 = iComputeRawVarint32Size - 1;
            int i4 = 0;
            while (i4 < i3) {
                bArr[i2] = (byte) ((i & 127) | 128);
                i4++;
                i >>>= 7;
                i2++;
            }
            bArr[i2] = (byte) i;
        }
        return linkedBuffer;
    }

    public static void writeRawVarInt32Bytes(OutputStream outputStream, int i) throws IOException {
        while ((i & (-128)) != 0) {
            outputStream.write((i & 127) | 128);
            i >>>= 7;
        }
        outputStream.write(i);
    }

    public static LinkedBuffer writeTagAndByteArray(int i, byte[] bArr, int i2, int i3, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        if (i3 == 0) {
            return writeTagAndRawVarInt32(i, i3, writeSession, linkedBuffer);
        }
        LinkedBuffer linkedBufferWriteTagAndRawVarInt32 = writeTagAndRawVarInt32(i, i3, writeSession, linkedBuffer);
        writeSession.size += i3;
        byte[] bArr2 = linkedBufferWriteTagAndRawVarInt32.buffer;
        int length = bArr2.length;
        int i4 = linkedBufferWriteTagAndRawVarInt32.offset;
        int i5 = length - i4;
        if (i3 <= i5) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            linkedBufferWriteTagAndRawVarInt32.offset += i3;
            return linkedBufferWriteTagAndRawVarInt32;
        }
        if (writeSession.nextBufferSize + i5 < i3) {
            return i5 == 0 ? new LinkedBuffer(writeSession.nextBufferSize, new LinkedBuffer(bArr, i2, i3 + i2, linkedBufferWriteTagAndRawVarInt32)) : new LinkedBuffer(linkedBufferWriteTagAndRawVarInt32, new LinkedBuffer(bArr, i2, i3 + i2, linkedBufferWriteTagAndRawVarInt32));
        }
        System.arraycopy(bArr, i2, bArr2, i4, i5);
        linkedBufferWriteTagAndRawVarInt32.offset += i5;
        LinkedBuffer linkedBuffer2 = new LinkedBuffer(writeSession.nextBufferSize, linkedBufferWriteTagAndRawVarInt32);
        int i6 = i3 - i5;
        System.arraycopy(bArr, i2 + i5, linkedBuffer2.buffer, 0, i6);
        linkedBuffer2.offset += i6;
        return linkedBuffer2;
    }

    public static LinkedBuffer writeTagAndLinkedBuffer(int i, LinkedBuffer linkedBuffer, WriteSession writeSession, LinkedBuffer linkedBuffer2) {
        int i2 = linkedBuffer.offset - linkedBuffer.start;
        if (i2 == 0) {
            return writeTagAndRawVarInt32(i, i2, writeSession, linkedBuffer2);
        }
        LinkedBuffer linkedBufferWriteTagAndRawVarInt32 = writeTagAndRawVarInt32(i, i2, writeSession, linkedBuffer2);
        linkedBufferWriteTagAndRawVarInt32.next = linkedBuffer;
        return linkedBufferWriteTagAndRawVarInt32.buffer.length - linkedBufferWriteTagAndRawVarInt32.offset == 0 ? new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer) : new LinkedBuffer(linkedBufferWriteTagAndRawVarInt32, linkedBuffer);
    }

    public static LinkedBuffer writeTagAndRawLittleEndian32(int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int i3;
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        int i4 = iComputeRawVarint32Size + 4;
        if (linkedBuffer.offset + i4 > linkedBuffer.buffer.length) {
            linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }
        byte[] bArr = linkedBuffer.buffer;
        int i5 = linkedBuffer.offset;
        linkedBuffer.offset = i5 + i4;
        writeSession.size += i4;
        if (iComputeRawVarint32Size == 1) {
            i3 = i5 + 1;
            bArr[i5] = (byte) i;
        } else {
            int i6 = iComputeRawVarint32Size - 1;
            int i7 = 0;
            while (i7 < i6) {
                bArr[i5] = (byte) ((i & 127) | 128);
                i7++;
                i >>>= 7;
                i5++;
            }
            i3 = i5 + 1;
            bArr[i5] = (byte) i;
        }
        writeRawLittleEndian32(i2, bArr, i3);
        return linkedBuffer;
    }

    public static LinkedBuffer writeTagAndRawLittleEndian64(int i, long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int i2;
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        int i3 = iComputeRawVarint32Size + 8;
        if (linkedBuffer.offset + i3 > linkedBuffer.buffer.length) {
            linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }
        byte[] bArr = linkedBuffer.buffer;
        int i4 = linkedBuffer.offset;
        linkedBuffer.offset = i4 + i3;
        writeSession.size += i3;
        if (iComputeRawVarint32Size == 1) {
            i2 = i4 + 1;
            bArr[i4] = (byte) i;
        } else {
            int i5 = iComputeRawVarint32Size - 1;
            int i6 = 0;
            while (i6 < i5) {
                bArr[i4] = (byte) ((i & 127) | 128);
                i6++;
                i >>>= 7;
                i4++;
            }
            i2 = i4 + 1;
            bArr[i4] = (byte) i;
        }
        writeRawLittleEndian64(j2, bArr, i2);
        return linkedBuffer;
    }

    public static LinkedBuffer writeTagAndRawVarInt32(int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int i3;
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        int iComputeRawVarint32Size2 = computeRawVarint32Size(i2);
        int i4 = iComputeRawVarint32Size + iComputeRawVarint32Size2;
        if (linkedBuffer.offset + i4 > linkedBuffer.buffer.length) {
            linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }
        byte[] bArr = linkedBuffer.buffer;
        int i5 = linkedBuffer.offset;
        linkedBuffer.offset = i5 + i4;
        writeSession.size += i4;
        int i6 = 0;
        if (iComputeRawVarint32Size == 1) {
            i3 = i5 + 1;
            bArr[i5] = (byte) i;
        } else {
            int i7 = iComputeRawVarint32Size - 1;
            int i8 = 0;
            while (i8 < i7) {
                bArr[i5] = (byte) ((i & 127) | 128);
                i8++;
                i >>>= 7;
                i5++;
            }
            i3 = i5 + 1;
            bArr[i5] = (byte) i;
        }
        if (iComputeRawVarint32Size2 == 1) {
            bArr[i3] = (byte) i2;
        } else {
            int i9 = iComputeRawVarint32Size2 - 1;
            while (i6 < i9) {
                bArr[i3] = (byte) ((i2 & 127) | 128);
                i6++;
                i2 >>>= 7;
                i3++;
            }
            bArr[i3] = (byte) i2;
        }
        return linkedBuffer;
    }

    public static LinkedBuffer writeTagAndRawVarInt64(int i, long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) {
        int i2;
        int iComputeRawVarint32Size = computeRawVarint32Size(i);
        int iComputeRawVarint64Size = computeRawVarint64Size(j2);
        int i3 = iComputeRawVarint32Size + iComputeRawVarint64Size;
        if (linkedBuffer.offset + i3 > linkedBuffer.buffer.length) {
            linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }
        byte[] bArr = linkedBuffer.buffer;
        int i4 = linkedBuffer.offset;
        linkedBuffer.offset = i4 + i3;
        writeSession.size += i3;
        int i5 = 0;
        if (iComputeRawVarint32Size == 1) {
            i2 = i4 + 1;
            bArr[i4] = (byte) i;
        } else {
            int i6 = iComputeRawVarint32Size - 1;
            int i7 = 0;
            while (i7 < i6) {
                bArr[i4] = (byte) ((i & 127) | 128);
                i7++;
                i >>>= 7;
                i4++;
            }
            i2 = i4 + 1;
            bArr[i4] = (byte) i;
        }
        if (iComputeRawVarint64Size == 1) {
            bArr[i2] = (byte) j2;
        } else {
            int i8 = iComputeRawVarint64Size - 1;
            while (i5 < i8) {
                bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                i5++;
                j2 >>>= 7;
                i2++;
            }
            bArr[i2] = (byte) j2;
        }
        return linkedBuffer;
    }

    @Override // io.protostuff.Output
    public void writeBool(int i, boolean z, boolean z2) throws IOException {
        this.tail = writeTagAndRawVarInt32(WireFormat.makeTag(i, 0), z ? 1 : 0, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeByteArray(int i, byte[] bArr, boolean z) throws IOException {
        this.tail = writeTagAndByteArray(WireFormat.makeTag(i, 2), bArr, 0, bArr.length, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeByteRange(boolean z, int i, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        this.tail = writeTagAndByteArray(WireFormat.makeTag(i, 2), bArr, i2, i3, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteString byteString, boolean z) throws IOException {
        writeByteArray(i, byteString.getBytes(), z);
    }

    @Override // io.protostuff.Output
    public void writeDouble(int i, double d, boolean z) throws IOException {
        this.tail = writeTagAndRawLittleEndian64(WireFormat.makeTag(i, 1), Double.doubleToRawLongBits(d), this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeEnum(int i, int i2, boolean z) throws IOException {
        writeInt32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeFixed32(int i, int i2, boolean z) throws IOException {
        this.tail = writeTagAndRawLittleEndian32(WireFormat.makeTag(i, 5), i2, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeFixed64(int i, long j2, boolean z) throws IOException {
        this.tail = writeTagAndRawLittleEndian64(WireFormat.makeTag(i, 1), j2, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeFloat(int i, float f, boolean z) throws IOException {
        this.tail = writeTagAndRawLittleEndian32(WireFormat.makeTag(i, 5), Float.floatToRawIntBits(f), this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeInt32(int i, int i2, boolean z) throws IOException {
        if (i2 < 0) {
            this.tail = writeTagAndRawVarInt64(WireFormat.makeTag(i, 0), i2, this, this.tail);
        } else {
            this.tail = writeTagAndRawVarInt32(WireFormat.makeTag(i, 0), i2, this, this.tail);
        }
    }

    @Override // io.protostuff.Output
    public void writeInt64(int i, long j2, boolean z) throws IOException {
        this.tail = writeTagAndRawVarInt64(WireFormat.makeTag(i, 0), j2, this, this.tail);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // io.protostuff.Output
    public <T> void writeObject(int i, T t, Schema<T> schema, boolean z) throws IOException {
        LinkedBuffer linkedBufferWriteRawVarInt32;
        if (i < 16) {
            linkedBufferWriteRawVarInt32 = this.tail;
            int i2 = linkedBufferWriteRawVarInt32.offset;
            byte[] bArr = linkedBufferWriteRawVarInt32.buffer;
            if (i2 != bArr.length) {
                this.size++;
                linkedBufferWriteRawVarInt32.offset = i2 + 1;
                bArr[i2] = (byte) WireFormat.makeTag(i, 2);
            } else {
                linkedBufferWriteRawVarInt32 = writeRawVarInt32(WireFormat.makeTag(i, 2), this, this.tail);
                this.tail = linkedBufferWriteRawVarInt32;
            }
        } else {
            linkedBufferWriteRawVarInt32 = writeRawVarInt32(WireFormat.makeTag(i, 2), this, this.tail);
            this.tail = linkedBufferWriteRawVarInt32;
        }
        int i3 = this.tail.offset;
        int i4 = this.size;
        if (i3 == linkedBufferWriteRawVarInt32.buffer.length) {
            LinkedBuffer linkedBuffer = new LinkedBuffer(this.nextBufferSize);
            this.tail = linkedBuffer;
            schema.writeTo(this, t);
            int i5 = this.size - i4;
            int iComputeRawVarint32Size = computeRawVarint32Size(i5);
            byte[] bArr2 = new byte[iComputeRawVarint32Size];
            writeRawVarInt32(i5, bArr2, 0);
            this.size += iComputeRawVarint32Size;
            new LinkedBuffer(bArr2, 0, iComputeRawVarint32Size, linkedBufferWriteRawVarInt32).next = linkedBuffer;
            return;
        }
        linkedBufferWriteRawVarInt32.offset++;
        this.size = i4 + 1;
        schema.writeTo(this, t);
        int i6 = (this.size - i4) - 1;
        if (i6 < 128) {
            linkedBufferWriteRawVarInt32.buffer[i3] = (byte) i6;
            return;
        }
        LinkedBuffer linkedBuffer2 = new LinkedBuffer(linkedBufferWriteRawVarInt32.buffer, i3 + 1, linkedBufferWriteRawVarInt32.offset);
        if (linkedBufferWriteRawVarInt32 == this.tail) {
            this.tail = linkedBuffer2;
        } else {
            linkedBuffer2.next = linkedBufferWriteRawVarInt32.next;
        }
        linkedBufferWriteRawVarInt32.offset = i3;
        int iComputeRawVarint32Size2 = computeRawVarint32Size(i6);
        byte[] bArr3 = new byte[iComputeRawVarint32Size2];
        writeRawVarInt32(i6, bArr3, 0);
        this.size += iComputeRawVarint32Size2 - 1;
        new LinkedBuffer(bArr3, 0, iComputeRawVarint32Size2, linkedBufferWriteRawVarInt32).next = linkedBuffer2;
    }

    @Override // io.protostuff.Output
    public void writeSFixed32(int i, int i2, boolean z) throws IOException {
        this.tail = writeTagAndRawLittleEndian32(WireFormat.makeTag(i, 5), i2, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeSFixed64(int i, long j2, boolean z) throws IOException {
        this.tail = writeTagAndRawLittleEndian64(WireFormat.makeTag(i, 1), j2, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeSInt32(int i, int i2, boolean z) throws IOException {
        this.tail = writeTagAndRawVarInt32(WireFormat.makeTag(i, 0), encodeZigZag32(i2), this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeSInt64(int i, long j2, boolean z) throws IOException {
        this.tail = writeTagAndRawVarInt64(WireFormat.makeTag(i, 0), encodeZigZag64(j2), this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeString(int i, CharSequence charSequence, boolean z) throws IOException {
        this.tail = StringSerializer.writeUTF8VarDelimited(charSequence, this, writeRawVarInt32(WireFormat.makeTag(i, 2), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeUInt32(int i, int i2, boolean z) throws IOException {
        this.tail = writeTagAndRawVarInt32(WireFormat.makeTag(i, 0), i2, this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeUInt64(int i, long j2, boolean z) throws IOException {
        this.tail = writeTagAndRawVarInt64(WireFormat.makeTag(i, 0), j2, this, this.tail);
    }

    public ProtobufOutput(LinkedBuffer linkedBuffer, int i) {
        super(linkedBuffer, i);
    }

    @Override // io.protostuff.WriteSession
    public ProtobufOutput clear() {
        super.clear();
        return this;
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteBuffer byteBuffer, boolean z) throws IOException {
        writeByteRange(false, i, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
    }

    public static void writeRawVarInt32Bytes(DataOutput dataOutput, int i) throws IOException {
        while ((i & (-128)) != 0) {
            dataOutput.write((i & 127) | 128);
            i >>>= 7;
        }
        dataOutput.write(i);
    }

    public static void writeRawVarInt32(int i, byte[] bArr, int i2) throws IOException {
        while ((i & (-128)) != 0) {
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2++;
        }
        bArr[i2] = (byte) i;
    }
}
