package com.oplus.aiunit.vision;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.IllegalReferenceCountException;

/* JADX INFO: loaded from: classes19.dex */
public class v5c extends q5c implements ByteBufHolder {
    public v5c(p5c p5cVar, w5c w5cVar, ByteBuf byteBuf) {
        super(p5cVar, w5cVar, byteBuf);
    }

    @Override // io.netty.buffer.ByteBufHolder
    public ByteBuf content() {
        ByteBuf byteBuf = (ByteBuf) super.c();
        if (byteBuf.refCnt() > 0) {
            return byteBuf;
        }
        throw new IllegalReferenceCountException(byteBuf.refCnt());
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public v5c copy() {
        return new v5c(b(), d(), content().copy());
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public v5c duplicate() {
        return new v5c(b(), d(), content().duplicate());
    }

    @Override // com.oplus.aiunit.vision.q5c
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ByteBuf c() {
        return content();
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public v5c replace(ByteBuf byteBuf) {
        return new v5c(b(), d(), byteBuf);
    }

    @Override // io.netty.util.ReferenceCounted
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public v5c retain() {
        content().retain();
        return this;
    }

    @Override // io.netty.util.ReferenceCounted
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public v5c retain(int i) {
        content().retain(i);
        return this;
    }

    @Override // io.netty.buffer.ByteBufHolder
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public v5c retainedDuplicate() {
        return replace(content().retainedDuplicate());
    }

    @Override // io.netty.util.ReferenceCounted
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public v5c touch() {
        content().touch();
        return this;
    }

    @Override // io.netty.util.ReferenceCounted
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public v5c touch(Object obj) {
        content().touch(obj);
        return this;
    }

    @Override // com.oplus.aiunit.vision.q5c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public w5c d() {
        return (w5c) super.d();
    }

    @Override // io.netty.util.ReferenceCounted
    public int refCnt() {
        return content().refCnt();
    }

    @Override // io.netty.util.ReferenceCounted
    public boolean release() {
        return content().release();
    }

    @Override // io.netty.util.ReferenceCounted
    public boolean release(int i) {
        return content().release(i);
    }
}
