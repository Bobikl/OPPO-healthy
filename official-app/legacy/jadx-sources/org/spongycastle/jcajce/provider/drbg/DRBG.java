package org.spongycastle.jcajce.provider.drbg;

import com.oplus.aiunit.vision.d6g;
import com.oplus.aiunit.vision.eh0;
import com.oplus.aiunit.vision.h2e;
import com.oplus.aiunit.vision.mc3;
import com.oplus.aiunit.vision.no6;
import com.oplus.aiunit.vision.oo6;
import com.oplus.aiunit.vision.qe8;
import com.oplus.aiunit.vision.x8g;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.crypto.prng.SP800SecureRandom;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class DRBG {
    public static final String[][] a = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    public static final Object[] b = g();

    public static class CoreSecureRandom extends SecureRandom {
        public CoreSecureRandom() {
            super((SecureRandomSpi) DRBG.b[1], (Provider) DRBG.b[0]);
        }
    }

    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.d(true);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.d(false);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class a implements PrivilegedAction<oo6> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public oo6 run() {
            try {
                return (oo6) mc3.a(DRBG.class, this.a).newInstance();
            } catch (Exception e2) {
                throw new IllegalStateException("entropy source " + this.a + " not created: " + e2.getMessage(), e2);
            }
        }
    }

    public static SecureRandom d(boolean z) {
        if (System.getProperty("org.spongycastle.drbg.entropysource") == null) {
            HybridSecureRandom hybridSecureRandom = new HybridSecureRandom();
            return new x8g(hybridSecureRandom, true).c(z ? h(hybridSecureRandom.generateSeed(16)) : i(hybridSecureRandom.generateSeed(16))).b(new d6g(), hybridSecureRandom.generateSeed(32), z);
        }
        oo6 oo6VarE = e();
        no6 no6Var = oo6VarE.get(128);
        return new x8g(oo6VarE).c(z ? h(no6Var.a()) : i(no6Var.a())).b(new d6g(), eh0.j(no6Var.a(), no6Var.a()), z);
    }

    public static oo6 e() {
        return (oo6) AccessController.doPrivileged(new a(System.getProperty("org.spongycastle.drbg.entropysource")));
    }

    public static SecureRandom f() {
        return b != null ? new CoreSecureRandom() : new SecureRandom();
    }

    public static final Object[] g() {
        int i = 0;
        while (true) {
            String[][] strArr = a;
            if (i >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i++;
            }
        }
    }

    public static byte[] h(byte[] bArr) {
        return eh0.l(Strings.e("Default"), bArr, h2e.i(Thread.currentThread().getId()), h2e.i(System.currentTimeMillis()));
    }

    public static byte[] i(byte[] bArr) {
        return eh0.l(Strings.e("Nonce"), bArr, h2e.l(Thread.currentThread().getId()), h2e.l(System.currentTimeMillis()));
    }

    public static class HybridSecureRandom extends SecureRandom {
        private final SecureRandom baseRandom;
        private final SP800SecureRandom drbg;
        private final AtomicInteger samples;
        private final AtomicBoolean seedAvailable;

        public class a implements oo6 {
            public a() {
            }

            @Override // com.oplus.aiunit.vision.oo6
            public no6 get(int i) {
                return HybridSecureRandom.this.new b(i);
            }
        }

        public class b implements no6 {
            public final int a;
            public final AtomicReference b = new AtomicReference();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AtomicBoolean f20761c = new AtomicBoolean(false);

            public class a implements Runnable {
                public final int i;

                public a(int i) {
                    this.i = i;
                }

                @Override // java.lang.Runnable
                public void run() {
                    b.this.b.set(HybridSecureRandom.this.baseRandom.generateSeed(this.i));
                    HybridSecureRandom.this.seedAvailable.set(true);
                }
            }

            public b(int i) {
                this.a = (i + 7) / 8;
            }

            @Override // com.oplus.aiunit.vision.no6
            public byte[] a() {
                byte[] bArrGenerateSeed = (byte[]) this.b.getAndSet(null);
                if (bArrGenerateSeed == null || bArrGenerateSeed.length != this.a) {
                    bArrGenerateSeed = HybridSecureRandom.this.baseRandom.generateSeed(this.a);
                } else {
                    this.f20761c.set(false);
                }
                if (!this.f20761c.getAndSet(true)) {
                    new Thread(new a(this.a)).start();
                }
                return bArrGenerateSeed;
            }

            @Override // com.oplus.aiunit.vision.no6
            public int b() {
                return this.a * 8;
            }
        }

        public HybridSecureRandom() {
            super(null, null);
            this.seedAvailable = new AtomicBoolean(false);
            this.samples = new AtomicInteger(0);
            SecureRandom secureRandomF = DRBG.f();
            this.baseRandom = secureRandomF;
            this.drbg = new x8g(new a()).c(Strings.e("Bouncy Castle Hybrid Entropy Source")).a(new qe8(new d6g()), secureRandomF.generateSeed(32), false);
        }

        @Override // java.security.SecureRandom
        public byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.samples.getAndIncrement() > 20 && this.seedAvailable.getAndSet(false)) {
                this.samples.set(0);
                this.drbg.reseed(null);
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // java.security.SecureRandom
        public void setSeed(byte[] bArr) {
            SP800SecureRandom sP800SecureRandom = this.drbg;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(bArr);
            }
        }

        @Override // java.security.SecureRandom, java.util.Random
        public void setSeed(long j2) {
            SP800SecureRandom sP800SecureRandom = this.drbg;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(j2);
            }
        }
    }
}
