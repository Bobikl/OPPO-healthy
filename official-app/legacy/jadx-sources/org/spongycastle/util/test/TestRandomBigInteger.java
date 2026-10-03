package org.spongycastle.util.test;

import com.oplus.aiunit.vision.td1;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes11.dex */
public class TestRandomBigInteger extends FixedSecureRandom {
    public TestRandomBigInteger(String str) {
        this(str, 10);
    }

    public TestRandomBigInteger(String str, int i) {
        super(new FixedSecureRandom.c[]{new FixedSecureRandom.a(td1.b(new BigInteger(str, i)))});
    }

    public TestRandomBigInteger(byte[] bArr) {
        super(new FixedSecureRandom.c[]{new FixedSecureRandom.a(bArr)});
    }

    public TestRandomBigInteger(int i, byte[] bArr) {
        super(new FixedSecureRandom.c[]{new FixedSecureRandom.a(i, bArr)});
    }
}
