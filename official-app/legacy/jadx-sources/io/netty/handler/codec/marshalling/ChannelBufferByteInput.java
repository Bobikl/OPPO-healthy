package io.netty.handler.codec.marshalling;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import org.jboss.marshalling.ByteInput;

/* JADX INFO: loaded from: classes10.dex */
class ChannelBufferByteInput implements ByteInput {
    private final ByteBuf buffer;

    public ChannelBufferByteInput(ByteBuf byteBuf) {
        this.buffer = byteBuf;
    }

    public int available() throws IOException {
        return this.buffer.readableBytes();
    }

    public void close() throws IOException {
    }

    public int read() throws IOException {
        if (this.buffer.isReadable()) {
            return this.buffer.readByte() & 255;
        }
        return -1;
    }

    public long skip(long j2) throws IOException {
        long j3 = this.buffer.readableBytes();
        if (j3 < j2) {
            j2 = j3;
        }
        ByteBuf byteBuf = this.buffer;
        byteBuf.readerIndex((int) (((long) byteBuf.readerIndex()) + j2));
        return j2;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int iAvailable = available();
        if (iAvailable == 0) {
            return -1;
        }
        int iMin = Math.min(iAvailable, i2);
        this.buffer.readBytes(bArr, i, iMin);
        return iMin;
    }
}
