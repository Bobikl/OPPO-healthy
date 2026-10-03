package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class ox8 extends cq8<bx8> {
    public ox8(int i, long j2, aq8 aq8Var) {
        super(i, j2, aq8Var);
    }

    @Override // com.oplus.aiunit.vision.cq8
    public void j() {
        if (this.f10197n.size() > 0) {
            bx8 bx8Var = (bx8) this.f10197n.get(0);
            if (bx8Var.isUndue()) {
                a7b.f(b04.TAG, "restore first data");
                bx8Var.setStyle(0);
            }
            List<T> list = this.f10197n;
            bx8 bx8Var2 = (bx8) list.get(list.size() - 1);
            if (bx8Var2.isUndue()) {
                a7b.f(b04.TAG, "restore end data");
                bx8Var2.setStyle(0);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cq8
    public void p() {
        if (!this.p) {
            a7b.f(b04.TAG, "add left loading data bean");
            ((bx8) this.f10197n.get(0)).setStyle(1);
        }
        if (this.q || this.f10197n.size() < 30) {
            return;
        }
        a7b.f(b04.TAG, "add right loading data bean");
        List<T> list = this.f10197n;
        ((bx8) list.get(list.size() - 1)).setStyle(1);
    }
}
