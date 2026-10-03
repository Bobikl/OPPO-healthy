package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class tk4 extends u1 {
    public int k;

    public tk4() {
        this.k = -1;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1 q1VarB = q1Var.b();
        int iV = v();
        q1Var.c(49);
        q1Var.i(iV);
        Enumeration enumerationR = r();
        while (enumerationR.hasMoreElements()) {
            q1VarB.j((f1) enumerationR.nextElement());
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        int iV = v();
        return lwi.a(iV) + 1 + iV;
    }

    public final int v() throws IOException {
        if (this.k < 0) {
            Enumeration enumerationR = r();
            int iH = 0;
            while (enumerationR.hasMoreElements()) {
                iH += ((f1) enumerationR.nextElement()).c().l().h();
            }
            this.k = iH;
        }
        return this.k;
    }

    public tk4(f1 f1Var) {
        super(f1Var);
        this.k = -1;
    }

    public tk4(g1 g1Var) {
        super(g1Var, false);
        this.k = -1;
    }

    public tk4(f1[] f1VarArr) {
        super(f1VarArr, false);
        this.k = -1;
    }
}
