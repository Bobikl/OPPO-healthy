package io.protostuff;

import io.protostuff.Input;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class FilterInput<F extends Input> implements Input {
    protected final F input;

    public FilterInput(F f) {
        this.input = f;
    }

    @Override // io.protostuff.Input
    public <T> void handleUnknownField(int i, Schema<T> schema) throws IOException {
        this.input.handleUnknownField(i, schema);
    }

    @Override // io.protostuff.Input
    public <T> T mergeObject(T t, Schema<T> schema) throws IOException {
        return (T) this.input.mergeObject(t, schema);
    }

    @Override // io.protostuff.Input
    public boolean readBool() throws IOException {
        return this.input.readBool();
    }

    @Override // io.protostuff.Input
    public byte[] readByteArray() throws IOException {
        return this.input.readByteArray();
    }

    @Override // io.protostuff.Input
    public ByteBuffer readByteBuffer() throws IOException {
        return ByteBuffer.wrap(readByteArray());
    }

    @Override // io.protostuff.Input
    public ByteString readBytes() throws IOException {
        return this.input.readBytes();
    }

    @Override // io.protostuff.Input
    public double readDouble() throws IOException {
        return this.input.readDouble();
    }

    @Override // io.protostuff.Input
    public int readEnum() throws IOException {
        return this.input.readEnum();
    }

    @Override // io.protostuff.Input
    public <T> int readFieldNumber(Schema<T> schema) throws IOException {
        return this.input.readFieldNumber(schema);
    }

    @Override // io.protostuff.Input
    public int readFixed32() throws IOException {
        return this.input.readFixed32();
    }

    @Override // io.protostuff.Input
    public long readFixed64() throws IOException {
        return this.input.readFixed64();
    }

    @Override // io.protostuff.Input
    public float readFloat() throws IOException {
        return this.input.readFloat();
    }

    @Override // io.protostuff.Input
    public int readInt32() throws IOException {
        return this.input.readInt32();
    }

    @Override // io.protostuff.Input
    public long readInt64() throws IOException {
        return this.input.readInt64();
    }

    @Override // io.protostuff.Input
    public int readSFixed32() throws IOException {
        return this.input.readSFixed32();
    }

    @Override // io.protostuff.Input
    public long readSFixed64() throws IOException {
        return this.input.readSFixed64();
    }

    @Override // io.protostuff.Input
    public int readSInt32() throws IOException {
        return this.input.readSInt32();
    }

    @Override // io.protostuff.Input
    public long readSInt64() throws IOException {
        return this.input.readSInt64();
    }

    @Override // io.protostuff.Input
    public String readString() throws IOException {
        return this.input.readString();
    }

    @Override // io.protostuff.Input
    public int readUInt32() throws IOException {
        return this.input.readUInt32();
    }

    @Override // io.protostuff.Input
    public long readUInt64() throws IOException {
        return this.input.readUInt64();
    }

    @Override // io.protostuff.Input
    public void transferByteRangeTo(Output output, boolean z, int i, boolean z2) throws IOException {
        this.input.transferByteRangeTo(output, z, i, z2);
    }

    @Override // io.protostuff.Input
    public void readBytes(ByteBuffer byteBuffer) throws IOException {
        this.input.readBytes(byteBuffer);
    }
}
