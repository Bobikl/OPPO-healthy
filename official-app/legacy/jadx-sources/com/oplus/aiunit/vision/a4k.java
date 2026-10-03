package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a4k {
    public volatile int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f9193j;
    public vxm k;

    public a4k() {
        this(gmm.a, true, vxm.a);
    }

    public void a(int i) {
        this.i = i;
    }

    public void b(int i, Thread thread, long j2, String str, String str2, Throwable th) {
        if (e() && tpm.a.a(this.i, i)) {
            f(i, thread, j2, str, str2, th);
        }
    }

    public void c(vxm vxmVar) {
        this.k = vxmVar;
    }

    public void d(boolean z) {
        this.f9193j = z;
    }

    public boolean e() {
        return this.f9193j;
    }

    public abstract void f(int i, Thread thread, long j2, String str, String str2, Throwable th);

    public vxm g() {
        return this.k;
    }

    public a4k(int i, boolean z, vxm vxmVar) {
        this.i = gmm.a;
        this.f9193j = true;
        this.k = vxm.a;
        a(i);
        d(z);
        c(vxmVar);
    }
}
