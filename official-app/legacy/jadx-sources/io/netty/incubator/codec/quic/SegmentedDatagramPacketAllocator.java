package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.channel.socket.DatagramPacket;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
@FunctionalInterface
public interface SegmentedDatagramPacketAllocator {
    public static final SegmentedDatagramPacketAllocator NONE = new SegmentedDatagramPacketAllocator() { // from class: io.netty.incubator.codec.quic.SegmentedDatagramPacketAllocator.1
        @Override // io.netty.incubator.codec.quic.SegmentedDatagramPacketAllocator
        public int maxNumSegments() {
            return 0;
        }

        @Override // io.netty.incubator.codec.quic.SegmentedDatagramPacketAllocator
        public DatagramPacket newPacket(ByteBuf byteBuf, int i, InetSocketAddress inetSocketAddress) {
            throw new UnsupportedOperationException();
        }
    };

    default int maxNumSegments() {
        return 10;
    }

    DatagramPacket newPacket(ByteBuf byteBuf, int i, InetSocketAddress inetSocketAddress);
}
