package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class bk4 extends r1 implements x1 {
    public byte[] i;

    public bk4(byte[] bArr) {
        this.i = eh0.e(bArr);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var instanceof bk4) {
            return eh0.a(this.i, ((bk4) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.g(20, this.i);
    }

    @Override // com.oplus.aiunit.vision.x1
    public String getString() {
        return Strings.b(this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        return lwi.a(this.i.length) + 1 + this.i.length;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        return eh0.p(this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
