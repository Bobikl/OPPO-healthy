package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class j5m extends m1 {
    public final o1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a86 f12764j;
    public rb6 k;

    public j5m(rb6 rb6Var) {
        this(rb6Var, false);
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return this.i;
    }

    public synchronized rb6 f() {
        if (this.k == null) {
            this.k = this.f12764j.j(this.i.o()).y();
        }
        return this.k;
    }

    public j5m(rb6 rb6Var, boolean z) {
        this.k = rb6Var.y();
        this.i = new tj4(rb6Var.l(z));
    }

    public j5m(a86 a86Var, byte[] bArr) {
        this.f12764j = a86Var;
        this.i = new tj4(eh0.e(bArr));
    }

    public j5m(a86 a86Var, o1 o1Var) {
        this(a86Var, o1Var.o());
    }
}
