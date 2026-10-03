package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Exception;

/* JADX INFO: loaded from: classes11.dex */
public class up0 extends y1 {
    public up0(boolean z, int i, f1 f1Var) {
        super(z, i, f1Var);
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        Enumeration enumerationR;
        q1Var.k(160, this.i);
        q1Var.c(128);
        if (!this.f18825j) {
            if (this.k) {
                q1Var.j(this.f18826l);
            } else {
                f1 f1Var = this.f18826l;
                if (f1Var instanceof o1) {
                    enumerationR = f1Var instanceof op0 ? ((op0) f1Var).s() : new op0(((o1) f1Var).o()).s();
                } else if (f1Var instanceof s1) {
                    enumerationR = ((s1) f1Var).q();
                } else {
                    if (!(f1Var instanceof u1)) {
                        throw new ASN1Exception("not implemented: " + this.f18826l.getClass().getName());
                    }
                    enumerationR = ((u1) f1Var).r();
                }
                while (enumerationR.hasMoreElements()) {
                    q1Var.j((f1) enumerationR.nextElement());
                }
            }
        }
        q1Var.c(0);
        q1Var.c(0);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        if (this.f18825j) {
            return lwi.b(this.i) + 1;
        }
        int iH = this.f18826l.c().h();
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
