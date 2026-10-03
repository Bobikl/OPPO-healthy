package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.unix.SegmentedDatagramPacket;
import io.netty.util.internal.ObjectUtil;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public final class EpollQuicUtils {

    public static final class EpollSegmentedDatagramPacketAllocator implements SegmentedDatagramPacketAllocator {
        private final int maxNumSegments;

        public EpollSegmentedDatagramPacketAllocator(int i) {
            this.maxNumSegments = i;
        }

        @Override // io.netty.incubator.codec.quic.SegmentedDatagramPacketAllocator
        public int maxNumSegments() {
            return this.maxNumSegments;
        }

        @Override // io.netty.incubator.codec.quic.SegmentedDatagramPacketAllocator
        public DatagramPacket newPacket(ByteBuf byteBuf, int i, InetSocketAddress inetSocketAddress) {
            return new SegmentedDatagramPacket(byteBuf, i, inetSocketAddress);
        }
    }

    private EpollQuicUtils() {
    }

    public static SegmentedDatagramPacketAllocator newSegmentedAllocator(int i) {
        ObjectUtil.checkInRange(i, 1, 64, "maxNumSegments");
        return io.netty.channel.epoll.SegmentedDatagramPacket.isSupported() ? new EpollSegmentedDatagramPacketAllocator(i) : SegmentedDatagramPacketAllocator.NONE;
    }
}
