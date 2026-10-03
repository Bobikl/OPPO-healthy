package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.internal.ObjectUtil;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicHeaderParser implements AutoCloseable {
    private boolean closed;
    private final ByteBuf dcidBuffer;
    private final ByteBuf dcidLenBuffer;
    private final int localConnectionIdLength;
    private final int maxTokenLength;
    private final ByteBuf scidBuffer;
    private final ByteBuf scidLenBuffer;
    private final ByteBuf tokenBuffer;
    private final ByteBuf tokenLenBuffer;
    private final ByteBuf typeBuffer;
    private final ByteBuf versionBuffer;

    public interface QuicHeaderProcessor {
        void process(ChannelHandlerContext channelHandlerContext, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, ByteBuf[] byteBufArr, QuicPacketType quicPacketType, int i, ByteBuf byteBuf, ByteBuf byteBuf2, ByteBuf byteBuf3) throws Exception;
    }

    public QuicHeaderParser(int i, int i2) {
        Quic.ensureAvailability();
        this.maxTokenLength = ObjectUtil.checkPositiveOrZero(i, "maxTokenLength");
        this.localConnectionIdLength = ObjectUtil.checkPositiveOrZero(i2, "localConnectionIdLength");
        this.versionBuffer = Quiche.allocateNativeOrder(4);
        this.typeBuffer = Quiche.allocateNativeOrder(1);
        this.scidLenBuffer = Quiche.allocateNativeOrder(4);
        this.dcidLenBuffer = Quiche.allocateNativeOrder(4);
        this.tokenLenBuffer = Quiche.allocateNativeOrder(4);
        int i3 = Quiche.QUICHE_MAX_CONN_ID_LEN;
        this.scidBuffer = Unpooled.directBuffer(i3);
        this.dcidBuffer = Unpooled.directBuffer(i3);
        this.tokenBuffer = Unpooled.directBuffer(i);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.versionBuffer.release();
        this.typeBuffer.release();
        this.scidBuffer.release();
        this.scidLenBuffer.release();
        this.dcidBuffer.release();
        this.dcidLenBuffer.release();
        this.tokenLenBuffer.release();
        this.tokenBuffer.release();
    }

    public void parse(ChannelHandlerContext channelHandlerContext, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, ByteBuf[] byteBufArr, QuicHeaderProcessor quicHeaderProcessor) throws Exception {
        if (this.closed) {
            throw new IllegalStateException("QuicHeaderParser is already closed");
        }
        if (byteBufArr.length < 1) {
            throw new IllegalStateException("packets is empty");
        }
        ByteBuf byteBuf = byteBufArr[0];
        long jMemoryAddress = Quiche.memoryAddress(byteBuf) + ((long) byteBuf.readerIndex());
        int i = byteBuf.readableBytes();
        ByteBuf byteBuf2 = this.scidLenBuffer;
        int i2 = Quiche.QUICHE_MAX_CONN_ID_LEN;
        byteBuf2.setInt(0, i2);
        this.dcidLenBuffer.setInt(0, i2);
        this.tokenLenBuffer.setInt(0, this.maxTokenLength);
        int iQuiche_header_info = Quiche.quiche_header_info(jMemoryAddress, i, this.localConnectionIdLength, Quiche.memoryAddress(this.versionBuffer), Quiche.memoryAddress(this.typeBuffer), Quiche.memoryAddress(this.scidBuffer), Quiche.memoryAddress(this.scidLenBuffer), Quiche.memoryAddress(this.dcidBuffer), Quiche.memoryAddress(this.dcidLenBuffer), Quiche.memoryAddress(this.tokenBuffer), Quiche.memoryAddress(this.tokenLenBuffer));
        if (iQuiche_header_info < 0) {
            throw Quiche.newException(iQuiche_header_info);
        }
        quicHeaderProcessor.process(channelHandlerContext, inetSocketAddress, inetSocketAddress2, byteBufArr, QuicPacketType.of(this.typeBuffer.getByte(0)), this.versionBuffer.getInt(0), this.scidBuffer.setIndex(0, this.scidLenBuffer.getInt(0)), this.dcidBuffer.setIndex(0, this.dcidLenBuffer.getInt(0)), this.tokenBuffer.setIndex(0, this.tokenLenBuffer.getInt(0)));
    }
}
