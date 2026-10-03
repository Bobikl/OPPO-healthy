package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class ak4 implements v1 {
    public w1 i;

    public ak4(w1 w1Var) {
        this.i = w1Var;
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() throws IOException {
        return new zj4(this.i.d(), false);
    }

    @Override // com.oplus.aiunit.vision.f1
    public r1 c() {
        try {
            return a();
        } catch (IOException e2) {
            throw new ASN1ParsingException(e2.getMessage(), e2);
        }
    }
}
