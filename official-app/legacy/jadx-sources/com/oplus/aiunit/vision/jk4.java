package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class jk4 extends pi0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lk4 f12930j;

    public jk4(boolean z, lk4 lk4Var) {
        super(z);
        this.f12930j = lk4Var;
    }

    public lk4 b() {
        return this.f12930j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof jk4)) {
            return false;
        }
        jk4 jk4Var = (jk4) obj;
        lk4 lk4Var = this.f12930j;
        if (lk4Var == null) {
            return jk4Var.b() == null;
        }
        return lk4Var.equals(jk4Var.b());
    }

    public int hashCode() {
        int i = !a() ? 1 : 0;
        lk4 lk4Var = this.f12930j;
        return lk4Var != null ? i ^ lk4Var.hashCode() : i;
    }
}
