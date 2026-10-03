package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.WriteBufferWaterMark;
import io.netty.channel.socket.DuplexChannelConfig;

/* JADX INFO: loaded from: classes10.dex */
public interface QuicStreamChannelConfig extends DuplexChannelConfig {
    boolean isReadFrames();

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setAllocator(ByteBufAllocator byteBufAllocator);

    @Override // io.netty.channel.socket.DuplexChannelConfig
    QuicStreamChannelConfig setAllowHalfClosure(boolean z);

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setAutoClose(boolean z);

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setAutoRead(boolean z);

    @Override // io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setConnectTimeoutMillis(int i);

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setMaxMessagesPerRead(int i);

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setMessageSizeEstimator(MessageSizeEstimator messageSizeEstimator);

    QuicStreamChannelConfig setReadFrames(boolean z);

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator recvByteBufAllocator);

    @Override // io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setWriteBufferHighWaterMark(int i);

    @Override // io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setWriteBufferLowWaterMark(int i);

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setWriteBufferWaterMark(WriteBufferWaterMark writeBufferWaterMark);

    @Override // io.netty.channel.socket.DuplexChannelConfig, io.netty.channel.ChannelConfig
    QuicStreamChannelConfig setWriteSpinCount(int i);
}
