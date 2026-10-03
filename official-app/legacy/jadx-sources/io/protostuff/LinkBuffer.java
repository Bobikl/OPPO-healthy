package io.protostuff;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LinkBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_BUFFER_SIZE = 256;
    public final int allocSize;
    List<ByteBuffer> buffers;
    ByteBuffer current;

    public LinkBuffer() {
        this(256);
    }

    private void ensureCapacity(int i) {
        if (this.current.remaining() < i) {
            nextBuffer();
        }
    }

    private void nextBuffer() {
        this.current.flip();
        this.buffers.add(this.current);
        this.current = ByteBuffer.allocate(this.allocSize);
    }

    private void spliceBuffer(ByteBuffer byteBuffer) {
        if (this.current.position() == 0) {
            this.buffers.add(byteBuffer);
            return;
        }
        this.current.flip();
        this.buffers.add(this.current);
        this.buffers.add(byteBuffer);
        this.current = ByteBuffer.allocate(this.allocSize);
    }

    public List<ByteBuffer> finish() {
        this.current.flip();
        this.buffers.add(this.current);
        this.current = null;
        this.buffers = Collections.unmodifiableList(this.buffers);
        return getBuffers();
    }

    public List<ByteBuffer> getBuffers() {
        ArrayList arrayList = new ArrayList(this.buffers.size() + (this.current != null ? 1 : 0));
        Iterator<ByteBuffer> it = this.buffers.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().duplicate());
        }
        ByteBuffer byteBuffer = this.current;
        if (byteBuffer != null) {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            arrayList.add(byteBufferDuplicate);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public long size() {
        Iterator<ByteBuffer> it = this.buffers.iterator();
        long jRemaining = 0;
        while (it.hasNext()) {
            jRemaining += (long) it.next().remaining();
        }
        ByteBuffer byteBuffer = this.current;
        return byteBuffer != null ? jRemaining + ((long) byteBuffer.position()) : jRemaining;
    }

    public LinkBuffer writeByte(byte b) throws IOException {
        ensureCapacity(1);
        this.current.put(b);
        return this;
    }

    public LinkBuffer writeByteArray(byte[] bArr, int i, int i2) throws IOException {
        if (this.current.remaining() >= i2) {
            this.current.put(bArr, i, i2);
        } else {
            spliceBuffer(ByteBuffer.wrap(bArr, i, i2));
        }
        return this;
    }

    public LinkBuffer writeByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        if (this.current.remaining() >= byteBufferSlice.remaining()) {
            this.current.put(byteBufferSlice);
        } else {
            spliceBuffer(byteBufferSlice);
        }
        return this;
    }

    public LinkBuffer writeDouble(double d) throws IOException {
        return writeInt64(Double.doubleToRawLongBits(d));
    }

    public LinkBuffer writeFloat(float f) throws IOException {
        return writeInt32(Float.floatToRawIntBits(f));
    }

    public LinkBuffer writeInt16(int i) throws IOException {
        ensureCapacity(2);
        this.current.putShort((short) i);
        return this;
    }

    public LinkBuffer writeInt16LE(int i) throws IOException {
        ensureCapacity(2);
        IntSerializer.writeInt16LE(i, this.current);
        return this;
    }

    public LinkBuffer writeInt32(int i) throws IOException {
        ensureCapacity(4);
        this.current.putInt(i);
        return this;
    }

    public LinkBuffer writeInt32LE(int i) throws IOException {
        ensureCapacity(4);
        IntSerializer.writeInt32LE(i, this.current);
        return this;
    }

    public LinkBuffer writeInt64(long j2) throws IOException {
        ensureCapacity(8);
        this.current.putLong(j2);
        return this;
    }

    public LinkBuffer writeInt64LE(long j2) throws IOException {
        ensureCapacity(8);
        IntSerializer.writeInt64LE(j2, this.current);
        return this;
    }

    public LinkBuffer writeVarInt32(int i) throws IOException {
        byte[] bArr = new byte[5];
        int i2 = 0;
        while ((i & (-128)) != 0) {
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
            i2++;
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        ensureCapacity(i3);
        this.current.put(bArr, 0, i3);
        return this;
    }

    public LinkBuffer writeVarInt64(long j2) throws IOException {
        byte[] bArr = new byte[10];
        int i = 0;
        while (((-128) & j2) != 0) {
            bArr[i] = (byte) ((((int) j2) & 127) | 128);
            j2 >>>= 7;
            i++;
        }
        int i2 = i + 1;
        bArr[i] = (byte) j2;
        ensureCapacity(i2);
        this.current.put(bArr, 0, i2);
        return this;
    }

    public LinkBuffer(int i) {
        this.buffers = new ArrayList();
        this.allocSize = i;
        this.current = ByteBuffer.allocate(i);
    }

    public LinkBuffer writeByteArray(byte[] bArr) throws IOException {
        return writeByteArray(bArr, 0, bArr.length);
    }
}
