package io.protostuff;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class LowCopyProtobufOutput implements Output {
    public LinkBuffer buffer;

    public LowCopyProtobufOutput() {
        this.buffer = new LinkBuffer();
    }

    @Override // io.protostuff.Output
    public void writeBool(int i, boolean z, boolean z2) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
        this.buffer.writeByte(z ? (byte) 1 : (byte) 0);
    }

    @Override // io.protostuff.Output
    public void writeByteArray(int i, byte[] bArr, boolean z) throws IOException {
        writeByteRange(false, i, bArr, 0, bArr.length, z);
    }

    @Override // io.protostuff.Output
    public void writeByteRange(boolean z, int i, byte[] bArr, int i2, int i3, boolean z2) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 2));
        this.buffer.writeVarInt32(i3);
        this.buffer.writeByteArray(bArr, i2, i3);
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteString byteString, boolean z) throws IOException {
        writeByteArray(i, byteString.getBytes(), z);
    }

    @Override // io.protostuff.Output
    public void writeDouble(int i, double d, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 1));
        this.buffer.writeInt64LE(Double.doubleToRawLongBits(d));
    }

    @Override // io.protostuff.Output
    public void writeEnum(int i, int i2, boolean z) throws IOException {
        writeInt32(i, i2, z);
    }

    @Override // io.protostuff.Output
    public void writeFixed32(int i, int i2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 5));
        this.buffer.writeInt32LE(i2);
    }

    @Override // io.protostuff.Output
    public void writeFixed64(int i, long j2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 1));
        this.buffer.writeInt64LE(j2);
    }

    @Override // io.protostuff.Output
    public void writeFloat(int i, float f, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 5));
        this.buffer.writeInt32LE(Float.floatToRawIntBits(f));
    }

    @Override // io.protostuff.Output
    public void writeInt32(int i, int i2, boolean z) throws IOException {
        if (i2 < 0) {
            this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
            this.buffer.writeVarInt64(i2);
        } else {
            this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
            this.buffer.writeVarInt32(i2);
        }
    }

    @Override // io.protostuff.Output
    public void writeInt64(int i, long j2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
        this.buffer.writeVarInt64(j2);
    }

    @Override // io.protostuff.Output
    public <T> void writeObject(int i, T t, Schema<T> schema, boolean z) throws IOException {
        LinkBuffer linkBuffer = new LinkBuffer(this.buffer.allocSize);
        schema.writeTo(new LowCopyProtobufOutput(linkBuffer), t);
        List<ByteBuffer> listFinish = linkBuffer.finish();
        long size = linkBuffer.size();
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 2));
        this.buffer.writeVarInt64(size);
        Iterator<ByteBuffer> it = listFinish.iterator();
        while (it.hasNext()) {
            this.buffer.writeByteBuffer(it.next());
        }
    }

    @Override // io.protostuff.Output
    public void writeSFixed32(int i, int i2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 5));
        this.buffer.writeInt32LE(i2);
    }

    @Override // io.protostuff.Output
    public void writeSFixed64(int i, long j2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 1));
        this.buffer.writeInt64LE(j2);
    }

    @Override // io.protostuff.Output
    public void writeSInt32(int i, int i2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
        this.buffer.writeVarInt32(ProtobufOutput.encodeZigZag32(i2));
    }

    @Override // io.protostuff.Output
    public void writeSInt64(int i, long j2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
        this.buffer.writeVarInt64(ProtobufOutput.encodeZigZag64(j2));
    }

    @Override // io.protostuff.Output
    public void writeString(int i, CharSequence charSequence, boolean z) throws IOException {
        writeByteArray(i, charSequence.toString().getBytes("UTF-8"), z);
    }

    @Override // io.protostuff.Output
    public void writeUInt32(int i, int i2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
        this.buffer.writeVarInt32(i2);
    }

    @Override // io.protostuff.Output
    public void writeUInt64(int i, long j2, boolean z) throws IOException {
        this.buffer.writeVarInt32(WireFormat.makeTag(i, 0));
        this.buffer.writeVarInt64(j2);
    }

    @Override // io.protostuff.Output
    public void writeBytes(int i, ByteBuffer byteBuffer, boolean z) throws IOException {
        writeByteRange(false, i, byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
    }

    public LowCopyProtobufOutput(LinkBuffer linkBuffer) {
        this.buffer = linkBuffer;
    }
}
