package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class p6m extends m1 {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f15217j;
    public final byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f15218l;
    public final byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f15219n;

    public p6m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.i = i;
        this.f15217j = eh0.e(bArr);
        this.k = eh0.e(bArr2);
        this.f15218l = eh0.e(bArr3);
        this.m = eh0.e(bArr4);
        this.f15219n = eh0.e(bArr5);
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(new k1(0L));
        g1 g1Var2 = new g1();
        g1Var2.a(new k1(this.i));
        g1Var2.a(new tj4(this.f15217j));
        g1Var2.a(new tj4(this.k));
        g1Var2.a(new tj4(this.f15218l));
        g1Var2.a(new tj4(this.m));
        g1Var.a(new xj4(g1Var2));
        g1Var.a(new ck4(true, 0, new tj4(this.f15219n)));
        return new xj4(g1Var);
    }
}
