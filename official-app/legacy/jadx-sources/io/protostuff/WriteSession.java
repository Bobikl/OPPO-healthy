package io.protostuff;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class WriteSession {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final FlushHandler flushHandler;
    public final LinkedBuffer head;
    public final int nextBufferSize;
    public final OutputStream out;
    public final WriteSink sink;
    protected int size;
    protected LinkedBuffer tail;

    public interface FlushHandler {
        int flush(WriteSession writeSession, LinkedBuffer linkedBuffer, byte[] bArr, int i, int i2) throws IOException;

        int flush(WriteSession writeSession, byte[] bArr, int i, int i2) throws IOException;

        int flush(WriteSession writeSession, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) throws IOException;
    }

    public WriteSession(LinkedBuffer linkedBuffer) {
        this(linkedBuffer, 512);
    }

    public WriteSession clear() {
        this.tail = this.head.clear();
        this.size = 0;
        return this;
    }

    public int flush(byte[] bArr, int i, int i2) throws IOException {
        FlushHandler flushHandler = this.flushHandler;
        if (flushHandler != null) {
            return flushHandler.flush(this, bArr, i, i2);
        }
        this.out.write(bArr, i, i2);
        return i;
    }

    public final int getSize() {
        return this.size;
    }

    public void reset() {
    }

    public final byte[] toByteArray() {
        LinkedBuffer linkedBuffer = this.head;
        byte[] bArr = new byte[this.size];
        int i = 0;
        do {
            int i2 = linkedBuffer.offset;
            int i3 = linkedBuffer.start;
            int i4 = i2 - i3;
            if (i4 > 0) {
                System.arraycopy(linkedBuffer.buffer, i3, bArr, i, i4);
                i += i4;
            }
            linkedBuffer = linkedBuffer.next;
        } while (linkedBuffer != null);
        return bArr;
    }

    public WriteSession(LinkedBuffer linkedBuffer, int i) {
        this.size = 0;
        this.tail = linkedBuffer;
        this.head = linkedBuffer;
        this.nextBufferSize = i;
        this.out = null;
        this.flushHandler = null;
        this.sink = WriteSink.BUFFERED;
    }

    public int flush(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) throws IOException {
        FlushHandler flushHandler = this.flushHandler;
        if (flushHandler != null) {
            return flushHandler.flush(this, bArr, i, i2, bArr2, i3, i4);
        }
        this.out.write(bArr, i, i2);
        this.out.write(bArr2, i3, i4);
        return i;
    }

    public int flush(LinkedBuffer linkedBuffer, byte[] bArr, int i, int i2) throws IOException {
        FlushHandler flushHandler = this.flushHandler;
        if (flushHandler != null) {
            return flushHandler.flush(this, linkedBuffer, bArr, i, i2);
        }
        this.out.write(bArr, i, i2);
        return linkedBuffer.start;
    }

    public WriteSession(LinkedBuffer linkedBuffer, OutputStream outputStream, FlushHandler flushHandler, int i) {
        this.size = 0;
        this.tail = linkedBuffer;
        this.head = linkedBuffer;
        this.nextBufferSize = i;
        this.out = outputStream;
        this.flushHandler = flushHandler;
        this.sink = WriteSink.STREAMED;
    }

    public WriteSession(LinkedBuffer linkedBuffer, OutputStream outputStream) {
        this(linkedBuffer, outputStream, null, 512);
    }
}
