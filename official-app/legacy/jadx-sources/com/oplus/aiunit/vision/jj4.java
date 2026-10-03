package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class jj4 extends r1 implements x1 {
    public final char[] i;

    public jj4(char[] cArr) {
        this.i = cArr;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var instanceof jj4) {
            return eh0.b(this.i, ((jj4) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.c(30);
        q1Var.i(this.i.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.i;
            if (i == cArr.length) {
                return;
            }
            char c2 = cArr[i];
            q1Var.c((byte) (c2 >> '\b'));
            q1Var.c((byte) c2);
            i++;
        }
    }

    @Override // com.oplus.aiunit.vision.x1
    public String getString() {
        return new String(this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        return lwi.a(this.i.length * 2) + 1 + (this.i.length * 2);
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        return eh0.q(this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }

    public String toString() {
        return getString();
    }
}
