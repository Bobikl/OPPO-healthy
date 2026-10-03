package org.oconscrypt;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BufferAllocator {
    private static final BufferAllocator UNPOOLED = new BufferAllocator() { // from class: org.oconscrypt.BufferAllocator.1
        @Override // org.oconscrypt.BufferAllocator
        public AllocatedBuffer allocateDirectBuffer(int i) {
            return AllocatedBuffer.wrap(ByteBuffer.allocateDirect(i));
        }
    };

    public static BufferAllocator unpooled() {
        return UNPOOLED;
    }

    public abstract AllocatedBuffer allocateDirectBuffer(int i);
}
