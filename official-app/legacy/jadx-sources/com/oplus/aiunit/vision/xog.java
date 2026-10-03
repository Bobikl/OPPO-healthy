package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class xog extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yog f18709j;

    public xog() {
        super(571, 2, 5, 10);
        this.f18709j = new yog(this, null, null);
        this.b = m(BigInteger.valueOf(0L));
        this.f9236c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, v79.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
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
        return new xog();
    }

    @Override // com.oplus.aiunit.vision.a86
    public lb6 e() {
        return new p5l();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new yog(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new yog(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new wog(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 571;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f18709j;
    }
}
