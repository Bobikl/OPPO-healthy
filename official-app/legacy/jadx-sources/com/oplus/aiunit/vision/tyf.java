package com.oplus.aiunit.vision;

import com.heytap.epona.Request;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes15.dex */
public class tyf {
    public final int a = 64;
    public ExecutorService b = e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayDeque<ccf.b> f17203c = new ArrayDeque<>();
    public ArrayDeque<ccf.b> d = new ArrayDeque<>();

    public static /* synthetic */ Thread h(String str, Boolean bool, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(bool.booleanValue());
        return thread;
    }

    public synchronized void b(ccf.b bVar) {
        if (this.d.size() < 64) {
            this.d.add(bVar);
            this.b.execute(bVar);
        } else {
            this.f17203c.add(bVar);
        }
    }

    public final ThreadFactory c(final String str, final Boolean bool) {
        return new ThreadFactory() { // from class: com.oplus.aiunit.vision.qyf
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return tyf.h(str, bool, runnable);
            }
        };
    }

    public void d(ccf ccfVar) {
    }

    public final synchronized ExecutorService e() {
        if (this.b == null) {
            this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), c("Epona Route", Boolean.FALSE));
        }
        return this.b;
    }

    public void f(ccf.b bVar, boolean z) {
        synchronized (this) {
            this.d.remove(bVar);
            if (!z) {
                this.f17203c.add(bVar);
            }
        }
        j();
    }

    public void g(ccf ccfVar) {
    }

    public ccf i(Request request) {
        return ccf.e(this, request);
    }

    public final synchronized void j() {
        if (this.d.size() >= 64) {
            return;
        }
        if (this.f17203c.isEmpty()) {
            return;
        }
        for (ccf.b bVar : this.f17203c) {
            this.d.add(bVar);
            this.b.execute(bVar);
            this.f17203c.remove(bVar);
            if (this.d.size() >= 64) {
                return;
            }
        }
    }
}
