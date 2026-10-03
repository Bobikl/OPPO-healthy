package io.netty.incubator.codec.quic;

import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicheQuicConnectionStats implements QuicConnectionStats {
    private final long congestionWindow;
    private final long deliveryRate;
    private final long lost;
    private final long lostBytes;
    private final long recv;
    private final long recvBytes;
    private final long retrans;
    private final long retransBytes;
    private final long rttNanos;
    private final long sent;
    private final long sentBytes;

    public QuicheQuicConnectionStats(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.recv = j2;
        this.sent = j3;
        this.lost = j4;
        this.retrans = j5;
        this.recvBytes = j6;
        this.sentBytes = j7;
        this.lostBytes = j8;
        this.retransBytes = j9;
        this.rttNanos = j10;
        this.congestionWindow = j11;
        this.deliveryRate = j12;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long congestionWindow() {
        return this.congestionWindow;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long deliveryRate() {
        return this.deliveryRate;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long lost() {
        return this.lost;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long lostBytes() {
        return this.lostBytes;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long recv() {
        return this.recv;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long recvBytes() {
        return this.recvBytes;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long retrans() {
        return this.retrans;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long retransBytes() {
        return this.retransBytes;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long rttNanos() {
        return this.rttNanos;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long sent() {
        return this.sent;
    }

    @Override // io.netty.incubator.codec.quic.QuicConnectionStats
    public long sentBytes() {
        return this.sentBytes;
    }

    public String toString() {
        return StringUtil.simpleClassName(this) + "[recv=" + this.recv + ", sent=" + this.sent + ", lost=" + this.lost + ", retrans=" + this.retrans + ", recv_bytes=" + this.recvBytes + ", send_bytes=" + this.sentBytes + ", lost_bytes=" + this.lostBytes + ", retrans_bytes=" + this.retransBytes + ", rttNanos=" + this.rttNanos + ", deliveryRate=" + this.deliveryRate + "]";
    }
}
