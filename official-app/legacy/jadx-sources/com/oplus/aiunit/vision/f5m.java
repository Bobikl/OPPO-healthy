package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class f5m extends m1 implements e1 {
    public r1 i;

    public f5m(h5m h5mVar) {
        this.i = null;
        this.i = h5mVar.c();
    }

    public static f5m f(Object obj) {
        if (obj == null || (obj instanceof f5m)) {
            return (f5m) obj;
        }
        if (obj instanceof r1) {
            return new f5m((r1) obj);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        try {
            return new f5m(r1.i((byte[]) obj));
        } catch (Exception e2) {
            throw new IllegalArgumentException("unable to parse encoded data: " + e2.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return this.i;
    }

    public r1 g() {
        return this.i;
    }

    public boolean h() {
        return this.i instanceof l1;
    }

    public boolean i() {
        return this.i instanceof n1;
    }

    public f5m(n1 n1Var) {
        this.i = n1Var;
    }

    public f5m(l1 l1Var) {
        this.i = l1Var;
    }

    public f5m(r1 r1Var) {
        this.i = r1Var;
    }
}
