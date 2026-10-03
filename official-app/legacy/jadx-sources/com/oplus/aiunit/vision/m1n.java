package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public final class m1n extends m4n {
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13921c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13922e;
    public int f;
    public long g;

    public m1n(boolean z, m4n m4nVar, long j2, int i) {
        super(m4nVar);
        this.f13922e = false;
        this.d = z;
        this.b = 600000;
        this.g = j2;
        this.f = i;
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final int a() {
        return 320000;
    }

    @Override // com.oplus.aiunit.vision.m4n
    public final boolean d() {
        if (this.f13922e && this.g <= this.f) {
            return true;
        }
        if (!this.d || this.g >= this.f) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f13921c < this.b) {
            return false;
        }
        this.f13921c = jCurrentTimeMillis;
        return true;
    }

    public final void f(int i) {
        if (i <= 0) {
            return;
        }
        this.g += (long) i;
    }

    public final void g(boolean z) {
        this.f13922e = z;
    }

    public final long h() {
        return this.g;
    }
}
