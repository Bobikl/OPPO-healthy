package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class lj extends r7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile AtomicInteger f13716c = new AtomicInteger(-1);
    public static volatile AtomicInteger d = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f13717e;
    public static final Condition f;
    public Context a;
    public s7 b;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f13717e = reentrantLock;
        f = reentrantLock.newCondition();
    }

    public lj(Context context, s7 s7Var) {
        this.a = context;
        this.b = s7Var;
    }

    public final void a(Request request) {
        try {
            f13717e.lock();
            mb.b("AcIntercept.Init", Thread.currentThread() + "Request locked, initStatus:" + f13716c.get());
            d.incrementAndGet();
            while (f13716c.get() == 0) {
                mb.b("AcIntercept.Init", Thread.currentThread() + "Request goto wait, initStatus:" + f13716c.get() + ", block num:" + d.get());
                f.await(20L, TimeUnit.SECONDS);
            }
        } catch (Exception e2) {
            mb.a("AcIntercept.Init", "block error:" + e2.getMessage());
        } finally {
            f13717e.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        String str = "wakeup Request goto unlock, block num:";
        try {
            try {
                mb.b("AcIntercept.Init", Thread.currentThread() + "to wakeup Request before get lock");
                ReentrantLock reentrantLock = f13717e;
                reentrantLock.lock();
                f13716c.set(i);
                mb.b("AcIntercept.Init", Thread.currentThread() + "wakeup Request locked to signal all, initStatus:" + f13716c.get());
                f.signalAll();
                d.set(0);
                String str2 = Thread.currentThread() + "wakeup Request goto unlock, block num:" + d;
                mb.b("AcIntercept.Init", str2);
                reentrantLock.unlock();
                str = str2;
            } catch (Exception e2) {
                mb.a("AcIntercept.Init", "wakeup error:" + e2.getMessage());
                mb.b("AcIntercept.Init", Thread.currentThread() + "wakeup Request goto unlock, block num:" + d);
                ReentrantLock reentrantLock2 = f13717e;
                reentrantLock2.unlock();
                str = reentrantLock2;
            }
        } catch (Throwable th) {
            mb.b("AcIntercept.Init", Thread.currentThread() + str + d);
            f13717e.unlock();
            throw th;
        }
    }

    @Override // com.oplus.aiunit.vision.jea
    public ytf intercept(jea.a aVar) throws IOException {
        Request request = aVar.request();
        if (isIgnoreIntercept(request)) {
            mb.b("AcIntercept.Init", "ignore intercept!");
            return aVar.c(request);
        }
        mb.b("AcIntercept.Init", Thread.currentThread() + "go init interceptor");
        if (!f13716c.compareAndSet(-1, 0)) {
            a(request);
            mb.b("AcIntercept.Init", Thread.currentThread() + " other request, after await, wait size:" + d.get() + ", isGetHostConfigSuccess:" + f13716c.get());
            return aVar.c(request);
        }
        mb.b("AcIntercept.Init", Thread.currentThread() + ", isGetHostConfigRequesting:" + f13716c.get());
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(request.getUrl().getScheme());
        sb.append(request.getUrl().getHost());
        b(jj.c().b(this.a, sb.toString(), this.b) ? 1 : -1);
        mb.b("AcIntercept.Init", Thread.currentThread() + ", isGetHostConfigSuccess:" + f13716c.get());
        return aVar.c(request);
    }
}
