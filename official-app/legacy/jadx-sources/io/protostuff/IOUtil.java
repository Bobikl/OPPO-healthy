package io.protostuff;

import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
final class IOUtil {
    private IOUtil() {
    }

    public static void fillBufferFrom(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                throw ProtobufException.truncatedMessage();
            }
            i2 -= i3;
            i += i3;
        }
    }

    public static int fillBufferWithDelimitedMessageFrom(InputStream inputStream, boolean z, LinkedBuffer linkedBuffer) throws IOException {
        byte[] bArr = linkedBuffer.buffer;
        int i = linkedBuffer.start;
        int length = bArr.length - i;
        int i2 = inputStream.read(bArr, i, length);
        if (i2 < 1) {
            throw new EOFException("fillBufferWithDelimitedMessageFrom");
        }
        int i3 = i2 + i;
        int i4 = i + 1;
        int i5 = bArr[i];
        if ((i5 & 128) != 0) {
            i5 &= 127;
            int i6 = 7;
            while (true) {
                if (i4 == i3) {
                    int i7 = inputStream.read(bArr, i3, length - (i3 - linkedBuffer.start));
                    if (i7 < 1) {
                        throw new EOFException("fillBufferWithDelimitedMessageFrom");
                    }
                    i3 += i7;
                }
                int i8 = i4 + 1;
                byte b = bArr[i4];
                i5 |= (b & ByteCompanionObject.MAX_VALUE) << i6;
                if ((b & ByteCompanionObject.MIN_VALUE) == 0) {
                    i4 = i8;
                    break;
                }
                if (i6 == 28) {
                    int i9 = 0;
                    while (true) {
                        if (i8 == i3) {
                            int i10 = inputStream.read(bArr, i3, length - (i3 - linkedBuffer.start));
                            if (i10 < 1) {
                                throw new EOFException("fillBufferWithDelimitedMessageFrom");
                            }
                            i3 += i10;
                        }
                        int i11 = i8 + 1;
                        if (bArr[i8] >= 0) {
                            i4 = i11;
                            break;
                        }
                        i9++;
                        if (5 == i9) {
                            throw ProtobufException.malformedVarint();
                        }
                        i8 = i11;
                    }
                } else {
                    i4 = i8;
                }
                i6 += 7;
            }
        }
        if (i5 == 0) {
            if (i4 == i3) {
                return i5;
            }
            throw ProtobufException.misreportedSize();
        }
        if (i5 < 0) {
            throw ProtobufException.negativeSize();
        }
        int i12 = i3 - i4;
        if (i12 < i5) {
            if ((i4 - linkedBuffer.start) + i5 > length) {
                if (!z) {
                    return i5;
                }
                int i13 = i5 - i12;
                while (i13 > 0) {
                    int i14 = inputStream.read(bArr, linkedBuffer.start, Math.min(i13, length));
                    if (i14 < 1) {
                        throw new EOFException("fillBufferWithDelimitedMessageFrom");
                    }
                    i13 -= i14;
                }
                return i5;
            }
            fillBufferFrom(inputStream, bArr, i3, i5 - i12);
        }
        linkedBuffer.offset = i4;
        return i5;
    }

    public static <T> int mergeDelimitedFrom(InputStream inputStream, byte[] bArr, T t, Schema<T> schema, boolean z) throws IOException {
        int rawVarint32 = inputStream.read();
        if (rawVarint32 == -1) {
            throw new EOFException("mergeDelimitedFrom");
        }
        if (rawVarint32 >= 128) {
            rawVarint32 = CodedInput.readRawVarint32(inputStream, rawVarint32);
        }
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        if (rawVarint32 != 0) {
            if (rawVarint32 > bArr.length) {
                throw new ProtobufException("size limit exceeded. " + rawVarint32 + " > " + bArr.length);
            }
            fillBufferFrom(inputStream, bArr, 0, rawVarint32);
            ByteArrayInput byteArrayInput = new ByteArrayInput(bArr, 0, rawVarint32, z);
            try {
                schema.mergeFrom(byteArrayInput, t);
                byteArrayInput.checkLastTagWas(0);
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw ProtobufException.truncatedMessage(e2);
            }
        }
        return rawVarint32;
    }

    public static <T> void mergeFrom(byte[] bArr, int i, int i2, T t, Schema<T> schema, boolean z) {
        try {
            ByteArrayInput byteArrayInput = new ByteArrayInput(bArr, i, i2, z);
            schema.mergeFrom(byteArrayInput, t);
            byteArrayInput.checkLastTagWas(0);
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new RuntimeException("Truncated.", ProtobufException.truncatedMessage(e3));
        }
    }

    public static int putVarInt32AndGetOffset(int i, byte[] bArr, int i2) {
        int iComputeRawVarint32Size = ProtobufOutput.computeRawVarint32Size(i);
        if (iComputeRawVarint32Size == 1) {
            int i3 = i2 + 4;
            bArr[i3] = (byte) i;
            return i3;
        }
        if (iComputeRawVarint32Size == 2) {
            int i4 = i2 + 3;
            bArr[i4] = (byte) ((i & 127) | 128);
            bArr[i2 + 4] = (byte) (i >>> 7);
            return i4;
        }
        if (iComputeRawVarint32Size == 3) {
            int i5 = i2 + 2;
            bArr[i5] = (byte) ((i & 127) | 128);
            bArr[i2 + 3] = (byte) (((i >>> 7) & 127) | 128);
            bArr[i2 + 4] = (byte) (i >>> 14);
            return i5;
        }
        if (iComputeRawVarint32Size != 4) {
            bArr[i2] = (byte) ((i & 127) | 128);
            bArr[i2 + 1] = (byte) (((i >>> 7) & 127) | 128);
            bArr[i2 + 2] = (byte) (((i >>> 14) & 127) | 128);
            bArr[i2 + 3] = (byte) (((i >>> 21) & 127) | 128);
            bArr[i2 + 4] = (byte) (i >>> 28);
            return i2;
        }
        int i6 = i2 + 1;
        bArr[i6] = (byte) ((i & 127) | 128);
        bArr[i2 + 2] = (byte) (((i >>> 7) & 127) | 128);
        bArr[i2 + 3] = (byte) (((i >>> 14) & 127) | 128);
        bArr[i2 + 4] = (byte) (i >>> 21);
        return i6;
    }

    public static <T> void mergeFrom(InputStream inputStream, byte[] bArr, T t, Schema<T> schema, boolean z) throws IOException {
        CodedInput codedInput = new CodedInput(inputStream, bArr, z);
        schema.mergeFrom(codedInput, t);
        codedInput.checkLastTagWas(0);
    }

    public static <T> void mergeFrom(InputStream inputStream, T t, Schema<T> schema, boolean z) throws IOException {
        CodedInput codedInput = new CodedInput(inputStream, z);
        schema.mergeFrom(codedInput, t);
        codedInput.checkLastTagWas(0);
    }

    public static <T> int mergeDelimitedFrom(InputStream inputStream, T t, Schema<T> schema, boolean z) throws IOException {
        int rawVarint32 = inputStream.read();
        if (rawVarint32 == -1) {
            throw new EOFException("mergeDelimitedFrom");
        }
        if (rawVarint32 >= 128) {
            rawVarint32 = CodedInput.readRawVarint32(inputStream, rawVarint32);
        }
        if (rawVarint32 < 0) {
            throw ProtobufException.negativeSize();
        }
        if (rawVarint32 != 0) {
            if (rawVarint32 > 4096) {
                CodedInput codedInput = new CodedInput(new LimitedInputStream(inputStream, rawVarint32), z);
                schema.mergeFrom(codedInput, t);
                codedInput.checkLastTagWas(0);
                return rawVarint32;
            }
            byte[] bArr = new byte[rawVarint32];
            fillBufferFrom(inputStream, bArr, 0, rawVarint32);
            ByteArrayInput byteArrayInput = new ByteArrayInput(bArr, 0, rawVarint32, z);
            try {
                schema.mergeFrom(byteArrayInput, t);
                byteArrayInput.checkLastTagWas(0);
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw ProtobufException.truncatedMessage(e2);
            }
        }
        return rawVarint32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> int mergeDelimitedFrom(DataInput dataInput, T t, Schema<T> schema, boolean z) throws IOException {
        int rawVarint32;
        byte b = dataInput.readByte();
        int i = b & ByteCompanionObject.MIN_VALUE;
        int i2 = b;
        if (i != 0) {
            rawVarint32 = CodedInput.readRawVarint32(dataInput, b);
        }
        if (i2 >= 0) {
            if (i2 != 0) {
                if (i2 > 4096 && (dataInput instanceof InputStream)) {
                    CodedInput codedInput = new CodedInput(new LimitedInputStream((InputStream) dataInput, i2), z);
                    schema.mergeFrom(codedInput, t);
                    codedInput.checkLastTagWas(0);
                } else {
                    byte[] bArr = new byte[i2];
                    dataInput.readFully(bArr, 0, i2);
                    ByteArrayInput byteArrayInput = new ByteArrayInput(bArr, 0, i2, z);
                    try {
                        schema.mergeFrom(byteArrayInput, t);
                        byteArrayInput.checkLastTagWas(0);
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw ProtobufException.truncatedMessage(e2);
                    }
                }
            }
            if (schema.isInitialized(t)) {
                return i2;
            }
            throw new UninitializedMessageException((Object) t, (Schema<?>) schema);
        }
        i2 = rawVarint32;
        throw ProtobufException.negativeSize();
    }
}
