package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class bj0 implements Runnable, hoe {
    public final yde i = new yde();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sr6 f9774j;

    public bj0(sr6 sr6Var) {
        this.f9774j = sr6Var;
    }

    @Override // com.oplus.aiunit.vision.hoe
    public void a(d3j d3jVar, Object obj) {
        this.i.a(xde.a(d3jVar, obj));
        this.f9774j.d().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        xde xdeVarB = this.i.b();
        if (xdeVarB == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f9774j.g(xdeVarB);
    }
}
