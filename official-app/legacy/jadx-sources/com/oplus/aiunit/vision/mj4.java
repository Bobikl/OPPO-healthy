package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Exception;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class mj4 implements f1, x5a {
    public w1 i;

    public mj4(w1 w1Var) {
        this.i = w1Var;
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() throws IOException {
        try {
            return new lj4(this.i.d());
        } catch (IllegalArgumentException e2) {
            throw new ASN1Exception(e2.getMessage(), e2);
        }
    }

    @Override // com.oplus.aiunit.vision.f1
    public r1 c() {
        try {
            return a();
        } catch (IOException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        } catch (IllegalArgumentException e3) {
            throw new ASN1ParsingException("unable to get DER object", e3);
        }
    }
}
