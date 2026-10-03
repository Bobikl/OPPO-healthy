package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class sk4 extends s1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16630j;

    public sk4() {
        this.f16630j = -1;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1 q1VarB = q1Var.b();
        int iS = s();
        q1Var.c(48);
        q1Var.i(iS);
        Enumeration enumerationQ = q();
        while (enumerationQ.hasMoreElements()) {
            q1VarB.j((f1) enumerationQ.nextElement());
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        int iS = s();
        return lwi.a(iS) + 1 + iS;
    }

    public final int s() throws IOException {
        if (this.f16630j < 0) {
            Enumeration enumerationQ = q();
            int iH = 0;
            while (enumerationQ.hasMoreElements()) {
                iH += ((f1) enumerationQ.nextElement()).c().l().h();
            }
            this.f16630j = iH;
        }
        return this.f16630j;
    }

    public sk4(f1 f1Var) {
        super(f1Var);
        this.f16630j = -1;
    }

    public sk4(g1 g1Var) {
        super(g1Var);
        this.f16630j = -1;
    }
}
