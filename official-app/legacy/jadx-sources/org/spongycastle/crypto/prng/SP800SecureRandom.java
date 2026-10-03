package org.spongycastle.crypto.prng;

import com.oplus.aiunit.vision.no6;
import com.oplus.aiunit.vision.po6;
import com.oplus.aiunit.vision.qo4;
import com.oplus.aiunit.vision.w8g;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes11.dex */
public class SP800SecureRandom extends SecureRandom {
    private w8g drbg;
    private final qo4 drbgProvider;
    private final no6 entropySource;
    private final boolean predictionResistant;
    private final SecureRandom randomSource;

    public SP800SecureRandom(SecureRandom secureRandom, no6 no6Var, qo4 qo4Var, boolean z) {
        this.randomSource = secureRandom;
        this.entropySource = no6Var;
        this.drbgProvider = qo4Var;
        this.predictionResistant = z;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        return po6.a(this.entropySource, i);
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.drbg == null) {
                this.drbg = this.drbgProvider.a(this.entropySource);
            }
            if (this.drbg.a(bArr, null, this.predictionResistant) < 0) {
                this.drbg.b(null);
                this.drbg.a(bArr, null, this.predictionResistant);
            }
        }
    }

    public void reseed(byte[] bArr) {
        synchronized (this) {
            if (this.drbg == null) {
                this.drbg = this.drbgProvider.a(this.entropySource);
            }
            this.drbg.b(bArr);
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.randomSource;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j2) {
        synchronized (this) {
            SecureRandom secureRandom = this.randomSource;
            if (secureRandom != null) {
                secureRandom.setSeed(j2);
            }
        }
    }
}
