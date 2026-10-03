package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class dog extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public eog f10640j;

    public dog() {
        super(233, 74, 0, 0);
        this.f10640j = new eog(this, null, null);
        this.b = m(BigInteger.valueOf(1L));
        this.f9236c = m(new BigInteger(1, v79.a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.d = new BigInteger(1, v79.a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
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
        return new dog();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new eog(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new eog(this, h86Var, h86Var2, h86VarArr, z);
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
        return this.f10640j;
    }
}
