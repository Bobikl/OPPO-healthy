package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class qj4 extends r1 implements x1 {
    public final byte[] i;

    public qj4(byte[] bArr) {
        this.i = bArr;
    }

    public static qj4 m(y1 y1Var, boolean z) {
        r1 r1VarN = y1Var.n();
        return (z || (r1VarN instanceof qj4)) ? n(r1VarN) : new qj4(((o1) r1VarN).o());
    }

    public static qj4 n(Object obj) {
        if (obj == null || (obj instanceof qj4)) {
            return (qj4) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (qj4) r1.i((byte[]) obj);
        } catch (Exception e2) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e2.toString());
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var instanceof qj4) {
            return eh0.a(this.i, ((qj4) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.g(22, this.i);
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
