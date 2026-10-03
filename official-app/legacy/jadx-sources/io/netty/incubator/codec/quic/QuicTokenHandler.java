package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes10.dex */
public interface QuicTokenHandler {
    int maxTokenLength();

    int validateToken(ByteBuf byteBuf, InetSocketAddress inetSocketAddress);

    boolean writeToken(ByteBuf byteBuf, ByteBuf byteBuf2, InetSocketAddress inetSocketAddress);
}
