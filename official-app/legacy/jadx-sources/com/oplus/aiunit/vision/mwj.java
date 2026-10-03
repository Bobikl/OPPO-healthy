package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class mwj {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public interface b<T> {
        void onResult(T t);
    }

    public static final class c {
        public static final Executor EXECUTOR;
        public static final int a;

        static {
            int i = (mwj.a * 2) + 1;
            a = i;
            EXECUTOR = new d75(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b75("ThreadPool.IOExecutor"));
        }
    }

    public static final class d {
        public static final a a = new a();

        public static class a implements Executor {

            @NonNull
            public final Handler i;

            @NonNull
            public Handler a() {
                return this.i;
            }

            @Override // java.util.concurrent.Executor
            public void execute(@NonNull Runnable runnable) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    runnable.run();
                } else {
                    this.i.post(runnable);
                }
            }

            public a() {
                this.i = new Handler(Looper.getMainLooper());
            }
        }
    }

    public static final class e {
        public static final int a;
        public static final Executor b;

        static {
            int i = mwj.a + 1;
            a = i;
            b = new d75(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new b75("ThreadPool.WorkExecutor"));
        }
    }

    public static void d(boolean z, @NonNull Runnable runnable) {
        if (z) {
            j(runnable);
        } else {
            k(runnable);
        }
    }

    public static /* synthetic */ void f(Callable callable, final b bVar) {
        final Object objCall;
        try {
            objCall = callable.call();
        } catch (Exception unused) {
            objCall = null;
        }
        h(new Runnable() { // from class: com.oplus.aiunit.vision.jwj
            @Override // java.lang.Runnable
            public final void run() {
                bVar.onResult(objCall);
            }
        });
    }

    public static void g(boolean z, @NonNull Runnable runnable) {
        if (z) {
            h(runnable);
        } else {
            k(runnable);
        }
    }

    public static void h(@NonNull Runnable runnable) {
        d.a.a().post(runnable);
    }

    public static void i(@NonNull Runnable runnable) {
        c.EXECUTOR.execute(runnable);
    }

    public static void j(@NonNull Runnable runnable) {
        d.a.execute(runnable);
    }

    public static void k(@NonNull Runnable runnable) {
        e.b.execute(runnable);
    }

    public static <T> void l(@NonNull final Callable<T> callable, @NonNull final b<T> bVar) {
        k(new Runnable() { // from class: com.oplus.aiunit.vision.hwj
            @Override // java.lang.Runnable
            public final void run() {
                mwj.f(callable, bVar);
            }
        });
    }
}
