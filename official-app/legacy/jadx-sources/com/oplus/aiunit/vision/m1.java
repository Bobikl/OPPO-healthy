package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m1 implements f1 {
    @Override // com.oplus.aiunit.vision.f1
    public abstract r1 c();

    public byte[] d() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new q1(byteArrayOutputStream).j(this);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] e(String str) throws IOException {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new vj4(byteArrayOutputStream).j(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (!str.equals("DL")) {
            return d();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        new rk4(byteArrayOutputStream2).j(this);
        return byteArrayOutputStream2.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f1) {
            return c().equals(((f1) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return c().hashCode();
    }
}
