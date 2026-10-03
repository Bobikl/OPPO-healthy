package com.oplus.aiunit.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.DigestException;

/* JADX INFO: loaded from: classes8.dex */
public class gd2 implements qw4 {
    public final ByteBuffer a;

    public gd2(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // com.oplus.aiunit.vision.qw4
    public void b(zs4 zs4Var, long j2, int i) throws DigestException, IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.a) {
            this.a.position(0);
            int i2 = (int) j2;
            this.a.limit(i + i2);
            this.a.position(i2);
            byteBufferSlice = this.a.slice();
        }
        zs4Var.a(byteBufferSlice);
    }

    @Override // com.oplus.aiunit.vision.qw4
    public long size() {
        return this.a.capacity();
    }
}
