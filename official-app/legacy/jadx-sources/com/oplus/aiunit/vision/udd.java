package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class udd implements Runnable {
    public final tdd i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f17428j;

    public udd(long j2, tdd tddVar) {
        this.f17428j = j2;
        this.i = tddVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.i.onTimeout(this.f17428j);
    }
}
