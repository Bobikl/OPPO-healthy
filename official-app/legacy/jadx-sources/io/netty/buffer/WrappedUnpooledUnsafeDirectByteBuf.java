package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
final class WrappedUnpooledUnsafeDirectByteBuf extends UnpooledUnsafeDirectByteBuf {
    public WrappedUnpooledUnsafeDirectByteBuf(ByteBufAllocator byteBufAllocator, long j2, int i, boolean z) {
        super(byteBufAllocator, PlatformDependent.directBuffer(j2, i), i, z);
    }

    @Override // io.netty.buffer.UnpooledDirectByteBuf
    public void freeDirect(ByteBuffer byteBuffer) {
        PlatformDependent.freeMemory(this.memoryAddress);
    }
}
