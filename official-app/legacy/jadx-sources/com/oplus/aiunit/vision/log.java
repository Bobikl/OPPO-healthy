package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class log extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mog f13778j;

    public log() {
        super(283, 5, 7, 12);
        this.f13778j = new mog(this, null, null);
        this.b = m(BigInteger.valueOf(0L));
        this.f9236c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, v79.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
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
        return new log();
    }

    @Override // com.oplus.aiunit.vision.a86
    public lb6 e() {
        return new p5l();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new mog(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new mog(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new kog(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 283;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f13778j;
    }
}
