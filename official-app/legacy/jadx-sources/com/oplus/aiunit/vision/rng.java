package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class rng extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sng f16273j;

    public rng() {
        super(163, 3, 6, 7);
        this.f16273j = new sng(this, null, null);
        this.b = m(BigInteger.valueOf(1L));
        this.f9236c = m(new BigInteger(1, v79.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.d = new BigInteger(1, v79.a("040000000000000000000292FE77E70C12A4234C33"));
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
        return new rng();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new sng(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new sng(this, h86Var, h86Var2, h86VarArr, z);
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
        return this.f16273j;
    }
}
