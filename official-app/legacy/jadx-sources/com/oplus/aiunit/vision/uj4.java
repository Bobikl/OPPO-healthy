package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class uj4 implements p1 {
    public z75 i;

    public uj4(z75 z75Var) {
        this.i = z75Var;
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() throws IOException {
        return new tj4(this.i.h());
    }

    @Override // com.oplus.aiunit.vision.p1
    public InputStream b() {
        return this.i;
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
