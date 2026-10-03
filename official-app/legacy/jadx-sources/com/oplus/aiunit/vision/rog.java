package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class rog extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sog f16278j;

    public rog() {
        super(409, 87, 0, 0);
        this.f16278j = new sog(this, null, null);
        this.b = m(BigInteger.valueOf(0L));
        this.f9236c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, v79.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.f9237e = BigInteger.valueOf(4L);
        this.f = 6;
    }

    @Override // com.oplus.aiunit.vision.a86
    public boolean B(int i) {
        return i == 6;
    }

    @Override // com.oplus.aiunit.vision.a86.a
    public boolean G() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.a86
    public a86 c() {
        return new rog();
    }

    @Override // com.oplus.aiunit.vision.a86
    public lb6 e() {
        return new p5l();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new sog(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new sog(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new qog(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 409;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f16278j;
    }
}
