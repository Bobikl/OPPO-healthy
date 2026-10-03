package io.protostuff;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public final class ProtostuffOutput extends WriteSession implements Output {
    public ProtostuffOutput(LinkedBuffer linkedBuffer) {
        super(linkedBuffer);
    }

    @Override // io.protostuff.Output
    public void writeBool(int i, boolean z, boolean z2) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeByte(z ? (byte) 1 : (byte) 0, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeByteArray(int i, byte[] bArr, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeByteArray(bArr, 0, bArr.length, this, writeSink.writeVarInt32(bArr.length, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 2), this, this.tail)));
    }

    @Override // io.protostuff.Output
    public void writeByteRange(boolean z, int i, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeByteArray(bArr, i2, i3, this, writeSink.writeVarInt32(i3, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 2), this, this.tail)));
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteString byteString, boolean z) throws IOException {
        writeByteArray(i, byteString.getBytes(), z);
    }

    @Override // io.protostuff.Output
    public void writeDouble(int i, double d, boolean z) throws IOException {
        this.tail = this.sink.writeInt64LE(Double.doubleToRawLongBits(d), this, this.sink.writeVarInt32(WireFormat.makeTag(i, 1), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeEnum(int i, int i2, boolean z) throws IOException {
        writeInt32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeFixed32(int i, int i2, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeInt32LE(i2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 5), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeFixed64(int i, long j2, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeInt64LE(j2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 1), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeFloat(int i, float f, boolean z) throws IOException {
        this.tail = this.sink.writeInt32LE(Float.floatToRawIntBits(f), this, this.sink.writeVarInt32(WireFormat.makeTag(i, 5), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeInt32(int i, int i2, boolean z) throws IOException {
        if (i2 < 0) {
            WriteSink writeSink = this.sink;
            this.tail = writeSink.writeVarInt64(i2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
        } else {
            WriteSink writeSink2 = this.sink;
            this.tail = writeSink2.writeVarInt32(i2, this, writeSink2.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
        }
    }

    @Override // io.protostuff.Output
    public void writeInt64(int i, long j2, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeVarInt64(j2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
    }

    @Override // io.protostuff.Output
    public <T> void writeObject(int i, T t, Schema<T> schema, boolean z) throws IOException {
        this.tail = this.sink.writeVarInt32(WireFormat.makeTag(i, 3), this, this.tail);
        schema.writeTo(this, t);
        this.tail = this.sink.writeVarInt32(WireFormat.makeTag(i, 4), this, this.tail);
    }

    @Override // io.protostuff.Output
    public void writeSFixed32(int i, int i2, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeInt32LE(i2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 5), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeSFixed64(int i, long j2, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeInt64LE(j2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 1), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeSInt32(int i, int i2, boolean z) throws IOException {
        this.tail = this.sink.writeVarInt32(ProtobufOutput.encodeZigZag32(i2), this, this.sink.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeSInt64(int i, long j2, boolean z) throws IOException {
        this.tail = this.sink.writeVarInt64(ProtobufOutput.encodeZigZag64(j2), this, this.sink.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeString(int i, CharSequence charSequence, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeStrUTF8VarDelimited(charSequence, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 2), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeUInt32(int i, int i2, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeVarInt32(i2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
    }

    @Override // io.protostuff.Output
    public void writeUInt64(int i, long j2, boolean z) throws IOException {
        WriteSink writeSink = this.sink;
        this.tail = writeSink.writeVarInt64(j2, this, writeSink.writeVarInt32(WireFormat.makeTag(i, 0), this, this.tail));
    }

    public ProtostuffOutput(LinkedBuffer linkedBuffer, OutputStream outputStream) {
        super(linkedBuffer, outputStream);
    }

    @Override // io.protostuff.WriteSession
    public ProtostuffOutput clear() {
        super.clear();
        return this;
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteBuffer byteBuffer, boolean z) throws IOException {
        writeByteRange(false, i, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
    }

    public ProtostuffOutput(LinkedBuffer linkedBuffer, OutputStream outputStream, WriteSession.FlushHandler flushHandler, int i) {
        super(linkedBuffer, outputStream, flushHandler, i);
    }
}
