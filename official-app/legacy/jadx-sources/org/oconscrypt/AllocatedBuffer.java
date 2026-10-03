package org.oconscrypt;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AllocatedBuffer {
    public static AllocatedBuffer wrap(final ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer, "buffer");
        return new AllocatedBuffer() { // from class: org.oconscrypt.AllocatedBuffer.1
            @Override // org.oconscrypt.AllocatedBuffer
            public ByteBuffer nioBuffer() {
                return byteBuffer;
            }

            @Override // org.oconscrypt.AllocatedBuffer
            public AllocatedBuffer release() {
                return this;
            }
        };
    }

    public abstract ByteBuffer nioBuffer();

    public abstract AllocatedBuffer release();

    @Deprecated
    public AllocatedBuffer retain() {
        return this;
    }
}
