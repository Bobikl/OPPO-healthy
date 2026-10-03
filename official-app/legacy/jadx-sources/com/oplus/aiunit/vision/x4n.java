package com.oplus.aiunit.vision;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes12.dex */
public abstract class x4n {
    public z4n a;
    public ByteBuffer b;

    public x4n(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.b = byteBufferAllocate;
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        this.a = new z4n(this.b);
    }

    public final x4n a() {
        this.a.c(this.b);
        return this;
    }
}
