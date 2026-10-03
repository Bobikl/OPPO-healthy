package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.Unpooled;

/* JADX INFO: loaded from: classes10.dex */
public interface QuicStreamFrame extends ByteBufHolder {
    public static final QuicStreamFrame EMPTY_FIN = new QuicStreamFrame() { // from class: io.netty.incubator.codec.quic.QuicStreamFrame.1
        @Override // io.netty.buffer.ByteBufHolder
        public ByteBuf content() {
            return Unpooled.EMPTY_BUFFER;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.buffer.ByteBufHolder
        public QuicStreamFrame copy() {
            return this;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.buffer.ByteBufHolder
        public QuicStreamFrame duplicate() {
            return this;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame
        public boolean hasFin() {
            return true;
        }

        @Override // io.netty.util.ReferenceCounted
        public int refCnt() {
            return 1;
        }

        @Override // io.netty.util.ReferenceCounted
        public boolean release() {
            return false;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.util.ReferenceCounted
        public QuicStreamFrame retain() {
            return this;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.buffer.ByteBufHolder
        public QuicStreamFrame retainedDuplicate() {
            return this;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.util.ReferenceCounted
        public QuicStreamFrame touch() {
            return this;
        }

        @Override // io.netty.util.ReferenceCounted
        public boolean release(int i) {
            return false;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.buffer.ByteBufHolder
        public QuicStreamFrame replace(ByteBuf byteBuf) {
            return new DefaultQuicStreamFrame(byteBuf, hasFin());
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.util.ReferenceCounted
        public QuicStreamFrame retain(int i) {
            return this;
        }

        @Override // io.netty.incubator.codec.quic.QuicStreamFrame, io.netty.util.ReferenceCounted
        public QuicStreamFrame touch(Object obj) {
            return this;
        }
    };

    @Override // io.netty.buffer.ByteBufHolder
    QuicStreamFrame copy();

    @Override // io.netty.buffer.ByteBufHolder
    QuicStreamFrame duplicate();

    boolean hasFin();

    @Override // io.netty.buffer.ByteBufHolder
    QuicStreamFrame replace(ByteBuf byteBuf);

    @Override // io.netty.util.ReferenceCounted
    QuicStreamFrame retain();

    @Override // io.netty.util.ReferenceCounted
    QuicStreamFrame retain(int i);

    @Override // io.netty.buffer.ByteBufHolder
    QuicStreamFrame retainedDuplicate();

    @Override // io.netty.util.ReferenceCounted
    QuicStreamFrame touch();

    @Override // io.netty.util.ReferenceCounted
    QuicStreamFrame touch(Object obj);
}
