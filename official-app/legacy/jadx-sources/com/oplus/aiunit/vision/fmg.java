package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class fmg extends a86.b {
    public static final BigInteger q = new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));
    public img i;

    public fmg() {
        super(q);
        this.i = new img(this, null, null);
        this.b = m(new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f9236c = m(new BigInteger(1, v79.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.d = new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f9237e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public boolean B(int i) {
        return i == 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public a86 c() {
        return new fmg();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new img(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new img(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new hmg(bigInteger);
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
