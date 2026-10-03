package com.oplus.aiunit.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class cj6 extends yi6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj6 f10100j;

    public cj6(boolean z, dj6 dj6Var) throws IOException {
        this.a = z;
        this.f10100j = dj6Var;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.b = dj6Var.m(byteBufferAllocate, 16L);
        this.f19026c = dj6Var.n(byteBufferAllocate, 32L);
        this.d = dj6Var.n(byteBufferAllocate, 40L);
        this.f19027e = dj6Var.m(byteBufferAllocate, 54L);
        this.f = dj6Var.m(byteBufferAllocate, 56L);
        this.g = dj6Var.m(byteBufferAllocate, 58L);
        this.h = dj6Var.m(byteBufferAllocate, 60L);
        this.i = dj6Var.m(byteBufferAllocate, 62L);
    }

    @Override // com.oplus.aiunit.vision.yi6
    public xi6 a(long j2, int i) throws IOException {
        return new x66(this.f10100j, this, j2, i);
    }

    @Override // com.oplus.aiunit.vision.yi6
    public zi6 b(long j2) throws IOException {
        return new mye(this.f10100j, this, j2);
    }

    @Override // com.oplus.aiunit.vision.yi6
    public aj6 c(int i) throws IOException {
        return new spg(this.f10100j, this, i);
    }
}
