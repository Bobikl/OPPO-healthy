package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class xb6 extends jb6 {
    public final rb6 k;

    public xb6(rb6 rb6Var, f86 f86Var) {
        super(false, f86Var);
        this.k = d(rb6Var);
    }

    public rb6 c() {
        return this.k;
    }

    public final rb6 d(rb6 rb6Var) {
        if (rb6Var == null) {
            throw new IllegalArgumentException("point has null value");
        }
        if (rb6Var.t()) {
            throw new IllegalArgumentException("point at infinity");
        }
        rb6 rb6VarY = rb6Var.y();
        if (rb6VarY.v()) {
            return rb6VarY;
        }
        throw new IllegalArgumentException("point not on curve");
    }
}
