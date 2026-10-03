package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class r8g extends a86.b {
    public static final BigInteger q = new BigInteger(1, v79.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
    public u8g i;

    public r8g() {
        super(q);
        this.i = new u8g(this, null, null);
        this.b = m(new BigInteger(1, v79.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.f9236c = m(new BigInteger(1, v79.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.d = new BigInteger(1, v79.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.f9237e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public boolean B(int i) {
        return i == 2;
    }

    @Override // com.oplus.aiunit.vision.a86
    public a86 c() {
        return new r8g();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new u8g(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new u8g(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new t8g(bigInteger);
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
