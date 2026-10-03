package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class bng extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cng f9795j;

    public bng() {
        super(113, 9, 0, 0);
        this.f9795j = new cng(this, null, null);
        this.b = m(new BigInteger(1, v79.a("003088250CA6E7C7FE649CE85820F7")));
        this.f9236c = m(new BigInteger(1, v79.a("00E8BEE4D3E2260744188BE0E9C723")));
        this.d = new BigInteger(1, v79.a("0100000000000000D9CCEC8A39E56F"));
        this.f9237e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // com.oplus.aiunit.vision.a86
    public boolean B(int i) {
        return i == 6;
    }

    @Override // com.oplus.aiunit.vision.a86.a
    public boolean G() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.a86
    public a86 c() {
        return new bng();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new cng(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new cng(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new ang(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 113;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f9795j;
    }
}
