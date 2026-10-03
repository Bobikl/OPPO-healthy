package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class bog extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cog f9807j;

    public bog() {
        super(233, 74, 0, 0);
        this.f9807j = new cog(this, null, null);
        this.b = m(BigInteger.valueOf(0L));
        this.f9236c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, v79.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
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
        return new bog();
    }

    @Override // com.oplus.aiunit.vision.a86
    public lb6 e() {
        return new p5l();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new cog(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new cog(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new aog(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 233;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f9807j;
    }
}
