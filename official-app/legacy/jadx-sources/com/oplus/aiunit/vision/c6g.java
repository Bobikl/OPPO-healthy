package com.oplus.aiunit.vision;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class c6g extends z8b {
    public c6g() {
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int a(byte[] bArr, int i) {
        p();
        h2e.h(this.f19318e, bArr, i);
        h2e.h(this.f, bArr, i + 8);
        h2e.h(this.g, bArr, i + 16);
        h2e.h(this.h, bArr, i + 24);
        h2e.h(this.i, bArr, i + 32);
        h2e.h(this.f19319j, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public String c() {
        return MessageDigestAlgorithms.SHA_384;
    }

    @Override // com.oplus.aiunit.vision.gsb
    public gsb copy() {
        return new c6g(this);
    }

    @Override // com.oplus.aiunit.vision.gsb
    public void d(gsb gsbVar) {
        super.o((c6g) gsbVar);
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int f() {
        return 48;
    }

    @Override // com.oplus.aiunit.vision.z8b, com.oplus.aiunit.vision.ns5
    public void reset() {
        super.reset();
        this.f19318e = -3766243637369397544L;
        this.f = 7105036623409894663L;
        this.g = -7973340178411365097L;
        this.h = 1526699215303891257L;
        this.i = 7436329637833083697L;
        this.f19319j = -8163818279084223215L;
        this.k = -2662702644619276377L;
        this.f19320l = 5167115440072839076L;
    }

    public c6g(c6g c6gVar) {
        super(c6gVar);
    }
}
