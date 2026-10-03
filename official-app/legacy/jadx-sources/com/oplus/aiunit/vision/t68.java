package com.oplus.aiunit.vision;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class t68 implements ExecutorService {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f16896j = TimeUnit.SECONDS.toMillis(10);
    public static volatile int k;
    public final ExecutorService i;

    public static final class b {
        public static final long NO_THREAD_TIMEOUT = 0;
        public final boolean a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16897c;

        @NonNull
        public ThreadFactory d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public e f16898e = e.DEFAULT;
        public String f;
        public long g;

        public b(boolean z) {
            this.a = z;
        }

        public t68 a() {
            if (TextUtils.isEmpty(this.f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.b, this.f16897c, this.g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.d, this.f, this.f16898e, this.a));
            if (this.g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new t68(threadPoolExecutor);
        }

        public b b(String str) {
            this.f = str;
            return this;
        }

        public b c(@IntRange(from = 1) int i) {
            this.b = i;
            this.f16897c = i;
            return this;
        }
    }

    public static final class c implements ThreadFactory {

        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new a(runnable);
        }
    }

    public static final class d implements ThreadFactory {
        public final ThreadFactory i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f16899j;
        public final e k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f16900l;
        public final AtomicInteger m = new AtomicInteger();

        public class a implements Runnable {
            public final /* synthetic */ Runnable i;

            public a(Runnable runnable) {
                this.i = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f16900l) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.i.run();
                } catch (Throwable th) {
                    d.this.k.a(th);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z) {
            this.i = threadFactory;
            this.f16899j = str;
            this.k = eVar;
            this.f16900l = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = this.i.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f16899j + "-thread-" + this.m.getAndIncrement());
            return threadNewThread;
        }
    }

    public interface e {
        public static final e DEFAULT;
        public static final e IGNORE = new a();
        public static final e LOG;
        public static final e THROW;

        public class a implements e {
            @Override // com.oplus.aiunit.vision.t68.e
            public void a(Throwable th) {
            }
        }

        public class b implements e {
            @Override // com.oplus.aiunit.vision.t68.e
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        public class c implements e {
            @Override // com.oplus.aiunit.vision.t68.e
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            LOG = bVar;
            THROW = new c();
            DEFAULT = bVar;
        }

        void a(Throwable th);
    }

    @VisibleForTesting
    public t68(ExecutorService executorService) {
        this.i = executorService;
    }

    public static int a() {
        return g() >= 4 ? 2 : 1;
    }

    public static int g() {
        if (k == 0) {
            k = Math.min(4, v2g.a());
        }
        return k;
    }

    public static b h() {
        return new b(true).c(a()).b("animation");
    }

    public static t68 i() {
        return h().a();
    }

    public static b l() {
        return new b(true).c(1).b("disk-cache");
    }

    public static t68 m() {
        return l().a();
    }

    public static b n() {
        return new b(false).c(g()).b("source");
    }

    public static t68 o() {
        return n().a();
    }

    public static t68 p() {
        return new t68(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f16896j, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.DEFAULT, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.i.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.i.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.i.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.i.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.i.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.i.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.i.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.i.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.i.submit(runnable);
    }

    public String toString() {
        return this.i.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.i.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j2, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.i.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.i.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.i.submit(callable);
    }
}
