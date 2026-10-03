package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class kj4 extends c1 {
    public kj4(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static kj4 r(Object obj) {
        if (obj == null || (obj instanceof kj4)) {
            return (kj4) obj;
        }
        if (obj instanceof qk4) {
            qk4 qk4Var = (qk4) obj;
            return new kj4(qk4Var.i, qk4Var.f9911j);
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (kj4) r1.i((byte[]) obj);
        } catch (Exception e2) {
            throw new IllegalArgumentException("encoding error in getInstance: " + e2.toString());
        }
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        byte[] bArrM = c1.m(this.i, this.f9911j);
        int length = bArrM.length + 1;
        byte[] bArr = new byte[length];
        bArr[0] = (byte) q();
        System.arraycopy(bArrM, 0, bArr, 1, length - 1);
        q1Var.g(3, bArr);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        return lwi.a(this.i.length + 1) + 1 + this.i.length + 1;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }

    public kj4(byte[] bArr) {
        this(bArr, 0);
    }

    public kj4(f1 f1Var) throws IOException {
        super(f1Var.c().e("DER"), 0);
    }
}
