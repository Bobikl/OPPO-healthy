package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class w6m extends pi0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t6m f18142j;
    public final byte[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f18143l;

    public static class b {
        public final t6m a;
        public byte[] b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f18144c = null;
        public byte[] d = null;

        public b(t6m t6mVar) {
            this.a = t6mVar;
        }

        public w6m e() {
            return new w6m(this);
        }

        public b f(byte[] bArr) {
            this.f18144c = x6m.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.b = x6m.c(bArr);
            return this;
        }
    }

    public t6m b() {
        return this.f18142j;
    }

    public byte[] c() {
        return x6m.c(this.f18143l);
    }

    public byte[] d() {
        return x6m.c(this.k);
    }

    public byte[] e() {
        int iC = this.f18142j.c();
        byte[] bArr = new byte[iC + iC];
        x6m.e(bArr, this.k, 0);
        x6m.e(bArr, this.f18143l, iC + 0);
        return bArr;
    }

    public w6m(b bVar) {
        super(false);
        t6m t6mVar = bVar.a;
        this.f18142j = t6mVar;
        if (t6mVar == null) {
            throw new NullPointerException("params == null");
        }
        int iC = t6mVar.c();
        byte[] bArr = bVar.d;
        if (bArr != null) {
            if (bArr.length != iC + iC) {
                throw new IllegalArgumentException("public key has wrong size");
            }
            this.k = x6m.g(bArr, 0, iC);
            this.f18143l = x6m.g(bArr, iC + 0, iC);
            return;
        }
        byte[] bArr2 = bVar.b;
        if (bArr2 == null) {
            this.k = new byte[iC];
        } else {
            if (bArr2.length != iC) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.k = bArr2;
        }
        byte[] bArr3 = bVar.f18144c;
        if (bArr3 == null) {
            this.f18143l = new byte[iC];
        } else {
            if (bArr3.length != iC) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f18143l = bArr3;
        }
    }
}
