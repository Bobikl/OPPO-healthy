package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r1 extends m1 {
    public static r1 i(byte[] bArr) throws IOException {
        j1 j1Var = new j1(bArr);
        try {
            r1 r1VarS = j1Var.s();
            if (j1Var.available() == 0) {
                return r1VarS;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.m1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && f(((f1) obj).c());
    }

    public abstract boolean f(r1 r1Var);

    public abstract void g(q1 q1Var) throws IOException;

    public abstract int h() throws IOException;

    @Override // com.oplus.aiunit.vision.m1
    public abstract int hashCode();

    public abstract boolean j();

    public r1 k() {
        return this;
    }

    public r1 l() {
        return this;
    }
}
