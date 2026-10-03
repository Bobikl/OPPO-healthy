package com.oplus.aiunit.vision;

import com.heytap.accessory.constant.FastPairConstants;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes11.dex */
public class ap4 extends m1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f9454l = {-87, -42, -21, 69, -15, 60, 112, -126, ByteCompanionObject.MIN_VALUE, -60, -106, 123, FastPairConstants.MESSAGE_TYPE_NETWORK_CONNECT_SEEKER, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    public n1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yo4 f9455j;
    public byte[] k = f9454l;

    public ap4(n1 n1Var) {
        this.i = n1Var;
    }

    public static byte[] g() {
        return f9454l;
    }

    public static ap4 i(Object obj) {
        if (obj instanceof ap4) {
            return (ap4) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        s1 s1VarN = s1.n(obj);
        ap4 ap4Var = s1VarN.p(0) instanceof n1 ? new ap4(n1.s(s1VarN.p(0))) : new ap4(yo4.j(s1VarN.p(0)));
        if (s1VarN.size() == 2) {
            byte[] bArrO = o1.n(s1VarN.p(1)).o();
            ap4Var.k = bArrO;
            if (bArrO.length != f9454l.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return ap4Var;
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        g1 g1Var = new g1();
        n1 n1Var = this.i;
        if (n1Var != null) {
            g1Var.a(n1Var);
        } else {
            g1Var.a(this.f9455j);
        }
        if (!eh0.a(this.k, f9454l)) {
            g1Var.a(new tj4(this.k));
        }
        return new xj4(g1Var);
    }

    public byte[] f() {
        return this.k;
    }

    public yo4 h() {
        return this.f9455j;
    }

    public n1 j() {
        return this.i;
    }

    public boolean k() {
        return this.i != null;
    }

    public ap4(yo4 yo4Var) {
        this.f9455j = yo4Var;
    }
}
