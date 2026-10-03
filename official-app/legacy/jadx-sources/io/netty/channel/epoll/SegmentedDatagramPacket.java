package io.netty.channel.epoll;

import io.netty.buffer.ByteBuf;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public final class SegmentedDatagramPacket extends io.netty.channel.unix.SegmentedDatagramPacket {
    public SegmentedDatagramPacket(ByteBuf byteBuf, int i, InetSocketAddress inetSocketAddress) {
        super(byteBuf, i, inetSocketAddress);
        checkIsSupported();
    }

    private static void checkIsSupported() {
        if (!isSupported()) {
            throw new IllegalStateException();
        }
    }

    public static boolean isSupported() {
        return Epoll.isAvailable() && Native.IS_SUPPORTING_SENDMMSG && Native.IS_SUPPORTING_UDP_SEGMENT;
    }

    public SegmentedDatagramPacket(ByteBuf byteBuf, int i, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        super(byteBuf, i, inetSocketAddress, inetSocketAddress2);
        checkIsSupported();
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.buffer.ByteBufHolder
    public SegmentedDatagramPacket copy() {
        return new SegmentedDatagramPacket(content().copy(), segmentSize(), recipient(), sender());
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.buffer.ByteBufHolder
    public SegmentedDatagramPacket duplicate() {
        return new SegmentedDatagramPacket(content().duplicate(), segmentSize(), recipient(), sender());
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.buffer.ByteBufHolder
    public SegmentedDatagramPacket replace(ByteBuf byteBuf) {
        return new SegmentedDatagramPacket(byteBuf, segmentSize(), recipient(), sender());
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.buffer.ByteBufHolder
    public SegmentedDatagramPacket retainedDuplicate() {
        return new SegmentedDatagramPacket(content().retainedDuplicate(), segmentSize(), recipient(), sender());
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope, io.netty.util.ReferenceCounted
    public SegmentedDatagramPacket retain() {
        super.retain();
        return this;
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope, io.netty.util.ReferenceCounted
    public SegmentedDatagramPacket touch() {
        super.touch();
        return this;
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope, io.netty.util.ReferenceCounted
    public SegmentedDatagramPacket retain(int i) {
        super.retain(i);
        return this;
    }

    @Override // io.netty.channel.unix.SegmentedDatagramPacket, io.netty.channel.socket.DatagramPacket, io.netty.channel.DefaultAddressedEnvelope, io.netty.channel.AddressedEnvelope, io.netty.util.ReferenceCounted
    public SegmentedDatagramPacket touch(Object obj) {
        super.touch(obj);
        return this;
    }
}
