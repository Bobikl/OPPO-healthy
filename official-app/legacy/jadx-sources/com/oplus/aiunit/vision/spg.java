package com.oplus.aiunit.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class spg extends aj6 {
    public spg(dj6 dj6Var, yi6 yi6Var, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(yi6Var.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.a = dj6Var.p(byteBufferAllocate, yi6Var.d + ((long) (i * yi6Var.g)) + 44);
    }
}
