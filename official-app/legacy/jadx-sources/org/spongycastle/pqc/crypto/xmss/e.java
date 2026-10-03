package org.spongycastle.pqc.crypto.xmss;

import com.oplus.aiunit.vision.h2e;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e {
    public final int a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20771c;
    public final int d;

    public static abstract class a<T extends a> {
        public final int a;
        public int b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f20772c = 0;
        public int d = 0;

        public a(int i) {
            this.a = i;
        }

        public abstract T e();

        public T f(int i) {
            this.d = i;
            return (T) e();
        }

        public T g(int i) {
            this.b = i;
            return (T) e();
        }

        public T h(long j2) {
            this.f20772c = j2;
            return (T) e();
        }
    }

    public e(a aVar) {
        this.a = aVar.b;
        this.b = aVar.f20772c;
        this.f20771c = aVar.a;
        this.d = aVar.d;
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public byte[] d() {
        byte[] bArr = new byte[32];
        h2e.c(this.a, bArr, 0);
        h2e.h(this.b, bArr, 4);
        h2e.c(this.f20771c, bArr, 12);
        h2e.c(this.d, bArr, 28);
        return bArr;
    }
}
