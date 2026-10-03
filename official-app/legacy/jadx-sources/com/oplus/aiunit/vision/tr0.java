package com.oplus.aiunit.vision;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes11.dex */
public final class tr0 implements Runnable, hoe {
    public final yde i = new yde();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sr6 f17124j;
    public volatile boolean k;

    public tr0(sr6 sr6Var) {
        this.f17124j = sr6Var;
    }

    @Override // com.oplus.aiunit.vision.hoe
    public void a(d3j d3jVar, Object obj) {
        xde xdeVarA = xde.a(d3jVar, obj);
        synchronized (this) {
            this.i.a(xdeVarA);
            if (!this.k) {
                this.k = true;
                this.f17124j.d().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    xde xdeVarC = this.i.c(1000);
                    if (xdeVarC == null) {
                        synchronized (this) {
                            xdeVarC = this.i.b();
                            if (xdeVarC == null) {
                                this.k = false;
                                this.k = false;
                                return;
                            }
                        }
                    }
                    this.f17124j.g(xdeVarC);
                } catch (InterruptedException e2) {
                    this.f17124j.e().b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e2);
                    this.k = false;
                    return;
                }
            } catch (Throwable th) {
                this.k = false;
                throw th;
            }
        }
    }
}
