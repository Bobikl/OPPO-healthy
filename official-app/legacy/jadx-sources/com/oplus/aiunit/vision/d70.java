package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes18.dex */
public abstract class d70<T> extends y60<T> {
    public final Object a = new Object();
    public AtomicBoolean b = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Runnable> f10407c = new ArrayList();

    public void b() {
        this.b.set(true);
        f();
    }

    public void c(Runnable runnable) {
        d(runnable);
    }

    public final void d(Runnable runnable) {
        synchronized (this.f10407c) {
            this.f10407c.add(runnable);
        }
        synchronized (this.a) {
            this.a.notify();
        }
    }

    public final void e() {
        synchronized (this.f10407c) {
            Iterator<Runnable> it = this.f10407c.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f10407c.clear();
        }
    }

    public final void f() {
        synchronized (this.a) {
            while (this.b.get()) {
                try {
                    e();
                    this.a.wait();
                } catch (InterruptedException e2) {
                    t6b.d("ApduLockJob", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
                    g();
                }
            }
        }
    }

    public void g() {
        this.b.set(false);
        synchronized (this.a) {
            this.a.notify();
        }
    }
}
