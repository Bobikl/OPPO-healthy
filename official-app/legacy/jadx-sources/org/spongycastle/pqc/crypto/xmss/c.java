package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.h2e;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20768e;
    public final int f;
    public final int g;

    public static class b extends e.a<b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20769e;
        public int f;
        public int g;

        public b() {
            super(0);
            this.f20769e = 0;
            this.f = 0;
            this.g = 0;
        }

        public e l() {
            return new c(this);
        }

        @Override // org.spongycastle.pqc.crypto.xmss.e.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        public b n(int i) {
            this.f = i;
            return this;
        }

        public b o(int i) {
            this.g = i;
            return this;
        }

        public b p(int i) {
            this.f20769e = i;
            return this;
        }
    }

    @Override // org.spongycastle.pqc.crypto.xmss.e
    public byte[] d() {
        byte[] bArrD = super.d();
        h2e.c(this.f20768e, bArrD, 16);
        h2e.c(this.f, bArrD, 20);
        h2e.c(this.g, bArrD, 24);
        return bArrD;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.f20768e;
    }

    public c(b bVar) {
        super(bVar);
        this.f20768e = bVar.f20769e;
        this.f = bVar.f;
        this.g = bVar.g;
    }
}
