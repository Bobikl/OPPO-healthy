package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.WriteBufferWaterMark;

/* JADX INFO: loaded from: classes10.dex */
public interface QuicChannelConfig extends ChannelConfig {
    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setAllocator(ByteBufAllocator byteBufAllocator);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setAutoClose(boolean z);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setAutoRead(boolean z);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setConnectTimeoutMillis(int i);

    @Override // io.netty.channel.ChannelConfig
    @Deprecated
    QuicChannelConfig setMaxMessagesPerRead(int i);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setMessageSizeEstimator(MessageSizeEstimator messageSizeEstimator);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator recvByteBufAllocator);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setWriteBufferHighWaterMark(int i);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setWriteBufferLowWaterMark(int i);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setWriteBufferWaterMark(WriteBufferWaterMark writeBufferWaterMark);

    @Override // io.netty.channel.ChannelConfig
    QuicChannelConfig setWriteSpinCount(int i);
}
