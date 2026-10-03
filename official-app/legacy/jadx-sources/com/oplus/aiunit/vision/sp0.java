package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class sp0 extends u1 {
    public sp0() {
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.c(49);
        q1Var.c(128);
        Enumeration enumerationR = r();
        while (enumerationR.hasMoreElements()) {
            q1Var.j((f1) enumerationR.nextElement());
        }
        q1Var.c(0);
        q1Var.c(0);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        Enumeration enumerationR = r();
        int iH = 0;
        while (enumerationR.hasMoreElements()) {
            iH += ((f1) enumerationR.nextElement()).c().h();
        }
        return iH + 2 + 2;
    }

    public sp0(f1 f1Var) {
        super(f1Var);
    }

    public sp0(g1 g1Var) {
        super(g1Var, false);
    }

    public sp0(f1[] f1VarArr) {
        super(f1VarArr, false);
    }
}
