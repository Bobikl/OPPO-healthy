package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class hng extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ing f12208j;

    public hng() {
        super(131, 2, 3, 8);
        this.f12208j = new ing(this, null, null);
        this.b = m(new BigInteger(1, v79.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f9236c = m(new BigInteger(1, v79.a("0217C05610884B63B9C6C7291678F9D341")));
        this.d = new BigInteger(1, v79.a("0400000000000000023123953A9464B54D"));
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
        return new hng();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new ing(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new ing(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new gng(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 131;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f12208j;
    }
}
