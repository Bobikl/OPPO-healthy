package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class ij4 extends b1 {
    public ij4(boolean z, int i, byte[] bArr) {
        super(z, i, bArr);
    }

    @Override // com.oplus.aiunit.vision.b1, com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.f(this.i ? 96 : 64, this.f9546j, this.k);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        if (j()) {
            stringBuffer.append("CONSTRUCTED ");
        }
        stringBuffer.append("APPLICATION ");
        stringBuffer.append(Integer.toString(m()));
        stringBuffer.append("]");
        if (this.k != null) {
            stringBuffer.append(" #");
            stringBuffer.append(v79.d(this.k));
        } else {
            stringBuffer.append(" #null");
        }
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
