package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class c2n extends a2n implements Thread.UncaughtExceptionHandler {
    public static ExecutorService m;
    public static WeakReference<Context> o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f9930l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Set<Integer> f9929n = Collections.synchronizedSet(new HashSet());
    public static final ThreadFactory p = new b();

    public class a extends u4n {
        public final /* synthetic */ v0n i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f9931j;

        public a(v0n v0nVar, boolean z) {
            this.i = v0nVar;
            this.f9931j = z;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            try {
                synchronized (Looper.getMainLooper()) {
                    b2n.e(this.i);
                }
                if (this.f9931j) {
                    d2n.e(c2n.this.f9930l);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class b implements ThreadFactory {
        public final AtomicInteger i = new AtomicInteger(1);

        public class a extends Thread {
            public a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                try {
                    super.run();
                } catch (Throwable unused) {
                }
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new a(runnable, "pama#" + this.i.getAndIncrement());
        }
    }

    public c2n(Context context) {
        this.f9930l = context;
        try {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            this.i = defaultUncaughtExceptionHandler;
            if (defaultUncaughtExceptionHandler == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f9169j = true;
                return;
            }
            String string = defaultUncaughtExceptionHandler.toString();
            if (!string.startsWith("com.amap.apis.utils.core.dynamiccore") && (string.indexOf("com.amap.api") != -1 || string.indexOf("com.loc") != -1)) {
                this.f9169j = false;
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f9169j = true;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static synchronized c2n g(Context context, v0n v0nVar) throws com.amap.api.col.p0003sl.ik {
        try {
            if (v0nVar == null) {
                throw new com.amap.api.col.p0003sl.ik("sdk info is null");
            }
            if (v0nVar.a() == null || "".equals(v0nVar.a())) {
                throw new com.amap.api.col.p0003sl.ik("sdk name is invalid");
            }
            try {
                if (!f9929n.add(Integer.valueOf(v0nVar.hashCode()))) {
                    return (c2n) a2n.k;
                }
                a2n a2nVar = a2n.k;
                if (a2nVar == null) {
                    a2n.k = new c2n(context);
                } else {
                    a2nVar.f9169j = false;
                }
                a2n a2nVar2 = a2n.k;
                a2nVar2.c(v0nVar, a2nVar2.f9169j);
                return (c2n) a2n.k;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void h(Context context) {
        if (context == null) {
            return;
        }
        try {
            o = new WeakReference<>(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    public static void i(Context context, v0n v0nVar, String str, String str2, String str3) {
        d2n.g(context, v0nVar, str, 0, str2, str3);
    }

    public static void j(v0n v0nVar, String str, com.amap.api.col.p0003sl.ik ikVar) {
        if (ikVar != null) {
            l(v0nVar, str, ikVar.c(), ikVar.d(), ikVar.e(), ikVar.b());
        }
    }

    public static void k(v0n v0nVar, String str, String str2, String str3, String str4) {
        l(v0nVar, str, str2, str3, "", str4);
    }

    public static void l(v0n v0nVar, String str, String str2, String str3, String str4, String str5) {
        try {
            if (a2n.k != null) {
                a2n.k.b(v0nVar, "path:" + str + ",type:" + str2 + ",gsid:" + str3 + ",csid:" + str4 + ",code:" + str5, "networkError");
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void m() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            ExecutorService executorService = m;
            if (executorService != null) {
                executorService.shutdown();
            }
            f3n.i();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            if (a2n.k != null) {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                a2n a2nVar = a2n.k;
                if (defaultUncaughtExceptionHandler == a2nVar && (uncaughtExceptionHandler = a2nVar.i) != null) {
                    Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
            }
            a2n.k = null;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void n(Context context, v0n v0nVar, String str, String str2, String str3) {
        d2n.g(context, v0nVar, str, 1, str2, str3);
    }

    public static void o(v0n v0nVar, String str, String str2) {
        try {
            a2n a2nVar = a2n.k;
            if (a2nVar != null) {
                a2nVar.b(v0nVar, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void q() {
        WeakReference<Context> weakReference = o;
        if (weakReference != null && weakReference.get() != null) {
            b2n.c(o.get());
            return;
        }
        a2n a2nVar = a2n.k;
        if (a2nVar != null) {
            a2nVar.a();
        }
    }

    public static void r(Throwable th, String str, String str2) {
        try {
            a2n a2nVar = a2n.k;
            if (a2nVar != null) {
                a2nVar.d(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public static synchronized ExecutorService s() {
        try {
            ExecutorService executorService = m;
            if (executorService == null || executorService.isShutdown()) {
                m = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), p);
            }
        } catch (Throwable unused) {
        }
        return m;
    }

    public static synchronized c2n t() {
        return (c2n) a2n.k;
    }

    @Override // com.oplus.aiunit.vision.a2n
    public final void a() {
        b2n.c(this.f9930l);
    }

    @Override // com.oplus.aiunit.vision.a2n
    public final void b(v0n v0nVar, String str, String str2) {
        d2n.l(v0nVar, this.f9930l, str2, str);
    }

    @Override // com.oplus.aiunit.vision.a2n
    public final void c(v0n v0nVar, boolean z) {
        try {
            com.amap.api.col.p0003sl.q0.h().b(new a(v0nVar, z));
        } catch (RejectedExecutionException unused) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.a2n
    public final void d(Throwable th, int i, String str, String str2) {
        d2n.k(this.f9930l, th, i, str, str2);
    }

    public final void p(Throwable th, String str, String str2) {
        if (th == null) {
            return;
        }
        try {
            d(th, 1, str, str2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        d(th, 0, null, null);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.i;
        if (uncaughtExceptionHandler != null) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            } catch (Throwable unused) {
            }
            this.i.uncaughtException(thread, th);
        }
    }
}
