package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class ev7 implements Runnable {
    public final cv7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f11089j;

    public ev7(long j2, cv7 cv7Var) {
        this.f11089j = j2;
        this.i = cv7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.i.onTimeout(this.f11089j);
    }
}
