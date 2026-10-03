package io.protostuff;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class LinkedBuffer {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_BUFFER_SIZE = 512;
    public static final int MIN_BUFFER_SIZE = 256;
    final byte[] buffer;
    LinkedBuffer next;
    int offset;
    final int start;

    public LinkedBuffer(int i) {
        this(new byte[i], 0, 0);
    }

    public static LinkedBuffer allocate() {
        return new LinkedBuffer(512);
    }

    public static LinkedBuffer use(byte[] bArr) {
        return use(bArr, 0);
    }

    public static LinkedBuffer wrap(byte[] bArr, int i, int i2) {
        return new LinkedBuffer(bArr, i, i2 + i);
    }

    public static int writeTo(OutputStream outputStream, LinkedBuffer linkedBuffer) throws IOException {
        int i = 0;
        do {
            int i2 = linkedBuffer.offset;
            int i3 = linkedBuffer.start;
            int i4 = i2 - i3;
            if (i4 > 0) {
                outputStream.write(linkedBuffer.buffer, i3, i4);
                i += i4;
            }
            linkedBuffer = linkedBuffer.next;
        } while (linkedBuffer != null);
        return i;
    }

    public LinkedBuffer clear() {
        this.next = null;
        this.offset = this.start;
        return this;
    }

    public LinkedBuffer(int i, LinkedBuffer linkedBuffer) {
        this(new byte[i], 0, 0, linkedBuffer);
    }

    public static LinkedBuffer allocate(int i) {
        if (i >= 256) {
            return new LinkedBuffer(i);
        }
        throw new IllegalArgumentException("256 is the minimum buffer size.");
    }

    public static LinkedBuffer use(byte[] bArr, int i) {
        if (bArr.length - i >= 256) {
            return new LinkedBuffer(bArr, i, i);
        }
        throw new IllegalArgumentException("256 is the minimum buffer size.");
    }

    public LinkedBuffer(byte[] bArr, int i) {
        this(bArr, i, i);
    }

    public LinkedBuffer(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.start = i;
        this.offset = i2;
    }

    public static LinkedBuffer allocate(int i, LinkedBuffer linkedBuffer) {
        if (i >= 256) {
            return new LinkedBuffer(i, linkedBuffer);
        }
        throw new IllegalArgumentException("256 is the minimum buffer size.");
    }

    public static int writeTo(DataOutput dataOutput, LinkedBuffer linkedBuffer) throws IOException {
        int i = 0;
        do {
            int i2 = linkedBuffer.offset;
            int i3 = linkedBuffer.start;
            int i4 = i2 - i3;
            if (i4 > 0) {
                dataOutput.write(linkedBuffer.buffer, i3, i4);
                i += i4;
            }
            linkedBuffer = linkedBuffer.next;
        } while (linkedBuffer != null);
        return i;
    }

    public LinkedBuffer(byte[] bArr, int i, LinkedBuffer linkedBuffer) {
        this(bArr, i, i);
        linkedBuffer.next = this;
    }

    public LinkedBuffer(byte[] bArr, int i, int i2, LinkedBuffer linkedBuffer) {
        this(bArr, i, i2);
        linkedBuffer.next = this;
    }

    public LinkedBuffer(LinkedBuffer linkedBuffer, LinkedBuffer linkedBuffer2) {
        this.buffer = linkedBuffer.buffer;
        int i = linkedBuffer.offset;
        this.start = i;
        this.offset = i;
        linkedBuffer2.next = this;
    }
}
