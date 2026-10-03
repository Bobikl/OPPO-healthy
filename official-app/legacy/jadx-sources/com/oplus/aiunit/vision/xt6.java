package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes8.dex */
public class xt6 implements Thread.UncaughtExceptionHandler {
    public static volatile xt6 o;
    public final nt6 i = new pt6();
    public Set<h6k> k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ExecutorService f18757l = Executors.newSingleThreadExecutor();
    public Handler m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18758n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f18756j = Thread.getDefaultUncaughtExceptionHandler();

    public class a implements Callable<Boolean> {
        public final /* synthetic */ Set i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Thread f18759j;
        public final /* synthetic */ Throwable k;

        public a(Set set, Thread thread, Throwable th) {
            this.i = set;
            this.f18759j = thread;
            this.k = th;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                arrayList.add(((h6k) it.next()).b());
            }
            com.oplus.nearx.track.internal.db.a.g().h(new jcf(arrayList).a(this.f18759j, this.k));
            if (xt6.b(xt6.this) >= 5) {
                xt6.this.f18758n = 0;
                xt6.this.i(0L);
            }
            return Boolean.TRUE;
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.oplus.nearx.track.internal.db.a.C0970a c0970aI = com.oplus.nearx.track.internal.db.a.g().i();
                while (c0970aI.hasNext()) {
                    Iterator<com.oplus.nearx.track.internal.db.ExceptionEntity> it = c0970aI.next().iterator();
                    while (it.hasNext()) {
                        xt6.this.i.a(it.next());
                    }
                    c0970aI.remove();
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xt6.this.f18757l.execute(new a());
        }
    }

    public xt6() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        i(5000L);
    }

    public static /* synthetic */ int b(xt6 xt6Var) {
        int i = xt6Var.f18758n + 1;
        xt6Var.f18758n = i;
        return i;
    }

    public static xt6 f() {
        if (o == null) {
            synchronized (xt6.class) {
                if (o == null) {
                    o = new xt6();
                }
            }
        }
        return o;
    }

    public synchronized void g(h6k h6kVar) {
        this.k.add(h6kVar);
    }

    public synchronized void h(h6k h6kVar) {
        this.k.remove(h6kVar);
    }

    public final void i(long j2) {
        this.m.postDelayed(new b(), j2);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        FutureTask futureTask = new FutureTask(new a(new HashSet(this.k), thread, th));
        this.f18757l.execute(futureTask);
        try {
            futureTask.get();
            uncaughtExceptionHandler = this.f18756j;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Exception unused) {
            if (this.f18756j == null) {
                return;
            } else {
                uncaughtExceptionHandler = this.f18756j;
            }
        } catch (Throwable th2) {
            if (this.f18756j != null) {
                this.f18756j.uncaughtException(thread, th);
            }
            throw th2;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
