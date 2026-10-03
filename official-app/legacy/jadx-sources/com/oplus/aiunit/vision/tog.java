package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class tog extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public uog f17094j;

    public tog() {
        super(409, 87, 0, 0);
        this.f17094j = new uog(this, null, null);
        this.b = m(BigInteger.valueOf(1L));
        this.f9236c = m(new BigInteger(1, v79.a("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.d = new BigInteger(1, v79.a("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
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
        return new tog();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new uog(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new uog(this, h86Var, h86Var2, h86VarArr, z);
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
        return this.f17094j;
    }
}
