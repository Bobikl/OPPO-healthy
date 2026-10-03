package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.h2e;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20764e;
    public final int f;
    public final int g;

    public static class b extends e.a<b> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f20765e;
        public int f;

        public b() {
            super(2);
            this.f20765e = 0;
            this.f = 0;
        }

        public e k() {
            return new a(this);
        }

        @Override // org.spongycastle.pqc.crypto.xmss.e.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this;
        }

        public b m(int i) {
            this.f20765e = i;
            return this;
        }

        public b n(int i) {
            this.f = i;
            return this;
        }
    }

    @Override // org.spongycastle.pqc.crypto.xmss.e
    public byte[] d() {
        byte[] bArrD = super.d();
        h2e.c(this.f20764e, bArrD, 16);
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

    public a(b bVar) {
        super(bVar);
        this.f20764e = 0;
        this.f = bVar.f20765e;
        this.g = bVar.f;
    }
}
