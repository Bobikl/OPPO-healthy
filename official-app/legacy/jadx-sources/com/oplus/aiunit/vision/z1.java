package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class z1 extends r1 {
    public byte[] i;

    public z1(byte[] bArr) {
        this.i = bArr;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var instanceof z1) {
            return eh0.a(this.i, ((z1) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.c(23);
        int length = this.i.length;
        q1Var.i(length);
        for (int i = 0; i != length; i++) {
            q1Var.c(this.i[i]);
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        int length = this.i.length;
        return lwi.a(length) + 1 + length;
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
        return Strings.b(this.i);
    }
}
