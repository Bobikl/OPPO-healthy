package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class xng extends a86.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public yng f18692j;

    public xng() {
        super(193, 15, 0, 0);
        this.f18692j = new yng(this, null, null);
        this.b = m(new BigInteger(1, v79.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f9236c = m(new BigInteger(1, v79.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.d = new BigInteger(1, v79.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
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
        return new xng();
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 h(h86 h86Var, h86 h86Var2, boolean z) {
        return new yng(this, h86Var, h86Var2, z);
    }

    @Override // com.oplus.aiunit.vision.a86
    public rb6 i(h86 h86Var, h86 h86Var2, h86[] h86VarArr, boolean z) {
        return new yng(this, h86Var, h86Var2, h86VarArr, z);
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
        return this.f18692j;
    }
}
