package io.netty.incubator.codec.quic;

import java.net.SocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicConnectionEvent implements QuicEvent {
    private final SocketAddress newAddress;
    private final SocketAddress oldAddress;

    public QuicConnectionEvent(SocketAddress socketAddress, SocketAddress socketAddress2) {
        this.oldAddress = socketAddress;
        this.newAddress = socketAddress2;
    }

    public SocketAddress newAddress() {
        return this.newAddress;
    }

    public SocketAddress oldAddress() {
        return this.oldAddress;
    }
}
