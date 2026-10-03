package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class y48 implements ene {
    public final ig7 a;
    public final dne b;

    public y48(ig7 ig7Var, dne dneVar) {
        this.a = ig7Var;
        this.b = dneVar;
    }

    @Override // com.oplus.aiunit.vision.ig7
    public int a() {
        return this.a.a() * this.b.b();
    }

    @Override // com.oplus.aiunit.vision.ig7
    public BigInteger b() {
        return this.a.b();
    }

    @Override // com.oplus.aiunit.vision.ene
    public dne c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y48)) {
            return false;
        }
        y48 y48Var = (y48) obj;
        return this.a.equals(y48Var.a) && this.b.equals(y48Var.b);
    }

    public int hashCode() {
        return kca.a(this.b.hashCode(), 16) ^ this.a.hashCode();
    }
}
