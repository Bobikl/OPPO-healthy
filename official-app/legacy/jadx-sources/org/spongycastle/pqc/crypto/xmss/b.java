package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.h2e;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20766e;
    public final int f;
    public final int g;

    /* JADX INFO: renamed from: org.spongycastle.pqc.crypto.xmss.b$b, reason: collision with other inner class name */
    public static class C1051b extends e.a<C1051b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20767e;
        public int f;
        public int g;

        public C1051b() {
            super(1);
            this.f20767e = 0;
            this.f = 0;
            this.g = 0;
        }

        public e l() {
            return new b(this);
        }

        @Override // org.spongycastle.pqc.crypto.xmss.e.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C1051b e() {
            return this;
        }

        public C1051b n(int i) {
            this.f20767e = i;
            return this;
        }

        public C1051b o(int i) {
            this.f = i;
            return this;
        }

        public C1051b p(int i) {
            this.g = i;
            return this;
        }
    }

    @Override // org.spongycastle.pqc.crypto.xmss.e
    public byte[] d() {
        byte[] bArrD = super.d();
        h2e.c(this.f20766e, bArrD, 16);
        h2e.c(this.f, bArrD, 20);
        h2e.c(this.g, bArrD, 24);
        return bArrD;
    }

    public int e() {
        return this.f20766e;
    }

    public int f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public b(C1051b c1051b) {
        super(c1051b);
        this.f20766e = c1051b.f20767e;
        this.f = c1051b.f;
        this.g = c1051b.g;
    }
}
