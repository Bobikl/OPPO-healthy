package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class xlg extends a86.b {
    public static final BigInteger q = new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));
    public amg i;

    public xlg() {
        super(q);
        this.i = new amg(this, null, null);
        this.b = m(new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f9236c = m(new BigInteger(1, v79.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, v79.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f9237e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public boolean B(int i) {
        return i == 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public a86 c() {
        return new xlg();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new amg(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new amg(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new zlg(bigInteger);
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
