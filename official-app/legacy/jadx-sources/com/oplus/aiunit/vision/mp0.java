package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class mp0 implements f1, x5a {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w1 f14147j;

    public mp0(int i, w1 w1Var) {
        this.i = i;
        this.f14147j = w1Var;
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() throws IOException {
        return new lp0(this.i, this.f14147j.d());
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
