package io.netty.handler.stream;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.ObjectUtil;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes10.dex */
public class ChunkedStream implements ChunkedInput<ByteBuf> {
    static final int DEFAULT_CHUNK_SIZE = 8192;
    private final int chunkSize;
    private boolean closed;
    private final PushbackInputStream in;
    private long offset;

    public ChunkedStream(InputStream inputStream) {
        this(inputStream, 8192);
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws Exception {
        this.closed = true;
        this.in.close();
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws Exception {
        if (this.closed) {
            return true;
        }
        if (this.in.available() > 0) {
            return false;
        }
        int i = this.in.read();
        if (i < 0) {
            return true;
        }
        this.in.unread(i);
        return false;
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long length() {
        return -1L;
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long progress() {
        return this.offset;
    }

    public long transferredBytes() {
        return this.offset;
    }

    public ChunkedStream(InputStream inputStream, int i) {
        ObjectUtil.checkNotNull(inputStream, "in");
        ObjectUtil.checkPositive(i, "chunkSize");
        if (inputStream instanceof PushbackInputStream) {
            this.in = (PushbackInputStream) inputStream;
        } else {
            this.in = new PushbackInputStream(inputStream);
        }
        this.chunkSize = i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    @Deprecated
    public ByteBuf readChunk(ChannelHandlerContext channelHandlerContext) throws Exception {
        return readChunk(channelHandlerContext.alloc());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    public ByteBuf readChunk(ByteBufAllocator byteBufAllocator) throws Exception {
        int iMin;
        if (isEndOfInput()) {
            return null;
        }
        if (this.in.available() <= 0) {
            iMin = this.chunkSize;
        } else {
            iMin = Math.min(this.chunkSize, this.in.available());
        }
        ByteBuf byteBufBuffer = byteBufAllocator.buffer(iMin);
        try {
            int iWriteBytes = byteBufBuffer.writeBytes(this.in, iMin);
            if (iWriteBytes < 0) {
                byteBufBuffer.release();
                return null;
            }
            this.offset += (long) iWriteBytes;
            return byteBufBuffer;
        } catch (Throwable th) {
            byteBufBuffer.release();
            throw th;
        }
    }
}
