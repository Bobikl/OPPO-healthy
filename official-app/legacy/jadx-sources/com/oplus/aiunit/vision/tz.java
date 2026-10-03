package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class tz extends m1 {
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f1 f17206j;

    public tz(n1 n1Var) {
        this.i = n1Var;
    }

    public static tz g(Object obj) {
        if (obj instanceof tz) {
            return (tz) obj;
        }
        if (obj != null) {
            return new tz(s1.n(obj));
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        g1Var.a(this.i);
        f1 f1Var = this.f17206j;
        if (f1Var != null) {
            g1Var.a(f1Var);
        }
        return new xj4(g1Var);
    }

    public n1 f() {
        return this.i;
    }

    public f1 h() {
        return this.f17206j;
    }

    public tz(n1 n1Var, f1 f1Var) {
        this.i = n1Var;
        this.f17206j = f1Var;
    }

    public tz(s1 s1Var) {
        if (s1Var.size() >= 1 && s1Var.size() <= 2) {
            this.i = n1.s(s1Var.p(0));
            if (s1Var.size() == 2) {
                this.f17206j = s1Var.p(1);
                return;
            } else {
                this.f17206j = null;
                return;
            }
        }
        throw new IllegalArgumentException("Bad sequence size: " + s1Var.size());
    }
}
