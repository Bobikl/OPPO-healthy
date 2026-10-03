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

/* JADX INFO: loaded from: classes17.dex */
public class yt6 implements Thread.UncaughtExceptionHandler {
    public static volatile yt6 o;
    public final ot6 i = new qt6();
    public Set<i6k> k = new HashSet();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ExecutorService f19139l = Executors.newSingleThreadExecutor();
    public Handler m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19140n = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f19138j = Thread.getDefaultUncaughtExceptionHandler();

    public class a implements Callable<Boolean> {
        public final /* synthetic */ Set i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Thread f19141j;
        public final /* synthetic */ Throwable k;

        public a(Set set, Thread thread, Throwable th) {
            this.i = set;
            this.f19141j = thread;
            this.k = th;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                arrayList.add(((i6k) it.next()).b());
            }
            ut6.g().h(new kcf(arrayList).a(this.f19141j, this.k));
            if (yt6.b(yt6.this) >= 5) {
                yt6.this.f19140n = 0;
                yt6.this.h(0L);
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
                ut6.a aVarI = ut6.g().i();
                while (aVarI.hasNext()) {
                    Iterator<ExceptionEntity> it = aVarI.next().iterator();
                    while (it.hasNext()) {
                        yt6.this.i.a(it.next());
                    }
                    aVarI.remove();
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            yt6.this.f19139l.execute(new a());
        }
    }

    public yt6() {
        Thread.setDefaultUncaughtExceptionHandler(this);
        h(5000L);
    }

    public static /* synthetic */ int b(yt6 yt6Var) {
        int i = yt6Var.f19140n + 1;
        yt6Var.f19140n = i;
        return i;
    }

    public static yt6 f() {
        if (o == null) {
            synchronized (yt6.class) {
                if (o == null) {
                    o = new yt6();
                }
            }
        }
        return o;
    }

    public synchronized void g(i6k i6kVar) {
        this.k.add(i6kVar);
    }

    public final void h(long j2) {
        this.m.postDelayed(new b(), j2);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        FutureTask futureTask = new FutureTask(new a(new HashSet(this.k), thread, th));
        this.f19139l.execute(futureTask);
        try {
            futureTask.get();
            uncaughtExceptionHandler = this.f19138j;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (Exception unused) {
            if (this.f19138j == null) {
                return;
            } else {
                uncaughtExceptionHandler = this.f19138j;
            }
        } catch (Throwable th2) {
            if (this.f19138j != null) {
                this.f19138j.uncaughtException(thread, th);
            }
            throw th2;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
