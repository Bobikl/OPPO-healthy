package com.oplus.aiunit.vision;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class lue implements ig7 {
    public final BigInteger a;

    public lue(BigInteger bigInteger) {
        this.a = bigInteger;
    }

    @Override // com.oplus.aiunit.vision.ig7
    public int a() {
        return 1;
    }

    @Override // com.oplus.aiunit.vision.ig7
    public BigInteger b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lue) {
            return this.a.equals(((lue) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
