package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelOption;
import io.netty.channel.DefaultChannelConfig;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.WriteBufferWaterMark;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
final class QuicheQuicChannelConfig extends DefaultChannelConfig implements QuicChannelConfig {
    private volatile Integer maxUdpPayloadSize;
    private volatile QLogConfiguration qLogConfiguration;
    private volatile SegmentedDatagramPacketAllocator segmentedDatagramPacketAllocator;

    public QuicheQuicChannelConfig(Channel channel) {
        super(channel);
        this.segmentedDatagramPacketAllocator = SegmentedDatagramPacketAllocator.NONE;
        this.maxUdpPayloadSize = 1350;
    }

    private void setMaxUdpPayloadSize(Integer num) {
        this.maxUdpPayloadSize = num;
    }

    private void setQLogConfiguration(QLogConfiguration qLogConfiguration) {
        if (this.channel.isRegistered()) {
            throw new IllegalStateException("QLOG can only be enabled before the Channel was registered");
        }
        this.qLogConfiguration = qLogConfiguration;
    }

    private void setSegmentedDatagramPacketAllocator(SegmentedDatagramPacketAllocator segmentedDatagramPacketAllocator) {
        this.segmentedDatagramPacketAllocator = segmentedDatagramPacketAllocator;
    }

    public Integer getMaxUdpPayloadSize() {
        return this.maxUdpPayloadSize;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> T getOption(ChannelOption<T> channelOption) {
        if (channelOption == QuicChannelOption.QLOG) {
            return (T) getQLogConfiguration();
        }
        if (channelOption == QuicChannelOption.SEGMENTED_DATAGRAM_PACKET_ALLOCATOR) {
            return (T) getSegmentedDatagramPacketAllocator();
        }
        return channelOption == QuicChannelOption.MAX_UDP_PAYLOAD_SIZE ? (T) getMaxUdpPayloadSize() : (T) super.getOption(channelOption);
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public Map<ChannelOption<?>, Object> getOptions() {
        return getOptions(super.getOptions(), QuicChannelOption.QLOG, QuicChannelOption.SEGMENTED_DATAGRAM_PACKET_ALLOCATOR);
    }

    public QLogConfiguration getQLogConfiguration() {
        return this.qLogConfiguration;
    }

    public SegmentedDatagramPacketAllocator getSegmentedDatagramPacketAllocator() {
        return this.segmentedDatagramPacketAllocator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public <T> boolean setOption(ChannelOption<T> channelOption, T t) {
        if (channelOption == QuicChannelOption.QLOG) {
            setQLogConfiguration((QLogConfiguration) t);
            return true;
        }
        if (channelOption == QuicChannelOption.SEGMENTED_DATAGRAM_PACKET_ALLOCATOR) {
            setSegmentedDatagramPacketAllocator((SegmentedDatagramPacketAllocator) t);
            return true;
        }
        if (channelOption != QuicChannelOption.MAX_UDP_PAYLOAD_SIZE) {
            return super.setOption(channelOption, t);
        }
        setMaxUdpPayloadSize((Integer) t);
        return true;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setAllocator(ByteBufAllocator byteBufAllocator) {
        super.setAllocator(byteBufAllocator);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setAutoClose(boolean z) {
        super.setAutoClose(z);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setAutoRead(boolean z) {
        super.setAutoRead(z);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setConnectTimeoutMillis(int i) {
        super.setConnectTimeoutMillis(i);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    @Deprecated
    public QuicChannelConfig setMaxMessagesPerRead(int i) {
        super.setMaxMessagesPerRead(i);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setMessageSizeEstimator(MessageSizeEstimator messageSizeEstimator) {
        super.setMessageSizeEstimator(messageSizeEstimator);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setRecvByteBufAllocator(RecvByteBufAllocator recvByteBufAllocator) {
        super.setRecvByteBufAllocator(recvByteBufAllocator);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setWriteBufferHighWaterMark(int i) {
        super.setWriteBufferHighWaterMark(i);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setWriteBufferLowWaterMark(int i) {
        super.setWriteBufferLowWaterMark(i);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setWriteBufferWaterMark(WriteBufferWaterMark writeBufferWaterMark) {
        super.setWriteBufferWaterMark(writeBufferWaterMark);
        return this;
    }

    @Override // io.netty.channel.DefaultChannelConfig, io.netty.channel.ChannelConfig
    public QuicChannelConfig setWriteSpinCount(int i) {
        super.setWriteSpinCount(i);
        return this;
    }
}
