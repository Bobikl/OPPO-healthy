package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class zog extends a86.a {
    public static final wog k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final wog f19486l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public apg f19487j;

    static {
        wog wogVar = new wog(new BigInteger(1, v79.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        k = wogVar;
        f19486l = (wog) wogVar.n();
    }

    public zog() {
        super(571, 2, 5, 10);
        this.f19487j = new apg(this, null, null);
        this.b = m(BigInteger.valueOf(1L));
        this.f9236c = k;
        this.d = new BigInteger(1, v79.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
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
        return new zog();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new apg(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new apg(this, h86Var, h86Var2, h86VarArr, z);
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
        return this.f19487j;
    }
}
