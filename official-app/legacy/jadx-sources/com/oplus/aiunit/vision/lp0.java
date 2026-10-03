package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class lp0 extends b1 {
    public lp0(int i, g1 g1Var) {
        super(true, i, n(g1Var));
    }

    public static byte[] n(g1 g1Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != g1Var.c(); i++) {
            try {
                byteArrayOutputStream.write(((m1) g1Var.b(i)).e("BER"));
            } catch (IOException e2) {
                throw new ASN1ParsingException("malformed object: " + e2, e2);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.oplus.aiunit.vision.b1, com.oplus.aiunit.vision.r1
    public void g(q1 q1Var) throws IOException {
        q1Var.k(this.i ? 96 : 64, this.f9546j);
        q1Var.c(128);
        q1Var.d(this.k);
        q1Var.c(0);
        q1Var.c(0);
    }
}
