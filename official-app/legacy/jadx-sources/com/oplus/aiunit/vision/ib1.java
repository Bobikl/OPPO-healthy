package com.oplus.aiunit.vision;

import java.security.SecureRandom;
import org.spongycastle.crypto.prng.SP800SecureRandom;
import org.spongycastle.crypto.prng.X931SecureRandom;

/* JADX INFO: loaded from: classes11.dex */
public class ib1 implements oo6 {
    public final SecureRandom a;
    public final boolean b;

    public class a implements no6 {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.oplus.aiunit.vision.no6
        public byte[] a() {
            if (!(ib1.this.a instanceof SP800SecureRandom) && !(ib1.this.a instanceof X931SecureRandom)) {
                return ib1.this.a.generateSeed((this.a + 7) / 8);
            }
            byte[] bArr = new byte[(this.a + 7) / 8];
            ib1.this.a.nextBytes(bArr);
            return bArr;
        }

        @Override // com.oplus.aiunit.vision.no6
        public int b() {
            return this.a;
        }
    }

    public ib1(SecureRandom secureRandom, boolean z) {
        this.a = secureRandom;
        this.b = z;
    }

    @Override // com.oplus.aiunit.vision.oo6
    public no6 get(int i) {
        return new a(i);
    }
}
