package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheQuicClientCodec extends QuicheQuicCodec {
    public QuicheQuicClientCodec(QuicheConfig quicheConfig, int i, FlushStrategy flushStrategy) {
        super(quicheConfig, i, 1350, flushStrategy);
    }

    @Override // io.netty.channel.ChannelDuplexHandler, io.netty.channel.ChannelOutboundHandler
    public void connect(ChannelHandlerContext channelHandlerContext, SocketAddress socketAddress, SocketAddress socketAddress2, ChannelPromise channelPromise) {
        try {
            long jNativeAddress = this.config.nativeAddress();
            int i = this.localConnIdLength;
            boolean zIsDatagramSupported = this.config.isDatagramSupported();
            ByteBuf byteBuf = this.localSockaddrMemory;
            ByteBuffer byteBufferInternalNioBuffer = byteBuf.internalNioBuffer(0, byteBuf.capacity());
            ByteBuf byteBuf2 = this.sockaddrMemory;
            QuicheQuicChannel quicheQuicChannelHandleConnect = QuicheQuicChannel.handleConnect(socketAddress, jNativeAddress, i, zIsDatagramSupported, byteBufferInternalNioBuffer, byteBuf2.internalNioBuffer(0, byteBuf2.capacity()));
            if (quicheQuicChannelHandleConnect == null) {
                channelHandlerContext.connect(socketAddress, socketAddress2, channelPromise);
                return;
            }
            putChannel(quicheQuicChannelHandleConnect);
            quicheQuicChannelHandleConnect.finishConnect();
            channelPromise.setSuccess();
        } catch (Exception e2) {
            channelPromise.setFailure((Throwable) e2);
        }
    }

    @Override // io.netty.incubator.codec.quic.QuicheQuicCodec
    public QuicheQuicChannel quicPacketRead(ChannelHandlerContext channelHandlerContext, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, QuicPacketType quicPacketType, int i, ByteBuf byteBuf, ByteBuf byteBuf2, ByteBuf byteBuf3) {
        return getChannel(byteBuf2.internalNioBuffer(byteBuf2.readerIndex(), byteBuf2.readableBytes()));
    }
}
