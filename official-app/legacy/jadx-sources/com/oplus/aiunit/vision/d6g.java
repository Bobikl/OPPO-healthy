package com.oplus.aiunit.vision;

import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes11.dex */
public class d6g extends z8b {
    public d6g() {
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
        h2e.h(this.k, bArr, i + 48);
        h2e.h(this.f19320l, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // com.oplus.aiunit.vision.ns5
    public String c() {
        return MessageDigestAlgorithms.SHA_512;
    }

    @Override // com.oplus.aiunit.vision.gsb
    public gsb copy() {
        return new d6g(this);
    }

    @Override // com.oplus.aiunit.vision.gsb
    public void d(gsb gsbVar) {
        o((d6g) gsbVar);
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int f() {
        return 64;
    }

    @Override // com.oplus.aiunit.vision.z8b, com.oplus.aiunit.vision.ns5
    public void reset() {
        super.reset();
        this.f19318e = 7640891576956012808L;
        this.f = -4942790177534073029L;
        this.g = 4354685564936845355L;
        this.h = -6534734903238641935L;
        this.i = 5840696475078001361L;
        this.f19319j = -7276294671716946913L;
        this.k = 2270897969802886507L;
        this.f19320l = 6620516959819538809L;
    }

    public d6g(d6g d6gVar) {
        super(d6gVar);
    }
}
