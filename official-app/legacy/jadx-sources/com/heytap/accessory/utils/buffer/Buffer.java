package com.heytap.accessory.utils.buffer;

import com.heytap.accessory.utils.SystemUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class Buffer {
    public static final int ERROR_BUFFER_OVEFLOW = -2;
    public static final int ERROR_BUFFER_RECYCLED = -1;
    public static final int ERROR_BUFFER_UNDERFLOW = -3;
    private final byte[] mData;
    private final int mLength;
    boolean mIsRecycled = false;
    private int mPayloadLength = 0;
    private int mOffset = 0;

    public Buffer(byte[] bArr, int i) {
        this.mData = bArr;
        this.mLength = i;
    }

    public synchronized void extractFrom(byte[] bArr, int i, int i2) throws BufferException {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Failed to extract from a recycled buffer!");
        }
        int i3 = this.mOffset;
        int i4 = this.mPayloadLength;
        if (i3 + i4 + i2 > this.mLength) {
            throw new BufferException(-2, "Cannot extract from byte[]. Buffer length exceeded! [buff offset=" + this.mOffset + "; payload len=" + this.mPayloadLength + "; length to write = " + i2 + "; buff len = " + this.mLength + "]");
        }
        SystemUtils.arraycopy(bArr, i, this.mData, i3 + i4, i2);
        this.mPayloadLength += i2;
    }

    public synchronized byte[] extractPayload() {
        byte[] bArr;
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        int i = this.mPayloadLength;
        bArr = new byte[i];
        SystemUtils.arraycopy(this.mData, this.mOffset, bArr, 0, i);
        return bArr;
    }

    public synchronized Buffer extractPayloadBuffer() {
        Buffer bufferObtainExact;
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        bufferObtainExact = BufferPoolImpl.obtainExact(this.mPayloadLength);
        SystemUtils.arraycopy(this.mData, this.mOffset, bufferObtainExact.getBuffer(), 0, this.mPayloadLength);
        bufferObtainExact.mPayloadLength = this.mPayloadLength;
        return bufferObtainExact;
    }

    public synchronized void extractTo(Buffer buffer, int i, int i2) {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        int i3 = this.mOffset;
        if (i3 + i2 > this.mLength) {
            throw new ArrayIndexOutOfBoundsException("Cannot extract to Buffer. Source buffer length exceeded its length! [buff offset = " + this.mOffset + "; length to extract = " + i2 + "; buff len = " + this.mLength + "]");
        }
        SystemUtils.arraycopy(this.mData, i3, buffer.getBuffer(), i, i2);
        buffer.mPayloadLength += i2;
        this.mOffset += i2;
    }

    public synchronized byte[] getBuffer() {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        return this.mData;
    }

    public synchronized int getBufferLength() {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        return this.mData.length;
    }

    public synchronized int getLength() {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        return this.mLength;
    }

    public synchronized int getOffset() {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        return this.mOffset;
    }

    public synchronized int getPayloadLength() {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        return this.mPayloadLength;
    }

    public synchronized boolean isRecycled() {
        return this.mIsRecycled;
    }

    public synchronized boolean recycle() {
        if (this.mIsRecycled) {
            return false;
        }
        boolean zRecycle = BufferPoolImpl.recycle(this.mData);
        this.mIsRecycled = zRecycle;
        return zRecycle;
    }

    public synchronized void setOffset(int i) {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        this.mOffset = i;
    }

    public synchronized void setPayloadLength(int i) {
        if (this.mIsRecycled) {
            throw new IllegalStateException("Cannot refer to a recycled buffer!");
        }
        this.mPayloadLength = i;
    }

    public String toString() {
        return "Buffer{data=" + Arrays.toString(this.mData) + ", length=" + this.mLength + ", offset=" + this.mOffset + ", payloadLength=" + this.mPayloadLength + ", isRecycled=" + this.mIsRecycled + '}';
    }
}
