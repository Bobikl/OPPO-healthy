package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class dv7 implements Runnable {
    public final bv7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f10700j;

    public dv7(long j2, bv7 bv7Var) {
        this.f10700j = j2;
        this.i = bv7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.i.onTimeout(this.f10700j);
    }
}
