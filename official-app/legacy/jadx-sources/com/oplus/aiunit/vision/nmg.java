package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class nmg extends a86.b {
    public static final BigInteger q = new BigInteger(1, v79.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));
    public qmg i;

    public nmg() {
        super(q);
        this.i = new qmg(this, null, null);
        this.b = m(new BigInteger(1, v79.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f9236c = m(new BigInteger(1, v79.a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.d = new BigInteger(1, v79.a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.f9237e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public boolean B(int i) {
        return i == 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public a86 c() {
        return new nmg();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new qmg(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new qmg(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new pmg(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return q.bitLength();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.i;
    }
}
