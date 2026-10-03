package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.DefaultByteBufHolder;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultQuicStreamFrame extends DefaultByteBufHolder implements QuicStreamFrame {
    private final boolean fin;

    public DefaultQuicStreamFrame(ByteBuf byteBuf, boolean z) {
        super(byteBuf);
        this.fin = z;
    }

    @Override // io.netty.incubator.codec.quic.QuicStreamFrame
    public boolean hasFin() {
        return this.fin;
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public QuicStreamFrame copy() {
        return new DefaultQuicStreamFrame(content().copy(), this.fin);
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public QuicStreamFrame duplicate() {
        return new DefaultQuicStreamFrame(content().duplicate(), this.fin);
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public QuicStreamFrame replace(ByteBuf byteBuf) {
        return new DefaultQuicStreamFrame(byteBuf, this.fin);
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public QuicStreamFrame retainedDuplicate() {
        return new DefaultQuicStreamFrame(content().retainedDuplicate(), this.fin);
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.util.ReferenceCounted
    public QuicStreamFrame retain() {
        super.retain();
        return this;
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.util.ReferenceCounted
    public QuicStreamFrame touch() {
        super.touch();
        return this;
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.util.ReferenceCounted
    public QuicStreamFrame retain(int i) {
        super.retain(i);
        return this;
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.util.ReferenceCounted
    public QuicStreamFrame touch(Object obj) {
        super.touch(obj);
        return this;
    }
}
