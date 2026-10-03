package com.oplus.aiunit.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class x66 extends xi6 {
    public x66(dj6 dj6Var, yi6 yi6Var, long j2, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(yi6Var.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = j2 + ((long) (i * 16));
        this.a = dj6Var.n(byteBufferAllocate, j3);
        this.b = dj6Var.n(byteBufferAllocate, j3 + 8);
    }
}
