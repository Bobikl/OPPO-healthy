package com.oplus.aiunit.vision;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o1 extends r1 implements p1 {
    public byte[] i;

    public o1(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.i = bArr;
    }

    public static o1 m(y1 y1Var, boolean z) {
        r1 r1VarN = y1Var.n();
        return (z || (r1VarN instanceof o1)) ? n(r1VarN) : op0.q(s1.n(r1VarN));
    }

    public static o1 n(Object obj) {
        if (obj == null || (obj instanceof o1)) {
            return (o1) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return n(r1.i((byte[]) obj));
            } catch (IOException e2) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e2.getMessage());
            }
        }
        if (obj instanceof f1) {
            r1 r1VarC = ((f1) obj).c();
            if (r1VarC instanceof o1) {
                return (o1) r1VarC;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() {
        return c();
    }

    @Override // com.oplus.aiunit.vision.p1
    public InputStream b() {
        return new ByteArrayInputStream(this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean f(r1 r1Var) {
        if (r1Var instanceof o1) {
            return eh0.a(this.i, ((o1) r1Var).i);
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.r1, com.oplus.aiunit.vision.m1
    public int hashCode() {
        return eh0.p(o());
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 k() {
        return new tj4(this.i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public r1 l() {
        return new tj4(this.i);
    }

    public byte[] o() {
        return this.i;
    }

    public String toString() {
        return "#" + Strings.b(v79.b(this.i));
    }
}
