package io.netty.incubator.codec.quic;

import java.net.SocketAddress;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicStreamAddress extends SocketAddress {
    private final long streamId;

    public QuicStreamAddress(long j2) {
        this.streamId = j2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof QuicStreamAddress) && this.streamId == ((QuicStreamAddress) obj).streamId;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.streamId));
    }

    public long streamId() {
        return this.streamId;
    }

    public String toString() {
        return "QuicStreamAddress{streamId=" + this.streamId + '}';
    }
}
