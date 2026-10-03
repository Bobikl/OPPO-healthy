package io.netty.handler.stream;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.webview.extension.protocol.Const;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.ObjectUtil;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes10.dex */
public class ChunkedFile implements ChunkedInput<ByteBuf> {
    private final int chunkSize;
    private final long endOffset;
    private final RandomAccessFile file;
    private long offset;
    private final long startOffset;

    public ChunkedFile(File file) throws IOException {
        this(file, 8192);
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public void close() throws Exception {
        this.file.close();
    }

    public long currentOffset() {
        return this.offset;
    }

    public long endOffset() {
        return this.endOffset;
    }

    @Override // io.netty.handler.stream.ChunkedInput
    public boolean isEndOfInput() throws Exception {
        return this.offset >= this.endOffset || !this.file.getChannel().isOpen();
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

    public ChunkedFile(File file, int i) throws IOException {
        this(new RandomAccessFile(file, "r"), i);
    }

    public ChunkedFile(RandomAccessFile randomAccessFile) throws IOException {
        this(randomAccessFile, 8192);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.netty.handler.stream.ChunkedInput
    @Deprecated
    public ByteBuf readChunk(ChannelHandlerContext channelHandlerContext) throws Exception {
        return readChunk(channelHandlerContext.alloc());
    }

    public ChunkedFile(RandomAccessFile randomAccessFile, int i) throws IOException {
        this(randomAccessFile, 0L, randomAccessFile.length(), i);
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
        ByteBuf byteBufHeapBuffer = byteBufAllocator.heapBuffer(iMin);
        try {
            this.file.readFully(byteBufHeapBuffer.array(), byteBufHeapBuffer.arrayOffset(), iMin);
            byteBufHeapBuffer.writerIndex(iMin);
            this.offset = j2 + ((long) iMin);
            return byteBufHeapBuffer;
        } catch (Throwable th) {
            byteBufHeapBuffer.release();
            throw th;
        }
    }

    public ChunkedFile(RandomAccessFile randomAccessFile, long j2, long j3, int i) throws IOException {
        ObjectUtil.checkNotNull(randomAccessFile, Const.Scheme.SCHEME_FILE);
        ObjectUtil.checkPositiveOrZero(j2, TypedValues.CycleType.S_WAVE_OFFSET);
        ObjectUtil.checkPositiveOrZero(j3, "length");
        ObjectUtil.checkPositive(i, "chunkSize");
        this.file = randomAccessFile;
        this.startOffset = j2;
        this.offset = j2;
        this.endOffset = j3 + j2;
        this.chunkSize = i;
        randomAccessFile.seek(j2);
    }
}
