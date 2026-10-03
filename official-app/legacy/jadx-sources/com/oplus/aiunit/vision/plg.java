package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class plg extends a86.b {
    public static final BigInteger q = new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));
    public slg i;

    public plg() {
        super(q);
        this.i = new slg(this, null, null);
        this.b = m(new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f9236c = m(new BigInteger(1, v79.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.d = new BigInteger(1, v79.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.f9237e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public boolean B(int i) {
        return i == 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public a86 c() {
        return new plg();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new slg(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new slg(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new rlg(bigInteger);
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
