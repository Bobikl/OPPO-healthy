package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public class vj4 extends q1 {
    public vj4(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.oplus.aiunit.vision.q1
    public q1 a() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.q1
    public q1 b() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.q1
    public void j(f1 f1Var) throws IOException {
        if (f1Var == null) {
            throw new IOException("null object detected");
        }
        f1Var.c().k().g(this);
    }
}
