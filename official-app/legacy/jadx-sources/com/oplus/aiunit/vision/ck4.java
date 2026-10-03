package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class ck4 extends y1 {
    public static final byte[] m = new byte[0];

    public ck4(boolean z, int i, f1 f1Var) {
        super(z, i, f1Var);
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        if (this.f18825j) {
            q1Var.f(160, this.i, m);
            return;
        }
        r1 r1VarK = this.f18826l.c().k();
        if (!this.k) {
            q1Var.k(r1VarK.j() ? 160 : 128, this.i);
            q1Var.h(r1VarK);
        } else {
            q1Var.k(160, this.i);
            q1Var.i(r1VarK.h());
            q1Var.j(r1VarK);
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        if (this.f18825j) {
            return lwi.b(this.i) + 1;
        }
        int iH = this.f18826l.c().k().h();
        if (this.k) {
            return lwi.b(this.i) + lwi.a(iH) + iH;
        }
        return lwi.b(this.i) + (iH - 1);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        if (this.f18825j || this.k) {
            return true;
        }
        return this.f18826l.c().k().j();
    }
}
