package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class wj0 extends m1 {
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1 f18289j;

    public wj0(s1 s1Var) {
        this.i = (n1) s1Var.p(0);
        this.f18289j = s1Var.p(1);
    }

    public static wj0 f(Object obj) {
        if (obj instanceof wj0) {
            return (wj0) obj;
        }
        if (obj != null) {
            return new wj0(s1.n(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        g1Var.a(this.f18289j);
        return new xj4(g1Var);
    }

    public n1 g() {
        return this.i;
    }

    public f1 h() {
        return this.f18289j;
    }
}
