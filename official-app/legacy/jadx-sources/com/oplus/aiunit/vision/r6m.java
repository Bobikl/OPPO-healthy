package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class r6m extends pi0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o6m f16092j;
    public final byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f16093l;

    public static class b {
        public final o6m a;
        public byte[] b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f16094c = null;
        public byte[] d = null;

        public b(o6m o6mVar) {
            this.a = o6mVar;
        }

        public r6m e() {
            return new r6m(this);
        }

        public b f(byte[] bArr) {
            this.f16094c = x6m.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.b = x6m.c(bArr);
            return this;
        }
    }

    public o6m b() {
        return this.f16092j;
    }

    public byte[] c() {
        return x6m.c(this.f16093l);
    }

    public byte[] d() {
        return x6m.c(this.k);
    }

    public byte[] e() {
        int iB = this.f16092j.b();
        byte[] bArr = new byte[iB + iB];
        x6m.e(bArr, this.k, 0);
        x6m.e(bArr, this.f16093l, iB + 0);
        return bArr;
    }

    public r6m(b bVar) {
        super(false);
        o6m o6mVar = bVar.a;
        this.f16092j = o6mVar;
        if (o6mVar == null) {
            throw new NullPointerException("params == null");
        }
        int iB = o6mVar.b();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length != iB + iB) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.k = x6m.g(bArr, 0, iB);
            this.f16093l = x6m.g(bArr, iB + 0, iB);
            return;
        }
        byte[] bArr2 = bVar.b;
        if (bArr2 == null) {
            this.k = new byte[iB];
        } else {
            if (bArr2.length != iB) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.k = bArr2;
        }
        byte[] bArr3 = bVar.f16094c;
        if (bArr3 == null) {
            this.f16093l = new byte[iB];
        } else {
            if (bArr3.length != iB) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f16093l = bArr3;
        }
    }
}
