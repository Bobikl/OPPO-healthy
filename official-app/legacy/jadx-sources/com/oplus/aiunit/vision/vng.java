package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class vng extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wng f17928j;

    public vng() {
        super(193, 15, 0, 0);
        this.f17928j = new wng(this, null, null);
        this.b = m(new BigInteger(1, v79.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f9236c = m(new BigInteger(1, v79.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.d = new BigInteger(1, v79.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
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
        return new vng();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new wng(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new wng(this, h86Var, h86Var2, h86VarArr, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public h86 m(BigInteger bigInteger) {
        return new ung(bigInteger);
    }

    @Override // com.oplus.aiunit.vision.a86
    public int s() {
        return 193;
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 t() {
        return this.f17928j;
    }
}
