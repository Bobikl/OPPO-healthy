package com.oplus.aiunit.vision;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes11.dex */
public class zua extends s1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f19555j;

    public zua(byte[] bArr) throws IOException {
        this.f19555j = bArr;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        byte[] bArr = this.f19555j;
        if (bArr != null) {
            q1Var.g(48, bArr);
        } else {
            super.l().g(q1Var);
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() throws IOException {
        byte[] bArr = this.f19555j;
        return bArr != null ? lwi.a(bArr.length) + 1 + this.f19555j.length : super.l().h();
    }

    @Override // com.oplus.aiunit.vision.s1, com.oplus.aiunit.vision.r1
    public r1 k() {
        if (this.f19555j != null) {
            s();
        }
        return super.k();
    }

    @Override // com.oplus.aiunit.vision.s1, com.oplus.aiunit.vision.r1
    public r1 l() {
        if (this.f19555j != null) {
            s();
        }
        return super.l();
    }

    @Override // com.oplus.aiunit.vision.s1
    public synchronized f1 p(int i) {
        if (this.f19555j != null) {
            s();
        }
        return super.p(i);
    }

    @Override // com.oplus.aiunit.vision.s1
    public synchronized Enumeration q() {
        byte[] bArr = this.f19555j;
        if (bArr == null) {
            return super.q();
        }
        return new yua(bArr);
    }

    public final void s() {
        yua yuaVar = new yua(this.f19555j);
        while (yuaVar.hasMoreElements()) {
            this.i.addElement(yuaVar.nextElement());
        }
        this.f19555j = null;
    }

    @Override // com.oplus.aiunit.vision.s1
    public synchronized int size() {
        if (this.f19555j != null) {
            s();
        }
        return super.size();
    }
}
