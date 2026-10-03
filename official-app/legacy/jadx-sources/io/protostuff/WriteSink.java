package io.protostuff;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public enum WriteSink {
    BUFFERED { // from class: io.protostuff.WriteSink.1
        @Override // io.protostuff.WriteSink
        public LinkedBuffer drain(WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeByte(byte b, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size++;
            if (linkedBuffer.offset == linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            byte[] bArr = linkedBuffer.buffer;
            int i = linkedBuffer.offset;
            linkedBuffer.offset = i + 1;
            bArr[i] = b;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeByteArray(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            if (i2 == 0) {
                return linkedBuffer;
            }
            writeSession.size += i2;
            byte[] bArr2 = linkedBuffer.buffer;
            int length = bArr2.length;
            int i3 = linkedBuffer.offset;
            int i4 = length - i3;
            if (i2 <= i4) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                linkedBuffer.offset += i2;
                return linkedBuffer;
            }
            if (writeSession.nextBufferSize + i4 < i2) {
                return i4 == 0 ? new LinkedBuffer(writeSession.nextBufferSize, new LinkedBuffer(bArr, i, i2 + i, linkedBuffer)) : new LinkedBuffer(linkedBuffer, new LinkedBuffer(bArr, i, i2 + i, linkedBuffer));
            }
            System.arraycopy(bArr, i, bArr2, i3, i4);
            linkedBuffer.offset += i4;
            LinkedBuffer linkedBuffer2 = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            int i5 = i2 - i4;
            System.arraycopy(bArr, i + i4, linkedBuffer2.buffer, 0, i5);
            linkedBuffer2.offset += i5;
            return linkedBuffer2;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeByteArrayB64(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return B64Code.encode(bArr, i, i2, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt16(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 2;
            if (linkedBuffer.offset + 2 > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            IntSerializer.writeInt16(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 2;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt16LE(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 2;
            if (linkedBuffer.offset + 2 > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            IntSerializer.writeInt16LE(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 2;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt32(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 4;
            if (linkedBuffer.offset + 4 > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            IntSerializer.writeInt32(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 4;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt32LE(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 4;
            if (linkedBuffer.offset + 4 > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            IntSerializer.writeInt32LE(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 4;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt64(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 8;
            if (linkedBuffer.offset + 8 > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            IntSerializer.writeInt64(j2, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 8;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt64LE(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 8;
            if (linkedBuffer.offset + 8 > linkedBuffer.buffer.length) {
                linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
            }
            IntSerializer.writeInt64LE(j2, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 8;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrAscii(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeAscii(charSequence, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromDouble(double d, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeDouble(d, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromFloat(float f, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeFloat(f, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromInt(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeInt(i, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromLong(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeLong(j2, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrUTF8(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeUTF8(charSequence, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrUTF8FixedDelimited(CharSequence charSequence, boolean z, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeUTF8FixedDelimited(charSequence, z, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrUTF8VarDelimited(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StringSerializer.writeUTF8VarDelimited(charSequence, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeVarInt32(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            while (true) {
                writeSession.size++;
                if (linkedBuffer.offset == linkedBuffer.buffer.length) {
                    linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
                }
                if ((i & (-128)) == 0) {
                    byte[] bArr = linkedBuffer.buffer;
                    int i2 = linkedBuffer.offset;
                    linkedBuffer.offset = i2 + 1;
                    bArr[i2] = (byte) i;
                    return linkedBuffer;
                }
                byte[] bArr2 = linkedBuffer.buffer;
                int i3 = linkedBuffer.offset;
                linkedBuffer.offset = i3 + 1;
                bArr2[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeVarInt64(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            while (true) {
                writeSession.size++;
                if (linkedBuffer.offset == linkedBuffer.buffer.length) {
                    linkedBuffer = new LinkedBuffer(writeSession.nextBufferSize, linkedBuffer);
                }
                if (((-128) & j2) == 0) {
                    byte[] bArr = linkedBuffer.buffer;
                    int i = linkedBuffer.offset;
                    linkedBuffer.offset = i + 1;
                    bArr[i] = (byte) j2;
                    return linkedBuffer;
                }
                byte[] bArr2 = linkedBuffer.buffer;
                int i2 = linkedBuffer.offset;
                linkedBuffer.offset = i2 + 1;
                bArr2[i2] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    },
    STREAMED { // from class: io.protostuff.WriteSink.2
        @Override // io.protostuff.WriteSink
        public LinkedBuffer drain(WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            byte[] bArr = linkedBuffer.buffer;
            int i = linkedBuffer.start;
            linkedBuffer.offset = writeSession.flush(bArr, i, linkedBuffer.offset - i);
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeByte(byte b, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size++;
            int i = linkedBuffer.offset;
            byte[] bArr = linkedBuffer.buffer;
            if (i == bArr.length) {
                int i2 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i2, i - i2);
            }
            byte[] bArr2 = linkedBuffer.buffer;
            int i3 = linkedBuffer.offset;
            linkedBuffer.offset = i3 + 1;
            bArr2[i3] = b;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeByteArray(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            if (i2 == 0) {
                return linkedBuffer;
            }
            writeSession.size += i2;
            int i3 = linkedBuffer.offset;
            int i4 = i3 + i2;
            byte[] bArr2 = linkedBuffer.buffer;
            if (i4 > bArr2.length) {
                int i5 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr2, i5, i3 - i5, bArr, i, i2);
                return linkedBuffer;
            }
            System.arraycopy(bArr, i, bArr2, i3, i2);
            linkedBuffer.offset += i2;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeByteArrayB64(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return B64Code.sencode(bArr, i, i2, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt16(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 2;
            int i2 = linkedBuffer.offset;
            int i3 = i2 + 2;
            byte[] bArr = linkedBuffer.buffer;
            if (i3 > bArr.length) {
                int i4 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i4, i2 - i4);
            }
            IntSerializer.writeInt16(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 2;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt16LE(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 2;
            int i2 = linkedBuffer.offset;
            int i3 = i2 + 2;
            byte[] bArr = linkedBuffer.buffer;
            if (i3 > bArr.length) {
                int i4 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i4, i2 - i4);
            }
            IntSerializer.writeInt16LE(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 2;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt32(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 4;
            int i2 = linkedBuffer.offset;
            int i3 = i2 + 4;
            byte[] bArr = linkedBuffer.buffer;
            if (i3 > bArr.length) {
                int i4 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i4, i2 - i4);
            }
            IntSerializer.writeInt32(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 4;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt32LE(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 4;
            int i2 = linkedBuffer.offset;
            int i3 = i2 + 4;
            byte[] bArr = linkedBuffer.buffer;
            if (i3 > bArr.length) {
                int i4 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i4, i2 - i4);
            }
            IntSerializer.writeInt32LE(i, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 4;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt64(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 8;
            int i = linkedBuffer.offset;
            int i2 = i + 8;
            byte[] bArr = linkedBuffer.buffer;
            if (i2 > bArr.length) {
                int i3 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i3, i - i3);
            }
            IntSerializer.writeInt64(j2, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 8;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeInt64LE(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            writeSession.size += 8;
            int i = linkedBuffer.offset;
            int i2 = i + 8;
            byte[] bArr = linkedBuffer.buffer;
            if (i2 > bArr.length) {
                int i3 = linkedBuffer.start;
                linkedBuffer.offset = writeSession.flush(bArr, i3, i - i3);
            }
            IntSerializer.writeInt64LE(j2, linkedBuffer.buffer, linkedBuffer.offset);
            linkedBuffer.offset += 8;
            return linkedBuffer;
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrAscii(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeAscii(charSequence, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromDouble(double d, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeDouble(d, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromFloat(float f, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeFloat(f, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromInt(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeInt(i, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrFromLong(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeLong(j2, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrUTF8(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeUTF8(charSequence, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrUTF8FixedDelimited(CharSequence charSequence, boolean z, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeUTF8FixedDelimited(charSequence, z, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeStrUTF8VarDelimited(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            return StreamedStringSerializer.writeUTF8VarDelimited(charSequence, writeSession, linkedBuffer);
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeVarInt32(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            while (true) {
                writeSession.size++;
                int i2 = linkedBuffer.offset;
                byte[] bArr = linkedBuffer.buffer;
                if (i2 == bArr.length) {
                    int i3 = linkedBuffer.start;
                    linkedBuffer.offset = writeSession.flush(bArr, i3, i2 - i3);
                }
                if ((i & (-128)) == 0) {
                    byte[] bArr2 = linkedBuffer.buffer;
                    int i4 = linkedBuffer.offset;
                    linkedBuffer.offset = i4 + 1;
                    bArr2[i4] = (byte) i;
                    return linkedBuffer;
                }
                byte[] bArr3 = linkedBuffer.buffer;
                int i5 = linkedBuffer.offset;
                linkedBuffer.offset = i5 + 1;
                bArr3[i5] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
        }

        @Override // io.protostuff.WriteSink
        public LinkedBuffer writeVarInt64(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
            while (true) {
                writeSession.size++;
                int i = linkedBuffer.offset;
                byte[] bArr = linkedBuffer.buffer;
                if (i == bArr.length) {
                    int i2 = linkedBuffer.start;
                    linkedBuffer.offset = writeSession.flush(bArr, i2, i - i2);
                }
                if (((-128) & j2) == 0) {
                    byte[] bArr2 = linkedBuffer.buffer;
                    int i3 = linkedBuffer.offset;
                    linkedBuffer.offset = i3 + 1;
                    bArr2[i3] = (byte) j2;
                    return linkedBuffer;
                }
                byte[] bArr3 = linkedBuffer.buffer;
                int i4 = linkedBuffer.offset;
                linkedBuffer.offset = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            }
        }
    };

    public abstract LinkedBuffer drain(WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeByte(byte b, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeByteArray(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public final LinkedBuffer writeByteArray(byte[] bArr, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeByteArray(bArr, 0, bArr.length, writeSession, linkedBuffer);
    }

    public abstract LinkedBuffer writeByteArrayB64(byte[] bArr, int i, int i2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public final LinkedBuffer writeByteArrayB64(byte[] bArr, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeByteArrayB64(bArr, 0, bArr.length, writeSession, linkedBuffer);
    }

    public final LinkedBuffer writeDouble(double d, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeInt64(Double.doubleToRawLongBits(d), writeSession, linkedBuffer);
    }

    public final LinkedBuffer writeDoubleLE(double d, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeInt64LE(Double.doubleToRawLongBits(d), writeSession, linkedBuffer);
    }

    public final LinkedBuffer writeFloat(float f, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeInt32(Float.floatToRawIntBits(f), writeSession, linkedBuffer);
    }

    public final LinkedBuffer writeFloatLE(float f, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException {
        return writeInt32LE(Float.floatToRawIntBits(f), writeSession, linkedBuffer);
    }

    public abstract LinkedBuffer writeInt16(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeInt16LE(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeInt32(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeInt32LE(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeInt64(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeInt64LE(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrAscii(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrFromDouble(double d, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrFromFloat(float f, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrFromInt(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrFromLong(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrUTF8(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrUTF8FixedDelimited(CharSequence charSequence, boolean z, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeStrUTF8VarDelimited(CharSequence charSequence, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeVarInt32(int i, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;

    public abstract LinkedBuffer writeVarInt64(long j2, WriteSession writeSession, LinkedBuffer linkedBuffer) throws IOException;
}
