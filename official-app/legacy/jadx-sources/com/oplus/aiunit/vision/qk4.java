package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class qk4 extends c1 {
    public qk4(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        byte[] bArr = this.i;
        int length = bArr.length + 1;
        byte[] bArr2 = new byte[length];
        bArr2[0] = (byte) q();
        System.arraycopy(bArr, 0, bArr2, 1, length - 1);
        q1Var.g(3, bArr2);
    }

    @Override // com.oplus.aiunit.vision.r1
    public int h() {
        return lwi.a(this.i.length + 1) + 1 + this.i.length + 1;
    }

    @Override // com.oplus.aiunit.vision.r1
    public boolean j() {
        return false;
    }
}
