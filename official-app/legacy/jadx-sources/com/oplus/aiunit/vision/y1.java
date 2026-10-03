package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y1 extends r1 implements x5a {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18825j = false;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f1 f18826l;

    public y1(boolean z, int i, f1 f1Var) {
        this.k = true;
        this.f18826l = null;
        if (f1Var instanceof e1) {
            this.k = true;
        } else {
            this.k = z;
        }
        this.i = i;
        if (this.k) {
            this.f18826l = f1Var;
        } else {
            boolean z2 = f1Var.c() instanceof u1;
            this.f18826l = f1Var;
        }
    }

    public static y1 m(Object obj) {
        if (obj == null || (obj instanceof y1)) {
            return (y1) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        try {
            return m(r1.i((byte[]) obj));
        } catch (IOException e2) {
            throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + e2.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() {
        return c();
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (!(r1Var instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) r1Var;
        if (this.i != y1Var.i || this.f18825j != y1Var.f18825j || this.k != y1Var.k) {
            return false;
        }
        f1 f1Var = this.f18826l;
        if (f1Var == null) {
            return y1Var.f18826l == null;
        }
        return f1Var.c().equals(y1Var.f18826l.c());
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        int i = this.i;
        f1 f1Var = this.f18826l;
        return f1Var != null ? i ^ f1Var.hashCode() : i;
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 k() {
        return new ck4(this.k, this.i, this.f18826l);
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 l() {
        return new uk4(this.k, this.i, this.f18826l);
    }

    public r1 n() {
        f1 f1Var = this.f18826l;
        if (f1Var != null) {
            return f1Var.c();
        }
        return null;
    }

    public int o() {
        return this.i;
    }

    public boolean p() {
        return this.k;
    }

    public String toString() {
        return "[" + this.i + "]" + this.f18826l;
    }
}
