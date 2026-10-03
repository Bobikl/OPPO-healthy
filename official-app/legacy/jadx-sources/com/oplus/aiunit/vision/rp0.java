package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public class rp0 implements t1 {
    public w1 i;

    public rp0(w1 w1Var) {
        this.i = w1Var;
    }

    @Override // com.oplus.aiunit.vision.x5a
    public r1 a() throws IOException {
        return new qp0(this.i.d());
    }

    @Override // com.oplus.aiunit.vision.f1
    public r1 c() {
        try {
            return a();
        } catch (IOException e2) {
            throw new IllegalStateException(e2.getMessage());
        }
    }
}
