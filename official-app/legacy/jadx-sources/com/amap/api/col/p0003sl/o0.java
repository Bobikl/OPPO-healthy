package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 implements ThreadFactory {
    public static final int s;
    public static final int t;
    public static final int u;
    public final AtomicLong i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadFactory f808j;
    public final Thread.UncaughtExceptionHandler k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f809l;
    public final Integer m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Boolean f810n;
    public final int o;
    public final int p;
    public final BlockingQueue<Runnable> q;
    public final int r;

    public class a implements Runnable {
        public final /* synthetic */ Runnable i;

        public a(Runnable runnable) {
            this.i = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.i.run();
            } catch (Throwable unused) {
            }
        }
    }

    public static class b {
        public ThreadFactory a;
        public Thread.UncaughtExceptionHandler b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f812c;
        public Integer d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Boolean f813e;
        public int f = o0.t;
        public int g = o0.u;
        public int h = 30;
        public BlockingQueue<Runnable> i;

        public final b a() {
            this.f = 1;
            return this;
        }

        public final b b(int i) {
            if (this.f <= 0) {
                throw new NullPointerException("corePoolSize  must > 0!");
            }
            this.g = i;
            return this;
        }

        public final b c(String str) {
            if (str == null) {
                throw new NullPointerException("Naming pattern must not be null!");
            }
            this.f812c = str;
            return this;
        }

        public final b d(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            if (uncaughtExceptionHandler == null) {
                throw new NullPointerException("Uncaught exception handler must not be null!");
            }
            this.b = uncaughtExceptionHandler;
            return this;
        }

        public final b e(BlockingQueue<Runnable> blockingQueue) {
            this.i = blockingQueue;
            return this;
        }

        public final o0 h() {
            o0 o0Var = new o0(this, (byte) 0);
            j();
            return o0Var;
        }

        public final void j() {
            this.a = null;
            this.b = null;
            this.f812c = null;
            this.d = null;
            this.f813e = null;
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        s = iAvailableProcessors;
        t = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        u = (iAvailableProcessors * 2) + 1;
    }

    public /* synthetic */ o0(b bVar, byte b2) {
        this(bVar);
    }

    public final int a() {
        return this.o;
    }

    public final int b() {
        return this.p;
    }

    public final BlockingQueue<Runnable> c() {
        return this.q;
    }

    public final int d() {
        return this.r;
    }

    public final ThreadFactory g() {
        return this.f808j;
    }

    public final String h() {
        return this.f809l;
    }

    public final Boolean i() {
        return this.f810n;
    }

    public final Integer j() {
        return this.m;
    }

    public final Thread.UncaughtExceptionHandler k() {
        return this.k;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        new a(runnable);
        Thread threadNewThread = g().newThread(runnable);
        if (h() != null) {
            threadNewThread.setName(String.format(h() + "-%d", Long.valueOf(this.i.incrementAndGet())));
        }
        if (k() != null) {
            threadNewThread.setUncaughtExceptionHandler(k());
        }
        if (j() != null) {
            threadNewThread.setPriority(j().intValue());
        }
        if (i() != null) {
            threadNewThread.setDaemon(i().booleanValue());
        }
        return threadNewThread;
    }

    public o0(b bVar) {
        if (bVar.a == null) {
            this.f808j = Executors.defaultThreadFactory();
        } else {
            this.f808j = bVar.a;
        }
        int i = bVar.f;
        this.o = i;
        int i2 = u;
        this.p = i2;
        if (i2 < i) {
            throw new NullPointerException("maxPoolSize must > corePoolSize!");
        }
        this.r = bVar.h;
        if (bVar.i == null) {
            this.q = new LinkedBlockingQueue(256);
        } else {
            this.q = bVar.i;
        }
        if (TextUtils.isEmpty(bVar.f812c)) {
            this.f809l = "amap-threadpool";
        } else {
            this.f809l = bVar.f812c;
        }
        this.m = bVar.d;
        this.f810n = bVar.f813e;
        this.k = bVar.b;
        this.i = new AtomicLong();
    }
}
