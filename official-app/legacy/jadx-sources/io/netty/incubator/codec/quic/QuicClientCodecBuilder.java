package io.netty.incubator.codec.quic;

import com.oplus.aiunit.vision.xnl;
import io.netty.channel.ChannelHandler;

/* JADX INFO: loaded from: classes10.dex */
public final class QuicClientCodecBuilder extends QuicCodecBuilder<QuicClientCodecBuilder> {
    public QuicClientCodecBuilder() {
        super(false);
        maxSendUdpPayloadSize(xnl.PAYLOAD_SHORT_MAX);
        maxRecvUdpPayloadSize(xnl.PAYLOAD_SHORT_MAX);
    }

    @Override // io.netty.incubator.codec.quic.QuicCodecBuilder
    public ChannelHandler build(QuicheConfig quicheConfig, int i, FlushStrategy flushStrategy) {
        return new QuicheQuicClientCodec(quicheConfig, i, flushStrategy);
    }

    @Override // io.netty.incubator.codec.quic.QuicCodecBuilder
    /* JADX INFO: renamed from: clone */
    public QuicClientCodecBuilder mo5277clone() {
        return new QuicClientCodecBuilder(this);
    }

    private QuicClientCodecBuilder(QuicCodecBuilder<QuicClientCodecBuilder> quicCodecBuilder) {
        super(quicCodecBuilder);
    }
}
