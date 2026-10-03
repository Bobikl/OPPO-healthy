package io.netty.incubator.codec.quic;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.CompositeByteBuf;

/* JADX INFO: loaded from: classes10.dex */
final class DirectIoByteBufAllocator implements ByteBufAllocator {
    private final ByteBufAllocator wrapped;

    public DirectIoByteBufAllocator(ByteBufAllocator byteBufAllocator) {
        this.wrapped = byteBufAllocator instanceof DirectIoByteBufAllocator ? ((DirectIoByteBufAllocator) byteBufAllocator).wrapped() : byteBufAllocator;
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf buffer() {
        return this.wrapped.buffer();
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public int calculateNewCapacity(int i, int i2) {
        return this.wrapped.calculateNewCapacity(i, i2);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeBuffer() {
        return this.wrapped.compositeBuffer();
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeDirectBuffer() {
        return this.wrapped.compositeDirectBuffer();
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeHeapBuffer() {
        return this.wrapped.compositeHeapBuffer();
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf directBuffer() {
        return this.wrapped.directBuffer();
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf heapBuffer() {
        return this.wrapped.heapBuffer();
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf ioBuffer() {
        return directBuffer();
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public boolean isDirectBufferPooled() {
        return this.wrapped.isDirectBufferPooled();
    }

    public ByteBufAllocator wrapped() {
        return this.wrapped;
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf buffer(int i) {
        return this.wrapped.buffer(i);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeBuffer(int i) {
        return this.wrapped.compositeBuffer(i);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeDirectBuffer(int i) {
        return this.wrapped.compositeDirectBuffer(i);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public CompositeByteBuf compositeHeapBuffer(int i) {
        return this.wrapped.compositeHeapBuffer(i);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf directBuffer(int i) {
        return this.wrapped.directBuffer(i);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf heapBuffer(int i) {
        return this.wrapped.heapBuffer(i);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf ioBuffer(int i) {
        return directBuffer(i);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf buffer(int i, int i2) {
        return this.wrapped.buffer(i, i2);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf directBuffer(int i, int i2) {
        return this.wrapped.directBuffer(i, i2);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf heapBuffer(int i, int i2) {
        return this.wrapped.heapBuffer(i, i2);
    }

    @Override // io.netty.buffer.ByteBufAllocator
    public ByteBuf ioBuffer(int i, int i2) {
        return directBuffer(i, i2);
    }
}
