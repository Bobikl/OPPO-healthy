package com.oplus.aiunit.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class rpg extends aj6 {
    public rpg(dj6 dj6Var, yi6 yi6Var, int i) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(yi6Var.a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.a = dj6Var.p(byteBufferAllocate, yi6Var.d + ((long) (i * yi6Var.g)) + 28);
    }
}
