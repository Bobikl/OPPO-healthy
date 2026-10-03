package com.oplus.aiunit.vision;

import java.io.IOException;
import org.spongycastle.asn1.ASN1ParsingException;

/* JADX INFO: loaded from: classes11.dex */
public class vp0 implements f1, x5a {
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17946j;
    public w1 k;

    public vp0(boolean z, int i, w1 w1Var) {
        this.i = z;
        this.f17946j = i;
        this.k = w1Var;
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() throws IOException {
        return this.k.c(this.i, this.f17946j);
    }

    @Override // com.oplus.aiunit.vision.f1
    public r1 c() {
        try {
            return a();
        } catch (IOException e2) {
            throw new ASN1ParsingException(e2.getMessage());
        }
    }
}
