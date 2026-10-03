package io.netty.incubator.codec.quic;

import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public abstract class EventListener {
    public static final EventListener NONE = new EventListener() { // from class: io.netty.incubator.codec.quic.EventListener.1
    };

    public interface Factory {
        EventListener create();
    }

    public static Factory factory(EventListener eventListener) {
        return new Factory() { // from class: io.netty.incubator.codec.quic.EventListener.2
            @Override // io.netty.incubator.codec.quic.EventListener.Factory
            public EventListener create() {
                return EventListener.this;
            }
        };
    }

    public void connectEnd(QuicheQuicChannel quicheQuicChannel) {
    }

    public void connectFailed(Throwable th) {
    }

    public void connectStart(InetSocketAddress inetSocketAddress) {
    }

    public void dnsEnd() {
    }

    public void dnsStart() {
    }

    public void firstCallEnd(QuicheQuicChannel quicheQuicChannel) {
    }

    public void firstCallFailed(Throwable th) {
    }

    public void firstCallStart(InetSocketAddress inetSocketAddress) {
    }

    public void recvEnd() {
    }

    public void recvFail(Throwable th) {
    }

    public void recvStart() {
    }

    public void requestEnd() {
    }

    public void requestStart() {
    }

    public void sendEnd() {
    }

    public void sendFail(Throwable th) {
    }

    public void sendStart() {
    }
}
