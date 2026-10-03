package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class pp0 implements p1 {
    public w1 i;

    public pp0(w1 w1Var) {
        this.i = w1Var;
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() throws IOException {
        return new op0(pwi.b(b()));
    }

    @Override // com.oplus.aiunit.vision.p1
    public InputStream b() {
        return new b14(this.i);
    }

    @Override // com.oplus.aiunit.vision.f1
    public r1 c() {
        try {
            return a();
        } catch (IOException e2) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e2.getMessage(), e2);
        }
    }
}
