package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class n7 extends r7 {
    public Context a;
    public final int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14371c = 0;
    public final int d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile AtomicInteger f14372e = new AtomicInteger(-1);
    public volatile AtomicInteger f = new AtomicInteger(0);
    public final ReentrantLock g;
    public final Condition h;
    public cj i;

    public n7(Context context, cj cjVar) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.g = reentrantLock;
        this.h = reentrantLock.newCondition();
        this.a = context;
        this.i = cjVar;
    }

    public final void a(Request request) {
        StringBuilder sb;
        try {
            mb.b("AcIntercept.Init", Thread.currentThread() + "Request before lock reqUrl:" + request.getUrl());
            this.g.lock();
            mb.b("AcIntercept.Init", Thread.currentThread() + "Request locked, initStatus:" + this.f14372e.get() + ", reqUrl:" + request.getUrl());
            this.f.incrementAndGet();
            while (this.f14372e.get() == 0) {
                mb.b("AcIntercept.Init", Thread.currentThread() + "Request goto wait, initStatus:" + this.f14372e.get() + ", block num:" + this.f.get() + ", reqUrl:" + request.getUrl());
                this.h.await(20L, TimeUnit.SECONDS);
            }
            sb = new StringBuilder();
        } catch (Exception e2) {
            mb.a("AcIntercept.Init", "block error:" + e2.getMessage());
            sb = new StringBuilder();
        } finally {
            mb.b("AcIntercept.Init", Thread.currentThread() + "Request goto unlock reqUrl:" + request.getUrl());
            this.g.unlock();
        }
        sb.append(Thread.currentThread());
        sb.append("Request goto unlock reqUrl:");
        sb.append(request.getUrl());
        String string = sb.toString();
    }

    public final void b(int i) {
        StringBuilder sb;
        try {
            mb.b("AcIntercept.Init", Thread.currentThread() + "to wakeup Request before get lock");
            this.g.lock();
            this.f14372e.set(i);
            mb.b("AcIntercept.Init", Thread.currentThread() + "wakeup Request locked to signal all, initStatus:" + this.f14372e.get());
            this.h.signalAll();
            this.f.set(0);
            sb = new StringBuilder();
        } catch (Exception e2) {
            mb.a("AcIntercept.Init", "wakeup error:" + e2.getMessage());
            sb = new StringBuilder();
        } finally {
            mb.b("AcIntercept.Init", Thread.currentThread() + "wakeup Request goto unlock, block num:" + this.f);
            this.g.unlock();
        }
        sb.append(Thread.currentThread());
        sb.append("wakeup Request goto unlock, block num:");
        sb.append(this.f);
        String string = sb.toString();
    }

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request request = aVar.request();
        if (isIgnoreIntercept(request)) {
            mb.b("AcIntercept.Init", "ignore intercept!");
            return aVar.c(request);
        }
        mb.b("AcIntercept.Init", Thread.currentThread() + "go init interceptor");
        if (!this.f14372e.compareAndSet(-1, 0)) {
            a(request);
            mb.b("AcIntercept.Init", Thread.currentThread() + " other request, after await, wait size:" + this.f.get() + ", isGetHostConfigSuccess:" + this.f14372e.get());
            return aVar.c(request);
        }
        mb.b("AcIntercept.Init", Thread.currentThread() + ", isGetHostConfigRequesting:" + this.f14372e.get());
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(request.getUrl().getScheme());
        sb.append(request.getUrl().getHost());
        b(i9.c().b(this.a, sb.toString(), this.i) ? 1 : -1);
        mb.b("AcIntercept.Init", Thread.currentThread() + ", isGetHostConfigSuccess:" + this.f14372e.get());
        return aVar.c(request);
    }
}
