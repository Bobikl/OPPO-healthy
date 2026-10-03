package io.protostuff;

import io.protostuff.Output;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class FilterOutput<F extends Output> implements Output {
    protected final F output;

    public FilterOutput(F f) {
        this.output = f;
    }

    @Override // io.protostuff.Output
    public void writeBool(int i, boolean z, boolean z2) throws IOException {
        this.output.writeBool(i, z, z2);
    }

    @Override // io.protostuff.Output
    public void writeByteArray(int i, byte[] bArr, boolean z) throws IOException {
        this.output.writeByteArray(i, bArr, z);
    }

    @Override // io.protostuff.Output
    public void writeByteRange(boolean z, int i, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        this.output.writeByteRange(z, i, bArr, i2, i3, z2);
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteString byteString, boolean z) throws IOException {
        this.output.writeBytes(i, byteString, z);
    }

    @Override // io.protostuff.Output
    public void writeDouble(int i, double d, boolean z) throws IOException {
        this.output.writeDouble(i, d, z);
    }

    @Override // io.protostuff.Output
    public void writeEnum(int i, int i2, boolean z) throws IOException {
        this.output.writeEnum(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeFixed32(int i, int i2, boolean z) throws IOException {
        this.output.writeFixed32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeFixed64(int i, long j2, boolean z) throws IOException {
        this.output.writeFixed64(i, j2, z);
    }

    @Override // io.protostuff.Output
    public void writeFloat(int i, float f, boolean z) throws IOException {
        this.output.writeFloat(i, f, z);
    }

    @Override // io.protostuff.Output
    public void writeInt32(int i, int i2, boolean z) throws IOException {
        this.output.writeInt32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeInt64(int i, long j2, boolean z) throws IOException {
        this.output.writeInt64(i, j2, z);
    }

    @Override // io.protostuff.Output
    public <T> void writeObject(int i, T t, Schema<T> schema, boolean z) throws IOException {
        this.output.writeObject(i, t, schema, z);
    }

    @Override // io.protostuff.Output
    public void writeSFixed32(int i, int i2, boolean z) throws IOException {
        this.output.writeSFixed32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeSFixed64(int i, long j2, boolean z) throws IOException {
        this.output.writeSFixed64(i, j2, z);
    }

    @Override // io.protostuff.Output
    public void writeSInt32(int i, int i2, boolean z) throws IOException {
        this.output.writeSInt32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeSInt64(int i, long j2, boolean z) throws IOException {
        this.output.writeSInt64(i, j2, z);
    }

    @Override // io.protostuff.Output
    public void writeString(int i, CharSequence charSequence, boolean z) throws IOException {
        this.output.writeString(i, charSequence, z);
    }

    @Override // io.protostuff.Output
    public void writeUInt32(int i, int i2, boolean z) throws IOException {
        this.output.writeUInt32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeUInt64(int i, long j2, boolean z) throws IOException {
        this.output.writeUInt64(i, j2, z);
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteBuffer byteBuffer, boolean z) throws IOException {
        writeByteRange(false, i, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
    }
}
