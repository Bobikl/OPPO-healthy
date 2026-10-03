package io.protostuff;

import java.io.IOException;
import java.nio.ByteBuffer;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
public final class ByteArrayInput implements Input {
    private final byte[] buffer;
    public final boolean decodeNestedMessageAsGroup;
    private int lastTag;
    private int limit;
    private int offset;
    private int packedLimit;

    public ByteArrayInput(byte[] bArr, boolean z) {
        this(bArr, 0, bArr.length, z);
    }

    private void checkIfPackedField() throws IOException {
        if (this.packedLimit == 0 && WireFormat.getTagWireType(this.lastTag) == 2) {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 < 0) {
                throw ProtobufException.negativeSize();
            }
            int i = this.offset;
            if (i + rawVarint32 > this.limit) {
                throw ProtobufException.misreportedSize();
            }
            this.packedLimit = i + rawVarint32;
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
        return this.limit;
    }

    public int currentOffset() {
        return this.offset;
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
        return (i == 0 || i == this.offset) ? false : true;
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
        int i = this.limit;
        this.limit = this.offset + rawVarint32;
        if (t == null) {
            t = schema.newMessage();
        }
        schema.mergeFrom(this, t);
        if (!schema.isInitialized(t)) {
            throw new UninitializedMessageException((Object) t, (Schema<?>) schema);
        }
        checkLastTagWas(0);
        this.limit = i;
        return t;
    }

    @Override // io.protostuff.Input
    public boolean readBool() throws IOException {
        checkIfPackedField();
        byte[] bArr = this.buffer;
        int i = this.offset;
        this.offset = i + 1;
        return bArr[i] != 0;
    }

    @Override // io.protostuff.Input
    public byte[] readByteArray() throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        int i = this.offset;
        if (i + rawVarint32 > this.limit) {
            throw ProtobufException.misreportedSize();
        }
        byte[] bArr = new byte[rawVarint32];
        System.arraycopy(this.buffer, i, bArr, 0, rawVarint32);
        this.offset += rawVarint32;
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
        if (this.offset == this.limit) {
            this.lastTag = 0;
            return 0;
        }
        if (isCurrentFieldPacked()) {
            if (this.packedLimit >= this.offset) {
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
        byte[] bArr = this.buffer;
        int i = this.offset;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        byte b4 = bArr[i4];
        this.offset = i4 + 1;
        return (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16) | ((b4 & 255) << 24);
    }

    public long readRawLittleEndian64() throws IOException {
        byte[] bArr = this.buffer;
        int i = this.offset;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        byte b8 = bArr[i8];
        this.offset = i8 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) b4) & 255) << 24) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 40) | ((((long) b7) & 255) << 48) | ((((long) b8) & 255) << 56);
    }

    public int readRawVarint32() throws IOException {
        int i;
        byte[] bArr = this.buffer;
        int i2 = this.offset;
        int i3 = i2 + 1;
        this.offset = i3;
        byte b = bArr[i2];
        if (b >= 0) {
            return b;
        }
        int i4 = b & ByteCompanionObject.MAX_VALUE;
        int i5 = i3 + 1;
        this.offset = i5;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            i = b2 << 7;
        } else {
            i4 |= (b2 & ByteCompanionObject.MAX_VALUE) << 7;
            int i6 = i5 + 1;
            this.offset = i6;
            byte b3 = bArr[i5];
            if (b3 >= 0) {
                i = b3 << 14;
            } else {
                i4 |= (b3 & ByteCompanionObject.MAX_VALUE) << 14;
                int i7 = i6 + 1;
                this.offset = i7;
                byte b4 = bArr[i6];
                if (b4 < 0) {
                    int i8 = i4 | ((b4 & ByteCompanionObject.MAX_VALUE) << 21);
                    this.offset = i7 + 1;
                    byte b5 = bArr[i7];
                    int i9 = i8 | (b5 << 28);
                    if (b5 >= 0) {
                        return i9;
                    }
                    for (int i10 = 0; i10 < 5; i10++) {
                        byte[] bArr2 = this.buffer;
                        int i11 = this.offset;
                        this.offset = i11 + 1;
                        if (bArr2[i11] >= 0) {
                            return i9;
                        }
                    }
                    throw ProtobufException.malformedVarint();
                }
                i = b4 << 21;
            }
        }
        return i | i4;
    }

    public long readRawVarint64() throws IOException {
        byte[] bArr = this.buffer;
        int i = this.offset;
        int i2 = 0;
        long j2 = 0;
        while (i2 < 64) {
            int i3 = i + 1;
            byte b = bArr[i];
            j2 |= ((long) (b & ByteCompanionObject.MAX_VALUE)) << i2;
            if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                this.offset = i3;
                return j2;
            }
            i2 += 7;
            i = i3;
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
        int i = this.offset;
        if (i + rawVarint32 > this.limit) {
            throw ProtobufException.misreportedSize();
        }
        this.offset = i + rawVarint32;
        return StringSerializer.STRING.deser(this.buffer, i, rawVarint32);
    }

    public int readTag() throws IOException {
        if (this.offset == this.limit) {
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

    public ByteArrayInput reset(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("length cannot be negative.");
        }
        this.offset = i;
        this.limit = i + i2;
        this.packedLimit = 0;
        return this;
    }

    public ByteArrayInput setBounds(int i, int i2) {
        this.offset = i;
        this.limit = i2;
        this.packedLimit = 0;
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
            this.offset += rawVarint32;
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
        output.writeByteRange(z, i, this.buffer, this.offset, rawVarint32, z2);
        this.offset += rawVarint32;
    }

    public ByteArrayInput(byte[] bArr, int i, int i2, boolean z) {
        this.lastTag = 0;
        this.packedLimit = 0;
        this.buffer = bArr;
        this.offset = i;
        this.limit = i + i2;
        this.decodeNestedMessageAsGroup = z;
    }

    @Override // io.protostuff.Input
    public void readBytes(ByteBuffer byteBuffer) throws IOException {
        int rawVarint32 = readRawVarint32();
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        int i = this.offset;
        if (i + rawVarint32 > this.limit) {
            throw ProtobufException.misreportedSize();
        }
        byteBuffer.put(this.buffer, i, rawVarint32);
        this.offset += rawVarint32;
    }
}
