package com.oplus.aiunit.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes13.dex */
public class bj6 extends yi6 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj6 f9776j;

    public bj6(boolean z, dj6 dj6Var) throws IOException {
        this.a = z;
        this.f9776j = dj6Var;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.b = dj6Var.m(byteBufferAllocate, 16L);
        this.f19026c = dj6Var.p(byteBufferAllocate, 28L);
        this.d = dj6Var.p(byteBufferAllocate, 32L);
        this.f19027e = dj6Var.m(byteBufferAllocate, 42L);
        this.f = dj6Var.m(byteBufferAllocate, 44L);
        this.g = dj6Var.m(byteBufferAllocate, 46L);
        this.h = dj6Var.m(byteBufferAllocate, 48L);
        this.i = dj6Var.m(byteBufferAllocate, 50L);
    }

    @Override // com.oplus.aiunit.vision.yi6
    public xi6 a(long j2, int i) throws IOException {
        return new w66(this.f9776j, this, j2, i);
    }

    @Override // com.oplus.aiunit.vision.yi6
    public zi6 b(long j2) throws IOException {
        return new lye(this.f9776j, this, j2);
    }

    @Override // com.oplus.aiunit.vision.yi6
    public aj6 c(int i) throws IOException {
        return new rpg(this.f9776j, this, i);
    }
}
