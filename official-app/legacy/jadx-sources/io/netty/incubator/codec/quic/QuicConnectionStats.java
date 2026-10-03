package io.netty.incubator.codec.quic;

/* JADX INFO: loaded from: classes10.dex */
public interface QuicConnectionStats {
    long congestionWindow();

    long deliveryRate();

    long lost();

    long lostBytes();

    long recv();

    long recvBytes();

    long retrans();

    long retransBytes();

    long rttNanos();

    long sent();

    long sentBytes();
}
