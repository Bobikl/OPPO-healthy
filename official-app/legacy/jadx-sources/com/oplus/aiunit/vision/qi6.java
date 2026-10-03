package com.oplus.aiunit.vision;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes11.dex */
public class qi6 implements AlgorithmParameterSpec {
    public BigInteger a;
    public BigInteger b;

    public qi6(BigInteger bigInteger, BigInteger bigInteger2) {
        this.a = bigInteger;
        this.b = bigInteger2;
    }

    public BigInteger a() {
        return this.b;
    }

    public BigInteger b() {
        return this.a;
    }
}
