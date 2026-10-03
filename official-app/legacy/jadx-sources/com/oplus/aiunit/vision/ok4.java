package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class ok4 {
    public byte[] a;
    public int b;

    public ok4(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ok4)) {
            return false;
        }
        ok4 ok4Var = (ok4) obj;
        if (ok4Var.b != this.b) {
            return false;
        }
        return eh0.a(this.a, ok4Var.a);
    }

    public int hashCode() {
        return eh0.p(this.a) ^ this.b;
    }
}
