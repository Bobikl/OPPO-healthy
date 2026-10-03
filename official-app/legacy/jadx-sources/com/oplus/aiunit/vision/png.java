package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class png extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qng f15413j;

    public png() {
        super(163, 3, 6, 7);
        this.f15413j = new qng(this, null, null);
        this.b = m(new BigInteger(1, v79.a("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f9236c = m(new BigInteger(1, v79.a("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.d = new BigInteger(1, v79.a("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
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
        return new png();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new qng(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new qng(this, h86Var, h86Var2, h86VarArr, z);
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
        return this.f15413j;
    }
}
