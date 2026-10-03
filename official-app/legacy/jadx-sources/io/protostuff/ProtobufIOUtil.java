package io.protostuff;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ProtobufIOUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private ProtobufIOUtil() {
    }

    public static <T> int mergeDelimitedFrom(InputStream inputStream, T t, Schema<T> schema) throws IOException {
        return IOUtil.mergeDelimitedFrom(inputStream, (Object) t, (Schema) schema, false);
    }

    public static <T> void mergeFrom(byte[] bArr, T t, Schema<T> schema) {
        IOUtil.mergeFrom(bArr, 0, bArr.length, t, schema, false);
    }

    public static Pipe newPipe(byte[] bArr) {
        return newPipe(bArr, 0, bArr.length);
    }

    public static <T> boolean optMergeDelimitedFrom(InputStream inputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        return optMergeDelimitedFrom(inputStream, t, schema, true, linkedBuffer);
    }

    public static <T> int optWriteDelimitedTo(OutputStream outputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtobufOutput protobufOutput = new ProtobufOutput(linkedBuffer);
        linkedBuffer.offset = linkedBuffer.start + 5;
        protobufOutput.size += 5;
        schema.writeTo(protobufOutput, t);
        int i = protobufOutput.size - 5;
        int iPutVarInt32AndGetOffset = IOUtil.putVarInt32AndGetOffset(i, linkedBuffer.buffer, linkedBuffer.start);
        outputStream.write(linkedBuffer.buffer, iPutVarInt32AndGetOffset, linkedBuffer.offset - iPutVarInt32AndGetOffset);
        LinkedBuffer linkedBuffer2 = linkedBuffer.next;
        if (linkedBuffer2 != null) {
            LinkedBuffer.writeTo(outputStream, linkedBuffer2);
        }
        return i;
    }

    public static <T> List<T> parseListFrom(InputStream inputStream, Schema<T> schema) throws IOException {
        ArrayList arrayList = new ArrayList();
        int rawVarint32 = inputStream.read();
        LimitedInputStream limitedInputStream = null;
        byte[] bArr = null;
        int i = 0;
        while (rawVarint32 != -1) {
            T tNewMessage = schema.newMessage();
            arrayList.add(tNewMessage);
            if (rawVarint32 >= 128) {
                rawVarint32 = CodedInput.readRawVarint32(inputStream, rawVarint32);
            }
            if (rawVarint32 != 0) {
                if (rawVarint32 > 4096) {
                    if (limitedInputStream == null) {
                        limitedInputStream = new LimitedInputStream(inputStream);
                    }
                    CodedInput codedInput = new CodedInput(limitedInputStream.limit(rawVarint32), false);
                    schema.mergeFrom(codedInput, tNewMessage);
                    codedInput.checkLastTagWas(0);
                } else {
                    if (i < rawVarint32) {
                        bArr = new byte[rawVarint32];
                        i = rawVarint32;
                    }
                    IOUtil.fillBufferFrom(inputStream, bArr, 0, rawVarint32);
                    ByteArrayInput byteArrayInput = new ByteArrayInput(bArr, 0, rawVarint32, false);
                    try {
                        schema.mergeFrom(byteArrayInput, tNewMessage);
                        byteArrayInput.checkLastTagWas(0);
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw ProtobufException.truncatedMessage(e2);
                    }
                }
            }
            rawVarint32 = inputStream.read();
        }
        return arrayList;
    }

    public static <T> byte[] toByteArray(T t, Schema<T> schema, LinkedBuffer linkedBuffer) {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtobufOutput protobufOutput = new ProtobufOutput(linkedBuffer);
        try {
            schema.writeTo(protobufOutput, t);
            return protobufOutput.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static <T> int writeDelimitedTo(OutputStream outputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtobufOutput protobufOutput = new ProtobufOutput(linkedBuffer);
        schema.writeTo(protobufOutput, t);
        int size = protobufOutput.getSize();
        ProtobufOutput.writeRawVarInt32Bytes(outputStream, size);
        LinkedBuffer.writeTo(outputStream, linkedBuffer);
        return size;
    }

    public static <T> int writeListTo(OutputStream outputStream, List<T> list, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtobufOutput protobufOutput = new ProtobufOutput(linkedBuffer);
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            schema.writeTo(protobufOutput, it.next());
            int size = protobufOutput.getSize();
            ProtobufOutput.writeRawVarInt32Bytes(outputStream, size);
            LinkedBuffer.writeTo(outputStream, linkedBuffer);
            i += size;
            protobufOutput.clear();
        }
        return i;
    }

    public static <T> int writeTo(LinkedBuffer linkedBuffer, T t, Schema<T> schema) {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtobufOutput protobufOutput = new ProtobufOutput(linkedBuffer);
        try {
            schema.writeTo(protobufOutput, t);
            return protobufOutput.getSize();
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a LinkedBuffer threw an IOException (should never happen).", e2);
        }
    }

    public static <T> int mergeDelimitedFrom(InputStream inputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        return IOUtil.mergeDelimitedFrom(inputStream, linkedBuffer.buffer, t, schema, false);
    }

    public static <T> void mergeFrom(byte[] bArr, int i, int i2, T t, Schema<T> schema) {
        IOUtil.mergeFrom(bArr, i, i2, t, schema, false);
    }

    public static Pipe newPipe(byte[] bArr, int i, int i2) {
        final ByteArrayInput byteArrayInput = new ByteArrayInput(bArr, i, i2, false);
        return new Pipe() { // from class: io.protostuff.ProtobufIOUtil.1
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.protostuff.Pipe
            public Input begin(Pipe.Schema<?> schema) throws IOException {
                return byteArrayInput;
            }

            @Override // io.protostuff.Pipe
            public void end(Pipe.Schema<?> schema, Input input, boolean z) throws IOException {
            }
        };
    }

    public static <T> boolean optMergeDelimitedFrom(InputStream inputStream, T t, Schema<T> schema, boolean z, LinkedBuffer linkedBuffer) throws IOException {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        int iFillBufferWithDelimitedMessageFrom = IOUtil.fillBufferWithDelimitedMessageFrom(inputStream, z, linkedBuffer);
        if (iFillBufferWithDelimitedMessageFrom == 0) {
            return true;
        }
        int i = linkedBuffer.start;
        int i2 = linkedBuffer.offset;
        if (i == i2) {
            return false;
        }
        ByteArrayInput byteArrayInput = new ByteArrayInput(linkedBuffer.buffer, i2, iFillBufferWithDelimitedMessageFrom, false);
        try {
            try {
                schema.mergeFrom(byteArrayInput, t);
                byteArrayInput.checkLastTagWas(0);
                linkedBuffer.offset = linkedBuffer.start;
                return true;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw ProtobufException.truncatedMessage(e2);
            }
        } catch (Throwable th) {
            linkedBuffer.offset = linkedBuffer.start;
            throw th;
        }
    }

    public static <T> int mergeDelimitedFrom(DataInput dataInput, T t, Schema<T> schema) throws IOException {
        return IOUtil.mergeDelimitedFrom(dataInput, (Object) t, (Schema) schema, false);
    }

    public static <T> void mergeFrom(InputStream inputStream, T t, Schema<T> schema) throws IOException {
        IOUtil.mergeFrom(inputStream, t, schema, false);
    }

    public static <T> void mergeFrom(InputStream inputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        IOUtil.mergeFrom(inputStream, linkedBuffer.buffer, t, schema, false);
    }

    public static Pipe newPipe(InputStream inputStream) {
        final CodedInput codedInput = new CodedInput(inputStream, false);
        return new Pipe() { // from class: io.protostuff.ProtobufIOUtil.2
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.protostuff.Pipe
            public Input begin(Pipe.Schema<?> schema) throws IOException {
                return codedInput;
            }

            @Override // io.protostuff.Pipe
            public void end(Pipe.Schema<?> schema, Input input, boolean z) throws IOException {
            }
        };
    }

    public static <T> int writeTo(OutputStream outputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        if (linkedBuffer.start == linkedBuffer.offset) {
            schema.writeTo(new ProtobufOutput(linkedBuffer), t);
            return LinkedBuffer.writeTo(outputStream, linkedBuffer);
        }
        throw new IllegalArgumentException("Buffer previously used and had not been reset.");
    }

    public static <T> int writeDelimitedTo(DataOutput dataOutput, T t, Schema<T> schema) throws IOException {
        LinkedBuffer linkedBuffer = new LinkedBuffer(256);
        ProtobufOutput protobufOutput = new ProtobufOutput(linkedBuffer);
        schema.writeTo(protobufOutput, t);
        int size = protobufOutput.getSize();
        ProtobufOutput.writeRawVarInt32Bytes(dataOutput, size);
        LinkedBuffer.writeTo(dataOutput, linkedBuffer);
        return size;
    }
}
