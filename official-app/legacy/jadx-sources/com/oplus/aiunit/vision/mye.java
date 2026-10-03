package com.oplus.aiunit.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class mye extends zi6 {
    public mye(dj6 dj6Var, yi6 yi6Var, long j2) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(yi6Var.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j3 = yi6Var.f19026c + (j2 * ((long) yi6Var.f19027e));
        this.a = dj6Var.p(byteBufferAllocate, j3);
        this.b = dj6Var.n(byteBufferAllocate, 8 + j3);
        this.f19428c = dj6Var.n(byteBufferAllocate, 16 + j3);
        this.d = dj6Var.n(byteBufferAllocate, j3 + 40);
    }
}
