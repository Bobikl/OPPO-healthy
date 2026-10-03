package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class dng extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public eng f10636j;

    public dng() {
        super(113, 9, 0, 0);
        this.f10636j = new eng(this, null, null);
        this.b = m(new BigInteger(1, v79.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f9236c = m(new BigInteger(1, v79.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.d = new BigInteger(1, v79.a("010000000000000108789B2496AF93"));
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
        return new dng();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new eng(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new eng(this, h86Var, h86Var2, h86VarArr, z);
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
        return this.f10636j;
    }
}
