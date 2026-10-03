package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class nng extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ong f14567j;

    public nng() {
        super(163, 3, 6, 7);
        this.f14567j = new ong(this, null, null);
        h86 h86VarM = m(BigInteger.valueOf(1L));
        this.b = h86VarM;
        this.f9236c = h86VarM;
        this.d = new BigInteger(1, v79.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.f9237e = BigInteger.valueOf(2L);
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
        return new nng();
    }

    @Override // com.oplus.aiunit.vision.a86
    public lb6 e() {
        return new p5l();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new ong(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new ong(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new mng(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 163;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f14567j;
    }
}
