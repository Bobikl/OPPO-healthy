package com.oplus.aiunit.vision;

import com.oplus.epona.Request;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ryf {
    public final int a = 64;
    public ExecutorService b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayDeque<ecf.b> f16406c = new ArrayDeque<>();
    public ArrayDeque<ecf.b> d = new ArrayDeque<>();

    public static /* synthetic */ Thread h(String str, Boolean bool, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(bool.booleanValue());
        return thread;
    }

    public synchronized void b(ecf.b bVar) {
        if (this.d.size() < 64) {
            this.d.add(bVar);
            this.b.execute(bVar);
        } else {
            this.f16406c.add(bVar);
        }
    }

    public final ThreadFactory c(final String str, final Boolean bool) {
        return new ThreadFactory() { // from class: com.oplus.aiunit.vision.pyf
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return ryf.h(str, bool, runnable);
            }
        };
    }

    public void d(ecf ecfVar) {
    }

    public final synchronized ExecutorService e() {
        if (this.b == null) {
            this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), c("Epona Route", Boolean.FALSE));
        }
        return this.b;
    }

    public void f(ecf.b bVar, boolean z) {
        synchronized (this) {
            this.d.remove(bVar);
            if (!z) {
                this.f16406c.add(bVar);
            }
        }
        j();
    }

    public void g(ecf ecfVar) {
    }

    public ecf i(Request request) {
        return ecf.e(this, request);
    }

    public final synchronized void j() {
        if (this.d.size() >= 64) {
            return;
        }
        if (this.f16406c.isEmpty()) {
            return;
        }
        for (ecf.b bVar : this.f16406c) {
            this.d.add(bVar);
            this.b.execute(bVar);
            this.f16406c.remove(bVar);
            if (this.d.size() >= 64) {
                return;
            }
        }
    }
}
