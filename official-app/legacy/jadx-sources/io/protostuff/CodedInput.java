package io.protostuff;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
public final class CodedInput implements Input {
    static final int DEFAULT_BUFFER_SIZE = 4096;
    static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    public final boolean decodeNestedMessageAsGroup;
    private final InputStream input;
    private int lastTag;
    private int packedLimit;
    private int sizeLimit;
    private int totalBytesRetired;

    public CodedInput(byte[] bArr, int i, int i2, boolean z) {
        this.packedLimit = 0;
        this.currentLimit = Integer.MAX_VALUE;
        this.sizeLimit = 67108864;
        this.buffer = bArr;
        this.bufferSize = i2 + i;
        this.bufferPos = i;
        this.totalBytesRetired = -i;
        this.input = null;
        this.decodeNestedMessageAsGroup = z;
    }

    private void checkIfPackedField() throws IOException {
        if (this.packedLimit == 0 && WireFormat.getTagWireType(this.lastTag) == 2) {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 < 0) {
                throw ProtobufException.negativeSize();
            }
            this.packedLimit = getTotalBytesRead() + rawVarint32;
        }
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    private <T> T mergeObjectEncodedAsGroup(T t, Schema<T> schema) throws IOException {
        if (t == null) {
            t = schema.newMessage();
        }
        schema.mergeFrom(this, t);
        if (!schema.isInitialized(t)) {
            throw new UninitializedMessageException((Object) t, (Schema<?>) schema);
        }
        checkLastTagWas(0);
        return t;
    }

    public static CodedInput newInstance(InputStream inputStream) {
        return new CodedInput(inputStream, false);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i;
        int i2 = this.totalBytesRetired + i;
        int i3 = this.currentLimit;
        if (i2 <= i3) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i4 = i2 - i3;
        this.bufferSizeAfterLimit = i4;
        this.bufferSize = i - i4;
    }

    private boolean refillBuffer(boolean z) throws IOException {
        int i = this.bufferPos;
        int i2 = this.bufferSize;
        if (i < i2) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i3 = this.totalBytesRetired;
        if (i3 + i2 == this.currentLimit) {
            if (z) {
                throw ProtobufException.truncatedMessage();
            }
            return false;
        }
        this.totalBytesRetired = i3 + i2;
        this.bufferPos = 0;
        InputStream inputStream = this.input;
        int i4 = inputStream == null ? -1 : inputStream.read(this.buffer);
        this.bufferSize = i4;
        if (i4 == 0 || i4 < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.bufferSize + "\nThe InputStream implementation is buggy.");
        }
        if (i4 == -1) {
            this.bufferSize = 0;
            if (z) {
                throw ProtobufException.truncatedMessage();
            }
            return false;
        }
        recomputeBufferSizeAfterLimit();
        int i5 = this.totalBytesRetired + this.bufferSize + this.bufferSizeAfterLimit;
        if (i5 > this.sizeLimit || i5 < 0) {
            throw ProtobufException.sizeLimitExceeded();
        }
        return true;
    }

    public void checkLastTagWas(int i) throws ProtobufException {
        if (this.lastTag != i) {
            throw ProtobufException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i = this.currentLimit;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.totalBytesRetired + this.bufferPos);
    }

    public int getLastTag() {
        return this.lastTag;
    }

    public int getTotalBytesRead() {
        return this.totalBytesRetired + this.bufferPos;
    }

    @Override // io.protostuff.Input
    public <T> void handleUnknownField(int i, Schema<T> schema) throws IOException {
        skipField(this.lastTag);
    }

    public boolean isAtEnd() throws IOException {
        return this.bufferPos == this.bufferSize && !refillBuffer(false);
    }

    public boolean isCurrentFieldPacked() {
        int i = this.packedLimit;
        return (i == 0 || i == getTotalBytesRead()) ? false : true;
    }

    @Override // io.protostuff.Input
    public <T> T mergeObject(T t, Schema<T> schema) throws IOException {
        if (this.decodeNestedMessageAsGroup) {
            return (T) mergeObjectEncodedAsGroup(t, schema);
        }
        int iPushLimit = pushLimit(readRawVarint32());
        if (t == null) {
            t = schema.newMessage();
        }
        schema.mergeFrom(this, t);
        if (!schema.isInitialized(t)) {
            throw new UninitializedMessageException((Object) t, (Schema<?>) schema);
        }
        checkLastTagWas(0);
        popLimit(iPushLimit);
        return t;
    }

    public void popLimit(int i) {
        this.currentLimit = i;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i) throws ProtobufException {
        if (i < 0) {
            throw ProtobufException.negativeSize();
        }
        int i2 = i + this.totalBytesRetired + this.bufferPos;
        int i3 = this.currentLimit;
        if (i2 > i3) {
            throw ProtobufException.truncatedMessage();
        }
        this.currentLimit = i2;
        recomputeBufferSizeAfterLimit();
        return i3;
    }

    @Override // io.protostuff.Input
    public boolean readBool() throws IOException {
        checkIfPackedField();
        return readRawVarint32() != 0;
    }

    @Override // io.protostuff.Input
    public byte[] readByteArray() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return readRawBytes(rawVarint32);
        }
        byte[] bArr = new byte[rawVarint32];
        System.arraycopy(this.buffer, i2, bArr, 0, rawVarint32);
        this.bufferPos += rawVarint32;
        return bArr;
    }

    @Override // io.protostuff.Input
    public ByteBuffer readByteBuffer() throws IOException {
        return ByteBuffer.wrap(readByteArray());
    }

    @Override // io.protostuff.Input
    public void readBytes(ByteBuffer byteBuffer) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 > this.bufferSize - this.bufferPos || rawVarint32 <= 0) {
            byteBuffer.put(readRawBytes(rawVarint32));
            return;
        }
        byteBuffer.limit(rawVarint32);
        byteBuffer.put(this.buffer, this.bufferPos, rawVarint32);
        this.bufferPos += rawVarint32;
    }

    @Override // io.protostuff.Input
    public double readDouble() throws IOException {
        checkIfPackedField();
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    @Override // io.protostuff.Input
    public int readEnum() throws IOException {
        checkIfPackedField();
        return readRawVarint32();
    }

    @Override // io.protostuff.Input
    public <T> int readFieldNumber(Schema<T> schema) throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        if (isCurrentFieldPacked()) {
            if (this.packedLimit >= getTotalBytesRead()) {
                return this.lastTag >>> 3;
            }
            throw ProtobufException.misreportedSize();
        }
        this.packedLimit = 0;
        int rawVarint32 = readRawVarint32();
        int i = rawVarint32 >>> 3;
        if (i == 0) {
            if (!this.decodeNestedMessageAsGroup || 7 != (rawVarint32 & 7)) {
                throw ProtobufException.invalidTag();
            }
            this.lastTag = 0;
            return 0;
        }
        if (this.decodeNestedMessageAsGroup && 4 == (rawVarint32 & 7)) {
            this.lastTag = 0;
            return 0;
        }
        this.lastTag = rawVarint32;
        return i;
    }

    @Override // io.protostuff.Input
    public int readFixed32() throws IOException {
        checkIfPackedField();
        return readRawLittleEndian32();
    }

    @Override // io.protostuff.Input
    public long readFixed64() throws IOException {
        checkIfPackedField();
        return readRawLittleEndian64();
    }

    @Override // io.protostuff.Input
    public float readFloat() throws IOException {
        checkIfPackedField();
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    @Override // io.protostuff.Input
    public int readInt32() throws IOException {
        checkIfPackedField();
        return readRawVarint32();
    }

    @Override // io.protostuff.Input
    public long readInt64() throws IOException {
        checkIfPackedField();
        return readRawVarint64();
    }

    public byte readRawByte() throws IOException {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(true);
        }
        byte[] bArr = this.buffer;
        int i = this.bufferPos;
        this.bufferPos = i + 1;
        return bArr[i];
    }

    public byte[] readRawBytes(int i) throws IOException {
        if (i < 0) {
            throw ProtobufException.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = i2 + i3 + i;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            skipRawBytes((i5 - i2) - i3);
            throw ProtobufException.truncatedMessage();
        }
        int i6 = this.bufferSize;
        if (i <= i6 - i3) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, i3, bArr, 0, i);
            this.bufferPos += i;
            return bArr;
        }
        byte[] bArr2 = this.buffer;
        if (i >= bArr2.length) {
            this.totalBytesRetired = i2 + i6;
            this.bufferPos = 0;
            this.bufferSize = 0;
            int length = i6 - i3;
            int i7 = i - length;
            ArrayList<byte[]> arrayList = new ArrayList();
            while (i7 > 0) {
                int iMin = Math.min(i7, this.buffer.length);
                byte[] bArr3 = new byte[iMin];
                int i8 = 0;
                while (i8 < iMin) {
                    InputStream inputStream = this.input;
                    int i9 = inputStream == null ? -1 : inputStream.read(bArr3, i8, iMin - i8);
                    if (i9 == -1) {
                        throw ProtobufException.truncatedMessage();
                    }
                    this.totalBytesRetired += i9;
                    i8 += i9;
                }
                i7 -= iMin;
                arrayList.add(bArr3);
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(this.buffer, i3, bArr4, 0, length);
            for (byte[] bArr5 : arrayList) {
                System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
                length += bArr5.length;
            }
            return bArr4;
        }
        byte[] bArr6 = new byte[i];
        int i10 = i6 - i3;
        System.arraycopy(bArr2, i3, bArr6, 0, i10);
        this.bufferPos = this.bufferSize;
        refillBuffer(true);
        while (true) {
            int i11 = i - i10;
            int i12 = this.bufferSize;
            if (i11 <= i12) {
                System.arraycopy(this.buffer, 0, bArr6, i10, i11);
                this.bufferPos = i11;
                return bArr6;
            }
            System.arraycopy(this.buffer, 0, bArr6, i10, i12);
            int i13 = this.bufferSize;
            i10 += i13;
            this.bufferPos = i13;
            refillBuffer(true);
        }
    }

    public int readRawLittleEndian32() throws IOException {
        byte rawByte = readRawByte();
        byte rawByte2 = readRawByte();
        byte rawByte3 = readRawByte();
        return ((readRawByte() & 255) << 24) | (rawByte & 255) | ((rawByte2 & 255) << 8) | ((rawByte3 & 255) << 16);
    }

    public long readRawLittleEndian64() throws IOException {
        byte rawByte = readRawByte();
        return ((((long) readRawByte()) & 255) << 8) | (((long) rawByte) & 255) | ((((long) readRawByte()) & 255) << 16) | ((((long) readRawByte()) & 255) << 24) | ((((long) readRawByte()) & 255) << 32) | ((((long) readRawByte()) & 255) << 40) | ((((long) readRawByte()) & 255) << 48) | ((((long) readRawByte()) & 255) << 56);
    }

    public int readRawVarint32() throws IOException {
        int i;
        byte rawByte = readRawByte();
        if (rawByte >= 0) {
            return rawByte;
        }
        int i2 = rawByte & ByteCompanionObject.MAX_VALUE;
        byte rawByte2 = readRawByte();
        if (rawByte2 >= 0) {
            i = rawByte2 << 7;
        } else {
            i2 |= (rawByte2 & ByteCompanionObject.MAX_VALUE) << 7;
            byte rawByte3 = readRawByte();
            if (rawByte3 >= 0) {
                i = rawByte3 << 14;
            } else {
                i2 |= (rawByte3 & ByteCompanionObject.MAX_VALUE) << 14;
                byte rawByte4 = readRawByte();
                if (rawByte4 < 0) {
                    int i3 = i2 | ((rawByte4 & ByteCompanionObject.MAX_VALUE) << 21);
                    byte rawByte5 = readRawByte();
                    int i4 = i3 | (rawByte5 << 28);
                    if (rawByte5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (readRawByte() >= 0) {
                            return i4;
                        }
                    }
                    throw ProtobufException.malformedVarint();
                }
                i = rawByte4 << 21;
            }
        }
        return i | i2;
    }

    public long readRawVarint64() throws IOException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte rawByte = readRawByte();
            j2 |= ((long) (rawByte & ByteCompanionObject.MAX_VALUE)) << i;
            if ((rawByte & ByteCompanionObject.MIN_VALUE) == 0) {
                return j2;
            }
        }
        throw ProtobufException.malformedVarint();
    }

    @Override // io.protostuff.Input
    public int readSFixed32() throws IOException {
        checkIfPackedField();
        return readRawLittleEndian32();
    }

    @Override // io.protostuff.Input
    public long readSFixed64() throws IOException {
        checkIfPackedField();
        return readRawLittleEndian64();
    }

    @Override // io.protostuff.Input
    public int readSInt32() throws IOException {
        checkIfPackedField();
        return decodeZigZag32(readRawVarint32());
    }

    @Override // io.protostuff.Input
    public long readSInt64() throws IOException {
        checkIfPackedField();
        return decodeZigZag64(readRawVarint64());
    }

    @Override // io.protostuff.Input
    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 > i - i2 || rawVarint32 <= 0) {
            return StringSerializer.STRING.deser(readRawBytes(rawVarint32));
        }
        String strDeser = StringSerializer.STRING.deser(this.buffer, i2, rawVarint32);
        this.bufferPos += rawVarint32;
        return strDeser;
    }

    public int readTag() throws IOException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        if ((rawVarint32 >>> 3) == 0) {
            throw ProtobufException.invalidTag();
        }
        this.lastTag = rawVarint32;
        return rawVarint32;
    }

    @Override // io.protostuff.Input
    public int readUInt32() throws IOException {
        checkIfPackedField();
        return readRawVarint32();
    }

    @Override // io.protostuff.Input
    public long readUInt64() throws IOException {
        checkIfPackedField();
        return readRawVarint64();
    }

    public void reset() {
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.bufferSizeAfterLimit = 0;
        this.currentLimit = Integer.MAX_VALUE;
        this.lastTag = 0;
        this.packedLimit = 0;
        this.sizeLimit = 67108864;
        resetSizeCounter();
    }

    public void resetSizeCounter() {
        this.totalBytesRetired = -this.bufferPos;
    }

    public int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.sizeLimit;
            this.sizeLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    public boolean skipField(int i) throws IOException {
        int tagWireType = WireFormat.getTagWireType(i);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw ProtobufException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() throws IOException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag));
    }

    public void skipRawBytes(int i) throws IOException {
        if (i < 0) {
            throw ProtobufException.negativeSize();
        }
        int i2 = this.totalBytesRetired;
        int i3 = this.bufferPos;
        int i4 = i2 + i3 + i;
        int i5 = this.currentLimit;
        if (i4 > i5) {
            skipRawBytes((i5 - i2) - i3);
            throw ProtobufException.truncatedMessage();
        }
        int i6 = this.bufferSize;
        if (i <= i6 - i3) {
            this.bufferPos = i3 + i;
            return;
        }
        int i7 = i6 - i3;
        this.bufferPos = i6;
        refillBuffer(true);
        while (true) {
            int i8 = i - i7;
            int i9 = this.bufferSize;
            if (i8 <= i9) {
                this.bufferPos = i8;
                return;
            } else {
                i7 += i9;
                this.bufferPos = i9;
                refillBuffer(true);
            }
        }
    }

    @Override // io.protostuff.Input
    public void transferByteRangeTo(Output output, boolean z, int i, boolean z2) throws IOException {
        int rawVarint32 = readRawVarint32();
        int i2 = this.bufferSize;
        int i3 = this.bufferPos;
        if (rawVarint32 > i2 - i3 || rawVarint32 <= 0) {
            output.writeByteRange(z, i, readRawBytes(rawVarint32), 0, rawVarint32, z2);
        } else {
            output.writeByteRange(z, i, this.buffer, i3, rawVarint32, z2);
            this.bufferPos += rawVarint32;
        }
    }

    public static CodedInput newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInput newInstance(byte[] bArr, int i, int i2) {
        return new CodedInput(bArr, i, i2, false);
    }

    @Override // io.protostuff.Input
    public ByteString readBytes() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 == 0) {
            return ByteString.EMPTY;
        }
        int i = this.bufferSize;
        int i2 = this.bufferPos;
        if (rawVarint32 <= i - i2 && rawVarint32 > 0) {
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.buffer, i2, rawVarint32);
            this.bufferPos += rawVarint32;
            return byteStringCopyFrom;
        }
        return ByteString.wrap(readRawBytes(rawVarint32));
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return (i & 128) == 0 ? i : readRawVarint32(inputStream, i);
        }
        throw ProtobufException.truncatedMessage();
    }

    public CodedInput(InputStream inputStream, boolean z) {
        this(inputStream, new byte[4096], 0, 0, z);
    }

    public static int readRawVarint32(InputStream inputStream, int i) throws IOException {
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw ProtobufException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw ProtobufException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw ProtobufException.malformedVarint();
    }

    public CodedInput(InputStream inputStream, byte[] bArr, boolean z) {
        this(inputStream, bArr, 0, 0, z);
    }

    public CodedInput(InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.packedLimit = 0;
        this.currentLimit = Integer.MAX_VALUE;
        this.sizeLimit = 67108864;
        this.buffer = bArr;
        this.bufferSize = i2;
        this.bufferPos = i;
        this.totalBytesRetired = -i;
        this.input = inputStream;
        this.decodeNestedMessageAsGroup = z;
    }

    public static int readRawVarint32(DataInput dataInput, byte b) throws IOException {
        int i = b & ByteCompanionObject.MAX_VALUE;
        int i2 = 7;
        while (i2 < 32) {
            byte b2 = dataInput.readByte();
            i |= (b2 & ByteCompanionObject.MAX_VALUE) << i2;
            if ((b2 & ByteCompanionObject.MIN_VALUE) == 0) {
                return i;
            }
            i2 += 7;
        }
        while (i2 < 64) {
            if ((dataInput.readByte() & ByteCompanionObject.MIN_VALUE) == 0) {
                return i;
            }
            i2 += 7;
        }
        throw ProtobufException.malformedVarint();
    }
}
