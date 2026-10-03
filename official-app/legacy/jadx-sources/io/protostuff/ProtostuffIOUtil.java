package io.protostuff;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ProtostuffIOUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private ProtostuffIOUtil() {
    }

    public static <T> int mergeDelimitedFrom(InputStream inputStream, T t, Schema<T> schema) throws IOException {
        return IOUtil.mergeDelimitedFrom(inputStream, (Object) t, (Schema) schema, true);
    }

    public static <T> void mergeFrom(byte[] bArr, T t, Schema<T> schema) {
        IOUtil.mergeFrom(bArr, 0, bArr.length, t, schema, true);
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
        ProtostuffOutput protostuffOutput = new ProtostuffOutput(linkedBuffer);
        linkedBuffer.offset = linkedBuffer.start + 5;
        protostuffOutput.size += 5;
        schema.writeTo(protostuffOutput, t);
        int i = protostuffOutput.size - 5;
        int iPutVarInt32AndGetOffset = IOUtil.putVarInt32AndGetOffset(i, linkedBuffer.buffer, linkedBuffer.start);
        outputStream.write(linkedBuffer.buffer, iPutVarInt32AndGetOffset, linkedBuffer.offset - iPutVarInt32AndGetOffset);
        LinkedBuffer linkedBuffer2 = linkedBuffer.next;
        if (linkedBuffer2 != null) {
            LinkedBuffer.writeTo(outputStream, linkedBuffer2);
        }
        return i;
    }

    public static <T> List<T> parseListFrom(InputStream inputStream, Schema<T> schema) throws IOException {
        int rawVarint32 = inputStream.read();
        if (rawVarint32 == -1) {
            return Collections.emptyList();
        }
        if (rawVarint32 > 127) {
            rawVarint32 = CodedInput.readRawVarint32(inputStream, rawVarint32);
        }
        ArrayList arrayList = new ArrayList(rawVarint32);
        CodedInput codedInput = new CodedInput(inputStream, true);
        for (int i = 0; i < rawVarint32; i++) {
            T tNewMessage = schema.newMessage();
            arrayList.add(tNewMessage);
            schema.mergeFrom(codedInput, tNewMessage);
            codedInput.checkLastTagWas(0);
        }
        return arrayList;
    }

    public static <T> byte[] toByteArray(T t, Schema<T> schema, LinkedBuffer linkedBuffer) {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtostuffOutput protostuffOutput = new ProtostuffOutput(linkedBuffer);
        try {
            schema.writeTo(protostuffOutput, t);
            return protostuffOutput.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e2);
        }
    }

    public static <T> int writeDelimitedTo(OutputStream outputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtostuffOutput protostuffOutput = new ProtostuffOutput(linkedBuffer);
        schema.writeTo(protostuffOutput, t);
        ProtobufOutput.writeRawVarInt32Bytes(outputStream, protostuffOutput.size);
        LinkedBuffer.writeTo(outputStream, linkedBuffer);
        return protostuffOutput.size;
    }

    public static <T> int writeListTo(OutputStream outputStream, List<T> list, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        ProtostuffOutput protostuffOutput = new ProtostuffOutput(linkedBuffer, outputStream);
        protostuffOutput.sink.writeVarInt32(size, protostuffOutput, linkedBuffer);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            schema.writeTo(protostuffOutput, it.next());
            protostuffOutput.sink.writeByte((byte) 7, protostuffOutput, linkedBuffer);
        }
        LinkedBuffer.writeTo(outputStream, linkedBuffer);
        return protostuffOutput.size;
    }

    public static <T> int writeTo(LinkedBuffer linkedBuffer, T t, Schema<T> schema) {
        if (linkedBuffer.start != linkedBuffer.offset) {
            throw new IllegalArgumentException("Buffer previously used and had not been reset.");
        }
        ProtostuffOutput protostuffOutput = new ProtostuffOutput(linkedBuffer);
        try {
            schema.writeTo(protostuffOutput, t);
            return protostuffOutput.getSize();
        } catch (IOException e2) {
            throw new RuntimeException("Serializing to a LinkedBuffer threw an IOException (should never happen).", e2);
        }
    }

    public static <T> int mergeDelimitedFrom(InputStream inputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        return IOUtil.mergeDelimitedFrom(inputStream, linkedBuffer.buffer, t, schema, true);
    }

    public static <T> void mergeFrom(byte[] bArr, int i, int i2, T t, Schema<T> schema) {
        IOUtil.mergeFrom(bArr, i, i2, t, schema, true);
    }

    public static Pipe newPipe(byte[] bArr, int i, int i2) {
        final ByteArrayInput byteArrayInput = new ByteArrayInput(bArr, i, i2, true);
        return new Pipe() { // from class: io.protostuff.ProtostuffIOUtil.1
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
        ByteArrayInput byteArrayInput = new ByteArrayInput(linkedBuffer.buffer, i2, iFillBufferWithDelimitedMessageFrom, true);
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
        return IOUtil.mergeDelimitedFrom(dataInput, (Object) t, (Schema) schema, true);
    }

    public static <T> void mergeFrom(InputStream inputStream, T t, Schema<T> schema) throws IOException {
        IOUtil.mergeFrom(inputStream, t, schema, true);
    }

    public static <T> void mergeFrom(InputStream inputStream, T t, Schema<T> schema, LinkedBuffer linkedBuffer) throws IOException {
        IOUtil.mergeFrom(inputStream, linkedBuffer.buffer, t, schema, true);
    }

    public static Pipe newPipe(InputStream inputStream) {
        final CodedInput codedInput = new CodedInput(inputStream, true);
        return new Pipe() { // from class: io.protostuff.ProtostuffIOUtil.2
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
            ProtostuffOutput protostuffOutput = new ProtostuffOutput(linkedBuffer, outputStream);
            schema.writeTo(protostuffOutput, t);
            LinkedBuffer.writeTo(outputStream, linkedBuffer);
            return protostuffOutput.size;
        }
        throw new IllegalArgumentException("Buffer previously used and had not been reset.");
    }

    public static <T> int writeDelimitedTo(DataOutput dataOutput, T t, Schema<T> schema) throws IOException {
        LinkedBuffer linkedBuffer = new LinkedBuffer(256);
        ProtostuffOutput protostuffOutput = new ProtostuffOutput(linkedBuffer);
        schema.writeTo(protostuffOutput, t);
        ProtobufOutput.writeRawVarInt32Bytes(dataOutput, protostuffOutput.size);
        LinkedBuffer.writeTo(dataOutput, linkedBuffer);
        return protostuffOutput.size;
    }
}
