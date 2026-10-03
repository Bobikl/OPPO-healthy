package io.netty.incubator.codec.quic;

import io.netty.channel.ChannelOption;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicChannelOption<T> extends ChannelOption<T> {
    public static final ChannelOption<Boolean> READ_FRAMES = ChannelOption.valueOf(QuicChannelOption.class, "READ_FRAMES");
    public static final ChannelOption<QLogConfiguration> QLOG = ChannelOption.valueOf(QuicChannelOption.class, "QLOG");
    public static final ChannelOption<SegmentedDatagramPacketAllocator> SEGMENTED_DATAGRAM_PACKET_ALLOCATOR = ChannelOption.valueOf(QuicChannelOption.class, "SEGMENTED_DATAGRAM_PACKET_ALLOCATOR");
    public static final ChannelOption<Integer> MAX_UDP_PAYLOAD_SIZE = ChannelOption.valueOf(QuicChannelOption.class, "MAX_UDP_PAYLOAD_SIZE");

    private QuicChannelOption() {
        super(null);
    }
}
