package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class qp0 extends s1 {
    public qp0() {
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.c(48);
        q1Var.c(128);
        Enumeration enumerationQ = q();
        while (enumerationQ.hasMoreElements()) {
            q1Var.j((f1) enumerationQ.nextElement());
        }
        q1Var.c(0);
        q1Var.c(0);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        Enumeration enumerationQ = q();
        int iH = 0;
        while (enumerationQ.hasMoreElements()) {
            iH += ((f1) enumerationQ.nextElement()).c().h();
        }
        return iH + 2 + 2;
    }

    public qp0(f1 f1Var) {
        super(f1Var);
    }

    public qp0(g1 g1Var) {
        super(g1Var);
    }
}
