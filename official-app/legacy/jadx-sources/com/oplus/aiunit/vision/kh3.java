package com.oplus.aiunit.vision;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class kh3 extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f13286e = jgb.o;

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        boolean z;
        String strM;
        String strO;
        boolean z2 = true;
        int i = this.d + 1;
        this.d = i;
        j52 j52VarB = b();
        if (j52VarB == null) {
            return o("]");
        }
        if (!j52VarB.f) {
            l();
            return o("]");
        }
        String strSubstring = null;
        if (j() == '(') {
            this.d++;
            n();
            strM = g();
            if (strM != null) {
                n();
                Pattern pattern = f13286e;
                String str = this.f14395c;
                int i2 = this.d;
                if (pattern.matcher(str.substring(i2 - 1, i2)).matches()) {
                    strO = i();
                    n();
                } else {
                    strO = null;
                }
                if (j() == ')') {
                    this.d++;
                    z = true;
                } else {
                    this.d = i;
                    z = false;
                }
            } else {
                z = false;
                strO = null;
            }
        } else {
            z = false;
            strM = null;
            strO = null;
        }
        if (z) {
            z2 = z;
        } else {
            int i3 = this.d;
            h();
            int i4 = this.d - i3;
            if (i4 > 2) {
                strSubstring = this.f14395c.substring(i3, i4 + i3);
            } else if (!j52VarB.g) {
                strSubstring = this.f14395c.substring(j52VarB.b, i);
            }
            if (strSubstring != null) {
                oxa oxaVarA = this.a.a(up6.c(strSubstring));
                if (oxaVarA != null) {
                    strM = oxaVarA.m();
                    strO = oxaVarA.o();
                } else {
                    z2 = z;
                }
            } else {
                z2 = z;
            }
        }
        if (!z2) {
            this.d = i;
            l();
            return o("]");
        }
        ltc p2aVar = j52VarB.f12757c ? new p2a(strM, strO) : new kxa(strM, strO);
        ltc ltcVarE = j52VarB.a.e();
        while (ltcVarE != null) {
            ltc ltcVarE2 = ltcVarE.e();
            p2aVar.b(ltcVarE);
            ltcVarE = ltcVarE2;
        }
        k(j52VarB.f12758e);
        m8a.a(p2aVar);
        j52VarB.a.l();
        l();
        if (!j52VarB.f12757c) {
            for (j52 j52VarB2 = b(); j52VarB2 != null; j52VarB2 = j52VarB2.d) {
                if (!j52VarB2.f12757c) {
                    j52VarB2.f = false;
                }
            }
        }
        return p2aVar;
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return ']';
    }
}
