package io.protostuff;

import java.io.IOException;
import java.nio.ByteBuffer;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ByteBufferInput implements Input {
    private final ByteBuffer buffer;
    public final boolean decodeNestedMessageAsGroup;
    private int lastTag = 0;
    private int packedLimit = 0;

    public ByteBufferInput(ByteBuffer byteBuffer, boolean z) {
        this.buffer = byteBuffer.slice();
        this.decodeNestedMessageAsGroup = z;
    }

    private void checkIfPackedField() throws IOException {
        if (this.packedLimit == 0 && WireFormat.getTagWireType(this.lastTag) == 2) {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 < 0) {
                throw ProtobufException.negativeSize();
            }
            if (this.buffer.position() + rawVarint32 > this.buffer.limit()) {
                throw ProtobufException.misreportedSize();
            }
            this.packedLimit = this.buffer.position() + rawVarint32;
        }
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

    public void checkLastTagWas(int i) throws ProtobufException {
        if (this.lastTag != i) {
            throw ProtobufException.invalidEndTag();
        }
    }

    public int currentLimit() {
        return this.buffer.limit();
    }

    public int currentOffset() {
        return this.buffer.position();
    }

    public int getLastTag() {
        return this.lastTag;
    }

    @Override // io.protostuff.Input
    public <T> void handleUnknownField(int i, Schema<T> schema) throws IOException {
        skipField(this.lastTag);
    }

    public boolean isCurrentFieldPacked() {
        int i = this.packedLimit;
        return (i == 0 || i == this.buffer.position()) ? false : true;
    }

    @Override // io.protostuff.Input
    public <T> T mergeObject(T t, Schema<T> schema) throws IOException {
        if (this.decodeNestedMessageAsGroup) {
            return (T) mergeObjectEncodedAsGroup(t, schema);
        }
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        if (this.buffer.remaining() < rawVarint32) {
            throw ProtobufException.misreportedSize();
        }
        ByteBuffer byteBufferSlice = this.buffer.slice();
        byteBufferSlice.limit(rawVarint32);
        if (t == null) {
            t = schema.newMessage();
        }
        ByteBufferInput byteBufferInput = new ByteBufferInput(byteBufferSlice, this.decodeNestedMessageAsGroup);
        schema.mergeFrom(byteBufferInput, t);
        if (!schema.isInitialized(t)) {
            throw new UninitializedMessageException((Object) t, (Schema<?>) schema);
        }
        byteBufferInput.checkLastTagWas(0);
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + rawVarint32);
        return t;
    }

    @Override // io.protostuff.Input
    public boolean readBool() throws IOException {
        checkIfPackedField();
        return this.buffer.get() != 0;
    }

    @Override // io.protostuff.Input
    public byte[] readByteArray() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        if (this.buffer.remaining() < rawVarint32) {
            throw ProtobufException.misreportedSize();
        }
        byte[] bArr = new byte[rawVarint32];
        this.buffer.get(bArr);
        return bArr;
    }

    @Override // io.protostuff.Input
    public ByteBuffer readByteBuffer() throws IOException {
        return ByteBuffer.wrap(readByteArray());
    }

    @Override // io.protostuff.Input
    public ByteString readBytes() throws IOException {
        return ByteString.wrap(readByteArray());
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
        if (!this.buffer.hasRemaining()) {
            this.lastTag = 0;
            return 0;
        }
        if (isCurrentFieldPacked()) {
            if (this.packedLimit >= this.buffer.position()) {
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

    public int readRawLittleEndian32() throws IOException {
        byte[] bArr = new byte[4];
        this.buffer.get(bArr);
        return (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        byte[] bArr = new byte[8];
        this.buffer.get(bArr);
        return ((((long) bArr[7]) & 255) << 56) | (((long) bArr[0]) & 255) | ((((long) bArr[1]) & 255) << 8) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[6]) & 255) << 48);
    }

    public int readRawVarint32() throws IOException {
        int i;
        byte b = this.buffer.get();
        if (b >= 0) {
            return b;
        }
        int i2 = b & ByteCompanionObject.MAX_VALUE;
        byte b2 = this.buffer.get();
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i2 |= (b2 & ByteCompanionObject.MAX_VALUE) << 7;
            byte b3 = this.buffer.get();
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i2 |= (b3 & ByteCompanionObject.MAX_VALUE) << 14;
                byte b4 = this.buffer.get();
                if (b4 < 0) {
                    int i3 = i2 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
                    byte b5 = this.buffer.get();
                    int i4 = i3 | (b5 << 28);
                    if (b5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (this.buffer.get() >= 0) {
                            return i4;
                        }
                    }
                    throw ProtobufException.malformedVarint();
                }
                i = b4 << 21;
            }
        }
        return i | i2;
    }

    public long readRawVarint64() throws IOException {
        long j2 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte b = this.buffer.get();
            j2 |= ((long) (b & ByteCompanionObject.MAX_VALUE)) << i;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
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
        int rawVarint32 = readRawVarint32();
        return (-(rawVarint32 & 1)) ^ (rawVarint32 >>> 1);
    }

    @Override // io.protostuff.Input
    public long readSInt64() throws IOException {
        checkIfPackedField();
        long rawVarint64 = readRawVarint64();
        return (-(rawVarint64 & 1)) ^ (rawVarint64 >>> 1);
    }

    @Override // io.protostuff.Input
    public String readString() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        if (this.buffer.remaining() < rawVarint32) {
            throw ProtobufException.misreportedSize();
        }
        if (!this.buffer.hasArray()) {
            byte[] bArr = new byte[rawVarint32];
            this.buffer.get(bArr);
            return StringSerializer.STRING.deser(bArr);
        }
        int iPosition = this.buffer.position();
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + rawVarint32);
        return StringSerializer.STRING.deser(this.buffer.array(), this.buffer.arrayOffset() + iPosition, rawVarint32);
    }

    public int readTag() throws IOException {
        if (!this.buffer.hasRemaining()) {
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

    public ByteBufferInput reset(int i, int i2) {
        this.buffer.rewind();
        return this;
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
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 < 0) {
                throw ProtobufException.negativeSize();
            }
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + rawVarint32);
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

    @Override // io.protostuff.Input
    public void transferByteRangeTo(Output output, boolean z, int i, boolean z2) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        if (!z) {
            if (this.buffer.remaining() < rawVarint32) {
                throw ProtobufException.misreportedSize();
            }
            ByteBuffer byteBufferSlice = this.buffer.slice();
            byteBufferSlice.limit(rawVarint32);
            output.writeBytes(i, byteBufferSlice, z2);
            ByteBuffer byteBuffer = this.buffer;
            byteBuffer.position(byteBuffer.position() + rawVarint32);
            return;
        }
        if (this.buffer.hasArray()) {
            output.writeByteRange(true, i, this.buffer.array(), this.buffer.arrayOffset() + this.buffer.position(), rawVarint32, z2);
            ByteBuffer byteBuffer2 = this.buffer;
            byteBuffer2.position(byteBuffer2.position() + rawVarint32);
        } else {
            byte[] bArr = new byte[rawVarint32];
            this.buffer.get(bArr);
            output.writeByteRange(true, i, bArr, 0, rawVarint32, z2);
        }
    }

    @Override // io.protostuff.Input
    public void readBytes(ByteBuffer byteBuffer) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        if (this.buffer.remaining() < rawVarint32) {
            throw ProtobufException.misreportedSize();
        }
        byteBuffer.put(this.buffer);
    }
}
