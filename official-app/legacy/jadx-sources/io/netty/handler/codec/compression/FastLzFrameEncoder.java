package io.netty.handler.codec.compression;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes10.dex */
public class FastLzFrameEncoder extends MessageToByteEncoder<ByteBuf> {
    private final ByteBufChecksum checksum;
    private final int level;

    public FastLzFrameEncoder() {
        this(0, null);
    }

    public FastLzFrameEncoder(int i) {
        this(i, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c A[SYNTHETIC] */
    @Override // io.netty.handler.codec.MessageToByteEncoder
    public void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        int iCompress;
        int i;
        ByteBufChecksum byteBufChecksum = this.checksum;
        while (byteBuf.isReadable()) {
            int i2 = byteBuf.readerIndex();
            int iMin = Math.min(byteBuf.readableBytes(), 65535);
            int iWriterIndex = byteBuf2.writerIndex();
            byteBuf2.setMedium(iWriterIndex, 4607066);
            int i3 = iWriterIndex + 4;
            int i4 = 0;
            int i5 = i3 + (byteBufChecksum != null ? 4 : 0);
            if (iMin < 32) {
                int i6 = i5 + 2;
                byteBuf2.ensureWritable(i6 + iMin);
                if (byteBufChecksum != null) {
                    byteBufChecksum.reset();
                    byteBufChecksum.update(byteBuf, i2, iMin);
                    byteBuf2.setInt(i3, (int) byteBufChecksum.getValue());
                }
                byteBuf2.setBytes(i6, byteBuf, i2, iMin);
            } else {
                if (byteBufChecksum != null) {
                    byteBufChecksum.reset();
                    byteBufChecksum.update(byteBuf, i2, iMin);
                    byteBuf2.setInt(i3, (int) byteBufChecksum.getValue());
                }
                int i7 = i5 + 4;
                byteBuf2.ensureWritable(FastLz.calculateOutputBufferLength(iMin) + i7);
                iCompress = FastLz.compress(byteBuf, byteBuf.readerIndex(), iMin, byteBuf2, i7, this.level);
                if (iCompress < iMin) {
                    byteBuf2.setShort(i5, iCompress);
                    i5 += 2;
                    i = 1;
                } else {
                    byteBuf2.setBytes(i5 + 2, byteBuf, i2, iMin);
                }
                byteBuf2.setShort(i5, iMin);
                int i8 = iWriterIndex + 3;
                if (byteBufChecksum != null) {
                    i4 = 16;
                }
                byteBuf2.setByte(i8, i | i4);
                byteBuf2.writerIndex(i5 + 2 + iCompress);
                byteBuf.skipBytes(iMin);
            }
            iCompress = iMin;
            i = 0;
            byteBuf2.setShort(i5, iMin);
            int i9 = iWriterIndex + 3;
            if (byteBufChecksum != null) {
                i4 = 16;
            }
            byteBuf2.setByte(i9, i | i4);
            byteBuf2.writerIndex(i5 + 2 + iCompress);
            byteBuf.skipBytes(iMin);
        }
    }

    public FastLzFrameEncoder(boolean z) {
        this(0, z ? new Adler32() : null);
    }

    public FastLzFrameEncoder(int i, Checksum checksum) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException(String.format("level: %d (expected: %d or %d or %d)", Integer.valueOf(i), 0, 1, 2));
        }
        this.level = i;
        this.checksum = checksum == null ? null : ByteBufChecksum.wrapChecksum(checksum);
    }
}
