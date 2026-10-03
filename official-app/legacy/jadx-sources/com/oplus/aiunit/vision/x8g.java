package com.oplus.aiunit.vision;

import java.security.SecureRandom;
import org.spongycastle.crypto.prng.SP800SecureRandom;

/* JADX INFO: loaded from: classes11.dex */
public class x8g {
    public final SecureRandom a;
    public final oo6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f18533c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18534e;

    public static class a implements qo4 {
        public final edb a;
        public final byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f18535c;
        public final int d;

        public a(edb edbVar, byte[] bArr, byte[] bArr2, int i) {
            this.a = edbVar;
            this.b = bArr;
            this.f18535c = bArr2;
            this.d = i;
        }

        @Override // com.oplus.aiunit.vision.qo4
        public w8g a(no6 no6Var) {
            return new re8(this.a, this.d, no6Var, this.f18535c, this.b);
        }
    }

    public static class b implements qo4 {
        public final ns5 a;
        public final byte[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f18536c;
        public final int d;

        public b(ns5 ns5Var, byte[] bArr, byte[] bArr2, int i) {
            this.a = ns5Var;
            this.b = bArr;
            this.f18536c = bArr2;
            this.d = i;
        }

        @Override // com.oplus.aiunit.vision.qo4
        public w8g a(no6 no6Var) {
            return new oh8(this.a, this.d, no6Var, this.f18536c, this.b);
        }
    }

    public x8g(SecureRandom secureRandom, boolean z) {
        this.d = 256;
        this.f18534e = 256;
        this.a = secureRandom;
        this.b = new ib1(secureRandom, z);
    }

    public SP800SecureRandom a(edb edbVar, byte[] bArr, boolean z) {
        return new SP800SecureRandom(this.a, this.b.get(this.f18534e), new a(edbVar, bArr, this.f18533c, this.d), z);
    }

    public SP800SecureRandom b(ns5 ns5Var, byte[] bArr, boolean z) {
        return new SP800SecureRandom(this.a, this.b.get(this.f18534e), new b(ns5Var, bArr, this.f18533c, this.d), z);
    }

    public x8g c(byte[] bArr) {
        this.f18533c = bArr;
        return this;
    }

    public x8g(oo6 oo6Var) {
        this.d = 256;
        this.f18534e = 256;
        this.a = null;
        this.b = oo6Var;
    }
}
