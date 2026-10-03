package org.spongycastle.util.test;

import com.oplus.aiunit.vision.v79;

/* JADX INFO: loaded from: classes11.dex */
public class TestRandomData extends FixedSecureRandom {
    public TestRandomData(String str) {
        super(new FixedSecureRandom.c[]{new FixedSecureRandom.b(v79.a(str))});
    }

    public TestRandomData(byte[] bArr) {
        super(new FixedSecureRandom.c[]{new FixedSecureRandom.b(bArr)});
    }
}
