package io.netty.handler.stream;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.ObjectUtil;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes10.dex */
public class ChunkedNioFile implements ChunkedInput<ByteBuf> {
    private final int chunkSize;
    private final long endOffset;
    private final FileChannel in;
    private long offset;
    private final long startOffset;

    public ChunkedNioFile(File file) throws IOException {
        this(new RandomAccessFile(file, "r").getChannel());
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws Exception {
        this.in.close();
    }

    public long currentOffset() {
        return this.offset;
    }

    public long endOffset() {
        return this.endOffset;
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws Exception {
        return this.offset >= this.endOffset || !this.in.isOpen();
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long length() {
        return this.endOffset - this.startOffset;
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public long progress() {
        return this.offset - this.startOffset;
    }

    public long startOffset() {
        return this.startOffset;
    }

    public ChunkedNioFile(File file, int i) throws IOException {
        this(new RandomAccessFile(file, "r").getChannel(), i);
    }

    public ChunkedNioFile(FileChannel fileChannel) throws IOException {
        this(fileChannel, 8192);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    @Deprecated
    public ByteBuf readChunk(ChannelHandlerContext channelHandlerContext) throws Exception {
        return readChunk(channelHandlerContext.alloc());
    }

    public ChunkedNioFile(FileChannel fileChannel, int i) throws IOException {
        this(fileChannel, 0L, fileChannel.size(), i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    public ByteBuf readChunk(ByteBufAllocator byteBufAllocator) throws Exception {
        long j2 = this.offset;
        long j3 = this.endOffset;
        if (j2 >= j3) {
            return null;
        }
        int iMin = (int) Math.min(this.chunkSize, j3 - j2);
        ByteBuf byteBufBuffer = byteBufAllocator.buffer(iMin);
        int i = 0;
        do {
            try {
                int iWriteBytes = byteBufBuffer.writeBytes(this.in, ((long) i) + j2, iMin - i);
                if (iWriteBytes < 0) {
                    break;
                }
                i += iWriteBytes;
            } catch (Throwable th) {
                byteBufBuffer.release();
                throw th;
            }
        } while (i != iMin);
        this.offset += (long) i;
        return byteBufBuffer;
    }

    public ChunkedNioFile(FileChannel fileChannel, long j2, long j3, int i) throws IOException {
        ObjectUtil.checkNotNull(fileChannel, "in");
        ObjectUtil.checkPositiveOrZero(j2, TypedValues.CycleType.S_WAVE_OFFSET);
        ObjectUtil.checkPositiveOrZero(j3, "length");
        ObjectUtil.checkPositive(i, "chunkSize");
        if (fileChannel.isOpen()) {
            this.in = fileChannel;
            this.chunkSize = i;
            this.startOffset = j2;
            this.offset = j2;
            this.endOffset = j2 + j3;
            return;
        }
        throw new ClosedChannelException();
    }
}
