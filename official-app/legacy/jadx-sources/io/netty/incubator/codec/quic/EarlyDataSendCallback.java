package io.netty.incubator.codec.quic;

/* JADX INFO: loaded from: classes10.dex */
@FunctionalInterface
public interface EarlyDataSendCallback {
    void send(QuicChannel quicChannel);
}
